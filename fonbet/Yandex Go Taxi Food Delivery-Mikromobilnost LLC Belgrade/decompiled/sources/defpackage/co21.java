package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class co21 implements eo21 {
    public final String a;
    public final String b;

    public co21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.eo21
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co21)) {
            return false;
        }
        co21 co21Var = (co21) obj;
        return jl40.l(this.a, co21Var.a) && jl40.l(this.b, co21Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return unr0.p("Text(propertyName=", this.a, ", value=", this.b, Extension.C_BRAKE);
    }
}
