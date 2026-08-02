package com.ybsdk.feature.qr.payments.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/qr/payments/api/QrSource;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "LINK", "CAMERA", "feature-qr-payments-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QrSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QrSource[] $VALUES;
    public static final QrSource UNKNOWN = new QrSource("UNKNOWN", 0);
    public static final QrSource LINK = new QrSource("LINK", 1);
    public static final QrSource CAMERA = new QrSource("CAMERA", 2);

    private static final /* synthetic */ QrSource[] $values() {
        return new QrSource[]{UNKNOWN, LINK, CAMERA};
    }

    static {
        QrSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private QrSource(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static QrSource valueOf(String str) {
        return (QrSource) Enum.valueOf(QrSource.class, str);
    }

    public static QrSource[] values() {
        return (QrSource[]) $VALUES.clone();
    }
}
