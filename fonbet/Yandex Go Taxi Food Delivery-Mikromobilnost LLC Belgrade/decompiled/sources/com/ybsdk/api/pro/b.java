package com.ybsdk.api.pro;

import com.ybsdk.common.entities.ApplicationTypeEntity;
import com.ybsdk.feature.transactions.api.entities.TransactionEntity;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TransactionEntity.State.values().length];
        try {
            iArr[TransactionEntity.State.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransactionEntity.State.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransactionEntity.State.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransactionEntity.State.CANCEL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TransactionEntity.State.HOLD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[TransactionEntity.Type.values().length];
        try {
            iArr2[TransactionEntity.Type.PURCHASE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[TransactionEntity.Type.TRANSFER_OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[TransactionEntity.Type.REFUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[TransactionEntity.Type.TOPUP.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[TransactionEntity.Type.TRANSFER_IN.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[TransactionEntity.Type.CASH_WITHDRAWAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        int[] iArr3 = new int[ErrorType.values().length];
        try {
            iArr3[ErrorType.PDD.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        a = iArr3;
        int[] iArr4 = new int[ApplicationTypeEntity.values().length];
        try {
            iArr4[ApplicationTypeEntity.PRODUCT.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[ApplicationTypeEntity.REGISTRATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[ApplicationTypeEntity.CHANGE_PHONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[ApplicationTypeEntity.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[ApplicationTypeEntity.DIGITAL_CARD_ISSUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[ApplicationTypeEntity.SIMPLIFIED_IDENTIFICATION.ordinal()] = 6;
        } catch (NoSuchFieldError unused18) {
        }
        b = iArr4;
    }
}
