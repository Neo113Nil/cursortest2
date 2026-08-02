package com.yandex.go.places.models.data.entities.network.bottom_panel;

import defpackage.av5;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.yd6;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/bottom_panel/BottomPanelButtonSize;", "", "Companion", "yd6", "BIG", "SMALL", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BottomPanelButtonSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BottomPanelButtonSize[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final BottomPanelButtonSize BIG;
    public static final yd6 Companion;
    public static final BottomPanelButtonSize SMALL;

    static {
        BottomPanelButtonSize bottomPanelButtonSize = new BottomPanelButtonSize("BIG", 0);
        BIG = bottomPanelButtonSize;
        BottomPanelButtonSize bottomPanelButtonSize2 = new BottomPanelButtonSize("SMALL", 1);
        SMALL = bottomPanelButtonSize2;
        BottomPanelButtonSize[] bottomPanelButtonSizeArr = {bottomPanelButtonSize, bottomPanelButtonSize2};
        $VALUES = bottomPanelButtonSizeArr;
        $ENTRIES = kotlin.enums.a.a(bottomPanelButtonSizeArr);
        Companion = new yd6();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new av5(19));
    }

    public static BottomPanelButtonSize valueOf(String str) {
        return (BottomPanelButtonSize) Enum.valueOf(BottomPanelButtonSize.class, str);
    }

    public static BottomPanelButtonSize[] values() {
        return (BottomPanelButtonSize[]) $VALUES.clone();
    }
}
