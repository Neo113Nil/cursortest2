package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.fvb0;
import defpackage.gsq0;
import defpackage.hwb0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/PinIconActionKind;", "", "Companion", "hwb0", "ADDRESS_CHANGE", "OPEN_SCOOTERS", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PinIconActionKind {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinIconActionKind[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final PinIconActionKind ADDRESS_CHANGE;
    public static final hwb0 Companion;
    public static final PinIconActionKind OPEN_SCOOTERS;
    public static final PinIconActionKind UNKNOWN;

    static {
        PinIconActionKind pinIconActionKind = new PinIconActionKind("ADDRESS_CHANGE", 0);
        ADDRESS_CHANGE = pinIconActionKind;
        PinIconActionKind pinIconActionKind2 = new PinIconActionKind("OPEN_SCOOTERS", 1);
        OPEN_SCOOTERS = pinIconActionKind2;
        PinIconActionKind pinIconActionKind3 = new PinIconActionKind("UNKNOWN", 2);
        UNKNOWN = pinIconActionKind3;
        PinIconActionKind[] pinIconActionKindArr = {pinIconActionKind, pinIconActionKind2, pinIconActionKind3};
        $VALUES = pinIconActionKindArr;
        $ENTRIES = kotlin.enums.a.a(pinIconActionKindArr);
        Companion = new hwb0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fvb0(9));
    }

    public static PinIconActionKind valueOf(String str) {
        return (PinIconActionKind) Enum.valueOf(PinIconActionKind.class, str);
    }

    public static PinIconActionKind[] values() {
        return (PinIconActionKind[]) $VALUES.clone();
    }
}
