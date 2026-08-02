package com.yandex.go.taxi.order.quality_question.interactor;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.QualityQuestionExperiment;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.lgg0;
import defpackage.mq61;
import defpackage.ny61;
import defpackage.q6c0;
import defpackage.qn11;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ q6c0 b;

    public a(vpr vprVar, q6c0 q6c0Var) {
        this.a = vprVar;
        this.b = q6c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        QualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1 qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1;
        int i;
        lgg0 lgg0Var;
        if (continuation instanceof QualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1) {
            qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1 = (QualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1) continuation;
            int i2 = qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    OrderStatusInfo V = taxiOrder.V();
                    V.getClass();
                    qn11 qn11Var = QualityQuestionExperiment.g;
                    qn11 b = V.b(QualityQuestionExperiment.class);
                    if (b != null) {
                        qn11Var = b;
                    }
                    QualityQuestionExperiment qualityQuestionExperiment = (QualityQuestionExperiment) qn11Var;
                    String str = taxiOrder.a;
                    this.b.getClass();
                    boolean z = qualityQuestionExperiment.b;
                    String str2 = qualityQuestionExperiment.d;
                    if (!z || str2 == null || evu0.J(str2)) {
                        lgg0Var = null;
                    } else {
                        String c = mq61.c(str2, "order=" + str);
                        String str3 = qualityQuestionExperiment.e;
                        String Y = d6z.Y(qualityQuestionExperiment, "sdc_quality_question_title");
                        lgg0Var = new lgg0();
                        lgg0Var.a = c;
                        lgg0Var.b = str3;
                        lgg0Var.c = Y;
                    }
                    qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1.L$0 = null;
                    qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1.L$1 = null;
                    qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1.L$2 = null;
                    qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1.L$3 = null;
                    qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(lgg0Var, qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1 = new QualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1(this, continuation);
        Object obj22 = qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
