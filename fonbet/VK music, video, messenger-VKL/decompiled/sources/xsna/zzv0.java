package xsna;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: VkVideoFeedButtonPromoView.kt */
/* loaded from: classes3.dex */
public final class zzv0 extends FrameLayout {
    public uzv0 b;
    public View c;
    public LinearLayout d;

    public final void setText(String str) {
        ((TextView) findViewById(R.id.name)).setText(str);
        setVisibility(0);
    }
}
