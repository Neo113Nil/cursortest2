package yads;

import android.app.UiModeManager;
import android.content.Context;

/* loaded from: classes10.dex */
public abstract class ww3 {
    public static UiModeManager a;

    public static int a() {
        UiModeManager uiModeManager = a;
        if (uiModeManager == null) {
            return 3;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? 3 : 1;
        }
        return 2;
    }

    public static void a(Context context) {
        a = (UiModeManager) context.getSystemService("uimode");
    }
}
