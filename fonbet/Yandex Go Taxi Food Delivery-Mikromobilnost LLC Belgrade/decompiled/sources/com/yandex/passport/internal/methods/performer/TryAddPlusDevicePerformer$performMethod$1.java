package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.methods.q2;
import com.yandex.passport.internal.usecase.o1;
import com.yandex.passport.internal.usecase.p1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.TryAddPlusDevicePerformer$performMethod$1", f = "TryAddPlusDevicePerformer.kt", l = {17}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TryAddPlusDevicePerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ q2 $method;
    int label;
    final /* synthetic */ j1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TryAddPlusDevicePerformer$performMethod$1(q2 q2Var, j1 j1Var, Continuation continuation) {
        super(2, continuation);
        this.$method = q2Var;
        this.this$0 = j1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TryAddPlusDevicePerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TryAddPlusDevicePerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) this.$method.b.c);
        p1 p1Var = this.this$0.a;
        q2 q2Var = this.$method;
        o1 o1Var = new o1(B, (String) q2Var.c.c, (String) q2Var.d.c, "try_add_plus_device");
        this.label = 1;
        Object a = p1Var.a(o1Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
