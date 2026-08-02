package com.yandex.div.core.view;

import android.view.ViewTreeObserver;
import xsna.zcl;

/* compiled from: SafeDrawingPassOverrideStrategy.kt */
/* loaded from: classes7.dex */
public class SafeDrawingPassOverrideStrategy implements DrawingPassOverrideStrategy {
    private static final Companion Companion = new Companion(null);
    private int frameCancelCount;
    private int frameCancelLimit = 3;

    /* compiled from: SafeDrawingPassOverrideStrategy.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.yandex.div.core.view.DrawingPassOverrideStrategy
    public boolean overrideDrawingPass(ViewTreeObserver.OnPreDrawListener onPreDrawListener, boolean z) {
        if (z) {
            this.frameCancelCount = 0;
            return true;
        }
        int i = this.frameCancelCount;
        int i2 = this.frameCancelLimit;
        if (i < i2) {
            int i3 = i + 1;
            this.frameCancelCount = i3;
            onFrameCancelled(onPreDrawListener, i3);
            return false;
        }
        if (i == i2) {
            int i4 = i + 1;
            this.frameCancelCount = i4;
            onFrameCancelLimitExceeded(onPreDrawListener, i4);
        }
        return true;
    }

    public void onFrameCancelLimitExceeded(ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i) {
    }

    public void onFrameCancelled(ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i) {
    }
}
