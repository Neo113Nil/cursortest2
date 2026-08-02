package xsna;

/* compiled from: ClipsPlaylistsFolderItemVs.kt */
/* loaded from: classes16.dex */
public interface jqe {

    /* compiled from: ClipsPlaylistsFolderItemVs.kt */
    public static final class a implements jqe {
        public static final a a = new a();
    }

    /* compiled from: ClipsPlaylistsFolderItemVs.kt */
    public static final class b implements jqe {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Selection(isSelected="), this.a, ')');
        }
    }
}
