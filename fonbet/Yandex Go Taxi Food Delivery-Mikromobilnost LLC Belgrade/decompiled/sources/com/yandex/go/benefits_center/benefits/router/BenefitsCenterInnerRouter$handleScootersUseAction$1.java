package com.yandex.go.benefits_center.benefits.router;

import com.yandex.go.benefits_center.benefits.sdk.actions.ScootersUseAction;
import defpackage.cb0;
import defpackage.m950;
import defpackage.mno0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sno0;
import defpackage.tse;
import defpackage.vno0;
import defpackage.wls;
import defpackage.zn5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.benefits_center.benefits.router.BenefitsCenterInnerRouter$handleScootersUseAction$1", f = "BenefitsCenterInnerRouter.kt", l = {222}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BenefitsCenterInnerRouter$handleScootersUseAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersUseAction $action;
    final /* synthetic */ zn5 $payload;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitsCenterInnerRouter$handleScootersUseAction$1(d dVar, ScootersUseAction scootersUseAction, zn5 zn5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$action = scootersUseAction;
        this.$payload = zn5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BenefitsCenterInnerRouter$handleScootersUseAction$1(this.this$0, this.$action, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BenefitsCenterInnerRouter$handleScootersUseAction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            sno0 sno0Var = this.this$0.R;
            String str = this.$action.b;
            this.label = 1;
            obj = sno0Var.a.a(str, this);
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
        d dVar = this.this$0;
        dVar.A((m950) dVar.V.get(), new mno0((vno0) obj), new cb0(4, this.this$0, this.$payload));
        return zy11.a;
    }
}
