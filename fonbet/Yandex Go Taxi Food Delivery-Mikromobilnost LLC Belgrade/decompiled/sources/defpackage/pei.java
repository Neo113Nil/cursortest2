package defpackage;

import ru.yandex.taxi.tariffs.model.DeliveryFlowType;

/* loaded from: classes6.dex */
public final class pei {
    public final b8r a;

    public pei(b8r b8rVar) {
        this.a = b8rVar;
    }

    public final boolean a(pex0 pex0Var) {
        ati atiVar;
        ati atiVar2;
        DeliveryFlowType deliveryFlowType = null;
        if (((pex0Var == null || (atiVar2 = pex0Var.Z) == null) ? null : atiVar2.f) == DeliveryFlowType.NDD_FORM_V1) {
            return true;
        }
        if (pex0Var != null && (atiVar = pex0Var.Z) != null) {
            deliveryFlowType = atiVar.f;
        }
        return deliveryFlowType == DeliveryFlowType.NDD_FORM_V2;
    }
}
