package com.ybsdk.feature.pdf.internal.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/pdf/internal/entities/SplitContractDraftStatus$Status", "", "Lcom/ybsdk/feature/pdf/internal/entities/SplitContractDraftStatus$Status;", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "PROCESSING", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SplitContractDraftStatus$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SplitContractDraftStatus$Status[] $VALUES;
    public static final SplitContractDraftStatus$Status SUCCESS = new SplitContractDraftStatus$Status("SUCCESS", 0);
    public static final SplitContractDraftStatus$Status PROCESSING = new SplitContractDraftStatus$Status("PROCESSING", 1);

    private static final /* synthetic */ SplitContractDraftStatus$Status[] $values() {
        return new SplitContractDraftStatus$Status[]{SUCCESS, PROCESSING};
    }

    static {
        SplitContractDraftStatus$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SplitContractDraftStatus$Status(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SplitContractDraftStatus$Status valueOf(String str) {
        return (SplitContractDraftStatus$Status) Enum.valueOf(SplitContractDraftStatus$Status.class, str);
    }

    public static SplitContractDraftStatus$Status[] values() {
        return (SplitContractDraftStatus$Status[]) $VALUES.clone();
    }
}
