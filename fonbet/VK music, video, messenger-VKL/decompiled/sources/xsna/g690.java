package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.vkontakte.android.R;

/* compiled from: OzonBadge.kt */
/* loaded from: classes18.dex */
public final class g690 extends FrameLayout {
    public g690(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.pds_badge_ozon, this);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }
}
