package com.yandex.plus.pay.data.acquisition;

import com.yandex.plus.home.common.network.NetworkResponse;
import defpackage.djg0;
import defpackage.j8d0;
import defpackage.q76;
import defpackage.s490;
import defpackage.x7d0;
import defpackage.x9d0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \f2\u00020\u0001:\u0001\rJ6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/data/acquisition/PlusPayAcquisitionApi;", "", "", "sessionId", "", "isOneClickSupported", "Lj8d0;", "body", "Lcom/yandex/plus/home/common/network/NetworkResponse;", "Lx9d0;", "getSmartOffers", "(Ljava/lang/String;ZLj8d0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "x7d0", "pay-sdk-data-acquisition-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PlusPayAcquisitionApi {
    public static final x7d0 Companion = x7d0.a;

    @s490("/api/v2/offers")
    Object getSmartOffers(@djg0("eventSessionId") String str, @djg0("oneClickSupported") boolean z, @q76 j8d0 j8d0Var, Continuation<? super NetworkResponse<x9d0>> continuation);
}
