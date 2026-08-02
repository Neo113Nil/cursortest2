package com.ybsdk.feature.pin.api.entities;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/feature/pin/api/entities/PinScenario;", "", "<init>", "(Ljava/lang/String;I)V", "ENTER_PIN", "SETUP_PIN", "CHANGE_PIN", "ENABLE_BIOMETRY", "DISABLE_BIOMETRY", "FORGOT_PIN", "REISSUE_PIN", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PinScenario {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinScenario[] $VALUES;
    public static final PinScenario ENTER_PIN = new PinScenario("ENTER_PIN", 0);
    public static final PinScenario SETUP_PIN = new PinScenario("SETUP_PIN", 1);
    public static final PinScenario CHANGE_PIN = new PinScenario("CHANGE_PIN", 2);
    public static final PinScenario ENABLE_BIOMETRY = new PinScenario("ENABLE_BIOMETRY", 3);
    public static final PinScenario DISABLE_BIOMETRY = new PinScenario("DISABLE_BIOMETRY", 4);
    public static final PinScenario FORGOT_PIN = new PinScenario("FORGOT_PIN", 5);
    public static final PinScenario REISSUE_PIN = new PinScenario("REISSUE_PIN", 6);

    private static final /* synthetic */ PinScenario[] $values() {
        return new PinScenario[]{ENTER_PIN, SETUP_PIN, CHANGE_PIN, ENABLE_BIOMETRY, DISABLE_BIOMETRY, FORGOT_PIN, REISSUE_PIN};
    }

    static {
        PinScenario[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PinScenario(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PinScenario valueOf(String str) {
        return (PinScenario) Enum.valueOf(PinScenario.class, str);
    }

    public static PinScenario[] values() {
        return (PinScenario[]) $VALUES.clone();
    }
}
