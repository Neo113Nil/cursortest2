package com.yandex.go.payments.cards.ui;

import defpackage.b90;
import defpackage.dw5;
import defpackage.erw;
import defpackage.j831;
import defpackage.jv5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.ui.ConfirmCardPresenter$onResume$1", f = "ConfirmCardPresenter.kt", l = {HProv.PP_BIO_STATISTICA_LEN, HProv.PP_REBOOT, 99, 101}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ConfirmCardPresenter$onResume$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmCardPresenter$onResume$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmCardPresenter$onResume$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmCardPresenter$onResume$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c3, code lost:
    
        if (com.yandex.go.payments.cards.ui.c.Ng(r4, (defpackage.tu5) r12, false, false, r11) != r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
    
        if (com.yandex.go.payments.cards.ui.c.Mg(r1, r12, false, r11) != r0) goto L37;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.go.payments.cards.ui.c, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        jv5 jv5Var;
        j831 j831Var;
        c cVar2;
        c cVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 4;
        }
        if (r1 == 0) {
            kotlin.b.b(obj);
            cVar = this.this$0;
            erw erwVar = cVar.A;
            b90 b90Var = (b90) erwVar;
            jv5Var = b90Var.a;
            j831Var = b90Var.e;
            com.yandex.go.payments.cards.pci_dss.data.a aVar = cVar.H;
            this.L$0 = jv5Var;
            this.L$1 = j831Var;
            this.L$2 = cVar;
            this.L$3 = cVar;
            this.label = 1;
            obj = aVar.a(erwVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            cVar2 = cVar;
        } else if (r1 == 1) {
            cVar = (c) this.L$3;
            cVar2 = (c) this.L$2;
            j831Var = (j831) this.L$1;
            jv5Var = (jv5) this.L$0;
            kotlin.b.b(obj);
        } else {
            if (r1 != 2) {
                if (r1 == 3) {
                    kotlin.b.b(obj);
                } else {
                    if (r1 != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
            cVar = (c) this.L$3;
            cVar3 = (c) this.L$2;
            kotlin.b.b(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = cVar;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
        }
        com.yandex.go.payments.cards.data.c cVar4 = cVar2.B;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = cVar2;
        this.L$3 = cVar;
        this.L$4 = null;
        this.label = 2;
        obj = cVar4.e(jv5Var, (dw5) obj, j831Var, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        cVar3 = cVar2;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = cVar;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 3;
    }
}
