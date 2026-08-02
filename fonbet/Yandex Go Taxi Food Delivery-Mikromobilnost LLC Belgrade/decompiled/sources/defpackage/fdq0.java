package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class fdq0 extends gdq0 {
    public final sl a;
    public final boolean b;

    public fdq0(sl slVar, boolean z) {
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
        if (!(obj instanceof fdq0)) {
            return false;
        }
        fdq0 fdq0Var = (fdq0) obj;
        return this.a.equals(fdq0Var.a) && this.b == fdq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "V2(account=" + this.a + ", shouldShowSpoiler=" + this.b + Extension.C_BRAKE;
    }
}
