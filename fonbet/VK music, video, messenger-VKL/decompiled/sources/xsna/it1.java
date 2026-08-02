package xsna;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes11.dex */
public abstract class it1 {

    /* compiled from: RowColumnImpl.kt */
    public static final class a extends it1 {
        public final gt1 a;

        public a(gt1 gt1Var) {
            this.a = gt1Var;
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
            return "Value(alignmentLine=" + this.a + ')';
        }
    }
}
