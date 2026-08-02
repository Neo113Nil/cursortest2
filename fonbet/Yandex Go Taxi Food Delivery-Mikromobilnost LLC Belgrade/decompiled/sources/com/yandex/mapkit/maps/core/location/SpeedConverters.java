package com.yandex.mapkit.maps.core.location;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/mapkit/maps/core/location/SpeedConverters;", "", "<init>", "()V", "MS_KMH_COEFFICIENT", "", "msToKmh", "ms", "kmhToMs", "kmh", "exported-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SpeedConverters {
    public static final SpeedConverters INSTANCE = new SpeedConverters();
    private static final double MS_KMH_COEFFICIENT = 3.6d;

    private SpeedConverters() {
    }

    public final double kmhToMs(double kmh) {
        return kmh / MS_KMH_COEFFICIENT;
    }

    public final double msToKmh(double ms) {
        return ms * MS_KMH_COEFFICIENT;
    }
}
