package xsna;

/* compiled from: ProductCardPropertyPickerBottomSheetBuilder.kt */
/* loaded from: classes18.dex */
public final class cmd0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final cy0 d;

    public cmd0(String str, boolean z, boolean z2, cy0 cy0Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = cy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmd0)) {
            return false;
        }
        cmd0 cmd0Var = (cmd0) obj;
        return this.a.equals(cmd0Var.a) && this.b == cmd0Var.b && this.c == cmd0Var.c && this.d.equals(cmd0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ProductCardProperty(title=" + this.a + ", isSelected=" + this.b + ", isEnabled=" + this.c + ", onClick=" + this.d + ')';
    }
}
