package com.ybsdk.feature.partnerselection.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/ybsdk/feature/partnerselection/api/PartnerWithAction$Status", "", "Lcom/ybsdk/feature/partnerselection/api/PartnerWithAction$Status;", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "CHECKING", "NOT_FOUND", "FOUND", "feature-partner-selection-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PartnerWithAction$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PartnerWithAction$Status[] $VALUES;
    public static final PartnerWithAction$Status DEFAULT = new PartnerWithAction$Status("DEFAULT", 0);
    public static final PartnerWithAction$Status CHECKING = new PartnerWithAction$Status("CHECKING", 1);
    public static final PartnerWithAction$Status NOT_FOUND = new PartnerWithAction$Status("NOT_FOUND", 2);
    public static final PartnerWithAction$Status FOUND = new PartnerWithAction$Status("FOUND", 3);

    private static final /* synthetic */ PartnerWithAction$Status[] $values() {
        return new PartnerWithAction$Status[]{DEFAULT, CHECKING, NOT_FOUND, FOUND};
    }

    static {
        PartnerWithAction$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PartnerWithAction$Status(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PartnerWithAction$Status valueOf(String str) {
        return (PartnerWithAction$Status) Enum.valueOf(PartnerWithAction$Status.class, str);
    }

    public static PartnerWithAction$Status[] values() {
        return (PartnerWithAction$Status[]) $VALUES.clone();
    }
}
