package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.core.content.ContentTab;
import com.vk.tab.presentation.TabView;
import com.vkontakte.android.R;

/* compiled from: FlatContentTabView.kt */
/* loaded from: classes5.dex */
public class aor extends TabView {
    public static final /* synthetic */ int i = 0;

    /* compiled from: FlatContentTabView.kt */
    public static final class a extends InsetDrawable {
        public final TabLayout b;

        public a(TabLayout tabLayout, Drawable drawable) {
            super(drawable, 0, 0, 0, 0);
            this.b = tabLayout;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            TabLayout tabLayout = this.b;
            int tabCount = tabLayout.getTabCount();
            for (int i5 = 0; i5 < tabCount; i5++) {
                TabLayout.g b = tabLayout.b(i5);
                TabLayout.i iVar = b != null ? b.h : null;
                KeyEvent.Callback callback = b != null ? b.f : null;
                aor aorVar = callback instanceof aor ? (aor) callback : null;
                if (aorVar != null && iVar != null) {
                    int left = iVar.getLeft();
                    int right = iVar.getRight();
                    int max = Math.max(i, left);
                    aorVar.setBlendRatio((Math.min(i3, right) >= max ? r6 - max : 0) / (right - left));
                }
            }
        }
    }

    @Override // com.vk.tab.presentation.TabView
    public final void a(ksn0 ksn0Var) {
        if (ksn0Var instanceof ContentTab.Options) {
            getIconView().setContentDescription(getContext().getString(R.string.accessibility_tab_pinning_options));
        }
    }

    public final void setBlendRatio(float f) {
        TextView textView = getTextView();
        abg0 abg0Var = dhr0.t;
        textView.setTextColor(n8g.d(f, abg0Var.c(R.attr.vk_ui_text_secondary), abg0Var.c(R.attr.vk_ui_icon_accent_themed)));
        getIconView().setColorFilter(n8g.d(f, abg0Var.c(R.attr.vk_ui_icon_medium), abg0Var.c(R.attr.vk_ui_icon_accent_themed)));
    }

    @Override // com.vk.tab.presentation.TabView, xsna.cp6
    public void setTabSelected(boolean z) {
        CardView cardView = getCardView();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        cardView.setCardElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        getCardView().setBackground(null);
        if (z) {
            f = 1.0f;
        }
        setBlendRatio(f);
    }
}
