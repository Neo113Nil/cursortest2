package com.yandex.go.design.compose.slot;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/design/compose/slot/SlotSize;", "", "Ly7m;", "size", "F", "a", "()F", "L", "M", "S", "XS", "ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SlotSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlotSize[] $VALUES;
    public static final SlotSize L;
    public static final SlotSize M;
    public static final SlotSize S;
    public static final SlotSize XS;
    private final float size;

    static {
        SlotSize slotSize = new SlotSize("L", 0, 56.0f);
        L = slotSize;
        SlotSize slotSize2 = new SlotSize("M", 1, 48.0f);
        M = slotSize2;
        SlotSize slotSize3 = new SlotSize("S", 2, 40.0f);
        S = slotSize3;
        SlotSize slotSize4 = new SlotSize("XS", 3, 32.0f);
        XS = slotSize4;
        SlotSize[] slotSizeArr = {slotSize, slotSize2, slotSize3, slotSize4};
        $VALUES = slotSizeArr;
        $ENTRIES = a.a(slotSizeArr);
    }

    public SlotSize(String str, int i, float f) {
        this.size = f;
    }

    public static SlotSize valueOf(String str) {
        return (SlotSize) Enum.valueOf(SlotSize.class, str);
    }

    public static SlotSize[] values() {
        return (SlotSize[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final float getSize() {
        return this.size;
    }
}
