package com.yandex.runtime.device.internal;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.yandex.runtime.Runtime;
import defpackage.waj;
import java.util.Arrays;

/* loaded from: classes8.dex */
public class DeviceInfo {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$maxFramesPerSecond$0(Display.Mode mode) {
        return Math.round(mode.getRefreshRate());
    }

    public static int maxFramesPerSecond() {
        return Arrays.stream(((WindowManager) Runtime.getApplicationContext().getSystemService("window")).getDefaultDisplay().getSupportedModes()).mapToInt(new waj()).max().orElse(60);
    }

    public static float pixelsPerPoint() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) Runtime.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    public static String platformVersion() {
        return Build.VERSION.RELEASE;
    }
}
