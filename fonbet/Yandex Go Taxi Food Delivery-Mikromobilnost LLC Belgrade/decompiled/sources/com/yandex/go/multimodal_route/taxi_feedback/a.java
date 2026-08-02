package com.yandex.go.multimodal_route.taxi_feedback;

import com.yandex.go.taxi.order.models.api.TaxiOrderFeedback;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState;
import defpackage.es40;
import defpackage.jl40;
import defpackage.nvx0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.w511;
import defpackage.x611;
import defpackage.y611;
import defpackage.z611;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final TaxiFeedbackStateRepository a;
    public final com.yandex.go.taxi.order.details.v2.domain.feedback.sending.a b;
    public final es40 c;

    public a(TaxiFeedbackStateRepository taxiFeedbackStateRepository, com.yandex.go.taxi.order.details.v2.domain.feedback.sending.a aVar, es40 es40Var) {
        this.a = taxiFeedbackStateRepository;
        this.b = aVar;
        this.c = es40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        TaxiFeedbackActionInteractor$sendTaxiOrderFeedback$1 taxiFeedbackActionInteractor$sendTaxiOrderFeedback$1;
        int i;
        TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType;
        TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsChoiceType taxiOrderTipsChoiceType;
        String str;
        if (continuationImpl instanceof TaxiFeedbackActionInteractor$sendTaxiOrderFeedback$1) {
            taxiFeedbackActionInteractor$sendTaxiOrderFeedback$1 = (TaxiFeedbackActionInteractor$sendTaxiOrderFeedback$1) continuationImpl;
            int i2 = taxiFeedbackActionInteractor$sendTaxiOrderFeedback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiFeedbackActionInteractor$sendTaxiOrderFeedback$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiFeedbackActionInteractor$sendTaxiOrderFeedback$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiFeedbackActionInteractor$sendTaxiOrderFeedback$1.label;
                TaxiFeedbackStateRepository taxiFeedbackStateRepository = this.a;
                zy11 zy11Var = zy11.a;
                String str2 = null;
                Object[] objArr = 0;
                if (i != 0) {
                    kotlin.b.b(obj);
                    nvx0 nvx0Var = (nvx0) taxiFeedbackStateRepository.b.getValue();
                    if (nvx0Var == null) {
                        return zy11Var;
                    }
                    Pair pair = nvx0Var.c;
                    z611 z611Var = pair != null ? (z611) pair.f() : null;
                    if (z611Var != null) {
                        if (z611Var instanceof x611) {
                            str = ((x611) z611Var).a;
                        } else {
                            if (!(z611Var instanceof y611)) {
                                w511.b();
                                return null;
                            }
                            str = ((y611) z611Var).a;
                        }
                        taxiOrderTipsValueType = jl40.l(str, "flat") ? TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.FLAT : jl40.l(str, "percent") ? TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.PERCENT : TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.FLAT;
                    } else {
                        taxiOrderTipsValueType = null;
                    }
                    boolean z = z611Var instanceof x611;
                    String str3 = z ? ((x611) z611Var).b : null;
                    if (z) {
                        taxiOrderTipsChoiceType = TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsChoiceType.VALUE_CHOICE;
                    } else if (z611Var instanceof y611) {
                        taxiOrderTipsChoiceType = TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsChoiceType.ZERO_CHOICE;
                    } else {
                        if (z611Var != null) {
                            w511.b();
                            return null;
                        }
                        taxiOrderTipsChoiceType = null;
                    }
                    Integer num = nvx0Var.b;
                    TaxiOrderTipsState a = TaxiOrderTipsState.a(new TaxiOrderTipsState(str2, objArr == true ? 1 : 0, 15).d(str3), null, new TaxiOrderSelectedTipsChoiceState(taxiOrderTipsChoiceType, taxiOrderTipsValueType, str3), 7);
                    if (taxiOrderTipsValueType != null) {
                        a.e(taxiOrderTipsValueType);
                    }
                    TaxiOrderFeedback taxiOrderFeedback = new TaxiOrderFeedback(num, a, 190);
                    String str4 = o2y0Var.b().a;
                    taxiFeedbackActionInteractor$sendTaxiOrderFeedback$1.L$0 = null;
                    taxiFeedbackActionInteractor$sendTaxiOrderFeedback$1.L$1 = null;
                    taxiFeedbackActionInteractor$sendTaxiOrderFeedback$1.L$2 = null;
                    taxiFeedbackActionInteractor$sendTaxiOrderFeedback$1.L$3 = null;
                    taxiFeedbackActionInteractor$sendTaxiOrderFeedback$1.L$4 = null;
                    taxiFeedbackActionInteractor$sendTaxiOrderFeedback$1.L$5 = null;
                    taxiFeedbackActionInteractor$sendTaxiOrderFeedback$1.L$6 = null;
                    taxiFeedbackActionInteractor$sendTaxiOrderFeedback$1.label = 1;
                    this.b.b(str4, taxiOrderFeedback, taxiFeedbackActionInteractor$sendTaxiOrderFeedback$1);
                    if (zy11Var == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                taxiFeedbackStateRepository.b.l(null);
                return zy11Var;
            }
        }
        taxiFeedbackActionInteractor$sendTaxiOrderFeedback$1 = new TaxiFeedbackActionInteractor$sendTaxiOrderFeedback$1(this, continuationImpl);
        Object obj2 = taxiFeedbackActionInteractor$sendTaxiOrderFeedback$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiFeedbackActionInteractor$sendTaxiOrderFeedback$1.label;
        TaxiFeedbackStateRepository taxiFeedbackStateRepository2 = this.a;
        zy11 zy11Var2 = zy11.a;
        String str22 = null;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        taxiFeedbackStateRepository2.b.l(null);
        return zy11Var2;
    }
}
