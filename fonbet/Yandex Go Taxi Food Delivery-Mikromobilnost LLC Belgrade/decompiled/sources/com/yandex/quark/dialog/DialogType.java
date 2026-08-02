package com.yandex.quark.dialog;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/quark/dialog/DialogType;", "", "SKILL", "DEDICATED", "ENGLISH_TUTOR", "CHERRY", "UNKNOWN", "quark-contracts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DialogType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DialogType[] $VALUES;
    public static final DialogType CHERRY;
    public static final DialogType DEDICATED;
    public static final DialogType ENGLISH_TUTOR;
    public static final DialogType SKILL;
    public static final DialogType UNKNOWN;

    static {
        DialogType dialogType = new DialogType("SKILL", 0);
        SKILL = dialogType;
        DialogType dialogType2 = new DialogType("DEDICATED", 1);
        DEDICATED = dialogType2;
        DialogType dialogType3 = new DialogType("ENGLISH_TUTOR", 2);
        ENGLISH_TUTOR = dialogType3;
        DialogType dialogType4 = new DialogType("CHERRY", 3);
        CHERRY = dialogType4;
        DialogType dialogType5 = new DialogType("UNKNOWN", 4);
        UNKNOWN = dialogType5;
        DialogType[] dialogTypeArr = {dialogType, dialogType2, dialogType3, dialogType4, dialogType5};
        $VALUES = dialogTypeArr;
        $ENTRIES = a.a(dialogTypeArr);
    }

    public static DialogType valueOf(String str) {
        return (DialogType) Enum.valueOf(DialogType.class, str);
    }

    public static DialogType[] values() {
        return (DialogType[]) $VALUES.clone();
    }
}
