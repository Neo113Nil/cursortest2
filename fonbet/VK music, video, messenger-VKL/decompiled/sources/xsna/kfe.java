package xsna;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.vk.clips.viewer.impl.feed.wrapper.domain.model.ClipsWrapperHeaderMode;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.shimmer.ThemableShimmer;

/* compiled from: ClipsHeaderView.kt */
/* loaded from: classes16.dex */
public final class kfe implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ife b;
    public final /* synthetic */ ThemableShimmer c;

    public kfe(ife ifeVar, ThemableShimmer themableShimmer) {
        this.b = ifeVar;
        this.c = themableShimmer;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ife ifeVar = this.b;
        LinearLayout linearLayout = ifeVar.d;
        linearLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        if (ifeVar.i != ClipsWrapperHeaderMode.TABS || linearLayout.getChildCount() == 0 || !(linearLayout.getChildAt(0) instanceof VkSkeleton)) {
            return true;
        }
        this.c.b();
        return true;
    }
}
