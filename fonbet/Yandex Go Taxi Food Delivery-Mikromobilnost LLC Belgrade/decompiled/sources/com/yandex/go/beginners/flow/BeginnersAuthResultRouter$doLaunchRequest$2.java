package com.yandex.go.beginners.flow;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.owx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.startup.launch.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.beginners.flow.BeginnersAuthResultRouter$doLaunchRequest$2", f = "BeginnersAuthResultRouter.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BeginnersAuthResultRouter$doLaunchRequest$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginnersAuthResultRouter$doLaunchRequest$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BeginnersAuthResultRouter$doLaunchRequest$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BeginnersAuthResultRouter$doLaunchRequest$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BeginnersAuthResultRouter$doLaunchRequest$2 beginnersAuthResultRouter$doLaunchRequest$2;
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.D.c();
            i iVar = this.this$0.H;
            this.label = 1;
            beginnersAuthResultRouter$doLaunchRequest$2 = this;
            b = i.b(iVar, "BeginnersAuthResultRouter", null, false, beginnersAuthResultRouter$doLaunchRequest$2, 6);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
            beginnersAuthResultRouter$doLaunchRequest$2 = this;
        }
        owx owxVar = (owx) (b instanceof Result.Failure ? null : b);
        a aVar = beginnersAuthResultRouter$doLaunchRequest$2.this$0;
        if (owxVar == null) {
            aVar.D.b();
        } else {
            aVar.D.d();
        }
        return zy11.a;
    }
}
