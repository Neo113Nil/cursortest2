package com.yandex.go.scooters.passes.purchase.superpasses;

import defpackage.ftm0;
import defpackage.lsm0;
import defpackage.m950;
import defpackage.moo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zjn0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.superpasses.ScootersSuperPassesPurchaseRouter$listenToPurchasesResults$1", f = "ScootersSuperPassesPurchaseRouter.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSuperPassesPurchaseRouter$listenToPurchasesResults$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSuperPassesPurchaseRouter$listenToPurchasesResults$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersSuperPassesPurchaseRouter$listenToPurchasesResults$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSuperPassesPurchaseRouter$listenToPurchasesResults$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.scooters.passes.domain.g gVar = this.this$0.K;
            this.label = 1;
            c = gVar.c(this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = ((Result) obj).getValue();
        }
        r0 r0Var = this.this$0.L.b;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        boolean z = c instanceof Result.Failure;
        int i2 = 4;
        if (!z) {
            c cVar = this.this$0;
            Object obj2 = z ? null : c;
            cVar.getClass();
            cVar.r(new lsm0((moo0) obj2, i2));
        } else if (z) {
            c cVar2 = this.this$0;
            Throwable a = Result.a(c);
            if (a == null) {
                a = new IllegalStateException();
            }
            cVar2.A((m950) cVar2.J.get(), new zjn0(a, (List) null, 6), new ftm0(4));
        }
        return zy11.a;
    }
}
