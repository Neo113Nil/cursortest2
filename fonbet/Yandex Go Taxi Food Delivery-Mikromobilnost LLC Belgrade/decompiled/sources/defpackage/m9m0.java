package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class m9m0 implements s9m0 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public m9m0(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9m0)) {
            return false;
        }
        m9m0 m9m0Var = (m9m0) obj;
        return jl40.l(this.a, m9m0Var.a) && jl40.l(this.b, m9m0Var.b) && jl40.l(this.c, m9m0Var.c) && this.d.equals(m9m0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("FundIncome(id=", this.a, ", title=", this.b, ", infoAction=");
        v.append(this.c);
        v.append(", periods=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
