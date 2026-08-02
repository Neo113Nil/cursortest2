package com.ybsdk.feature.qr.payments.internal.screens.presentation.view;

import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.OperationStatusView;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OperationStatusView.Status.values().length];
        try {
            iArr[OperationStatusView.Status.HIDDEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OperationStatusView.Status.FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OperationStatusView.Status.TIMEOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OperationStatusView.Status.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[OperationStatusView.Status.LOADING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
