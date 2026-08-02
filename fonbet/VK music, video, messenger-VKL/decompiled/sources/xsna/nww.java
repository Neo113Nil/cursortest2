package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: InfoWithImageHolder.kt */
/* loaded from: classes18.dex */
public final class nww extends vif0<mww> {
    public final ComposeView n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nww(ViewGroup viewGroup) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        vq.b(-1, -2, composeView);
        this.n = (ComposeView) this.itemView;
    }

    @Override // xsna.vif0
    public final void i6(mww mwwVar) {
        this.n.setContent(new jai(471043207, new w69(mwwVar, 8), true));
    }
}
