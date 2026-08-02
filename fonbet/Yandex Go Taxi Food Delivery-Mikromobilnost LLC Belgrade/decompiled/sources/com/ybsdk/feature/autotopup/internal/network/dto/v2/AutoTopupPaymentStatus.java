package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "PAUSED", "DISABLING", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupPaymentStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoTopupPaymentStatus[] $VALUES;
    public static final AutoTopupPaymentStatus ENABLED = new AutoTopupPaymentStatus("ENABLED", 0);
    public static final AutoTopupPaymentStatus DISABLED = new AutoTopupPaymentStatus("DISABLED", 1);
    public static final AutoTopupPaymentStatus PAUSED = new AutoTopupPaymentStatus("PAUSED", 2);
    public static final AutoTopupPaymentStatus DISABLING = new AutoTopupPaymentStatus("DISABLING", 3);

    private static final /* synthetic */ AutoTopupPaymentStatus[] $values() {
        return new AutoTopupPaymentStatus[]{ENABLED, DISABLED, PAUSED, DISABLING};
    }

    static {
        AutoTopupPaymentStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AutoTopupPaymentStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AutoTopupPaymentStatus valueOf(String str) {
        return (AutoTopupPaymentStatus) Enum.valueOf(AutoTopupPaymentStatus.class, str);
    }

    public static AutoTopupPaymentStatus[] values() {
        return (AutoTopupPaymentStatus[]) $VALUES.clone();
    }
}
