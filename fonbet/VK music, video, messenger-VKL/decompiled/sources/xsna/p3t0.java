package xsna;

import com.vk.libvideo.pip.VideoPipStateHolder;

/* compiled from: VideoPipPauseStrategy.kt */
/* loaded from: classes3.dex */
public final class p3t0 implements yh5 {
    public final z2s0 a;

    public p3t0(z2s0 z2s0Var) {
        this.a = z2s0Var;
    }

    @Override // xsna.yh5
    public final boolean a(yg5 yg5Var) {
        boolean z;
        z2s0 z2s0Var = this.a;
        z2s0Var.getClass();
        z2s0.f(z2s0Var);
        fo4 fo4Var = z2s0.c;
        if (fo4Var == null) {
            fo4Var = null;
        }
        if (fo4Var.a.c()) {
            VideoPipStateHolder.a.getClass();
            if (VideoPipStateHolder.c() == yg5Var && VideoPipStateHolder.d()) {
                z = true;
                return !z;
            }
        }
        z = false;
        return !z;
    }
}
