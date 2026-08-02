package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import com.vk.dto.common.im.Image;
import com.vk.story.viewer.impl.presentation.stories.view.reactions.OnboardingType;
import com.vk.voip.ui.feedback.ui.FeedbackP2PCallFlyView;
import com.vkontakte.android.R;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdRequest;
import ru.ok.android.external.sdk.MicSampleListener;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import ru.ok.android.webrtc.listeners.CallRecordListener;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class mx5 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mx5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                nx5 nx5Var = (nx5) obj2;
                int i2 = nx5Var.f - 1;
                nx5Var.f = i2;
                if (i2 == 0) {
                    nx5Var.c(obj);
                    break;
                }
                break;
            case 1:
                ImageView imageView = (ImageView) obj;
                ValueAnimator ofObject = ValueAnimator.ofObject(new zj3(), -1, Integer.valueOf(((View) obj2).getContext().getColor(R.color.vk_red_nice)));
                ofObject.setStartDelay(75L);
                ofObject.setDuration(200L);
                ofObject.addUpdateListener(new ys5(imageView, 1));
                ofObject.start();
                g6z.c(imageView, imageView, true, true, 16);
                break;
            case 2:
                FeedbackP2PCallFlyView feedbackP2PCallFlyView = (FeedbackP2PCallFlyView) obj2;
                int i3 = FeedbackP2PCallFlyView.l;
                feedbackP2PCallFlyView.getClass();
                feedbackP2PCallFlyView.a((Image) obj);
                break;
            case 3:
                jd80 jd80Var = (jd80) obj2;
                OnboardingType onboardingType = (OnboardingType) obj;
                jd80Var.e = new vx(jd80Var, jd80Var.b.getContext().getString(onboardingType.i()), new uk(17, jd80Var, onboardingType), 3);
                w4u0 w4u0Var = jd80Var.k;
                w4u0Var.i = true;
                w4u0Var.b();
                break;
            case 4:
                ((RecordManagerImpl) obj2).applyRecordStarted((CallRecordListener.RecordStartInfo) obj);
                break;
            case 5:
                ((SharedPeerConnectionFactory) obj2).a((MicSampleListener) obj);
                break;
            default:
                ((BannerAdView) obj2).loadAd((AdRequest) obj);
                break;
        }
    }
}
