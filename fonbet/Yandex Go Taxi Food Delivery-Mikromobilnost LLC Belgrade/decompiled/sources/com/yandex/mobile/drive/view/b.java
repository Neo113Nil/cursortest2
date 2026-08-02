package com.yandex.mobile.drive.view;

import com.yandex.mobile.drive.view.AlertView;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AlertView.State.values().length];
        try {
            iArr[AlertView.State.Opened.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AlertView.State.Closed.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AlertView.State.InTransition.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
