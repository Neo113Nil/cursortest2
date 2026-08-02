package xsna;

/* compiled from: CommentsUiEvent.kt */
/* loaded from: classes17.dex */
public abstract class lgg {

    /* compiled from: CommentsUiEvent.kt */
    public static final class a extends lgg {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1940274927;
        }

        public final String toString() {
            return "OnAddComment";
        }
    }

    /* compiled from: CommentsUiEvent.kt */
    public static final class b extends lgg {
        public final iag a;

        public b(iag iagVar) {
            this.a = iagVar;
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
            return "OnCommentLikeDataChanged(comment=" + this.a + ')';
        }
    }

    /* compiled from: CommentsUiEvent.kt */
    public static final class c extends lgg {
        public final iag a;

        public c(iag iagVar) {
            this.a = iagVar;
        }
    }

    /* compiled from: CommentsUiEvent.kt */
    public static final class d extends lgg {
        public final Throwable a;

        public d(Throwable th) {
            this.a = th;
        }
    }

    /* compiled from: CommentsUiEvent.kt */
    public static final class e extends lgg {
        public final iag a;

        public e(iag iagVar) {
            this.a = iagVar;
        }
    }

    /* compiled from: CommentsUiEvent.kt */
    public static final class f extends lgg {
        public final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OnUpdateComment(withReload="), this.a, ')');
        }
    }

    /* compiled from: CommentsUiEvent.kt */
    public static final class g extends lgg {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1711918657;
        }

        public final String toString() {
            return "ShowCommentSentToast";
        }
    }

    /* compiled from: CommentsUiEvent.kt */
    public static final class h extends lgg {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1997779408;
        }

        public final String toString() {
            return "ShowErrorToast";
        }
    }
}
