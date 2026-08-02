package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver", "", "Lcom/ybsdk/core/analytics/generated/delegates/MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "ALLOW_CONTACTS", "CLIPBOARD", "MYSELF", "CONTACT_LIST", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver[] $VALUES;
    private final String originalValue;
    public static final MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver ALLOW_CONTACTS = new MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver("ALLOW_CONTACTS", 0, "allow_contacts");
    public static final MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver CLIPBOARD = new MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver("CLIPBOARD", 1, "clipboard");
    public static final MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver MYSELF = new MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver("MYSELF", 2, "myself");
    public static final MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver CONTACT_LIST = new MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver("CONTACT_LIST", 3, "contact_list");

    private static final /* synthetic */ MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver[] $values() {
        return new MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver[]{ALLOW_CONTACTS, CLIPBOARD, MYSELF, CONTACT_LIST};
    }

    static {
        MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver valueOf(String str) {
        return (MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver) Enum.valueOf(MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver.class, str);
    }

    public static MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver[] values() {
        return (MobileServicesEvents$PaymentMobileServicesReceiversClickReceiver[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
