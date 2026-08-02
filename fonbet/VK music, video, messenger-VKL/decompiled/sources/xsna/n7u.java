package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: GoodQuickMessagesHolder.kt */
/* loaded from: classes18.dex */
public final class n7u extends vif0<qse0> {
    public final l7u n;
    public final ComposeView o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n7u(ViewGroup viewGroup, l7u l7uVar) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        vq.b(-1, -2, composeView);
        this.n = l7uVar;
        this.o = (ComposeView) this.itemView;
    }

    @Override // xsna.vif0
    public final void i6(qse0 qse0Var) {
        this.o.setContent(new jai(21108006, new zw5(4, qse0Var, this), true));
    }
}
