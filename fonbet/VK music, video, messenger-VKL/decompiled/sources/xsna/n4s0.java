package xsna;

import com.vk.libvideo.autoplay.b;

/* compiled from: VideoBackgroundAutoPlayController.kt */
/* loaded from: classes2.dex */
public final class n4s0 implements b.a {
    public final /* synthetic */ o4s0 a;

    public n4s0(o4s0 o4s0Var) {
        this.a = o4s0Var;
    }

    @Override // com.vk.libvideo.autoplay.b.a
    public final void a(xh5 xh5Var, xh5 xh5Var2) {
        o4s0 o4s0Var = this.a;
        q4s0 q4s0Var = o4s0Var.c;
        if (q4s0Var.b() && fxc0.B().J().i0()) {
            if (epx.f(xh5Var2 != null ? xh5Var2.a : null, q4s0Var.a())) {
                return;
            }
            o4s0Var.D();
        }
    }
}
