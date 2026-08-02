package xsna;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkFadeText;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: VkAdBannerView.kt */
/* loaded from: classes18.dex */
public final class g7u0 extends ConstraintLayout {
    public String A;
    public final VkFadeText t;
    public final VkFadeText u;
    public final VkButton v;
    public final VkImage w;
    public final FrameLayout x;
    public final VkText y;
    public boolean z;

    /* compiled from: VkAdBannerView.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MainContent(title=");
            sb.append(this.a);
            sb.append(", subtitle=");
            sb.append(this.b);
            sb.append(", buttonText=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public g7u0(l7s l7sVar) {
        super(l7sVar, null, 0);
        View.inflate(l7sVar, R.layout.vk_ad_banner, this);
        setBackgroundResource(R.drawable.bg_vk_ad_banner);
        VkFadeText vkFadeText = (VkFadeText) bwt0.p(this, R.id.vk_ad_banner_title, null, null, 6);
        this.t = vkFadeText;
        VkFadeText vkFadeText2 = (VkFadeText) bwt0.p(this, R.id.vk_ad_banner_subtitle, null, null, 6);
        this.u = vkFadeText2;
        this.v = (VkButton) bwt0.p(this, R.id.vk_ad_banner_button, null, null, 6);
        VkImage vkImage = (VkImage) bwt0.p(this, R.id.vk_ad_banner_image, null, null, 6);
        this.w = vkImage;
        this.x = (FrameLayout) bwt0.p(this, R.id.vk_ad_banner_badge_container, null, null, 6);
        this.y = (VkText) bwt0.p(this, R.id.vk_ad_banner_badge_text, null, null, 6);
        vkImage.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_image_placeholder));
        bwt0.d(vkImage, iah0.b(8.0f), (r4 & 2) != 0, (r4 & 4) != 0);
        vkFadeText.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.f7u0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                g7u0.this.P4();
            }
        });
        vkFadeText.setMaxTextLines(3);
        vkFadeText2.setMaxTextLines(1);
    }

    private final void setSubtitle(String str) {
        VkFadeText vkFadeText = this.u;
        if (str == null) {
            f4m.j(vkFadeText);
            return;
        }
        vkFadeText.setVisibility(0);
        vkFadeText.setText(str);
        P4();
    }

    private final void setTitle(String str) {
        this.t.setText(str);
    }

    public final void P4() {
        if (this.z) {
            return;
        }
        VkFadeText vkFadeText = this.t;
        int min = Math.min(vkFadeText.getLineCount(), vkFadeText.getMaxLines());
        if (min == 0) {
            return;
        }
        int i = 3;
        if (min >= 3) {
            i = 1;
        } else if (min == 2) {
            i = 2;
        }
        this.u.setMaxTextLines(i);
    }

    public final View getBadgeContainerView() {
        return this.x;
    }

    public final View getBadgeTextView() {
        return this.y;
    }

    public final View getButtonView() {
        return this.v;
    }

    public final View getImageView() {
        return this.w;
    }

    public final View getTitleView() {
        return this.t;
    }

    public final void setAdBadgeClickListener(izs<? super View, s3q0> izsVar) {
        bwt0.i0(getBadgeContainerView(), izsVar);
    }

    public final void setMainContent(a aVar) {
        String str = aVar.c;
        String str2 = aVar.b;
        boolean z = str2 != null;
        boolean z2 = str != null;
        this.z = z2;
        int i = (z2 && z) ? 1 : (!z2 || z) ? 3 : 2;
        Integer num = z2 ? 1 : null;
        this.t.setMaxTextLines(i);
        if (num != null) {
            this.u.setMaxTextLines(num.intValue());
        }
        setTitle(aVar.a);
        setSubtitle(str2);
        VkButton vkButton = this.v;
        if (str == null) {
            f4m.j(vkButton);
        } else {
            vkButton.setVisibility(0);
            vkButton.setText(str);
        }
    }
}
