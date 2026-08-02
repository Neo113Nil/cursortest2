package com.yandex.plus.pay.internal.feature.payment.common;

import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import defpackage.j0x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/plus/pay/internal/model/PlusPayInvoice;", "<anonymous>", "(Ltse;)Lcom/yandex/plus/pay/internal/model/PlusPayInvoice;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.payment.common.SyncInvoiceInteractorImpl$getSyncedInvoice$2", f = "SyncInvoiceInteractorImpl.kt", l = {33, 40}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SyncInvoiceInteractorImpl$getSyncedInvoice$2 extends SuspendLambda implements wls {
    final /* synthetic */ PlusPayInvoice $invoice;
    final /* synthetic */ j0x0 $nonTerminalInvoiceCallback;
    final /* synthetic */ PlusPayInvoice.PollingConfiguration $pollingConfiguration;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncInvoiceInteractorImpl$getSyncedInvoice$2(c cVar, PlusPayInvoice plusPayInvoice, PlusPayInvoice.PollingConfiguration pollingConfiguration, j0x0 j0x0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$invoice = plusPayInvoice;
        this.$pollingConfiguration = pollingConfiguration;
        this.$nonTerminalInvoiceCallback = j0x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SyncInvoiceInteractorImpl$getSyncedInvoice$2(this.this$0, this.$invoice, this.$pollingConfiguration, this.$nonTerminalInvoiceCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SyncInvoiceInteractorImpl$getSyncedInvoice$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r10 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SyncInvoiceInteractorImpl$getSyncedInvoice$2 syncInvoiceInteractorImpl$getSyncedInvoice$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            PlusPayInvoice plusPayInvoice = this.$invoice;
            long retryDelayMillis = this.$pollingConfiguration.getRetryDelayMillis();
            j0x0 j0x0Var = this.$nonTerminalInvoiceCallback;
            this.label = 1;
            syncInvoiceInteractorImpl$getSyncedInvoice$2 = this;
            obj = c.a(cVar, plusPayInvoice, retryDelayMillis, j0x0Var, syncInvoiceInteractorImpl$getSyncedInvoice$2);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                PlusPayInvoice plusPayInvoice2 = (PlusPayInvoice) this.L$0;
                kotlin.b.b(obj);
                return plusPayInvoice2;
            }
            kotlin.b.b(obj);
            syncInvoiceInteractorImpl$getSyncedInvoice$2 = this;
        }
        PlusPayInvoice plusPayInvoice3 = (PlusPayInvoice) obj;
        if (plusPayInvoice3.getInvoiceStatus() == PlusPayInvoice.Status.SUCCESS) {
            c cVar2 = syncInvoiceInteractorImpl$getSyncedInvoice$2.this$0;
            long retryDelayMillis2 = syncInvoiceInteractorImpl$getSyncedInvoice$2.$pollingConfiguration.getRetryDelayMillis();
            syncInvoiceInteractorImpl$getSyncedInvoice$2.L$0 = plusPayInvoice3;
            syncInvoiceInteractorImpl$getSyncedInvoice$2.label = 2;
            if (c.b(cVar2, retryDelayMillis2, syncInvoiceInteractorImpl$getSyncedInvoice$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return plusPayInvoice3;
    }
}
