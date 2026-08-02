package xsna;

import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class xxc implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ClipFeedListFragment c;

    public /* synthetic */ xxc(ClipFeedListFragment clipFeedListFragment, int i) {
        this.b = i;
        this.c = clipFeedListFragment;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ClipFeedListFragment clipFeedListFragment = this.c;
        switch (i) {
            case 0:
                w380 w380Var = clipFeedListFragment.U1;
                if (w380Var != null) {
                    w380Var.d = true;
                    w380Var.i();
                }
                return s3q0.a;
            default:
                int i2 = ClipFeedListFragment.a2;
                return ((ClipsViewerComponent) m7m.d(clipFeedListFragment).a(fpf0.a(ClipsViewerComponent.class))).K0();
        }
    }
}
