package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class cmf0 {
    public final String a;
    public final ArrayList b;
    public final ArrayList c;
    public final String d;
    public final ArrayList e;

    public cmf0(String str, ArrayList arrayList, ArrayList arrayList2, String str2, ArrayList arrayList3) {
        this.a = str;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = str2;
        this.e = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmf0)) {
            return false;
        }
        cmf0 cmf0Var = (cmf0) obj;
        return this.a.equals(cmf0Var.a) && this.b.equals(cmf0Var.b) && this.c.equals(cmf0Var.c) && jl40.l(this.d, cmf0Var.d) && this.e.equals(cmf0Var.e);
    }

    public final int hashCode() {
        int b = ly3.b(ly3.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = x4e.m("PromoCodeDetails(title=", this.a, ", descriptions=", ", details=", this.b);
        m.append(this.c);
        m.append(", decorationImageTag=");
        m.append(this.d);
        m.append(", actions=");
        return b64.n(Extension.C_BRAKE, m, this.e);
    }
}
