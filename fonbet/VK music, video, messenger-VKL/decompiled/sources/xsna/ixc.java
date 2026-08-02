package xsna;

import com.vk.clips.precache.api.di.ClipsPrecacheComponent;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ixc implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ClipFeedListFragment c;

    public /* synthetic */ ixc(ClipFeedListFragment clipFeedListFragment, int i) {
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
                return (ClipsPrecacheComponent) m7m.d(clipFeedListFragment).a(fpf0.a(ClipsPrecacheComponent.class));
        }
    }
}
