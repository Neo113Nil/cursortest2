package com.yandex.go.taxi.order.models.api.status;

import defpackage.c6p0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kfp0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/status/ScreenType;", "", "Companion", "kfp0", "UNKNOWN", "SUMMARY", "PAYMENT_METHODS", "ORDER_PAYMENT_METHODS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ScreenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScreenType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final kfp0 Companion;
    public static final ScreenType ORDER_PAYMENT_METHODS;
    public static final ScreenType PAYMENT_METHODS;
    public static final ScreenType SUMMARY;
    public static final ScreenType UNKNOWN;

    static {
        ScreenType screenType = new ScreenType("UNKNOWN", 0);
        UNKNOWN = screenType;
        ScreenType screenType2 = new ScreenType("SUMMARY", 1);
        SUMMARY = screenType2;
        ScreenType screenType3 = new ScreenType("PAYMENT_METHODS", 2);
        PAYMENT_METHODS = screenType3;
        ScreenType screenType4 = new ScreenType("ORDER_PAYMENT_METHODS", 3);
        ORDER_PAYMENT_METHODS = screenType4;
        ScreenType[] screenTypeArr = {screenType, screenType2, screenType3, screenType4};
        $VALUES = screenTypeArr;
        $ENTRIES = kotlin.enums.a.a(screenTypeArr);
        Companion = new kfp0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c6p0(14));
    }

    public static ScreenType valueOf(String str) {
        return (ScreenType) Enum.valueOf(ScreenType.class, str);
    }

    public static ScreenType[] values() {
        return (ScreenType[]) $VALUES.clone();
    }
}
