package com.yandex.quark.utils.internal.drag;

import com.yandex.quark.utils.internal.drag.DragIndicatorView;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DragIndicatorView.Direction.values().length];
        try {
            iArr[DragIndicatorView.Direction.Up.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DragIndicatorView.Direction.Down.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DragIndicatorView.Direction.None.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
