package com.ybsdk.feature.card.internal.repositories;

import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.f;
import com.ybsdk.feature.card.internal.network.CardApi;
import com.ybsdk.feature.card.internal.network.dto.SetCardStatusScreenRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.ynb1;
import defpackage.yu50;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Lsk11;", "Lk2r0;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.repositories.CardRepository$setCardStatusScreen$2", f = "CardRepository.kt", l = {327, 338}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardRepository$setCardStatusScreen$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $actionType;
    final /* synthetic */ String $cardId;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepository$setCardStatusScreen$2(b bVar, String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$cardId = str;
        this.$actionType = str2;
        this.$idempotencyToken = str3;
        this.$verificationToken = str4;
        this.$operationId = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CardRepository$setCardStatusScreen$2(this.this$0, this.$cardId, this.$actionType, this.$idempotencyToken, this.$verificationToken, this.$operationId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CardRepository$setCardStatusScreen$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        if (r10 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r11 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object k;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            CardApi cardApi = this.this$0.a;
            SetCardStatusScreenRequest setCardStatusScreenRequest = new SetCardStatusScreenRequest(this.$cardId, this.$actionType);
            String str = this.$idempotencyToken;
            Map<String, String> b = ynb1.b(new Pair(yu50.a, this.$verificationToken), new Pair(yu50.e, this.$operationId));
            this.label = 1;
            k = cardApi.k(setCardStatusScreenRequest, str, b, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                failure = ((Result) obj).getValue();
                return new Result(failure);
            }
            kotlin.b.b(obj);
            k = ((Result) obj).getValue();
        }
        Throwable a = Result.a(k);
        if (a == null) {
            CardRepository$setCardStatusScreen$2$1$1 cardRepository$setCardStatusScreen$2$1$1 = new CardRepository$setCardStatusScreen$2$1$1(2, null);
            this.label = 2;
            failure = f.c((TwoFactorAuthResponse) k, cardRepository$setCardStatusScreen$2$1$1, this);
        } else {
            failure = new Result.Failure(a);
        }
        return new Result(failure);
    }
}
