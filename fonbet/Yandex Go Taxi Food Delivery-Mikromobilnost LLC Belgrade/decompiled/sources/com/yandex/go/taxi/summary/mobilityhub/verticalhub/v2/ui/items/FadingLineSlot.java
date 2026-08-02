package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.items;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/ui/items/FadingLineSlot;", "", "Measure", "Content", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final class FadingLineSlot {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FadingLineSlot[] $VALUES;
    public static final FadingLineSlot Content;
    public static final FadingLineSlot Measure;

    static {
        FadingLineSlot fadingLineSlot = new FadingLineSlot("Measure", 0);
        Measure = fadingLineSlot;
        FadingLineSlot fadingLineSlot2 = new FadingLineSlot("Content", 1);
        Content = fadingLineSlot2;
        FadingLineSlot[] fadingLineSlotArr = {fadingLineSlot, fadingLineSlot2};
        $VALUES = fadingLineSlotArr;
        $ENTRIES = kotlin.enums.a.a(fadingLineSlotArr);
    }

    public static FadingLineSlot valueOf(String str) {
        return (FadingLineSlot) Enum.valueOf(FadingLineSlot.class, str);
    }

    public static FadingLineSlot[] values() {
        return (FadingLineSlot[]) $VALUES.clone();
    }
}
