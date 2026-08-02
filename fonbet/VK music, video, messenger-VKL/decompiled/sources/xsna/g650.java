package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: MusicSnippetsAction.kt */
/* loaded from: classes3.dex */
public interface g650 extends kj50 {

    /* compiled from: MusicSnippetsAction.kt */
    public interface a extends g650 {

        /* compiled from: MusicSnippetsAction.kt */
        /* renamed from: xsna.g650$a$a, reason: collision with other inner class name */
        public static final class C2913a implements a {
            public final MusicTrack b;

            public C2913a(MusicTrack musicTrack) {
                this.b = musicTrack;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2913a) && epx.f(this.b, ((C2913a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return rq.c(new StringBuilder("AddTrack(track="), this.b, ')');
            }
        }

        /* compiled from: MusicSnippetsAction.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -405998840;
            }

            public final String toString() {
                return "OpenDownloads";
            }
        }

        /* compiled from: MusicSnippetsAction.kt */
        public static final class c implements a {
            public final String b;

            public c(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OpenLink(link="), this.b, ')');
            }
        }

        /* compiled from: MusicSnippetsAction.kt */
        public static final class d implements a {
            public final MusicTrack b;

            public d(MusicTrack musicTrack) {
                this.b = musicTrack;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return rq.c(new StringBuilder("RemoveTrack(track="), this.b, ')');
            }
        }
    }

    /* compiled from: MusicSnippetsAction.kt */
    public interface b extends g650 {

        /* compiled from: MusicSnippetsAction.kt */
        public static final class a implements b {
            public static final a b = new a();
        }
    }

    /* compiled from: MusicSnippetsAction.kt */
    public interface c extends g650 {

        /* compiled from: MusicSnippetsAction.kt */
        public static final class a implements c {
            public static final a b = new a();
        }

        /* compiled from: MusicSnippetsAction.kt */
        public static final class b implements c {
            public static final b b = new b();
        }
    }

    /* compiled from: MusicSnippetsAction.kt */
    public interface d extends g650 {

        /* compiled from: MusicSnippetsAction.kt */
        public static final class a implements d {
            public final boolean b;
            public final boolean c;

            public a(boolean z, boolean z2) {
                this.b = z;
                this.c = z2;
            }
        }

        /* compiled from: MusicSnippetsAction.kt */
        public static final class b implements d {
            public final String b;
            public final MusicTrack c;

            public b(MusicTrack musicTrack, String str) {
                this.b = str;
                this.c = musicTrack;
            }
        }

        /* compiled from: MusicSnippetsAction.kt */
        public static final class c implements d {
            public final String b;
            public final MusicTrack c;
            public final boolean d;
            public final boolean e;
            public final boolean f;

            public c(String str, MusicTrack musicTrack, boolean z, int i) {
                boolean z2 = (i & 8) == 0;
                boolean z3 = (i & 16) != 0;
                this.b = str;
                this.c = musicTrack;
                this.d = z;
                this.e = z2;
                this.f = z3;
            }
        }

        /* compiled from: MusicSnippetsAction.kt */
        /* renamed from: xsna.g650$d$d, reason: collision with other inner class name */
        public static final class C2914d implements d {
            public static final C2914d b = new C2914d();
        }
    }
}
