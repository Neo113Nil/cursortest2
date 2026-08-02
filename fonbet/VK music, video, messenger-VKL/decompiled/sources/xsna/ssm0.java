package xsna;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;
import xsna.ewo0;

/* compiled from: StuckPlayerDetector.java */
/* loaded from: classes12.dex */
public final class ssm0 {
    public final androidx.media3.exoplayer.c a;
    public final rsm0 b;
    public final a c;
    public final dvf d;
    public final ewo0.b e = new ewo0.b();
    public final otu f;
    public final b g;
    public final c h;
    public final d i;
    public final e j;

    /* compiled from: StuckPlayerDetector.java */
    public interface a {
    }

    /* compiled from: StuckPlayerDetector.java */
    public final class b {
        public final int a;

        @Nullable
        public Object b;
        public int c;
        public int d;
        public long e;
        public long f;
        public boolean g;
        public long h;

        public b(int i) {
            this.a = i;
        }

        public final void a() {
            Object obj;
            ssm0 ssm0Var = ssm0.this;
            otu otuVar = ssm0Var.f;
            androidx.media3.exoplayer.c cVar = ssm0Var.a;
            if (cVar.getPlaybackState() != 2 || !cVar.getPlayWhenReady() || cVar.g() != 0) {
                if (this.g) {
                    otuVar.removeMessages(1);
                }
                this.g = false;
                return;
            }
            ewo0 currentTimeline = cVar.getCurrentTimeline();
            Object l = currentTimeline.p() ? null : currentTimeline.l(cVar.getCurrentPeriodIndex());
            int currentAdGroupIndex = cVar.getCurrentAdGroupIndex();
            int currentAdIndexInAdGroup = cVar.getCurrentAdIndexInAdGroup();
            long bufferedPosition = cVar.getBufferedPosition();
            long max = Math.max(0L, cVar.a() - Math.max(0L, bufferedPosition - cVar.getCurrentPosition()));
            if (l != null && currentAdGroupIndex == -1) {
                bufferedPosition -= y2r0.j0(currentTimeline.g(l, ssm0Var.e).e);
            }
            long elapsedRealtime = ssm0Var.d.elapsedRealtime();
            boolean z = this.g;
            int i = this.a;
            if (z && Objects.equals(l, this.b) && currentAdGroupIndex == this.c && currentAdIndexInAdGroup == this.d) {
                obj = l;
                if (bufferedPosition == this.e && max == this.f) {
                    if (elapsedRealtime - this.h >= i) {
                        androidx.media3.exoplayer.c.this.S(new ExoPlaybackException(2, new StuckPlayerException(1, i), 1003));
                        return;
                    }
                    return;
                }
            } else {
                obj = l;
            }
            this.g = true;
            this.h = elapsedRealtime;
            this.b = obj;
            this.c = currentAdGroupIndex;
            this.d = currentAdIndexInAdGroup;
            this.e = bufferedPosition;
            this.f = max;
            otuVar.removeMessages(1);
            otuVar.d(1, i);
        }
    }

    /* compiled from: StuckPlayerDetector.java */
    public final class c {
        public final int a;

        @Nullable
        public Object b;
        public int c;
        public int d;
        public long e;
        public boolean f;
        public long g;

        public c(int i) {
            this.a = i;
        }

        public final void a() {
            ssm0 ssm0Var = ssm0.this;
            otu otuVar = ssm0Var.f;
            androidx.media3.exoplayer.c cVar = ssm0Var.a;
            if (!cVar.isPlaying()) {
                if (this.f) {
                    otuVar.removeMessages(2);
                }
                this.f = false;
                return;
            }
            ewo0 currentTimeline = cVar.getCurrentTimeline();
            Object l = currentTimeline.p() ? null : currentTimeline.l(cVar.getCurrentPeriodIndex());
            int currentAdGroupIndex = cVar.getCurrentAdGroupIndex();
            int currentAdIndexInAdGroup = cVar.getCurrentAdIndexInAdGroup();
            long currentPosition = cVar.getCurrentPosition();
            if (l != null && currentAdGroupIndex == -1) {
                currentPosition -= y2r0.j0(currentTimeline.g(l, ssm0Var.e).e);
            }
            long elapsedRealtime = ssm0Var.d.elapsedRealtime();
            boolean z = this.f;
            int i = this.a;
            if (z && Objects.equals(l, this.b) && currentAdGroupIndex == this.c && currentAdIndexInAdGroup == this.d && currentPosition == this.e) {
                if (elapsedRealtime - this.g >= i) {
                    androidx.media3.exoplayer.c.this.S(new ExoPlaybackException(2, new StuckPlayerException(2, i), 1003));
                    return;
                }
                return;
            }
            this.f = true;
            this.g = elapsedRealtime;
            this.b = l;
            this.c = currentAdGroupIndex;
            this.d = currentAdIndexInAdGroup;
            this.e = currentPosition;
            otuVar.removeMessages(2);
            otuVar.d(2, i);
        }
    }

    /* compiled from: StuckPlayerDetector.java */
    public final class d {
        public final int a;

        @Nullable
        public Object b;
        public int c;
        public int d;
        public boolean e;
        public long f;

        public d(int i) {
            this.a = i;
        }

        public final void a() {
            long duration;
            ssm0 ssm0Var = ssm0.this;
            ewo0.b bVar = ssm0Var.e;
            otu otuVar = ssm0Var.f;
            androidx.media3.exoplayer.c cVar = ssm0Var.a;
            ewo0 currentTimeline = cVar.getCurrentTimeline();
            Object l = currentTimeline.p() ? null : currentTimeline.l(cVar.getCurrentPeriodIndex());
            int currentAdGroupIndex = cVar.getCurrentAdGroupIndex();
            int currentAdIndexInAdGroup = cVar.getCurrentAdIndexInAdGroup();
            long currentPosition = cVar.getCurrentPosition();
            if (l == null || currentAdGroupIndex != -1) {
                duration = currentAdGroupIndex != -1 ? cVar.getDuration() : -9223372036854775807L;
            } else {
                currentTimeline.g(l, bVar);
                currentPosition -= y2r0.j0(bVar.e);
                duration = y2r0.j0(bVar.d);
            }
            boolean isPlaying = cVar.isPlaying();
            if (!isPlaying || duration == C.TIME_UNSET || currentPosition < duration) {
                otuVar.removeMessages(3);
                if (isPlaying && duration != C.TIME_UNSET) {
                    otuVar.d(3, (int) Math.ceil((duration - currentPosition) / cVar.E().a));
                }
                this.e = false;
                return;
            }
            long elapsedRealtime = ssm0Var.d.elapsedRealtime();
            boolean z = this.e;
            int i = this.a;
            if (z && Objects.equals(l, this.b) && currentAdGroupIndex == this.c && currentAdIndexInAdGroup == this.d) {
                if (elapsedRealtime - this.f >= i) {
                    androidx.media3.exoplayer.c.this.S(new ExoPlaybackException(2, new StuckPlayerException(3, i), 1003));
                    return;
                }
                return;
            }
            this.e = true;
            this.f = elapsedRealtime;
            this.b = l;
            this.c = currentAdGroupIndex;
            this.d = currentAdIndexInAdGroup;
            otuVar.removeMessages(3);
            otuVar.d(3, i);
        }
    }

    /* compiled from: StuckPlayerDetector.java */
    public final class e {
        public final int a;
        public int b;
        public boolean c;
        public long d;

        public e(int i) {
            this.a = i;
        }

        public final void a() {
            ssm0 ssm0Var = ssm0.this;
            otu otuVar = ssm0Var.f;
            androidx.media3.exoplayer.c cVar = ssm0Var.a;
            int g = cVar.g();
            if (!cVar.getPlayWhenReady() || cVar.getPlaybackState() == 1 || cVar.getPlaybackState() == 4 || g == 0 || g == 1) {
                if (this.c) {
                    otuVar.removeMessages(4);
                }
                this.c = false;
                return;
            }
            long elapsedRealtime = ssm0Var.d.elapsedRealtime();
            boolean z = this.c;
            int i = this.a;
            if (z && this.b == g) {
                if (elapsedRealtime - this.d >= i) {
                    androidx.media3.exoplayer.c.this.S(new ExoPlaybackException(2, new StuckPlayerException(4, i), 1003));
                    return;
                }
                return;
            }
            this.c = true;
            this.d = elapsedRealtime;
            this.b = g;
            otuVar.removeMessages(4);
            otuVar.d(4, i);
        }
    }

    public ssm0(androidx.media3.exoplayer.c cVar, a aVar, dvf dvfVar, int i, int i2, int i3, int i4) {
        this.a = cVar;
        this.c = aVar;
        this.d = dvfVar;
        this.f = dvfVar.createHandler(cVar.u, new Handler.Callback() { // from class: xsna.qsm0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                ssm0 ssm0Var = ssm0.this;
                ssm0Var.getClass();
                int i5 = message.what;
                if (i5 == 1) {
                    ssm0Var.g.a();
                    return true;
                }
                if (i5 == 2) {
                    ssm0Var.h.a();
                    return true;
                }
                if (i5 == 3) {
                    ssm0Var.i.a();
                    return true;
                }
                if (i5 != 4) {
                    return false;
                }
                ssm0Var.j.a();
                return true;
            }
        });
        this.g = new b(i);
        this.h = new c(i2);
        this.i = new d(i3);
        this.j = new e(i4);
        rsm0 rsm0Var = new rsm0(this);
        this.b = rsm0Var;
        cVar.n.a(rsm0Var);
    }
}
