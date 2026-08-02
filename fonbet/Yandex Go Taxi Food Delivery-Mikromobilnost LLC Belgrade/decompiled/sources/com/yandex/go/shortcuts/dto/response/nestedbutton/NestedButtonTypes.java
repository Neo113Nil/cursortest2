package com.yandex.go.shortcuts.dto.response.nestedbutton;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.rk50;
import defpackage.ym50;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/nestedbutton/NestedButtonTypes;", "", "Companion", "ym50", "TRAIL_BUTTON", "LEAD_BUTTON", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NestedButtonTypes {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NestedButtonTypes[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ym50 Companion;
    public static final NestedButtonTypes LEAD_BUTTON;
    public static final NestedButtonTypes TRAIL_BUTTON;

    static {
        NestedButtonTypes nestedButtonTypes = new NestedButtonTypes("TRAIL_BUTTON", 0);
        TRAIL_BUTTON = nestedButtonTypes;
        NestedButtonTypes nestedButtonTypes2 = new NestedButtonTypes("LEAD_BUTTON", 1);
        LEAD_BUTTON = nestedButtonTypes2;
        NestedButtonTypes[] nestedButtonTypesArr = {nestedButtonTypes, nestedButtonTypes2};
        $VALUES = nestedButtonTypesArr;
        $ENTRIES = kotlin.enums.a.a(nestedButtonTypesArr);
        Companion = new ym50();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rk50(9));
    }

    public static NestedButtonTypes valueOf(String str) {
        return (NestedButtonTypes) Enum.valueOf(NestedButtonTypes.class, str);
    }

    public static NestedButtonTypes[] values() {
        return (NestedButtonTypes[]) $VALUES.clone();
    }
}
