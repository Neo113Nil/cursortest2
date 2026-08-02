package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class g230 implements i230 {
    public final ip00 a;

    public g230(ip00 ip00Var) {
        this.a = ip00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g230) && this.a.equals(((g230) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ModalViewOverMap(mapObjectsDescriptor=" + this.a + Extension.C_BRAKE;
    }
}
