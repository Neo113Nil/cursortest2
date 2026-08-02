package com.ybsdk.feature.partnerselection.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/partnerselection/api/PartnerSelectionFeature$Companion$Entry", "", "Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionFeature$Companion$Entry;", "<init>", "(Ljava/lang/String;I)V", "TRANSFER", "EXTERNAL_BANK", "feature-partner-selection-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PartnerSelectionFeature$Companion$Entry {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PartnerSelectionFeature$Companion$Entry[] $VALUES;
    public static final PartnerSelectionFeature$Companion$Entry TRANSFER = new PartnerSelectionFeature$Companion$Entry("TRANSFER", 0);
    public static final PartnerSelectionFeature$Companion$Entry EXTERNAL_BANK = new PartnerSelectionFeature$Companion$Entry("EXTERNAL_BANK", 1);

    private static final /* synthetic */ PartnerSelectionFeature$Companion$Entry[] $values() {
        return new PartnerSelectionFeature$Companion$Entry[]{TRANSFER, EXTERNAL_BANK};
    }

    static {
        PartnerSelectionFeature$Companion$Entry[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PartnerSelectionFeature$Companion$Entry(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PartnerSelectionFeature$Companion$Entry valueOf(String str) {
        return (PartnerSelectionFeature$Companion$Entry) Enum.valueOf(PartnerSelectionFeature$Companion$Entry.class, str);
    }

    public static PartnerSelectionFeature$Companion$Entry[] values() {
        return (PartnerSelectionFeature$Companion$Entry[]) $VALUES.clone();
    }
}
