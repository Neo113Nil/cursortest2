package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation;

import defpackage.h3y;
import defpackage.o3l0;
import defpackage.r3l0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/navigation/RouteHandlerProviderImpl;", "Lr3l0;", "Lh3y;", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/navigation/FlexRouteHandler;", "lazyRouteHandler", "<init>", "(Lh3y;)V", "Lo3l0;", "get", "()Lo3l0;", "Lh3y;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RouteHandlerProviderImpl implements r3l0 {
    private final h3y lazyRouteHandler;

    public RouteHandlerProviderImpl(h3y h3yVar) {
        this.lazyRouteHandler = h3yVar;
    }

    @Override // defpackage.r3l0
    public o3l0 get() {
        return (o3l0) this.lazyRouteHandler.get();
    }
}
