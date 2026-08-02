package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.interceptor.ExtraQueriesInterceptor;
import defpackage.dh5;
import defpackage.p8w;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/module/flex/network/FlexInterceptorsModule;", "", "<init>", "()V", "Ldh5;", "extraQueriesProvider", "Lp8w;", "provideExtraQueryInterceptor", "(Ldh5;)Lp8w;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlexInterceptorsModule {
    public final p8w provideExtraQueryInterceptor(dh5 extraQueriesProvider) {
        return new ExtraQueriesInterceptor(extraQueriesProvider);
    }
}
