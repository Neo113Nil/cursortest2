package xsna;

import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: AndroidExternalSurface.android.kt */
/* loaded from: classes11.dex */
public final class j82 extends y46 implements SurfaceHolder.Callback {
    public int g;
    public int h;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.g == i2 && this.h == i3) {
            return;
        }
        this.g = i2;
        this.h = i3;
        Surface surface = surfaceHolder.getSurface();
        zco zcoVar = this.d;
        if (zcoVar != null) {
            zcoVar.invoke(surface, Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        this.g = surfaceFrame.width();
        this.h = surfaceFrame.height();
        Surface surface = surfaceHolder.getSurface();
        int i = this.g;
        int i2 = this.h;
        if (this.c != null) {
            this.f = myc0.h(this.b, null, CoroutineStart.UNDISPATCHED, new x46(this, surface, i, i2, null), 1);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Surface surface = surfaceHolder.getSurface();
        je2 je2Var = this.e;
        if (je2Var != null) {
            je2Var.invoke(surface);
        }
        yok0 yok0Var = this.f;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
    }
}
