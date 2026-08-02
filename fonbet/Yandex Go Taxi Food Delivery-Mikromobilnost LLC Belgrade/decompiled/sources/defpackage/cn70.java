package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class cn70 implements fn70 {
    public final String a;
    public final CharSequence b;

    public cn70(CharSequence charSequence, String str) {
        this.a = str;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn70)) {
            return false;
        }
        cn70 cn70Var = (cn70) obj;
        return jl40.l(this.a, cn70Var.a) && jl40.l(this.b, cn70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextWithIconView(url=" + this.a + ", label=" + ((Object) this.b) + Extension.C_BRAKE;
    }
}
