package defpackage;

import com.ybsdk.feature.qr.payments.api.QrSource;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class c6g0 {
    public final String a;
    public final String b;
    public final QrSource c;
    public final String d;

    public c6g0(String str, String str2, QrSource qrSource, String str3) {
        this.a = str;
        this.b = str2;
        this.c = qrSource;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6g0)) {
            return false;
        }
        c6g0 c6g0Var = (c6g0) obj;
        return jl40.l(this.a, c6g0Var.a) && jl40.l(this.b, c6g0Var.b) && this.c == c6g0Var.c && jl40.l(this.d, c6g0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("QrCodeData(qrcLink=", this.a, ", qrcScanId=", this.b, ", source=");
        v.append(this.c);
        v.append(", origin=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
