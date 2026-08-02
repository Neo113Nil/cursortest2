package yads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import xsna.fe60;

/* loaded from: classes10.dex */
public final class wi3 implements ui3, DisplayManager.DisplayListener {
    public final DisplayManager a;
    public ti3 b;

    public wi3(DisplayManager displayManager) {
        this.a = displayManager;
    }

    public static wi3 a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new wi3(displayManager);
        }
        return null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        ti3 ti3Var = this.b;
        if (ti3Var == null || i != 0) {
            return;
        }
        ((fe60) ti3Var).d(this.a.getDisplay(0));
    }

    @Override // yads.ui3
    public final void a(ti3 ti3Var) {
        this.b = ti3Var;
        this.a.registerDisplayListener(this, mc3.a((Handler.Callback) null));
        ((fe60) ti3Var).d(this.a.getDisplay(0));
    }

    @Override // yads.ui3
    public final void a() {
        this.a.unregisterDisplayListener(this);
        this.b = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
