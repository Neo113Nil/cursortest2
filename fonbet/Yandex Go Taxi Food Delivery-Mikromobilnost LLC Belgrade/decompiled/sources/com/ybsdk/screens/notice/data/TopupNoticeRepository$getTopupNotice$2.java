package com.ybsdk.screens.notice.data;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.topup.TopupNoticeContentRequest;
import com.ybsdk.screens.notice.domain.entities.TopupValueEntity;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/screens/divbottomsheet/DivBottomSheetResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.screens.notice.data.TopupNoticeRepository$getTopupNotice$2", f = "TopupNoticeRepository.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TopupNoticeRepository$getTopupNotice$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $paymentMethodId;
    final /* synthetic */ TopupValueEntity $topupValueEntity;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopupNoticeRepository$getTopupNotice$2(a aVar, String str, TopupValueEntity topupValueEntity, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$paymentMethodId = str;
        this.$topupValueEntity = topupValueEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TopupNoticeRepository$getTopupNotice$2(this.this$0, this.$paymentMethodId, this.$topupValueEntity, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TopupNoticeRepository$getTopupNotice$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object k;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Api api = this.this$0.a;
            TopupNoticeContentRequest topupNoticeContentRequest = new TopupNoticeContentRequest(this.$paymentMethodId, new Money(this.$topupValueEntity.getMoney(), this.$topupValueEntity.getCurrency()));
            this.label = 1;
            k = api.k(topupNoticeContentRequest, this);
            if (k == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            k = ((Result) obj).getValue();
        }
        return new Result(k);
    }
}
