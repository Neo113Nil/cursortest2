package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.tool.view.newsfeed.image.FixedSizeVKEnhancedImageView;
import com.vk.newsfeed.common.presentation.model.items.MyTargetNativeAdSinglePartUiDto;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;

/* compiled from: InternalNativeAdStaticDelegate.kt */
/* loaded from: classes4.dex */
public final class ejx implements ii6 {
    public final View b;
    public MyTargetNativeAdSinglePartUiDto c;
    public final FixedSizeVKEnhancedImageView d;
    public final FixedSizeVKEnhancedImageView e;
    public final FrameLayout f;
    public final FrameLayout g;
    public boolean h;

    public ejx(View view) {
        this.b = view;
        this.d = (FixedSizeVKEnhancedImageView) view.findViewById(R.id.iconImage);
        FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView = (FixedSizeVKEnhancedImageView) view.findViewById(R.id.imageView);
        this.e = fixedSizeVKEnhancedImageView;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.cta_button_container);
        this.f = frameLayout;
        this.g = (FrameLayout) view.findViewById(R.id.mediaViewContainer);
        fixedSizeVKEnhancedImageView.setVisibility(8);
        frameLayout.setVisibility(8);
    }

    @Override // xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
        View view = this.b;
        view.setContentDescription(di60.m(disclaimerData, view.getContext()));
        final n0n n0nVar = new n0n();
        this.e.setOnHoverListener(new View.OnHoverListener(n0nVar, this) { // from class: xsna.djx
            public final /* synthetic */ ejx a;

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
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.f.setVisibility(8);
    }

    @Override // xsna.ii6
    public final s4e0 j0() {
        return null;
    }

    @Override // xsna.ii6
    public final void j2(NewsEntry newsEntry, MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto) {
        wjz0 content;
        wjz0 content2;
        this.c = myTargetNativeAdSinglePartUiDto;
        gjx gjxVar = myTargetNativeAdSinglePartUiDto.j;
        kbz0 kbz0Var = (gjxVar == null || (content2 = gjxVar.getContent()) == null) ? null : content2.d;
        kbz0 kbz0Var2 = (gjxVar == null || (content = gjxVar.getContent()) == null) ? null : content.e;
        if (kbz0Var != null) {
            kiw kiwVar = kbz0Var.a;
            FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView = this.d;
            fixedSizeVKEnhancedImageView.setVisibility(0);
            if (kiwVar.a() != null) {
                fixedSizeVKEnhancedImageView.setImageBitmap(kiwVar.a());
            } else {
                fixedSizeVKEnhancedImageView.setLocalImage((fxj0) null);
                fixedSizeVKEnhancedImageView.setRemoteImage(kiwVar.a);
            }
        }
        FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView2 = this.e;
        if (kbz0Var2 != null) {
            kiw kiwVar2 = kbz0Var2.a;
            fixedSizeVKEnhancedImageView2.setVisibility(0);
            if (kiwVar2.a() != null) {
                fixedSizeVKEnhancedImageView2.e1(kiwVar2.b, kiwVar2.c);
                fixedSizeVKEnhancedImageView2.setImageBitmap(kiwVar2.a());
            } else {
                fixedSizeVKEnhancedImageView2.e1(kiwVar2.b, kiwVar2.c);
                fixedSizeVKEnhancedImageView2.setLocalImage((fxj0) null);
                fixedSizeVKEnhancedImageView2.setRemoteImage(kiwVar2.a);
            }
        }
        this.f.setVisibility(0);
        fixedSizeVKEnhancedImageView2.setBackgroundColor(f870.H(l5g.j));
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.h;
    }
}
