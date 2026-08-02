package xsna;

import android.view.View;
import com.vk.feed.core.models.discover.DiscoverGridItem;

/* compiled from: BlurredRestrictionDiscoverGridItemHolderV2.kt */
/* loaded from: classes4.dex */
public final class qh7 extends lh7 {
    @Override // xsna.lh7, xsna.uc6, android.view.View.OnClickListener
    public final void onClick(View view) {
        DiscoverGridItem discoverGridItem;
        if (jjc.b() || (discoverGridItem = this.D) == null) {
            return;
        }
        J0();
        p580 p580Var = this.H;
        if (p580Var != null) {
            p580Var.a(view, discoverGridItem);
        }
    }
}
