package com.yandex.xplat.payment.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/xplat/payment/sdk/XTheme;", "", "light", "dark", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class XTheme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ XTheme[] $VALUES;
    public static final XTheme dark;
    public static final XTheme light;

    static {
        XTheme xTheme = new XTheme("light", 0);
        light = xTheme;
        XTheme xTheme2 = new XTheme("dark", 1);
        dark = xTheme2;
        XTheme[] xThemeArr = {xTheme, xTheme2};
        $VALUES = xThemeArr;
        $ENTRIES = a.a(xThemeArr);
    }

    public static XTheme valueOf(String str) {
        return (XTheme) Enum.valueOf(XTheme.class, str);
    }

    public static XTheme[] values() {
        return (XTheme[]) $VALUES.clone();
    }
}
