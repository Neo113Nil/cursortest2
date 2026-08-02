package com.ybsdk.feature.autotopup.internal.domain;

import defpackage.mvg;
import defpackage.mw3;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "idempotencyToken"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.autotopup.internal.domain.AutoTopupInteractorImpl$updateAutoTopupOffer$result$1", f = "AutoTopupInteractorImpl.kt", l = {28, 30}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupInteractorImpl$updateAutoTopupOffer$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $autoTopUpId;
    final /* synthetic */ mw3 $newOfferState;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupInteractorImpl$updateAutoTopupOffer$result$1(String str, a aVar, mw3 mw3Var, Continuation continuation) {
        super(2, continuation);
        this.$autoTopUpId = str;
        this.this$0 = aVar;
        this.$newOfferState = mw3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoTopupInteractorImpl$updateAutoTopupOffer$result$1 autoTopupInteractorImpl$updateAutoTopupOffer$result$1 = new AutoTopupInteractorImpl$updateAutoTopupOffer$result$1(this.$autoTopUpId, this.this$0, this.$newOfferState, continuation);
        autoTopupInteractorImpl$updateAutoTopupOffer$result$1.L$0 = obj;
        return autoTopupInteractorImpl$updateAutoTopupOffer$result$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupInteractorImpl$updateAutoTopupOffer$result$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r5 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r5 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            String str2 = this.$autoTopUpId;
            a aVar = this.this$0;
            if (str2 == null) {
                com.ybsdk.feature.autotopup.internal.data.a aVar2 = aVar.a;
                mw3 mw3Var = this.$newOfferState;
                this.label = 1;
                b = aVar2.a(mw3Var, str, this);
            } else {
                com.ybsdk.feature.autotopup.internal.data.a aVar3 = aVar.a;
                mw3 mw3Var2 = this.$newOfferState;
                this.label = 2;
                b = aVar3.b(str2, mw3Var2, str, this);
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        return new Result(b);
    }
}
