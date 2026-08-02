package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: MusicSearchResultsTabsVhFactory.kt */
/* loaded from: classes16.dex */
public final class i550 extends nxv0 implements g380 {
    public final TextView M;
    public float N;

    public i550(Context context) {
        super(context);
        this.M = (TextView) findViewById(R.id.title);
        this.N = isSelected() ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Z4();
    }

    @Override // com.vk.core.view.components.tabs.d, xsna.too0
    public final void Ng() {
        Z4();
    }

    public final void Z4() {
        TextView textView = this.M;
        if (textView != null) {
            textView.setTextColor(n8g.d(this.N, krv0.l(R.attr.vk_ui_text_secondary), krv0.l(R.attr.vk_ui_text_accent)));
        }
    }

    @Override // com.vk.core.view.components.tabs.d, xsna.fox
    public final void m0(int i, int i2) {
        this.N = (i2 - i) / Math.max(getWidth(), 1.0f);
        Z4();
    }

    @Override // android.view.View, xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        Z4();
    }
}
