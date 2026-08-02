package com.ybsdk.feature.qr.payments.internal.network.v2.dto.check;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/QrSourceDto;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "LINK", "CAMERA", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class QrSourceDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QrSourceDto[] $VALUES;
    public static final QrSourceDto UNKNOWN = new QrSourceDto("UNKNOWN", 0);
    public static final QrSourceDto LINK = new QrSourceDto("LINK", 1);
    public static final QrSourceDto CAMERA = new QrSourceDto("CAMERA", 2);

    private static final /* synthetic */ QrSourceDto[] $values() {
        return new QrSourceDto[]{UNKNOWN, LINK, CAMERA};
    }

    static {
        QrSourceDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private QrSourceDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static QrSourceDto valueOf(String str) {
        return (QrSourceDto) Enum.valueOf(QrSourceDto.class, str);
    }

    public static QrSourceDto[] values() {
        return (QrSourceDto[]) $VALUES.clone();
    }
}
