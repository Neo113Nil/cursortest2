package defpackage;

import com.yandex.go.multitariff.OrderButton;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.requirements.glued.interactor.d;
import ru.yandex.taxi.requirements.models.net.experiment.c;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes6.dex */
public final class ipj0 implements xi70 {
    public final d a;
    public final kdd0 b;
    public final h0w c;

    public ipj0(d dVar, kdd0 kdd0Var, h0w h0wVar) {
        this.a = dVar;
        this.b = kdd0Var;
        this.c = h0wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0288  */
    @Override // defpackage.xi70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(vi70 vi70Var, Continuation continuation) {
        wi70 wi70Var;
        wi70 g;
        String str;
        String str2;
        hpj0 hpj0Var;
        cwi0 cwi0Var;
        String str3;
        hpj0 hpj0Var2;
        mpj0 mpj0Var;
        Object obj;
        List list;
        Map map;
        jn40 jn40Var;
        en40 en40Var;
        OrderButton orderButton;
        String str4;
        String g2;
        jmw0 a = this.a.a(vi70Var.a.a.f());
        if (a != null && (g2 = a.g()) != null) {
            if (g2.length() == 0) {
                g2 = null;
            }
            if (g2 != null) {
                boolean z = vi70Var.a.a.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS;
                if (a instanceof gmw0) {
                    wi70Var = hay.g(g2, "", vi70Var.b, z, 8);
                } else {
                    if (!(a instanceof hmw0)) {
                        w511.b();
                        return null;
                    }
                    wi70Var = vi70.a(vi70Var, g2, z);
                }
                if (wi70Var == null) {
                    jn40 jn40Var2 = vi70Var.a.a.V;
                    if (jn40Var2 == null || (en40Var = jn40Var2.b) == null || (str4 = (orderButton = en40Var.d).b) == null || str4.length() == 0 || orderButton.a) {
                        wi70Var = null;
                    } else {
                        wi70Var = vi70.a(vi70Var, orderButton.b, vi70Var.a.a.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS);
                    }
                    if (wi70Var == null) {
                        h0w h0wVar = this.c;
                        lcj0 lcj0Var = (lcj0) h0wVar.b;
                        if (((ro0) h0wVar.c).a()) {
                            wmj0 b = lcj0Var.b();
                            String str5 = (String) b.c.get(b.d.a.a);
                            if (str5 != null && !evu0.J(str5)) {
                                wmj0 b2 = lcj0Var.b();
                                String str6 = (String) b2.c.get(b2.d.b.a);
                                pex0 pex0Var = vi70Var.a.a;
                                String e = pex0Var.e();
                                TariffSource tariffSource = pex0Var.a;
                                String str7 = e != null ? e : "";
                                if (vi70Var.c) {
                                    String str8 = (str6 == null || evu0.J(str6)) ? str5 : str6;
                                    wmj0 b3 = lcj0Var.b();
                                    String str9 = (String) b3.c.get(b3.d.b.b);
                                    String str10 = str9 == null ? str7 : str9;
                                    bj70 bj70Var = vi70Var.b;
                                    boolean z2 = tariffSource == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS;
                                    if (str10.length() == 0) {
                                        str = str8;
                                    } else {
                                        str = ((Object) str8) + Extension.FIX_SPACE + ((Object) str10);
                                    }
                                    g = new wi70(str8, str10, str, bj70Var, false, true, z2);
                                } else {
                                    g = hay.g(str5, str7, vi70Var.b, tariffSource == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 8);
                                }
                                if (g == null) {
                                    return g;
                                }
                                kdd0 kdd0Var = this.b;
                                c b4 = ((hqj0) kdd0Var.c).b();
                                if (b4.b) {
                                    mi31 mi31Var = vi70Var.a;
                                    pex0 pex0Var2 = mi31Var.a;
                                    bdj0 c = ((cjj0) kdd0Var.b).c(pex0Var2, mi31Var.b, ((dqe0) kdd0Var.a).a.x, b4, cdj0.a);
                                    int b5 = ((cjj0) kdd0Var.b).b(c, true);
                                    if (b5 > 0) {
                                        if (pex0Var2.K0 && ((jn40Var = pex0Var2.V) == null || !jn40Var.i)) {
                                            return vi70.a(vi70Var, d6z.Y(b4, b4.i.a), pex0Var2.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS);
                                        }
                                        if (!b4.j.contains(pex0Var2.b) && ((cjj0) kdd0Var.b).b(c, false) == 1) {
                                            if (c.b()) {
                                                str3 = "__preorder__";
                                            } else if (c.a()) {
                                                str3 = "__order_for_other__";
                                            } else {
                                                Pair pair = (Pair) a.R(c.b);
                                                str3 = pair != null ? (String) pair.c() : null;
                                            }
                                            if (str3 != null && (((hpj0Var2 = (hpj0) b4.d.get(pex0Var2.b)) != null && (map = hpj0Var2.a) != null && (mpj0Var = (mpj0) map.get(str3)) != null) || (mpj0Var = (mpj0) ((hpj0) b4.n.getValue()).a.get(str3)) != null)) {
                                                Iterator it = c.a.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        obj = null;
                                                        break;
                                                    }
                                                    obj = it.next();
                                                    if (jl40.l((String) ((Pair) obj).c(), str3)) {
                                                        break;
                                                    }
                                                }
                                                Pair pair2 = (Pair) obj;
                                                int size = (pair2 == null || (list = (List) pair2.f()) == null) ? 0 : list.size();
                                                if (c.b() || c.a() || size <= 0) {
                                                    String str11 = mpj0Var.a;
                                                    if (str11 != null) {
                                                        str2 = d6z.Y(b4, str11);
                                                    }
                                                } else {
                                                    cwi0 cwi0Var2 = mpj0Var.b;
                                                    if (cwi0Var2 != null) {
                                                        str2 = cvu0.v(d6z.Y(b4, ((ewi0) kdd0Var.d).a(cwi0Var2, size)), "$N$", String.valueOf(size), false);
                                                    }
                                                }
                                                if (str2 != null || evu0.J(str2)) {
                                                    hpj0Var = (hpj0) b4.d.get(pex0Var2.b);
                                                    if (hpj0Var != null || (cwi0Var = (cwi0) hpj0Var.e.getValue()) == null || !d6z.S(b4, cwi0Var)) {
                                                        cwi0Var = null;
                                                    }
                                                    if (cwi0Var == null) {
                                                        cwi0Var = (cwi0) ((hpj0) b4.n.getValue()).e.getValue();
                                                    }
                                                    str2 = cvu0.v(d6z.Y(b4, ((ewi0) kdd0Var.d).a(cwi0Var, b5)), "$N$", String.valueOf(b5), false);
                                                }
                                                return hay.g(str2, null, vi70Var.b, pex0Var2.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 10);
                                            }
                                        }
                                        str2 = null;
                                        if (str2 != null) {
                                        }
                                        hpj0Var = (hpj0) b4.d.get(pex0Var2.b);
                                        if (hpj0Var != null) {
                                        }
                                        cwi0Var = null;
                                        if (cwi0Var == null) {
                                        }
                                        str2 = cvu0.v(d6z.Y(b4, ((ewi0) kdd0Var.d).a(cwi0Var, b5)), "$N$", String.valueOf(b5), false);
                                        return hay.g(str2, null, vi70Var.b, pex0Var2.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 10);
                                    }
                                }
                                return null;
                            }
                        }
                        g = null;
                        if (g == null) {
                        }
                    }
                }
                return wi70Var;
            }
        }
        wi70Var = null;
        if (wi70Var == null) {
        }
        return wi70Var;
    }

    @Override // defpackage.xi70
    public final String b() {
        return "RequirementsOrderButtonInteractor";
    }
}
