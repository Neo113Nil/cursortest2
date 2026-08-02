package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kw7 implements vv7 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;

    public kw7(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw7)) {
            return false;
        }
        kw7 kw7Var = (kw7) obj;
        return jl40.l(this.a, kw7Var.a) && jl40.l(this.b, kw7Var.b) && this.c.equals(kw7Var.c) && jl40.l(this.d, kw7Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = ly3.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CancelMessageV2(title=", this.a, ", body=", this.b, ", buttons=");
        v.append(this.c);
        v.append(", metricaLabel=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
