package ru.ok.call_effects.internal.gl;

import android.content.Context;
import android.os.Build;
import android.view.WindowManager;

/* loaded from: classes9.dex */
public final class CameraUtils {
    private static final int OUTPUT_FORMAT = 17;
    private static final String TAG = "CameraUtils";
    private static final String[] DEVICE_MODELS_FLIP_FRONT = {"Nexus 6", "Swift 2 X", "MI 5s"};
    private static final String[] DEVICE_MODELS_FLIP_BACK = {"Nexus 5X"};

    public static int getSurfaceRotation(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getRotation();
    }

    public static boolean hasVerticalFlipByModel(boolean z) {
        String str = Build.MODEL;
        if (z) {
            for (String str2 : DEVICE_MODELS_FLIP_BACK) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        } else {
            for (String str3 : DEVICE_MODELS_FLIP_FRONT) {
                if (str.contains(str3)) {
                    return true;
                }
            }
        }
        return false;
    }
}
