package defpackage;

import com.yandex.fintechsdk.core.network.api.request.RestMethod;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class j6p implements ig5 {
    public static final h6p Companion = new h6p();
    public static final i3y[] o;
    public final String a;
    public final a6o b;
    public final List c;
    public final Map d;
    public final vm50 e;
    public final Map f;
    public final RestMethod g;
    public final String h;
    public final Map i;
    public final Map j;
    public final Map k;
    public final List l;
    public final vm50 m;
    public final double n;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        o = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new d6p(1)), a.b(lazyThreadSafetyMode, new d6p(3)), a.b(lazyThreadSafetyMode, new d6p(5)), a.b(lazyThreadSafetyMode, new d6p(7)), a.b(lazyThreadSafetyMode, new d6p(9)), null, a.b(lazyThreadSafetyMode, new d6p(11)), a.b(lazyThreadSafetyMode, new d6p(13)), a.b(lazyThreadSafetyMode, new d6p(15)), a.b(lazyThreadSafetyMode, new d6p(17)), a.b(lazyThreadSafetyMode, new d6p(19)), null};
    }

    public /* synthetic */ j6p(int i, String str, a6o a6oVar, List list, Map map, vm50 vm50Var, Map map2, RestMethod restMethod, String str2, Map map3, Map map4, Map map5, List list2, vm50 vm50Var2, double d) {
        if (16383 != (i & 16383)) {
            qje.Z(i, 16383, f6p.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = a6oVar;
        this.c = list;
        this.d = map;
        this.e = vm50Var;
        this.f = map2;
        this.g = restMethod;
        this.h = str2;
        this.i = map3;
        this.j = map4;
        this.k = map5;
        this.l = list2;
        this.m = vm50Var2;
        this.n = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6p)) {
            return false;
        }
        j6p j6pVar = (j6p) obj;
        return jl40.l(this.a, j6pVar.a) && jl40.l(this.b, j6pVar.b) && jl40.l(this.c, j6pVar.c) && jl40.l(this.d, j6pVar.d) && jl40.l(this.e, j6pVar.e) && jl40.l(this.f, j6pVar.f) && this.g == j6pVar.g && jl40.l(this.h, j6pVar.h) && jl40.l(this.i, j6pVar.i) && jl40.l(this.j, j6pVar.j) && jl40.l(this.k, j6pVar.k) && jl40.l(this.l, j6pVar.l) && jl40.l(this.m, j6pVar.m) && Double.compare(this.n, j6pVar.n) == 0;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a6o a6oVar = this.b;
        int hashCode2 = (hashCode + (a6oVar == null ? 0 : a6oVar.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.d;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        vm50 vm50Var = this.e;
        int hashCode5 = (hashCode4 + (vm50Var == null ? 0 : vm50Var.hashCode())) * 31;
        Map map2 = this.f;
        int b = unr0.b((this.g.hashCode() + ((hashCode5 + (map2 == null ? 0 : map2.hashCode())) * 31)) * 31, 31, this.h);
        Map map3 = this.i;
        int d = unr0.d(unr0.d((b + (map3 == null ? 0 : map3.hashCode())) * 31, 31, this.j), 31, this.k);
        List list2 = this.l;
        int hashCode6 = (d + (list2 == null ? 0 : list2.hashCode())) * 31;
        vm50 vm50Var2 = this.m;
        return Double.hashCode(this.n) + ((hashCode6 + (vm50Var2 != null ? vm50Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FTRequestAction(baseUrl=" + this.a + ", errorBodyLoggingRule=" + this.b + ", errorVarPath=" + this.c + ", failedResponseMap=" + this.d + ", failureAction=" + this.e + ", headers=" + this.f + ", method=" + this.g + ", path=" + this.h + ", queryItems=" + this.i + ", requestMap=" + this.j + ", responseMap=" + this.k + ", statusCodeVarPath=" + this.l + ", successAction=" + this.m + ", timeout=" + this.n + Extension.C_BRAKE;
    }
}
