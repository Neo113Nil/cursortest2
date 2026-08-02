package com.yandex.go.payments.paymentlist.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/payments/paymentlist/ui/YangoPayListItemOption$SwitchMode", "", "Lcom/yandex/go/payments/paymentlist/ui/YangoPayListItemOption$SwitchMode;", "TOGGLE", "CHECK", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class YangoPayListItemOption$SwitchMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YangoPayListItemOption$SwitchMode[] $VALUES;
    public static final YangoPayListItemOption$SwitchMode CHECK;
    public static final YangoPayListItemOption$SwitchMode TOGGLE;

    static {
        YangoPayListItemOption$SwitchMode yangoPayListItemOption$SwitchMode = new YangoPayListItemOption$SwitchMode("TOGGLE", 0);
        TOGGLE = yangoPayListItemOption$SwitchMode;
        YangoPayListItemOption$SwitchMode yangoPayListItemOption$SwitchMode2 = new YangoPayListItemOption$SwitchMode("CHECK", 1);
        CHECK = yangoPayListItemOption$SwitchMode2;
        YangoPayListItemOption$SwitchMode[] yangoPayListItemOption$SwitchModeArr = {yangoPayListItemOption$SwitchMode, yangoPayListItemOption$SwitchMode2};
        $VALUES = yangoPayListItemOption$SwitchModeArr;
        $ENTRIES = kotlin.enums.a.a(yangoPayListItemOption$SwitchModeArr);
    }

    public static YangoPayListItemOption$SwitchMode valueOf(String str) {
        return (YangoPayListItemOption$SwitchMode) Enum.valueOf(YangoPayListItemOption$SwitchMode.class, str);
    }

    public static YangoPayListItemOption$SwitchMode[] values() {
        return (YangoPayListItemOption$SwitchMode[]) $VALUES.clone();
    }
}
