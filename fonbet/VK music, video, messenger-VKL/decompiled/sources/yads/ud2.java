package yads;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes10.dex */
public final class ud2 {
    public final Context a;

    public ud2(Context context) {
        this.a = context;
    }

    public final sd2 a() {
        Object systemService = this.a.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        Boolean valueOf = powerManager != null ? Boolean.valueOf(powerManager.isInteractive()) : null;
        if (valueOf != null && !valueOf.booleanValue()) {
            return sd2.c;
        }
        Object systemService2 = this.a.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        return (keyguardManager == null || !keyguardManager.isKeyguardLocked()) ? sd2.d : sd2.b;
    }
}
