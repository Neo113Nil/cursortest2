package com.yandex.go.scooters.qr.analytics;

import com.yandex.go.scooters.analytics.ScootersQrCardAnalytics$ButtonName;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/yandex/go/scooters/qr/analytics/ScootersQrAnalytics$Button", "", "Lcom/yandex/go/scooters/qr/analytics/ScootersQrAnalytics$Button;", "Lcom/yandex/go/scooters/analytics/ScootersQrCardAnalytics$ButtonName;", "evgenValue", "Lcom/yandex/go/scooters/analytics/ScootersQrCardAnalytics$ButtonName;", "a", "()Lcom/yandex/go/scooters/analytics/ScootersQrCardAnalytics$ButtonName;", "MANUAL_ENTER_DONE", "GO_TO_SETTINGS", "BACK_TO_CAMERA", "MANUAL_ENTER", "CLOSE", "BACK", "TORCH", "EXIT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersQrAnalytics$Button {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersQrAnalytics$Button[] $VALUES;
    public static final ScootersQrAnalytics$Button BACK;
    public static final ScootersQrAnalytics$Button BACK_TO_CAMERA;
    public static final ScootersQrAnalytics$Button CLOSE;
    public static final ScootersQrAnalytics$Button EXIT;
    public static final ScootersQrAnalytics$Button GO_TO_SETTINGS;
    public static final ScootersQrAnalytics$Button MANUAL_ENTER;
    public static final ScootersQrAnalytics$Button MANUAL_ENTER_DONE;
    public static final ScootersQrAnalytics$Button TORCH;
    private final ScootersQrCardAnalytics$ButtonName evgenValue;

    static {
        ScootersQrAnalytics$Button scootersQrAnalytics$Button = new ScootersQrAnalytics$Button("MANUAL_ENTER_DONE", 0, ScootersQrCardAnalytics$ButtonName.ManualEnterDone);
        MANUAL_ENTER_DONE = scootersQrAnalytics$Button;
        ScootersQrAnalytics$Button scootersQrAnalytics$Button2 = new ScootersQrAnalytics$Button("GO_TO_SETTINGS", 1, ScootersQrCardAnalytics$ButtonName.GoToSettings);
        GO_TO_SETTINGS = scootersQrAnalytics$Button2;
        ScootersQrAnalytics$Button scootersQrAnalytics$Button3 = new ScootersQrAnalytics$Button("BACK_TO_CAMERA", 2, ScootersQrCardAnalytics$ButtonName.BackToCamera);
        BACK_TO_CAMERA = scootersQrAnalytics$Button3;
        ScootersQrAnalytics$Button scootersQrAnalytics$Button4 = new ScootersQrAnalytics$Button("MANUAL_ENTER", 3, ScootersQrCardAnalytics$ButtonName.ManualEnter);
        MANUAL_ENTER = scootersQrAnalytics$Button4;
        ScootersQrAnalytics$Button scootersQrAnalytics$Button5 = new ScootersQrAnalytics$Button("CLOSE", 4, ScootersQrCardAnalytics$ButtonName.Close);
        CLOSE = scootersQrAnalytics$Button5;
        ScootersQrAnalytics$Button scootersQrAnalytics$Button6 = new ScootersQrAnalytics$Button("BACK", 5, ScootersQrCardAnalytics$ButtonName.Back);
        BACK = scootersQrAnalytics$Button6;
        ScootersQrAnalytics$Button scootersQrAnalytics$Button7 = new ScootersQrAnalytics$Button("TORCH", 6, ScootersQrCardAnalytics$ButtonName.Torch);
        TORCH = scootersQrAnalytics$Button7;
        ScootersQrAnalytics$Button scootersQrAnalytics$Button8 = new ScootersQrAnalytics$Button("EXIT", 7, ScootersQrCardAnalytics$ButtonName.Exit);
        EXIT = scootersQrAnalytics$Button8;
        ScootersQrAnalytics$Button[] scootersQrAnalytics$ButtonArr = {scootersQrAnalytics$Button, scootersQrAnalytics$Button2, scootersQrAnalytics$Button3, scootersQrAnalytics$Button4, scootersQrAnalytics$Button5, scootersQrAnalytics$Button6, scootersQrAnalytics$Button7, scootersQrAnalytics$Button8};
        $VALUES = scootersQrAnalytics$ButtonArr;
        $ENTRIES = a.a(scootersQrAnalytics$ButtonArr);
    }

    public ScootersQrAnalytics$Button(String str, int i, ScootersQrCardAnalytics$ButtonName scootersQrCardAnalytics$ButtonName) {
        this.evgenValue = scootersQrCardAnalytics$ButtonName;
    }

    public static ScootersQrAnalytics$Button valueOf(String str) {
        return (ScootersQrAnalytics$Button) Enum.valueOf(ScootersQrAnalytics$Button.class, str);
    }

    public static ScootersQrAnalytics$Button[] values() {
        return (ScootersQrAnalytics$Button[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final ScootersQrCardAnalytics$ButtonName getEvgenValue() {
        return this.evgenValue;
    }
}
