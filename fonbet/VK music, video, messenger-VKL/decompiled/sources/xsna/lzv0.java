package xsna;

import com.vk.libvideo.autoplay.b;

/* compiled from: VkVideoBridge.kt */
/* loaded from: classes7.dex */
public final class lzv0 implements fos0 {
    public final /* synthetic */ gzs<s3q0> a;

    public lzv0(gzs<s3q0> gzsVar) {
        this.a = gzsVar;
    }

    @Override // xsna.fos0
    public final void a() {
        yg5 yg5Var;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        xh5 xh5Var = b.C1208b.a().c;
        if (xh5Var == null || (yg5Var = xh5Var.a) == null) {
            return;
        }
        yg5Var.play();
    }

    @Override // xsna.fos0
    public final void b() {
        oos0 x = com.vk.toggle.d.x();
        if (x == null || x.b || !x.c) {
            this.a.invoke();
        }
    }

    @Override // xsna.fos0
    public final void c() {
        yg5 yg5Var;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        xh5 xh5Var = b.C1208b.a().c;
        if (xh5Var == null || (yg5Var = xh5Var.a) == null) {
            return;
        }
        yg5Var.pause();
    }
}
