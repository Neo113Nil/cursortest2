package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class gxl extends nxl {
    public final kr a;

    public gxl(kr krVar) {
        this.a = krVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gxl) {
            return jl40.l(this.a, ((gxl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DispatchAction(action=" + this.a + Extension.C_BRAKE;
    }
}
