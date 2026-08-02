package com.ybsdk.widgets.common;

import com.ybsdk.widgets.common.OperationProgressView;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class m {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[OperationProgressView.InnerState.values().length];
        try {
            iArr[OperationProgressView.InnerState.HIDDEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OperationProgressView.InnerState.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OperationProgressView.InnerState.DIRECT_ANIMATION_IN_PROGRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OperationProgressView.InnerState.DIRECT_ANIMATION_COMPLETED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[OperationProgressView.InnerState.REVERSE_ANIMATION_IN_PROGRESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[OperationProgressView.StatusIcon.values().length];
        try {
            iArr2[OperationProgressView.StatusIcon.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
