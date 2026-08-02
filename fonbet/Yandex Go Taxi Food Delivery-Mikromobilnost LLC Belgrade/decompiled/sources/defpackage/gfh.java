package defpackage;

import defpackage.ylw;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes6.dex */
public final class gfh implements xi70 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gfh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xi70
    public final Object a(vi70 vi70Var, Continuation continuation) {
        lo40 lo40Var;
        boolean z;
        wi70 wi70Var;
        igi igiVar;
        psi psiVar;
        yi70 yi70Var;
        ylw.d dVar;
        int i = this.a;
        Object obj = this.b;
        wi70 wi70Var2 = null;
        switch (i) {
            case 0:
                mi31 mi31Var = vi70Var.a;
                pex0 pex0Var = mi31Var.a;
                String str = mi31Var.b;
                if (!pex0Var.K0 || !jl40.l(pex0Var.b, "multiclass") || !vi70Var.d || !(z = (lo40Var = ((mo40) obj).a).a)) {
                    return null;
                }
                String str2 = (z && jl40.l(lo40Var.b, str)) ? lo40Var.c : null;
                if (str2 == null) {
                    return null;
                }
                return hay.g(str2, null, vi70Var.b, false, 26);
            case 1:
                mi31 mi31Var2 = vi70Var.a;
                bj70 bj70Var = vi70Var.b;
                pex0 pex0Var2 = mi31Var2.a;
                ati atiVar = pex0Var2.Z;
                TariffSource tariffSource = pex0Var2.a;
                String str3 = (atiVar == null || (igiVar = atiVar.k) == null || (psiVar = igiVar.c) == null || (yi70Var = psiVar.a) == null) ? null : yi70Var.a;
                if (str3 != null) {
                    wi70Var = hay.g(str3, null, bj70Var, tariffSource == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 10);
                } else {
                    wi70Var = null;
                }
                if (wi70Var != null) {
                    return wi70Var;
                }
                String str4 = pex0Var2.b;
                gsi gsiVar = ((pai) obj).a;
                String str5 = gsiVar.g(str4) ? gsiVar.b().o : "";
                if (str5 == null || str5.length() == 0) {
                    str5 = null;
                }
                if (str5 != null) {
                    return hay.g(str5, null, bj70Var, tariffSource == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 10);
                }
                return null;
            default:
                e9w e9wVar = (e9w) ((d9w) obj);
                if (e9wVar.b() == null) {
                    String str6 = vi70Var.a.f;
                    ylw ylwVar = (ylw) e9wVar.b.b();
                    ylw.c a = e9wVar.a(ylwVar, str6);
                    ag1 ag1Var = (a == null || (dVar = a.a) == null) ? null : new ag1(d6z.Y(ylwVar, dVar.a), 5);
                    if (ag1Var != null) {
                        String str7 = ag1Var.b;
                        wi70Var2 = new wi70(58, str7, str7, vi70Var.a.a.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS);
                    }
                }
                return wi70Var2;
        }
    }

    @Override // defpackage.xi70
    public final String b() {
        switch (this.a) {
            case 0:
                return "DefaultMulticlassOrderButtonInteractor";
            case 1:
                return "DeliveryOrderButtonInteractor";
            default:
                return "IntercityContactOrderButtonInteractor";
        }
    }
}
