package com.ybsdk.feature.autotopup.internal.domain.analytics.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/domain/analytics/data/BottomSheetConfirmSaveDataEvent;", "", "eventName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "SAVED", "NOT_SAVED", "BACK", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BottomSheetConfirmSaveDataEvent {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BottomSheetConfirmSaveDataEvent[] $VALUES;
    private final String eventName;
    public static final BottomSheetConfirmSaveDataEvent SAVED = new BottomSheetConfirmSaveDataEvent("SAVED", 0, "saved");
    public static final BottomSheetConfirmSaveDataEvent NOT_SAVED = new BottomSheetConfirmSaveDataEvent("NOT_SAVED", 1, "not saved");
    public static final BottomSheetConfirmSaveDataEvent BACK = new BottomSheetConfirmSaveDataEvent("BACK", 2, "back");

    private static final /* synthetic */ BottomSheetConfirmSaveDataEvent[] $values() {
        return new BottomSheetConfirmSaveDataEvent[]{SAVED, NOT_SAVED, BACK};
    }

    static {
        BottomSheetConfirmSaveDataEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private BottomSheetConfirmSaveDataEvent(String str, int i, String str2) {
        this.eventName = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static BottomSheetConfirmSaveDataEvent valueOf(String str) {
        return (BottomSheetConfirmSaveDataEvent) Enum.valueOf(BottomSheetConfirmSaveDataEvent.class, str);
    }

    public static BottomSheetConfirmSaveDataEvent[] values() {
        return (BottomSheetConfirmSaveDataEvent[]) $VALUES.clone();
    }

    public final String getEventName() {
        return this.eventName;
    }
}
