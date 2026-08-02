package com.yandex.mapkit.places.mrc;

/* loaded from: classes15.dex */
public interface MrcPhotoLayer {

    public enum VisibleLayer {
        AUTOMOTIVE,
        PEDESTRIAN
    }

    void disable();

    void enable(VisibleLayer visibleLayer);

    VisibleLayer getVisibleLayer();

    boolean isValid();
}
