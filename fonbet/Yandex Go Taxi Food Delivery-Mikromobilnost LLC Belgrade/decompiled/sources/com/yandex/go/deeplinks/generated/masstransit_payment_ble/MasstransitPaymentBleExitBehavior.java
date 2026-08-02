package com.yandex.go.deeplinks.generated.masstransit_payment_ble;

import defpackage.k4o;
import defpackage.t310;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/deeplinks/generated/masstransit_payment_ble/MasstransitPaymentBleExitBehavior;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "t310", "DISMISS", "TRANSPORT_MAIN", "deeplinks"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MasstransitPaymentBleExitBehavior {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitPaymentBleExitBehavior[] $VALUES;
    public static final t310 Companion;
    public static final MasstransitPaymentBleExitBehavior DISMISS;
    public static final MasstransitPaymentBleExitBehavior TRANSPORT_MAIN;
    private final String value;

    static {
        MasstransitPaymentBleExitBehavior masstransitPaymentBleExitBehavior = new MasstransitPaymentBleExitBehavior("DISMISS", 0, "dismiss");
        DISMISS = masstransitPaymentBleExitBehavior;
        MasstransitPaymentBleExitBehavior masstransitPaymentBleExitBehavior2 = new MasstransitPaymentBleExitBehavior("TRANSPORT_MAIN", 1, "transport_main");
        TRANSPORT_MAIN = masstransitPaymentBleExitBehavior2;
        MasstransitPaymentBleExitBehavior[] masstransitPaymentBleExitBehaviorArr = {masstransitPaymentBleExitBehavior, masstransitPaymentBleExitBehavior2};
        $VALUES = masstransitPaymentBleExitBehaviorArr;
        $ENTRIES = a.a(masstransitPaymentBleExitBehaviorArr);
        Companion = new t310();
    }

    public MasstransitPaymentBleExitBehavior(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static MasstransitPaymentBleExitBehavior valueOf(String str) {
        return (MasstransitPaymentBleExitBehavior) Enum.valueOf(MasstransitPaymentBleExitBehavior.class, str);
    }

    public static MasstransitPaymentBleExitBehavior[] values() {
        return (MasstransitPaymentBleExitBehavior[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
