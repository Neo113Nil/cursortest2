package xsna;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vkontakte.android.R;

/* compiled from: DiscoverMediaTabFragment2.kt */
/* loaded from: classes4.dex */
public final class wsx implements wzs<s3q0, Boolean, s3q0> {
    public krh b;

    @Override // xsna.wzs
    public final s3q0 invoke(s3q0 s3q0Var, Boolean bool) {
        View view;
        LottieAnimationView lottieAnimationView;
        boolean booleanValue = bool.booleanValue();
        krh krhVar = this.b;
        if (krhVar != null && (view = ((DiscoverMediaTabFragment2) krhVar.c).r0) != null) {
            if (booleanValue && !bwt0.K(view) && (lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.rlottie_view_icon)) != null) {
                lottieAnimationView.setAnimation(dhr0.M() ? R.raw.vk_antenna_dark_56 : R.raw.vk_antenna_light_56);
                try {
                    view.performHapticFeedback(17);
                } catch (Throwable unused) {
                }
            }
            bwt0.p0(view, booleanValue);
        }
        return s3q0.a;
    }
}
