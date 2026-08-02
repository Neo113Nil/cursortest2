package com.yandex.go.chargers.order.completion.pre_finish;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersFinishCardButtonName;
import defpackage.b64;
import defpackage.em9;
import defpackage.h1a;
import defpackage.tje;
import defpackage.tls;
import defpackage.u0a;
import defpackage.uj9;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.common.clid.ClidProvider;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersFinishModalView$chargersButtonsView$1 extends FunctionReferenceImpl implements tls {
    public final void i(uj9 uj9Var) {
        h1a h1aVar = (h1a) this.receiver;
        if (!(uj9Var instanceof u0a)) {
            h1aVar.getClass();
            return;
        }
        em9 em9Var = h1aVar.x;
        ChargersAnalytics$ChargersFinishCardButtonName chargersAnalytics$ChargersFinishCardButtonName = ChargersAnalytics$ChargersFinishCardButtonName.ReturnCharger;
        HashMap w = b64.w(em9Var);
        w.put(ClidProvider.STATE, chargersAnalytics$ChargersFinishCardButtonName.getEventValue());
        em9Var.a.a("Chargers.FinishCard.Tapped", w, 1, new HashMap());
        tje.N(h1aVar.Jg(), null, null, new ChargersFinishPresenter$finish$1(h1aVar, ((u0a) uj9Var).a, null), 3);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((uj9) obj);
        return zy11.a;
    }
}
