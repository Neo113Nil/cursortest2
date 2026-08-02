package xsna;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Set;

/* compiled from: MusicBuySubscriptionPageViewDefaultFactory.kt */
/* loaded from: classes3.dex */
public final class uc40 extends b920 {
    public final List<zym0> c;
    public final List<zym0> d;

    public uc40() {
        zym0 zym0Var = crx0.p;
        this.c = e43.l(crx0.s, crx0.r, crx0.p, crx0.t, crx0.y);
        this.d = e43.l(crx0.u, crx0.v, crx0.w);
    }

    @Override // xsna.b920
    public final ViewGroup i(LinearLayout linearLayout, int i, f950 f950Var, Set set) {
        ViewGroup g;
        ViewGroup g2;
        if (i == 0) {
            g2 = b920.g(linearLayout, R.string.music_buy_subscription_bottomsheet_paid_header, this.c, true, f950Var, set, 0, 0, false);
            return g2;
        }
        g = b920.g(linearLayout, R.string.music_buy_subscription_bottomsheet_free_header, this.d, false, f950Var, set, 0, 0, false);
        return g;
    }

    @Override // xsna.b920
    public final int m() {
        return 2;
    }
}
