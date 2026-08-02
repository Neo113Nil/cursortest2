package com.yandex.payment.divkit.api;

import defpackage.m5j0;
import defpackage.q76;
import defpackage.rvj0;
import defpackage.s490;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/yandex/payment/divkit/api/DivKitApi;", "", "Lm5j0;", "body", "Lretrofit2/Response;", "Lrvj0;", "a", "(Lm5j0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DivKitApi {
    @s490("render")
    Object a(@q76 m5j0 m5j0Var, Continuation<? super Response<rvj0>> continuation);
}
