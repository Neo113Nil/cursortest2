package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/PdfEvents$LoadPdfScreenOpenedType", "", "Lcom/ybsdk/core/analytics/generated/delegates/PdfEvents$LoadPdfScreenOpenedType;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "REPORT", "DEPOSIT_TERMS", "CREDIT_TERMS", "DOCUMENT_BY_ID", "SPLIT_CONTRACT_DRAFT", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PdfEvents$LoadPdfScreenOpenedType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PdfEvents$LoadPdfScreenOpenedType[] $VALUES;
    private final String originalValue;
    public static final PdfEvents$LoadPdfScreenOpenedType REPORT = new PdfEvents$LoadPdfScreenOpenedType("REPORT", 0, "report");
    public static final PdfEvents$LoadPdfScreenOpenedType DEPOSIT_TERMS = new PdfEvents$LoadPdfScreenOpenedType("DEPOSIT_TERMS", 1, "deposit_terms");
    public static final PdfEvents$LoadPdfScreenOpenedType CREDIT_TERMS = new PdfEvents$LoadPdfScreenOpenedType("CREDIT_TERMS", 2, "credit_terms");
    public static final PdfEvents$LoadPdfScreenOpenedType DOCUMENT_BY_ID = new PdfEvents$LoadPdfScreenOpenedType("DOCUMENT_BY_ID", 3, "document_by_id");
    public static final PdfEvents$LoadPdfScreenOpenedType SPLIT_CONTRACT_DRAFT = new PdfEvents$LoadPdfScreenOpenedType("SPLIT_CONTRACT_DRAFT", 4, "split_contract_draft");

    private static final /* synthetic */ PdfEvents$LoadPdfScreenOpenedType[] $values() {
        return new PdfEvents$LoadPdfScreenOpenedType[]{REPORT, DEPOSIT_TERMS, CREDIT_TERMS, DOCUMENT_BY_ID, SPLIT_CONTRACT_DRAFT};
    }

    static {
        PdfEvents$LoadPdfScreenOpenedType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PdfEvents$LoadPdfScreenOpenedType(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PdfEvents$LoadPdfScreenOpenedType valueOf(String str) {
        return (PdfEvents$LoadPdfScreenOpenedType) Enum.valueOf(PdfEvents$LoadPdfScreenOpenedType.class, str);
    }

    public static PdfEvents$LoadPdfScreenOpenedType[] values() {
        return (PdfEvents$LoadPdfScreenOpenedType[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
