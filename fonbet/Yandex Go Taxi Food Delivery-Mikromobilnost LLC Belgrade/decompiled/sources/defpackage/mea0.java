package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mea0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final LinkedHashMap e;
    public final f89 f;
    public final List g;

    public mea0(String str, String str2, String str3, String str4, LinkedHashMap linkedHashMap, f89 f89Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = linkedHashMap;
        this.f = f89Var;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mea0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        mea0 mea0Var = (mea0) obj;
        return jl40.l(this.a, mea0Var.a) && this.b.equals(mea0Var.b) && jl40.l(this.c, mea0Var.c) && this.g.equals(mea0Var.g) && this.e.equals(mea0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        return this.e.hashCode() + unr0.c(unr0.b(unr0.b((str != null ? str.hashCode() : 0) * 31, 31, this.b), 31, this.c), 31, this.g);
    }

    public final String toString() {
        StringBuilder v = b64.v("PaymentModel(id=", this.a, ", type='", this.b, "', title='");
        v.append(this.c);
        v.append("', iconProvider=");
        v.append(this.f);
        v.append(", complements=$, additionalInfo=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
