package xsna;

import android.view.KeyEvent;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.superapp.animation.SuperAppAnimation;

/* compiled from: SuperAppAnimation.kt */
/* loaded from: classes6.dex */
public final class k7n0 extends LottieAnimationView {
    public final /* synthetic */ SuperAppAnimation p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7n0(SuperAppAnimation superAppAnimation, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.p = superAppAnimation;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.p.a.dispatchKeyEvent(keyEvent);
    }
}
