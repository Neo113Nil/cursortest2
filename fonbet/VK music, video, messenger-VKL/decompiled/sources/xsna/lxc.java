package xsna;

import com.vk.clips.precache.api.di.ClipsPrecacheComponent;
import com.vk.clips.precache.api.di.ClipsPrecacheRecyclerComponent;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class lxc implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ClipFeedListFragment c;

    public /* synthetic */ lxc(ClipFeedListFragment clipFeedListFragment, int i) {
        this.b = i;
        this.c = clipFeedListFragment;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ClipFeedListFragment clipFeedListFragment = this.c;
        switch (i) {
            case 0:
                return clipFeedListFragment.N1;
            default:
                int i2 = ClipFeedListFragment.a2;
                return ((ClipsPrecacheRecyclerComponent) m7m.d(clipFeedListFragment).mo408a(fpf0.a(ClipsPrecacheRecyclerComponent.class))).t2().a(((ClipsPrecacheComponent) clipFeedListFragment.Z.getValue()).A2(), clipFeedListFragment.new g());
        }
    }
}
