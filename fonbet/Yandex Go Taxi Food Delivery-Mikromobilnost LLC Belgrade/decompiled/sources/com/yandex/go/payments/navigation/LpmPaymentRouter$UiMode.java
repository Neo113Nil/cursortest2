package com.yandex.go.payments.navigation;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/payments/navigation/LpmPaymentRouter$UiMode", "", "Lcom/yandex/go/payments/navigation/LpmPaymentRouter$UiMode;", "MODAL", "FULLSCREEN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LpmPaymentRouter$UiMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LpmPaymentRouter$UiMode[] $VALUES;
    public static final LpmPaymentRouter$UiMode FULLSCREEN;
    public static final LpmPaymentRouter$UiMode MODAL;

    static {
        LpmPaymentRouter$UiMode lpmPaymentRouter$UiMode = new LpmPaymentRouter$UiMode("MODAL", 0);
        MODAL = lpmPaymentRouter$UiMode;
        LpmPaymentRouter$UiMode lpmPaymentRouter$UiMode2 = new LpmPaymentRouter$UiMode("FULLSCREEN", 1);
        FULLSCREEN = lpmPaymentRouter$UiMode2;
        LpmPaymentRouter$UiMode[] lpmPaymentRouter$UiModeArr = {lpmPaymentRouter$UiMode, lpmPaymentRouter$UiMode2};
        $VALUES = lpmPaymentRouter$UiModeArr;
        $ENTRIES = a.a(lpmPaymentRouter$UiModeArr);
    }

    public static LpmPaymentRouter$UiMode valueOf(String str) {
        return (LpmPaymentRouter$UiMode) Enum.valueOf(LpmPaymentRouter$UiMode.class, str);
    }

    public static LpmPaymentRouter$UiMode[] values() {
        return (LpmPaymentRouter$UiMode[]) $VALUES.clone();
    }
}
