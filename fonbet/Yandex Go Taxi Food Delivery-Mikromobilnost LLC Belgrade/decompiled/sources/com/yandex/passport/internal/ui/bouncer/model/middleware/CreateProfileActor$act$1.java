package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.internal.ui.bouncer.model.s1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/k;", "action", "Lcom/yandex/passport/internal/ui/bouncer/model/s1;", "loginState", "Lcom/yandex/passport/internal/ui/bouncer/model/n0;", "<anonymous>", "(Lcom/yandex/passport/internal/ui/bouncer/model/k;Lcom/yandex/passport/internal/ui/bouncer/model/s1;)Lcom/yandex/passport/internal/ui/bouncer/model/n0;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.CreateProfileActor$act$1", f = "CreateProfileActor.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CreateProfileActor$act$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateProfileActor$act$1(r rVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = rVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CreateProfileActor$act$1 createProfileActor$act$1 = new CreateProfileActor$act$1(this.this$0, (Continuation) obj3);
        createProfileActor$act$1.L$0 = (com.yandex.passport.internal.ui.bouncer.model.k) obj;
        createProfileActor$act$1.L$1 = (s1) obj2;
        return createProfileActor$act$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.passport.internal.ui.bouncer.model.k kVar = (com.yandex.passport.internal.ui.bouncer.model.k) this.L$0;
        s1 s1Var = (s1) this.L$1;
        r rVar = this.this$0;
        this.L$0 = null;
        this.label = 1;
        Object b = r.b(rVar, kVar, s1Var, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
