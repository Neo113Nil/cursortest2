package xsna;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: MessageTranslateActionView.kt */
/* loaded from: classes6.dex */
public final class lb20 extends LinearLayout {
    public int b;
    public final AppCompatImageView c;
    public final AppCompatTextView d;

    public lb20(Context context) {
        super(context);
        this.b = -1;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(cn70.b(24), cn70.b(24));
        layoutParams.gravity = 16;
        appCompatImageView.setLayoutParams(layoutParams);
        abg0 abg0Var = dhr0.t;
        appCompatImageView.setColorFilter(abg0Var.c(R.attr.vk_legacy_accent));
        f4m.u(appCompatImageView, cn70.b(16), cn70.b(16), 0, cn70.b(16));
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.c = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        appCompatTextView.setLayoutParams(layoutParams2);
        f4m.u(appCompatTextView, cn70.b(16), 0, cn70.b(16), 0);
        appCompatTextView.setTextColor(abg0Var.c(R.attr.vk_legacy_accent));
        com.vk.typography.b.k(appCompatTextView, FontFamily.REGULAR, Float.valueOf(16.0f), 4);
        this.d = appCompatTextView;
        setOrientation(0);
        addView(appCompatImageView);
        addView(appCompatTextView);
        setBackground(xus.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e3m.f(R.attr.content, context), 0, 254));
    }

    public final int getActionId() {
        return this.b;
    }

    public final void setActionId(int i) {
        this.b = i;
    }
}
