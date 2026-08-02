package com.yandex.go.shortcuts.models;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.s2y;
import defpackage.wwx;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/models/LayoutType;", "", "Companion", "s2y", "LinearGrid", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LayoutType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LayoutType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final s2y Companion;
    public static final LayoutType LinearGrid;

    static {
        LayoutType layoutType = new LayoutType("LinearGrid", 0);
        LinearGrid = layoutType;
        LayoutType[] layoutTypeArr = {layoutType};
        $VALUES = layoutTypeArr;
        $ENTRIES = kotlin.enums.a.a(layoutTypeArr);
        Companion = new s2y();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wwx(6));
    }

    public static LayoutType valueOf(String str) {
        return (LayoutType) Enum.valueOf(LayoutType.class, str);
    }

    public static LayoutType[] values() {
        return (LayoutType[]) $VALUES.clone();
    }
}
