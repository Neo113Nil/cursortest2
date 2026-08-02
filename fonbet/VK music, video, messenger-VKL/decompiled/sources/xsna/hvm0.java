package xsna;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: SubscribeButtonAnimationHelper.kt */
/* loaded from: classes17.dex */
public final class hvm0 {
    public final TextView a;

    public hvm0(TextView textView) {
        this.a = textView;
    }

    public final void a(boolean z) {
        TextView textView = this.a;
        if (!z) {
            d3m.b(textView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
            textView.setBackgroundTintList(null);
            textView.setTextColor(textView.getContext().getColor(R.color.vk_white));
        } else {
            ValueAnimator duration = ValueAnimator.ofObject(new zj3(), 16777215, Integer.valueOf(textView.getContext().getColor(R.color.vk_white))).setDuration(500L);
            duration.addUpdateListener(new fg10(textView, 1));
            duration.start();
            ValueAnimator duration2 = ValueAnimator.ofObject(new zj3(), Integer.valueOf(textView.getContext().getColor(R.color.vk_white)), Integer.valueOf(textView.getContext().getColor(R.color.vk_gray_900))).setDuration(500L);
            duration2.addUpdateListener(new ef0(textView, 2));
            duration2.start();
        }
    }
}
