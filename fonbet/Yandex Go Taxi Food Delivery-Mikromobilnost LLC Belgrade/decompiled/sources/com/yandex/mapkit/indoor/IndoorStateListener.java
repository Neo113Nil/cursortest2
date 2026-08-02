package com.yandex.mapkit.indoor;

/* loaded from: classes7.dex */
public interface IndoorStateListener {
    void onActiveLevelChanged(String str);

    void onActivePlanFocused(IndoorPlan indoorPlan);

    void onActivePlanLeft();
}
