package defpackage;

import android.net.Uri;
import androidx.compose.ui.semantics.f;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final /* synthetic */ class lo1 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ lo1(String str, boolean z, int i) {
        this.a = i;
        this.c = str;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d9  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ye0 pb50Var;
        ye0 ye0Var;
        String str = "";
        int i = 11;
        int i2 = 10;
        int i3 = 1;
        switch (this.a) {
            case 0:
                String str2 = this.c;
                boolean z = this.b;
                mnq0 mnq0Var = (mnq0) obj;
                f.l(mnq0Var, str2);
                f.p(mnq0Var, 0);
                if (!z) {
                    f.a(mnq0Var);
                }
                return zy11.a;
            case 1:
                boolean z2 = this.b;
                String str3 = this.c;
                mo11 mo11Var = (mo11) obj;
                oo11 oo11Var = mo11Var.b;
                oo11Var.A((m950) oo11Var.G.get(), new bjd0(str3, z2), new lo11(oo11Var, mo11Var.a));
                return zy11.a;
            case 2:
                String str4 = this.c;
                boolean z3 = this.b;
                mnq0 mnq0Var2 = (mnq0) obj;
                f.l(mnq0Var2, str4);
                if (z3) {
                    f.d(mnq0Var2);
                }
                return zy11.a;
            case 3:
                String str5 = this.c;
                boolean z4 = this.b;
                oll0 oll0Var = (oll0) obj;
                ull0 T0 = oll0Var.T0("INSERT OR REPLACE INTO chat_preferences VALUES (?, 0, ?)");
                try {
                    T0.g1(1, str5);
                    T0.b(2, z4 ? 1L : 0L);
                    T0.q();
                    long t = jx81.t(oll0Var);
                    T0.close();
                    return Long.valueOf(t);
                } catch (Throwable th) {
                    T0.close();
                    throw th;
                }
            case 4:
                String str6 = this.c;
                boolean z5 = this.b;
                yn5 yn5Var = ((abi) obj).a;
                yn5Var.r(new qu(9));
                ((tbb) yn5Var.F).invoke(str6, Boolean.valueOf(z5));
                return zy11.a;
            case 5:
                String str7 = this.c;
                boolean z6 = this.b;
                mnq0 mnq0Var3 = (mnq0) obj;
                if (str7 != null) {
                    f.l(mnq0Var3, str7);
                }
                f.p(mnq0Var3, 1);
                if (!z6) {
                    f.a(mnq0Var3);
                }
                return zy11.a;
            case 6:
                String str8 = this.c;
                boolean z7 = this.b;
                mnq0 mnq0Var4 = (mnq0) obj;
                if (str8 != null) {
                    f.l(mnq0Var4, str8);
                }
                f.p(mnq0Var4, 3);
                if (!z7) {
                    f.a(mnq0Var4);
                }
                return zy11.a;
            case 7:
                String str9 = this.c;
                boolean z8 = this.b;
                mnq0 mnq0Var5 = (mnq0) obj;
                if (str9 != null) {
                    f.l(mnq0Var5, str9);
                }
                f.p(mnq0Var5, 1);
                if (!z8) {
                    f.a(mnq0Var5);
                }
                return zy11.a;
            case 8:
                boolean z9 = this.b;
                String str10 = this.c;
                TaxiOrder taxiOrder = (TaxiOrder) obj;
                Set N0 = a.N0(taxiOrder.l.getW().getB());
                taxiOrder.R(a.J0(z9 ? v4r0.i(N0, str10) : v4r0.f(N0, str10)));
                return zy11.a;
            case 9:
                boolean z10 = this.b;
                String str11 = this.c;
                mnq0 mnq0Var6 = (mnq0) obj;
                if (!z10 && str11 != null) {
                    f.t(mnq0Var6, new kk2(str11));
                }
                return zy11.a;
            case 10:
                String str12 = this.c;
                boolean z11 = this.b;
                com.yandex.go.taxi.summary.mobilityhub.router.a aVar = ((rw20) obj).a;
                aVar.j(dpb.a);
                m950 m950Var = (m950) aVar.L.get();
                int i4 = rd50.i;
                Uri parse = Uri.parse(str12);
                String queryParameter = parse.getQueryParameter("dst_lat");
                if (queryParameter == null) {
                    queryParameter = "";
                }
                String queryParameter2 = parse.getQueryParameter("dst_lon");
                if (queryParameter2 == null) {
                    queryParameter2 = "";
                }
                zzs.Companion.getClass();
                zzs c = uzs.c(queryParameter, queryParameter2, null);
                String queryParameter3 = parse.getQueryParameter("utm");
                String str13 = queryParameter3 == null ? "" : queryParameter3;
                String queryParameter4 = parse.getQueryParameter("entry_point");
                if (jl40.l(queryParameter4, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY)) {
                    ye0Var = nb50.b;
                } else if (jl40.l(queryParameter4, "cartech")) {
                    ye0Var = lb50.b;
                } else if (jl40.l(queryParameter4, "mobility_hub")) {
                    ye0Var = ob50.b;
                } else {
                    if (queryParameter4 != null) {
                        pb50Var = new pb50(queryParameter4);
                        String queryParameter5 = parse.getQueryParameter("payload");
                        aVar.E(m950Var, new rd50(c, pb50Var, str13, parse.getBooleanQueryParameter("start_route_on_redirect", false), parse.getBooleanQueryParameter("propose_finish_on_exit", false), queryParameter5 != null ? "" : queryParameter5, parse.getQueryParameter("route_stops")), new qw20(aVar, z11), hxx.a);
                        return zy11.a;
                    }
                    ye0Var = mb50.b;
                }
                pb50Var = ye0Var;
                String queryParameter52 = parse.getQueryParameter("payload");
                if (queryParameter52 != null) {
                }
                aVar.E(m950Var, new rd50(c, pb50Var, str13, parse.getBooleanQueryParameter("start_route_on_redirect", false), parse.getBooleanQueryParameter("propose_finish_on_exit", false), queryParameter52 != null ? "" : queryParameter52, parse.getQueryParameter("route_stops")), new qw20(aVar, z11), hxx.a);
                return zy11.a;
            case 11:
                String str14 = this.c;
                boolean z12 = this.b;
                com.yandex.go.taxi.summary.mobilityhub.router.a aVar2 = ((rw20) obj).a;
                d0l0 c2 = aVar2.F.c();
                aVar2.j(dpb.a);
                aVar2.E((m950) aVar2.D.get(), new jvn0(new pxm0("summary", "hub"), Uri.parse(str14), true), new n75(aVar2, c2, z12, i3), hxx.a);
                return zy11.a;
            case 12:
                boolean z13 = this.b;
                String str15 = this.c;
                mo11 mo11Var2 = (mo11) obj;
                oo11 oo11Var2 = mo11Var2.b;
                oo11Var2.A((m950) oo11Var2.G.get(), new bjd0(str15, z13), new lo11(oo11Var2, mo11Var2.a));
                return zy11.a;
            case 13:
                boolean z14 = this.b;
                String str16 = this.c;
                xus xusVar = ((mrd0) obj).a;
                xusVar.A((m950) ((yvf0) xusVar.E).get(), new bjd0(str16, z14), new lrd0(xusVar));
                return zy11.a;
            case 14:
                String str17 = this.c;
                boolean z15 = this.b;
                v7r0 v7r0Var = (v7r0) obj;
                List<j59> list = v7r0Var.c;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (j59 j59Var : list) {
                    List<o8r0> list2 = j59Var.c;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                    for (o8r0 o8r0Var : list2) {
                        if (jl40.l(o8r0Var.a, str17)) {
                            o8r0Var = o8r0.a(o8r0Var, null, false, z15, null, 4031);
                        }
                        arrayList2.add(o8r0Var);
                    }
                    arrayList.add(new j59(j59Var.a, j59Var.b, arrayList2));
                }
                return new v7r0(v7r0Var.a, v7r0Var.b, arrayList);
            case 15:
                boolean z16 = this.b;
                String str18 = this.c;
                mnq0 mnq0Var7 = (mnq0) obj;
                if (!z16 ? str18 != null : str18 != null) {
                    str = str18;
                }
                f.l(mnq0Var7, str);
                return zy11.a;
            case 16:
                ((vw20) obj).a.r(new lo1(this.c, this.b, i));
                return zy11.a;
            case 17:
                ((vw20) obj).a.r(new lo1(this.c, this.b, i));
                return zy11.a;
            default:
                ((vw20) obj).a.r(new lo1(this.c, this.b, i2));
                return zy11.a;
        }
    }

    public /* synthetic */ lo1(boolean z, String str, int i) {
        this.a = i;
        this.b = z;
        this.c = str;
    }
}
