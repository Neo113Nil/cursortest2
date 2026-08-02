package xsna;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.C4328g5;
import com.ironsource.C4498pe;
import com.ironsource.C4584ub;
import com.ironsource.O9;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.concurrent.CountDownLatch;
import kotlin.NoWhenBranchMatchedException;
import org.webrtc.EglRenderer;
import xsna.j9y0;
import xsna.m8v0;
import xsna.svq0;
import xsna.xar0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class lap implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lap(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01a9 A[LOOP:1: B:78:0x018c->B:113:0x01a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bc  */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        w3c0 w3c0Var;
        View findViewById;
        Lifecycle lifecycle;
        View view;
        NewsEntry t6;
        int i2;
        w3c0 w3c0Var2;
        View findViewById2;
        Integer a;
        f5z e;
        Lifecycle lifecycle2;
        View view2;
        int i3 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i3) {
            case 0:
                ((EglRenderer) obj3).lambda$removeFrameListener$2((CountDownLatch) obj2, (EglRenderer.FrameListener) obj);
                return;
            case 1:
                O9.a((InitRequest) obj3, (Context) obj2, (InitListener) obj);
                return;
            case 2:
                rhq0 rhq0Var = (rhq0) obj2;
                try {
                    ((FragmentActivity) obj).startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, rf3.c(((ExtendedUserProfile) obj3).u0, new StringBuilder("tel:"))));
                    return;
                } catch (Throwable th) {
                    if (th instanceof ActivityNotFoundException) {
                        return;
                    }
                    if ((th instanceof NullPointerException) && rhq0.c(rhq0Var)) {
                        L.G(ms9.b("Can't start activity cause of internal OS error: ", th));
                        return;
                    } else {
                        com.vk.metrics.eventtracking.b.a.q(th);
                        return;
                    }
                }
            case 3:
                wwq0 wwq0Var = (wwq0) obj3;
                jaa0 jaa0Var = wwq0Var.b;
                svq0.b.i iVar = (svq0.b.i) obj2;
                RecyclerView recyclerView = (RecyclerView) obj;
                wwq0Var.g = null;
                wwq0Var.h = null;
                if (!(iVar instanceof svq0.b.i.C3692b)) {
                    if (!(iVar instanceof svq0.b.i.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VkOnboardingCampaign vkOnboardingCampaign = ((svq0.b.i.a) iVar).a;
                    int f = ((vxq0) jaa0Var.c).p().f();
                    RecyclerView recyclerView2 = ((vxq0) jaa0Var.c).p().c;
                    if (recyclerView2 != null) {
                        RecyclerView.o layoutManager = recyclerView2.getLayoutManager();
                        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                        if (linearLayoutManager != null) {
                            i = linearLayoutManager.x();
                            if (f != -1 && i != -1 && f <= i) {
                                while (true) {
                                    RecyclerView.e0 findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(f);
                                    w3c0Var = !(findViewHolderForLayoutPosition instanceof w3c0) ? (w3c0) findViewHolderForLayoutPosition : null;
                                    if (w3c0Var != null || (t6 = w3c0Var.t6()) == null || !na60.g(t6)) {
                                        if (f == i) {
                                            f++;
                                        }
                                    }
                                }
                            }
                            w3c0Var = null;
                            findViewById = (w3c0Var != null || (view = w3c0Var.itemView) == null) ? null : view.findViewById(R.id.post_header_options);
                            if (findViewById != null) {
                                Context context = recyclerView.getContext();
                                Integer a2 = wwq0Var.a();
                                if (a2 != null && wwq0.b(a2.intValue(), findViewById)) {
                                    f5z e2 = gqo.e(findViewById);
                                    if (((e2 == null || (lifecycle = e2.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == Lifecycle.State.RESUMED) {
                                        try {
                                            if (((q7v0) wwq0Var.c.getValue()).b(vkOnboardingCampaign, false)) {
                                                int i4 = m8v0.M;
                                                m8v0.a.a(findViewById, context.getResources().getString(R.string.profile_wall_publication_ads_easy_promote_onboarding), null, VkTooltip$MarkerStyle.Style1, VkTooltip$MarkerSize.Size48, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Right, new q520(26), null, null, null, new ufg0(8, wwq0Var, vkOnboardingCampaign), new g6m0(3, wwq0Var, vkOnboardingCampaign), null, 0, false, null, null, false, context, false, 12570116);
                                            }
                                        } catch (Throwable th2) {
                                            com.vk.metrics.eventtracking.b.a.a(th2);
                                        }
                                    }
                                }
                            }
                            wwq0Var.d = false;
                            return;
                        }
                    }
                    i = 0;
                    if (f != -1) {
                        while (true) {
                            RecyclerView.e0 findViewHolderForLayoutPosition2 = recyclerView.findViewHolderForLayoutPosition(f);
                            if (!(findViewHolderForLayoutPosition2 instanceof w3c0)) {
                            }
                            if (w3c0Var != null) {
                            }
                            if (f == i) {
                            }
                            f++;
                        }
                    }
                    w3c0Var = null;
                    if (w3c0Var != null) {
                    }
                    if (findViewById != null) {
                    }
                    wwq0Var.d = false;
                    return;
                }
                svq0.b.i.C3692b c3692b = (svq0.b.i.C3692b) iVar;
                String str = c3692b.a;
                j5b0 j5b0Var = c3692b.b;
                i5 i5Var = c3692b.c;
                int f2 = ((vxq0) jaa0Var.c).p().f();
                RecyclerView recyclerView3 = ((vxq0) jaa0Var.c).p().c;
                if (recyclerView3 != null) {
                    RecyclerView.o layoutManager2 = recyclerView3.getLayoutManager();
                    LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                    if (linearLayoutManager2 != null) {
                        i2 = linearLayoutManager2.x();
                        if (f2 != -1 && i2 != -1 && f2 <= i2) {
                            while (true) {
                                RecyclerView.e0 findViewHolderForLayoutPosition3 = recyclerView.findViewHolderForLayoutPosition(f2);
                                w3c0Var2 = !(findViewHolderForLayoutPosition3 instanceof w3c0) ? (w3c0) findViewHolderForLayoutPosition3 : null;
                                if (w3c0Var2 == null) {
                                    if (f2 != i2) {
                                        f2++;
                                    }
                                }
                            }
                        }
                        w3c0Var2 = null;
                        findViewById2 = (w3c0Var2 != null || (view2 = w3c0Var2.itemView) == null) ? null : view2.findViewById(R.id.post_header_options);
                        FragmentImpl fragmentImpl = wwq0Var.a;
                        if (findViewById2 != null && (a = wwq0Var.a()) != null && wwq0.b(a.intValue(), findViewById2)) {
                            e = gqo.e(findViewById2);
                            if (((e != null || (lifecycle2 = e.getLifecycle()) == null) ? null : lifecycle2.getCurrentState()) == Lifecycle.State.RESUMED) {
                                j5b0Var.invoke(findViewById2);
                                fragmentImpl.requireView().dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
                                int i5 = m8v0.M;
                                if (str == null) {
                                    str = fragmentImpl.requireContext().getString(R.string.community_main_wall_post_options_onboarding);
                                }
                                m8v0.a.a(findViewById2, str, null, VkTooltip$MarkerStyle.Style1, VkTooltip$MarkerSize.Size48, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Right, new mcj0(findViewById2, 16), null, null, null, null, null, null, 0, false, null, null, false, null, !dhr0.M(), 8388100);
                                i5Var.invoke();
                            }
                        }
                        wwq0Var.d = false;
                        return;
                    }
                }
                i2 = 0;
                if (f2 != -1) {
                    while (true) {
                        RecyclerView.e0 findViewHolderForLayoutPosition32 = recyclerView.findViewHolderForLayoutPosition(f2);
                        if (!(findViewHolderForLayoutPosition32 instanceof w3c0)) {
                        }
                        if (w3c0Var2 == null) {
                        }
                        f2++;
                    }
                }
                w3c0Var2 = null;
                if (w3c0Var2 != null) {
                }
                FragmentImpl fragmentImpl2 = wwq0Var.a;
                if (findViewById2 != null) {
                    e = gqo.e(findViewById2);
                    if (((e != null || (lifecycle2 = e.getLifecycle()) == null) ? null : lifecycle2.getCurrentState()) == Lifecycle.State.RESUMED) {
                    }
                }
                wwq0Var.d = false;
                return;
                wwq0Var.f = null;
                return;
            case 4:
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj3;
                hxy0 hxy0Var = (hxy0) obj2;
                WebResourceResponse webResourceResponse = (WebResourceResponse) obj;
                if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                    if (webResourceResponse != null) {
                        webResourceResponse.getStatusCode();
                    }
                    var0 var0Var = var0.a;
                    j9y0.b bVar = new j9y0.b(new xar0.a(), hxy0Var.i);
                    var0Var.getClass();
                    var0.a(bVar);
                    hxy0Var.d.invoke();
                    return;
                }
                return;
            default:
                C4584ub.a.a((LevelPlayInitListener) obj3, (C4328g5) obj2, (C4498pe) obj);
                return;
        }
    }
}
