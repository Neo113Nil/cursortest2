package com.ybsdk.common.repositiories.card;

import com.ybsdk.common.repositiories.applications.poller.ApplicationStatusFailedException;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.api.dto.CardClaimingStatusResponse;
import defpackage.mvg;
import defpackage.n2e0;
import defpackage.ny61;
import defpackage.p2e0;
import defpackage.q2e0;
import defpackage.va8;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/card/api/dto/CardClaimingStatusResponse;", "it", "Ls2e0;", "<anonymous>", "(Lcom/ybsdk/feature/card/api/dto/CardClaimingStatusResponse;)Ls2e0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.repositiories.card.CardApplicationsRepositoryImpl$startActivationStatusPolling$2", f = "CardApplicationsRepositoryImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CardApplicationsRepositoryImpl$startActivationStatusPolling$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardApplicationsRepositoryImpl$startActivationStatusPolling$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardApplicationsRepositoryImpl$startActivationStatusPolling$2 cardApplicationsRepositoryImpl$startActivationStatusPolling$2 = new CardApplicationsRepositoryImpl$startActivationStatusPolling$2(this.this$0, continuation);
        cardApplicationsRepositoryImpl$startActivationStatusPolling$2.L$0 = obj;
        return cardApplicationsRepositoryImpl$startActivationStatusPolling$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardApplicationsRepositoryImpl$startActivationStatusPolling$2) create((CardClaimingStatusResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        CardClaimingStatusResponse cardClaimingStatusResponse = (CardClaimingStatusResponse) this.L$0;
        this.this$0.getClass();
        int i = va8.a[cardClaimingStatusResponse.getStatus().ordinal()];
        if (i == 1) {
            Text.Empty empty = Text.Empty.INSTANCE;
            return new n2e0(new ApplicationStatusFailedException(empty, empty, (String) null, (Themes) null, (List) null, 60));
        }
        if (i != 2) {
            return new p2e0(null, 15, null, null);
        }
        if (cardClaimingStatusResponse.getCardId() != null) {
            return new q2e0(cardClaimingStatusResponse, true);
        }
        Text.Empty empty2 = Text.Empty.INSTANCE;
        return new n2e0(new ApplicationStatusFailedException(empty2, empty2, (String) null, (Themes) null, (List) null, 60));
    }
}
