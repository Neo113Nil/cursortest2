package xsna;

import android.view.View;
import xsna.tkj0;

/* compiled from: ExternalCustomControlViewAdapters.kt */
/* loaded from: classes16.dex */
public final class deq implements ggd {
    public final /* synthetic */ tkj0.b a;

    public deq(tkj0.b bVar) {
        this.a = bVar;
    }

    @Override // xsna.ggd
    public final void c(ch2 ch2Var) {
        vof vofVar = this.a.a;
        boolean z = ch2Var.a;
        ily ilyVar = ch2Var.f;
        boolean z2 = ilyVar.a;
        String str = ilyVar.b;
        tl2 tl2Var = vofVar.b;
        tl2Var.setVisibility(z);
        tl2Var.a(str, z2);
    }

    @Override // xsna.ggd
    public final View getView() {
        return this.a.a.a;
    }

    @Override // xsna.ggd
    public final void a(izs<? super View, s3q0> izsVar) {
    }

    @Override // xsna.ggd
    public final void b(boolean z) {
    }
}
