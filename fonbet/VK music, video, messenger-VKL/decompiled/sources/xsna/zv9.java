package xsna;

/* compiled from: ProductActionButtonsState.kt */
/* loaded from: classes18.dex */
public final class zv9 implements yjk {
    public final int a;
    public final boolean b;

    public zv9(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv9)) {
            return false;
        }
        zv9 zv9Var = (zv9) obj;
        return this.a == zv9Var.a && this.b == zv9Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CartButtonState(quantity=");
        sb.append(this.a);
        sb.append(", hasMoreInStock=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
