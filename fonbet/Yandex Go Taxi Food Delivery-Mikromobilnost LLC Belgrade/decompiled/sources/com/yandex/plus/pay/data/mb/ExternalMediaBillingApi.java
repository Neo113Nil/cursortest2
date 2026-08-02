package com.yandex.plus.pay.data.mb;

import com.yandex.plus.home.common.network.NetworkResponse;
import com.yandex.plus.pay.data.mb.dto.PaymentSubmitResultDto;
import com.yandex.plus.pay.data.mb.dto.SubscriptionInfoDto;
import defpackage.b0f;
import defpackage.djg0;
import defpackage.e7c;
import defpackage.fue0;
import defpackage.h0f;
import defpackage.jka0;
import defpackage.jyz0;
import defpackage.kia0;
import defpackage.lue0;
import defpackage.q76;
import defpackage.qia0;
import defpackage.r6c;
import defpackage.rt21;
import defpackage.s490;
import defpackage.wqs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001f\u0010 J,\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00022\b\b\u0001\u0010!\u001a\u00020\u000b2\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b$\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/data/mb/ExternalMediaBillingApi;", "", "Lcom/yandex/plus/home/common/network/NetworkResponse;", "Lrt21;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljka0;", "request", "Lcom/yandex/plus/pay/data/mb/dto/PaymentSubmitResultDto;", "d", "(Ljka0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "synchronizationTypes", "Lcom/yandex/plus/pay/data/mb/dto/SubscriptionInfoDto;", "e", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqia0;", "Lkia0;", "c", "(Lqia0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lh0f;", "Lb0f;", "a", "(Lh0f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Le7c;", "Lr6c;", "h", "(Le7c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Llue0;", "Lfue0;", "g", "(Llue0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "language", "invoiceId", "Ljyz0;", "b", "pay-sdk-data-mediabilling-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ExternalMediaBillingApi {
    @s490("api/v1/widget/checkout/screen/counter-offer")
    Object a(@q76 h0f h0fVar, Continuation<? super NetworkResponse<b0f>> continuation);

    @s490("api/v2/widget/checkout/screen/pay-card-screen/availability")
    Object b(@djg0("language") String str, @djg0("invoiceId") String str2, Continuation<? super NetworkResponse<jyz0>> continuation);

    @s490("api/v1/widget/configurator/screen")
    Object c(@q76 qia0 qia0Var, Continuation<? super NetworkResponse<kia0>> continuation);

    @s490("api/v14/mobile/subscriptions/google-play/submit-receipt")
    Object d(@q76 jka0 jka0Var, Continuation<? super NetworkResponse<PaymentSubmitResultDto>> continuation);

    @wqs("api/v14/mobile/subscriptions/status")
    Object e(@djg0("id") String str, @djg0("synchronizationTypes") String str2, Continuation<? super NetworkResponse<SubscriptionInfoDto>> continuation);

    @wqs("api/v14/users/status")
    Object f(Continuation<? super NetworkResponse<rt21>> continuation);

    @s490("api/v1/widget/checkout/screen/presale")
    Object g(@q76 lue0 lue0Var, Continuation<? super NetworkResponse<fue0>> continuation);

    @s490("api/v1/widget/checkout/screen/closing-offer")
    Object h(@q76 e7c e7cVar, Continuation<? super NetworkResponse<r6c>> continuation);
}
