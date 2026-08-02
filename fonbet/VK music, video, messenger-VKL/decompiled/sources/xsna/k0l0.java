package xsna;

import android.view.View;
import com.vk.im.ui.views.StencilLayout;

/* compiled from: StencilViewHolder.kt */
/* loaded from: classes7.dex */
public final class k0l0 extends vfz<i0l0> {
    public static final /* synthetic */ int q = 0;
    public final wzs<Integer, Boolean, s3q0> l;
    public final awx m;
    public final egh0 n;
    public eux o;
    public final bpn0 p;

    public k0l0(q250 q250Var, awx awxVar, egh0 egh0Var, View view) {
        super(view);
        this.l = q250Var;
        this.m = awxVar;
        this.n = egh0Var;
        this.p = new bpn0(new krs(view, 1));
        jjc.g(view, new h440(this, 20));
    }

    @Override // xsna.vfz
    public final void W5(i0l0 i0l0Var) {
        ((StencilLayout) this.p.getValue()).setStencil(i0l0Var.b);
        eux euxVar = this.o;
        egh0 egh0Var = this.n;
        if (euxVar != null) {
            egh0Var.c.remove(euxVar);
        }
        eux euxVar2 = new eux(new mcd(0, this, k0l0.class, "getBindingAdapterPosition", "getBindingAdapterPosition()I", 0, 3), this.m, new cmc0(this, 2));
        egh0Var.c.add(euxVar2);
        this.o = euxVar2;
    }

    public final void h6(float f, float f2, int i, int i2) {
        float b = u11.b(1.0f, f, 0.5f, f * 1.0f);
        ((StencilLayout) this.p.getValue()).a(i, f2, Integer.valueOf(i2));
        this.itemView.setVisibility(0);
        this.itemView.setScaleX(b);
        this.itemView.setScaleY(b);
    }
}
