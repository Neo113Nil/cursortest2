package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ibe {
    public final ti91 a;
    public final String b;
    public final efb0 c;

    public ibe(ti91 ti91Var, String str, efb0 efb0Var) {
        this.a = ti91Var;
        this.b = str;
        this.c = efb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibe)) {
            return false;
        }
        ibe ibeVar = (ibe) obj;
        return this.a.equals(ibeVar.a) && this.b.equals(ibeVar.b) && jl40.l(this.c, ibeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "PhoneInputField(label=" + this.a + ", trailButtonText=" + this.b + ", value=" + this.c + Extension.C_BRAKE;
    }
}
