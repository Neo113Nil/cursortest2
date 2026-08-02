package defpackage;

import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentActionButton;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentButtonAction;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentButtonActionType;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentFullscreen;
import com.yandex.go.payments.acceptance.ui.b;
import com.yandex.go.payments.addmethod.domain.g;
import com.yandex.go.summary.interactor.anchored.state.content.a;
import com.yandex.go.summary.interactor.anchored.state.content.l;
import com.yandex.go.summary.interactor.common.state.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final class ie implements yt11 {
    public final /* synthetic */ int a = 0;
    public final tpr b;

    public ie(c cVar, nej0 nej0Var, l lVar, ymu ymuVar, i4u i4uVar, aa1 aa1Var, vev0 vev0Var) {
        int i = 2;
        this.b = new a(new tpr[]{lVar.d, (tpr) i4uVar.a, !(vev0Var.a instanceof p81) ? aa1Var.b : new g92(i, null), cVar.k, nej0Var.e, (tpr) ymuVar.c});
    }

    public static final List b(ie ieVar, AcceptancePaymentFullscreen acceptancePaymentFullscreen) {
        List list;
        if (acceptancePaymentFullscreen == null || (list = acceptancePaymentFullscreen.b) == null) {
            return EmptyList.a;
        }
        List<AcceptancePaymentActionButton> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (AcceptancePaymentActionButton acceptancePaymentActionButton : list2) {
            String str = acceptancePaymentActionButton.a;
            boolean z = acceptancePaymentActionButton.b;
            AcceptancePaymentButtonAction acceptancePaymentButtonAction = acceptancePaymentActionButton.c;
            AcceptancePaymentButtonActionType acceptancePaymentButtonActionType = acceptancePaymentButtonAction != null ? acceptancePaymentButtonAction.a : null;
            int i = acceptancePaymentButtonActionType == null ? -1 : he.a[acceptancePaymentButtonActionType.ordinal()];
            jf jfVar = gf.a;
            if (i != -1) {
                if (i == 1) {
                    jfVar = hf.a;
                } else if (i != 2 && i != 3) {
                    w511.b();
                    return null;
                }
            }
            arrayList.add(new fe(str, z, jfVar));
        }
        return arrayList;
    }

    @Override // defpackage.yt11
    public final tpr a() {
        int i = this.a;
        tpr tprVar = this.b;
        switch (i) {
            case 0:
                return (b) tprVar;
            case 1:
                return (g) tprVar;
            case 2:
                return (a) tprVar;
            case 3:
                return (com.yandex.go.masstransit.sdk.checkout.impl.tariff.bus.b) tprVar;
            case 4:
                return (com.yandex.go.masstransit.sdk.checkout.impl.conditions.b) tprVar;
            case 5:
                return (com.yandex.go.masstransit.sdk.checkout.impl.direction.b) tprVar;
            default:
                return (com.yandex.go.masstransit.sdk.checkout.impl.tariff.train.b) tprVar;
        }
    }

    public ie(wyd wydVar, czd czdVar) {
        this.b = new com.yandex.go.masstransit.sdk.checkout.impl.conditions.b(wydVar.a, this);
    }

    public ie(zlj zljVar, xlj xljVar) {
        this.b = new com.yandex.go.masstransit.sdk.checkout.impl.direction.b(xljVar.b, this);
    }

    public ie(hd01 hd01Var, jd01 jd01Var) {
        this.b = new com.yandex.go.masstransit.sdk.checkout.impl.tariff.train.b(hd01Var.b, this);
    }

    public ie(wi0 wi0Var) {
        this.b = new g(e.d(wi0Var.a));
    }

    public ie(com.yandex.go.payments.acceptance.domain.c cVar) {
        this.b = new b(cVar.o, this);
    }

    public ie(xv6 xv6Var, zv6 zv6Var) {
        this.b = new com.yandex.go.masstransit.sdk.checkout.impl.tariff.bus.b(xv6Var.a, this);
    }
}
