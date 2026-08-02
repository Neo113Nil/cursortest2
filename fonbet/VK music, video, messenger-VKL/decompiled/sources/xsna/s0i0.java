package xsna;

/* compiled from: ProductActionButtonsState.kt */
/* loaded from: classes18.dex */
public final class s0i0 implements yjk {
    public final String a;
    public final Integer b;

    public s0i0(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0i0)) {
            return false;
        }
        s0i0 s0i0Var = (s0i0) obj;
        return epx.f(this.a, s0i0Var.a) && epx.f(this.b, s0i0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SecondaryButtonState(title=");
        sb.append(this.a);
        sb.append(", iconResId=");
        return uqi.b(sb, this.b, ')');
    }
}
