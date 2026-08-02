package com.yandex.go.preorder.navigation;

import com.yandex.go.zone.model.Zone;
import defpackage.fz21;
import defpackage.hz21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpe0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.navigation.PreorderAddressValidationRouter$onLaunch$3", f = "PreorderAddressValidationRouter.kt", l = {59}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PreorderAddressValidationRouter$onLaunch$3 extends SuspendLambda implements wls {
    final /* synthetic */ tpe0 $payload;
    final /* synthetic */ hz21 $result;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreorderAddressValidationRouter$onLaunch$3(b bVar, hz21 hz21Var, tpe0 tpe0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$result = hz21Var;
        this.$payload = tpe0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PreorderAddressValidationRouter$onLaunch$3(this.this$0, this.$result, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PreorderAddressValidationRouter$onLaunch$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            Zone zone = ((fz21) this.$result).a;
            tpe0 tpe0Var = this.$payload;
            this.label = 1;
            if (b.P(bVar, zone, tpe0Var, this) == coroutineSingletons) {
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
