package com.yandex.go.superapp.biometrics.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/yandex/go/superapp/biometrics/analytics/BiometricsAnalytics$BiometricsFlowType", "", "Lcom/yandex/go/superapp/biometrics/analytics/BiometricsAnalytics$BiometricsFlowType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CourierConnect", "CourierVerification", "OrderVerification", "SendResult", "BtCheckState", "BtRequestPermission", "BtRequestEnable", "go-client-android.features.superapp.biometrics:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BiometricsAnalytics$BiometricsFlowType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BiometricsAnalytics$BiometricsFlowType[] $VALUES;
    public static final BiometricsAnalytics$BiometricsFlowType BtCheckState;
    public static final BiometricsAnalytics$BiometricsFlowType BtRequestEnable;
    public static final BiometricsAnalytics$BiometricsFlowType BtRequestPermission;
    public static final BiometricsAnalytics$BiometricsFlowType CourierConnect;
    public static final BiometricsAnalytics$BiometricsFlowType CourierVerification;
    public static final BiometricsAnalytics$BiometricsFlowType OrderVerification;
    public static final BiometricsAnalytics$BiometricsFlowType SendResult;
    private final String eventValue;

    static {
        BiometricsAnalytics$BiometricsFlowType biometricsAnalytics$BiometricsFlowType = new BiometricsAnalytics$BiometricsFlowType("CourierConnect", 0, "courier_connect");
        CourierConnect = biometricsAnalytics$BiometricsFlowType;
        BiometricsAnalytics$BiometricsFlowType biometricsAnalytics$BiometricsFlowType2 = new BiometricsAnalytics$BiometricsFlowType("CourierVerification", 1, "courier_verification");
        CourierVerification = biometricsAnalytics$BiometricsFlowType2;
        BiometricsAnalytics$BiometricsFlowType biometricsAnalytics$BiometricsFlowType3 = new BiometricsAnalytics$BiometricsFlowType("OrderVerification", 2, "order_verification");
        OrderVerification = biometricsAnalytics$BiometricsFlowType3;
        BiometricsAnalytics$BiometricsFlowType biometricsAnalytics$BiometricsFlowType4 = new BiometricsAnalytics$BiometricsFlowType("SendResult", 3, "send_result");
        SendResult = biometricsAnalytics$BiometricsFlowType4;
        BiometricsAnalytics$BiometricsFlowType biometricsAnalytics$BiometricsFlowType5 = new BiometricsAnalytics$BiometricsFlowType("BtCheckState", 4, "bt_check_state");
        BtCheckState = biometricsAnalytics$BiometricsFlowType5;
        BiometricsAnalytics$BiometricsFlowType biometricsAnalytics$BiometricsFlowType6 = new BiometricsAnalytics$BiometricsFlowType("BtRequestPermission", 5, "bt_request_permission");
        BtRequestPermission = biometricsAnalytics$BiometricsFlowType6;
        BiometricsAnalytics$BiometricsFlowType biometricsAnalytics$BiometricsFlowType7 = new BiometricsAnalytics$BiometricsFlowType("BtRequestEnable", 6, "bt_request_enable");
        BtRequestEnable = biometricsAnalytics$BiometricsFlowType7;
        BiometricsAnalytics$BiometricsFlowType[] biometricsAnalytics$BiometricsFlowTypeArr = {biometricsAnalytics$BiometricsFlowType, biometricsAnalytics$BiometricsFlowType2, biometricsAnalytics$BiometricsFlowType3, biometricsAnalytics$BiometricsFlowType4, biometricsAnalytics$BiometricsFlowType5, biometricsAnalytics$BiometricsFlowType6, biometricsAnalytics$BiometricsFlowType7};
        $VALUES = biometricsAnalytics$BiometricsFlowTypeArr;
        $ENTRIES = a.a(biometricsAnalytics$BiometricsFlowTypeArr);
    }

    public BiometricsAnalytics$BiometricsFlowType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static BiometricsAnalytics$BiometricsFlowType valueOf(String str) {
        return (BiometricsAnalytics$BiometricsFlowType) Enum.valueOf(BiometricsAnalytics$BiometricsFlowType.class, str);
    }

    public static BiometricsAnalytics$BiometricsFlowType[] values() {
        return (BiometricsAnalytics$BiometricsFlowType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
