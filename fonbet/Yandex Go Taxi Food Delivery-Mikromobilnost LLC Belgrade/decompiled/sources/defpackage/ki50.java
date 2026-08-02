package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes6.dex */
public final class ki50 implements xi70 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ki50(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r4 == null) goto L23;
     */
    @Override // defpackage.xi70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(vi70 vi70Var, Continuation continuation) {
        String str;
        switch (this.a) {
            case 0:
                if (!((pei) this.c).a(vi70Var.a.a)) {
                    return null;
                }
                pex0 pex0Var = vi70Var.a.a;
                if (pex0Var.H != null) {
                    str = pex0Var.D;
                    if (str == null || str.length() == 0) {
                        str = null;
                        break;
                    }
                }
                pai paiVar = (pai) this.b;
                String str2 = pex0Var.b;
                gsi gsiVar = paiVar.a;
                str = gsiVar.g(str2) ? gsiVar.b().o : "";
                if (str == null || str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    return hay.g(str, null, vi70Var.b, pex0Var.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 10);
                }
                return null;
            default:
                pex0 pex0Var2 = vi70Var.a.a;
                bj70 bj70Var = vi70Var.b;
                if (((dqe0) this.c).a.T == null) {
                    return null;
                }
                return hay.g(((avj0) ((zuj0) this.b)).h(kyh0.summary_due_title), null, bj70Var, pex0Var2.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 10);
        }
    }

    @Override // defpackage.xi70
    public final String b() {
        switch (this.a) {
            case 0:
                return "NddOrderButtonInteractor";
            default:
                return "TransferOrderButtonInteractor";
        }
    }
}
