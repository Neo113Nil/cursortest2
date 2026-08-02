package xsna;

/* compiled from: ScheduledCallNavigationEvent.kt */
/* loaded from: classes7.dex */
public abstract class f6h0 implements x49 {

    /* compiled from: ScheduledCallNavigationEvent.kt */
    public static final class a extends f6h0 {
        public final String a;

        public a(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("CopyInvite(text="), this.a, ')');
        }
    }

    /* compiled from: ScheduledCallNavigationEvent.kt */
    public static final class b extends f6h0 {
        public final x5h0 a;

        public b(x5h0 x5h0Var) {
            this.a = x5h0Var;
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
            return "OpenEdit(call=" + this.a + ')';
        }
    }

    /* compiled from: ScheduledCallNavigationEvent.kt */
    public static final class c extends f6h0 {
        public final x5h0 a;

        public c(x5h0 x5h0Var) {
            this.a = x5h0Var;
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
            return "OpenRescheduleCall(call=" + this.a + ')';
        }
    }

    /* compiled from: ScheduledCallNavigationEvent.kt */
    public static final class d extends f6h0 {
        public static final d a = new d();
    }

    /* compiled from: ScheduledCallNavigationEvent.kt */
    public static final class e extends f6h0 {
        public static final e a = new e();
    }
}
