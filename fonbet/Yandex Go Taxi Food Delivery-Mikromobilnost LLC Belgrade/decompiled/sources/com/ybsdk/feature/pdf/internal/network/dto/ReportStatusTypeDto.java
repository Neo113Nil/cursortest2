package com.ybsdk.feature.pdf.internal.network.dto;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/ReportStatusTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "PROCESSING", "SUCCESS", "FAIL", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReportStatusTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ReportStatusTypeDto[] $VALUES;
    public static final ReportStatusTypeDto PROCESSING = new ReportStatusTypeDto("PROCESSING", 0);
    public static final ReportStatusTypeDto SUCCESS = new ReportStatusTypeDto("SUCCESS", 1);
    public static final ReportStatusTypeDto FAIL = new ReportStatusTypeDto("FAIL", 2);

    private static final /* synthetic */ ReportStatusTypeDto[] $values() {
        return new ReportStatusTypeDto[]{PROCESSING, SUCCESS, FAIL};
    }

    static {
        ReportStatusTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ReportStatusTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ReportStatusTypeDto valueOf(String str) {
        return (ReportStatusTypeDto) Enum.valueOf(ReportStatusTypeDto.class, str);
    }

    public static ReportStatusTypeDto[] values() {
        return (ReportStatusTypeDto[]) $VALUES.clone();
    }
}
