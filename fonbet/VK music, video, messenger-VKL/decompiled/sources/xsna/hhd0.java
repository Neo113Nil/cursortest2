package xsna;

import android.view.Surface;
import androidx.annotation.Nullable;

/* compiled from: ProcessingSurface.java */
/* loaded from: classes11.dex */
public final class hhd0 implements o0t, cvp {
    public final Object b;

    public /* synthetic */ hhd0(Object obj) {
        this.b = obj;
    }

    public yeg0 a() {
        u6g0 u6g0Var = (u6g0) this.b;
        return new yeg0(new dx8(u6g0Var.a()), new xeg0(u6g0Var.a()), new weg0(u6g0Var.a()), new h6o0(u6g0Var.a()), new g6o0(u6g0Var.a()));
    }

    @Override // xsna.cvp
    public void c() {
        ((com.vk.libvideo.live.impl.views.live.b) this.b).a();
    }

    @Override // xsna.o0t
    public void onFailure(Throwable th) {
        s100.a("ProcessingSurfaceTextur", "Failed to extract Listenable<Surface>.", th);
    }

    @Override // xsna.o0t
    public void onSuccess(@Nullable Object obj) {
        Surface surface = (Surface) obj;
        synchronized (((ihd0) this.b).h) {
            ((ihd0) this.b).m.a(1, surface);
        }
    }
}
