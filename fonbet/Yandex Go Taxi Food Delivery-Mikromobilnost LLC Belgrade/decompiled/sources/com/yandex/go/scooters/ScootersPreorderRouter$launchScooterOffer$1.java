package com.yandex.go.scooters;

import defpackage.ahn;
import defpackage.alo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vgn;
import defpackage.wgn;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ScootersPreorderRouter$launchScooterOffer$1", f = "ScootersPreorderRouter.kt", l = {298}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPreorderRouter$launchScooterOffer$1 extends SuspendLambda implements wls {
    final /* synthetic */ alo0 $launchMode;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPreorderRouter$launchScooterOffer$1(b bVar, alo0 alo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$launchMode = alo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPreorderRouter$launchScooterOffer$1(this.this$0, this.$launchMode, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPreorderRouter$launchScooterOffer$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ahn ahnVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vgn vgnVar = this.this$0.k0;
            if (vgnVar != null && (ahnVar = vgnVar.b) != null) {
                wgn wgnVar = new wgn(this.$launchMode.c.a());
                this.label = 1;
                obj = ((com.yandex.go.eboks.objects.data.a) ahnVar).b(wgnVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return zy11.a;
    }
}
