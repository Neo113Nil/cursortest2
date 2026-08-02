package com.ybsdk.feature.card.internal.repositories;

import com.ybsdk.core.utils.dto.OldTwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.f;
import com.ybsdk.feature.card.internal.network.PciDssCardApi;
import com.ybsdk.feature.card.internal.network.dto.YbCardSetPinRequest;
import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.of11;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Lsk11;", "Lzy11;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.repositories.CardRepository$setYbCardPin$2", f = "CardRepository.kt", l = {BlendingGradientView.BASE_ALPHA}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardRepository$setYbCardPin$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $cardId;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $pin;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepository$setYbCardPin$2(b bVar, String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$verificationToken = str;
        this.$operationId = str2;
        this.$cardId = str3;
        this.$pin = str4;
        this.$idempotencyToken = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CardRepository$setYbCardPin$2(this.this$0, this.$verificationToken, this.$operationId, this.$cardId, this.$pin, this.$idempotencyToken, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CardRepository$setYbCardPin$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            PciDssCardApi pciDssCardApi = this.this$0.b;
            Map<String, String> b = ynb1.b(new Pair(yu50.a, this.$verificationToken), new Pair(yu50.e, this.$operationId));
            YbCardSetPinRequest ybCardSetPinRequest = new YbCardSetPinRequest(this.$cardId, this.$pin);
            String str = this.$idempotencyToken;
            this.label = 1;
            c = pciDssCardApi.c(b, ybCardSetPinRequest, str, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = ((Result) obj).getValue();
        }
        Throwable a = Result.a(c);
        return new Result(a == null ? f.b((OldTwoFactorAuthResponse) c, new of11(7)) : new Result.Failure(a));
    }
}
