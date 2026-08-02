package com.yandex.go.payments.cards.ui;

import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.b90;
import defpackage.biw0;
import defpackage.j831;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rb8;
import defpackage.tse;
import defpackage.tx90;
import defpackage.u32;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.ui.ConfirmCardPresenter$confirmCvn$1", f = "ConfirmCardPresenter.kt", l = {BlendingGradientView.BASE_ALPHA, 160, 162}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ConfirmCardPresenter$confirmCvn$1 extends SuspendLambda implements wls {
    final /* synthetic */ biw0 $supplyPaymentDataFactory;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmCardPresenter$confirmCvn$1(c cVar, biw0 biw0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$supplyPaymentDataFactory = biw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmCardPresenter$confirmCvn$1(this.this$0, this.$supplyPaymentDataFactory, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmCardPresenter$confirmCvn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:2|(1:(3:(1:(1:7)(2:11|12))(3:13|14|15)|8|9)(4:22|23|24|25))(11:36|(1:38)(1:55)|(1:40)|41|42|43|44|45|46|(1:48)|21)|26|27) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00dd, code lost:
    
        if (com.yandex.go.payments.cards.ui.c.Mg(r3, r14, false, r12) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
    
        if (com.yandex.go.payments.cards.ui.c.Ng(r0, (defpackage.tu5) r14, false, false, r12) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c3, code lost:
    
        r14 = r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ConfirmCardPresenter$confirmCvn$1 confirmCardPresenter$confirmCvn$1;
        c cVar;
        Throwable th;
        c cVar2;
        c cVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar4 = this.this$0;
                b90 b90Var = (b90) cVar4.A;
                rb8 rb8Var = b90Var.a;
                j831 j831Var = b90Var.e;
                if ((j831Var != null ? j831Var.c : null) != null) {
                    u32 u32Var = cVar4.E;
                    cVar4.K++;
                    u32Var.getClass();
                }
                c cVar5 = this.this$0;
                biw0 biw0Var = this.$supplyPaymentDataFactory;
                try {
                    com.yandex.go.payments.cards.data.c cVar6 = cVar5.B;
                    tx90 tx90Var = cVar5.M;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = cVar5;
                    this.L$4 = cVar5;
                    this.label = 1;
                    confirmCardPresenter$confirmCvn$1 = this;
                    try {
                        Object i2 = cVar6.i(rb8Var, tx90Var, j831Var, biw0Var, confirmCardPresenter$confirmCvn$1);
                        if (i2 != coroutineSingletons) {
                            cVar2 = cVar5;
                            cVar3 = cVar2;
                            obj = i2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cVar = cVar5;
                        th = th;
                        confirmCardPresenter$confirmCvn$1.L$0 = null;
                        confirmCardPresenter$confirmCvn$1.L$1 = null;
                        confirmCardPresenter$confirmCvn$1.L$2 = null;
                        confirmCardPresenter$confirmCvn$1.L$3 = null;
                        confirmCardPresenter$confirmCvn$1.L$4 = null;
                        confirmCardPresenter$confirmCvn$1.label = 3;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    confirmCardPresenter$confirmCvn$1 = this;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i == 2) {
                    cVar = (c) this.L$3;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        confirmCardPresenter$confirmCvn$1 = this;
                        confirmCardPresenter$confirmCvn$1.L$0 = null;
                        confirmCardPresenter$confirmCvn$1.L$1 = null;
                        confirmCardPresenter$confirmCvn$1.L$2 = null;
                        confirmCardPresenter$confirmCvn$1.L$3 = null;
                        confirmCardPresenter$confirmCvn$1.L$4 = null;
                        confirmCardPresenter$confirmCvn$1.label = 3;
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
            cVar3 = (c) this.L$4;
            cVar2 = (c) this.L$3;
            try {
                kotlin.b.b(obj);
                confirmCardPresenter$confirmCvn$1 = this;
            } catch (Throwable th5) {
                th = th5;
                confirmCardPresenter$confirmCvn$1 = this;
                cVar = cVar3;
                confirmCardPresenter$confirmCvn$1.L$0 = null;
                confirmCardPresenter$confirmCvn$1.L$1 = null;
                confirmCardPresenter$confirmCvn$1.L$2 = null;
                confirmCardPresenter$confirmCvn$1.L$3 = null;
                confirmCardPresenter$confirmCvn$1.L$4 = null;
                confirmCardPresenter$confirmCvn$1.label = 3;
            }
            confirmCardPresenter$confirmCvn$1.L$0 = null;
            confirmCardPresenter$confirmCvn$1.L$1 = null;
            confirmCardPresenter$confirmCvn$1.L$2 = null;
            confirmCardPresenter$confirmCvn$1.L$3 = cVar3;
            confirmCardPresenter$confirmCvn$1.L$4 = null;
            confirmCardPresenter$confirmCvn$1.label = 2;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
