package xsna;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: GoodDescriptionComposeViewHolders.kt */
/* loaded from: classes18.dex */
public final class i4u extends vif0<ynd0> {
    public final sdz n;
    public final ComposeView o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i4u(Context context, sdz sdzVar) {
        super(r0);
        ComposeView composeView = new ComposeView(context, null, 6);
        vq.b(-1, -2, composeView);
        this.n = sdzVar;
        this.o = (ComposeView) this.itemView;
    }

    @Override // xsna.vif0
    public final void i6(ynd0 ynd0Var) {
        this.o.setContent(new jai(1952925161, new yn7(4, ynd0Var, this), true));
    }
}
