package com.ybsdk.feature.partnerpayments.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/partnerpayments/api/PartnerPaymentsFeature$BindingStatus", "", "Lcom/ybsdk/feature/partnerpayments/api/PartnerPaymentsFeature$BindingStatus;", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "feature-partner-payments-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PartnerPaymentsFeature$BindingStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PartnerPaymentsFeature$BindingStatus[] $VALUES;
    public static final PartnerPaymentsFeature$BindingStatus ENABLED = new PartnerPaymentsFeature$BindingStatus("ENABLED", 0);
    public static final PartnerPaymentsFeature$BindingStatus DISABLED = new PartnerPaymentsFeature$BindingStatus("DISABLED", 1);

    private static final /* synthetic */ PartnerPaymentsFeature$BindingStatus[] $values() {
        return new PartnerPaymentsFeature$BindingStatus[]{ENABLED, DISABLED};
    }

    static {
        PartnerPaymentsFeature$BindingStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PartnerPaymentsFeature$BindingStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PartnerPaymentsFeature$BindingStatus valueOf(String str) {
        return (PartnerPaymentsFeature$BindingStatus) Enum.valueOf(PartnerPaymentsFeature$BindingStatus.class, str);
    }

    public static PartnerPaymentsFeature$BindingStatus[] values() {
        return (PartnerPaymentsFeature$BindingStatus[]) $VALUES.clone();
    }
}
