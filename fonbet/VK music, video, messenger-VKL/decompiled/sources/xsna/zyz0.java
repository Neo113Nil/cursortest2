package xsna;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.internal.zzap;
import com.google.android.gms.internal.cast.zzfk;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.chromium.base.TimeUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.lvf0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class zyz0 extends h701 {
    public static final String w;
    public long e;

    @Nullable
    public MediaStatus f;

    @Nullable
    public Long g;
    public c301 h;
    public int i;
    public final yzz0 j;
    public final yzz0 k;
    public final yzz0 l;
    public final yzz0 m;
    public final yzz0 n;
    public final yzz0 o;
    public final yzz0 p;
    public final yzz0 q;
    public final yzz0 r;
    public final yzz0 s;
    public final yzz0 t;
    public final yzz0 u;
    public final yzz0 v;

    static {
        Pattern pattern = o0a.a;
        w = "urn:x-cast:com.google.cast.media";
    }

    public zyz0() {
        super(w);
        this.i = -1;
        yzz0 yzz0Var = new yzz0(TimeUtils.MILLISECONDS_PER_DAY, "load");
        this.j = yzz0Var;
        yzz0 yzz0Var2 = new yzz0(TimeUtils.MILLISECONDS_PER_DAY, "pause");
        this.k = yzz0Var2;
        yzz0 yzz0Var3 = new yzz0(TimeUtils.MILLISECONDS_PER_DAY, "play");
        this.l = yzz0Var3;
        yzz0 yzz0Var4 = new yzz0(TimeUtils.MILLISECONDS_PER_DAY, "stop");
        yzz0 yzz0Var5 = new yzz0(10000L, "seek");
        this.m = yzz0Var5;
        yzz0 yzz0Var6 = new yzz0(TimeUtils.MILLISECONDS_PER_DAY, "volume");
        this.n = yzz0Var6;
        yzz0 yzz0Var7 = new yzz0(TimeUtils.MILLISECONDS_PER_DAY, "mute");
        this.o = yzz0Var7;
        yzz0 yzz0Var8 = new yzz0(TimeUtils.MILLISECONDS_PER_DAY, "status");
        this.p = yzz0Var8;
        yzz0 yzz0Var9 = new yzz0(TimeUtils.MILLISECONDS_PER_DAY, "activeTracks");
        this.q = yzz0Var9;
        yzz0 yzz0Var10 = new yzz0(TimeUtils.MILLISECONDS_PER_DAY, "trackStyle");
        yzz0 yzz0Var11 = new yzz0(TimeUtils.MILLISECONDS_PER_DAY, "queueInsert");
        yzz0 yzz0Var12 = new yzz0(TimeUtils.MILLISECONDS_PER_DAY, "queueUpdate");
        this.r = yzz0Var12;
        yzz0 yzz0Var13 = new yzz0(TimeUtils.MILLISECONDS_PER_DAY, "queueRemove");
        yzz0 yzz0Var14 = new yzz0(TimeUtils.MILLISECONDS_PER_DAY, "queueReorder");
        yzz0 yzz0Var15 = new yzz0(TimeUtils.MILLISECONDS_PER_DAY, "queueFetchItemIds");
        this.s = yzz0Var15;
        yzz0 yzz0Var16 = new yzz0(TimeUtils.MILLISECONDS_PER_DAY, "queueFetchItemRange");
        this.u = yzz0Var16;
        this.t = new yzz0(TimeUtils.MILLISECONDS_PER_DAY, "queueFetchItems");
        yzz0 yzz0Var17 = new yzz0(TimeUtils.MILLISECONDS_PER_DAY, "setPlaybackRate");
        yzz0 yzz0Var18 = new yzz0(TimeUtils.MILLISECONDS_PER_DAY, "skipAd");
        this.v = yzz0Var18;
        a(yzz0Var);
        a(yzz0Var2);
        a(yzz0Var3);
        a(yzz0Var4);
        a(yzz0Var5);
        a(yzz0Var6);
        a(yzz0Var7);
        a(yzz0Var8);
        a(yzz0Var9);
        a(yzz0Var10);
        a(yzz0Var11);
        a(yzz0Var12);
        a(yzz0Var13);
        a(yzz0Var14);
        a(yzz0Var15);
        a(yzz0Var16);
        a(yzz0Var16);
        a(yzz0Var17);
        a(yzz0Var18);
        m();
    }

    @Nullable
    public static int[] h(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    public static c2f0 n(JSONObject jSONObject) {
        MediaError.b(jSONObject);
        c2f0 c2f0Var = new c2f0();
        Pattern pattern = o0a.a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return c2f0Var;
    }

    public final void d(nzz0 nzz0Var, int i) throws IllegalArgumentException, IllegalStateException, zzap {
        JSONObject jSONObject = new JSONObject();
        long c = c();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", e());
            if (i != 0) {
                jSONObject.put("jump", i);
            }
            int i2 = this.i;
            if (i2 != -1) {
                jSONObject.put("sequenceNumber", i2);
            }
        } catch (JSONException unused) {
        }
        b(c, jSONObject.toString());
        this.r.a(c, new dyz0(this, nzz0Var));
    }

    public final long e() throws zzap {
        MediaStatus mediaStatus = this.f;
        if (mediaStatus != null) {
            return mediaStatus.c;
        }
        throw new zzap();
    }

    public final long f(double d, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (elapsedRealtime * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 >= 0) {
            return j3;
        }
        return 0L;
    }

    public final void g(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            this.a.c(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    public final void i() {
        c301 c301Var = this.h;
        if (c301Var != null) {
            lvf0 lvf0Var = c301Var.a;
            lvf0Var.getClass();
            for (k301 k301Var : lvf0Var.k.values()) {
                if (lvf0Var.k() && !k301Var.d) {
                    lvf0 lvf0Var2 = k301Var.e;
                    zzfk zzfkVar = lvf0Var2.b;
                    g301 g301Var = k301Var.c;
                    zzfkVar.removeCallbacks(g301Var);
                    k301Var.d = true;
                    lvf0Var2.b.postDelayed(g301Var, k301Var.b);
                } else if (!lvf0Var.k() && k301Var.d) {
                    k301Var.e.b.removeCallbacks(k301Var.c);
                    k301Var.d = false;
                }
                if (k301Var.d && (lvf0Var.l() || lvf0Var.B() || lvf0Var.o() || lvf0Var.n())) {
                    lvf0Var.I(k301Var.a);
                }
            }
            Iterator it = lvf0Var.h.iterator();
            while (it.hasNext()) {
                ((lvf0.b) it.next()).b();
            }
            Iterator it2 = lvf0Var.i.iterator();
            while (it2.hasNext()) {
                ((lvf0.a) it2.next()).e();
            }
        }
    }

    public final void j() {
        c301 c301Var = this.h;
        if (c301Var != null) {
            lvf0 lvf0Var = c301Var.a;
            lvf0Var.getClass();
            Iterator it = lvf0Var.h.iterator();
            while (it.hasNext()) {
                ((lvf0.b) it.next()).a();
            }
            Iterator it2 = lvf0Var.i.iterator();
            while (it2.hasNext()) {
                ((lvf0.a) it2.next()).b();
            }
        }
    }

    public final void k() {
        c301 c301Var = this.h;
        if (c301Var != null) {
            lvf0 lvf0Var = c301Var.a;
            Iterator it = lvf0Var.h.iterator();
            while (it.hasNext()) {
                ((lvf0.b) it.next()).e();
            }
            Iterator it2 = lvf0Var.i.iterator();
            while (it2.hasNext()) {
                ((lvf0.a) it2.next()).d();
            }
        }
    }

    public final void l() {
        c301 c301Var = this.h;
        if (c301Var != null) {
            lvf0 lvf0Var = c301Var.a;
            Iterator it = lvf0Var.h.iterator();
            while (it.hasNext()) {
                ((lvf0.b) it.next()).d();
            }
            Iterator it2 = lvf0Var.i.iterator();
            while (it2.hasNext()) {
                ((lvf0.a) it2.next()).c();
            }
        }
    }

    public final void m() {
        this.e = 0L;
        this.f = null;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((yzz0) it.next()).e(2002);
        }
    }

    public final long o() {
        MediaLiveSeekableRange mediaLiveSeekableRange;
        MediaStatus mediaStatus = this.f;
        MediaInfo mediaInfo = mediaStatus == null ? null : mediaStatus.b;
        if (mediaInfo != null && mediaStatus != null) {
            Long l = this.g;
            if (l != null) {
                if (l.equals(4294967296000L)) {
                    MediaStatus mediaStatus2 = this.f;
                    if (mediaStatus2.v != null) {
                        long longValue = l.longValue();
                        MediaStatus mediaStatus3 = this.f;
                        if (mediaStatus3 != null && (mediaLiveSeekableRange = mediaStatus3.v) != null) {
                            long j = mediaLiveSeekableRange.c;
                            r3 = !mediaLiveSeekableRange.e ? f(1.0d, j, -1L) : j;
                        }
                        return Math.min(longValue, r3);
                    }
                    MediaInfo mediaInfo2 = mediaStatus2 == null ? null : mediaStatus2.b;
                    if ((mediaInfo2 != null ? mediaInfo2.f : 0L) >= 0) {
                        long longValue2 = l.longValue();
                        MediaStatus mediaStatus4 = this.f;
                        MediaInfo mediaInfo3 = mediaStatus4 != null ? mediaStatus4.b : null;
                        return Math.min(longValue2, mediaInfo3 != null ? mediaInfo3.f : 0L);
                    }
                }
                return l.longValue();
            }
            if (this.e != 0) {
                double d = mediaStatus.e;
                long j2 = mediaStatus.h;
                return (d == ConnectivityTracker.DEFAULT_UPLINK_BITRATE || mediaStatus.f != 2) ? j2 : f(d, j2, mediaInfo.f);
            }
        }
        return 0L;
    }
}
