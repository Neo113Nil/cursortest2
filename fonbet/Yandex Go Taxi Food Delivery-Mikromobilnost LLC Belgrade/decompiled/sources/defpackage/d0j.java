package defpackage;

import com.yandex.go.analytics.IncompleteInfoOrderAlertAnalytics$StateV2;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.HashMap;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes6.dex */
public final class d0j extends v96 {
    public final wiq0 a;
    public final a40 b;
    public final set0 c;
    public final yj70 d;
    public final b0j e;
    public final gsi f;

    public d0j(wiq0 wiq0Var, a40 a40Var, set0 set0Var, yj70 yj70Var, b0j b0jVar, gsi gsiVar) {
        this.a = wiq0Var;
        this.b = a40Var;
        this.c = set0Var;
        this.d = yj70Var;
        this.e = b0jVar;
        this.f = gsiVar;
    }

    @Override // defpackage.v96
    public final boolean b() {
        if (!this.e.a()) {
            return false;
        }
        pex0 m = ((k) this.a).m();
        boolean z = (m != null && this.f.g(m.b) && m.u0 == TariffOrderFlow.DELIVERY_FLOW) ? false : true;
        if (m != null && z) {
            String str = m.b;
            b1 b1Var = (b1) this.d.a;
            IncompleteInfoOrderAlertAnalytics$StateV2 incompleteInfoOrderAlertAnalytics$StateV2 = IncompleteInfoOrderAlertAnalytics$StateV2.DestinationAddress;
            b1Var.getClass();
            HashMap hashMap = new HashMap();
            if (incompleteInfoOrderAlertAnalytics$StateV2 != null) {
                hashMap.put(ClidProvider.STATE, incompleteInfoOrderAlertAnalytics$StateV2.getEventValue());
            }
            if (str != null) {
                hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
            }
            b1Var.a.a("IncompleteInfoOrderAlert.Shown", hashMap, 2, new HashMap());
        }
        if (!z) {
            this.c.b(SourcePicker.B_FROM_SUMMARY, ModalViewOrigin.SUMMARY, false);
            return true;
        }
        uxh uxhVar = new uxh(12, this);
        a40 a40Var = this.b;
        a40Var.getClass();
        new AlertDialog(a40Var.a).setMessage(kyh0.summary_error_destination_required).setCancelable(true).setCancelableOnTouchOutside(true).setPositiveButton(kyh0.common_ok).setDismissListener(uxhVar).show();
        return true;
    }
}
