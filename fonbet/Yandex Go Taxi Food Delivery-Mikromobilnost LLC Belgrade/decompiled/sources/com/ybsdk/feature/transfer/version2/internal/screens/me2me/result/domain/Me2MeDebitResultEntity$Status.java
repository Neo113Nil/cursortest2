package com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/ybsdk/feature/transfer/version2/internal/screens/me2me/result/domain/Me2MeDebitResultEntity$Status", "", "Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/result/domain/Me2MeDebitResultEntity$Status;", "<init>", "(Ljava/lang/String;I)V", "PROCESSING", "FAILED", "SUCCESS", "TIMEOUT", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Me2MeDebitResultEntity$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Me2MeDebitResultEntity$Status[] $VALUES;
    public static final Me2MeDebitResultEntity$Status PROCESSING = new Me2MeDebitResultEntity$Status("PROCESSING", 0);
    public static final Me2MeDebitResultEntity$Status FAILED = new Me2MeDebitResultEntity$Status("FAILED", 1);
    public static final Me2MeDebitResultEntity$Status SUCCESS = new Me2MeDebitResultEntity$Status("SUCCESS", 2);
    public static final Me2MeDebitResultEntity$Status TIMEOUT = new Me2MeDebitResultEntity$Status("TIMEOUT", 3);

    private static final /* synthetic */ Me2MeDebitResultEntity$Status[] $values() {
        return new Me2MeDebitResultEntity$Status[]{PROCESSING, FAILED, SUCCESS, TIMEOUT};
    }

    static {
        Me2MeDebitResultEntity$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private Me2MeDebitResultEntity$Status(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static Me2MeDebitResultEntity$Status valueOf(String str) {
        return (Me2MeDebitResultEntity$Status) Enum.valueOf(Me2MeDebitResultEntity$Status.class, str);
    }

    public static Me2MeDebitResultEntity$Status[] values() {
        return (Me2MeDebitResultEntity$Status[]) $VALUES.clone();
    }
}
