package defpackage;

import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class ke4 {
    public final ea20 a;

    public ke4(ufg ufgVar, int i) {
        switch (i) {
            case 1:
                r400 r400Var = new r400(3);
                ea20 ea20Var = new ea20(ufgVar, "flutter/navigation", qtb1.G, null);
                this.a = ea20Var;
                ea20Var.b(r400Var);
                break;
            default:
                wly0 wly0Var = new wly0();
                ea20 ea20Var2 = new ea20(ufgVar, "flutter/backgesture", wzt0.b, null);
                this.a = ea20Var2;
                ea20Var2.b(wly0Var);
                break;
        }
    }

    public static HashMap a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        HashMap hashMap = new HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        hashMap.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        progress = backEvent.getProgress();
        hashMap.put("progress", Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put("swipeEdge", Integer.valueOf(swipeEdge));
        return hashMap;
    }
}
