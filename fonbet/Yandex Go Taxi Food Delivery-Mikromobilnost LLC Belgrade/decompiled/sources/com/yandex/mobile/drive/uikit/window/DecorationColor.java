package com.yandex.mobile.drive.uikit.window;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/mobile/drive/uikit/window/DecorationColor;", "", "Transparent", "SemiTransparent", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DecorationColor {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DecorationColor[] $VALUES;
    public static final DecorationColor SemiTransparent;
    public static final DecorationColor Transparent;

    static {
        DecorationColor decorationColor = new DecorationColor("Transparent", 0);
        Transparent = decorationColor;
        DecorationColor decorationColor2 = new DecorationColor("SemiTransparent", 1);
        SemiTransparent = decorationColor2;
        DecorationColor[] decorationColorArr = {decorationColor, decorationColor2};
        $VALUES = decorationColorArr;
        $ENTRIES = a.a(decorationColorArr);
    }

    public static DecorationColor valueOf(String str) {
        return (DecorationColor) Enum.valueOf(DecorationColor.class, str);
    }

    public static DecorationColor[] values() {
        return (DecorationColor[]) $VALUES.clone();
    }
}
