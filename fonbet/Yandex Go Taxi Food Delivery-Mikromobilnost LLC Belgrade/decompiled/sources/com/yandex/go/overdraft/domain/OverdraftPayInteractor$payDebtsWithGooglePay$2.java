package com.yandex.go.overdraft.domain;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.m6a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lm6a0;", PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX, "", "", "debtOrderIds", "Lzy11;", "<anonymous>", "(Lm6a0;Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.overdraft.domain.OverdraftPayInteractor$payDebtsWithGooglePay$2", f = "OverdraftPayInteractor.kt", l = {HProv.PP_REBOOT}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OverdraftPayInteractor$payDebtsWithGooglePay$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverdraftPayInteractor$payDebtsWithGooglePay$2(k kVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = kVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OverdraftPayInteractor$payDebtsWithGooglePay$2 overdraftPayInteractor$payDebtsWithGooglePay$2 = new OverdraftPayInteractor$payDebtsWithGooglePay$2(this.this$0, (Continuation) obj3);
        overdraftPayInteractor$payDebtsWithGooglePay$2.L$0 = (m6a0) obj;
        overdraftPayInteractor$payDebtsWithGooglePay$2.L$1 = (List) obj2;
        return overdraftPayInteractor$payDebtsWithGooglePay$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m6a0 m6a0Var = (m6a0) this.L$0;
        List list = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            k kVar = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (k.a(kVar, m6a0Var, list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
