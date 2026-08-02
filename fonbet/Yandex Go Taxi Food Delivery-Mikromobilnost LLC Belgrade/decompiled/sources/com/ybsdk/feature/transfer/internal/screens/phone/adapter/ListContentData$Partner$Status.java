package com.ybsdk.feature.transfer.internal.screens.phone.adapter;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/ybsdk/feature/transfer/internal/screens/phone/adapter/ListContentData$Partner$Status", "", "Lcom/ybsdk/feature/transfer/internal/screens/phone/adapter/ListContentData$Partner$Status;", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "CHECKING", "NOT_FOUND", "FOUND", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ListContentData$Partner$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ListContentData$Partner$Status[] $VALUES;
    public static final ListContentData$Partner$Status DEFAULT = new ListContentData$Partner$Status("DEFAULT", 0);
    public static final ListContentData$Partner$Status CHECKING = new ListContentData$Partner$Status("CHECKING", 1);
    public static final ListContentData$Partner$Status NOT_FOUND = new ListContentData$Partner$Status("NOT_FOUND", 2);
    public static final ListContentData$Partner$Status FOUND = new ListContentData$Partner$Status("FOUND", 3);

    private static final /* synthetic */ ListContentData$Partner$Status[] $values() {
        return new ListContentData$Partner$Status[]{DEFAULT, CHECKING, NOT_FOUND, FOUND};
    }

    static {
        ListContentData$Partner$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ListContentData$Partner$Status(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ListContentData$Partner$Status valueOf(String str) {
        return (ListContentData$Partner$Status) Enum.valueOf(ListContentData$Partner$Status.class, str);
    }

    public static ListContentData$Partner$Status[] values() {
        return (ListContentData$Partner$Status[]) $VALUES.clone();
    }
}
