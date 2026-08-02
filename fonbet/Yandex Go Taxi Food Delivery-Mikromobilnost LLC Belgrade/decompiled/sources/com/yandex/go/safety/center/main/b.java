package com.yandex.go.safety.center.main;

import com.yandex.go.safety.center.main.SafetyCenterMainMvpView;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SafetyCenterMainMvpView.ButtonState.values().length];
        try {
            iArr[SafetyCenterMainMvpView.ButtonState.VISIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SafetyCenterMainMvpView.ButtonState.GONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SafetyCenterMainMvpView.ButtonState.LOADING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SafetyCenterMainMvpView.ButtonState.DISABLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
