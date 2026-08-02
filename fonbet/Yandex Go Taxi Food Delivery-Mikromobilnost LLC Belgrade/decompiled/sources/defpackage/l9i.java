package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class l9i {
    public final boolean a;
    public final boolean b;

    public l9i(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9i)) {
            return false;
        }
        l9i l9iVar = (l9i) obj;
        return this.a == l9iVar.a && this.b == l9iVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("DeliveryExtra(isDeliveryBusinessAccountEnabled=", ", isArEnabled=", Extension.C_BRAKE, this.a, this.b);
    }
}
