package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class euj0 {
    public final int a;
    public final tev b;

    public euj0(int i, tev tevVar) {
        this.a = i;
        this.b = tevVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euj0)) {
            return false;
        }
        euj0 euj0Var = (euj0) obj;
        return this.a == euj0Var.a && jl40.l(this.b, euj0Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        tev tevVar = this.b;
        return hashCode + (tevVar == null ? 0 : tevVar.hashCode());
    }

    public final String toString() {
        return "ResourceImageStableKey(resId=" + this.a + ", size=" + this.b + Extension.C_BRAKE;
    }
}
