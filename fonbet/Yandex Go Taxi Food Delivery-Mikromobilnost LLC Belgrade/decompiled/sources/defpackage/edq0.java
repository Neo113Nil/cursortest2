package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class edq0 extends gdq0 {
    public final sl a;
    public final boolean b;

    public edq0(sl slVar, boolean z) {
        this.a = slVar;
        this.b = z;
    }

    @Override // defpackage.gdq0
    public final sl a() {
        return this.a;
    }

    @Override // defpackage.gdq0
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edq0)) {
            return false;
        }
        edq0 edq0Var = (edq0) obj;
        return jl40.l(this.a, edq0Var.a) && this.b == edq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "V1(account=" + this.a + ", shouldShowSpoiler=" + this.b + Extension.C_BRAKE;
    }
}
