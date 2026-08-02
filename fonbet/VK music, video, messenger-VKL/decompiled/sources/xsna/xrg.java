package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import org.chromium.net.NetError;

/* compiled from: CommunityArtistPageItem.kt */
/* loaded from: classes5.dex */
public final class xrg extends we6 {
    public final yrg g;
    public final hn0 h;
    public final int i = NetError.ERR_CERT_NAME_CONSTRAINT_VIOLATION;

    /* compiled from: CommunityArtistPageItem.kt */
    public static final class a extends vif0<xrg> {
        public final wh50<xrg> n;

        public a(ComposeView composeView) {
            super(composeView);
            this.n = androidx.compose.runtime.k.b(null);
            composeView.setViewCompositionStrategy(sv1.g(composeView.getContext()));
            composeView.setContent(new jai(-1287106, new k87(this, 1), true));
        }

        @Override // xsna.vif0
        public final void i6(xrg xrgVar) {
            ((zak0) this.n).setValue(xrgVar);
        }
    }

    public xrg(yrg yrgVar, hn0 hn0Var) {
        this.g = yrgVar;
        this.h = hn0Var;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return new a(composeView);
    }

    @Override // xsna.we6
    public final int h() {
        return this.i;
    }
}
