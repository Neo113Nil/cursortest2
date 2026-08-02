package com.yandex.go.payments.paymentlist.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/payments/paymentlist/ui/PlusOption$TrailMode", "", "Lcom/yandex/go/payments/paymentlist/ui/PlusOption$TrailMode;", "TOGGLE", "ARROW", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlusOption$TrailMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusOption$TrailMode[] $VALUES;
    public static final PlusOption$TrailMode ARROW;
    public static final PlusOption$TrailMode TOGGLE;

    static {
        PlusOption$TrailMode plusOption$TrailMode = new PlusOption$TrailMode("TOGGLE", 0);
        TOGGLE = plusOption$TrailMode;
        PlusOption$TrailMode plusOption$TrailMode2 = new PlusOption$TrailMode("ARROW", 1);
        ARROW = plusOption$TrailMode2;
        PlusOption$TrailMode[] plusOption$TrailModeArr = {plusOption$TrailMode, plusOption$TrailMode2};
        $VALUES = plusOption$TrailModeArr;
        $ENTRIES = kotlin.enums.a.a(plusOption$TrailModeArr);
    }

    public static PlusOption$TrailMode valueOf(String str) {
        return (PlusOption$TrailMode) Enum.valueOf(PlusOption$TrailMode.class, str);
    }

    public static PlusOption$TrailMode[] values() {
        return (PlusOption$TrailMode[]) $VALUES.clone();
    }
}
