package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class iz80 implements kz80 {
    public final zv51 a;

    public iz80(zv51 zv51Var) {
        this.a = zv51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iz80) && jl40.l(this.a, ((iz80) obj).a);
    }

    @Override // defpackage.a4m
    public final int hashCode() {
        zv51 zv51Var = this.a;
        if (zv51Var == null) {
            return 0;
        }
        return zv51Var.hashCode();
    }

    public final String toString() {
        return "TopUpYangoWalletAction(amount=" + this.a + Extension.C_BRAKE;
    }
}
