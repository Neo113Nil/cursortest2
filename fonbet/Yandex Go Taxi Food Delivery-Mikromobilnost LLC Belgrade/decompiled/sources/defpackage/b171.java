package defpackage;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import yads.jc2;

/* loaded from: classes7.dex */
public final class b171 {
    public final Context a;
    public final x971 b;
    public final PlaybackSession c;
    public String i;
    public PlaybackMetrics.Builder j;
    public jc2 m;
    public o3 n;
    public o3 o;
    public o3 p;
    public qd81 q;
    public qd81 r;
    public qd81 s;
    public boolean t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public boolean z;
    public final uk81 e = new uk81();
    public final ie81 f = new ie81();
    public final HashMap h = new HashMap();
    public final HashMap g = new HashMap();
    public final long d = SystemClock.elapsedRealtime();
    public int k = 0;
    public int l = 0;

    public b171(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.c = playbackSession;
        x971 x971Var = new x971();
        this.b = x971Var;
        x971Var.d = this;
    }

    public final void a() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.z) {
            builder.setAudioUnderrunCount(this.y);
            this.j.setVideoFramesDropped(this.w);
            this.j.setVideoFramesPlayed(this.x);
            Long l = (Long) this.g.get(this.i);
            this.j.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.h.get(this.i);
            this.j.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.j.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            PlaybackSession playbackSession = this.c;
            build = this.j.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.j = null;
        this.i = null;
        this.y = 0;
        this.w = 0;
        this.x = 0;
        this.q = null;
        this.r = null;
        this.s = null;
        this.z = false;
    }

    public final void b(int i, long j, qd81 qd81Var, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i3;
        timeSinceCreatedMillis = te10.g(i).setTimeSinceCreatedMillis(j - this.d);
        if (qd81Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = qd81Var.D;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = qd81Var.E;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = qd81Var.B;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = qd81Var.A;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = qd81Var.J;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = qd81Var.K;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = qd81Var.R;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = qd81Var.S;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = qd81Var.c;
            if (str4 != null) {
                int i9 = rf71.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = qd81Var.L;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.z = true;
        PlaybackSession playbackSession = this.c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    public final void c(yn81 yn81Var, v281 v281Var) {
        int a;
        PlaybackMetrics.Builder builder = this.j;
        if (v281Var == null || (a = yn81Var.a(v281Var.a)) == -1) {
            return;
        }
        ie81 ie81Var = this.f;
        int i = 0;
        yn81Var.a(a, ie81Var, false);
        int i2 = ie81Var.c;
        uk81 uk81Var = this.e;
        yn81Var.a(i2, uk81Var, 0L);
        d981 d981Var = uk81Var.b.b;
        if (d981Var != null) {
            int c = rf71.c(d981Var.a, null);
            i = c != 0 ? c != 1 ? c != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (uk81Var.F != -9223372036854775807L && !uk81Var.D && !uk81Var.A && !uk81Var.b()) {
            builder.setMediaDurationMillis(rf71.u(uk81Var.F));
        }
        builder.setPlaybackType(uk81Var.b() ? 2 : 1);
        this.z = true;
    }

    public final boolean d(o3 o3Var) {
        String str;
        if (o3Var == null) {
            return false;
        }
        String str2 = (String) o3Var.c;
        x971 x971Var = this.b;
        synchronized (x971Var) {
            str = x971Var.f;
        }
        return str2.equals(str);
    }

    public final void e(wc71 wc71Var, String str) {
        v281 v281Var = wc71Var.d;
        if ((v281Var == null || !v281Var.a()) && str.equals(this.i)) {
            a();
        }
        this.g.remove(str);
        this.h.remove(str);
    }
}
