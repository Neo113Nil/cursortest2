package com.yandex.mobile.ads.network.interceptor;

import com.monetization.ads.network.core.Request;
import com.monetization.ads.network.core.toolbox.HttpResponse;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/mobile/ads/network/interceptor/NetworkInterceptor;", "", "Companion", "Chain", "com/yandex/mobile/ads/network/interceptor/c", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NetworkInterceptor {
    public static final c Companion = c.a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/mobile/ads/network/interceptor/NetworkInterceptor$Chain;", "", "Lcom/monetization/ads/network/core/Request;", "request", "Lcom/monetization/ads/network/core/toolbox/HttpResponse;", "proceed", "(Lcom/monetization/ads/network/core/Request;)Lcom/monetization/ads/network/core/toolbox/HttpResponse;", "getRequest", "()Lcom/monetization/ads/network/core/Request;", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Chain {
        Request<?> getRequest();

        HttpResponse proceed(Request<?> request);
    }
}
