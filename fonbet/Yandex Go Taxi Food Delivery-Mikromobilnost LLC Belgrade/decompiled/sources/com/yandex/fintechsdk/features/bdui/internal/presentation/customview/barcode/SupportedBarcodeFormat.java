package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.barcode;

import com.google.zxing.BarcodeFormat;
import defpackage.k4o;
import defpackage.zkw0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/barcode/SupportedBarcodeFormat;", "", "", "key", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/google/zxing/BarcodeFormat;", "zxingFormat", "Lcom/google/zxing/BarcodeFormat;", "c", "()Lcom/google/zxing/BarcodeFormat;", "Companion", "zkw0", "AZTEC", "CODE128", "EAN8", "EAN13", "PDF417", "QR", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SupportedBarcodeFormat {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SupportedBarcodeFormat[] $VALUES;
    public static final SupportedBarcodeFormat AZTEC;
    public static final SupportedBarcodeFormat CODE128;
    public static final zkw0 Companion;
    public static final SupportedBarcodeFormat EAN13;
    public static final SupportedBarcodeFormat EAN8;
    public static final SupportedBarcodeFormat PDF417;
    public static final SupportedBarcodeFormat QR;
    private final String key;
    private final BarcodeFormat zxingFormat;

    static {
        SupportedBarcodeFormat supportedBarcodeFormat = new SupportedBarcodeFormat("AZTEC", 0, "aztec", BarcodeFormat.AZTEC);
        AZTEC = supportedBarcodeFormat;
        SupportedBarcodeFormat supportedBarcodeFormat2 = new SupportedBarcodeFormat("CODE128", 1, "code128", BarcodeFormat.CODE_128);
        CODE128 = supportedBarcodeFormat2;
        SupportedBarcodeFormat supportedBarcodeFormat3 = new SupportedBarcodeFormat("EAN8", 2, "ean8", BarcodeFormat.EAN_8);
        EAN8 = supportedBarcodeFormat3;
        SupportedBarcodeFormat supportedBarcodeFormat4 = new SupportedBarcodeFormat("EAN13", 3, "ean13", BarcodeFormat.EAN_13);
        EAN13 = supportedBarcodeFormat4;
        SupportedBarcodeFormat supportedBarcodeFormat5 = new SupportedBarcodeFormat("PDF417", 4, "pdf417", BarcodeFormat.PDF_417);
        PDF417 = supportedBarcodeFormat5;
        SupportedBarcodeFormat supportedBarcodeFormat6 = new SupportedBarcodeFormat("QR", 5, "qr", BarcodeFormat.QR_CODE);
        QR = supportedBarcodeFormat6;
        SupportedBarcodeFormat[] supportedBarcodeFormatArr = {supportedBarcodeFormat, supportedBarcodeFormat2, supportedBarcodeFormat3, supportedBarcodeFormat4, supportedBarcodeFormat5, supportedBarcodeFormat6};
        $VALUES = supportedBarcodeFormatArr;
        $ENTRIES = a.a(supportedBarcodeFormatArr);
        Companion = new zkw0();
    }

    public SupportedBarcodeFormat(String str, int i, String str2, BarcodeFormat barcodeFormat) {
        this.key = str2;
        this.zxingFormat = barcodeFormat;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static SupportedBarcodeFormat valueOf(String str) {
        return (SupportedBarcodeFormat) Enum.valueOf(SupportedBarcodeFormat.class, str);
    }

    public static SupportedBarcodeFormat[] values() {
        return (SupportedBarcodeFormat[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: c, reason: from getter */
    public final BarcodeFormat getZxingFormat() {
        return this.zxingFormat;
    }
}
