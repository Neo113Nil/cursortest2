package ru.ok.android.webrtc.utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
import ru.ok.android.webrtc.connection.BadConnectionCallback;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import ru.ok.android.webrtc.stat.MediaStat;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.utils.LossCalc;

/* loaded from: classes9.dex */
public class BadConnectionProcessor {
    public static final String KEY_BAD_NET = "badNet";
    public static final String KEY_GOOD_NET = "goodNet";
    public final boolean d;
    public final boolean l;
    public boolean m;
    public boolean n;
    public double o;
    public double p;
    public boolean q;
    public final a a = new a();
    public final CopyOnWriteArraySet k = new CopyOnWriteArraySet();
    public final Ema b = new Ema(0.3d);
    public final Ema c = new Ema(0.3d);
    public final LossCalc g = new LossCalc();
    public final LossCalc h = new LossCalc();
    public final b e = new b();
    public final b f = new b();
    public final c i = new c();
    public final c j = new c();

    public BadConnectionProcessor(boolean z, boolean z2) {
        this.l = z2;
        this.d = z;
    }

    public final void a() {
        boolean a;
        boolean a2;
        if (this.q) {
            return;
        }
        int i = 0;
        boolean z = this.a.b == 0;
        boolean a3 = a(this.a, this.b.get(), this.i.a, this.j.a, BadConnectionCallback.Cause.LOCAL_RTT) | a(this.a, this.c.get(), this.i.b, this.j.b, BadConnectionCallback.Cause.LOCAL_LOSS) | (this.n ? this.a.a(BadConnectionCallback.Cause.REMOTE, this.m) : this.a.a(BadConnectionCallback.Cause.REMOTE, false));
        if (!this.l || Double.isNaN(this.o) || Double.isNaN(this.p)) {
            a = a3 | this.a.a(BadConnectionCallback.Cause.REMOTE_LOSS, false);
            a2 = this.a.a(BadConnectionCallback.Cause.REMOTE_RTT, false);
        } else {
            a = a3 | a(this.a, this.o, this.i.a, this.j.a, BadConnectionCallback.Cause.REMOTE_RTT);
            a2 = a(this.a, this.p, this.i.b, this.j.b, BadConnectionCallback.Cause.REMOTE_LOSS);
        }
        if (a || a2) {
            a aVar = this.a;
            boolean z2 = aVar.b == 0;
            HashSet hashSet = new HashSet();
            BadConnectionCallback.Cause[] values = BadConnectionCallback.Cause.values();
            while (true) {
                boolean[] zArr = aVar.a;
                if (i >= zArr.length) {
                    break;
                }
                if (zArr[i]) {
                    hashSet.add(values[i]);
                }
                i++;
            }
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                BadConnectionCallback badConnectionCallback = (BadConnectionCallback) it.next();
                if (z2 != z) {
                    if (z2) {
                        badConnectionCallback.onGoodConnection();
                    } else {
                        badConnectionCallback.onBadConnection();
                    }
                }
                badConnectionCallback.onBadConnectionCauseSetChanged(hashSet);
            }
        }
    }

    public void close() {
        this.k.clear();
        this.q = true;
    }

    public void notifyConnectionChanged() {
        this.c.set(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        this.b.set(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        this.m = false;
        this.p = Double.NaN;
        this.o = Double.NaN;
        a();
    }

    public void notifyLocalMediaStat(MediaStat mediaStat, boolean z, long j) {
        double d;
        double d2;
        double d3;
        long max = Math.max(mediaStat.getAudioRtt(), mediaStat.getVideoRtt());
        if (max > 0) {
            this.b.submit(max);
        }
        if (this.d) {
            d2 = this.g.update(mediaStat.getAudioPacketsLost(), mediaStat.getAudioPacketsSent());
            d3 = this.h.update(mediaStat.getVideoPacketsLost(), mediaStat.getVideoPacketsSent());
            d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        } else {
            b bVar = this.e;
            long audioPacketsLost = mediaStat.getAudioPacketsLost();
            long audioPacketsSent = mediaStat.getAudioPacketsSent();
            long j2 = audioPacketsLost - bVar.a;
            double d4 = audioPacketsSent - bVar.b != 0 ? j2 / (r13 + j2) : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            bVar.a = audioPacketsLost;
            bVar.b = audioPacketsSent;
            b bVar2 = this.f;
            long videoPacketsLost = mediaStat.getVideoPacketsLost();
            long videoPacketsSent = mediaStat.getVideoPacketsSent();
            long j3 = videoPacketsLost - bVar2.a;
            long j4 = videoPacketsSent - bVar2.b;
            d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            double d5 = j4 != 0 ? j3 / (j4 + j3) : 0.0d;
            bVar2.a = videoPacketsLost;
            bVar2.b = videoPacketsSent;
            d2 = d4;
            d3 = d5;
        }
        double max2 = Math.max(d2, d3);
        if (max2 >= d) {
            this.c.submit(max2);
        }
        a();
        if (this.l) {
            double sentBitrate = z ? mediaStat.getSentBitrate() : Double.NaN;
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ((BadConnectionCallback) it.next()).onConnectionStats(this.b.get(), this.c.get(), sentBitrate, j);
            }
        }
    }

    public void notifyRemoteBadNed(JSONObject jSONObject) {
        if (BadConnectionSignaling.TYPE_BAD_NET.equals(jSONObject.optString("type"))) {
            this.m = jSONObject.optBoolean("value");
            this.n = jSONObject.has("value");
            this.o = jSONObject.optDouble("rtt");
            this.p = jSONObject.optDouble(BadConnectionSignaling.KEY_BAD_NET_LOSS);
            a();
        }
    }

    public void notifySettings(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            c cVar = this.j;
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(KEY_BAD_NET);
            cVar.getClass();
            if (optJSONObject2 != null) {
                cVar.a = optJSONObject2.optInt("rtt");
                cVar.b = optJSONObject2.optDouble(BadConnectionSignaling.KEY_BAD_NET_LOSS);
            }
            c cVar2 = this.i;
            JSONObject optJSONObject3 = optJSONObject.optJSONObject(KEY_GOOD_NET);
            cVar2.getClass();
            if (optJSONObject3 == null) {
                return;
            }
            cVar2.a = optJSONObject3.optInt("rtt");
            cVar2.b = optJSONObject3.optDouble(BadConnectionSignaling.KEY_BAD_NET_LOSS);
        }
    }

    public void registerCallback(BadConnectionCallback badConnectionCallback) {
        if (this.q) {
            return;
        }
        this.k.add(badConnectionCallback);
    }

    public void unregisterCallback(BadConnectionCallback badConnectionCallback) {
        this.k.remove(badConnectionCallback);
    }

    public static boolean a(a aVar, double d, double d2, double d3, BadConnectionCallback.Cause cause) {
        if (d > d3 && d3 > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            return aVar.a(cause, true);
        }
        if (d >= d2 || d2 <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            return false;
        }
        return aVar.a(cause, false);
    }
}
