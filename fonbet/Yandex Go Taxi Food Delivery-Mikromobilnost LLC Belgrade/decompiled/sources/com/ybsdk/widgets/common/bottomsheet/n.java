package com.ybsdk.widgets.common.bottomsheet;

import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class n {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BottomSheetDialogView.State.ImageScale.values().length];
        try {
            iArr[BottomSheetDialogView.State.ImageScale.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BottomSheetDialogView.State.ImageScale.CENTER_CROP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BottomSheetDialogView.State.ImageScale.FIT_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BottomSheetDialogView.State.ImageScale.FIT_CENTER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
