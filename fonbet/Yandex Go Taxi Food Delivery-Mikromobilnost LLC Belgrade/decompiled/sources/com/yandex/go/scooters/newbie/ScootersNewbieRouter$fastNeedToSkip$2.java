package com.yandex.go.scooters.newbie;

import defpackage.mvg;
import defpackage.n1o0;
import defpackage.ny61;
import defpackage.qwo0;
import defpackage.tse;
import defpackage.u1o0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.newbie.ScootersNewbieRouter$fastNeedToSkip$2", f = "ScootersNewbieRouter.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersNewbieRouter$fastNeedToSkip$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersNewbieRouter$fastNeedToSkip$2(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersNewbieRouter$fastNeedToSkip$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersNewbieRouter$fastNeedToSkip$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!this.this$0.J.b.b()) {
                return Boolean.TRUE;
            }
            qwo0 qwo0Var = this.this$0.I;
            if (((Boolean) qwo0Var.x.getValue(qwo0Var, qwo0.B[22])).booleanValue()) {
                return Boolean.TRUE;
            }
            u1o0 u1o0Var = this.this$0.M;
            this.label = 1;
            obj = u1o0Var.a.b(this);
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
        n1o0 n1o0Var = (n1o0) obj;
        if (n1o0Var.b && n1o0Var.e != null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
