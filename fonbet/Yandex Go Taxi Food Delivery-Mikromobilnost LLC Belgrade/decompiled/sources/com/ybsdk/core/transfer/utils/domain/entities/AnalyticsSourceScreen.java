package com.ybsdk.core.transfer.utils.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/core/transfer/utils/domain/entities/AnalyticsSourceScreen;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSFER", "TOPUP", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnalyticsSourceScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AnalyticsSourceScreen[] $VALUES;
    public static final AnalyticsSourceScreen TRANSFER = new AnalyticsSourceScreen("TRANSFER", 0);
    public static final AnalyticsSourceScreen TOPUP = new AnalyticsSourceScreen("TOPUP", 1);

    private static final /* synthetic */ AnalyticsSourceScreen[] $values() {
        return new AnalyticsSourceScreen[]{TRANSFER, TOPUP};
    }

    static {
        AnalyticsSourceScreen[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AnalyticsSourceScreen(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsSourceScreen valueOf(String str) {
        return (AnalyticsSourceScreen) Enum.valueOf(AnalyticsSourceScreen.class, str);
    }

    public static AnalyticsSourceScreen[] values() {
        return (AnalyticsSourceScreen[]) $VALUES.clone();
    }
}
