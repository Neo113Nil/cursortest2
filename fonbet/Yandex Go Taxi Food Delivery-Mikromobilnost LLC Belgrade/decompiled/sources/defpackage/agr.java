package defpackage;

import com.yandex.payment.sdk.flex.api.dtotransport.RestMethod;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class agr implements mgr {
    public final RestMethod a;
    public final String b;
    public final String c;
    public final double d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final Map h;
    public final Map i;
    public final List j;
    public final List k;
    public final m6p l;
    public final m6p m;

    public agr(RestMethod restMethod, String str, String str2, double d, Map map, Map map2, Map map3, Map map4, Map map5, List list, List list2, m6p m6pVar, m6p m6pVar2) {
        this.a = restMethod;
        this.b = str;
        this.c = str2;
        this.d = d;
        this.e = map;
        this.f = map2;
        this.g = map3;
        this.h = map4;
        this.i = map5;
        this.j = list;
        this.k = list2;
        this.l = m6pVar;
        this.m = m6pVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof agr) {
            agr agrVar = (agr) obj;
            return this.a == agrVar.a && jl40.l(this.b, agrVar.b) && jl40.l(this.c, agrVar.c) && Double.compare(this.d, agrVar.d) == 0 && jl40.l(this.e, agrVar.e) && jl40.l(this.f, agrVar.f) && jl40.l(this.g, agrVar.g) && jl40.l(this.h, agrVar.h) && jl40.l(this.i, agrVar.i) && jl40.l(this.j, agrVar.j) && jl40.l(this.k, agrVar.k) && this.l == agrVar.l && this.m == agrVar.m;
        }
        return false;
    }

    public final int hashCode() {
        int a = unr0.a(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Map map = this.e;
        int hashCode = (a + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f;
        int d = unr0.d(unr0.d((hashCode + (map2 == null ? 0 : map2.hashCode())) * 31, 31, this.g), 31, this.h);
        Map map3 = this.i;
        int hashCode2 = (d + (map3 == null ? 0 : map3.hashCode())) * 31;
        List list = this.j;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.k;
        return this.m.hashCode() + ((this.l.hashCode() + ((hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "FTRequestAction(method=" + this.a + ", baseURL=" + this.b + ", path=" + this.c + ", timeout=" + this.d + ", headers=" + this.e + ", queryItems=" + this.f + ", requestMap=" + this.g + ", responseMap=" + this.h + ", failedResponseMap=" + this.i + ", statusCodeVarPath=" + this.j + ", errorVarPath=" + this.k + ", onSuccess=" + this.l + ", onFailure=" + this.m + Extension.C_BRAKE;
    }
}
