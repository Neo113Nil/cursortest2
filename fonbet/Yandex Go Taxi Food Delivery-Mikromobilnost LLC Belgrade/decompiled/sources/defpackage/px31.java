package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class px31 implements qx31 {
    public final int a;

    public px31(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof px31) && this.a == ((px31) obj).a;
    }

    @Override // defpackage.qx31
    public final int getPosition() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "LastVisibleItemPosition(position=", Extension.C_BRAKE);
    }
}
