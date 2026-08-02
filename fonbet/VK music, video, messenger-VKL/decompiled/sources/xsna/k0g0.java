package xsna;

/* compiled from: RepeatEndDateOption.kt */
/* loaded from: classes7.dex */
public abstract class k0g0 implements hfz {

    /* compiled from: RepeatEndDateOption.kt */
    public static final class a extends k0g0 {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Never(isSelected="), this.b, ')');
        }
    }

    /* compiled from: RepeatEndDateOption.kt */
    public static final class b extends k0g0 {
        public final boolean b;
        public final mvo0 c;

        public b(boolean z, mvo0 mvo0Var) {
            this.b = z;
            this.c = mvo0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        @Override // xsna.k0g0, xsna.hfz
        public final Number getItemId() {
            mvo0 mvo0Var = this.c;
            return Integer.valueOf(mvo0Var != null ? Long.hashCode(mvo0Var.a) : 0);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.b) * 31;
            mvo0 mvo0Var = this.c;
            return hashCode + (mvo0Var == null ? 0 : Long.hashCode(mvo0Var.a));
        }

        public final String toString() {
            return "RepeatEndDate(isSelected=" + this.b + ", date=" + this.c + ')';
        }
    }

    @Override // xsna.hfz
    public Number getItemId() {
        return 0;
    }
}
