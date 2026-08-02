package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.presentation.model.items.MyTargetNativeAdSinglePartUiDto;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;

/* compiled from: NativeAdStaticDelegate.kt */
/* loaded from: classes4.dex */
public final class jv50 implements ii6 {
    public final View b;
    public MyTargetNativeAdSinglePartUiDto c;
    public final MediaAdView d;
    public final IconAdView e;
    public final FrameLayout f;
    public final FrameLayout g;
    public boolean h;

    public jv50(View view) {
        this.b = view;
        MediaAdView mediaAdView = (MediaAdView) view.findViewById(R.id.mediaView);
        this.d = mediaAdView;
        IconAdView iconAdView = (IconAdView) view.findViewById(R.id.icon);
        this.e = iconAdView;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.cta_button_container);
        this.f = frameLayout;
        this.g = (FrameLayout) view.findViewById(R.id.mediaViewContainer);
        iconAdView.setVisibility(8);
        mediaAdView.setVisibility(8);
        frameLayout.setVisibility(8);
    }

    @Override // xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
        View view = this.b;
        view.setContentDescription(di60.m(disclaimerData, view.getContext()));
        final n0n n0nVar = new n0n();
        this.d.getImageView().setOnHoverListener(new View.OnHoverListener(n0nVar, this) { // from class: xsna.iv50
            public final /* synthetic */ jv50 a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnHoverListener
            public final boolean onHover(View view2, MotionEvent motionEvent) {
                View view3 = this.a.b;
                boolean b = n0n.b(view3, motionEvent);
                if (b) {
                    awt0.q(view3);
                }
                return b;
            }
        });
    }

    @Override // xsna.t0n
    public final View R0() {
        return this.g;
    }

    @Override // xsna.a1n
    public final void U5() {
        this.h = true;
    }

    @Override // xsna.ii6
    public final void dispose() {
        zu50 zu50Var;
        MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto = this.c;
        if (myTargetNativeAdSinglePartUiDto != null && (zu50Var = myTargetNativeAdSinglePartUiDto.h) != null) {
            zu50Var.k = null;
            ckz0 ckz0Var = zu50Var.h;
            if (ckz0Var != null) {
                ckz0Var.m(null);
            }
        }
        this.e.setVisibility(8);
        this.d.setVisibility(8);
        this.f.setVisibility(8);
    }

    @Override // xsna.ii6
    public final s4e0 j0() {
        return null;
    }

    @Override // xsna.ii6
    public final void j2(NewsEntry newsEntry, MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto) {
        this.c = myTargetNativeAdSinglePartUiDto;
        this.e.setVisibility(0);
        MediaAdView mediaAdView = this.d;
        mediaAdView.setVisibility(0);
        this.f.setVisibility(0);
        int i = l5g.l;
        mediaAdView.setBackgroundColor(f870.H(l5g.j));
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.h;
    }
}
