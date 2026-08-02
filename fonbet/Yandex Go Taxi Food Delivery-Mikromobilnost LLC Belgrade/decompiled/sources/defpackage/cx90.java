package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cx90 extends yzc {
    public final String c;
    public final String d;
    public final j4z e;
    public final List f;

    public cx90(String str, String str2, j4z j4zVar, List list) {
        super("payment-key");
        this.c = str;
        this.d = str2;
        this.e = j4zVar;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx90)) {
            return false;
        }
        cx90 cx90Var = (cx90) obj;
        return jl40.l(this.c, cx90Var.c) && this.d.equals(cx90Var.d) && this.e.equals(cx90Var.e) && jl40.l(this.f, cx90Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + unr0.b(this.c.hashCode() * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("PaymentButtonModel(title=", this.c, ", subtitle=", this.d, ", icon=");
        v.append(this.e);
        v.append(", availableTypes=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
