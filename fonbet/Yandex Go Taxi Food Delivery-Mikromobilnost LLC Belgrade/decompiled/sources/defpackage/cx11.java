package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cx11 {
    public final String a;
    public final String b;
    public final bx11 c;
    public final bx11 d;
    public final dx11 e;
    public final dx11 f;

    public cx11(String str, String str2, bx11 bx11Var, bx11 bx11Var2, dx11 dx11Var, dx11 dx11Var2) {
        this.a = str;
        this.b = str2;
        this.c = bx11Var;
        this.d = bx11Var2;
        this.e = dx11Var;
        this.f = dx11Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx11)) {
            return false;
        }
        cx11 cx11Var = (cx11) obj;
        return jl40.l(this.a, cx11Var.a) && jl40.l(this.b, cx11Var.b) && this.c.equals(cx11Var.c) && this.d.equals(cx11Var.d) && this.e.equals(cx11Var.e) && this.f.equals(cx11Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c.a), 31, this.d.a)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("UnbindAccountSheetEntity(title=", this.a, ", description=", this.b, ", primaryButton=");
        v.append(this.c);
        v.append(", secondaryButton=");
        v.append(this.d);
        v.append(", successSnackbar=");
        v.append(this.e);
        v.append(", failureSnackbar=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
