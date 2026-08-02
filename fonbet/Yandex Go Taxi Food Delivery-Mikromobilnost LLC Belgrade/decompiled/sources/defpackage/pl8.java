package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pl8 extends sl8 {
    public final String b;

    public pl8(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pl8) && this.b.equals(((pl8) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("FirstInputCompleted(firstInput=", this.b, Extension.C_BRAKE);
    }
}
