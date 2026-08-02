package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gvs0 {
    public final CharSequence a;
    public final String b;
    public final x9x0 c;

    public gvs0(CharSequence charSequence, String str, x9x0 x9x0Var) {
        this.a = charSequence;
        this.b = str;
        this.c = x9x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvs0)) {
            return false;
        }
        gvs0 gvs0Var = (gvs0) obj;
        return jl40.l(this.a, gvs0Var.a) && jl40.l(this.b, gvs0Var.b) && this.c.equals(gvs0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Button(title=" + ((Object) this.a) + ", accessibilityLabel=" + this.b + ", widgetAction=" + this.c + Extension.C_BRAKE;
    }
}
