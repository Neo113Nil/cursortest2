package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: BannerCompanionView.kt */
/* loaded from: classes16.dex */
public final class z16 extends ConstraintLayout {
    public static final /* synthetic */ int F = 0;
    public n16 A;
    public boolean B;
    public boolean C;
    public String D;
    public final y16 E;
    public final VkText t;
    public final VkText u;
    public final VkImage v;
    public final VkSpinner w;
    public final VkCounter x;
    public final VkImageSimple y;
    public final VkText z;

    public z16(Context context, boolean z) {
        super(context, null, 0);
        int i = z ? R.layout.clips_ads_banner_companion_cta : R.layout.clips_ads_banner_companion;
        this.B = true;
        this.E = new y16(this);
        LayoutInflater.from(context).inflate(i, (ViewGroup) this, true);
        VkText vkText = (VkText) findViewById(R.id.ad_label);
        this.t = vkText;
        this.u = (VkText) findViewById(R.id.ad_title);
        this.v = (VkImage) findViewById(R.id.ad_image);
        VkImageSimple vkImageSimple = (VkImageSimple) findViewById(R.id.ad_close_image);
        this.y = vkImageSimple;
        VkSpinner vkSpinner = (VkSpinner) findViewById(R.id.ad_close_spinner);
        vkSpinner.setIndeterminateTintList(e3m.c(R.attr.vk_ui_icon_contrast, vkSpinner.getContext()));
        this.w = vkSpinner;
        VkCounter vkCounter = (VkCounter) findViewById(R.id.ad_close_counter);
        vkCounter.setAppearance(VkCounter.t);
        vkCounter.setTextColourful(false);
        vkCounter.setBackgroundColor(0);
        vkCounter.setCounterWithoutAnimation(5);
        this.x = vkCounter;
        VkText vkText2 = (VkText) findViewById(R.id.ad_button_cta);
        this.z = vkText2;
        vkCounter.setOnClickListener(new u16());
        vkSpinner.setOnClickListener(new u16());
        vkText.setOnClickListener(new v16(this, 0));
        vkImageSimple.setOnClickListener(new w16(this, 0));
        if (vkText2 != null) {
            vkText2.setOnClickListener(new yn3(this, 1));
        }
        setOnClickListener(new x16(this, 0));
    }

    public final void P4(boolean z) {
        if (z) {
            awt0.u(this.x, true);
            awt0.u(this.w, true);
            this.y.setVisibility(4);
        } else {
            d3m.e(this.x, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            d3m.e(this.w, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            d3m.c(this.y, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 400L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public final VkText getButton() {
        return this.z;
    }

    public final VkImage getImage() {
        return this.v;
    }

    public final VkText getLabel() {
        return this.t;
    }

    public final VkText getTitle() {
        return this.u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.B) {
            this.E.cancel();
        }
    }

    public final void setButtonText(String str) {
        VkText vkText = this.z;
        if (vkText != null) {
            vkText.setText(str);
        }
    }

    public final void setImage(String str) {
        VkImage vkImage = this.v;
        if (vkImage.isImageLoaded() && epx.f(str, this.D)) {
            return;
        }
        vkImage.o0(str, null);
        this.D = str;
    }

    public final void setOnLickListener(n16 n16Var) {
        this.A = n16Var;
    }
}
