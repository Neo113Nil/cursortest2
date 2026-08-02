package com.yandex.go.design.compose.taxi.shared.pin;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/design/compose/taxi/shared/pin/PinSize;", "", "Ly7m;", "elementSize", "F", "a", "()F", "iconSize", "getIconSize-D9Ej5fM", "L", "M", "S", "XS", "ui_extended"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PinSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinSize[] $VALUES;
    public static final PinSize L;
    public static final PinSize M;
    public static final PinSize S;
    public static final PinSize XS;
    private final float elementSize;
    private final float iconSize;

    static {
        PinSize pinSize = new PinSize(44.0f, 28.0f, 0, "L");
        L = pinSize;
        PinSize pinSize2 = new PinSize(40.0f, 24.0f, 1, "M");
        M = pinSize2;
        PinSize pinSize3 = new PinSize(28.0f, 20.0f, 2, "S");
        S = pinSize3;
        PinSize pinSize4 = new PinSize(20.0f, 16.0f, 3, "XS");
        XS = pinSize4;
        PinSize[] pinSizeArr = {pinSize, pinSize2, pinSize3, pinSize4};
        $VALUES = pinSizeArr;
        $ENTRIES = a.a(pinSizeArr);
    }

    public PinSize(float f, float f2, int i, String str) {
        this.elementSize = f;
        this.iconSize = f2;
    }

    public static PinSize valueOf(String str) {
        return (PinSize) Enum.valueOf(PinSize.class, str);
    }

    public static PinSize[] values() {
        return (PinSize[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final float getElementSize() {
        return this.elementSize;
    }
}
