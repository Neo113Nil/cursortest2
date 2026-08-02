package com.ybsdk.core.utils;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/core/utils/ScreenDensity;", "", "multiplier", "", "<init>", "(Ljava/lang/String;IF)V", "getMultiplier", "()F", "HDPI", "XHDPI", "XXHDPI", "XXXHDPI", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScreenDensity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScreenDensity[] $VALUES;
    public static final ScreenDensity HDPI = new ScreenDensity("HDPI", 0, 1.5f);
    public static final ScreenDensity XHDPI = new ScreenDensity("XHDPI", 1, 2.0f);
    public static final ScreenDensity XXHDPI = new ScreenDensity("XXHDPI", 2, 3.0f);
    public static final ScreenDensity XXXHDPI = new ScreenDensity("XXXHDPI", 3, 4.0f);
    private final float multiplier;

    private static final /* synthetic */ ScreenDensity[] $values() {
        return new ScreenDensity[]{HDPI, XHDPI, XXHDPI, XXXHDPI};
    }

    static {
        ScreenDensity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ScreenDensity(String str, int i, float f) {
        this.multiplier = f;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ScreenDensity valueOf(String str) {
        return (ScreenDensity) Enum.valueOf(ScreenDensity.class, str);
    }

    public static ScreenDensity[] values() {
        return (ScreenDensity[]) $VALUES.clone();
    }

    public final float getMultiplier() {
        return this.multiplier;
    }
}
