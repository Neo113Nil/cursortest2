package com.yandex.quark.network;

import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\nJ>\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H¦@¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H¦@¢\u0006\u0004\b\u000f\u0010\nJ4\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H¦@¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/quark/network/HttpClient;", "", "", "name", "Ljava/net/URL;", "url", "", "headers", "Lcom/yandex/quark/network/HttpResponse;", "get", "(Ljava/lang/String;Ljava/net/URL;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "body", "post", "(Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "head", "options", "", "timeoutMs", "Lzy11;", "setTimeout", "(I)V", "quark-core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface HttpClient {
    Object get(String str, URL url, Map<String, String> map, Continuation<? super HttpResponse> continuation);

    Object head(String str, URL url, Map<String, String> map, Continuation<? super HttpResponse> continuation);

    Object options(String str, URL url, Map<String, String> map, Continuation<? super HttpResponse> continuation);

    Object post(String str, URL url, byte[] bArr, Map<String, String> map, Continuation<? super HttpResponse> continuation);

    void setTimeout(int timeoutMs);
}
