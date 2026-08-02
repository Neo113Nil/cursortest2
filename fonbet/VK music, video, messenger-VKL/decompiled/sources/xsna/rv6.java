package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* compiled from: BatteryState.java */
/* loaded from: classes13.dex */
public final class rv6 {
    public final Float a;
    public final boolean b;

    public rv6(Float f, boolean z) {
        this.b = z;
        this.a = f;
    }

    public static rv6 a(Context context) {
        boolean z = false;
        Float f = null;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("status", -1);
                if (intExtra != -1 && (intExtra == 2 || intExtra == 5)) {
                    z = true;
                }
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra2 != -1 && intExtra3 != -1) {
                    f = Float.valueOf(intExtra2 / intExtra3);
                }
            }
        } catch (IllegalStateException e) {
            Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
        }
        return new rv6(f, z);
    }

    public final Float b() {
        return this.a;
    }

    public final int c() {
        Float f;
        if (!this.b || (f = this.a) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }
}
