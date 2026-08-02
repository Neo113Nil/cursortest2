package xsna;

import com.vk.photos.root.selectalbum.domain.a;

/* compiled from: SelectAlbumView.kt */
/* loaded from: classes4.dex */
public final class m6i0 implements df90 {
    public boolean b;
    public final /* synthetic */ xd40 c;
    public final /* synthetic */ n6i0 d;

    public m6i0(xd40 xd40Var, n6i0 n6i0Var) {
        this.c = xd40Var;
        this.d = n6i0Var;
    }

    @Override // xsna.df90
    public final void e(int i, int i2, int i3, int i4) {
        if (i4 <= 0 || this.b) {
            return;
        }
        this.b = true;
        this.c.invoke(a.c.b);
    }

    @Override // xsna.df90
    public final void l(int i) {
        if (i == 0) {
            this.b = false;
        }
        if (i == 1 && !this.b && this.d.h) {
            this.b = true;
            this.c.invoke(a.c.b);
        }
    }
}
