package xsna;

import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.vk.tab.presentation.TabView;
import com.vkontakte.android.R;

/* compiled from: TransparentTabView.kt */
/* loaded from: classes3.dex */
public final class oop0 extends TabView {
    public boolean i;

    @Override // com.vk.tab.presentation.TabView
    public int getUnselectedBackground() {
        return super.getUnselectedBackground();
    }

    @Override // com.vk.tab.presentation.TabView, xsna.cp6
    public void setTabSelected(boolean z) {
        b(getCardView(), z);
        CardView cardView = getCardView();
        Integer num = null;
        cardView.setBackgroundTintList(null);
        cardView.setBackground(cardView.getContext().getDrawable(z ? R.drawable.bg_tab_selected : getUnselectedBackground()));
        ImageView iconView = getIconView();
        int i = z ? R.attr.vk_ui_icon_accent_themed : R.attr.vk_ui_icon_medium;
        abg0 abg0Var = dhr0.t;
        iconView.setColorFilter(abg0Var.c(i));
        boolean z2 = this.i;
        if (z2) {
            setTextColor(z ? (z2 || dhr0.M()) ? R.attr.vk_ui_text_primary_invariably : R.attr.vk_ui_accent_blue : z2 ? R.attr.vk_ui_text_contrast : R.attr.vk_ui_text_primary);
        } else {
            getTextView().setTextColor(abg0Var.c(z ? R.attr.vk_ui_text_accent_themed : R.attr.vk_ui_text_secondary));
        }
        Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_contrast);
        if (z && this.i) {
            num = valueOf;
        }
        setCardTint(num);
    }

    public final void setTransparent(boolean z) {
        this.i = z;
    }
}
