package com.ybsdk.feature.split.deposit.internal.data.deposit.repository;

import com.ybsdk.feature.split.deposit.internal.data.network.dto.GetDepositPageResponse;
import defpackage.gka0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.rr51;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lgka0;", "<anonymous>", "(Ltse;)Lgka0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.split.deposit.internal.data.deposit.repository.SplitDepositPageRepository$getPaymentStatuses$2", f = "SplitDepositPageRepository.kt", l = {HProv.PP_RESERVED1, HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SplitDepositPageRepository$getPaymentStatuses$2 extends SuspendLambda implements wls {
    final /* synthetic */ GetDepositPageResponse.TransactionStatusScreen $statusScreens;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitDepositPageRepository$getPaymentStatuses$2(GetDepositPageResponse.TransactionStatusScreen transactionStatusScreen, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$statusScreens = transactionStatusScreen;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SplitDepositPageRepository$getPaymentStatuses$2 splitDepositPageRepository$getPaymentStatuses$2 = new SplitDepositPageRepository$getPaymentStatuses$2(this.$statusScreens, this.this$0, continuation);
        splitDepositPageRepository$getPaymentStatuses$2.L$0 = obj;
        return splitDepositPageRepository$getPaymentStatuses$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SplitDepositPageRepository$getPaymentStatuses$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        rr51 rr51Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tse tseVar = (tse) this.L$0;
            qoh h = tje.h(tseVar, null, null, new SplitDepositPageRepository$getPaymentStatuses$2$bottomPendingDeferred$1(this.$statusScreens, this.this$0, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new SplitDepositPageRepository$getPaymentStatuses$2$bottomTimeoutDeferred$1(this.$statusScreens, this.this$0, null), 3);
            this.L$0 = h2;
            this.label = 1;
            Object s = h.s(this);
            if (s != coroutineSingletons) {
                nohVar = h2;
                obj = s;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rr51Var = (rr51) this.L$0;
            b.b(obj);
            return new gka0(rr51Var, (rr51) obj);
        }
        nohVar = (noh) this.L$0;
        b.b(obj);
        rr51 rr51Var2 = (rr51) obj;
        this.L$0 = rr51Var2;
        this.label = 2;
        Object k = nohVar.k(this);
        if (k != coroutineSingletons) {
            obj = k;
            rr51Var = rr51Var2;
            return new gka0(rr51Var, (rr51) obj);
        }
        return coroutineSingletons;
    }
}
