package xsna;

import android.view.ViewGroup;
import java.util.List;

/* compiled from: ViewerImagesViewTypeDelegate.kt */
/* loaded from: classes18.dex */
public final class e3u0 extends p1u0<y2u0> {
    public final izs<Integer, s3q0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public e3u0(izs<? super Integer, s3q0> izsVar) {
        this.a = izsVar;
    }

    @Override // xsna.p1u0
    public final void a(vfz<y2u0> vfzVar, y2u0 y2u0Var, List list) {
        vfzVar.W5(y2u0Var);
        z2u0 z2u0Var = (z2u0) vfzVar;
        z2u0Var.l.setOnClickListener(new dh0(4, this.a, z2u0Var));
    }

    @Override // xsna.p1u0
    public final vfz<? extends y2u0> b(ViewGroup viewGroup) {
        return new z2u0(viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return y2u0.class.isAssignableFrom(hfzVar.getClass());
    }
}
