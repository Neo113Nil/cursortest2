package com.ybsdk.feature.dashboard.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/feature/dashboard/api/NfcSupportChecker$Status", "", "Lcom/ybsdk/feature/dashboard/api/NfcSupportChecker$Status;", "<init>", "(Ljava/lang/String;I)V", JCP.RAW_PREFIX, "SPLIT_PROMO", "FULL", "feature-dashboard-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NfcSupportChecker$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NfcSupportChecker$Status[] $VALUES;
    public static final NfcSupportChecker$Status NONE = new NfcSupportChecker$Status(JCP.RAW_PREFIX, 0);
    public static final NfcSupportChecker$Status SPLIT_PROMO = new NfcSupportChecker$Status("SPLIT_PROMO", 1);
    public static final NfcSupportChecker$Status FULL = new NfcSupportChecker$Status("FULL", 2);

    private static final /* synthetic */ NfcSupportChecker$Status[] $values() {
        return new NfcSupportChecker$Status[]{NONE, SPLIT_PROMO, FULL};
    }

    static {
        NfcSupportChecker$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private NfcSupportChecker$Status(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NfcSupportChecker$Status valueOf(String str) {
        return (NfcSupportChecker$Status) Enum.valueOf(NfcSupportChecker$Status.class, str);
    }

    public static NfcSupportChecker$Status[] values() {
        return (NfcSupportChecker$Status[]) $VALUES.clone();
    }
}
