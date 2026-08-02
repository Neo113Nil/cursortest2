package com.yandex.go.design.compose.icon;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/design/compose/icon/IconSpotSize;", "", "Ly7m;", "size", "F", "b", "()F", "iconSize", "a", "L", "M", "S", "ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class IconSpotSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IconSpotSize[] $VALUES;
    public static final IconSpotSize L;
    public static final IconSpotSize M;
    public static final IconSpotSize S;
    private final float iconSize;
    private final float size;

    static {
        IconSpotSize iconSpotSize = new IconSpotSize(64.0f, 24.0f, 0, "L");
        L = iconSpotSize;
        IconSpotSize iconSpotSize2 = new IconSpotSize(40.0f, 24.0f, 1, "M");
        M = iconSpotSize2;
        IconSpotSize iconSpotSize3 = new IconSpotSize(32.0f, 20.0f, 2, "S");
        S = iconSpotSize3;
        IconSpotSize[] iconSpotSizeArr = {iconSpotSize, iconSpotSize2, iconSpotSize3};
        $VALUES = iconSpotSizeArr;
        $ENTRIES = a.a(iconSpotSizeArr);
    }

    public IconSpotSize(float f, float f2, int i, String str) {
        this.size = f;
        this.iconSize = f2;
    }

    public static IconSpotSize valueOf(String str) {
        return (IconSpotSize) Enum.valueOf(IconSpotSize.class, str);
    }

    public static IconSpotSize[] values() {
        return (IconSpotSize[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final float getIconSize() {
        return this.iconSize;
    }

    /* renamed from: b, reason: from getter */
    public final float getSize() {
        return this.size;
    }
}
