package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.utils.vectordrawable.EnhancedVectorDrawable;
import com.vk.utils.vectordrawable.VectorPath;
import com.vkontakte.android.R;

/* compiled from: VkEcosystemButtonView.kt */
/* loaded from: classes6.dex */
public final class qqu0 extends FrameLayout {
    public String b;
    public boolean c;
    public boolean d;
    public final VkButton e;

    public qqu0(Context context) {
        super(hnj.a(context), null, 0);
        this.b = getResources().getString(R.string.vk_auth_account_management);
        VkButton vkButton = new VkButton(getContext(), null, 6, 0);
        vkButton.setSize(VkButton.Size.Medium);
        vkButton.setAppearance(VkButton.Appearance.Neutral);
        vkButton.setContentDescription(vkButton.getResources().getString(R.string.vk_auth_account_management_vk_id_talkback));
        addView(vkButton);
        this.e = vkButton;
        a();
        if (this.d) {
            vkButton.setMode(VkButton.Mode.Secondary);
            vkButton.setBackgroundTint(R.attr.vk_ui_background_content);
        } else {
            vkButton.setBackgroundColorful(true);
            vkButton.setMode(VkButton.Mode.Outline);
        }
    }

    public final void a() {
        Drawable drawable;
        boolean z = this.c;
        int m = krv0.m(R.attr.vk_ui_text_primary, getContext());
        if (z) {
            Drawable a = m33.a(R.drawable.vk_icon_logo_vkid_16, getContext());
            if (a != null) {
                a.setTint(m);
                drawable = a;
            } else {
                drawable = null;
            }
        } else {
            EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(getContext().getResources(), R.drawable.vk_icon_logo_vkid_color_16);
            VectorPath findPath = enhancedVectorDrawable.findPath("path_1");
            drawable = enhancedVectorDrawable;
            if (findPath != null) {
                findPath.setFillColor(m);
                drawable = enhancedVectorDrawable;
            }
        }
        if (drawable == null) {
            return;
        }
        String str = this.b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append(" ", new dlx0(iah0.a(6)), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.setSpan(new dqa(drawable), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.e.setText(spannableStringBuilder);
    }

    public final String getTitle() {
        return this.b;
    }

    public final void setCornerRadius(int i) {
        this.e.setCornerRadius(Float.valueOf(i));
    }

    public final void setLogoDark(boolean z) {
        this.c = z;
        a();
    }

    public final void setStyleLight(boolean z) {
        this.d = z;
        VkButton vkButton = this.e;
        if (z) {
            vkButton.setMode(VkButton.Mode.Secondary);
            vkButton.setBackgroundTint(R.attr.vk_ui_background_content);
        } else {
            vkButton.setBackgroundColorful(true);
            vkButton.setMode(VkButton.Mode.Outline);
        }
    }

    public final void setTitle(String str) {
        this.b = str;
        a();
    }
}
