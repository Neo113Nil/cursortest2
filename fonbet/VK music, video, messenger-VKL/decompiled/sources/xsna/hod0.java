package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: ProductFilterDropdownHolder.kt */
/* loaded from: classes18.dex */
public final class hod0 extends vfz<nmo> {
    public final wzs<nmo, Integer, s3q0> l;
    public final ComposeView m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hod0(ViewGroup viewGroup, jct jctVar) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setTag("filter_dialog_compose_dropdown_view");
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.l = jctVar;
        this.m = (ComposeView) this.itemView;
    }

    @Override // xsna.vfz
    public final void W5(nmo nmoVar) {
        this.m.setContent(new jai(741949261, new at0(6, nmoVar, this), true));
    }
}
