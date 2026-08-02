package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mdb0 implements odb0 {
    public final kao a;

    public mdb0(kao kaoVar) {
        this.a = kaoVar;
    }

    public final kao a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mdb0) && this.a == ((mdb0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ly3.n("Error(errorState=", this.a, Extension.C_BRAKE);
    }
}
