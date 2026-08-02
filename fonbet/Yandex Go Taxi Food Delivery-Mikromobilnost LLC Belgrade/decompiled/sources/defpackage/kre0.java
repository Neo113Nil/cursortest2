package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class kre0 implements rre0 {
    public final vmn0 a;

    public kre0(vmn0 vmn0Var) {
        this.a = vmn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kre0) && this.a == ((kre0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelfDrivingCar(action=" + this.a + Extension.C_BRAKE;
    }
}
