package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class iq4 extends hq4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final boolean h;
    public final t0a0 i;

    public iq4(String str, String str2, String str3, String str4, boolean z, boolean z2, List list, boolean z3, t0a0 t0a0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = list;
        this.h = z3;
        this.i = t0a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq4)) {
            return false;
        }
        iq4 iq4Var = (iq4) obj;
        return jl40.l(this.a, iq4Var.a) && jl40.l(this.b, iq4Var.b) && jl40.l(this.c, iq4Var.c) && jl40.l(this.d, iq4Var.d) && this.e == iq4Var.e && this.f == iq4Var.f && jl40.l(this.g, iq4Var.g) && this.h == iq4Var.h && jl40.l(this.i, iq4Var.i);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        List list = this.g;
        return this.i.hashCode() + unr0.e((e + (list == null ? 0 : list.hashCode())) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder v = b64.v("BankListItem(id=", this.a, ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", bankName=", this.d, ", enabled=");
        nnm.v(", hasWeb=", ", additionalKeywords=", v, this.e, this.f);
        nzs.p(v, this.g, ", hasDivider=", this.h, ", paymentIconInfo=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
