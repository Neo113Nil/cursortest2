package xsna;

import android.content.res.Configuration;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.ironsource.Be;
import com.ironsource.C4472o6;
import com.ironsource.C4498pe;
import com.ironsource.InterfaceC4569te;
import com.mbridge.msdk.config.component.wei.WeiCpt;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.libvideo.ui.ad.AdvertBannerView;
import com.vk.newsfeed.common.recycler.animators.ItemAnimationType;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.stats.PostViewFragmentTimeSpentTracker;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.vmoji.character.model.VmojiProductUnlockInfoModel;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.jvm.internal.Ref$IntRef;
import org.chromium.base.UnownedUserData;
import org.chromium.base.UnownedUserDataHost;
import org.webrtc.SessionDescription;
import ru.ok.android.webrtc.PeerConnectionClient;
import xsna.i1e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class h12 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h12(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                CatalogPaginatedListViewHolder catalogPaginatedListViewHolder = (CatalogPaginatedListViewHolder) obj2;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj;
                if (catalogPaginatedListViewHolder != null) {
                    catalogPaginatedListViewHolder.g(ref$IntRef.element, 32);
                    break;
                }
                break;
            case 1:
                Be.b((InterfaceC4569te) obj2, (C4498pe) obj);
                break;
            case 2:
                i1e.c cVar = (i1e.c) obj2;
                i1e i1eVar = (i1e) obj;
                Iterator it = cVar.b.iterator();
                while (it.hasNext()) {
                    ((i1e.b) it.next()).a.D4().a();
                }
                i1e.b bVar = cVar.a;
                if (bVar != null) {
                    bVar.a.D4().j(i1eVar.b(bVar.b));
                    break;
                }
                break;
            case 3:
                ArrayList arrayList = (ArrayList) obj2;
                jxq jxqVar = (jxq) obj;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    RecyclerView.e0 e0Var = (RecyclerView.e0) it2.next();
                    nbf0 nbf0Var = jxqVar.h;
                    ArrayList arrayList2 = jxqVar.q;
                    nbf0Var.getClass();
                    View view = e0Var.itemView;
                    ViewPropertyAnimator animate = view.animate();
                    arrayList2.add(e0Var);
                    ViewPropertyAnimator alpha = animate.alpha(1.0f);
                    aux auxVar = (aux) ((Map) jxqVar.v.getValue()).get(ItemAnimationType.Add);
                    alpha.setDuration(auxVar != null ? auxVar.a : jxqVar.c).setListener(new xgl(view, animate, e0Var, arrayList2, jxqVar)).start();
                }
                arrayList.clear();
                jxqVar.n.remove(arrayList);
                break;
            case 4:
                ((FrameLayout) obj2).addView((LottieAnimationView) obj);
                break;
            case 5:
                d1v d1vVar = (d1v) obj2;
                VKApplication vKApplication = (VKApplication) obj;
                xgx0.a.getClass();
                xgx0.a("HealthUtilsImpl loadHealthCommonClientConfig -> lowPriorityLocalExecutor");
                d1vVar.a.j(vKApplication, RequestedMiniApp.VK_STEPS, null, new defpackage.m(20, d1vVar, vKApplication));
                break;
            case 6:
                ((Consumer) obj2).accept((jkh0) obj);
                break;
            case 7:
                AdvertBannerView advertBannerView = ((LiveView) obj2).v;
                r2 = ((Configuration) obj).orientation == 2;
                ViewGroup.LayoutParams layoutParams = advertBannerView.getLayoutParams();
                layoutParams.width = r2 ? iah0.a(400) : -1;
                advertBannerView.setLayoutParams(layoutParams);
                break;
            case 8:
                ((ps10) obj2).e.reportTrackChangeEvent((TrackChangeEvent) obj);
                break;
            case 9:
                ((PeerConnectionClient) obj2).b((SessionDescription) obj);
                break;
            case 10:
                RecyclerView recyclerView = (RecyclerView) obj;
                int i2 = PostFragment.S0;
                PostViewFragmentTimeSpentTracker Co = ((PostFragment) obj2).Co();
                if (Co != null) {
                    Co.a(recyclerView);
                    break;
                }
                break;
            case 11:
                xop0 xop0Var = (xop0) obj2;
                xu90 xu90Var = (xu90) obj;
                xop0Var.getClass();
                xop0Var.f(xu90Var.a, xu90Var.b);
                break;
            case 12:
                ((UnownedUserDataHost) obj2).lambda$remove$0((UnownedUserData) obj);
                break;
            case 13:
                hbt0 hbt0Var = (hbt0) obj2;
                ci5 ci5Var = (ci5) obj;
                if (!hbt0Var.l.a) {
                    hbt0Var.C(new r0d0(3));
                    break;
                } else {
                    RecyclerView recyclerView2 = hbt0Var.c.getRecyclerView();
                    boolean z = recyclerView2 != null && recyclerView2.getScrollState() == 0;
                    if (fxc0.B().J().G0()) {
                        ci5Var.c.getClass();
                        if (SystemClock.elapsedRealtime() - ci5Var.i >= 500) {
                            r2 = true;
                        }
                    }
                    if (z || r2 || hbt0Var.s == -1) {
                        hbt0Var.C(new r0d0(3));
                        break;
                    }
                }
                break;
            case 14:
                aaw0 aaw0Var = (aaw0) obj2;
                new q4q0().a(aaw0Var.b, (VmojiProductUnlockInfoModel) obj, new b8e0(aaw0Var, 29));
                break;
            case 15:
                ((WeiCpt) obj2).a((com.mbridge.msdk.config.component.wei.model.a) obj);
                break;
            case 16:
                C4472o6.a((C4472o6) obj2, (LevelPlayAdInfo) obj);
                break;
            default:
                yads.w12.a((yads.w12) obj2, (List) obj);
                break;
        }
    }
}
