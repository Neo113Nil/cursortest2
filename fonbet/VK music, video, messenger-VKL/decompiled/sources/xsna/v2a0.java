package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.userstack.VkMiniUserStack;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.stories.design.view.StoryProgressView;
import com.vkontakte.android.R;

/* compiled from: PhoneBookStoriesPhotoItemHolderView.kt */
/* loaded from: classes4.dex */
public final class v2a0 extends RatioFrameLayout implements cex, s2a0 {
    public final FrescoImageView e;
    public final StoryProgressView f;
    public final TextView g;
    public final VkButton h;
    public final VkText i;
    public final VkMiniUserStack j;
    public final VkText k;
    public final ConstraintLayout l;

    public v2a0(Context context) {
        super(context, null, 0);
        setId(R.id.photo_wrap);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setContentDescription(context.getString(R.string.accessibility_photo));
        setOrientation(0);
        FrescoImageView frescoImageView = new FrescoImageView(context, null, 6, 0);
        frescoImageView.setId(R.id.video_preview);
        frescoImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        frescoImageView.setContentDescription(null);
        this.e = frescoImageView;
        frescoImageView.setScaleType(ScaleType.CENTER_CROP);
        frescoImageView.setPlaceholder(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder)));
        addView(frescoImageView);
        addView(super.c(context));
        StoryProgressView a = super.a(context);
        this.f = a;
        addView(a);
        addView(super.e(context));
        TextView d = super.d(context);
        this.g = d;
        addView(d);
        rud0 f = super.f(context);
        this.h = f.d;
        this.i = f.c;
        xzq0 xzq0Var = f.b;
        this.j = xzq0Var.b;
        this.k = xzq0Var.c;
        this.l = xzq0Var.a;
        addView(f.a);
    }

    @Override // xsna.s2a0
    public VkText getCountFriendsTextView() {
        return this.k;
    }

    public final TextView getPhotoAuthor() {
        return this.g;
    }

    public final FrescoImageView getPhotoPreview() {
        return this.e;
    }

    public final StoryProgressView getPhotoProgress() {
        return this.f;
    }

    @Override // xsna.s2a0
    public VkButton getProfileButton() {
        return this.h;
    }

    @Override // xsna.s2a0
    public VkText getUserNameView() {
        return this.i;
    }

    @Override // xsna.s2a0
    public VkMiniUserStack getUserStack() {
        return this.j;
    }

    @Override // xsna.s2a0
    public View getUserStackViewsContainer() {
        return this.l;
    }
}
