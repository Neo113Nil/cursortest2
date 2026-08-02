package com.ybsdk.feature.autotopup.internal.domain;

import defpackage.dqg;
import defpackage.iyd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Ldqg;", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/AutotopupPaymentStatusEntity;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.domain.AutoTopupSetupInteractor$getAutotopupPaymentStatus$3", f = "AutoTopupSetupInteractor.kt", l = {139}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupInteractor$getAutotopupPaymentStatus$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ String $source;
    final /* synthetic */ String $type;
    final /* synthetic */ boolean $wasPaymentRetried;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupInteractor$getAutotopupPaymentStatus$3(e eVar, String str, String str2, String str3, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$agreementId = str;
        this.$source = str2;
        this.$type = str3;
        this.$wasPaymentRetried = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoTopupSetupInteractor$getAutotopupPaymentStatus$3 autoTopupSetupInteractor$getAutotopupPaymentStatus$3 = new AutoTopupSetupInteractor$getAutotopupPaymentStatus$3(this.this$0, this.$agreementId, this.$source, this.$type, this.$wasPaymentRetried, continuation);
        autoTopupSetupInteractor$getAutotopupPaymentStatus$3.I$0 = ((tq11) obj).a;
        return autoTopupSetupInteractor$getAutotopupPaymentStatus$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        AutoTopupSetupInteractor$getAutotopupPaymentStatus$3 autoTopupSetupInteractor$getAutotopupPaymentStatus$3 = new AutoTopupSetupInteractor$getAutotopupPaymentStatus$3(this.this$0, this.$agreementId, this.$source, this.$type, this.$wasPaymentRetried, (Continuation) obj2);
        autoTopupSetupInteractor$getAutotopupPaymentStatus$3.I$0 = i;
        return autoTopupSetupInteractor$getAutotopupPaymentStatus$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AutoTopupSetupInteractor$getAutotopupPaymentStatus$3 autoTopupSetupInteractor$getAutotopupPaymentStatus$3;
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = this.I$0;
            com.ybsdk.feature.autotopup.internal.data.b bVar = this.this$0.a;
            String str = this.$agreementId;
            String str2 = this.$source;
            String str3 = this.$type;
            boolean z = this.$wasPaymentRetried;
            this.label = 1;
            autoTopupSetupInteractor$getAutotopupPaymentStatus$3 = this;
            e = bVar.e(str, str2, str3, z, i2, autoTopupSetupInteractor$getAutotopupPaymentStatus$3);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e = ((Result) obj).getValue();
            autoTopupSetupInteractor$getAutotopupPaymentStatus$3 = this;
        }
        Result result = new Result(e);
        e eVar = autoTopupSetupInteractor$getAutotopupPaymentStatus$3.this$0;
        Object value = result.getValue();
        if (value instanceof Result.Failure) {
            value = null;
        }
        iyd0 iyd0Var = (iyd0) value;
        eVar.d = iyd0Var != null ? (dqg) iyd0Var.a : null;
        return result;
    }
}
