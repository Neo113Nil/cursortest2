package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class df1 {
    public final Integer a;
    public final Integer b;

    public df1(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df1)) {
            return false;
        }
        df1 df1Var = (df1) obj;
        return epx.f(this.a, df1Var.a) && epx.f(this.b, df1Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "LayoutParamsSize(width=" + this.a + ", height=" + this.b + ")";
    }
}
