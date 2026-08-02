package com.ybsdk.feature.qr.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/ybsdk/feature/qr/api/QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat", "", "Lcom/ybsdk/feature/qr/api/QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat;", "<init>", "(Ljava/lang/String;I)V", "QR_CODE", "AZTEC", "DATA_MATRIX", "PDF_417", "feature-qr-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat[] $VALUES;
    public static final QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat QR_CODE = new QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat("QR_CODE", 0);
    public static final QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat AZTEC = new QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat("AZTEC", 1);
    public static final QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat DATA_MATRIX = new QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat("DATA_MATRIX", 2);
    public static final QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat PDF_417 = new QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat("PDF_417", 3);

    private static final /* synthetic */ QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat[] $values() {
        return new QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat[]{QR_CODE, AZTEC, DATA_MATRIX, PDF_417};
    }

    static {
        QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat valueOf(String str) {
        return (QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat) Enum.valueOf(QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat.class, str);
    }

    public static QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat[] values() {
        return (QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat[]) $VALUES.clone();
    }
}
