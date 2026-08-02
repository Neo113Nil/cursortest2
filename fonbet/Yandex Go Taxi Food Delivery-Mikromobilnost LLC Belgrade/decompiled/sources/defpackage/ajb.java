package defpackage;

import com.yandex.go.masstransit.sdk.checkout.api.analytics.CheckoutButtonAction;
import com.yandex.go.masstransit.sdk.checkout.impl.checkout.analytics.a;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes12.dex */
public final class ajb implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ ajb(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        int i = this.a;
        String str2 = null;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                cnb cnbVar = (cnb) obj;
                if (cnbVar instanceof wmb) {
                    wmb wmbVar = (wmb) cnbVar;
                    aVar.g = wmbVar.a;
                    aVar.h = wmbVar.c.b;
                }
                aVar.b(cnbVar.getAnalytics());
                break;
            case 1:
                aVar.b(((plb) obj).getAnalytics());
                break;
            case 2:
                g4a0 g4a0Var = (g4a0) obj;
                if (g4a0Var != null) {
                    String p = g8e.p(g4a0Var.a, ":", g4a0Var.b);
                    if (!jl40.l(aVar.f, p)) {
                        aVar.f = p;
                        pmb pmbVar = aVar.g;
                        if (pmbVar != null) {
                            aVar.a.a(CheckoutButtonAction.PaymentMethod, pmbVar.l, pmbVar.a, aVar.h);
                            break;
                        }
                    }
                } else {
                    aVar.f = null;
                    break;
                }
                break;
            default:
                w310 w310Var = aVar.a;
                String str3 = ((i3a0) obj).a;
                fnb fnbVar = aVar.b;
                Object value = fnbVar.c.getValue();
                wmb wmbVar2 = value instanceof wmb ? (wmb) value : null;
                if (wmbVar2 == null || (str = wmbVar2.a.a) == null) {
                    llc a = fnbVar.a();
                    if (a != null) {
                        str2 = a.a;
                    } else {
                        pmb pmbVar2 = aVar.g;
                        if (pmbVar2 != null) {
                            str2 = pmbVar2.a;
                        }
                    }
                } else {
                    str2 = str;
                }
                n310 n310Var = w310Var.a;
                n310Var.getClass();
                HashMap hashMap = new HashMap();
                if (str2 != null) {
                    hashMap.put("trip_id", str2);
                }
                n310Var.a.a("MasstransitPayment.PaymentMethodsWidget.EventReceived", hashMap, 1, tse0.r(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, hashMap, str3));
                break;
        }
        return zy11Var;
    }
}
