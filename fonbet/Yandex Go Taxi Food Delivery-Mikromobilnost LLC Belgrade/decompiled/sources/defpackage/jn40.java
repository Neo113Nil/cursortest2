package defpackage;

import com.yandex.go.multitariff.SelectionRules;
import com.yandex.go.zone.dto.objects.TariffUnavailable;
import com.yandex.go.zone.dto.objects.f5;
import com.yandex.go.zone.dto.response.Selector;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class jn40 {
    public final String a;
    public final en40 b;
    public final Selector c;
    public final TariffUnavailable d;
    public final Set e;
    public final Set f;
    public final List g;
    public final SelectionRules h;
    public final boolean i;
    public final f5 j;
    public final boolean k;

    public jn40(String str, en40 en40Var, Selector selector, TariffUnavailable tariffUnavailable, Set set, Set set2, List list, SelectionRules selectionRules, boolean z, f5 f5Var, boolean z2) {
        this.a = str;
        this.b = en40Var;
        this.c = selector;
        this.d = tariffUnavailable;
        this.e = set;
        this.f = set2;
        this.g = list;
        this.h = selectionRules;
        this.i = z;
        this.j = f5Var;
        this.k = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn40)) {
            return false;
        }
        jn40 jn40Var = (jn40) obj;
        return jl40.l(this.a, jn40Var.a) && jl40.l(this.b, jn40Var.b) && jl40.l(this.c, jn40Var.c) && jl40.l(this.d, jn40Var.d) && jl40.l(this.e, jn40Var.e) && jl40.l(this.f, jn40Var.f) && jl40.l(this.g, jn40Var.g) && jl40.l(this.h, jn40Var.h) && this.i == jn40Var.i && jl40.l(this.j, jn40Var.j) && this.k == jn40Var.k;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Selector selector = this.c;
        int hashCode2 = (hashCode + (selector == null ? 0 : selector.hashCode())) * 31;
        TariffUnavailable tariffUnavailable = this.d;
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + unr0.e((this.h.a.hashCode() + unr0.c(g8e.e(this.f, g8e.e(this.e, (hashCode2 + (tariffUnavailable != null ? tariffUnavailable.hashCode() : 0)) * 31, 31), 31), 31, this.g)) * 31, 31, this.i)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiTariffOption(name=");
        sb.append(this.a);
        sb.append(", details=");
        sb.append(this.b);
        sb.append(", selector=");
        sb.append(this.c);
        sb.append(", tariffUnavailable=");
        sb.append(this.d);
        sb.append(", supportedTariffs=");
        sb.append(this.e);
        sb.append(", selectedTariffs=");
        sb.append(this.f);
        sb.append(", unsupportedRequirements=");
        sb.append(this.g);
        sb.append(", selectionRules=");
        sb.append(this.h);
        sb.append(", requirementsSupported=");
        sb.append(this.i);
        sb.append(", widget=");
        sb.append(this.j);
        sb.append(", shouldDeactivateInappropriateTariffs=");
        return x4e.i(sb, this.k, Extension.C_BRAKE);
    }
}
