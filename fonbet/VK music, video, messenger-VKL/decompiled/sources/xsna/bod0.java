package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: ProductFilterCheckboxHolder.kt */
/* loaded from: classes18.dex */
public final class bod0 extends vfz<x1c> {
    public final izs<vcr<?>, s3q0> l;
    public final ComposeView m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bod0(ViewGroup viewGroup, g22 g22Var) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        vq.b(-1, -2, composeView);
        this.l = g22Var;
        this.m = (ComposeView) this.itemView;
    }

    @Override // xsna.vfz
    public final void W5(x1c x1cVar) {
        this.m.setContent(new jai(1872012059, new zd0(6, x1cVar, this), true));
    }
}
