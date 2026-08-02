package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.VibrationAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class gd00 {
    public final Context a;
    public boolean b;
    public boolean c;

    public gd00(Context context) {
        this.a = context;
    }

    public final void a() {
        Vibrator vibrator;
        VibrationAttributes createForUsage;
        if (!this.b || this.c) {
            return;
        }
        this.c = true;
        Context context = this.a;
        if (Settings.System.getInt(context.getContentResolver(), "haptic_feedback_enabled", 1) == 1) {
            int i = Build.VERSION.SDK_INT;
            Vibrator vibrator2 = null;
            if (i >= 31) {
                VibratorManager h = a82.h(context.getSystemService("vibrator_manager"));
                vibrator = h != null ? h.getDefaultVibrator() : null;
            } else {
                vibrator = (Vibrator) context.getSystemService("vibrator");
            }
            if (vibrator != null && vibrator.hasVibrator()) {
                vibrator2 = vibrator;
            }
            if (vibrator2 == null) {
                return;
            }
            VibrationEffect createPredefined = VibrationEffect.createPredefined(5);
            if (i < 33) {
                vibrator2.vibrate(createPredefined);
            } else {
                createForUsage = VibrationAttributes.createForUsage(18);
                vibrator2.vibrate(createPredefined, createForUsage);
            }
        }
    }
}
