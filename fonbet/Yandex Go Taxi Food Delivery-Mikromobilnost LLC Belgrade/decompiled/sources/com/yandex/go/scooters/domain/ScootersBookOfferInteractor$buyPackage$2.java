package com.yandex.go.scooters.domain;

import com.yandex.go.scooters.passes.model.PassType;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.vj90;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.ScootersBookOfferInteractor$buyPackage$2", f = "ScootersBookOfferInteractor.kt", l = {317}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersBookOfferInteractor$buyPackage$2 extends SuspendLambda implements tls {
    final /* synthetic */ vj90 $pass;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersBookOfferInteractor$buyPackage$2(d dVar, vj90 vj90Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dVar;
        this.$pass = vj90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersBookOfferInteractor$buyPackage$2(this.this$0, this.$pass, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersBookOfferInteractor$buyPackage$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.scooters.passes.domain.i iVar = this.this$0.g;
            vj90 vj90Var = this.$pass;
            String str = vj90Var.a;
            PassType passType = vj90Var.b;
            this.label = 1;
            if (iVar.a(str, passType, this) == coroutineSingletons) {
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
