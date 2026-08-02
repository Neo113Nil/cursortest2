package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class o9k0 implements p9k0 {
    public final qim a;

    static {
        qim qimVar = qim.p;
    }

    public o9k0(qim qimVar) {
        this.a = qimVar;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return "open_driver_profile";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o9k0) && this.a.equals(((o9k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenDriverProfile(driverModel=" + this.a + Extension.C_BRAKE;
    }
}
