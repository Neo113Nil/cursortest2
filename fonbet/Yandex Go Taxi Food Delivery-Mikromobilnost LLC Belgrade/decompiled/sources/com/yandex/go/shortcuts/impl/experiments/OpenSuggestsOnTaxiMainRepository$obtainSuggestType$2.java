package com.yandex.go.shortcuts.impl.experiments;

import defpackage.e870;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Le870;", "<anonymous>", "(Ltse;)Le870;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.experiments.OpenSuggestsOnTaxiMainRepository$obtainSuggestType$2", f = "OpenSuggestsOnTaxiMainRepository.kt", l = {15}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OpenSuggestsOnTaxiMainRepository$obtainSuggestType$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenSuggestsOnTaxiMainRepository$obtainSuggestType$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OpenSuggestsOnTaxiMainRepository$obtainSuggestType$2 openSuggestsOnTaxiMainRepository$obtainSuggestType$2 = new OpenSuggestsOnTaxiMainRepository$obtainSuggestType$2(this.this$0, continuation);
        openSuggestsOnTaxiMainRepository$obtainSuggestType$2.L$0 = obj;
        return openSuggestsOnTaxiMainRepository$obtainSuggestType$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OpenSuggestsOnTaxiMainRepository$obtainSuggestType$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h = tje.h(tseVar, null, null, new OpenSuggestsOnTaxiMainRepository$obtainSuggestType$2$showFullscreen$1(this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = h.s(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return new e870(((Boolean) obj).booleanValue());
    }
}
