package com.yandex.go.taxi.order.quality_question.interactor;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.q6c0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ q6c0 b;

    public b(jqr jqrVar, q6c0 q6c0Var) {
        this.a = jqrVar;
        this.b = q6c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        QualityQuestionInteractor$getQualityQuestion$$inlined$map$1$1 qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$1;
        int i;
        if (continuation instanceof QualityQuestionInteractor$getQualityQuestion$$inlined$map$1$1) {
            qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$1 = (QualityQuestionInteractor$getQualityQuestion$$inlined$map$1$1) continuation;
            int i2 = qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$1.L$0 = null;
                    qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$1.L$1 = null;
                    qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$1.L$2 = null;
                    qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$1 = new QualityQuestionInteractor$getQualityQuestion$$inlined$map$1$1(this, continuation);
        Object obj2 = qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qualityQuestionInteractor$getQualityQuestion$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
