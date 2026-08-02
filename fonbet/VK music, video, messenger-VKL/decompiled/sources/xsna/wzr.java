package xsna;

/* compiled from: FolderPopupAction.kt */
/* loaded from: classes18.dex */
public interface wzr {

    /* compiled from: FolderPopupAction.kt */
    public static final class a implements wzr {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "AddChatsInFolderAction(item=null)";
        }
    }

    /* compiled from: FolderPopupAction.kt */
    public static final class b implements wzr {
        public final xyr a;

        public b(xyr xyrVar) {
            this.a = xyrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ConfigureFolderAction(item=" + this.a + ')';
        }
    }

    /* compiled from: FolderPopupAction.kt */
    public static final class c implements wzr {
        public static final c a = new c();
    }

    /* compiled from: FolderPopupAction.kt */
    public static final class d implements wzr {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "CopyLinkAction(item=null)";
        }
    }

    /* compiled from: FolderPopupAction.kt */
    public static final class e implements wzr {
        public final xyr a;

        public e(xyr xyrVar) {
            this.a = xyrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DeleteFolderAction(item=" + this.a + ')';
        }
    }

    /* compiled from: FolderPopupAction.kt */
    public static final class f implements wzr {
        public final xyr a;

        public f(xyr xyrVar) {
            this.a = xyrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ResettingFolderCountersAction(item=" + this.a + ')';
        }
    }
}
