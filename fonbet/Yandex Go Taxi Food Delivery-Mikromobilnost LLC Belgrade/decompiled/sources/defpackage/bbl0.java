package defpackage;

import androidx.media3.exoplayer.offline.DownloadService;
import com.yandex.go.analytics.AccountType;
import com.yandex.go.zone.model.Zone;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class bbl0 {
    public static final List r = scc.g(new Pair("userId", new abl0(0)), new Pair("zone", new abl0(15)), new Pair("routeInfo", new abl0(16)), new Pair(DownloadService.KEY_REQUIREMENTS, new abl0(1)), new Pair("tariffRequirements", new abl0(2)), new Pair("promoCode", new abl0(3)), new Pair("preorder", new abl0(4)), new Pair("payment", new abl0(5)), new Pair("multiclassVerticals", new abl0(6)), new Pair("multiclassHasConflitctedRequirements", new abl0(7)), new Pair("tollRoad", new abl0(8)), new Pair("contextData", new abl0(9)), new Pair("deliveryRouteStatsInfo", new abl0(10)), new Pair("zoneMode", new abl0(11)), new Pair("lastUploadUserPhotoTimeStamp", new abl0(12)), new Pair("accountType", new abl0(13)), new Pair("driveRefreshTimestamp", new abl0(14)));
    public final String a;
    public final Zone b;
    public final w3l0 c;
    public final List d;
    public final List e;
    public final String f;
    public final gqe0 g;
    public final cia0 h;
    public final List i;
    public final boolean j;
    public final Boolean k;
    public final oje l;
    public final jni m;
    public final String n;
    public final long o;
    public final AccountType p;
    public final long q;

    public bbl0(String str, Zone zone, w3l0 w3l0Var, List list, List list2, String str2, gqe0 gqe0Var, cia0 cia0Var, List list3, boolean z, Boolean bool, oje ojeVar, jni jniVar, String str3, long j, AccountType accountType, long j2) {
        this.a = str;
        this.b = zone;
        this.c = w3l0Var;
        this.d = list;
        this.e = list2;
        this.f = str2;
        this.g = gqe0Var;
        this.h = cia0Var;
        this.i = list3;
        this.j = z;
        this.k = bool;
        this.l = ojeVar;
        this.m = jniVar;
        this.n = str3;
        this.o = j;
        this.p = accountType;
        this.q = j2;
    }

    public static bbl0 a(bbl0 bbl0Var, gqe0 gqe0Var, boolean z, Boolean bool, int i) {
        String str = bbl0Var.a;
        Zone zone = bbl0Var.b;
        w3l0 w3l0Var = bbl0Var.c;
        List list = bbl0Var.d;
        List list2 = bbl0Var.e;
        String str2 = bbl0Var.f;
        gqe0 gqe0Var2 = (i & 64) != 0 ? bbl0Var.g : gqe0Var;
        cia0 cia0Var = bbl0Var.h;
        gqe0 gqe0Var3 = gqe0Var2;
        List list3 = bbl0Var.i;
        boolean z2 = (i & 512) != 0 ? bbl0Var.j : z;
        Boolean bool2 = (i & 1024) != 0 ? bbl0Var.k : bool;
        oje ojeVar = bbl0Var.l;
        jni jniVar = bbl0Var.m;
        String str3 = bbl0Var.n;
        Boolean bool3 = bool2;
        long j = bbl0Var.o;
        AccountType accountType = bbl0Var.p;
        long j2 = bbl0Var.q;
        bbl0Var.getClass();
        return new bbl0(str, zone, w3l0Var, list, list2, str2, gqe0Var3, cia0Var, list3, z2, bool3, ojeVar, jniVar, str3, j, accountType, j2);
    }

    public final ListBuilder b(bbl0 bbl0Var) {
        ListBuilder a = rcc.a();
        for (Pair pair : r) {
            String str = (String) pair.getFirst();
            tls tlsVar = (tls) pair.getSecond();
            Object invoke = tlsVar.invoke(this);
            Object invoke2 = tlsVar.invoke(bbl0Var);
            if (!jl40.l(invoke, invoke2)) {
                a.add(new wij(str, invoke, invoke2));
            }
        }
        return a.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbl0)) {
            return false;
        }
        bbl0 bbl0Var = (bbl0) obj;
        return jl40.l(this.a, bbl0Var.a) && jl40.l(this.b, bbl0Var.b) && jl40.l(this.c, bbl0Var.c) && jl40.l(this.d, bbl0Var.d) && jl40.l(this.e, bbl0Var.e) && jl40.l(this.f, bbl0Var.f) && jl40.l(this.g, bbl0Var.g) && jl40.l(this.h, bbl0Var.h) && jl40.l(this.i, bbl0Var.i) && this.j == bbl0Var.j && jl40.l(this.k, bbl0Var.k) && jl40.l(this.l, bbl0Var.l) && jl40.l(this.m, bbl0Var.m) && jl40.l(this.n, bbl0Var.n) && this.o == bbl0Var.o && this.p == bbl0Var.p && this.q == bbl0Var.q;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int e = unr0.e(unr0.c((this.h.hashCode() + ((this.g.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.i), 31, this.j);
        Boolean bool = this.k;
        int hashCode = (this.m.hashCode() + qv10.c((e + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.l.a)) * 31;
        String str2 = this.n;
        return Long.hashCode(this.q) + ((this.p.hashCode() + qv10.c((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.o)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteStatsData(userId=");
        sb.append(this.a);
        sb.append(", zone=");
        sb.append(this.b);
        sb.append(", routeInfo=");
        sb.append(this.c);
        sb.append(", requirements=");
        sb.append(this.d);
        sb.append(", tariffRequirements=");
        oyr.D(", promoCode=", this.f, ", preorder=", sb, this.e);
        sb.append(this.g);
        sb.append(", payment=");
        sb.append(this.h);
        sb.append(", multiclassVerticals=");
        nzs.p(sb, this.i, ", multiclassHasConflitctedRequirements=", this.j, ", tollRoad=");
        sb.append(this.k);
        sb.append(", contextData=");
        sb.append(this.l);
        sb.append(", deliveryRouteStatsInfo=");
        sb.append(this.m);
        sb.append(", zoneMode=");
        sb.append(this.n);
        sb.append(", lastUploadUserPhotoTimeStamp=");
        sb.append(this.o);
        sb.append(", accountType=");
        sb.append(this.p);
        return g8e.l(this.q, ", driveRefreshTimestamp=", Extension.C_BRAKE, sb);
    }
}
