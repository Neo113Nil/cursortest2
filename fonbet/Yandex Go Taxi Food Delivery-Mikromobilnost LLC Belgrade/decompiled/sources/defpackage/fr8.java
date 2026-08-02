package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class fr8 extends ye0 {
    public final String b;

    public fr8(String str) {
        super("care.sdkClosed");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fr8) && this.b.equals(((fr8) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("SdkClosed(type=", this.b, Extension.C_BRAKE);
    }
}
