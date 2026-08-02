package defpackage;

import com.yandex.payment.sdk.flex.api.dtotransport.RestMethod;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class i6p extends kr {
    public static final g6p Companion = new g6p();
    public static final i3y[] n;
    public final RestMethod a;
    public final String b;
    public final String c;
    public final double d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final Map h;
    public final Map i;
    public final kr j;
    public final kr k;
    public final List l;
    public final List m;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        n = new i3y[]{a.b(lazyThreadSafetyMode, new d6p(0)), null, null, null, a.b(lazyThreadSafetyMode, new d6p(2)), a.b(lazyThreadSafetyMode, new d6p(4)), a.b(lazyThreadSafetyMode, new d6p(6)), a.b(lazyThreadSafetyMode, new d6p(8)), a.b(lazyThreadSafetyMode, new d6p(10)), a.b(lazyThreadSafetyMode, new d6p(12)), a.b(lazyThreadSafetyMode, new d6p(14)), a.b(lazyThreadSafetyMode, new d6p(16)), a.b(lazyThreadSafetyMode, new d6p(18))};
    }

    public /* synthetic */ i6p(int i, RestMethod restMethod, String str, String str2, double d, Map map, Map map2, Map map3, Map map4, Map map5, kr krVar, kr krVar2, List list, List list2) {
        if (8191 != (i & 8191)) {
            qje.Z(i, 8191, e6p.a.getDescriptor());
            throw null;
        }
        this.a = restMethod;
        this.b = str;
        this.c = str2;
        this.d = d;
        this.e = map;
        this.f = map2;
        this.g = map3;
        this.h = map4;
        this.i = map5;
        this.j = krVar;
        this.k = krVar2;
        this.l = list;
        this.m = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6p)) {
            return false;
        }
        i6p i6pVar = (i6p) obj;
        return this.a == i6pVar.a && jl40.l(this.b, i6pVar.b) && jl40.l(this.c, i6pVar.c) && Double.compare(this.d, i6pVar.d) == 0 && jl40.l(this.e, i6pVar.e) && jl40.l(this.f, i6pVar.f) && jl40.l(this.g, i6pVar.g) && jl40.l(this.h, i6pVar.h) && jl40.l(this.i, i6pVar.i) && jl40.l(this.j, i6pVar.j) && jl40.l(this.k, i6pVar.k) && jl40.l(this.l, i6pVar.l) && jl40.l(this.m, i6pVar.m);
    }

    public final int hashCode() {
        int a = unr0.a(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Map map = this.e;
        int hashCode = (a + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f;
        int d = unr0.d(unr0.d((hashCode + (map2 == null ? 0 : map2.hashCode())) * 31, 31, this.g), 31, this.h);
        Map map3 = this.i;
        int hashCode2 = (d + (map3 == null ? 0 : map3.hashCode())) * 31;
        kr krVar = this.j;
        int hashCode3 = (hashCode2 + (krVar == null ? 0 : krVar.hashCode())) * 31;
        kr krVar2 = this.k;
        int hashCode4 = (hashCode3 + (krVar2 == null ? 0 : krVar2.hashCode())) * 31;
        List list = this.l;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.m;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "FTRequestAction(method=" + this.a + ", baseURL=" + this.b + ", path=" + this.c + ", timeout=" + this.d + ", headers=" + this.e + ", queryItems=" + this.f + ", requestMap=" + this.g + ", responseMap=" + this.h + ", failedResponseMap=" + this.i + ", successAction=" + this.j + ", failureAction=" + this.k + ", statusCodeVarPath=" + this.l + ", errorVarPath=" + this.m + Extension.C_BRAKE;
    }
}
