package defpackage;

import com.yandex.go.multitariff.RouteStatsVerticalMulticlassDetails;
import com.yandex.go.multitariff.SelectionRules;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.objects.TariffUnavailable;
import com.yandex.go.zone.dto.objects.e5;
import com.yandex.go.zone.dto.objects.f5;
import com.yandex.go.zone.dto.response.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lbcl0;", "", "Companion", "zbl0", "acl0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class bcl0 {
    public static final acl0 Companion = new acl0();
    public static final i3y[] l;
    public final List a;
    public final Integer b;
    public final n7v c;
    public final String d;
    public final RouteStatsVerticalMulticlassDetails e;
    public final f5 f;
    public final SelectionRules g;
    public final c h;
    public final List i;
    public final TariffUnavailable j;
    public final List k;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new i3y[]{a.b(lazyThreadSafetyMode, new ibl0(9)), null, null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new ibl0(10)), null, a.b(lazyThreadSafetyMode, new ibl0(11))};
    }

    public bcl0(int i, List list, Integer num, n7v n7vVar, String str, RouteStatsVerticalMulticlassDetails routeStatsVerticalMulticlassDetails, f5 f5Var, SelectionRules selectionRules, c cVar, List list2, TariffUnavailable tariffUnavailable, List list3) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = n7vVar;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            RouteStatsVerticalMulticlassDetails.Companion.getClass();
            this.e = RouteStatsVerticalMulticlassDetails.f;
        } else {
            this.e = routeStatsVerticalMulticlassDetails;
        }
        if ((i & 32) == 0) {
            this.f = e5.INSTANCE;
        } else {
            this.f = f5Var;
        }
        if ((i & 64) == 0) {
            this.g = new SelectionRules(0);
        } else {
            this.g = selectionRules;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = cVar;
        }
        if ((i & 256) == 0) {
            this.i = emptyList;
        } else {
            this.i = list2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = tariffUnavailable;
        }
        if ((i & 1024) == 0) {
            this.k = emptyList;
        } else {
            this.k = list3;
        }
    }

    public final ArrayList a() {
        List list;
        List list2 = this.k;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            list = ccl0.a;
            if (kotlin.collections.a.G(list, ((ServiceLevel.Branding) obj).getC())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcl0)) {
            return false;
        }
        bcl0 bcl0Var = (bcl0) obj;
        return jl40.l(this.a, bcl0Var.a) && jl40.l(this.b, bcl0Var.b) && jl40.l(this.c, bcl0Var.c) && jl40.l(this.d, bcl0Var.d) && jl40.l(this.e, bcl0Var.e) && jl40.l(this.f, bcl0Var.f) && jl40.l(this.g, bcl0Var.g) && jl40.l(this.h, bcl0Var.h) && jl40.l(this.i, bcl0Var.i) && jl40.l(this.j, bcl0Var.j) && jl40.l(this.k, bcl0Var.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        n7v n7vVar = this.c;
        int hashCode3 = (this.g.a.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + unr0.b((hashCode2 + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31, 31, this.d)) * 31)) * 31)) * 31;
        c cVar = this.h;
        int c = unr0.c((hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.i);
        TariffUnavailable tariffUnavailable = this.j;
        return this.k.hashCode() + ((c + (tariffUnavailable != null ? tariffUnavailable.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteStatsVerticalMulticlass(tariffs=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", selectorIcon=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", details=");
        sb.append(this.e);
        sb.append(", widget=");
        sb.append(this.f);
        sb.append(", selectionRules=");
        sb.append(this.g);
        sb.append(", estimatedWaitingDto=");
        sb.append(this.h);
        sb.append(", unsupportedRequirements=");
        sb.append(this.i);
        sb.append(", tariffUnavailable=");
        sb.append(this.j);
        sb.append(", brandings=");
        return ly3.s(sb, this.k, Extension.C_BRAKE);
    }

    public bcl0(List list, Integer num, n7v n7vVar, String str, RouteStatsVerticalMulticlassDetails routeStatsVerticalMulticlassDetails, f5 f5Var, SelectionRules selectionRules, c cVar, List list2, TariffUnavailable tariffUnavailable, List list3) {
        this.a = list;
        this.b = num;
        this.c = n7vVar;
        this.d = str;
        this.e = routeStatsVerticalMulticlassDetails;
        this.f = f5Var;
        this.g = selectionRules;
        this.h = cVar;
        this.i = list2;
        this.j = tariffUnavailable;
        this.k = list3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bcl0() {
        this(r2, null, null, "", r6, r7, r8, null, r2, null, r2);
        RouteStatsVerticalMulticlassDetails.Companion.getClass();
        RouteStatsVerticalMulticlassDetails routeStatsVerticalMulticlassDetails = RouteStatsVerticalMulticlassDetails.f;
        e5 e5Var = e5.INSTANCE;
        SelectionRules selectionRules = new SelectionRules(0);
        EmptyList emptyList = EmptyList.a;
    }
}
