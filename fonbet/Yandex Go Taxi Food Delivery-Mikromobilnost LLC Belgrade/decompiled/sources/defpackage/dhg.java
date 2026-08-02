package defpackage;

import com.yandex.delivery.mapper.model.Expansion;
import com.yandex.delivery.mapper.model.SelectDestinationPolicy;
import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dhg extends hhg {
    public final String a;
    public final boolean b;
    public final Expansion c;
    public final String d;
    public final Map e;
    public final wgg f;
    public final String g;
    public final SelectDestinationPolicy h;
    public final ifa0 i;

    public dhg(String str, boolean z, Expansion expansion, String str2, Map map, wgg wggVar, String str3, SelectDestinationPolicy selectDestinationPolicy, ifa0 ifa0Var) {
        this.a = str;
        this.b = z;
        this.c = expansion;
        this.d = str2;
        this.e = map;
        this.f = wggVar;
        this.g = str3;
        this.h = selectDestinationPolicy;
        this.i = ifa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhg)) {
            return false;
        }
        dhg dhgVar = (dhg) obj;
        return jl40.l(this.a, dhgVar.a) && this.b == dhgVar.b && this.c == dhgVar.c && jl40.l(this.d, dhgVar.d) && jl40.l(this.e, dhgVar.e) && jl40.l(this.f, dhgVar.f) && jl40.l(this.g, dhgVar.g) && this.h == dhgVar.h && jl40.l(this.i, dhgVar.i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.c.hashCode() + unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31;
        String str2 = this.d;
        int d = unr0.d((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        wgg wggVar = this.f;
        int hashCode2 = (d + (wggVar == null ? 0 : wggVar.hashCode())) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SelectDestinationPolicy selectDestinationPolicy = this.h;
        int hashCode4 = (hashCode3 + (selectDestinationPolicy == null ? 0 : selectDestinationPolicy.hashCode())) * 31;
        ifa0 ifa0Var = this.i;
        return hashCode4 + (ifa0Var != null ? ifa0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("SummaryRedirectAction(vertical=", this.a, ", verticalTrap=", ", sheetExpansion=", this.b);
        l.append(this.c);
        l.append(", tariff=");
        l.append(this.d);
        l.append(", requirements=");
        l.append(this.e);
        l.append(", destination=");
        l.append(this.f);
        l.append(", storyId=");
        l.append(this.g);
        l.append(", selectDestinationPolicy=");
        l.append(this.h);
        l.append(", paymentOptions=");
        l.append(this.i);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public dhg() {
        this(null, false, Expansion.ANCHORED, null, b.f(), null, null, SelectDestinationPolicy.SKIP_IF_PRESELECTED, null);
    }
}
