package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class cw81 {
    public final String a;
    public final int b;

    public cw81(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw81)) {
            return false;
        }
        cw81 cw81Var = (cw81) obj;
        return this.a.equals(cw81Var.a) && this.b == cw81Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "ClickQrcode(url=", this.a, ", sizeInPx=", Extension.C_BRAKE);
    }
}
