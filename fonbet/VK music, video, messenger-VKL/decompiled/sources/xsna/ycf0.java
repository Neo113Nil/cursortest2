package xsna;

import android.view.View;

/* compiled from: RecommendedElement.java */
/* loaded from: classes3.dex */
public final class ycf0 implements View.OnClickListener {
    public final /* synthetic */ xcf0 b;

    public ycf0(xcf0 xcf0Var) {
        this.b = xcf0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xcf0 xcf0Var = this.b;
        vcf0 vcf0Var = xcf0Var.j.get();
        if (vcf0Var != null) {
            vcf0Var.g0(xcf0Var.i, false);
        }
    }
}
