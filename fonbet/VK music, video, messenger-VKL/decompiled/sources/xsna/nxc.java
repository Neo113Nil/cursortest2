package xsna;

import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.ecomm.market.api.di.MarketComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class nxc implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ClipFeedListFragment c;

    public /* synthetic */ nxc(ClipFeedListFragment clipFeedListFragment, int i) {
        this.b = i;
        this.c = clipFeedListFragment;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ClipFeedListFragment clipFeedListFragment = this.c;
        switch (i) {
            case 0:
                int i2 = ClipFeedListFragment.a2;
                return Boolean.valueOf(clipFeedListFragment.Do().getFeedContainer().c());
            default:
                int i3 = ClipFeedListFragment.a2;
                return ((MarketComponent) m7m.d(clipFeedListFragment).a(fpf0.a(MarketComponent.class))).Ob();
        }
    }
}
