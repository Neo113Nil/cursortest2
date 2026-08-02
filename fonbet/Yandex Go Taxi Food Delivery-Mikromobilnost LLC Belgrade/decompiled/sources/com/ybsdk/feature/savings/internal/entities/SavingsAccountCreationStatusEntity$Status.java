package com.ybsdk.feature.savings.internal.entities;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/ybsdk/feature/savings/internal/entities/SavingsAccountCreationStatusEntity$Status", "", "Lcom/ybsdk/feature/savings/internal/entities/SavingsAccountCreationStatusEntity$Status;", "<init>", "(Ljava/lang/String;I)V", "FAIL", "SUCCESS", "TIMEOUT", "PROCESSING", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsAccountCreationStatusEntity$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SavingsAccountCreationStatusEntity$Status[] $VALUES;
    public static final SavingsAccountCreationStatusEntity$Status FAIL = new SavingsAccountCreationStatusEntity$Status("FAIL", 0);
    public static final SavingsAccountCreationStatusEntity$Status SUCCESS = new SavingsAccountCreationStatusEntity$Status("SUCCESS", 1);
    public static final SavingsAccountCreationStatusEntity$Status TIMEOUT = new SavingsAccountCreationStatusEntity$Status("TIMEOUT", 2);
    public static final SavingsAccountCreationStatusEntity$Status PROCESSING = new SavingsAccountCreationStatusEntity$Status("PROCESSING", 3);

    private static final /* synthetic */ SavingsAccountCreationStatusEntity$Status[] $values() {
        return new SavingsAccountCreationStatusEntity$Status[]{FAIL, SUCCESS, TIMEOUT, PROCESSING};
    }

    static {
        SavingsAccountCreationStatusEntity$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SavingsAccountCreationStatusEntity$Status(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SavingsAccountCreationStatusEntity$Status valueOf(String str) {
        return (SavingsAccountCreationStatusEntity$Status) Enum.valueOf(SavingsAccountCreationStatusEntity$Status.class, str);
    }

    public static SavingsAccountCreationStatusEntity$Status[] values() {
        return (SavingsAccountCreationStatusEntity$Status[]) $VALUES.clone();
    }
}
