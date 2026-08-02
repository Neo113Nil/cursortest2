package xsna;

/* compiled from: ClipsPlaylistsSmallFoldersSideEffect.kt */
/* loaded from: classes16.dex */
public interface eve {

    /* compiled from: ClipsPlaylistsSmallFoldersSideEffect.kt */
    public static final class a implements eve {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ItemsLoaded(isEmpty="), this.a, ')');
        }
    }

    /* compiled from: ClipsPlaylistsSmallFoldersSideEffect.kt */
    public static final class b implements eve {
        public static final b a = new b();
    }
}
