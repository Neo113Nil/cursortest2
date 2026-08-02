package com.yandex.delivery.utils.dialogmanager.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/delivery/utils/dialogmanager/api/DialogType;", "", "POPUP", "MODAL", "dialogmanager"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DialogType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DialogType[] $VALUES;
    public static final DialogType MODAL;
    public static final DialogType POPUP;

    static {
        DialogType dialogType = new DialogType("POPUP", 0);
        POPUP = dialogType;
        DialogType dialogType2 = new DialogType("MODAL", 1);
        MODAL = dialogType2;
        DialogType[] dialogTypeArr = {dialogType, dialogType2};
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
