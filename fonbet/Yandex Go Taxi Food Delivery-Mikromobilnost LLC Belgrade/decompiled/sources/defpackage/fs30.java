package defpackage;

import android.net.Uri;
import com.yandex.go.analytics.realtime.a;
import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.b;
import ru.yandex.taxi.masstransit.analytic.MtSummaryPromotionsAnalytics$SummaryState;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.domain.y;

/* loaded from: classes6.dex */
public final /* synthetic */ class fs30 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;
    public final /* synthetic */ g540 c;

    public /* synthetic */ fs30(y yVar, g540 g540Var, int i) {
        this.a = i;
        this.b = yVar;
        this.c = g540Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        is60 is60Var;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        g540 g540Var = this.c;
        y yVar = this.b;
        switch (i) {
            case 0:
                k540 k540Var = yVar.e;
                MtSummaryPromotionsAnalytics$SummaryState mtSummaryPromotionsAnalytics$SummaryState = MtSummaryPromotionsAnalytics$SummaryState.COLLAPSED;
                h540 h540Var = k540Var.a;
                b040 b040Var = h540Var.c;
                String str = g540Var.a;
                if (!b040Var.b.contains(str)) {
                    h540Var.a.h(g540Var.b, null, g540Var.a, mtSummaryPromotionsAnalytics$SummaryState.name().toLowerCase(Locale.ROOT), null);
                }
                yVar.g.a(str);
                break;
            case 1:
                h540 h540Var2 = yVar.e.a;
                ArrayList arrayList = h540Var2.d;
                String str2 = g540Var.a;
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                    dei0 dei0Var = h540Var2.b;
                    CreativeType creativeType = CreativeType.PromoOnSummary;
                    String str3 = g540Var.a;
                    Map map = g540Var.g;
                    if (map == null) {
                        map = b.f();
                    }
                    ((a) dei0Var).d(new iei0(creativeType, str3, map, null, 18));
                }
                yVar.g.a(str2);
                break;
            default:
                k540 k540Var2 = yVar.e;
                MtSummaryPromotionsAnalytics$SummaryState mtSummaryPromotionsAnalytics$SummaryState2 = MtSummaryPromotionsAnalytics$SummaryState.COLLAPSED;
                h540 h540Var3 = k540Var2.a;
                pex0 m = ((k) k540Var2.b).m();
                h540Var3.a.i(g540Var.b, (m == null || (is60Var = m.J0.b) == null) ? null : is60Var.a(), g540Var.a, mtSummaryPromotionsAnalytics$SummaryState2.name().toLowerCase(Locale.ROOT), null);
                dei0 dei0Var2 = h540Var3.b;
                CreativeType creativeType2 = CreativeType.PromoOnSummary;
                String str4 = g540Var.a;
                Map map2 = g540Var.g;
                if (map2 == null) {
                    map2 = b.f();
                }
                ((a) dei0Var2).d(new iei0(creativeType2, str4, map2, null, null, 50));
                x051 x051Var = g540Var.f;
                if (!(x051Var instanceof q051)) {
                    if (!(x051Var instanceof w051) && !x051Var.equals(t051.a)) {
                        w511.b();
                        break;
                    } else {
                        g8e.A(jst.e, "Can't handle promotion");
                        break;
                    }
                } else {
                    String str5 = ((q051) x051Var).a.c;
                    Uri parse = Uri.parse(str5);
                    String authority = parse != null ? parse.getAuthority() : null;
                    if (str5.length() > 0) {
                        b040 b040Var2 = k540Var2.f;
                        String str6 = g540Var.a;
                        HashSet hashSet = b040Var2.c;
                        if (!hashSet.contains(str6)) {
                            hashSet.add(str6);
                            j540 j540Var = b040Var2.a;
                            j540Var.getClass();
                            HashMap hashMap = new HashMap(j540Var.a());
                            Object obj = hashMap.get(str6);
                            if (obj == null) {
                                obj = new a040(0);
                                hashMap.put(str6, obj);
                            }
                            a040 a040Var = (a040) obj;
                            a040Var.b++;
                            hashMap.put(str6, a040Var);
                            j540Var.b.setValue(j540Var, j540.c[0], ((xnt) j540Var.a).e(hashMap, j540.d));
                            b040Var2.d.g(zy11Var);
                        }
                        Uri build = parse.buildUpon().appendQueryParameter("origin", TransportRouteAnalytics$FlowOrigin.Promo.getEventValue()).build();
                        if (!"masstransit".equalsIgnoreCase(authority)) {
                            ((a60) ((y50) k540Var2.e.get())).c(build.toString(), v770.b);
                            break;
                        } else {
                            ((x111) k540Var2.d.get()).a();
                            cz00 cz00Var = (cz00) k540Var2.c.get();
                            build.toString();
                            cz00Var.a.a(new vm30(0), null);
                            break;
                        }
                    }
                }
                break;
        }
        return zy11Var;
    }
}
