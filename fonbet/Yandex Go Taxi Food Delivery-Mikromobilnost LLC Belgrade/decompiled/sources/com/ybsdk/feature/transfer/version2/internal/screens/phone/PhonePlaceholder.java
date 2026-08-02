package com.ybsdk.feature.transfer.version2.internal.screens.phone;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/PhonePlaceholder;", "", "<init>", "(Ljava/lang/String;I)V", "PHONE_ONLY", "PHONE_OR_CONTACT", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhonePlaceholder {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PhonePlaceholder[] $VALUES;
    public static final PhonePlaceholder PHONE_ONLY = new PhonePlaceholder("PHONE_ONLY", 0);
    public static final PhonePlaceholder PHONE_OR_CONTACT = new PhonePlaceholder("PHONE_OR_CONTACT", 1);

    private static final /* synthetic */ PhonePlaceholder[] $values() {
        return new PhonePlaceholder[]{PHONE_ONLY, PHONE_OR_CONTACT};
    }

    static {
        PhonePlaceholder[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PhonePlaceholder(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PhonePlaceholder valueOf(String str) {
        return (PhonePlaceholder) Enum.valueOf(PhonePlaceholder.class, str);
    }

    public static PhonePlaceholder[] values() {
        return (PhonePlaceholder[]) $VALUES.clone();
    }
}
