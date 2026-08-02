package com.yandex.smartcamera.arscene.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/smartcamera/arscene/ui/SlotsEnum;", "", "First", "Last", "Dependent", "smartcam-arscene_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
final class SlotsEnum {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlotsEnum[] $VALUES;
    public static final SlotsEnum Dependent;
    public static final SlotsEnum First;
    public static final SlotsEnum Last;

    static {
        SlotsEnum slotsEnum = new SlotsEnum("First", 0);
        First = slotsEnum;
        SlotsEnum slotsEnum2 = new SlotsEnum("Last", 1);
        Last = slotsEnum2;
        SlotsEnum slotsEnum3 = new SlotsEnum("Dependent", 2);
        Dependent = slotsEnum3;
        SlotsEnum[] slotsEnumArr = {slotsEnum, slotsEnum2, slotsEnum3};
        $VALUES = slotsEnumArr;
        $ENTRIES = kotlin.enums.a.a(slotsEnumArr);
    }

    public static SlotsEnum valueOf(String str) {
        return (SlotsEnum) Enum.valueOf(SlotsEnum.class, str);
    }

    public static SlotsEnum[] values() {
        return (SlotsEnum[]) $VALUES.clone();
    }
}
