package xsna;

import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class pxc implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ClipFeedListFragment c;

    public /* synthetic */ pxc(ClipFeedListFragment clipFeedListFragment, int i) {
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
                return clipFeedListFragment.Bo();
            default:
                int i3 = ClipFeedListFragment.a2;
                return new axc(clipFeedListFragment.requireContext(), ((NewsfeedMappersComponent) m7m.d(clipFeedListFragment).mo408a(fpf0.a(NewsfeedMappersComponent.class))).B1(), (mgj0) clipFeedListFragment.D0.getValue(), clipFeedListFragment.Do().getFeedContainer(), clipFeedListFragment.r1);
        }
    }
}
