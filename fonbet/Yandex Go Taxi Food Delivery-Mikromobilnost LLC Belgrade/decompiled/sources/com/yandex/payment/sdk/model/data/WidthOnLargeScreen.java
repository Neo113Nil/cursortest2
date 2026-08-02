package com.yandex.payment.sdk.model.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/payment/sdk/model/data/WidthOnLargeScreen;", "", "FULL_SCREEN_WIDTH", "COMPACT_WIDTH", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WidthOnLargeScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WidthOnLargeScreen[] $VALUES;
    public static final WidthOnLargeScreen COMPACT_WIDTH;
    public static final WidthOnLargeScreen FULL_SCREEN_WIDTH;

    static {
        WidthOnLargeScreen widthOnLargeScreen = new WidthOnLargeScreen("FULL_SCREEN_WIDTH", 0);
        FULL_SCREEN_WIDTH = widthOnLargeScreen;
        WidthOnLargeScreen widthOnLargeScreen2 = new WidthOnLargeScreen("COMPACT_WIDTH", 1);
        COMPACT_WIDTH = widthOnLargeScreen2;
        WidthOnLargeScreen[] widthOnLargeScreenArr = {widthOnLargeScreen, widthOnLargeScreen2};
        $VALUES = widthOnLargeScreenArr;
        $ENTRIES = a.a(widthOnLargeScreenArr);
    }

    public static WidthOnLargeScreen valueOf(String str) {
        return (WidthOnLargeScreen) Enum.valueOf(WidthOnLargeScreen.class, str);
    }

    public static WidthOnLargeScreen[] values() {
        return (WidthOnLargeScreen[]) $VALUES.clone();
    }
}
