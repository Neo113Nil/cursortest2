package com.yandex.go.taxi.summary.interactor;

import android.graphics.drawable.BitmapDrawable;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pox0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Landroid/graphics/drawable/BitmapDrawable;", "Lpox0;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.interactor.SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$6", f = "SummarySourceDestinationModelInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$6 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$6(p pVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$6 summarySourceDestinationModelInteractor$updateSourceDestinationFlow$6 = new SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$6(this.this$0, continuation);
        summarySourceDestinationModelInteractor$updateSourceDestinationFlow$6.L$0 = obj;
        return summarySourceDestinationModelInteractor$updateSourceDestinationFlow$6;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$6 summarySourceDestinationModelInteractor$updateSourceDestinationFlow$6 = (SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$6) create((Pair) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        summarySourceDestinationModelInteractor$updateSourceDestinationFlow$6.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) pair.getFirst();
        pox0 pox0Var = (pox0) pair.getSecond();
        p pVar = this.this$0;
        pVar.n.k = pVar.m.g(bitmapDrawable, pox0Var);
        return zy11.a;
    }
}
