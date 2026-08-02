package com.yandex.div.core.view;

import android.view.ViewTreeObserver;

/* compiled from: DrawingPassOverrideStrategy.kt */
/* loaded from: classes7.dex */
public interface DrawingPassOverrideStrategy {

    /* compiled from: DrawingPassOverrideStrategy.kt */
    public static final class Safe extends SafeDrawingPassOverrideStrategy {
        public static final Safe INSTANCE = new Safe();

        private Safe() {
        }
    }

    boolean overrideDrawingPass(ViewTreeObserver.OnPreDrawListener onPreDrawListener, boolean z);
}
