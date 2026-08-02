package com.ybsdk.common.entities;

import com.ybsdk.common.entities.CreditLimitPaymentMethodEntity;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CreditLimitPaymentMethodEntity.CreditLimitStatus.values().length];
        try {
            iArr[CreditLimitPaymentMethodEntity.CreditLimitStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CreditLimitPaymentMethodEntity.CreditLimitStatus.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CreditLimitPaymentMethodEntity.CreditLimitStatus.CANCELED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CreditLimitPaymentMethodEntity.CreditLimitStatus.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
