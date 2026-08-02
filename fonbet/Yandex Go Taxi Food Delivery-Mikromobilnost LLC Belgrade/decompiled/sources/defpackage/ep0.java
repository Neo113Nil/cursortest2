package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ep0 implements gp0 {
    public final ac1 a;
    public final boolean b;

    public ep0(ac1 ac1Var, boolean z) {
        this.a = ac1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep0)) {
            return false;
        }
        ep0 ep0Var = (ep0) obj;
        return this.a.equals(ep0Var.a) && this.b == ep0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectPickupPoint(data=" + this.a + ", moveMap=" + this.b + Extension.C_BRAKE;
    }
}
