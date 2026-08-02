package com.yandex.mobile.ads.network.interceptor;

import com.monetization.ads.network.core.Request;
import com.monetization.ads.network.core.toolbox.HttpResponse;
import com.yandex.mobile.ads.network.interceptor.NetworkInterceptor;
import defpackage.uk71;

/* loaded from: classes7.dex */
public final class a implements NetworkInterceptor.Chain {
    public final uk71 a;

    public a(uk71 uk71Var) {
        this.a = uk71Var;
    }

    @Override // com.yandex.mobile.ads.network.interceptor.NetworkInterceptor.Chain
    public final Request getRequest() {
        return this.a.a;
    }

    @Override // com.yandex.mobile.ads.network.interceptor.NetworkInterceptor.Chain
    public final HttpResponse proceed(Request request) {
        return (HttpResponse) this.a.b.invoke(request);
    }
}
