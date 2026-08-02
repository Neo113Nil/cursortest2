package com.ybsdk.feature.autotopup.internal.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.nzl0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lsk11;", "Lty3;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.domain.AutoTopupSetupInteractor$saveAutoTopup$2", f = "AutoTopupSetupInteractor.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupInteractor$saveAutoTopup$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $autoTopupId;
    final /* synthetic */ nzl0 $infoEntity;
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $verificationToken;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupInteractor$saveAutoTopup$2(e eVar, String str, String str2, String str3, nzl0 nzl0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$verificationToken = str;
        this.$operationId = str2;
        this.$autoTopupId = str3;
        this.$infoEntity = nzl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoTopupSetupInteractor$saveAutoTopup$2 autoTopupSetupInteractor$saveAutoTopup$2 = new AutoTopupSetupInteractor$saveAutoTopup$2(this.this$0, this.$verificationToken, this.$operationId, this.$autoTopupId, this.$infoEntity, continuation);
        autoTopupSetupInteractor$saveAutoTopup$2.L$0 = obj;
        return autoTopupSetupInteractor$saveAutoTopup$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupInteractor$saveAutoTopup$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object k;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            e eVar = this.this$0;
            com.ybsdk.feature.autotopup.internal.data.b bVar = eVar.a;
            String str2 = this.$verificationToken;
            String str3 = this.$operationId;
            String str4 = this.$autoTopupId;
            nzl0 nzl0Var = this.$infoEntity;
            boolean a = eVar.c.a();
            this.label = 1;
            k = bVar.k(str2, str3, str4, nzl0Var, str, a, this);
            if (k == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            k = ((Result) obj).getValue();
        }
        return new Result(k);
    }
}
