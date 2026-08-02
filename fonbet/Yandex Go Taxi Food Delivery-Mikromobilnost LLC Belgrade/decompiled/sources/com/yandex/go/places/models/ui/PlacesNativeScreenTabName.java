package com.yandex.go.places.models.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/places/models/ui/PlacesNativeScreenTabName;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "PUBLICATIONS", "MAP", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesNativeScreenTabName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlacesNativeScreenTabName[] $VALUES;
    public static final PlacesNativeScreenTabName MAP;
    public static final PlacesNativeScreenTabName PUBLICATIONS;
    private final String id;

    static {
        PlacesNativeScreenTabName placesNativeScreenTabName = new PlacesNativeScreenTabName("PUBLICATIONS", 0, "publications");
        PUBLICATIONS = placesNativeScreenTabName;
        PlacesNativeScreenTabName placesNativeScreenTabName2 = new PlacesNativeScreenTabName("MAP", 1, PolicyMappingsExtension.MAP);
        MAP = placesNativeScreenTabName2;
        PlacesNativeScreenTabName[] placesNativeScreenTabNameArr = {placesNativeScreenTabName, placesNativeScreenTabName2};
        $VALUES = placesNativeScreenTabNameArr;
        $ENTRIES = a.a(placesNativeScreenTabNameArr);
    }

    public PlacesNativeScreenTabName(String str, int i, String str2) {
        this.id = str2;
    }

    public static PlacesNativeScreenTabName valueOf(String str) {
        return (PlacesNativeScreenTabName) Enum.valueOf(PlacesNativeScreenTabName.class, str);
    }

    public static PlacesNativeScreenTabName[] values() {
        return (PlacesNativeScreenTabName[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
