package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupWidgetDto;
import com.ybsdk.feature.autotopup.api.dto.PaymentMethodInfoDto;
import com.ybsdk.feature.autotopup.internal.network.AutoTopupApi;
import com.ybsdk.feature.autotopup.internal.network.dto.UpdateAutoTopupRequest;
import defpackage.mvg;
import defpackage.mw3;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/UpdateAutoTopupResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupRepository$updateAutoTopup$2", f = "AutoTopupRepository.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupRepository$updateAutoTopup$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $autoTopUpId;
    final /* synthetic */ mw3 $autoTopupOffer;
    final /* synthetic */ String $idempotencyToken;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupRepository$updateAutoTopup$2(a aVar, mw3 mw3Var, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$autoTopupOffer = mw3Var;
        this.$autoTopUpId = str;
        this.$idempotencyToken = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AutoTopupRepository$updateAutoTopup$2(this.this$0, this.$autoTopupOffer, this.$autoTopUpId, this.$idempotencyToken, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AutoTopupRepository$updateAutoTopup$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        AutoTopupWidgetDto.SwitchState switchState = null;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            AutoTopupApi autoTopupApi = aVar.a;
            mw3 mw3Var = this.$autoTopupOffer;
            String str = this.$autoTopUpId;
            aVar.getClass();
            PaymentMethodInfoDto paymentMethodInfoDto = mw3Var.j;
            Money money = mw3Var.f;
            Money money2 = mw3Var.g;
            Boolean bool = mw3Var.d;
            if (bool != null) {
                switchState = bool.booleanValue() ? AutoTopupWidgetDto.SwitchState.ON : AutoTopupWidgetDto.SwitchState.OFF;
            }
            UpdateAutoTopupRequest updateAutoTopupRequest = new UpdateAutoTopupRequest(str, paymentMethodInfoDto, money, money2, switchState);
            String str2 = this.$idempotencyToken;
            this.label = 1;
            b = autoTopupApi.b(updateAutoTopupRequest, str2, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        return new Result(b);
    }
}
