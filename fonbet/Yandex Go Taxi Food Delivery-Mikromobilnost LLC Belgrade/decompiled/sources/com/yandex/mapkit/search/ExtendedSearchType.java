package com.yandex.mapkit.search;

/* loaded from: classes15.dex */
public enum ExtendedSearchType {
    TRANSIT(4),
    COLLECTIONS(8),
    DIRECT(16),
    GOODS(32),
    POINTS_OF_INTEREST(64),
    MASS_TRANSIT(128),
    ONLINE_ORGS(256);

    public final int value;

    ExtendedSearchType(int i) {
        this.value = i;
    }
}
