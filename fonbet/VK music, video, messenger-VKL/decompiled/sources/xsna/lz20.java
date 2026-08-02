package xsna;

import com.vk.core.fragments.FragmentImpl;

/* compiled from: ModalDialogsController.kt */
/* loaded from: classes2.dex */
public final class lz20 implements bkm {
    public fcn b;
    public int c;
    public final /* synthetic */ ww50<?> d;
    public final /* synthetic */ FragmentImpl e;
    public final /* synthetic */ kz20 f;

    public lz20(ww50<?> ww50Var, FragmentImpl fragmentImpl, kz20 kz20Var) {
        this.d = ww50Var;
        this.e = fragmentImpl;
        this.f = kz20Var;
        this.c = ww50Var.y();
    }

    @Override // xsna.bkm
    public final void bb(int i) {
        ww50<?> ww50Var = this.d;
        fcn z = ww50Var.z();
        FragmentImpl fragmentImpl = this.e;
        boolean f = epx.f(z, fragmentImpl);
        kz20 kz20Var = this.f;
        if (f) {
            kz20Var.e.Ff(fragmentImpl.getTag());
        } else if (epx.f(this.b, fragmentImpl) && i < this.c) {
            kz20Var.e.Qc(fragmentImpl.getTag());
            ww50Var.c0(this);
        }
        this.c = i;
        this.b = z;
    }
}
