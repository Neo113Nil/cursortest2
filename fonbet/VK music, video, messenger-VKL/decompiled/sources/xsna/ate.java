package xsna;

/* compiled from: ClipsPlaylistsFolderNamingPatch.kt */
/* loaded from: classes16.dex */
public interface ate extends xl50 {

    /* compiled from: ClipsPlaylistsFolderNamingPatch.kt */
    public static final class a implements ate {
        public static final a b = new a();
    }

    /* compiled from: ClipsPlaylistsFolderNamingPatch.kt */
    public static final class b implements ate {
        public final tho0 b;

        public b(tho0 tho0Var) {
            this.b = tho0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "NameChanged(name=" + this.b + ')';
        }
    }
}
