package com.yandex.go.superapp.biometrics.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"com/yandex/go/superapp/biometrics/analytics/BiometricsAnalytics$BiometricsFlowFailureReason", "", "Lcom/yandex/go/superapp/biometrics/analytics/BiometricsAnalytics$BiometricsFlowFailureReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PermissionDenied", "CourierNotFound", "BleDisconnected", "UserTooFar", "BiometryCancelled", "BiometryFailed", "SendFailed", "Timeout", "BtOff", "BtEnableRefused", "go-client-android.features.superapp.biometrics:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BiometricsAnalytics$BiometricsFlowFailureReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BiometricsAnalytics$BiometricsFlowFailureReason[] $VALUES;
    public static final BiometricsAnalytics$BiometricsFlowFailureReason BiometryCancelled;
    public static final BiometricsAnalytics$BiometricsFlowFailureReason BiometryFailed;
    public static final BiometricsAnalytics$BiometricsFlowFailureReason BleDisconnected;
    public static final BiometricsAnalytics$BiometricsFlowFailureReason BtEnableRefused;
    public static final BiometricsAnalytics$BiometricsFlowFailureReason BtOff;
    public static final BiometricsAnalytics$BiometricsFlowFailureReason CourierNotFound;
    public static final BiometricsAnalytics$BiometricsFlowFailureReason PermissionDenied;
    public static final BiometricsAnalytics$BiometricsFlowFailureReason SendFailed;
    public static final BiometricsAnalytics$BiometricsFlowFailureReason Timeout;
    public static final BiometricsAnalytics$BiometricsFlowFailureReason UserTooFar;
    private final String eventValue;

    static {
        BiometricsAnalytics$BiometricsFlowFailureReason biometricsAnalytics$BiometricsFlowFailureReason = new BiometricsAnalytics$BiometricsFlowFailureReason("PermissionDenied", 0, "permission_denied");
        PermissionDenied = biometricsAnalytics$BiometricsFlowFailureReason;
        BiometricsAnalytics$BiometricsFlowFailureReason biometricsAnalytics$BiometricsFlowFailureReason2 = new BiometricsAnalytics$BiometricsFlowFailureReason("CourierNotFound", 1, "courier_not_found");
        CourierNotFound = biometricsAnalytics$BiometricsFlowFailureReason2;
        BiometricsAnalytics$BiometricsFlowFailureReason biometricsAnalytics$BiometricsFlowFailureReason3 = new BiometricsAnalytics$BiometricsFlowFailureReason("BleDisconnected", 2, "ble_disconnected");
        BleDisconnected = biometricsAnalytics$BiometricsFlowFailureReason3;
        BiometricsAnalytics$BiometricsFlowFailureReason biometricsAnalytics$BiometricsFlowFailureReason4 = new BiometricsAnalytics$BiometricsFlowFailureReason("UserTooFar", 3, "user_too_far");
        UserTooFar = biometricsAnalytics$BiometricsFlowFailureReason4;
        BiometricsAnalytics$BiometricsFlowFailureReason biometricsAnalytics$BiometricsFlowFailureReason5 = new BiometricsAnalytics$BiometricsFlowFailureReason("BiometryCancelled", 4, "biometry_cancelled");
        BiometryCancelled = biometricsAnalytics$BiometricsFlowFailureReason5;
        BiometricsAnalytics$BiometricsFlowFailureReason biometricsAnalytics$BiometricsFlowFailureReason6 = new BiometricsAnalytics$BiometricsFlowFailureReason("BiometryFailed", 5, "biometry_failed");
        BiometryFailed = biometricsAnalytics$BiometricsFlowFailureReason6;
        BiometricsAnalytics$BiometricsFlowFailureReason biometricsAnalytics$BiometricsFlowFailureReason7 = new BiometricsAnalytics$BiometricsFlowFailureReason("SendFailed", 6, "send_failed");
        SendFailed = biometricsAnalytics$BiometricsFlowFailureReason7;
        BiometricsAnalytics$BiometricsFlowFailureReason biometricsAnalytics$BiometricsFlowFailureReason8 = new BiometricsAnalytics$BiometricsFlowFailureReason("Timeout", 7, "timeout");
        Timeout = biometricsAnalytics$BiometricsFlowFailureReason8;
        BiometricsAnalytics$BiometricsFlowFailureReason biometricsAnalytics$BiometricsFlowFailureReason9 = new BiometricsAnalytics$BiometricsFlowFailureReason("BtOff", 8, "bt_off");
        BtOff = biometricsAnalytics$BiometricsFlowFailureReason9;
        BiometricsAnalytics$BiometricsFlowFailureReason biometricsAnalytics$BiometricsFlowFailureReason10 = new BiometricsAnalytics$BiometricsFlowFailureReason("BtEnableRefused", 9, "bt_enable_refused");
        BtEnableRefused = biometricsAnalytics$BiometricsFlowFailureReason10;
        BiometricsAnalytics$BiometricsFlowFailureReason[] biometricsAnalytics$BiometricsFlowFailureReasonArr = {biometricsAnalytics$BiometricsFlowFailureReason, biometricsAnalytics$BiometricsFlowFailureReason2, biometricsAnalytics$BiometricsFlowFailureReason3, biometricsAnalytics$BiometricsFlowFailureReason4, biometricsAnalytics$BiometricsFlowFailureReason5, biometricsAnalytics$BiometricsFlowFailureReason6, biometricsAnalytics$BiometricsFlowFailureReason7, biometricsAnalytics$BiometricsFlowFailureReason8, biometricsAnalytics$BiometricsFlowFailureReason9, biometricsAnalytics$BiometricsFlowFailureReason10};
        $VALUES = biometricsAnalytics$BiometricsFlowFailureReasonArr;
        $ENTRIES = a.a(biometricsAnalytics$BiometricsFlowFailureReasonArr);
    }

    public BiometricsAnalytics$BiometricsFlowFailureReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static BiometricsAnalytics$BiometricsFlowFailureReason valueOf(String str) {
        return (BiometricsAnalytics$BiometricsFlowFailureReason) Enum.valueOf(BiometricsAnalytics$BiometricsFlowFailureReason.class, str);
    }

    public static BiometricsAnalytics$BiometricsFlowFailureReason[] values() {
        return (BiometricsAnalytics$BiometricsFlowFailureReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
