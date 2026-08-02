package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: ProductFilterSimplePickerHolder.kt */
/* loaded from: classes18.dex */
public final class qod0 extends vfz<wzk0> {
    public final wzs<wzk0, Integer, s3q0> l;
    public final ComposeView m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qod0(ViewGroup viewGroup, jct jctVar) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setTag("filter_dialog_compose_moderation_view");
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.l = jctVar;
        this.m = (ComposeView) this.itemView;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(wzk0 wzk0Var) {
        this.m.setContent(new jai(-2030139354, new y61(9, wzk0Var, this), true));
    }
}
