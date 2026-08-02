package xsna;

import com.vk.music.player.error.VkPlayerException;
import xsna.agl0;
import xsna.kw40;

/* compiled from: MusicPlayerState.kt */
/* loaded from: classes3.dex */
public abstract class ry40 implements Comparable<ry40> {
    public final int b;
    public final p4b0 c;

    /* compiled from: MusicPlayerState.kt */
    public static abstract class a extends ry40 {
        public final int d;
        public final boolean e;

        /* compiled from: MusicPlayerState.kt */
        /* renamed from: xsna.ry40$a$a, reason: collision with other inner class name */
        public static final class C3641a extends a {
            public C3641a(p4b0 p4b0Var, boolean z) {
                super(30, p4b0Var, 100, z);
            }

            public final String toString() {
                return "MusicPlayerState.Buffering.Done(whilePaused=" + this.e + ", meta=" + this.c + ')';
            }
        }

        /* compiled from: MusicPlayerState.kt */
        public static final class b extends a {
            public final boolean f;

            public b(p4b0 p4b0Var, int i, boolean z) {
                super(20, p4b0Var, i, z);
                this.f = true;
            }

            @Override // xsna.ry40
            public final boolean c() {
                return this.f;
            }

            public final String toString() {
                return "MusicPlayerState.Buffering.InProgress(whilePaused=" + this.e + ", percentage=" + this.d + ", meta=" + this.c + ')';
            }
        }

        /* compiled from: MusicPlayerState.kt */
        public static final class c extends a {
            public final String toString() {
                return "MusicPlayerState.Buffering.Started(whilePaused=" + this.e + ", meta=" + this.c + ')';
            }
        }

        public a(int i, p4b0 p4b0Var, int i2, boolean z) {
            super(i, p4b0Var);
            this.d = i2;
            this.e = z;
        }
    }

    /* compiled from: MusicPlayerState.kt */
    public static class b extends ry40 {

        /* compiled from: MusicPlayerState.kt */
        public static final class a extends b {
            public final VkPlayerException d;

            public a(p4b0 p4b0Var, VkPlayerException vkPlayerException) {
                super(p4b0Var);
                this.d = vkPlayerException;
            }

            @Override // xsna.ry40.b
            public final String toString() {
                return "MusicPlayerState.Completed.Error(exception=" + this.d + ", meta=" + this.c + ')';
            }
        }

        public b(p4b0 p4b0Var) {
            super(70, p4b0Var);
        }

        public String toString() {
            return "MusicPlayerState.Completed(meta=" + this.c + ')';
        }
    }

    /* compiled from: MusicPlayerState.kt */
    public static final class c extends ry40 {
        public static final c d = new c(0, (p4b0) p4b0.e.getValue());

        public final String toString() {
            return "MusicPlayerState.Idle";
        }
    }

    /* compiled from: MusicPlayerState.kt */
    public static final class d extends ry40 implements v0q<kw40.a> {
        public final kw40.a d;

        public d(kw40.a aVar, p4b0 p4b0Var) {
            super(60, p4b0Var);
            this.d = aVar;
        }

        @Override // xsna.v0q
        public final kw40.a a() {
            return this.d;
        }

        public final String toString() {
            return "MusicPlayerState.Paused(event=" + this.d + ", meta=" + this.c + ')';
        }
    }

    /* compiled from: MusicPlayerState.kt */
    public static abstract class e extends ry40 {
        public final long d;

        /* compiled from: MusicPlayerState.kt */
        public static final class a extends e {
            public final long e;
            public final boolean f;

            public a(p4b0 p4b0Var, long j, long j2) {
                super(50, p4b0Var, j);
                this.e = j2;
                this.f = true;
            }

            @Override // xsna.ry40
            public final boolean c() {
                return this.f;
            }

            public final String toString() {
                return "MusicPlayerState.Playing.InProgress(playbackDurationMs=" + this.d + ", progressMs=" + this.e + ", meta=" + this.c + ')';
            }
        }

        /* compiled from: MusicPlayerState.kt */
        public static final class b extends e implements v0q<kw40.b> {
            public final kw40.b e;

            public b(kw40.b bVar, p4b0 p4b0Var, long j) {
                super(40, p4b0Var, j);
                this.e = bVar;
            }

            @Override // xsna.v0q
            public final kw40.b a() {
                return this.e;
            }

            public final String toString() {
                return "MusicPlayerState.Playing.Started(playbackDurationMs=" + this.d + ", event=" + this.e + ", meta=" + this.c + ')';
            }
        }

        public e(int i, p4b0 p4b0Var, long j) {
            super(i, p4b0Var);
            this.d = j;
        }
    }

    /* compiled from: MusicPlayerState.kt */
    public static final class f extends ry40 implements v0q<kw40.c> {
        public final kw40.c d;

        public f(kw40.c cVar, p4b0 p4b0Var) {
            super(80, p4b0Var);
            this.d = cVar;
        }

        @Override // xsna.v0q
        public final kw40.c a() {
            return this.d;
        }

        public final String toString() {
            return "MusicPlayerState.Stopped(event=" + this.d + ", meta=" + this.c + ')';
        }
    }

    public ry40(int i, p4b0 p4b0Var) {
        this.b = i;
        this.c = p4b0Var;
    }

    public boolean c() {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(ry40 ry40Var) {
        return this.b - ry40Var.b;
    }

    public final boolean h() {
        return (this instanceof b) && !(this instanceof b.a);
    }

    public final boolean i() {
        if (!(this instanceof d)) {
            a aVar = this instanceof a ? (a) this : null;
            if ((aVar == null || !aVar.e) && (!(this instanceof f) || !epx.f(((f) this).d.b, agl0.d.a))) {
                return false;
            }
        }
        return true;
    }

    public final boolean j() {
        if (this instanceof e) {
            return true;
        }
        a aVar = this instanceof a ? (a) this : null;
        return (aVar == null || aVar.e) ? false : true;
    }
}
