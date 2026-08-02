package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: GoodPreviewMarketHeaderItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class u6u extends vfz<t6u> {
    public final sop l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u6u(ViewGroup viewGroup, sop sopVar) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        vq.b(-1, -2, composeView);
        this.l = sopVar;
        ((ComposeView) this.itemView).setContent(new jai(-709084431, new bt3(this, 6), true));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final /* bridge */ /* synthetic */ void i6(t6u t6uVar) {
    }
}
