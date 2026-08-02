package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class kte0 extends nte0 {
    public final vmn0 a;

    public kte0(vmn0 vmn0Var) {
        this.a = vmn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kte0) && this.a == ((kte0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelfDrivingCar(action=" + this.a + Extension.C_BRAKE;
    }
}
