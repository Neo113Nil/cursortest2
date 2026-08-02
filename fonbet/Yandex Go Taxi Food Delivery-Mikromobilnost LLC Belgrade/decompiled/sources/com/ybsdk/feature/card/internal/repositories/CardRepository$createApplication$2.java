package com.ybsdk.feature.card.internal.repositories;

import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.f;
import com.ybsdk.feature.card.internal.network.CardApi;
import com.ybsdk.feature.card.internal.network.dto.CreateApplicationRequest;
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
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Lsk11;", "Lu3f;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.repositories.CardRepository$createApplication$2", f = "CardRepository.kt", l = {294, IDialogId.DIALOG_PIN_WND_IDD_PASSWORD}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardRepository$createApplication$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $cardId;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepository$createApplication$2(b bVar, String str, String str2, String str3, String str4, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$cardId = str;
        this.$idempotencyToken = str2;
        this.$operationId = str3;
        this.$verificationToken = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CardRepository$createApplication$2(this.this$0, this.$cardId, this.$idempotencyToken, this.$operationId, this.$verificationToken, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CardRepository$createApplication$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        if (r9 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r10 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            CardApi cardApi = this.this$0.a;
            CreateApplicationRequest createApplicationRequest = new CreateApplicationRequest(this.$cardId);
            String str = this.$idempotencyToken;
            Map<String, String> b2 = ynb1.b(new Pair(yu50.e, this.$operationId), new Pair(yu50.a, this.$verificationToken));
            this.label = 1;
            b = cardApi.b(createApplicationRequest, str, b2, this);
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
            b = ((Result) obj).getValue();
        }
        Throwable a = Result.a(b);
        if (a == null) {
            CardRepository$createApplication$2$1$1 cardRepository$createApplication$2$1$1 = CardRepository$createApplication$2$1$1.a;
            this.label = 2;
            failure = f.a((TwoFactorAuthResponse) b, cardRepository$createApplication$2$1$1, this);
        } else {
            failure = new Result.Failure(a);
        }
        return new Result(failure);
    }
}
