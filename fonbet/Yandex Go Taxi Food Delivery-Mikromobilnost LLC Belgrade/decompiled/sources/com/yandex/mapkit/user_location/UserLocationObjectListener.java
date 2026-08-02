package com.yandex.mapkit.user_location;

import com.yandex.mapkit.layers.ObjectEvent;

/* loaded from: classes15.dex */
public interface UserLocationObjectListener {
    void onObjectAdded(UserLocationView userLocationView);

    void onObjectRemoved(UserLocationView userLocationView);

    void onObjectUpdated(UserLocationView userLocationView, ObjectEvent objectEvent);
}
