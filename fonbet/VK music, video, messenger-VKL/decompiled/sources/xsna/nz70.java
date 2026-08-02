package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.profile.core.avatar.AvatarlessStoriesContainer;
import com.vk.stories.design.view.avatar.StoryAvatarView;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import xsna.cq5;
import xsna.qeh;

/* compiled from: OldCommunityProfileAvatarView.kt */
/* loaded from: classes5.dex */
public final class nz70 extends FrameLayout implements qeh {
    public final LayerDrawable b;
    public final StoryAvatarView c;

    public nz70(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        this.b = new LayerDrawable(new Drawable[]{context.getDrawable(R.drawable.bg_community_set_avatar_placeholder), dhr0.t.b(R.drawable.vk_icon_camera_outline_28, R.attr.vk_ui_icon_medium)});
        StoryAvatarView storyAvatarView = new StoryAvatarView(context, null, 6, 0);
        storyAvatarView.setFromProfile(true);
        storyAvatarView.setAvatarBorderConfigParamsOverride(o9r0.a(storyAvatarView.getAvatarBorderConfigParamsOverride(), true, null, null, null, null, null, null, null, false, 2046));
        this.c = storyAvatarView;
    }

    @Override // xsna.qeh
    public final void E() {
        this.c.E();
    }

    @Override // xsna.qeh
    public final void e() {
        this.c.e();
    }

    @Override // xsna.qeh
    public final void n(int i) {
        if (i <= 0) {
            return;
        }
        removeAllViews();
        int a = (iah0.a(4) * 4) + i;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        layoutParams.gravity = 17;
        LayerDrawable layerDrawable = this.b;
        layerDrawable.setLayerGravity(0, 17);
        layerDrawable.setLayerSize(0, i, i);
        layerDrawable.setLayerGravity(1, 17);
        float f = 28;
        layerDrawable.setLayerSize(1, iah0.a(f), iah0.a(f));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        StoryAvatarView storyAvatarView = this.c;
        storyAvatarView.F0(layerDrawable, scaleType);
        addView(storyAvatarView, layoutParams);
    }

    @Override // xsna.qeh
    public void setSolidFillColor(int i) {
        this.c.setImageTintList(ColorStateList.valueOf(getContext().getColor(i)));
    }

    @Override // xsna.qeh
    public final void u(qeh.a aVar, String str, boolean z, boolean z2, StoriesContainer storiesContainer, String str2) {
        AvatarBorderType avatarBorderType = aVar.c;
        boolean f = epx.f(aVar.b, cq5.d.a);
        yxl0 yxl0Var = new yxl0();
        StoryAvatarView storyAvatarView = this.c;
        if (z) {
            storyAvatarView.setImageResource(R.drawable.vk_icon_avatar_placeholder_sad_persik_150);
            return;
        }
        if (z2) {
            if (storiesContainer == null || storiesContainer.g.isEmpty()) {
                storyAvatarView.s1(null, avatarBorderType);
            } else {
                storyAvatarView.t1(new AvatarlessStoriesContainer(storiesContainer), f, yxl0Var, null);
            }
            storyAvatarView.W();
            return;
        }
        if (storiesContainer != null && !storiesContainer.g.isEmpty()) {
            storyAvatarView.t1(storiesContainer, f, yxl0Var, null);
            return;
        }
        iso0 s = com.vk.toggle.d.s();
        CoreFeatures coreFeatures = CoreFeatures.THUMB_HASH;
        coreFeatures.getClass();
        String b = s.b(str2, com.vk.toggle.b.A.a(coreFeatures) && com.vk.toggle.d.s().d);
        if (b != null) {
            storyAvatarView.setThumbHash(b);
        }
        storyAvatarView.s1(str, avatarBorderType);
    }

    @Override // xsna.qeh
    public final void w(o9r0 o9r0Var) {
        if (o9r0Var.e) {
            this.c.y0(cn70.c(4), dhr0.t.c(R.attr.vk_ui_image_border_alpha));
        }
    }

    @Override // xsna.ts5
    public View getView() {
        return this;
    }
}
