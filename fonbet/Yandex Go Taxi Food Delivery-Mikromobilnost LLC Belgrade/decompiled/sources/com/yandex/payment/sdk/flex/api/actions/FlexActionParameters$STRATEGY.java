package com.yandex.payment.sdk.flex.api.actions;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/payment/sdk/flex/api/actions/FlexActionParameters$STRATEGY", "", "Lcom/yandex/payment/sdk/flex/api/actions/FlexActionParameters$STRATEGY;", "NFC_BIND", "NFC_WRITE", "flex-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FlexActionParameters$STRATEGY {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FlexActionParameters$STRATEGY[] $VALUES;
    public static final FlexActionParameters$STRATEGY NFC_BIND;
    public static final FlexActionParameters$STRATEGY NFC_WRITE;

    static {
        FlexActionParameters$STRATEGY flexActionParameters$STRATEGY = new FlexActionParameters$STRATEGY("NFC_BIND", 0);
        NFC_BIND = flexActionParameters$STRATEGY;
        FlexActionParameters$STRATEGY flexActionParameters$STRATEGY2 = new FlexActionParameters$STRATEGY("NFC_WRITE", 1);
        NFC_WRITE = flexActionParameters$STRATEGY2;
        FlexActionParameters$STRATEGY[] flexActionParameters$STRATEGYArr = {flexActionParameters$STRATEGY, flexActionParameters$STRATEGY2};
        $VALUES = flexActionParameters$STRATEGYArr;
        $ENTRIES = a.a(flexActionParameters$STRATEGYArr);
    }

    public static FlexActionParameters$STRATEGY valueOf(String str) {
        return (FlexActionParameters$STRATEGY) Enum.valueOf(FlexActionParameters$STRATEGY.class, str);
    }

    public static FlexActionParameters$STRATEGY[] values() {
        return (FlexActionParameters$STRATEGY[]) $VALUES.clone();
    }
}
