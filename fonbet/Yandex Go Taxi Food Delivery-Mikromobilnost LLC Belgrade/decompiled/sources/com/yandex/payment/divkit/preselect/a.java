package com.yandex.payment.divkit.preselect;

import com.yandex.payment.divkit.select.PlusCardTopUpState;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusCardTopUpState.values().length];
        try {
            iArr[PlusCardTopUpState.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusCardTopUpState.DATA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
