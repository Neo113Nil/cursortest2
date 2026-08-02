package com.yandex.go.shortcuts.dto.response;

import defpackage.bee0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.yud0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/PositionOverMap;", "", "Companion", "bee0", "CENTER_START", "CENTER_END", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PositionOverMap {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PositionOverMap[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final PositionOverMap CENTER_END;
    public static final PositionOverMap CENTER_START;
    public static final bee0 Companion;

    static {
        PositionOverMap positionOverMap = new PositionOverMap("CENTER_START", 0);
        CENTER_START = positionOverMap;
        PositionOverMap positionOverMap2 = new PositionOverMap("CENTER_END", 1);
        CENTER_END = positionOverMap2;
        PositionOverMap[] positionOverMapArr = {positionOverMap, positionOverMap2};
        $VALUES = positionOverMapArr;
        $ENTRIES = kotlin.enums.a.a(positionOverMapArr);
        Companion = new bee0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new yud0(29));
    }

    public static PositionOverMap valueOf(String str) {
        return (PositionOverMap) Enum.valueOf(PositionOverMap.class, str);
    }

    public static PositionOverMap[] values() {
        return (PositionOverMap[]) $VALUES.clone();
    }
}
