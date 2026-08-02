package com.yandex.fintechsdk.core.ui.impl.api.qrcode;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import defpackage.d6g0;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/fintechsdk/core/ui/impl/api/qrcode/QrCodeErrorCorrectionLevel;", "", "", "key", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/google/zxing/qrcode/decoder/ErrorCorrectionLevel;", "zxingLevel", "Lcom/google/zxing/qrcode/decoder/ErrorCorrectionLevel;", "c", "()Lcom/google/zxing/qrcode/decoder/ErrorCorrectionLevel;", "Companion", "d6g0", "LOW", "MEDIUM", "QUARTILE", "HIGH", "impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class QrCodeErrorCorrectionLevel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QrCodeErrorCorrectionLevel[] $VALUES;
    public static final d6g0 Companion;
    public static final QrCodeErrorCorrectionLevel HIGH;
    public static final QrCodeErrorCorrectionLevel LOW;
    public static final QrCodeErrorCorrectionLevel MEDIUM;
    public static final QrCodeErrorCorrectionLevel QUARTILE;
    private final String key;
    private final ErrorCorrectionLevel zxingLevel;

    static {
        QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel = new QrCodeErrorCorrectionLevel("LOW", 0, "L", ErrorCorrectionLevel.L);
        LOW = qrCodeErrorCorrectionLevel;
        QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel2 = new QrCodeErrorCorrectionLevel("MEDIUM", 1, "M", ErrorCorrectionLevel.M);
        MEDIUM = qrCodeErrorCorrectionLevel2;
        QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel3 = new QrCodeErrorCorrectionLevel("QUARTILE", 2, CA20Status.STATUS_REQUEST_Q, ErrorCorrectionLevel.Q);
        QUARTILE = qrCodeErrorCorrectionLevel3;
        QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel4 = new QrCodeErrorCorrectionLevel("HIGH", 3, CA20Status.STATUS_CERTIFICATE_H, ErrorCorrectionLevel.H);
        HIGH = qrCodeErrorCorrectionLevel4;
        QrCodeErrorCorrectionLevel[] qrCodeErrorCorrectionLevelArr = {qrCodeErrorCorrectionLevel, qrCodeErrorCorrectionLevel2, qrCodeErrorCorrectionLevel3, qrCodeErrorCorrectionLevel4};
        $VALUES = qrCodeErrorCorrectionLevelArr;
        $ENTRIES = a.a(qrCodeErrorCorrectionLevelArr);
        Companion = new d6g0();
    }

    public QrCodeErrorCorrectionLevel(String str, int i, String str2, ErrorCorrectionLevel errorCorrectionLevel) {
        this.key = str2;
        this.zxingLevel = errorCorrectionLevel;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static QrCodeErrorCorrectionLevel valueOf(String str) {
        return (QrCodeErrorCorrectionLevel) Enum.valueOf(QrCodeErrorCorrectionLevel.class, str);
    }

    public static QrCodeErrorCorrectionLevel[] values() {
        return (QrCodeErrorCorrectionLevel[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: c, reason: from getter */
    public final ErrorCorrectionLevel getZxingLevel() {
        return this.zxingLevel;
    }
}
