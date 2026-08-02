package com.yandex.go.scooters.debt;

import defpackage.fdn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zgz;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.debt.ScootersDebtPresenter$makePayment$1", f = "ScootersDebtPresenter.kt", l = {HProv.PP_PASSWD_TERM, HProv.PP_SAME_MEDIA}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersDebtPresenter$makePayment$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDebtPresenter$makePayment$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDebtPresenter$makePayment$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDebtPresenter$makePayment$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (com.yandex.go.scooters.debt.b.Lg(r4, r11) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        b bVar2;
        b bVar3;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b bVar4 = (b) this.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        bVar3 = bVar4;
                    }
                    return zy11.a;
                }
                b bVar5 = (b) this.L$1;
                bVar2 = (b) this.L$0;
                try {
                    kotlin.b.b(obj);
                    bVar = bVar5;
                } catch (Throwable th3) {
                    th = th3;
                    bVar3 = bVar5;
                }
                zgz.a(null, th);
                ((fdn0) bVar3.Dg()).W4(th, new ScootersDebtPresenter$makePayment$1$2$1(0, bVar3, b.class, "makePayment", "makePayment()V", 0));
                bVar3.Ng();
                return zy11.a;
            }
            kotlin.b.b(obj);
            bVar = this.this$0;
            try {
                com.yandex.go.scooters.debt.domain.c cVar = bVar.x;
                this.L$0 = bVar;
                this.L$1 = bVar;
                this.label = 1;
                if (cVar.b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                bVar2 = bVar;
            } catch (Throwable th4) {
                bVar3 = bVar;
                th = th4;
            }
            this.L$0 = bVar;
            this.L$1 = null;
            this.label = 2;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
