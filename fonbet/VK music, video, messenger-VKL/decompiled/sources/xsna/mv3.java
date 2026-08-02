package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;
import com.vk.voip.ui.asr_online.AsrOnlineViewHorizontal;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class mv3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ mv3(FrameLayout frameLayout, int i) {
        this.b = i;
        this.c = frameLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.b) {
            case 0:
                AsrOnlineViewHorizontal asrOnlineViewHorizontal = (AsrOnlineViewHorizontal) this.c;
                if (asrOnlineViewHorizontal.i == 0 || asrOnlineViewHorizontal.getWidth() <= 0) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = asrOnlineViewHorizontal.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = view.getWidth() - asrOnlineViewHorizontal.i;
                asrOnlineViewHorizontal.fullScroll(130);
                asrOnlineViewHorizontal.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = asrOnlineViewHorizontal.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.topMargin = (asrOnlineViewHorizontal.i / 2) + marginLayoutParams.topMargin;
                asrOnlineViewHorizontal.setLayoutParams(marginLayoutParams);
                asrOnlineViewHorizontal.i = 0;
                return;
            default:
                MultiBannerControlsContainer.a((MultiBannerControlsContainer) this.c, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
        }
    }
}
