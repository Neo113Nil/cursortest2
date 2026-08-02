package com.ybsdk.feature.autotopup.internal.domain;

import com.ybsdk.feature.autotopup.internal.network.dto.SaveAutoTopupRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lsk11;", "Lty3;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.domain.AutoTopupSetupInteractor$saveAutoTopup$4", f = "AutoTopupSetupInteractor.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupInteractor$saveAutoTopup$4 extends SuspendLambda implements wls {
    final /* synthetic */ String $operationId;
    final /* synthetic */ SaveAutoTopupRequest $saveAutoTopupRequest;
    final /* synthetic */ String $verificationToken;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupInteractor$saveAutoTopup$4(e eVar, String str, String str2, SaveAutoTopupRequest saveAutoTopupRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$verificationToken = str;
        this.$operationId = str2;
        this.$saveAutoTopupRequest = saveAutoTopupRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoTopupSetupInteractor$saveAutoTopup$4 autoTopupSetupInteractor$saveAutoTopup$4 = new AutoTopupSetupInteractor$saveAutoTopup$4(this.this$0, this.$verificationToken, this.$operationId, this.$saveAutoTopupRequest, continuation);
        autoTopupSetupInteractor$saveAutoTopup$4.L$0 = obj;
        return autoTopupSetupInteractor$saveAutoTopup$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupInteractor$saveAutoTopup$4) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            e eVar = this.this$0;
            com.ybsdk.feature.autotopup.internal.data.b bVar = eVar.a;
            boolean a = eVar.c.a();
            String str2 = this.$verificationToken;
            String str3 = this.$operationId;
            SaveAutoTopupRequest saveAutoTopupRequest = this.$saveAutoTopupRequest;
            this.label = 1;
            m = bVar.m(str2, str3, saveAutoTopupRequest, str, a, this);
            if (m == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            m = ((Result) obj).getValue();
        }
        return new Result(m);
    }
}
