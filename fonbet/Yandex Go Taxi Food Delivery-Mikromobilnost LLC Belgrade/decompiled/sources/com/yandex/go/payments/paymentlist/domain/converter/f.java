package com.yandex.go.payments.paymentlist.domain.converter;

import com.yandex.go.payments.paymentlist.data.EditModeState;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[EditModeState.values().length];
        try {
            iArr[EditModeState.GONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EditModeState.ENABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EditModeState.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[PaymentMethodsConverter$PaymentOptionGroupType.values().length];
        try {
            iArr2[PaymentMethodsConverter$PaymentOptionGroupType.SELECTED_OPTION_UNAVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PaymentMethodsConverter$PaymentOptionGroupType.LOYALTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PaymentMethodsConverter$PaymentOptionGroupType.YB.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PaymentMethodsConverter$PaymentOptionGroupType.TIPS.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PaymentMethodsConverter$PaymentOptionGroupType.OTHERS.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[PaymentMethodsConverter$PaymentOptionGroupType.BUSINESS_ACCOUNTS.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[PaymentMethodsConverter$PaymentOptionGroupType.UNAVAILABLE.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[PaymentMethodsConverter$PaymentOptionGroupType.TOKENS.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[PaymentMethodsConverter$PaymentOptionGroupType.CARDS.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        b = iArr2;
    }
}
