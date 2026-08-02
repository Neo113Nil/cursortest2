package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.g6x;
import defpackage.hv90;
import defpackage.k6x;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/module/flex/network/FlexPayloadExtendersModule;", "", "<init>", "()V", "Lk6x;", "jasonStateStore", "Lhv90;", "provideJasonStatePayloadExtender", "(Lk6x;)Lhv90;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlexPayloadExtendersModule {
    public final hv90 provideJasonStatePayloadExtender(k6x jasonStateStore) {
        return new g6x(0, jasonStateStore);
    }
}
