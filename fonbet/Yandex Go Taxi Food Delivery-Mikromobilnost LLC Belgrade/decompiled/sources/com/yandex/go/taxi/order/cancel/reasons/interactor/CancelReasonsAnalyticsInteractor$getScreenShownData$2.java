package com.yandex.go.taxi.order.cancel.reasons.interactor;

import defpackage.cx7;
import defpackage.h73;
import defpackage.hx7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.yw01;
import defpackage.yw7;
import defpackage.zw7;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzw7;", "<anonymous>", "(Ltse;)Lzw7;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.reasons.interactor.CancelReasonsAnalyticsInteractor$getScreenShownData$2", f = "CancelReasonsAnalyticsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CancelReasonsAnalyticsInteractor$getScreenShownData$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<yw7> $reasonItems;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelReasonsAnalyticsInteractor$getScreenShownData$2(List list, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$reasonItems = list;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CancelReasonsAnalyticsInteractor$getScreenShownData$2(this.$reasonItems, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CancelReasonsAnalyticsInteractor$getScreenShownData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List<yw7> list = this.$reasonItems;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((yw7) it.next()).getId());
        }
        LinkedHashSet i = v4r0.i(kotlin.collections.a.N0(arrayList), "done");
        a aVar = this.this$0;
        hx7 hx7Var = aVar.a;
        o2y0 o2y0Var = aVar.c;
        hx7Var.getClass();
        return new zw7(i, kotlin.sequences.b.u(kotlin.sequences.b.g(new yw01(new h73(1, hx7.a(o2y0Var)), CancelReasonsAnalyticsInteractor$getScreenShownData$2$hiddenButtons$1.b), new cx7(0, i))));
    }
}
