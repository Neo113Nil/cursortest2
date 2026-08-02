package xsna;

import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class sxc implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ClipFeedListFragment c;

    public /* synthetic */ sxc(ClipFeedListFragment clipFeedListFragment, int i) {
        this.b = i;
        this.c = clipFeedListFragment;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ClipFeedListFragment clipFeedListFragment = this.c;
        switch (i) {
            case 0:
                if (((Boolean) clipFeedListFragment.c1.invoke()).booleanValue()) {
                    if (clipFeedListFragment.Eo().G()) {
                        ((m6e) clipFeedListFragment.i1.getValue()).d(true);
                    } else {
                        clipFeedListFragment.xo().n();
                    }
                }
                return s3q0.a;
            default:
                int i2 = ClipFeedListFragment.a2;
                return clipFeedListFragment.qo().Y();
        }
    }
}
