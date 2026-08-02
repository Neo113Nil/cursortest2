package xsna;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.webkit.WebView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.widget.LifecycleHandler;
import com.vk.log.L;
import com.vk.stories.design.view.viewer.reactions.StoryMainReactionButton;
import com.vk.voip.ui.onboarding.ui.CallOnboardingView;
import ru.mail.libverify.controls.VerificationController;
import ru.ok.call_effects.internal.tensorflow.TensorflowConfigurator;
import ru.ok.gleffects.impl.EffectNativeSink;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class p69 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p69(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                CallOnboardingView callOnboardingView = (CallOnboardingView) obj;
                int i2 = CallOnboardingView.j;
                try {
                    callOnboardingView.b.c();
                    break;
                } catch (Throwable th) {
                    L.i(th);
                    return;
                }
            case 1:
                CameraUIView.setDuetsOn$lambda$170((CameraUIView) obj);
                break;
            case 2:
                WebView webView = (WebView) obj;
                webView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(iah0.z(webView.getContext()), 1073741823)), 1073741824), tr.a(0, 1073741823, 0, 0));
                int measuredHeight = webView.getMeasuredHeight();
                xgx0.a.getClass();
                xgx0.a("Height of webview: " + measuredHeight);
                ObjectAnimator.ofFloat(webView, (Property<WebView, Float>) View.ALPHA, webView.getAlpha(), 1.0f).start();
                break;
            case 3:
                ((ViewPager2) obj).c();
                break;
            case 4:
                jtg jtgVar = (jtg) obj;
                qap qapVar = jtgVar.d;
                if (!qapVar.d) {
                    qapVar.d = true;
                    qapVar.c = SystemClock.elapsedRealtime() - qapVar.a;
                    qapVar.a = 0L;
                }
                ikv0 ikv0Var = jtgVar.c;
                if (ikv0Var != null) {
                    ikv0Var.c();
                    break;
                }
                break;
            case 5:
                nrl nrlVar = (nrl) obj;
                Activity h = e3m.h(nrlVar.a);
                if (h != null && !h.isFinishing() && !h.isDestroyed()) {
                    nrlVar.e = LifecycleHandler.c(h);
                    break;
                }
                break;
            case 6:
                ((EffectNativeSink) obj).lambda$stopRecording$2();
                break;
            case 7:
                StoryMainReactionButton storyMainReactionButton = (StoryMainReactionButton) obj;
                storyMainReactionButton.d = StoryMainReactionButton.State.DEFAULT;
                storyMainReactionButton.a();
                storyMainReactionButton.invalidate();
                storyMainReactionButton.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(75L).start();
                break;
            case 8:
                ((TensorflowConfigurator) obj).configureWithRetryInternal();
                break;
            case 9:
                ((tnp0) obj).b();
                break;
            case 10:
                ((VerificationController) obj).requestNewSmsCode();
                break;
            case 11:
                ((w4s0) obj).d();
                break;
            default:
                ((yads.fl2) obj).e();
                break;
        }
    }
}
