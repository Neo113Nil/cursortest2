package com.yandex.go.navigator.repository;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/navigator/repository/ReportStatus$Error$ErrorType", "", "Lcom/yandex/go/navigator/repository/ReportStatus$Error$ErrorType;", "NoAuth", "Forbidden", "Unknown", "BannedUser", "TooFar", "TooOften", "LegalReason", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReportStatus$Error$ErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ReportStatus$Error$ErrorType[] $VALUES;
    public static final ReportStatus$Error$ErrorType BannedUser;
    public static final ReportStatus$Error$ErrorType Forbidden;
    public static final ReportStatus$Error$ErrorType LegalReason;
    public static final ReportStatus$Error$ErrorType NoAuth;
    public static final ReportStatus$Error$ErrorType TooFar;
    public static final ReportStatus$Error$ErrorType TooOften;
    public static final ReportStatus$Error$ErrorType Unknown;

    static {
        ReportStatus$Error$ErrorType reportStatus$Error$ErrorType = new ReportStatus$Error$ErrorType("NoAuth", 0);
        NoAuth = reportStatus$Error$ErrorType;
        ReportStatus$Error$ErrorType reportStatus$Error$ErrorType2 = new ReportStatus$Error$ErrorType("Forbidden", 1);
        Forbidden = reportStatus$Error$ErrorType2;
        ReportStatus$Error$ErrorType reportStatus$Error$ErrorType3 = new ReportStatus$Error$ErrorType("Unknown", 2);
        Unknown = reportStatus$Error$ErrorType3;
        ReportStatus$Error$ErrorType reportStatus$Error$ErrorType4 = new ReportStatus$Error$ErrorType("BannedUser", 3);
        BannedUser = reportStatus$Error$ErrorType4;
        ReportStatus$Error$ErrorType reportStatus$Error$ErrorType5 = new ReportStatus$Error$ErrorType("TooFar", 4);
        TooFar = reportStatus$Error$ErrorType5;
        ReportStatus$Error$ErrorType reportStatus$Error$ErrorType6 = new ReportStatus$Error$ErrorType("TooOften", 5);
        TooOften = reportStatus$Error$ErrorType6;
        ReportStatus$Error$ErrorType reportStatus$Error$ErrorType7 = new ReportStatus$Error$ErrorType("LegalReason", 6);
        LegalReason = reportStatus$Error$ErrorType7;
        ReportStatus$Error$ErrorType[] reportStatus$Error$ErrorTypeArr = {reportStatus$Error$ErrorType, reportStatus$Error$ErrorType2, reportStatus$Error$ErrorType3, reportStatus$Error$ErrorType4, reportStatus$Error$ErrorType5, reportStatus$Error$ErrorType6, reportStatus$Error$ErrorType7};
        $VALUES = reportStatus$Error$ErrorTypeArr;
        $ENTRIES = kotlin.enums.a.a(reportStatus$Error$ErrorTypeArr);
    }

    public static ReportStatus$Error$ErrorType valueOf(String str) {
        return (ReportStatus$Error$ErrorType) Enum.valueOf(ReportStatus$Error$ErrorType.class, str);
    }

    public static ReportStatus$Error$ErrorType[] values() {
        return (ReportStatus$Error$ErrorType[]) $VALUES.clone();
    }
}
