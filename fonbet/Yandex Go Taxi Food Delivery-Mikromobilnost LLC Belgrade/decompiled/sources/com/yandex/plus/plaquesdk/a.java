package com.yandex.plus.plaquesdk;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import defpackage.xbm;

/* loaded from: classes2.dex */
public abstract class a {
    public static long a = -1;
    public static Vibrator b;

    public static final void a(Context context) {
        HapticController$Effect hapticController$Effect = HapticController$Effect.TICK;
        if (b == null) {
            b = Build.VERSION.SDK_INT >= 31 ? xbm.l(context.getSystemService("vibrator_manager")).getDefaultVibrator() : (Vibrator) context.getSystemService("vibrator");
        }
        Vibrator vibrator = b;
        Vibrator vibrator2 = (vibrator == null || !vibrator.hasVibrator()) ? null : b;
        if (vibrator2 == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = a;
        if (j == -1 || (currentTimeMillis - j) - 100 >= 0) {
            a = currentTimeMillis;
            boolean hasAmplitudeControl = vibrator2.hasAmplitudeControl();
            if (hasAmplitudeControl) {
                vibrator2.vibrate(hapticController$Effect.a(hasAmplitudeControl));
            }
        }
    }
}
