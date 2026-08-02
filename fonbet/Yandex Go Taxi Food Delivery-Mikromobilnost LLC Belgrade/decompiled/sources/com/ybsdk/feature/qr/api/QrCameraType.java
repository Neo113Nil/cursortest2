package com.ybsdk.feature.qr.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/qr/api/QrCameraType;", "", "<init>", "(Ljava/lang/String;I)V", "ZXING", "GMS", "HMS", "NOT_IMPLEMENTED", "feature-qr-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QrCameraType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QrCameraType[] $VALUES;
    public static final QrCameraType ZXING = new QrCameraType("ZXING", 0);
    public static final QrCameraType GMS = new QrCameraType("GMS", 1);
    public static final QrCameraType HMS = new QrCameraType("HMS", 2);
    public static final QrCameraType NOT_IMPLEMENTED = new QrCameraType("NOT_IMPLEMENTED", 3);

    private static final /* synthetic */ QrCameraType[] $values() {
        return new QrCameraType[]{ZXING, GMS, HMS, NOT_IMPLEMENTED};
    }

    static {
        QrCameraType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private QrCameraType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static QrCameraType valueOf(String str) {
        return (QrCameraType) Enum.valueOf(QrCameraType.class, str);
    }

    public static QrCameraType[] values() {
        return (QrCameraType[]) $VALUES.clone();
    }
}
