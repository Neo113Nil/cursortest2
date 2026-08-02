package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: CropFormatAdapter.kt */
/* loaded from: classes4.dex */
public final class nfk extends m.e<typ0> {
    public static final nfk a = new nfk();

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(typ0 typ0Var, typ0 typ0Var2) {
        return typ0Var.equals(typ0Var2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(typ0 typ0Var, typ0 typ0Var2) {
        return epx.f(typ0Var.a, typ0Var2.a);
    }
}
