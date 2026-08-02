package xsna;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.perf.v1.a;
import com.google.firebase.perf.v1.c;
import com.ironsource.Ga;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.screen.a;
import com.vk.clips.design.view.QRSharingView;
import com.vk.clips.design.view.author.b;
import com.vk.clips.editor.templates.impl.player.a;
import com.vk.dto.common.Source;
import com.vk.im.reactions.impl.set_reaction.list.ReactionListController;
import com.vk.libvideo.ui.ad.AdvertBannerView;
import com.vk.music.offline.impl.mediastore.download.service.DownloadService;
import com.vk.photo.editor.features.collage.view.CollageSlotView;
import com.vk.rlottie.RLottieDrawable;
import com.vk.stories.design.view.editor.SelectRangeWaveFormView;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.videotracks.DefaultRemoteVideoTracks;
import xsna.bbj0;
import xsna.g1e0;
import xsna.i1e;
import xsna.l2f;
import xsna.otb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class p31 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p31(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        Application application;
        myi myiVar;
        String a;
        int i = 2;
        int i2 = 0;
        switch (this.b) {
            case 0:
                AdvertBannerView advertBannerView = (AdvertBannerView) this.c;
                advertBannerView.setAlpha(1.0f);
                bwt0.p0(advertBannerView, true);
                return;
            case 1:
                View view = ((a.c) this.c).b;
                if (view != null) {
                    view.setVisibility(4);
                    return;
                }
                return;
            case 2:
                ((Call) this.c).l();
                return;
            case 3:
                otb otbVar = (otb) this.c;
                if (!otbVar.l.a.b.Gb() || otbVar.l.g) {
                    return;
                }
                otbVar.l = otb.b.a(otbVar.l, null, false, true, null, false, null, 959);
                g1e0.a aVar = new g1e0.a();
                aVar.a.e(otbVar.l.a.b.Ab());
                aVar.b = Source.ACTUAL;
                aVar.c = true;
                aVar.d = "otb";
                otbVar.f.b(otbVar.b.C("updateInconsistentMembersInfo", new d1e0(new g1e0(aVar))).q(otbVar.d).subscribe(new az(new q60(otbVar, 2), 13), new ho1(new ptb(otbVar, 0), 9)));
                return;
            case 4:
                ((nic) this.c).t(true);
                return;
            case 5:
                com.vk.clips.design.view.author.b bVar = (com.vk.clips.design.view.author.b) this.c;
                float f = bVar.b;
                ArrayList arrayList = bVar.d;
                if (!bVar.f || arrayList.size() < 2) {
                    return;
                }
                int i3 = bVar.e;
                int size = (i3 + 1) % arrayList.size();
                bVar.e = size;
                b.a aVar2 = (b.a) arrayList.get(i3);
                b.a aVar3 = (b.a) arrayList.get(size);
                aVar2.b.setSelected(false);
                aVar3.setTranslationY(f);
                aVar3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                aVar3.setVisibility(0);
                aVar3.b.setSelected(true);
                ViewPropertyAnimator duration = aVar2.animate().translationY(-f).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L);
                DecelerateInterpolator decelerateInterpolator = com.vk.clips.design.view.author.b.h;
                duration.setInterpolator(decelerateInterpolator).start();
                aVar3.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).alpha(1.0f).setDuration(200L).setInterpolator(decelerateInterpolator).withEndAction(new mf3(bVar, i)).start();
                return;
            case 6:
                i1e i1eVar = (i1e) this.c;
                i1e.b bVar2 = i1eVar.f;
                if (bVar2 == null) {
                    return;
                }
                bVar2.a.D4().g(i1eVar.b(bVar2.b));
                return;
            case 7:
                l2f.a aVar4 = (l2f.a) this.c;
                Activity activity = aVar4.e.get();
                if (activity != null && (application = activity.getApplication()) != null) {
                    application.unregisterActivityLifecycleCallbacks(aVar4.h);
                }
                l2f l2fVar = aVar4.f;
                if (l2fVar != null) {
                    l2fVar.n();
                    return;
                }
                return;
            case 8:
                CollageSlotView collageSlotView = (CollageSlotView) this.c;
                int i4 = CollageSlotView.r;
                collageSlotView.c(true);
                return;
            case 9:
                ((DefaultRemoteVideoTracks) this.c).a();
                return;
            case 10:
                ((DownloadService.b) this.c).a();
                return;
            case 11:
                qxo qxoVar = (qxo) this.c;
                ShimmerFrameLayout b = qxoVar.b();
                b.d = true;
                b.c();
                ((RecyclerView) qxoVar.h.getValue()).setVisibility(4);
                ((RecyclerView) qxoVar.i.getValue()).setVisibility(0);
                ((LinearLayout) qxoVar.l.getValue()).setVisibility(4);
                return;
            case 12:
                nij nijVar = ((m3r) this.c).g;
                if (nijVar != null) {
                    nijVar.invoke();
                    return;
                }
                return;
            case 13:
                Ga.d((Ga) this.c);
                return;
            case 14:
                ((bbj0.a) this.c).c();
                return;
            case 15:
                ((PeerConnectionClient) this.c).b();
                return;
            case 16:
                com.vk.photos.root.presentation.h hVar = (com.vk.photos.root.presentation.h) this.c;
                hVar.i.g(true, true, true);
                kga0 b2 = hVar.b();
                if (b2 != null) {
                    b2.La();
                    return;
                }
                return;
            case 17:
                ((QRSharingView) this.c).f.requestLayout();
                return;
            case 18:
                RLottieDrawable rLottieDrawable = (RLottieDrawable) this.c;
                ez3 ez3Var = rLottieDrawable.k;
                if (ez3Var.a == 0 || ez3Var.k.get()) {
                    return;
                }
                AtomicBoolean atomicBoolean = ez3Var.j;
                AtomicBoolean atomicBoolean2 = ez3Var.i;
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean2.set(true);
                ez3Var.p.set(true);
                RLottieDrawable.nativeCreateCache(rLottieDrawable.j);
                atomicBoolean2.set(false);
                RLottieDrawable.r.post(rLottieDrawable.p);
                return;
            case 19:
                ReactionListController reactionListController = (ReactionListController) this.c;
                int a2 = reactionListController.a();
                f4m.n(a2, reactionListController.a);
                f1f0 f1f0Var = reactionListController.k;
                f1f0Var.c.setNestedScrollingEnabled(true);
                f1f0Var.j = null;
                f1f0Var.notifyDataSetChanged();
                reactionListController.g.c.invoke(Integer.valueOf(a2));
                return;
            case 20:
                SelectRangeWaveFormView selectRangeWaveFormView = (SelectRangeWaveFormView) this.c;
                float f2 = SelectRangeWaveFormView.u0;
                selectRangeWaveFormView.j();
                return;
            case 21:
                xop0 xop0Var = (xop0) this.c;
                vhr vhrVar = xop0Var.e;
                vhrVar.a();
                Context context = vhrVar.a;
                xop0Var.k = context;
                xop0Var.p = context.getPackageName();
                xop0Var.l = txi.e();
                xop0Var.m = new dxe0(xop0Var.k, new vwe0(100L, 1L, TimeUnit.MINUTES));
                xop0Var.n = u93.a();
                f9e0<top0> f9e0Var = xop0Var.h;
                txi txiVar = xop0Var.l;
                txiVar.getClass();
                myi myiVar2 = myi.c;
                synchronized (myi.class) {
                    try {
                        if (myi.c == null) {
                            myi.c = new myi(i2);
                        }
                        myiVar = myi.c;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                myiVar.getClass();
                Long l = (Long) txiVar.a.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
                l.getClass();
                Map<Long, String> map = myi.d;
                if (!map.containsKey(l) || (a = map.get(l)) == null) {
                    kt80<String> d = txiVar.d(myiVar);
                    a = d.b() ? d.a() : "FIREPERF";
                } else {
                    txiVar.c.f("com.google.firebase.perf.LogSourceName", a);
                }
                xop0Var.i = new spr(f9e0Var, a);
                ConcurrentLinkedQueue<xu90> concurrentLinkedQueue = xop0Var.c;
                u93 u93Var = xop0Var.n;
                WeakReference weakReference = new WeakReference(xop0.t);
                synchronized (u93Var.g) {
                    u93Var.g.add(weakReference);
                }
                c.b r = com.google.firebase.perf.v1.c.r();
                xop0Var.o = r;
                vhr vhrVar2 = xop0Var.e;
                vhrVar2.a();
                r.r(vhrVar2.c.b);
                a.b n = com.google.firebase.perf.v1.a.n();
                n.b(xop0Var.p);
                n.m();
                Context context2 = xop0Var.k;
                String str = "";
                try {
                    String str2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str2 != null) {
                        str = str2;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                n.n(str);
                r.o(n);
                xop0Var.d.set(true);
                while (!concurrentLinkedQueue.isEmpty()) {
                    xu90 poll = concurrentLinkedQueue.poll();
                    if (poll != null) {
                        xop0Var.j.execute(new h12(11, xop0Var, poll));
                    }
                }
                return;
            case 22:
                a.C0581a c0581a = ((b4t0) this.c).b;
                com.vk.clips.editor.templates.impl.player.a.this.v(new hv1(c0581a, 3));
                return;
            case 23:
                ((equ0) this.c).X0();
                return;
            default:
                f3y0.R((f3y0) this.c);
                return;
        }
    }
}
