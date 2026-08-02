package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.DisplayCutout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.tlo0;

/* compiled from: CommunityLiveCover.kt */
/* loaded from: classes17.dex */
public final class b8h extends FrameLayout {
    public final z4i b;
    public final VkImage c;
    public final VkImage d;
    public gzs<s3q0> e;
    public final VkSpinner f;
    public final VkPlaceholder g;
    public final View h;
    public final Handler i;
    public final o93 j;

    /* JADX WARN: Multi-variable type inference failed */
    public b8h(Context context) {
        super(context, null, 0);
        z4i z4iVar = new z4i(context, null, 0);
        this.b = z4iVar;
        VkImage vkImage = new VkImage(context, null, 6, 0);
        vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.c = vkImage;
        VkImage vkImage2 = new VkImage(context, null, 6, 0);
        this.d = vkImage2;
        VkSpinner vkSpinner = new VkSpinner(context, null, 6, 0);
        float f = 32;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f));
        layoutParams.gravity = 17;
        vkSpinner.setLayoutParams(layoutParams);
        vkSpinner.setVisibility(8);
        vkSpinner.setSpinnerSize(VkSpinner.SpinnerSize.Size36);
        vkSpinner.setIndeterminateTintList(ColorStateList.valueOf(krv0.l(R.attr.vk_ui_icon_contrast)));
        this.f = vkSpinner;
        VkPlaceholder vkPlaceholder = new VkPlaceholder(context, null, 6, 0);
        vkPlaceholder.setWithPaddings(false);
        awt0.x(vkPlaceholder, e3m.a(R.dimen.ds_placeholder_horizontal_padding, context), 0, e3m.a(R.dimen.ds_placeholder_horizontal_padding, context), 0, 10);
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.live_cover_loading_error)), new VkPlaceholder.b.C0859b(14, 0 == true ? 1 : 0)));
        VkPlaceholder.a.C0857a c0857a = null;
        vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.community_cover_retry), (gzs) new com.vk.movika.sdk.base.presenter.b(this, 22), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, (VkButton.Mode) null, (VkButton.Appearance) null, false, IronSourceError.ERROR_CODE_INIT_FAILED), c0857a, c0857a, 0 == true ? 1 : 0, 8));
        vkPlaceholder.setVisibility(8);
        this.g = vkPlaceholder;
        View inflate = LayoutInflater.from(context).inflate(R.layout.pds_cover_tooltip_tap_to_play, (ViewGroup) this, false);
        inflate.setVisibility(8);
        this.h = inflate;
        this.i = new Handler(Looper.getMainLooper());
        this.j = new o93(this, 8);
        setBackgroundColor(context.getColor(R.color.vk_gray_800));
        addView(vkImage);
        addView(z4iVar);
        addView(vkImage2);
        addView(vkPlaceholder, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        s3q0 s3q0Var = s3q0.a;
        addView(inflate, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        addView(vkSpinner, layoutParams3);
    }

    private final boolean getAnimationEnabled() {
        return !(Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void a(float f) {
        if (getAnimationEnabled()) {
            float f2 = (f * 0.1f) + 1.0f;
            VkImage vkImage = this.c;
            vkImage.setScaleX(f2);
            vkImage.setScaleY(f2);
            invalidate();
        }
    }

    public final VkImage getForegroundImageView() {
        return this.d;
    }

    public final VkImage getImageView() {
        return this.c;
    }

    public final gzs<s3q0> getOnRetry() {
        return this.e;
    }

    public final z4i getVideoTextureView() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (gz80.a(28)) {
            HashSet hashSet = iah0.a;
            WindowInsets rootWindowInsets = getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null;
            r5 = (displayCutout != null ? displayCutout.getSafeInsetBottom() : 0) + (displayCutout != null ? displayCutout.getSafeInsetTop() : 0);
        }
        int p = iah0.p(getContext()) + r5;
        int z = iah0.z(getContext());
        float f = z;
        if (p < 1.25f * f) {
            p = (int) (f * 2.5f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(z, 1073741824), View.MeasureSpec.makeMeasureSpec(p, 1073741824));
        setTranslationY((-(getMeasuredHeight() - ((ViewGroup) getParent()).getMeasuredHeight())) / 2.0f);
    }

    public final void setOnRetry(gzs<s3q0> gzsVar) {
        this.e = gzsVar;
    }

    public final void setTooltipVisibility(boolean z) {
        this.h.setVisibility(z ? 0 : 8);
    }
}
