package com.yandex.plus.home.api.prefetch;

import defpackage.djg0;
import defpackage.qg21;
import defpackage.rru0;
import defpackage.rvj0;
import defpackage.wqs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/home/api/prefetch/PrefetchApi;", "", "", "userAgent", "Lretrofit2/Response;", "Lrvj0;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "url", "a", "plus-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PrefetchApi {
    @rru0
    @wqs
    Object a(@qg21 String str, Continuation<? super Response<rvj0>> continuation);

    @rru0
    @wqs("prefetch.txt")
    Object b(@djg0("ua") String str, Continuation<? super Response<rvj0>> continuation);
}
