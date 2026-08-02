package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.catalog2.common.ui.holders.R$styleable;
import com.vk.core.view.avatars.StoryBorderView;
import com.vk.imageloader.view.VKImageView;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import xsna.cq5;
import xsna.f5h0;

/* compiled from: GroupAvatarViewObsolete.kt */
/* loaded from: classes16.dex */
public final class ahu extends FrameLayout implements zgu {
    public final VKImageView b;
    public final StoryBorderView c;
    public final AppCompatImageView d;
    public final boolean e;
    public final boolean f;

    public ahu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        njt hierarchy = vKImageView.getHierarchy();
        if (hierarchy != null) {
            RoundingParams a = RoundingParams.a();
            njt U = vKImageView.getBackend().U();
            if (U != null) {
                U.s(U.b.getDrawable(R.drawable.user_placeholder), f5h0.m.a);
            }
            a.c(iah0.b(0.5f), dhr0.t.c(R.attr.vk_ui_image_border_alpha));
            hierarchy.u(a);
        }
        this.b = vKImageView;
        StoryBorderView storyBorderView = new StoryBorderView(context, null, 6);
        storyBorderView.setPadding(iah0.a(1));
        storyBorderView.setBorderColor(context.getColor(R.color.vk_azure_300));
        storyBorderView.setBorderWidth(iah0.a(1.5f));
        bwt0.p0(storyBorderView, false);
        this.c = storyBorderView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        bwt0.p0(appCompatImageView, false);
        this.d = appCompatImageView;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_AVATAR_LIVE_BADGE;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        boolean a2 = bVar.a(videoFeatures);
        this.e = a2;
        VideoFeatures videoFeatures2 = VideoFeatures.LIVE_BADGE_IN_SUBS;
        videoFeatures2.getClass();
        boolean a3 = bVar.a(videoFeatures2);
        this.f = a3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        try {
            hg10.d(obtainStyledAttributes, 1);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            hg10.d(obtainStyledAttributes, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.facebook.drawee.R$styleable.b);
            try {
                int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(28, 0);
                int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(27, 0);
                int color = obtainStyledAttributes.getColor(26, 0);
                if (dimensionPixelSize3 > 0 && color != 0) {
                    njt hierarchy2 = vKImageView.getHierarchy();
                    RoundingParams roundingParams = new RoundingParams();
                    roundingParams.b = true;
                    float f = dimensionPixelSize3;
                    roundingParams.c(f, color);
                    roundingParams.g(dimensionPixelSize4);
                    hierarchy2.u(roundingParams);
                    vKImageView.y0(f, color);
                }
                obtainStyledAttributes.recycle();
                setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
                layoutParams.gravity = 17;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
                layoutParams2.gravity = 17;
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 81;
                addView(vKImageView, layoutParams);
                addView(storyBorderView, layoutParams2);
                if (a2 || a3) {
                    addView(appCompatImageView, layoutParams3);
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // xsna.zgu
    public final void B(String str, boolean z, boolean z2, cq5 cq5Var) {
        boolean equals = cq5Var.equals(cq5.b.a);
        boolean z3 = !equals;
        StoryBorderView storyBorderView = this.c;
        boolean z4 = this.f;
        if (z4 && cq5Var.equals(cq5.g.a)) {
            storyBorderView.setBorderColor(getContext().getColor(R.color.vk_red));
        }
        bwt0.p0(storyBorderView, z3);
        int b = !equals ? cn70.b(4) : cn70.b(0);
        VKImageView vKImageView = this.b;
        vKImageView.setPadding(b, b, b, b);
        vKImageView.o0(str, null);
        AppCompatImageView appCompatImageView = this.d;
        if (!z2 || (!this.e && !z4)) {
            f4m.j(appCompatImageView);
        } else {
            appCompatImageView.setImageResource(R.drawable.vk_icon_live_badge_16);
            appCompatImageView.setVisibility(0);
        }
    }

    @Override // xsna.zgu
    public final void L(int i) {
        VKImageView vKImageView = this.b;
        ViewGroup.LayoutParams layoutParams = vKImageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        vKImageView.setLayoutParams(layoutParams);
    }

    @Override // xsna.zgu
    public void setPlaceholderColor(int i) {
        this.b.setPlaceholderColor(i);
    }

    @Override // xsna.ts5
    public View getView() {
        return this;
    }
}
