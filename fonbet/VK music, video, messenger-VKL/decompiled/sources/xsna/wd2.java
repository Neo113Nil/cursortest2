package xsna;

import androidx.compose.ui.platform.ComposeView;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetFragment;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.im.ui.views.RichEditText;
import com.vk.stories.design.view.sticker.TemplateButton;
import com.vk.video.profile.presentation.catalog.pager.VideoLargeSliderHorizontalPagerVh;
import io.appmetrica.analytics.impl.C5208u1;
import java.util.Iterator;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.gleffects.impl.EffectNativeSink;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class wd2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wd2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oiz presenter;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((gzs) obj).invoke();
                break;
            case 1:
                jc3 jc3Var = (jc3) obj;
                jc3.a(jc3Var, jc3Var.a);
                break;
            case 2:
                int i2 = CustomisableBottomSheetFragment.S;
                ((CustomisableBottomSheetFragment) obj).tn();
                break;
            case 3:
                Iterator<T> it = ((com.vk.ads.core.a) obj).a.iterator();
                while (it.hasNext()) {
                    ((kuc0) it.next()).clearData();
                }
                break;
            case 4:
                ((EffectNativeSink) obj).lambda$startRecording$1();
                break;
            case 5:
                kex.a((kex) obj);
                break;
            case 6:
                nnz nnzVar = (nnz) obj;
                if (nnzVar.k && (presenter = nnzVar.b.getPresenter()) != null) {
                    presenter.Q0();
                    break;
                }
                break;
            case 7:
                ComposeView composeView = ((MarketItemReviewsFragment) obj).s0;
                if (composeView != null) {
                    xo2.f(composeView, false, true, 300L);
                    break;
                }
                break;
            case 8:
                RichEditText richEditText = ((kz30) obj).B;
                if (richEditText == null) {
                    richEditText = null;
                }
                mhy.j(richEditText);
                break;
            case 9:
                TemplateButton templateButton = ((zim0) obj).l;
                f4m.j(templateButton.c);
                LottieAnimationView lottieAnimationView = templateButton.b;
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.m0();
                break;
            case 10:
                ((Tensorflow) obj).lambda$handlePrepare$7();
                break;
            case 11:
                VideoLargeSliderHorizontalPagerVh videoLargeSliderHorizontalPagerVh = (VideoLargeSliderHorizontalPagerVh) obj;
                videoLargeSliderHorizontalPagerVh.w();
                hbt0 hbt0Var = videoLargeSliderHorizontalPagerVh.A;
                if (hbt0Var != null) {
                    hbt0Var.n();
                    break;
                }
                break;
            case 12:
                com.vk.voip.ui.c.b.j1((ejw0) obj);
                break;
            case 13:
                ((ru.mail.libverify.api.q) obj).h();
                break;
            default:
                ((C5208u1) obj).e();
                break;
        }
    }
}
