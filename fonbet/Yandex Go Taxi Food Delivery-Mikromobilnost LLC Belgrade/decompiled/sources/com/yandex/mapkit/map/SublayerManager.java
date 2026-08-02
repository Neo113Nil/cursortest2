package com.yandex.mapkit.map;

/* loaded from: classes15.dex */
public interface SublayerManager {
    Sublayer appendSublayer(String str, SublayerFeatureType sublayerFeatureType);

    Integer findFirstOf(String str);

    Integer findFirstOf(String str, SublayerFeatureType sublayerFeatureType);

    Sublayer get(int i);

    Sublayer insertSublayerAfter(int i, String str, SublayerFeatureType sublayerFeatureType);

    Sublayer insertSublayerBefore(int i, String str, SublayerFeatureType sublayerFeatureType);

    boolean isValid();

    void moveAfter(int i, int i2);

    void moveBefore(int i, int i2);

    void moveToEnd(int i);

    void remove(int i);

    int size();
}
