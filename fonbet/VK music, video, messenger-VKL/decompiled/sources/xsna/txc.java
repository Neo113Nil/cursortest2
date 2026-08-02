package xsna;

import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class txc implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ClipFeedListFragment c;

    public /* synthetic */ txc(ClipFeedListFragment clipFeedListFragment, int i) {
        this.b = i;
        this.c = clipFeedListFragment;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ClipFeedListFragment clipFeedListFragment = this.c;
                if (((Boolean) clipFeedListFragment.c1.invoke()).booleanValue()) {
                    if (clipFeedListFragment.Eo().G()) {
                        ((m6e) clipFeedListFragment.i1.getValue()).d(false);
                    } else {
                        clipFeedListFragment.xo().o();
                    }
                }
                return s3q0.a;
            default:
                return ClipFeedListFragment.io(this.c);
        }
    }
}
