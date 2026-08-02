package com.yandex.go.places.impl.navigation.common.stack;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/impl/navigation/common/stack/PlacesNavigationEntry$Source", "", "Lcom/yandex/go/places/impl/navigation/common/stack/PlacesNavigationEntry$Source;", "STARTER", "INTERNAL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesNavigationEntry$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlacesNavigationEntry$Source[] $VALUES;
    public static final PlacesNavigationEntry$Source INTERNAL;
    public static final PlacesNavigationEntry$Source STARTER;

    static {
        PlacesNavigationEntry$Source placesNavigationEntry$Source = new PlacesNavigationEntry$Source("STARTER", 0);
        STARTER = placesNavigationEntry$Source;
        PlacesNavigationEntry$Source placesNavigationEntry$Source2 = new PlacesNavigationEntry$Source("INTERNAL", 1);
        INTERNAL = placesNavigationEntry$Source2;
        PlacesNavigationEntry$Source[] placesNavigationEntry$SourceArr = {placesNavigationEntry$Source, placesNavigationEntry$Source2};
        $VALUES = placesNavigationEntry$SourceArr;
        $ENTRIES = kotlin.enums.a.a(placesNavigationEntry$SourceArr);
    }

    public static PlacesNavigationEntry$Source valueOf(String str) {
        return (PlacesNavigationEntry$Source) Enum.valueOf(PlacesNavigationEntry$Source.class, str);
    }

    public static PlacesNavigationEntry$Source[] values() {
        return (PlacesNavigationEntry$Source[]) $VALUES.clone();
    }
}
