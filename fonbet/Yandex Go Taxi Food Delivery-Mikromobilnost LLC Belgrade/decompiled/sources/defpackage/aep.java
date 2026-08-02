package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class aep implements dep {
    public final pv0 a;

    public /* synthetic */ aep(pv0 pv0Var) {
        this.a = pv0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aep) {
            return jl40.l(this.a, ((aep) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InitialAddress(value=" + this.a + Extension.C_BRAKE;
    }
}
