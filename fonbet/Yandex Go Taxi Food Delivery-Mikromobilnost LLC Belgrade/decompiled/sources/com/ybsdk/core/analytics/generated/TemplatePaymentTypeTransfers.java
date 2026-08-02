package com.ybsdk.core.analytics.generated;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/core/analytics/generated/TemplatePaymentTypeTransfers;", "", "originalValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getOriginalValue", "()Ljava/lang/String;", "PHONE", "TELECOM", "MOBILE", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TemplatePaymentTypeTransfers {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TemplatePaymentTypeTransfers[] $VALUES;
    private final String originalValue;
    public static final TemplatePaymentTypeTransfers PHONE = new TemplatePaymentTypeTransfers("PHONE", 0, "phone");
    public static final TemplatePaymentTypeTransfers TELECOM = new TemplatePaymentTypeTransfers("TELECOM", 1, "telecom");
    public static final TemplatePaymentTypeTransfers MOBILE = new TemplatePaymentTypeTransfers("MOBILE", 2, "mobile");

    private static final /* synthetic */ TemplatePaymentTypeTransfers[] $values() {
        return new TemplatePaymentTypeTransfers[]{PHONE, TELECOM, MOBILE};
    }

    static {
        TemplatePaymentTypeTransfers[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TemplatePaymentTypeTransfers(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TemplatePaymentTypeTransfers valueOf(String str) {
        return (TemplatePaymentTypeTransfers) Enum.valueOf(TemplatePaymentTypeTransfers.class, str);
    }

    public static TemplatePaymentTypeTransfers[] values() {
        return (TemplatePaymentTypeTransfers[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
