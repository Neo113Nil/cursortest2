package com.yandex.go.places.api.navigation;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/places/api/navigation/OpenNavigatorActionSubtype;", "", "GO_VIA_ACTION", "GO_TO_ACTION", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OpenNavigatorActionSubtype {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OpenNavigatorActionSubtype[] $VALUES;
    public static final OpenNavigatorActionSubtype GO_TO_ACTION;
    public static final OpenNavigatorActionSubtype GO_VIA_ACTION;

    static {
        OpenNavigatorActionSubtype openNavigatorActionSubtype = new OpenNavigatorActionSubtype("GO_VIA_ACTION", 0);
        GO_VIA_ACTION = openNavigatorActionSubtype;
        OpenNavigatorActionSubtype openNavigatorActionSubtype2 = new OpenNavigatorActionSubtype("GO_TO_ACTION", 1);
        GO_TO_ACTION = openNavigatorActionSubtype2;
        OpenNavigatorActionSubtype[] openNavigatorActionSubtypeArr = {openNavigatorActionSubtype, openNavigatorActionSubtype2};
        $VALUES = openNavigatorActionSubtypeArr;
        $ENTRIES = a.a(openNavigatorActionSubtypeArr);
    }

    public static OpenNavigatorActionSubtype valueOf(String str) {
        return (OpenNavigatorActionSubtype) Enum.valueOf(OpenNavigatorActionSubtype.class, str);
    }

    public static OpenNavigatorActionSubtype[] values() {
        return (OpenNavigatorActionSubtype[]) $VALUES.clone();
    }
}
