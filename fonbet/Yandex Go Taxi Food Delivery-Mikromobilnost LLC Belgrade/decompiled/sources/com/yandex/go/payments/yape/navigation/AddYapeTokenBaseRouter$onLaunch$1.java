package com.yandex.go.payments.yape.navigation;

import defpackage.gg0;
import defpackage.lg0;
import defpackage.lk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.yape.navigation.AddYapeTokenBaseRouter$onLaunch$1", f = "AddYapeTokenBaseRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddYapeTokenBaseRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ lk0 $payload;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddYapeTokenBaseRouter$onLaunch$1(c cVar, lk0 lk0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$payload = lk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddYapeTokenBaseRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AddYapeTokenBaseRouter$onLaunch$1 addYapeTokenBaseRouter$onLaunch$1 = (AddYapeTokenBaseRouter$onLaunch$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        addYapeTokenBaseRouter$onLaunch$1.invokeSuspend(zy11Var);
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
        c cVar = this.this$0;
        gg0 a = cVar.N.a(new a(cVar), false);
        c cVar2 = this.this$0;
        cVar2.A(a, new lg0(PaymentMethod$Type.YAPE_TOKEN, null, this.$payload.b), new b(cVar2));
        return zy11.a;
    }
}
