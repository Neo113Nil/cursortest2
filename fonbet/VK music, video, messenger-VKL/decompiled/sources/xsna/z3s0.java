package xsna;

import com.vk.core.view.tools.VkViewStub;
import com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarLayout2;
import xsna.j3i0;

/* compiled from: VideoAutoPlaySeekBarControllerLazy.kt */
/* loaded from: classes16.dex */
public final class z3s0 implements j3i0 {
    public final VkViewStub a;
    public final zet0 b;
    public gh5 c;
    public final a d = new a();

    /* compiled from: VideoAutoPlaySeekBarControllerLazy.kt */
    public static final class a {
        public a() {
        }
    }

    public z3s0(VkViewStub vkViewStub, zet0 zet0Var) {
        this.a = vkViewStub;
        this.b = zet0Var;
    }

    @Override // xsna.j3i0
    public final j3i0.a a() {
        return this.c;
    }

    @Override // xsna.j3i0
    public final a b() {
        return this.d;
    }

    @Override // xsna.j3i0
    public final void c(gh5 gh5Var) {
        this.c = gh5Var;
        f().setSeekBarChangeListener(new y3s0(gh5Var));
    }

    @Override // xsna.j3i0
    public final void d(j3i0.b bVar) {
        f().setState(new VideoAutoPlaySeekBarLayout2.a(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e));
    }

    @Override // xsna.j3i0
    public final boolean e() {
        if (this.a.c) {
            return f().w.a().c;
        }
        return false;
    }

    public final VideoAutoPlaySeekBarLayout2 f() {
        VkViewStub vkViewStub = this.a;
        if (!vkViewStub.c) {
            vkViewStub.a();
        }
        return (VideoAutoPlaySeekBarLayout2) vkViewStub.getView();
    }

    @Override // xsna.j3i0
    public final j3i0.b getState() {
        return new j3i0.b(f().getState().a, f().getState().b, f().getState().c, f().getState().d, f().getState().e);
    }

    @Override // xsna.j3i0
    public final void setVisible(boolean z) {
        if (z || this.a.c) {
            bwt0.d0(f(), !z);
        }
    }
}
