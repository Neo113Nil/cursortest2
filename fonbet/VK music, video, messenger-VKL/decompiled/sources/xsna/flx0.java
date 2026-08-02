package xsna;

/* compiled from: WhiteboardAction.kt */
/* loaded from: classes7.dex */
public interface flx0 extends kj50 {

    /* compiled from: WhiteboardAction.kt */
    public static final class a implements flx0 {
        public final j9d0 b;

        public a(j9d0 j9d0Var) {
            this.b = j9d0Var;
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
            return "ActionsEvent(event=" + this.b + ')';
        }
    }

    /* compiled from: WhiteboardAction.kt */
    public static final class b implements flx0 {
        public static final b b = new b();
    }

    /* compiled from: WhiteboardAction.kt */
    public static final class c implements flx0 {
        public static final c b = new c();
    }

    /* compiled from: WhiteboardAction.kt */
    public static final class d implements flx0 {
        public static final d b = new d();
    }

    /* compiled from: WhiteboardAction.kt */
    public static final class e implements flx0 {
        public static final e b = new e();
    }
}
