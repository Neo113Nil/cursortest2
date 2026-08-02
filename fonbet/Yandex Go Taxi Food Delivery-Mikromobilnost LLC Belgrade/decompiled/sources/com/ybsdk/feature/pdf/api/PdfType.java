package com.ybsdk.feature.pdf.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/feature/pdf/api/PdfType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "REPORT", "DEPOSIT_TERMS", "CREDIT_TERMS", "feature-pdf-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PdfType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PdfType[] $VALUES;
    private final String value;
    public static final PdfType REPORT = new PdfType("REPORT", 0, "report");
    public static final PdfType DEPOSIT_TERMS = new PdfType("DEPOSIT_TERMS", 1, "deposit_terms");
    public static final PdfType CREDIT_TERMS = new PdfType("CREDIT_TERMS", 2, "credit_terms");

    private static final /* synthetic */ PdfType[] $values() {
        return new PdfType[]{REPORT, DEPOSIT_TERMS, CREDIT_TERMS};
    }

    static {
        PdfType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PdfType(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PdfType valueOf(String str) {
        return (PdfType) Enum.valueOf(PdfType.class, str);
    }

    public static PdfType[] values() {
        return (PdfType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
