package yads;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes10.dex */
public final class ie2 extends Surface {
    public static int e;
    public static boolean f;
    public final boolean b;
    public final he2 c;
    public boolean d;

    public ie2(he2 he2Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.c = he2Var;
        this.b = z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.c) {
            try {
                if (!this.d) {
                    he2 he2Var = this.c;
                    he2Var.c.getClass();
                    he2Var.c.sendEmptyMessage(2);
                    this.d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
