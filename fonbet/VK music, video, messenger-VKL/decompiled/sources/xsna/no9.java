package xsna;

import android.view.SurfaceHolder;
import androidx.annotation.NonNull;

/* compiled from: CameraViewHolder.java */
/* loaded from: classes3.dex */
public final class no9 implements SurfaceHolder.Callback {
    public final /* synthetic */ soo0 b;

    public no9(soo0 soo0Var) {
        this.b = soo0Var;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.b.getClass();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        this.b.b();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
    }
}
