package com.yandex.go.chargers.offer.passes;

import defpackage.dja;
import defpackage.eja;
import defpackage.gja;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.passes.ChargersPassesPurchasingRouter$content$1$activeUiStateFlow$1", f = "ChargersPassesPurchasingRouter.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPassesPurchasingRouter$content$1$activeUiStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ eja $data;
    int label;
    final /* synthetic */ gja this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassesPurchasingRouter$content$1$activeUiStateFlow$1(gja gjaVar, eja ejaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gjaVar;
        this.$data = ejaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersPassesPurchasingRouter$content$1$activeUiStateFlow$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersPassesPurchasingRouter$content$1$activeUiStateFlow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.chargers.offer.passes.ui.a aVar = this.this$0.I;
            dja djaVar = (dja) this.$data;
            String str = djaVar.a;
            String str2 = djaVar.b;
            this.label = 1;
            if (aVar.d(str, str2, this) == coroutineSingletons) {
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
