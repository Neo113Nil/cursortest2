package xsna;

/* compiled from: PastAsrListViewEvent.kt */
/* loaded from: classes7.dex */
public abstract class hn90 {

    /* compiled from: PastAsrListViewEvent.kt */
    public static final class a extends hn90 {
        public final ev3 a;

        public a(ev3 ev3Var) {
            this.a = ev3Var;
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
            return "AsrItemClick(item=" + this.a + ')';
        }
    }

    /* compiled from: PastAsrListViewEvent.kt */
    public static final class b extends hn90 {
        public final ev3 a;

        public b(ev3 ev3Var) {
            this.a = ev3Var;
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
            return "DownloadAsrClick(item=" + this.a + ')';
        }
    }

    /* compiled from: PastAsrListViewEvent.kt */
    public static final class c extends hn90 {
        public final ev3 a;

        public c(ev3 ev3Var) {
            this.a = ev3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "MenuClick(item=" + this.a + ')';
        }
    }

    /* compiled from: PastAsrListViewEvent.kt */
    public static final class d extends hn90 {
        public static final d a = new d();
    }

    /* compiled from: PastAsrListViewEvent.kt */
    public static final class e extends hn90 {
        public static final e a = new e();
    }

    /* compiled from: PastAsrListViewEvent.kt */
    public static final class f extends hn90 {
        public final ev3 a;

        public f(ev3 ev3Var) {
            this.a = ev3Var;
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
            return "RemoveAsrClick(item=" + this.a + ')';
        }
    }

    /* compiled from: PastAsrListViewEvent.kt */
    public static final class g extends hn90 {
        public static final g a = new g();
    }
}
