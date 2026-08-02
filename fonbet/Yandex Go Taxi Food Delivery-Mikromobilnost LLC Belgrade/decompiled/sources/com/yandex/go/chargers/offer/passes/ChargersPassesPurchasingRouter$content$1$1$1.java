package com.yandex.go.chargers.offer.passes;

import defpackage.b5a;
import defpackage.fja;
import defpackage.gja;
import defpackage.hja;
import defpackage.ija;
import defpackage.j1a;
import defpackage.jja;
import defpackage.kja;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.passes.ChargersPassesPurchasingRouter$content$1$1$1", f = "ChargersPassesPurchasingRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPassesPurchasingRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ jja $action;
    final /* synthetic */ fja $innerNavigator;
    int label;
    final /* synthetic */ gja this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassesPurchasingRouter$content$1$1$1(gja gjaVar, jja jjaVar, fja fjaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gjaVar;
        this.$action = jjaVar;
        this.$innerNavigator = fjaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersPassesPurchasingRouter$content$1$1$1(this.this$0, this.$action, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersPassesPurchasingRouter$content$1$1$1 chargersPassesPurchasingRouter$content$1$1$1 = (ChargersPassesPurchasingRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersPassesPurchasingRouter$content$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        kja kjaVar = this.this$0.H;
        jja jjaVar = this.$action;
        fja fjaVar = this.$innerNavigator;
        kjaVar.getClass();
        if (jjaVar instanceof ija) {
            fjaVar.a.r(new j1a(((ija) jjaVar).a, 4));
        } else {
            if (!(jjaVar instanceof hja)) {
                w511.b();
                return null;
            }
            fjaVar.a.r(new b5a(((hja) jjaVar).a, 5));
        }
        return zy11.a;
    }
}
