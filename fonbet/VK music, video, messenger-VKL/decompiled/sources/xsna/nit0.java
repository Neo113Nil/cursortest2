package xsna;

import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.ui.video2.ScreenState;

/* compiled from: VideoStateAdapter.kt */
/* loaded from: classes3.dex */
public final class nit0 {
    public final nls0 a;
    public final m4b0 b;
    public final z0u0 c;
    public final aek d;
    public final wox e;
    public final l230 f;
    public final io.reactivex.rxjava3.core.q<mit0> g;
    public ScreenState h;

    public nit0(VideoTextureView videoTextureView, yg5 yg5Var, wzp0 wzp0Var, f5o f5oVar, odm odmVar) {
        io.reactivex.rxjava3.core.q<mit0> l;
        nls0 nls0Var = new nls0(yg5Var.A());
        this.a = nls0Var;
        m4b0 m4b0Var = new m4b0(videoTextureView, yg5Var, wzp0Var.a, wzp0Var.g, f5oVar.a(), odmVar);
        this.b = m4b0Var;
        z0u0 z0u0Var = new z0u0(wzp0Var.f, wzp0Var.b, wzp0Var.e, wzp0Var.c, wzp0Var.d, wzp0Var.i, wzp0Var.h);
        this.c = z0u0Var;
        aek aekVar = new aek();
        this.d = aekVar;
        wox woxVar = new wox();
        this.e = woxVar;
        l230 l230Var = new l230();
        this.f = l230Var;
        boolean e = gsi0.b().e(Boolean.valueOf(yg5Var.A().T1()));
        io.reactivex.rxjava3.subjects.d dVar = nls0Var.c;
        io.reactivex.rxjava3.internal.operators.observable.c0 c0Var = m4b0Var.q;
        io.reactivex.rxjava3.subjects.d dVar2 = z0u0Var.i;
        if (e) {
            l = io.reactivex.rxjava3.core.q.i(dVar, c0Var, dVar2, (io.reactivex.rxjava3.subjects.d) aekVar.c, woxVar.c, l230Var.c, new a0m0(new zsh(yg5Var, 1), 11));
        } else {
            l = io.reactivex.rxjava3.core.q.l(dVar, c0Var, dVar2, new qca0(new t0r(yg5Var, 5), 14));
        }
        this.g = l;
        this.h = wzp0Var.f;
    }
}
