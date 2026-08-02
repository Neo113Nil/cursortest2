package com.yandex.go.taxi.summary.verticalsummary.interactor;

import com.yandex.go.taxi.summary.verticalsummary.expriment.VerticalSelectorOnSummaryExperiment;
import defpackage.bpl0;
import defpackage.fg31;
import defpackage.jtz0;
import defpackage.ki31;
import defpackage.lej0;
import defpackage.mvg;
import defpackage.nww0;
import defpackage.ny61;
import defpackage.uox0;
import defpackage.vpr;
import defpackage.w0s;
import defpackage.z91;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.verticalsummary.interactor.VerticalSummaryUiStateInteractor$special$$inlined$combine$1$3", f = "VerticalSummaryUiStateInteractor.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class VerticalSummaryUiStateInteractor$special$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VerticalSummaryUiStateInteractor$special$$inlined$combine$1$3 verticalSummaryUiStateInteractor$special$$inlined$combine$1$3 = new VerticalSummaryUiStateInteractor$special$$inlined$combine$1$3(3, (Continuation) obj3);
        verticalSummaryUiStateInteractor$special$$inlined$combine$1$3.L$0 = (vpr) obj;
        verticalSummaryUiStateInteractor$special$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return verticalSummaryUiStateInteractor$special$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            nww0 nww0Var = (nww0) objArr[7];
            VerticalSelectorOnSummaryExperiment verticalSelectorOnSummaryExperiment = (VerticalSelectorOnSummaryExperiment) obj8;
            lej0 lej0Var = (lej0) obj7;
            jtz0 jtz0Var = (jtz0) obj6;
            w0s w0sVar = (w0s) obj5;
            z91 z91Var = (z91) obj4;
            fg31 fg31Var = (fg31) obj3;
            bpl0 bpl0Var = (bpl0) obj2;
            List list = bpl0Var.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj9 : list) {
                if (!((uox0) obj9).h) {
                    arrayList.add(obj9);
                }
            }
            ki31 ki31Var = new ki31(z91Var, fg31Var, w0sVar, jtz0Var, lej0Var, bpl0Var, arrayList.size(), verticalSelectorOnSummaryExperiment.d, nww0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(ki31Var, this) == coroutineSingletons) {
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
