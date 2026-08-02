package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;

/* compiled from: ClipsPlaylistsFolderNamingState.kt */
/* loaded from: classes16.dex */
public interface gte extends km50 {

    /* compiled from: ClipsPlaylistsFolderNamingState.kt */
    public static final class a implements gte {
        public final tho0 b;
        public final boolean c;
        public final InterfaceC2955a d;

        /* compiled from: ClipsPlaylistsFolderNamingState.kt */
        /* renamed from: xsna.gte$a$a, reason: collision with other inner class name */
        public interface InterfaceC2955a {

            /* compiled from: ClipsPlaylistsFolderNamingState.kt */
            /* renamed from: xsna.gte$a$a$a, reason: collision with other inner class name */
            public static final class C2956a implements InterfaceC2955a {
                public final ShortVideoPlaylistFullDto a;

                public C2956a(ShortVideoPlaylistFullDto shortVideoPlaylistFullDto) {
                    this.a = shortVideoPlaylistFullDto;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2956a) && epx.f(this.a, ((C2956a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "Done(playlist=" + this.a + ')';
                }
            }

            /* compiled from: ClipsPlaylistsFolderNamingState.kt */
            /* renamed from: xsna.gte$a$a$b */
            public static final class b implements InterfaceC2955a {
                public static final b a = new b();
            }

            /* compiled from: ClipsPlaylistsFolderNamingState.kt */
            /* renamed from: xsna.gte$a$a$c */
            public static final class c implements InterfaceC2955a {
                public static final c a = new c();
            }

            /* compiled from: ClipsPlaylistsFolderNamingState.kt */
            /* renamed from: xsna.gte$a$a$d */
            public static final class d implements InterfaceC2955a {
                public static final d a = new d();
            }
        }

        public a(tho0 tho0Var, boolean z, InterfaceC2955a interfaceC2955a) {
            this.b = tho0Var;
            this.c = z;
            this.d = interfaceC2955a;
        }

        public static a a(a aVar, tho0 tho0Var, boolean z, InterfaceC2955a interfaceC2955a, int i) {
            if ((i & 1) != 0) {
                tho0Var = aVar.b;
            }
            if ((i & 2) != 0) {
                z = aVar.c;
            }
            if ((i & 4) != 0) {
                interfaceC2955a = aVar.d;
            }
            aVar.getClass();
            return new a(tho0Var, z, interfaceC2955a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            return "Content(name=" + this.b + ", isAnimated=" + this.c + ", loadingState=" + this.d + ')';
        }
    }

    /* compiled from: ClipsPlaylistsFolderNamingState.kt */
    public static final class b implements gte {
        public static final b b = new b();
    }
}
