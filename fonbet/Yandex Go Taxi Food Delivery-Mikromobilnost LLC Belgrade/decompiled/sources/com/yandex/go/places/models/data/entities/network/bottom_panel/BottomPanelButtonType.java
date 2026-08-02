package com.yandex.go.places.models.data.entities.network.bottom_panel;

import defpackage.av5;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.zd6;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/bottom_panel/BottomPanelButtonType;", "", "Companion", "zd6", "MAIN", "MINOR", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BottomPanelButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BottomPanelButtonType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final zd6 Companion;
    public static final BottomPanelButtonType MAIN;
    public static final BottomPanelButtonType MINOR;

    static {
        BottomPanelButtonType bottomPanelButtonType = new BottomPanelButtonType("MAIN", 0);
        MAIN = bottomPanelButtonType;
        BottomPanelButtonType bottomPanelButtonType2 = new BottomPanelButtonType("MINOR", 1);
        MINOR = bottomPanelButtonType2;
        BottomPanelButtonType[] bottomPanelButtonTypeArr = {bottomPanelButtonType, bottomPanelButtonType2};
        $VALUES = bottomPanelButtonTypeArr;
        $ENTRIES = kotlin.enums.a.a(bottomPanelButtonTypeArr);
        Companion = new zd6();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new av5(20));
    }

    public static BottomPanelButtonType valueOf(String str) {
        return (BottomPanelButtonType) Enum.valueOf(BottomPanelButtonType.class, str);
    }

    public static BottomPanelButtonType[] values() {
        return (BottomPanelButtonType[]) $VALUES.clone();
    }
}
