package com.yandex.passport.internal.ui.base;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ShowFragmentInfo$AnimationType.values().length];
        a = iArr;
        try {
            iArr[ShowFragmentInfo$AnimationType.SLIDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ShowFragmentInfo$AnimationType.DIALOG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ShowFragmentInfo$AnimationType.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
