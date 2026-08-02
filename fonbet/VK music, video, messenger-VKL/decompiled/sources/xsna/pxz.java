package xsna;

import android.content.Context;
import android.location.LocationManager;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vkontakte.android.R;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import xsna.m8v0;
import xsna.n8z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class pxz implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pxz(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[LOOP:0: B:17:0x0049->B:48:0x0067, LOOP_START, PHI: r6
      0x0049: PHI (r6v4 int) = (r6v1 int), (r6v5 int) binds: [B:16:0x0047, B:48:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        w3c0 w3c0Var;
        View findViewById;
        View view;
        NewsEntry t6;
        int i2 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                LocationManager locationManager = (LocationManager) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                if (locationManager != null) {
                    locationManager.requestSingleUpdate("network", new sxz(atomicReference, countDownLatch), (Looper) null);
                    break;
                }
                break;
            case 1:
                mxq0 mxq0Var = (mxq0) obj3;
                RecyclerView recyclerView = (RecyclerView) obj2;
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) obj;
                mqp mqpVar = mxq0Var.n;
                int f = mqpVar.y.f();
                RecyclerView recyclerView2 = mqpVar.y.c;
                if (recyclerView2 != null) {
                    RecyclerView.o layoutManager = recyclerView2.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        i = linearLayoutManager.x();
                        if (f <= i) {
                            while (true) {
                                RecyclerView.e0 findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(f);
                                w3c0Var = findViewHolderForLayoutPosition instanceof w3c0 ? (w3c0) findViewHolderForLayoutPosition : null;
                                if (w3c0Var == null || (t6 = w3c0Var.t6()) == null || !na60.g(t6)) {
                                    if (f != i) {
                                        f++;
                                    }
                                }
                            }
                        }
                        w3c0Var = null;
                        findViewById = (w3c0Var != null || (view = w3c0Var.itemView) == null) ? null : view.findViewById(R.id.post_header_options);
                        if (findViewById != null) {
                            Context context = recyclerView.getContext();
                            Integer o = mxq0Var.o();
                            if (o != null) {
                                if (bwt0.F(findViewById).bottom <= o.intValue()) {
                                    try {
                                        mxq0Var.t = null;
                                        if (((q7v0) mxq0Var.u.getValue()).b(vkOnboardingCampaign, false)) {
                                            int i3 = m8v0.M;
                                            m8v0.a.a(findViewById, context.getResources().getString(R.string.profile_wall_publication_ads_easy_promote_onboarding), null, VkTooltip$MarkerStyle.Style1, VkTooltip$MarkerSize.Size48, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Right, new ltl0(3), null, null, null, new lyb0(5, mxq0Var, vkOnboardingCampaign), new lx60(17, mxq0Var, vkOnboardingCampaign), null, 0, false, null, null, false, context, false, 12570116);
                                            break;
                                        }
                                    } catch (Throwable th) {
                                        com.vk.metrics.eventtracking.b.a.a(th);
                                    }
                                }
                            }
                        }
                        mxq0Var.t = vkOnboardingCampaign;
                        mxq0Var.s = false;
                        break;
                    }
                }
                i = 0;
                if (f <= i) {
                }
                w3c0Var = null;
                if (w3c0Var != null) {
                }
                if (findViewById != null) {
                }
                mxq0Var.t = vkOnboardingCampaign;
                mxq0Var.s = false;
                break;
            default:
                n8z0 n8z0Var = (n8z0) obj3;
                njz0 njz0Var = (njz0) obj2;
                xla xlaVar = (xla) obj;
                n8z0.b bVar = n8z0Var.d;
                if (bVar != null) {
                    bVar.f(njz0Var, xlaVar);
                    n8z0Var.d = null;
                    break;
                }
                break;
        }
    }
}
