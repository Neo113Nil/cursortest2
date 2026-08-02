package xsna;

import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment.l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dxc implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ClipFeedListFragment c;

    public /* synthetic */ dxc(ClipFeedListFragment clipFeedListFragment, int i) {
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
                iy0 ko = clipFeedListFragment.ko();
                if (ko != null) {
                    ko.p.G0();
                }
                return s3q0.a;
            default:
                int i3 = ClipFeedListFragment.a2;
                return clipFeedListFragment.new l();
        }
    }
}
