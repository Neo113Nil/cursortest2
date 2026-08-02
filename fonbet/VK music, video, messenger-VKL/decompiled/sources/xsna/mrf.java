package xsna;

import android.view.View;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;

/* compiled from: ClipsWrapperFragment.kt */
/* loaded from: classes17.dex */
public final class mrf implements gzs<View> {
    public final /* synthetic */ ClipsWrapperFragment b;

    public mrf(ClipsWrapperFragment clipsWrapperFragment) {
        this.b = clipsWrapperFragment;
    }

    @Override // xsna.gzs
    public final View invoke() {
        View view = this.b.getView();
        if (view == null || !view.isAttachedToWindow()) {
            return null;
        }
        return view;
    }
}
