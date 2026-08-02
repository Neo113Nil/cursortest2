package com.yandex.go.preorder.mode;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/preorder/mode/PinMode;", "", "ROUTE", JCP.RAW_PREFIX, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PinMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinMode[] $VALUES;
    public static final PinMode NONE;
    public static final PinMode ROUTE;

    static {
        PinMode pinMode = new PinMode("ROUTE", 0);
        ROUTE = pinMode;
        PinMode pinMode2 = new PinMode(JCP.RAW_PREFIX, 1);
        NONE = pinMode2;
        PinMode[] pinModeArr = {pinMode, pinMode2};
        $VALUES = pinModeArr;
        $ENTRIES = a.a(pinModeArr);
    }

    public static PinMode valueOf(String str) {
        return (PinMode) Enum.valueOf(PinMode.class, str);
    }

    public static PinMode[] values() {
        return (PinMode[]) $VALUES.clone();
    }
}
