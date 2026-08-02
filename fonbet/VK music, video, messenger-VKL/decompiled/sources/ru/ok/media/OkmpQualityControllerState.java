package ru.ok.media;

import com.ironsource.X3;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OkmpQualityControllerState.kt */
/* loaded from: classes9.dex */
public final class OkmpQualityControllerState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OkmpQualityControllerState[] $VALUES;
    public static final OkmpQualityControllerState initial = new OkmpQualityControllerState("initial", 0);
    public static final OkmpQualityControllerState noClient = new OkmpQualityControllerState("noClient", 1);
    public static final OkmpQualityControllerState paused = new OkmpQualityControllerState(X3.i.e0, 2);
    public static final OkmpQualityControllerState blocked = new OkmpQualityControllerState("blocked", 3);
    public static final OkmpQualityControllerState noDatagramsReceived = new OkmpQualityControllerState("noDatagramsReceived", 4);
    public static final OkmpQualityControllerState bufferTooLarge = new OkmpQualityControllerState("bufferTooLarge", 5);
    public static final OkmpQualityControllerState switchedDown = new OkmpQualityControllerState("switchedDown", 6);
    public static final OkmpQualityControllerState idle = new OkmpQualityControllerState("idle", 7);
    public static final OkmpQualityControllerState bitrateTrial = new OkmpQualityControllerState("bitrateTrial", 8);
    public static final OkmpQualityControllerState switchedUp = new OkmpQualityControllerState("switchedUp", 9);
    public static final OkmpQualityControllerState maxQuality = new OkmpQualityControllerState("maxQuality", 10);
    public static final OkmpQualityControllerState closed = new OkmpQualityControllerState("closed", 11);

    private static final /* synthetic */ OkmpQualityControllerState[] $values() {
        return new OkmpQualityControllerState[]{initial, noClient, paused, blocked, noDatagramsReceived, bufferTooLarge, switchedDown, idle, bitrateTrial, switchedUp, maxQuality, closed};
    }

    static {
        OkmpQualityControllerState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private OkmpQualityControllerState(String str, int i) {
    }

    public static zrp<OkmpQualityControllerState> getEntries() {
        return $ENTRIES;
    }

    public static OkmpQualityControllerState valueOf(String str) {
        return (OkmpQualityControllerState) Enum.valueOf(OkmpQualityControllerState.class, str);
    }

    public static OkmpQualityControllerState[] values() {
        return (OkmpQualityControllerState[]) $VALUES.clone();
    }
}
