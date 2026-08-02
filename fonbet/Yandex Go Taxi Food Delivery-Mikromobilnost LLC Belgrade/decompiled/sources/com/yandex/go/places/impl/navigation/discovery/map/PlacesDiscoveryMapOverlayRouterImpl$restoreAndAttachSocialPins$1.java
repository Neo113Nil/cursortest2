package com.yandex.go.places.impl.navigation.discovery.map;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.impl.navigation.discovery.map.PlacesDiscoveryMapOverlayRouterImpl", f = "PlacesDiscoveryMapOverlayRouterImpl.kt", l = {399, 401}, m = "restoreAndAttachSocialPins", v = 2)
/* loaded from: classes13.dex */
final class PlacesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.m0(this.this$0, false, this);
    }
}
