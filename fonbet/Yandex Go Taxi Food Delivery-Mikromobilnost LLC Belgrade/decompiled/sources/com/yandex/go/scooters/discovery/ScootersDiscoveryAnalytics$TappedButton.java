package com.yandex.go.scooters.discovery;

import com.yandex.go.scooters.analytics.ScootersDiscoveryAnalytics$ButtonName;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/scooters/discovery/ScootersDiscoveryAnalytics$TappedButton", "", "Lcom/yandex/go/scooters/discovery/ScootersDiscoveryAnalytics$TappedButton;", "Lcom/yandex/go/scooters/analytics/ScootersDiscoveryAnalytics$ButtonName;", "evgenValue", "Lcom/yandex/go/scooters/analytics/ScootersDiscoveryAnalytics$ButtonName;", "a", "()Lcom/yandex/go/scooters/analytics/ScootersDiscoveryAnalytics$ButtonName;", "QR", "SUPPORT", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersDiscoveryAnalytics$TappedButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersDiscoveryAnalytics$TappedButton[] $VALUES;
    public static final ScootersDiscoveryAnalytics$TappedButton QR;
    public static final ScootersDiscoveryAnalytics$TappedButton SUPPORT;
    private final ScootersDiscoveryAnalytics$ButtonName evgenValue;

    static {
        ScootersDiscoveryAnalytics$TappedButton scootersDiscoveryAnalytics$TappedButton = new ScootersDiscoveryAnalytics$TappedButton("QR", 0, ScootersDiscoveryAnalytics$ButtonName.Qr);
        QR = scootersDiscoveryAnalytics$TappedButton;
        ScootersDiscoveryAnalytics$TappedButton scootersDiscoveryAnalytics$TappedButton2 = new ScootersDiscoveryAnalytics$TappedButton("SUPPORT", 1, ScootersDiscoveryAnalytics$ButtonName.Support);
        SUPPORT = scootersDiscoveryAnalytics$TappedButton2;
        ScootersDiscoveryAnalytics$TappedButton[] scootersDiscoveryAnalytics$TappedButtonArr = {scootersDiscoveryAnalytics$TappedButton, scootersDiscoveryAnalytics$TappedButton2};
        $VALUES = scootersDiscoveryAnalytics$TappedButtonArr;
        $ENTRIES = kotlin.enums.a.a(scootersDiscoveryAnalytics$TappedButtonArr);
    }

    public ScootersDiscoveryAnalytics$TappedButton(String str, int i, ScootersDiscoveryAnalytics$ButtonName scootersDiscoveryAnalytics$ButtonName) {
        this.evgenValue = scootersDiscoveryAnalytics$ButtonName;
    }

    public static ScootersDiscoveryAnalytics$TappedButton valueOf(String str) {
        return (ScootersDiscoveryAnalytics$TappedButton) Enum.valueOf(ScootersDiscoveryAnalytics$TappedButton.class, str);
    }

    public static ScootersDiscoveryAnalytics$TappedButton[] values() {
        return (ScootersDiscoveryAnalytics$TappedButton[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final ScootersDiscoveryAnalytics$ButtonName getEvgenValue() {
        return this.evgenValue;
    }
}
