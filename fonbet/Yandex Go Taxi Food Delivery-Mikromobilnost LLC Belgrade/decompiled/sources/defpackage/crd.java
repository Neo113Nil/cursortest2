package defpackage;

import com.yandex.go.payments.api.composite.CompositePaymentState;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import java.util.Iterator;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes6.dex */
public final class crd {
    public final drd a;
    public final xdf b;

    public crd(drd drdVar, xdf xdfVar) {
        this.a = drdVar;
        this.b = xdfVar;
    }

    public final void a(mi31 mi31Var) {
        Object obj;
        String str;
        String str2;
        if (mi31Var == null) {
            return;
        }
        pex0 pex0Var = mi31Var.a;
        Iterator it = pex0Var.S.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ServiceLevel.Branding) obj).c == ServiceLevel.Branding.Type.COMPLEMENT_PAYMENT) {
                    break;
                }
            }
        }
        ServiceLevel.Branding branding = (ServiceLevel.Branding) obj;
        drd drdVar = this.a;
        xxc g = drdVar.g();
        nrd nrdVar = drdVar.b;
        if (g == null || g.a()) {
            drdVar.h();
            return;
        }
        boolean z = false;
        if (branding != null) {
            str2 = branding.e;
            str = this.b.a(pex0Var.c(), branding.f, false, false);
            if (branding.j.b == ServiceLevel.Branding.Extra.CostCoverage.FULL) {
                z = true;
            }
        } else {
            str = "";
            str2 = str;
        }
        boolean z2 = z;
        CompositePaymentState a = nrdVar.a(((mrd) nrdVar.b.getValue()).a);
        if (a == CompositePaymentState.DISABLED) {
            a = CompositePaymentState.ENABLED_UNCHECKED;
        }
        CompositePaymentState compositePaymentState = a;
        String str3 = str2;
        String str4 = str3 == null ? "" : str3;
        String str5 = str == null ? "" : str;
        kv90 kv90Var = lv90.Companion;
        wxc wxcVar = g.a;
        PaymentMethod$Type paymentMethod$Type = wxcVar.b;
        String str6 = wxcVar.a;
        kv90Var.getClass();
        nrdVar.b.l(new mrd(compositePaymentState, str4, str5, kv90.b(str6, paymentMethod$Type), z2));
    }
}
