package xsna;

/* compiled from: PastAsrListAction.kt */
/* loaded from: classes7.dex */
public abstract class um90 implements kj50 {

    /* compiled from: PastAsrListAction.kt */
    public static final class a extends um90 {
        public final ev3 b;

        public a(ev3 ev3Var) {
            this.b = ev3Var;
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
            return "DownloadAndOpenSingleItem(item=" + this.b + ')';
        }
    }

    /* compiled from: PastAsrListAction.kt */
    public static final class b extends um90 {
        public final ev3 b;

        public b(ev3 ev3Var) {
            this.b = ev3Var;
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
            return "DownloadSingleItem(item=" + this.b + ')';
        }
    }

    /* compiled from: PastAsrListAction.kt */
    public static final class c extends um90 {
        public static final c b = new c();
    }

    /* compiled from: PastAsrListAction.kt */
    public static final class d extends um90 {
        public static final d b = new d();
    }

    /* compiled from: PastAsrListAction.kt */
    public static final class e extends um90 {
        public static final e b = new e();
    }

    /* compiled from: PastAsrListAction.kt */
    public static final class f extends um90 {
        public static final f b = new f();
    }

    /* compiled from: PastAsrListAction.kt */
    public static final class g extends um90 {
        public final ev3 b;

        public g(ev3 ev3Var) {
            this.b = ev3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "RemoveSingleItem(item=" + this.b + ')';
        }
    }
}
