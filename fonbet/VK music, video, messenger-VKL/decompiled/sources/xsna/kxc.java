package xsna;

import com.vk.clips.sdk.shared.api.ui.ClipSeekBarController;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class kxc implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ClipFeedListFragment c;

    public /* synthetic */ kxc(ClipFeedListFragment clipFeedListFragment, int i) {
        this.b = i;
        this.c = clipFeedListFragment;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ClipFeedListFragment clipFeedListFragment = this.c;
        switch (i) {
            case 0:
                ClipsWrapperFragment.i iVar = clipFeedListFragment.F1;
                if (iVar != null) {
                    return (ClipSeekBarController) iVar.invoke();
                }
                return null;
            default:
                int i2 = ClipFeedListFragment.a2;
                return new dzc(clipFeedListFragment.Ka(), clipFeedListFragment.Eo(), clipFeedListFragment.qo().Y(), clipFeedListFragment.qo().Jf(), (w8l) clipFeedListFragment.p1.getValue());
        }
    }
}
