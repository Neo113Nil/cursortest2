package com.ybsdk.feature.card.internal.repositories;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.card.internal.network.CardApi;
import com.ybsdk.feature.card.internal.network.dto.CardRenameRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lv7l;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.repositories.CardRepository$getCardRenameScreen$2", f = "CardRepository.kt", l = {315, 316}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardRepository$getCardRenameScreen$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $trustCardId;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepository$getCardRenameScreen$2(b bVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$trustCardId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CardRepository$getCardRenameScreen$2(this.this$0, this.$trustCardId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CardRepository$getCardRenameScreen$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r5 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object f;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            CardApi cardApi = this.this$0.a;
            CardRenameRequest cardRenameRequest = new CardRenameRequest(this.$trustCardId);
            this.label = 1;
            f = cardApi.f(cardRenameRequest, this);
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
            f = ((Result) obj).getValue();
        }
        Throwable a = Result.a(f);
        if (a == null) {
            CardRepository$getCardRenameScreen$2$1$1 cardRepository$getCardRenameScreen$2$1$1 = CardRepository$getCardRenameScreen$2$1$1.b;
            this.label = 2;
            failure = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) f, cardRepository$getCardRenameScreen$2$1$1, this);
        } else {
            failure = new Result.Failure(a);
        }
        return new Result(failure);
    }
}
