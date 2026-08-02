package xsna;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.articles.ArticleFragment;
import com.vk.core.preference.Preference;
import com.vk.feed.design.view.newsfeed.ads_carousel.VkFeedOverlayProductCarousel;
import com.vk.im.ui.fragments.chat.ChatFragment;
import ru.ok.media.PublisherImpl;
import xsna.mxy0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class n93 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n93(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AppStartTrace appStartTrace = (AppStartTrace) obj;
                appStartTrace.c.e(appStartTrace.e.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                break;
            case 1:
                ArticleFragment articleFragment = (ArticleFragment) obj;
                int i2 = ArticleFragment.E0;
                com.vk.articles.a aVar = articleFragment.m0;
                if (aVar != null) {
                    aVar.clearFocus();
                }
                articleFragment.finish();
                break;
            case 2:
                irb irbVar = (irb) obj;
                irbVar.j = false;
                ChatFragment chatFragment = irbVar.h;
                if (chatFragment != null) {
                    chatFragment.finish();
                    break;
                }
                break;
            case 3:
                q7r q7rVar = (q7r) obj;
                fmm0 fmm0Var = q7rVar.R;
                if (fmm0Var != null) {
                    fmm0Var.k = true;
                }
                gmm0 gmm0Var = q7rVar.S;
                if (gmm0Var != null) {
                    gmm0Var.f = true;
                }
                q7rVar.v.a.setAlpha(1.0f);
                q7rVar.i0.b.c(false);
                break;
            case 4:
                rsu rsuVar = (rsu) obj;
                f8f0 f8f0Var = rsuVar.l;
                if (f8f0Var != null) {
                    f8f0Var.cancel();
                    rsuVar.l = null;
                    Preference.f("uploads").edit().clear().apply();
                    break;
                }
                break;
            case 5:
                s350 s350Var = (s350) obj;
                RecyclerView recyclerView = s350Var.a;
                boolean z = !recyclerView.isComputingLayout() && recyclerView.getScrollState() == 0;
                int i3 = s350Var.c;
                if (!z) {
                    bn40.f(bd3.b(" of ", s350Var.e, i3, new StringBuilder("isComputingLayout retries ")));
                    int i4 = s350Var.f;
                    if (i4 >= i3) {
                        s350Var.f = 0;
                        break;
                    } else {
                        s350Var.f = i4 + 1;
                        Handler handler = s350Var.d;
                        n93 n93Var = s350Var.j;
                        handler.removeCallbacks(n93Var);
                        handler.post(n93Var);
                        break;
                    }
                } else {
                    s350Var.f = 0;
                    recyclerView.invalidateItemDecorations();
                    break;
                }
                break;
            case 6:
                ((ig1) obj).invoke();
                break;
            case 7:
                ((PublisherImpl) obj).lambda$startSlowpokeMonitor$0();
                break;
            case 8:
                TestSuiteActivity.a((TestSuiteActivity) obj);
                break;
            case 9:
                int i5 = VkFeedOverlayProductCarousel.A;
                d3m.b((VkFeedOverlayProductCarousel) obj, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
                break;
            case 10:
                ((com.ironsource.lifecycle.b) obj).h();
                break;
            case 11:
                mxy0.a aVar2 = ((mxy0) obj).h;
                if (aVar2.d == 0 && aVar2.e == null) {
                    tnf tnfVar = new tnf(aVar2, 15);
                    aVar2.e = tnfVar;
                    o8z0.g.postDelayed(tnfVar, 3000L);
                    break;
                }
                break;
            default:
                yads.sc3.a((yads.sc3) obj);
                break;
        }
    }
}
