package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes10.dex */
public final class kb5 {
    public static final kb5 g = new kb5((String) null, (String) null, (wu1) null, (TariffOrderFlow) null, false, 63);
    public final String a;
    public final String b;
    public final wu1 c;
    public final TariffOrderFlow d;
    public final boolean e;
    public final is60 f;

    public /* synthetic */ kb5(String str, String str2, wu1 wu1Var, TariffOrderFlow tariffOrderFlow, boolean z, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : wu1Var, (i & 8) != 0 ? TariffOrderFlow.TAXI_FLOW : tariffOrderFlow, (i & 16) != 0 ? false : z, is60.c);
    }

    public final boolean a(kb5 kb5Var) {
        return jl40.l(this.a, kb5Var.a) && jl40.l(this.b, kb5Var.b) && jl40.l(this.c, kb5Var.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb5)) {
            return false;
        }
        kb5 kb5Var = (kb5) obj;
        return jl40.l(this.a, kb5Var.a) && jl40.l(this.b, kb5Var.b) && jl40.l(this.c, kb5Var.c) && this.d == kb5Var.d && this.e == kb5Var.e && jl40.l(this.f, kb5Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        wu1 wu1Var = this.c;
        return this.f.hashCode() + unr0.e((this.d.hashCode() + ((b + (wu1Var == null ? 0 : wu1Var.hashCode())) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("BaseTariffInfo(verticalId=", this.a, ", tariffClass=", this.b, ", altOptionGroup=");
        v.append(this.c);
        v.append(", orderFlow=");
        v.append(this.d);
        v.append(", isMulticlass=");
        v.append(this.e);
        v.append(", offer=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public kb5() {
        this((String) null, (String) null, (wu1) null, (TariffOrderFlow) null, false, 63);
    }

    public kb5(String str, String str2, wu1 wu1Var, TariffOrderFlow tariffOrderFlow, boolean z, is60 is60Var) {
        this.a = str;
        this.b = str2;
        this.c = wu1Var;
        this.d = tariffOrderFlow;
        this.e = z;
        this.f = is60Var;
    }
}
