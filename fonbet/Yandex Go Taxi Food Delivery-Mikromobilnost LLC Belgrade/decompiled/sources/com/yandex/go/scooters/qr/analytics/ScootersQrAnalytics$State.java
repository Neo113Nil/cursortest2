package com.yandex.go.scooters.qr.analytics;

import com.yandex.go.scooters.analytics.ScootersQrCardAnalytics$QrState;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/scooters/qr/analytics/ScootersQrAnalytics$State", "", "Lcom/yandex/go/scooters/qr/analytics/ScootersQrAnalytics$State;", "Lcom/yandex/go/scooters/analytics/ScootersQrCardAnalytics$QrState;", "evgenValue", "Lcom/yandex/go/scooters/analytics/ScootersQrCardAnalytics$QrState;", "a", "()Lcom/yandex/go/scooters/analytics/ScootersQrCardAnalytics$QrState;", "CAMERA", "MANUAL_ENTER", "PERMISSION_REQUEST", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersQrAnalytics$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersQrAnalytics$State[] $VALUES;
    public static final ScootersQrAnalytics$State CAMERA;
    public static final ScootersQrAnalytics$State MANUAL_ENTER;
    public static final ScootersQrAnalytics$State PERMISSION_REQUEST;
    private final ScootersQrCardAnalytics$QrState evgenValue;

    static {
        ScootersQrAnalytics$State scootersQrAnalytics$State = new ScootersQrAnalytics$State("CAMERA", 0, ScootersQrCardAnalytics$QrState.Camera);
        CAMERA = scootersQrAnalytics$State;
        ScootersQrAnalytics$State scootersQrAnalytics$State2 = new ScootersQrAnalytics$State("MANUAL_ENTER", 1, ScootersQrCardAnalytics$QrState.ManualEnter);
        MANUAL_ENTER = scootersQrAnalytics$State2;
        ScootersQrAnalytics$State scootersQrAnalytics$State3 = new ScootersQrAnalytics$State("PERMISSION_REQUEST", 2, ScootersQrCardAnalytics$QrState.PermissionRequest);
        PERMISSION_REQUEST = scootersQrAnalytics$State3;
        ScootersQrAnalytics$State[] scootersQrAnalytics$StateArr = {scootersQrAnalytics$State, scootersQrAnalytics$State2, scootersQrAnalytics$State3};
        $VALUES = scootersQrAnalytics$StateArr;
        $ENTRIES = a.a(scootersQrAnalytics$StateArr);
    }

    public ScootersQrAnalytics$State(String str, int i, ScootersQrCardAnalytics$QrState scootersQrCardAnalytics$QrState) {
        this.evgenValue = scootersQrCardAnalytics$QrState;
    }

    public static ScootersQrAnalytics$State valueOf(String str) {
        return (ScootersQrAnalytics$State) Enum.valueOf(ScootersQrAnalytics$State.class, str);
    }

    public static ScootersQrAnalytics$State[] values() {
        return (ScootersQrAnalytics$State[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final ScootersQrCardAnalytics$QrState getEvgenValue() {
        return this.evgenValue;
    }
}
