package com.yandex.mapkit.map;

import com.yandex.mapkit.ConflictResolutionMode;

/* loaded from: classes15.dex */
public interface Sublayer {
    ConflictResolutionMode getConflictResolutionMode();

    SublayerFeatureType getFeatureType();

    SublayerFeatureFilter getFilter();

    String getLayerId();

    boolean isValid();

    boolean isVisible();

    void setConflictResolutionMode(ConflictResolutionMode conflictResolutionMode);

    void setFeatureType(SublayerFeatureType sublayerFeatureType);

    void setLayerId(String str);

    void setVisible(boolean z);
}
