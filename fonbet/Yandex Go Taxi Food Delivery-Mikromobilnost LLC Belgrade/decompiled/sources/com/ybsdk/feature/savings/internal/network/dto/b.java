package com.ybsdk.feature.savings.internal.network.dto;

import com.ybsdk.feature.savings.internal.network.dto.AccountActionButtonDto;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[AccountTypeDto.values().length];
        try {
            iArr[AccountTypeDto.DEPOSIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AccountTypeDto.SAVINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AccountTypeDto.INVEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[AccountActionButtonDto.Status.values().length];
        try {
            iArr2[AccountActionButtonDto.Status.LOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
