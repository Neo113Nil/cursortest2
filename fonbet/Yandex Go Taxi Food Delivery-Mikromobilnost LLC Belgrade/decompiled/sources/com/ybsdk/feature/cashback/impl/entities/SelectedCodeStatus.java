package com.ybsdk.feature.cashback.impl.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/entities/SelectedCodeStatus;", "", "<init>", "(Ljava/lang/String;I)V", "OK", "DATA_OUTDATED", "UNKNOWN", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectedCodeStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SelectedCodeStatus[] $VALUES;
    public static final SelectedCodeStatus OK = new SelectedCodeStatus("OK", 0);
    public static final SelectedCodeStatus DATA_OUTDATED = new SelectedCodeStatus("DATA_OUTDATED", 1);
    public static final SelectedCodeStatus UNKNOWN = new SelectedCodeStatus("UNKNOWN", 2);

    private static final /* synthetic */ SelectedCodeStatus[] $values() {
        return new SelectedCodeStatus[]{OK, DATA_OUTDATED, UNKNOWN};
    }

    static {
        SelectedCodeStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SelectedCodeStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SelectedCodeStatus valueOf(String str) {
        return (SelectedCodeStatus) Enum.valueOf(SelectedCodeStatus.class, str);
    }

    public static SelectedCodeStatus[] values() {
        return (SelectedCodeStatus[]) $VALUES.clone();
    }
}
