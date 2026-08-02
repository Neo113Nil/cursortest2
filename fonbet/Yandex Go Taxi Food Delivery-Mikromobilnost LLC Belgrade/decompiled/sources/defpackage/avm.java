package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;

/* loaded from: classes10.dex */
public final /* synthetic */ class avm implements e9e {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Surface b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ avm(oy80 oy80Var, Surface surface, v3x0 v3x0Var) {
        this.c = oy80Var;
        this.b = surface;
        this.w = v3x0Var;
    }

    @Override // defpackage.e9e
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.w;
        Surface surface = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((DualSurfaceProcessor) obj3).lambda$onInputSurface$0((SurfaceTexture) obj2, surface, (wnw0) obj);
                break;
            default:
                v3x0 v3x0Var = (v3x0) obj2;
                ((oy80) obj3).getClass();
                surface.release();
                int i2 = ((v84) ((wnw0) obj)).a;
                if (i2 != 0 && i2 != 1 && i2 != 3 && i2 != 4) {
                    v3x0Var.b.a.O(new l52(2, v3x0Var, b64.e(i2, i2 == 2 ? ": Provided surface could not be used by the camera." : ": Attempt to provide a surface resulted with unrecognizable code.")));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ avm(DualSurfaceProcessor dualSurfaceProcessor, SurfaceTexture surfaceTexture, Surface surface) {
        this.c = dualSurfaceProcessor;
        this.w = surfaceTexture;
        this.b = surface;
    }
}
