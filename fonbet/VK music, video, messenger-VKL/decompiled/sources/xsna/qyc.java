package xsna;

import android.os.ResultReceiver;
import android.view.View;
import android.view.animation.Animation;
import androidx.media3.common.VideoFrameProcessingException;
import com.airbnb.lottie.LottieAnimationView;
import com.ironsource.sdk.controller.v;
import com.vk.core.files.a;
import com.vk.dto.status.StatusImagePopupAnimation;
import com.vk.stickers.views.animation.VKAnimationView;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import java.util.ArrayList;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;
import xsna.ghd0;
import xsna.hlw;
import xsna.ouj0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qyc implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qyc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                View view = (View) obj2;
                ((LottieAnimationView) view.findViewById(R.id.lottie)).m0();
                view.postDelayed(new ryc((syc) obj, i2), 2000L);
                break;
            case 1:
                ((FeedbackListenerManagerImpl) obj2).notifyResolvedFeedbackItems((ArrayList) obj);
                break;
            case 2:
                ((a.C0764a) obj2).b((Exception) obj);
                break;
            case 3:
                ((hlw.a) obj).d(((ghd0.b) obj2).b);
                break;
            case 4:
                u3g0 u3g0Var = (u3g0) obj2;
                ResultReceiver resultReceiver = (ResultReceiver) obj;
                WriteBar writeBar = u3g0Var.e;
                if (writeBar != null && bwt0.K(writeBar)) {
                    WriteBar writeBar2 = u3g0Var.e;
                    if (writeBar2 != null) {
                        writeBar2.B();
                    }
                    mhy.i(resultReceiver, u3g0Var.f, false);
                    break;
                }
                break;
            case 5:
                ((ouj0.a) obj2).b.d.a((VideoFrameProcessingException) obj);
                break;
            case 6:
                VKAnimationView vKAnimationView = (VKAnimationView) obj2;
                bwt0.p0(vKAnimationView, true);
                vKAnimationView.m0();
                i0q0.d(((StatusImagePopupAnimation) obj).c, new n44(vKAnimationView, 7));
                break;
            case 7:
                ysm0 ysm0Var = (ysm0) obj;
                ((gzs) obj2).invoke();
                float f = ysm0.k;
                Animation i3 = ysm0Var.i();
                if (i3 != null) {
                    i3.setInterpolator(ysm0Var.d);
                    i3.setStartOffset(3000L);
                    i3.setRepeatCount(-1);
                    i3.setRepeatMode(1);
                    ysm0Var.c.startAnimation(i3);
                    break;
                }
                break;
            case 8:
                io.appmetrica.analytics.billing.impl.j.a((io.appmetrica.analytics.billing.impl.j) obj2, (ProductInfo) obj);
                break;
            default:
                ((v.s) obj2).l((String) obj);
                break;
        }
    }
}
