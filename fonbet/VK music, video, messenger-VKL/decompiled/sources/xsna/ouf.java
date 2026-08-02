package xsna;

import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.transition.ClipsWrapperTransitionState;

/* compiled from: ClipsWrapperTransitionAnimator.kt */
/* loaded from: classes17.dex */
public final class ouf implements cge {
    public final zof b;
    public final boolean c;
    public final yce d;
    public final io2 e;
    public final ClipsWrapperFragment.k f;
    public ClipsWrapperTransitionState g = ClipsWrapperTransitionState.NOT_STARTED;

    public ouf(zof zofVar, boolean z, yce yceVar, oo2 oo2Var, ClipsWrapperFragment.k kVar) {
        this.b = zofVar;
        this.c = z;
        this.d = yceVar;
        this.e = oo2Var;
        this.f = kVar;
    }

    @Override // xsna.cge
    public final void k(ClipFeedListFragment clipFeedListFragment) {
        if (this.g != ClipsWrapperTransitionState.NOT_STARTED) {
            return;
        }
        this.g = ClipsWrapperTransitionState.SHOW_RUNNING;
        q8e Bo = clipFeedListFragment.Bo();
        int i = uvc.c;
        uvc.c(this.f.invoke(), Bo, this.e, true, new jpf(this, 1));
    }
}
