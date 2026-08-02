package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vkontakte.android.R;

/* compiled from: SharingItemView.java */
/* loaded from: classes5.dex */
public final class ybj0 extends FrameLayout {
    public Drawable b;
    public final int c;
    public final int d;
    public final AppCompatImageView e;
    public final AppCompatTextView f;
    public final VkOnboardingHighlighter g;

    public ybj0(Context context, int i, @Nullable Drawable drawable, @Nullable String str, boolean z, boolean z2) {
        super(context);
        View inflate = z ? View.inflate(context, R.layout.layout_sharing_item_view_v2, this) : View.inflate(context, R.layout.layout_sharing_item_view, this);
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.action_icon);
        this.e = appCompatImageView;
        AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(R.id.action_title);
        this.f = appCompatTextView;
        VkOnboardingHighlighter vkOnboardingHighlighter = (VkOnboardingHighlighter) inflate.findViewById(R.id.action_highlighter);
        this.g = vkOnboardingHighlighter;
        int Y = z ? dhr0.Y(R.attr.vk_ui_icon_accent_themed, context) : dhr0.Y(R.attr.vk_ui_icon_accent, context);
        this.d = Y;
        this.c = i;
        boolean z3 = (i == 14 || i == 17 || i == 15 || i == 18 || i == 3) ? false : true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            if (z3) {
                mutate.setTint(Y);
            }
            this.b = mutate;
            appCompatImageView.setImageDrawable(mutate);
        }
        if (str != null) {
            appCompatTextView.setText(str);
        }
        if (vkOnboardingHighlighter == null) {
            return;
        }
        if (z2) {
            appCompatTextView.post(new nf0(this, 13));
        } else {
            vkOnboardingHighlighter.c(false);
            appCompatTextView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
        }
    }
}
