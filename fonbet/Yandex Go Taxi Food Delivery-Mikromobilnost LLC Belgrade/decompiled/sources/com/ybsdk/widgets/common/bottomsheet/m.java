package com.ybsdk.widgets.common.bottomsheet;

import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class m {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BottomSheetDialogView.State.Background.values().length];
        try {
            iArr[BottomSheetDialogView.State.Background.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BottomSheetDialogView.State.Background.TRANSPARENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
