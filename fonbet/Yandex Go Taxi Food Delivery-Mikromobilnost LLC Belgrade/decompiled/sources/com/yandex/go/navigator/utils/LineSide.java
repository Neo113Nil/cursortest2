package com.yandex.go.navigator.utils;

import defpackage.k4o;
import defpackage.vhy;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/navigator/utils/LineSide;", "", "Companion", "vhy", "Right", "Left", "OnLine", "All", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LineSide {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LineSide[] $VALUES;
    public static final LineSide All;
    public static final vhy Companion;
    public static final LineSide Left;
    public static final LineSide OnLine;
    public static final LineSide Right;

    static {
        LineSide lineSide = new LineSide("Right", 0);
        Right = lineSide;
        LineSide lineSide2 = new LineSide("Left", 1);
        Left = lineSide2;
        LineSide lineSide3 = new LineSide("OnLine", 2);
        OnLine = lineSide3;
        LineSide lineSide4 = new LineSide("All", 3);
        All = lineSide4;
        LineSide[] lineSideArr = {lineSide, lineSide2, lineSide3, lineSide4};
        $VALUES = lineSideArr;
        $ENTRIES = kotlin.enums.a.a(lineSideArr);
        Companion = new vhy();
    }

    public static LineSide valueOf(String str) {
        return (LineSide) Enum.valueOf(LineSide.class, str);
    }

    public static LineSide[] values() {
        return (LineSide[]) $VALUES.clone();
    }
}
