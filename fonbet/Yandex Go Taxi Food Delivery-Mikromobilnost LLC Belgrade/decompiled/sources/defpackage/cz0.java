package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class cz0 implements kz0 {
    public final pv0 a;

    public cz0(pv0 pv0Var) {
        this.a = pv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cz0) && jl40.l(this.a, ((cz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MoveCameraToAddress(addressInfo=" + this.a + Extension.C_BRAKE;
    }
}
