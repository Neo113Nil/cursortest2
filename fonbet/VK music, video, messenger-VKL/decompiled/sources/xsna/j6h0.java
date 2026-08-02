package xsna;

/* compiled from: ScheduledCallPatch.kt */
/* loaded from: classes7.dex */
public abstract class j6h0 implements b59 {

    /* compiled from: ScheduledCallPatch.kt */
    public static final class a extends j6h0 {
        public final x5h0 b;

        public a(x5h0 x5h0Var) {
            this.b = x5h0Var;
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
            return "DeleteScheduledCall(call=" + this.b + ')';
        }
    }
}
