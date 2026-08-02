package com.ybsdk.feature.pin.internal.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/pin/internal/domain/PinState;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "ERROR", "LOADING", "SUCCESS", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PinState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinState[] $VALUES;
    public static final PinState NORMAL = new PinState("NORMAL", 0);
    public static final PinState ERROR = new PinState("ERROR", 1);
    public static final PinState LOADING = new PinState("LOADING", 2);
    public static final PinState SUCCESS = new PinState("SUCCESS", 3);

    private static final /* synthetic */ PinState[] $values() {
        return new PinState[]{NORMAL, ERROR, LOADING, SUCCESS};
    }

    static {
        PinState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PinState(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PinState valueOf(String str) {
        return (PinState) Enum.valueOf(PinState.class, str);
    }

    public static PinState[] values() {
        return (PinState[]) $VALUES.clone();
    }
}
