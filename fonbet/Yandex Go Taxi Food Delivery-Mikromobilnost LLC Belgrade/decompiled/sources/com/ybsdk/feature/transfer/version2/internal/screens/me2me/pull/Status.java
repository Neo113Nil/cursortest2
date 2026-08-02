package com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/pull/Status;", "", "<init>", "(Ljava/lang/String;I)V", "INITIAL", "CONFIRMED", "CONFIRMING_PROGRESS", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Status[] $VALUES;
    public static final Status INITIAL = new Status("INITIAL", 0);
    public static final Status CONFIRMED = new Status("CONFIRMED", 1);
    public static final Status CONFIRMING_PROGRESS = new Status("CONFIRMING_PROGRESS", 2);

    private static final /* synthetic */ Status[] $values() {
        return new Status[]{INITIAL, CONFIRMED, CONFIRMING_PROGRESS};
    }

    static {
        Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private Status(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }
}
