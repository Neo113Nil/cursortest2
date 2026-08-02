package com.yandex.go.blur.core;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/blur/core/BlurEffect$Progressive$TileMode", "", "Lcom/yandex/go/blur/core/BlurEffect$Progressive$TileMode;", "Clamp", "Decal", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlurEffect$Progressive$TileMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BlurEffect$Progressive$TileMode[] $VALUES;
    public static final BlurEffect$Progressive$TileMode Clamp;
    public static final BlurEffect$Progressive$TileMode Decal;

    static {
        BlurEffect$Progressive$TileMode blurEffect$Progressive$TileMode = new BlurEffect$Progressive$TileMode("Clamp", 0);
        Clamp = blurEffect$Progressive$TileMode;
        BlurEffect$Progressive$TileMode blurEffect$Progressive$TileMode2 = new BlurEffect$Progressive$TileMode("Decal", 1);
        Decal = blurEffect$Progressive$TileMode2;
        BlurEffect$Progressive$TileMode[] blurEffect$Progressive$TileModeArr = {blurEffect$Progressive$TileMode, blurEffect$Progressive$TileMode2};
        $VALUES = blurEffect$Progressive$TileModeArr;
        $ENTRIES = a.a(blurEffect$Progressive$TileModeArr);
    }

    public static BlurEffect$Progressive$TileMode valueOf(String str) {
        return (BlurEffect$Progressive$TileMode) Enum.valueOf(BlurEffect$Progressive$TileMode.class, str);
    }

    public static BlurEffect$Progressive$TileMode[] values() {
        return (BlurEffect$Progressive$TileMode[]) $VALUES.clone();
    }
}
