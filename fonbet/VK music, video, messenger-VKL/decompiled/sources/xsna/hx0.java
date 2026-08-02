package xsna;

import android.graphics.PorterDuff;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.clips.design.view.component.audio.ClipsAudioToggle;
import com.vk.clips.design.view.component.description.ClipDescription;
import com.vk.clips.design.view.component.user.ClipUserView;
import com.vk.clips.tool.view.component.ads.ParentDependentHeightAppCompatImageView;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.tools.VkViewStub;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: AdsItemMainOverlayContainer.kt */
/* loaded from: classes17.dex */
public final class hx0 {
    public final bcr0<ImageView> a;
    public final ConstraintLayout b;
    public final View c;
    public final ImageView d;
    public final ClipUserView e;
    public final VkText f;
    public final VkText g;
    public final VkText h;
    public final ClipDescription i;
    public final ClipsAudioToggle j;
    public final ParentDependentHeightAppCompatImageView k;
    public final VkText l;
    public final VkViewStub m;
    public final ImageView n;
    public final VkRichCell o;
    public final ConstraintLayout p;

    /* JADX WARN: Multi-variable type inference failed */
    public hx0(View view, int i, boolean z, bcr0<? extends ImageView> bcr0Var) {
        RenderEffect createBlurEffect;
        this.a = bcr0Var;
        this.b = (ConstraintLayout) view.findViewById(R.id.fullscreen_ads_main_overlay_container);
        this.c = view.findViewById(R.id.fullscreen_ads_description_expanded_blackout);
        this.d = (ImageView) view.findViewById(R.id.fullscreen_ads_side_controls_more);
        ClipUserView clipUserView = (ClipUserView) view.findViewById(R.id.fullscreen_ads_owner);
        clipUserView.setLeftAvatarView(new ex0(0, this, view));
        this.e = clipUserView;
        VkText vkText = (VkText) view.findViewById(R.id.fullscreen_ads_subscribe);
        vkText.setBackgroundTintMode(PorterDuff.Mode.DST_OVER);
        this.f = vkText;
        this.g = (VkText) view.findViewById(R.id.fullscreen_ads_subscribed_text);
        this.h = (VkText) view.findViewById(R.id.fullscreen_ads_right_title_dot_separator);
        this.i = (ClipDescription) view.findViewById(R.id.fullscreen_ads_description);
        this.j = (ClipsAudioToggle) view.findViewById(R.id.fullscreen_ads_mute_icon);
        this.k = (ParentDependentHeightAppCompatImageView) view.findViewById(R.id.fullscreen_ads_disclaimer_banner);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.fullscreen_ads_disclaimer_container);
        final VkText vkText2 = (VkText) view.findViewById(R.id.fullscreen_ads_disclaimer);
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.dx0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                if (i4 != i8) {
                    VkText vkText3 = VkText.this;
                    ViewGroup.LayoutParams layoutParams = vkText3.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.width = -1;
                    vkText3.setLayoutParams(layoutParams);
                    if (!vkText3.isLaidOut() || vkText3.isLayoutRequested()) {
                        vkText3.addOnLayoutChangeListener(new gx0(vkText3));
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams2 = vkText3.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams2.width = vkText3.getWidth();
                    vkText3.setLayoutParams(layoutParams2);
                }
            }
        });
        this.l = vkText2;
        this.m = (VkViewStub) view.findViewById(R.id.fullscreen_ads_action_btn);
        ImageView imageView = (ImageView) view.findViewById(R.id.fullscreen_ads_action_btn_arrow_up);
        if (imageView != null) {
            imageView.setImageDrawable(new baf0(m33.a(R.drawable.vk_icon_chevron_up_20, imageView.getContext()), e3m.f(R.attr.vk_ui_icon_contrast, imageView.getContext())));
        } else {
            imageView = null;
        }
        this.n = imageView;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.fullscreen_subscribe_banner_layout);
        f4m.q(iah0.a(14), constraintLayout);
        this.p = constraintLayout;
        VkRichCell vkRichCell = (VkRichCell) view.findViewById(R.id.fullscreen_subscribe_banner);
        vkRichCell.setLeftMainAvatarController(new vhw());
        this.o = vkRichCell;
        View findViewById = view.findViewById(R.id.fullscreen_ads_bottom_gradient);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{n8g.l(-16777216, 0), n8g.l(-16777216, 13), n8g.l(-16777216, 23), n8g.l(-16777216, 41), n8g.l(-16777216, 66), n8g.l(-16777216, 97), n8g.l(-16777216, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), n8g.l(-16777216, 128), n8g.l(-16777216, 153), n8g.l(-16777216, 179), n8g.l(-16777216, 204), n8g.l(-16777216, 230), n8g.l(-16777216, 230)});
        gradientDrawable.setAlpha(160);
        findViewById.setBackground(gradientDrawable);
        View findViewById2 = view.findViewById(R.id.fullscreen_banner_background_blur);
        if (Build.VERSION.SDK_INT >= 31) {
            float a = iah0.a(16);
            gcd0.d(findViewById2, 6, a);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            createBlurEffect = RenderEffect.createBlurEffect(a, a, Shader.TileMode.CLAMP);
            findViewById2.setRenderEffect(createBlurEffect);
        }
        findViewById2.setBackgroundColor(e3m.f(R.attr.vk_ui_background_contrast_secondary_alpha, findViewById2.getContext()));
        f4m.v(i, view);
        if (z) {
            vkText2.setTextColor(e3m.f(R.attr.vk_ui_text_primary_alpha, view.getContext()));
        }
    }
}
