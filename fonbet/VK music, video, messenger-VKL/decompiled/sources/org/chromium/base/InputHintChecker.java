package org.chromium.base;

import android.os.Build;
import android.view.View;

/* loaded from: classes8.dex */
public class InputHintChecker {
    private static boolean sAllowSetViewForTesting;

    public interface Natives {
        boolean failedToInitializeForTesting();

        boolean hasInputForTesting();

        boolean hasInputWithThrottlingForTesting();

        boolean isInitializedForTesting();

        void onCompositorViewHolderTouchEvent();

        void setIsAfterInputYieldForTesting(boolean z);

        void setView(Object obj);
    }

    public static boolean failedToInitializeForTesting() {
        return InputHintCheckerJni.get().failedToInitializeForTesting();
    }

    public static boolean hasInputForTesting() {
        return InputHintCheckerJni.get().hasInputForTesting();
    }

    public static boolean hasInputWithThrottlingForTesting() {
        return InputHintCheckerJni.get().hasInputWithThrottlingForTesting();
    }

    public static boolean isInitializedForTesting() {
        return InputHintCheckerJni.get().isInitializedForTesting();
    }

    public static void onCompositorViewHolderTouchEvent() {
        InputHintCheckerJni.get().onCompositorViewHolderTouchEvent();
    }

    public static void setAllowSetViewForTesting(boolean z) {
        sAllowSetViewForTesting = z;
    }

    public static void setIsAfterInputYieldForTesting(boolean z) {
        InputHintCheckerJni.get().setIsAfterInputYieldForTesting(z);
    }

    public static void setView(View view) {
        if (sAllowSetViewForTesting || Build.VERSION.SDK_INT >= 35) {
            InputHintCheckerJni.get().setView(view);
        }
    }

    public static void setWrongViewForTesting() {
        InputHintCheckerJni.get().setView(new Object());
    }
}
