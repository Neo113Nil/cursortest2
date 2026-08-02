package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class p6s0 implements qas0 {
    public final ux5 a;

    public p6s0(ux5 ux5Var) {
        this.a = ux5Var;
    }

    public final ux5 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p6s0) && jl40.l(this.a, ((p6s0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowEncryptBiometric(biometricHelper=" + this.a + Extension.C_BRAKE;
    }
}
