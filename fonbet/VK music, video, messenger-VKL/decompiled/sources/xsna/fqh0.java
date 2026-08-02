package xsna;

/* compiled from: VkSearchTextField.kt */
/* loaded from: classes17.dex */
public final class fqh0 {
    public final String a;
    public final String b;
    public final tlh0 c;
    public final bkg0 d;
    public final tlh0 e;
    public final boolean f;

    public fqh0(String str, String str2, tlh0 tlh0Var, bkg0 bkg0Var, tlh0 tlh0Var2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = tlh0Var;
        this.d = bkg0Var;
        this.e = tlh0Var2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqh0)) {
            return false;
        }
        fqh0 fqh0Var = (fqh0) obj;
        return epx.f(this.a, fqh0Var.a) && epx.f(this.b, fqh0Var.b) && epx.f(this.c, fqh0Var.c) && this.d.equals(fqh0Var.d) && epx.f(this.e, fqh0Var.e) && this.f == fqh0Var.f;
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        tlh0 tlh0Var = this.c;
        int hashCode = (this.d.hashCode() + ((a + (tlh0Var == null ? 0 : tlh0Var.hashCode())) * 31)) * 31;
        tlh0 tlh0Var2 = this.e;
        return Boolean.hashCode(this.f) + ((hashCode + (tlh0Var2 != null ? tlh0Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchDecorationParams(text=");
        sb.append(this.a);
        sb.append(", hint=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", clear=");
        sb.append(this.d);
        sb.append(", voice=");
        sb.append(this.e);
        sb.append(", loading=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
