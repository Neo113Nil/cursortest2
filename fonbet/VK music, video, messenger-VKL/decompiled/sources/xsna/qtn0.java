package xsna;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.widget.TabImageView;
import com.vk.attachpicker.widget.TabTextView;

/* compiled from: TabView.java */
/* loaded from: classes15.dex */
public final class qtn0 extends FrameLayout {
    public TabImageView b;
    public TabTextView c;
    public ImageView d;

    public final void a(float f, int i, int i2) {
        TabImageView tabImageView = this.b;
        if (i == i2) {
            tabImageView.setSelection(1.0f - f);
        } else if (i == i2 + 1) {
            tabImageView.setSelection(f);
        } else {
            tabImageView.setSelection(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        tabImageView.setColorFilter(c3r0.b(tabImageView.h, tabImageView.f, tabImageView.g));
        TabTextView tabTextView = this.c;
        tabTextView.getClass();
        if (i == i2) {
            f = 1.0f - f;
        } else if (i != i2 + 1) {
            f = 0.0f;
        }
        tabTextView.setTextColor(c3r0.b(f, tabTextView.b, tabTextView.c));
        if (i == i2) {
            this.d.setVisibility(8);
        }
    }
}
