package xsna;

import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class vxc implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ClipFeedListFragment c;

    public /* synthetic */ vxc(ClipFeedListFragment clipFeedListFragment, int i) {
        this.b = i;
        this.c = clipFeedListFragment;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ClipFeedListFragment clipFeedListFragment = this.c;
        switch (i) {
            case 0:
                int i2 = ClipFeedListFragment.a2;
                return ((z5e) clipFeedListFragment.t0.getValue()).a();
            default:
                int i3 = ClipFeedListFragment.a2;
                return clipFeedListFragment.no().F();
        }
    }
}
