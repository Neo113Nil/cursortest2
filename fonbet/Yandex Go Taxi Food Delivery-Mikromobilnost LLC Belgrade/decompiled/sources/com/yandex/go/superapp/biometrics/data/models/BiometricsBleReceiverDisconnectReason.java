package com.yandex.go.superapp.biometrics.data.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/biometrics/data/models/BiometricsBleReceiverDisconnectReason;", "", "DeviceUnavailable", "LongDistance", "Timeout", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BiometricsBleReceiverDisconnectReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BiometricsBleReceiverDisconnectReason[] $VALUES;
    public static final BiometricsBleReceiverDisconnectReason DeviceUnavailable;
    public static final BiometricsBleReceiverDisconnectReason LongDistance;
    public static final BiometricsBleReceiverDisconnectReason Timeout;

    static {
        BiometricsBleReceiverDisconnectReason biometricsBleReceiverDisconnectReason = new BiometricsBleReceiverDisconnectReason("DeviceUnavailable", 0);
        DeviceUnavailable = biometricsBleReceiverDisconnectReason;
        BiometricsBleReceiverDisconnectReason biometricsBleReceiverDisconnectReason2 = new BiometricsBleReceiverDisconnectReason("LongDistance", 1);
        LongDistance = biometricsBleReceiverDisconnectReason2;
        BiometricsBleReceiverDisconnectReason biometricsBleReceiverDisconnectReason3 = new BiometricsBleReceiverDisconnectReason("Timeout", 2);
        Timeout = biometricsBleReceiverDisconnectReason3;
        BiometricsBleReceiverDisconnectReason[] biometricsBleReceiverDisconnectReasonArr = {biometricsBleReceiverDisconnectReason, biometricsBleReceiverDisconnectReason2, biometricsBleReceiverDisconnectReason3};
        $VALUES = biometricsBleReceiverDisconnectReasonArr;
        $ENTRIES = a.a(biometricsBleReceiverDisconnectReasonArr);
    }

    public static BiometricsBleReceiverDisconnectReason valueOf(String str) {
        return (BiometricsBleReceiverDisconnectReason) Enum.valueOf(BiometricsBleReceiverDisconnectReason.class, str);
    }

    public static BiometricsBleReceiverDisconnectReason[] values() {
        return (BiometricsBleReceiverDisconnectReason[]) $VALUES.clone();
    }
}
