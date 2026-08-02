package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class fji {
    public final f0c0 a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final Integer f;
    public final Integer g;

    public fji(f0c0 f0c0Var, String str, String str2, boolean z, boolean z2, Integer num, Integer num2) {
        this.a = f0c0Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = num;
        this.g = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fji)) {
            return false;
        }
        fji fjiVar = (fji) obj;
        return jl40.l(this.a, fjiVar.a) && this.b.equals(fjiVar.b) && this.c.equals(fjiVar.c) && this.d == fjiVar.d && this.e == fjiVar.e && jl40.l(this.f, fjiVar.f) && jl40.l(this.g, fjiVar.g);
    }

    public final int hashCode() {
        f0c0 f0c0Var = this.a;
        int e = unr0.e(unr0.e(unr0.b(unr0.b((f0c0Var == null ? 0 : f0c0Var.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        Integer num = this.f;
        int hashCode = (e + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryPinState(state=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", hint=");
        tse0.y(this.c, ", textWithChevron=", ", shouldSwapTexts=", sb, this.d);
        sb.append(this.e);
        sb.append(", contentColor=");
        sb.append(this.f);
        sb.append(", bgColor=");
        return oo31.j(sb, this.g, Extension.C_BRAKE);
    }
}
