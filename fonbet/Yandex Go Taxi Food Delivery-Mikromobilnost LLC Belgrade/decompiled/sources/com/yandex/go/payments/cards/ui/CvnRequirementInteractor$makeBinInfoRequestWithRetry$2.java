package com.yandex.go.payments.cards.ui;

import defpackage.dt5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tx90;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldt5;", "param", "", "<unused var>", "Lsf8;", "<anonymous>", "(Ldt5;I)Lsf8;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.ui.CvnRequirementInteractor$makeBinInfoRequestWithRetry$2", f = "CvnRequirementInteractor.kt", l = {HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CvnRequirementInteractor$makeBinInfoRequestWithRetry$2 extends SuspendLambda implements zls {
    final /* synthetic */ tx90 $profile;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CvnRequirementInteractor$makeBinInfoRequestWithRetry$2(e eVar, tx90 tx90Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
        this.$profile = tx90Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        CvnRequirementInteractor$makeBinInfoRequestWithRetry$2 cvnRequirementInteractor$makeBinInfoRequestWithRetry$2 = new CvnRequirementInteractor$makeBinInfoRequestWithRetry$2(this.this$0, this.$profile, (Continuation) obj3);
        cvnRequirementInteractor$makeBinInfoRequestWithRetry$2.L$0 = (dt5) obj;
        return cvnRequirementInteractor$makeBinInfoRequestWithRetry$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dt5 dt5Var = (dt5) this.L$0;
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
        com.yandex.go.payments.cards.data.a aVar = this.this$0.a;
        String str = dt5Var.a;
        tx90 tx90Var = this.$profile;
        this.L$0 = null;
        this.label = 1;
        Object a = aVar.a(str, tx90Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
