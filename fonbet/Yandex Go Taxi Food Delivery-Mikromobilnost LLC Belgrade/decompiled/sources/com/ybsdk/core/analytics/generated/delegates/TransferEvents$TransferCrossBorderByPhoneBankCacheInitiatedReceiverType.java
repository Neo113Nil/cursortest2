package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType", "", "Lcom/ybsdk/core/analytics/generated/delegates/TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "CLIPBOARD", "MYSELF", "CONTACT_LIST", "MANUAL", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType[] $VALUES;
    private final String originalValue;
    public static final TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType CLIPBOARD = new TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType("CLIPBOARD", 0, "clipboard");
    public static final TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType MYSELF = new TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType("MYSELF", 1, "myself");
    public static final TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType CONTACT_LIST = new TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType("CONTACT_LIST", 2, "contact_list");
    public static final TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType MANUAL = new TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType("MANUAL", 3, "manual");

    private static final /* synthetic */ TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType[] $values() {
        return new TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType[]{CLIPBOARD, MYSELF, CONTACT_LIST, MANUAL};
    }

    static {
        TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType valueOf(String str) {
        return (TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType) Enum.valueOf(TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType.class, str);
    }

    public static TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType[] values() {
        return (TransferEvents$TransferCrossBorderByPhoneBankCacheInitiatedReceiverType[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
