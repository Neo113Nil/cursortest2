package com.yandex.go.loyalty.impl.common.domain;

import com.yandex.go.loyalty.impl.selector.data.model.GeoState;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class LoyaltyGeoStateRepository$geoLocationStateFlow$2 extends PropertyReference1Impl {
    public static final LoyaltyGeoStateRepository$geoLocationStateFlow$2 b = new LoyaltyGeoStateRepository$geoLocationStateFlow$2("zoneName", 0, "getZoneName()Ljava/lang/String;", GeoState.class);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, defpackage.jgx
    public final Object get(Object obj) {
        return ((GeoState) obj).b;
    }
}
