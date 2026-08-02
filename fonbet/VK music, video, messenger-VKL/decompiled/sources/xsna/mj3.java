package xsna;

import com.vk.dto.photo.Photo;
import com.vk.imageloader.view.VKImageView;
import xsna.ig3;

/* compiled from: ArchiveView.kt */
/* loaded from: classes4.dex */
public final class mj3 implements s5a0 {
    public boolean a = true;
    public final /* synthetic */ nj3 b;

    public mj3(nj3 nj3Var) {
        this.b = nj3Var;
    }

    @Override // xsna.s5a0
    public final boolean a() {
        return this.a;
    }

    @Override // xsna.s5a0
    public final void b(VKImageView vKImageView, Photo photo, er0 er0Var) {
        this.b.b.i(vKImageView, photo, false, er0Var);
    }

    @Override // xsna.s5a0
    public final boolean c(y7a0 y7a0Var, int i) {
        q1 q1Var = this.b.d;
        Photo photo = y7a0Var.a;
        if (this.a) {
            q1Var.invoke(new ig3.g(photo));
            q1Var.invoke(new ig3.k.g(i, photo));
        }
        return this.a;
    }

    @Override // xsna.s5a0
    public final void d(y7a0 y7a0Var) {
        this.b.d.invoke(new ig3.k.a(y7a0Var.a));
    }
}
