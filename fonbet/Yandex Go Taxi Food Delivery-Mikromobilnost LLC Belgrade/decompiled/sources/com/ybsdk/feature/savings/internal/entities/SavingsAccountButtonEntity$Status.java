package com.ybsdk.feature.savings.internal.entities;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/ybsdk/feature/savings/internal/entities/SavingsAccountButtonEntity$Status", "", "Lcom/ybsdk/feature/savings/internal/entities/SavingsAccountButtonEntity$Status;", "<init>", "(Ljava/lang/String;I)V", "LOCKED", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsAccountButtonEntity$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SavingsAccountButtonEntity$Status[] $VALUES;
    public static final SavingsAccountButtonEntity$Status LOCKED = new SavingsAccountButtonEntity$Status("LOCKED", 0);

    private static final /* synthetic */ SavingsAccountButtonEntity$Status[] $values() {
        return new SavingsAccountButtonEntity$Status[]{LOCKED};
    }

    static {
        SavingsAccountButtonEntity$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SavingsAccountButtonEntity$Status(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SavingsAccountButtonEntity$Status valueOf(String str) {
        return (SavingsAccountButtonEntity$Status) Enum.valueOf(SavingsAccountButtonEntity$Status.class, str);
    }

    public static SavingsAccountButtonEntity$Status[] values() {
        return (SavingsAccountButtonEntity$Status[]) $VALUES.clone();
    }
}
