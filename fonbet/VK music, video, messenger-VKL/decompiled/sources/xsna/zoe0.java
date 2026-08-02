package xsna;

import com.vk.media.render.RenderBase;
import xsna.xk9;

/* compiled from: QualityCameraPreview.kt */
/* loaded from: classes13.dex */
public final class zoe0 implements xk9.b {
    public long a = Long.MAX_VALUE;
    public final /* synthetic */ xoe0 b;

    public zoe0(xoe0 xoe0Var) {
        this.b = xoe0Var;
    }

    @Override // xsna.xk9.b
    public final void a(long j) {
        xoe0 xoe0Var = this.b;
        if (j > this.a && xoe0Var.J.get()) {
            xoe0Var.post(new tn9(xoe0Var, 15));
            RenderBase.d dVar = ((mo9) xoe0Var.getCameraPreview()).g.l;
            if (dVar != null) {
                dVar.j = null;
            }
        }
        this.a = j;
    }
}
