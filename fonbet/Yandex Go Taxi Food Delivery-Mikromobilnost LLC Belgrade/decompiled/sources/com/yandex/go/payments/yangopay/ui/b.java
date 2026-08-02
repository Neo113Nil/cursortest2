package com.yandex.go.payments.yangopay.ui;

import com.yandex.go.payments.yangopay.ui.YangoPayWidgetView;
import ru.yandex.taxi.yangopay.wallet.YangoPayPaymentInfo$TrailButton$TrailButtonState;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[YangoPayWidgetView.SwitchStyle.values().length];
        try {
            iArr[YangoPayWidgetView.SwitchStyle.TOGGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YangoPayWidgetView.SwitchStyle.CHECK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[YangoPayWidgetView.CheckboxPosition.values().length];
        try {
            iArr2[YangoPayWidgetView.CheckboxPosition.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[YangoPayWidgetView.CheckboxPosition.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[YangoPayWidgetView.ButtonStyle.values().length];
        try {
            iArr3[YangoPayWidgetView.ButtonStyle.OUTLINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[YangoPayWidgetView.ButtonStyle.CONTROL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[YangoPayWidgetView.ButtonStyle.OUTLINE_DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        c = iArr3;
        int[] iArr4 = new int[YangoPayPaymentInfo$TrailButton$TrailButtonState.values().length];
        try {
            iArr4[YangoPayPaymentInfo$TrailButton$TrailButtonState.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[YangoPayPaymentInfo$TrailButton$TrailButtonState.HIGHLIGHTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
