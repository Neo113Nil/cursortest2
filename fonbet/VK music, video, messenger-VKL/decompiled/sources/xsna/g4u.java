package xsna;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: GoodDescriptionComposeViewHolders.kt */
/* loaded from: classes18.dex */
public final class g4u extends vif0<g2m> {
    public final sdz n;
    public final ComposeView o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g4u(Context context, sdz sdzVar) {
        super(r0);
        ComposeView composeView = new ComposeView(context, null, 6);
        vq.b(-1, -2, composeView);
        this.n = sdzVar;
        this.o = (ComposeView) this.itemView;
    }

    @Override // xsna.vif0
    public final void i6(g2m g2mVar) {
        this.o.setContent(new jai(62513018, new yf4(4, g2mVar, this), true));
    }
}
