package com.yandex.go.tips.ui.selector_v2;

import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import com.yandex.go.taxi.order.models.api.net.dto.objects.Tips;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import com.yandex.go.tips.navigation.b;
import defpackage.g8r0;
import defpackage.hne0;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class TipsSettingsPresenter$updateDoneButton$uiState$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        aVar.A.a(Integer.valueOf(aVar.B));
        hne0 hne0Var = aVar.z;
        hne0Var.d.a.D(aVar.B);
        int i = aVar.B;
        com.yandex.go.taxi.order.tipssuggest.domain.a aVar2 = hne0Var.c;
        String valueOf = String.valueOf(i);
        TaxiOrder v = ((e0) hne0Var.b).v();
        if (v == null) {
            aVar2.g(new Tips(valueOf, TipsType.PERCENT));
        } else if (v.A() != null) {
            TipsType A = v.A();
            TipsType tipsType = TipsType.PERCENT;
            if (A == tipsType) {
                v.S(new TaxiOrderSelectedTipsChoiceState(TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsChoiceType.PREFERRED_CHOICE, TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.PERCENT, valueOf));
                hne0Var.a.g(v);
                aVar2.f(v.a, new Tips(valueOf, tipsType));
            }
        }
        aVar.A.c(Integer.valueOf(aVar.B));
        ((b) aVar.y.b).r(new g8r0(String.valueOf(aVar.B), 27));
        return zy11.a;
    }
}
