package xsna;

/* compiled from: ClipsPlaylistsFolderNamingAction.kt */
/* loaded from: classes16.dex */
public interface jse extends kj50 {

    /* compiled from: ClipsPlaylistsFolderNamingAction.kt */
    public static final class a implements jse {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Input(name="), this.b, ')');
        }
    }

    /* compiled from: ClipsPlaylistsFolderNamingAction.kt */
    public static final class b implements jse {
        public static final b b = new b();
    }

    /* compiled from: ClipsPlaylistsFolderNamingAction.kt */
    public static final class c implements jse {
        public static final c b = new c();
    }

    /* compiled from: ClipsPlaylistsFolderNamingAction.kt */
    public static final class d implements jse {
        public final tho0 b;

        public d(tho0 tho0Var) {
            this.b = tho0Var;
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
            return "OnInput(name=" + this.b + ')';
        }
    }

    /* compiled from: ClipsPlaylistsFolderNamingAction.kt */
    public static final class e implements jse {
        public static final e b = new e();
    }

    /* compiled from: ClipsPlaylistsFolderNamingAction.kt */
    public static final class f implements jse {
        public static final f b = new f();
    }
}
