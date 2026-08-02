package xsna;

/* compiled from: LoadPlaylistState.kt */
/* loaded from: classes3.dex */
public interface jqz {

    /* compiled from: LoadPlaylistState.kt */
    public static final class a implements jqz {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
        }
    }

    /* compiled from: LoadPlaylistState.kt */
    public static final class b implements jqz {
        public static final b a = new b();
    }

    /* compiled from: LoadPlaylistState.kt */
    public static final class c implements jqz {
        public static final c a = new c();
    }
}
