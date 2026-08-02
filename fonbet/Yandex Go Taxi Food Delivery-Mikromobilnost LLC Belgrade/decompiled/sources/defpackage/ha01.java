package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ha01 implements ja01 {
    public final u531 a;

    public ha01(u531 u531Var) {
        this.a = u531Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ha01) && this.a.equals(((ha01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DefaultCar(vehicleInfo=" + this.a + Extension.C_BRAKE;
    }
}
