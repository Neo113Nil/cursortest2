package com.yandex.mapkit.search;

/* loaded from: classes15.dex */
public enum SuggestType {
    UNSPECIFIED(0),
    GEO(1),
    BIZ(2),
    TRANSIT(4),
    LINK(8);

    public final int value;

    SuggestType(int i) {
        this.value = i;
    }
}
