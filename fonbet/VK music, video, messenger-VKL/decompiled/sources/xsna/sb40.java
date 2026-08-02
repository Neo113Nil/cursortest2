package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.music.player.domain.state.MusicBigPlayerPage;

/* compiled from: MusicBigPlayerPatch.kt */
@ozl
/* loaded from: classes3.dex */
public interface sb40 {

    /* compiled from: MusicBigPlayerPatch.kt */
    public static final class a implements sb40 {
        public final int a;

        public a(int i) {
            this.a = i;
        }
    }

    /* compiled from: MusicBigPlayerPatch.kt */
    public static final class b implements sb40 {
        public final MusicBigPlayerPage a;

        public b(MusicBigPlayerPage musicBigPlayerPage) {
            this.a = musicBigPlayerPage;
        }
    }

    /* compiled from: MusicBigPlayerPatch.kt */
    public static final class c implements sb40 {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: MusicBigPlayerPatch.kt */
    public interface d extends sb40 {

        /* compiled from: MusicBigPlayerPatch.kt */
        public static final class a implements d {
            public static final a a = new a();
        }

        /* compiled from: MusicBigPlayerPatch.kt */
        public static final class b implements d {
            public final da00 a;

            public b(da00 da00Var) {
                this.a = da00Var;
            }
        }

        /* compiled from: MusicBigPlayerPatch.kt */
        public static final class c implements d {
            public static final c a = new c();
        }

        /* compiled from: MusicBigPlayerPatch.kt */
        /* renamed from: xsna.sb40$d$d, reason: collision with other inner class name */
        public static final class C3658d implements d {
            public static final C3658d a = new C3658d();
        }

        /* compiled from: MusicBigPlayerPatch.kt */
        public static final class e implements d {
            public static final e a = new e();
        }
    }

    /* compiled from: MusicBigPlayerPatch.kt */
    public interface e extends sb40 {

        /* compiled from: MusicBigPlayerPatch.kt */
        public static final class a implements e {
            public static final a a = new a();
        }

        /* compiled from: MusicBigPlayerPatch.kt */
        public static final class b implements e {
            public static final b a = new b();
        }
    }

    /* compiled from: MusicBigPlayerPatch.kt */
    public static final class f implements sb40 {
        public final DownloadingState a;

        public f(DownloadingState downloadingState) {
            this.a = downloadingState;
        }
    }

    /* compiled from: MusicBigPlayerPatch.kt */
    public static final class g implements sb40 {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public g(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }
    }

    /* compiled from: MusicBigPlayerPatch.kt */
    public interface h extends sb40 {

        /* compiled from: MusicBigPlayerPatch.kt */
        public static final class a implements h {
            public static final a a = new a();
        }

        /* compiled from: MusicBigPlayerPatch.kt */
        public static final class b implements h {
            public static final b a = new b();
        }
    }
}
