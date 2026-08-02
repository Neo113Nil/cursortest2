package xsna;

/* compiled from: FoldersShowMode.kt */
/* loaded from: classes18.dex */
public interface l2s {

    /* compiled from: FoldersShowMode.kt */
    public static final class a implements l2s {
        public static final a a = new a();
    }

    /* compiled from: FoldersShowMode.kt */
    public static final class b implements l2s {
        public final long a;

        public b(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("DialogAddToFolder(dialogId="));
        }
    }
}
