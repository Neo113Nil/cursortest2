package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Size;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.AdSection;
import com.vk.dto.common.InstreamAd;
import com.vk.dto.common.VideoAdData;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.ad.MyTargetAdLoadingState;
import com.vk.libvideo.api.ad.AdBannerData;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.api.ad.a;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.video.player.OneVideoPlayer;
import xsna.c8x;
import xsna.oh0;
import xsna.p7z0;

/* compiled from: AdDelegate.kt */
/* loaded from: classes18.dex */
public final class ye0 {
    public final Context a;
    public final jc0 b;
    public final com.vk.libvideo.autoplay.g c;
    public final l3s0 d;
    public final li5 e;
    public final ad0 f;
    public final ze0 g;
    public c8x i;
    public lxd k;
    public Float l;
    public final bpn0 m;
    public final bpn0 n;
    public final bpn0 o;
    public AdSection r;
    public AdBannerData.a v;
    public a.AbstractC1195a.b w;
    public boolean y;
    public final io.reactivex.rxjava3.subjects.d<MyTargetAdLoadingState> h = io.reactivex.rxjava3.subjects.d.O0(MyTargetAdLoadingState.NOT_INITIALIZED);
    public final d j = new d();
    public final bpn0 p = new bpn0(new com.vk.movika.sdk.base.ui.g(this, 3));
    public final boolean q = BuildInfo.s();
    public boolean s = true;
    public boolean t = true;
    public final LinkedHashSet u = new LinkedHashSet();
    public final io.reactivex.rxjava3.disposables.b x = new io.reactivex.rxjava3.disposables.b();
    public final a z = new a();
    public final og0 A = new og0();

    /* compiled from: AdDelegate.kt */
    public final class a implements je0 {
        public final bpn0 a = new bpn0(new we0(this, 0));

        /* compiled from: AdDelegate.kt */
        /* renamed from: xsna.ye0$a$a, reason: collision with other inner class name */
        public final class C4096a implements mej0 {
            public boolean a = true;

            public C4096a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0056  */
            @Override // xsna.mej0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final a6z0 a() {
                a6z0 a;
                ye0 ye0Var = ye0.this;
                c8x c8xVar = ye0Var.i;
                if (c8xVar != null) {
                    Context context = ye0Var.a;
                    p7z0 p7z0Var = c8xVar.i;
                    if (p7z0Var != null) {
                        mez0 mez0Var = p7z0Var.f;
                        c8x c8xVar2 = p7z0Var.a;
                        mwy0 mwy0Var = p7z0Var.i;
                        if (mwy0Var != null) {
                            a = mwy0Var.a();
                        } else {
                            lgz0 lgz0Var = p7z0Var.k;
                            if (lgz0Var == null) {
                                gu8.c(null, "InstreamAdEngine: no current banner");
                            } else {
                                b1z0 b1z0Var = lgz0Var.W;
                                if (b1z0Var == null) {
                                    gu8.c(null, "InstreamAdEngine: no shoppable banner");
                                } else {
                                    cwm cwmVar = lgz0Var.X;
                                    c8xVar2.getClass();
                                    mwy0 mwy0Var2 = new mwy0(b1z0Var, new y1z0(b1z0Var, mez0Var, cwmVar, context), context);
                                    p7z0Var.i = mwy0Var2;
                                    qnk qnkVar = c8xVar2.a.a;
                                    mwy0Var2.f = new p7z0.d(b1z0Var, mez0Var, context);
                                    a = p7z0Var.i.a();
                                }
                            }
                        }
                        if (a != null) {
                            a.addOnAttachStateChangeListener(new xe0(this));
                            return a;
                        }
                    }
                    a = null;
                    if (a != null) {
                    }
                }
                return null;
            }

            public final boolean b() {
                c8x c8xVar;
                ye0 ye0Var = ye0.this;
                AdBannerData.a aVar = ye0Var.v;
                if (aVar == null || !aVar.b || (c8xVar = ye0Var.i) == null) {
                    return false;
                }
                p7z0 p7z0Var = c8xVar.i;
                return p7z0Var == null || p7z0Var.t == 0;
            }

            public final boolean c() {
                p7z0 p7z0Var;
                c8x c8xVar = ye0.this.i;
                return (c8xVar == null || (p7z0Var = c8xVar.i) == null || p7z0Var.t == 0) ? false : true;
            }

            public final void d(boolean z) {
                p7z0 p7z0Var;
                lgz0 lgz0Var;
                c8x c8xVar = ye0.this.i;
                if (c8xVar == null || (p7z0Var = c8xVar.i) == null || (lgz0Var = p7z0Var.k) == null || lgz0Var.W == null) {
                    return;
                }
                if (!z && p7z0Var.t == 2) {
                    p7z0Var.g();
                }
                p7z0Var.t = z ? 1 : 0;
                p7z0Var.c(p7z0Var.k, z ? "shoppableOn" : "shoppableOff");
            }
        }

        public a() {
        }

        @Override // xsna.je0
        public final void a(boolean z) {
            p7z0 p7z0Var;
            ye0 ye0Var = ye0.this;
            if (z) {
                ye0Var.g("banner_skip");
                c8x c8xVar = ye0Var.i;
                if (c8xVar != null && (p7z0Var = c8xVar.i) != null) {
                    faz0 faz0Var = p7z0Var.q;
                    p7z0Var.c(p7z0Var.k, "closedByUser");
                    ihz0 ihz0Var = p7z0Var.d;
                    thz0 thz0Var = ihz0Var.f;
                    if (thz0Var != null) {
                        thz0Var.c(2);
                    }
                    ihz0Var.b.g();
                    ihz0Var.e();
                    if (faz0Var.d()) {
                        faz0Var.c();
                    }
                    p7z0Var.g();
                }
            }
            ye0Var.c.a.y.x0(z);
        }

        @Override // xsna.je0
        public final void b(String str) {
            p7z0 p7z0Var;
            c8x c8xVar = ye0.this.i;
            if (c8xVar == null || (p7z0Var = c8xVar.i) == null) {
                return;
            }
            p7z0Var.a(str, "shoppableAdsItemShow");
            p7z0Var.a(str, "show");
        }

        @Override // xsna.je0
        public final void c(boolean z) {
            p7z0 p7z0Var;
            ye0 ye0Var = ye0.this;
            ye0Var.g("ad_choice_click");
            c63 c63Var = c63.a;
            Context b = c63.b();
            if (b != null) {
                ye0Var.g.b.b(z);
                if (z) {
                    dhr0.a.getClass();
                    int i = dhr0.u().c;
                    b = new l7s(b, dhr0.u().c);
                }
                c8x c8xVar = ye0Var.i;
                if (c8xVar == null || (p7z0Var = c8xVar.i) == null) {
                    return;
                }
                gu8.c(null, "InstreamAdEngine: handleAdChoicesClick called");
                fvy0 fvy0Var = p7z0Var.o;
                if (fvy0Var != null) {
                    if (fvy0Var.c()) {
                        return;
                    }
                    p7z0Var.o.b(b);
                    p7z0Var.o.d = p7z0Var.n;
                    return;
                }
                gu8.c(null, "InstreamAdEngine: hasn't adChoicesOptions");
                if (p7z0Var.p != null) {
                    gu8.c(null, "InstreamAdEngine: open adChoicesClickLink");
                    de.L(p7z0Var.p, null, null, null, b);
                }
            }
        }

        @Override // xsna.je0
        public final og0 d() {
            return ye0.this.A;
        }

        @Override // xsna.je0
        public final void e(n9c0 n9c0Var) {
            lxd lxdVar = ye0.this.k;
            if (lxdVar != null) {
                lxdVar.b = n9c0Var;
            }
        }

        @Override // xsna.je0
        public final C4096a f() {
            return (C4096a) this.a.getValue();
        }

        @Override // xsna.je0
        public final void g(float f) {
            ye0.this.h(f, true);
        }

        @Override // xsna.je0
        public final void h(kzr0 kzr0Var) {
            p7z0 p7z0Var;
            VideoFile videoFile;
            ye0 ye0Var = ye0.this;
            li5 li5Var = ye0Var.e;
            if (((C4096a) this.a.getValue()).b() && (videoFile = li5Var.a.u) != null && !videoFile.q0()) {
                c63 c63Var = c63.a;
                Activity b = c63.b();
                FragmentActivity fragmentActivity = b instanceof FragmentActivity ? (FragmentActivity) b : null;
                AdBannerData.a aVar = ye0Var.v;
                String size = aVar != null ? new Size(aVar.c, aVar.d).toString() : null;
                VideoFile videoFile2 = li5Var.a.u;
                if (fragmentActivity == null || size == null || videoFile2 == null) {
                    return;
                }
                ydt0 Y = fxc0.B().Y();
                d3b0 d = ye0Var.d();
                OneVideoPlayer a = d != null ? d.a() : null;
                Y.a(fragmentActivity, new VideoAdData(videoFile2, size, (a != null ? a.getState() : null) == OneVideoPlayer.State.PLAYING), kzr0Var.d);
                return;
            }
            ye0Var.g("banner_link_click");
            c8x c8xVar = ye0Var.i;
            if (c8xVar == null || (p7z0Var = c8xVar.i) == null) {
                return;
            }
            if (p7z0Var.k == null) {
                gu8.c(null, "InstreamAdEngine: can't handle click - no playing banner");
                return;
            }
            d8x d8xVar = p7z0Var.d.g;
            Context context = d8xVar == null ? null : d8xVar.getView().getContext();
            if (context == null) {
                gu8.c(null, "InstreamAdEngine: can't handle click - context is null");
                return;
            }
            mez0 mez0Var = p7z0Var.f;
            lgz0 lgz0Var = p7z0Var.k;
            p7z0Var.a.getClass();
            mez0Var.c(lgz0Var, 2, null, context);
        }

        @Override // xsna.je0
        public final void i(String str, String str2) {
            p7z0 p7z0Var;
            ye0 ye0Var = ye0.this;
            c8x c8xVar = ye0Var.i;
            if (c8xVar != null && (p7z0Var = c8xVar.i) != null) {
                p7z0Var.a(str, "shoppableAdsItemClick");
                p7z0Var.a(str, "click");
            }
            xwk.d().getBrowser().f(ye0Var.a, null, LaunchContext.A, str2);
        }

        public final com.vk.libvideo.api.ad.a j() {
            a.AbstractC1195a.b bVar;
            ye0 ye0Var = ye0.this;
            a.AbstractC1195a.b bVar2 = ye0Var.w;
            if (bVar2 != null) {
                return bVar2;
            }
            AdBannerData.a aVar = ye0Var.v;
            if (aVar != null) {
                d3b0 d = ye0Var.d();
                OneVideoPlayer a = d != null ? d.a() : null;
                bVar = new a.AbstractC1195a.b(aVar, null, false, a != null ? a.getVolume() : 1.0f);
            } else {
                bVar = null;
            }
            if (bVar != null) {
                return bVar;
            }
            com.vk.movika.sdk.base.model.l lVar = (com.vk.movika.sdk.base.model.l) ye0Var.A.c;
            ba30 ba30Var = lVar != null ? (ba30) lVar.c : null;
            if (ba30Var != null) {
                return new a.b(ba30Var);
            }
            return null;
        }
    }

    /* compiled from: AdDelegate.kt */
    public abstract class b implements c8x.c {
        public b() {
        }

        public static ArrayList l(List list) {
            lh0 lh0Var;
            oh0 oh0Var = new oh0();
            List<kh0> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (kh0 kh0Var : list2) {
                oh0.b a = oh0Var.a(kh0Var.e);
                oh0.b a2 = oh0Var.a(kh0Var.f);
                String str = a != null ? a.b : null;
                Long l = a != null ? a.a : null;
                Long l2 = a2 != null ? a2.a : null;
                if (l == null || l2 == null) {
                    lh0Var = new lh0(null, null);
                } else if (l.equals(l2)) {
                    lh0Var = new lh0("NEW", Integer.valueOf(R.color.vk_azure_300));
                } else {
                    int longValue = (int) ((1 - (l.longValue() / l2.longValue())) * 100);
                    lh0Var = (5 > longValue || longValue >= 96) ? new lh0(null, null) : new lh0(uqi.a("-", longValue, '%'), Integer.valueOf(R.color.vk_red_nice));
                }
                arrayList.add(new jh0(kh0Var.a, kh0Var.b, kh0Var.c, str, lh0Var.a, lh0Var.b, kh0Var.d, kh0Var.g, kh0Var.f));
            }
            return arrayList;
        }

        public static List m(List list) {
            if (list == null || !(!list.isEmpty())) {
                return EmptyList.b;
            }
            List<rej0> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (rej0 rej0Var : list2) {
                arrayList.add(new kh0(rej0Var.b, rej0Var.a, rej0Var.c, rej0Var.d, rej0Var.g, rej0Var.h, rej0Var.e));
            }
            return arrayList;
        }

        @Override // xsna.c8x.c
        public final void a(float f, float f2) {
            String str;
            ye0 ye0Var = ye0.this;
            AdBannerData.a aVar = ye0Var.v;
            if (aVar != null) {
                float f3 = f2 - f;
                int i = (int) (aVar.i - f3);
                Integer valueOf = Integer.valueOf(i);
                if (i <= 0) {
                    valueOf = null;
                }
                wzr0 wzr0Var = (wzr0) ye0Var.p.getValue();
                int i2 = (int) f3;
                int i3 = (int) f2;
                AdSection adSection = ye0Var.r;
                String str2 = aVar.a;
                int i4 = wzr0Var.d;
                if (i2 != i4) {
                    String str3 = (i4 > 0 || i2 < 0) ? (i4 > 3 || 3 >= i2) ? (i4 > 10 || 10 >= i2) ? null : "banner_10s" : "banner_3s" : "banner_start";
                    if (str3 != null) {
                        wzr0Var.a(str3, adSection, str2);
                    }
                    int i5 = wzr0Var.d;
                    float f4 = i3;
                    int i6 = (int) (0.25f * f4);
                    if (i5 > i6 || i6 >= i2) {
                        int i7 = (int) (0.5f * f4);
                        if (i5 > i7 || i7 >= i2) {
                            int i8 = (int) (0.75f * f4);
                            if (i5 > i8 || i8 >= i2) {
                                int i9 = (int) (f4 * 0.95f);
                                str = (i5 > i9 || i9 >= i2) ? null : "banner_95";
                            } else {
                                str = "banner_75";
                            }
                        } else {
                            str = "banner_50";
                        }
                    } else {
                        str = "banner_25";
                    }
                    if (str != null) {
                        wzr0Var.a(str, adSection, str2);
                    }
                    if (i2 == i3) {
                        wzr0Var.a("banner_100", adSection, str2);
                    }
                    wzr0Var.d = i2;
                }
                com.vk.libvideo.autoplay.g gVar = ye0Var.c;
                qh0 qh0Var = new qh0(f3, valueOf, f);
                d3b0 d = ye0Var.d();
                OneVideoPlayer a = d != null ? d.a() : null;
                a.AbstractC1195a.b bVar = new a.AbstractC1195a.b(aVar, qh0Var, false, a != null ? a.getVolume() : 1.0f);
                ye0Var.w = bVar;
                VideoAutoPlay videoAutoPlay = gVar.a;
                je0 N0 = videoAutoPlay.N0();
                if (N0 != null) {
                    videoAutoPlay.y.g(bVar, (a) N0);
                }
            }
        }

        @Override // xsna.c8x.c
        public final void b() {
            ye0 ye0Var = ye0.this;
            if (ye0Var.d() != null) {
                VideoAutoPlay videoAutoPlay = ye0Var.c.a;
                videoAutoPlay.y.c2();
                videoAutoPlay.w();
            }
        }

        @Override // xsna.c8x.c
        public final void c() {
            ye0 ye0Var = ye0.this;
            ye0Var.h.onNext(MyTargetAdLoadingState.READY);
            ye0Var.g("AdmanReady");
        }

        @Override // xsna.c8x.c
        public final void d(c8x.d dVar) {
            rws0 rws0Var;
            com.vk.core.telemetry.b bVar;
            Double k;
            Double k2;
            ye0 ye0Var = ye0.this;
            c8x c8xVar = ye0Var.i;
            d8x d8xVar = c8xVar != null ? c8xVar.j : null;
            bh0 bh0Var = d8xVar instanceof bh0 ? (bh0) d8xVar : null;
            if (bh0Var == null || (rws0Var = bh0Var.j) == null) {
                return;
            }
            og0 og0Var = ye0Var.A;
            og0Var.b = new sws0(rws0Var, ye0Var.new c());
            com.vk.movika.sdk.base.model.l lVar = new com.vk.movika.sdk.base.model.l(ye0Var.d);
            og0Var.c = lVar;
            bpn0 bpn0Var = uws0.a;
            vws0 vws0Var = dVar.f;
            String str = dVar.e;
            float f = dVar.a;
            int i = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) (f * 1000) : 5000;
            float f2 = dVar.c;
            xvu xvuVar = vws0Var.a;
            String str2 = xvuVar.d;
            String str3 = xvuVar.c;
            String str4 = xvuVar.e;
            boolean z = dVar.b && f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            StringBuilder sb = new StringBuilder();
            if (!drm0.N(str4)) {
                sb.append(str4);
            }
            if (!drm0.N(str3)) {
                if (!drm0.N(sb)) {
                    sb.append(" ∙ ");
                }
                sb.append(str3);
            }
            if (!drm0.N(str2)) {
                if (!drm0.N(sb)) {
                    sb.append(" ∙ ");
                }
                sb.append(str2);
            }
            ka30 ka30Var = new ka30(xvuVar.a, xvuVar.b, sb.toString(), dVar.d, dVar.b, f2 * 1000, z);
            ArrayList<wws0> arrayList = vws0Var.b;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            for (wws0 wws0Var : arrayList) {
                try {
                    ((DecimalFormat) uws0.a.getValue()).setCurrency(Currency.getInstance(wws0Var.d));
                } catch (Exception unused) {
                }
                String str5 = wws0Var.a;
                String str6 = wws0Var.c;
                String str7 = wws0Var.b;
                String a = (str7 == null || (k2 = arm0.k(str7)) == null) ? null : uws0.a(((DecimalFormat) uws0.a.getValue()).format(k2.doubleValue()));
                String a2 = (str6 == null || (k = arm0.k(str6)) == null) ? null : uws0.a(((DecimalFormat) uws0.a.getValue()).format(k.doubleValue()));
                Double k3 = str7 != null ? arm0.k(str7) : null;
                Double k4 = str6 != null ? arm0.k(str6) : null;
                arrayList2.add(new na30(str5, a, a2, (k3 == null || k4 == null || k4.doubleValue() <= k3.doubleValue()) ? null : tgw.b((int) Math.rint((k3.doubleValue() / k4.doubleValue()) * 100), "-", "%"), wws0Var.d, wws0Var.e, wws0Var.f, wws0Var.g));
            }
            ba30 ba30Var = new ba30(str, i, 0, ka30Var, arrayList2);
            if (((yws0) lVar.b) != null) {
                return;
            }
            lVar.c = ba30Var;
            yws0 yws0Var = new yws0(i, new pg(lVar, 11));
            yws0Var.a();
            lVar.b = yws0Var;
            VideoAutoPlay videoAutoPlay = ((l3s0) lVar.a).a;
            a.b bVar2 = new a.b(ba30Var);
            d3b0 d3b0Var = videoAutoPlay.p0;
            a6q a6qVar = d3b0Var instanceof a6q ? (a6q) d3b0Var : null;
            if (a6qVar != null && (bVar = a6qVar.v) != null) {
                bVar.a(VideoAutoPlay.T0(bVar2), videoAutoPlay.u.w9().Cb());
            }
            bpn0 bpn0Var2 = com.vk.libvideo.autoplay.b.B;
            if (!b.C1208b.a().h(videoAutoPlay)) {
                videoAutoPlay.C(false);
                return;
            }
            d3b0 d3b0Var2 = videoAutoPlay.p0;
            if (d3b0Var2 != null) {
                d3b0Var2.C(false);
                d3b0Var2.j(null);
            }
            videoAutoPlay.D1(VideoAutoPlay.AutoPlayState.PLAY);
            ye0 ye0Var2 = videoAutoPlay.N;
            if (ye0Var2 == null) {
                return;
            }
            videoAutoPlay.y.m(ye0Var2.z, bVar2);
        }

        @Override // xsna.c8x.c
        public final void e() {
            com.vk.core.telemetry.b bVar;
            ye0 ye0Var = ye0.this;
            ye0Var.f();
            og0 og0Var = ye0Var.A;
            og0Var.b = null;
            com.vk.movika.sdk.base.model.l lVar = (com.vk.movika.sdk.base.model.l) og0Var.c;
            if (lVar != null) {
                lVar.c = null;
                yws0 yws0Var = (yws0) lVar.b;
                if (yws0Var != null) {
                    yws0Var.c.removeCallbacks(yws0Var.e);
                }
                lVar.b = null;
                VideoAutoPlay videoAutoPlay = ((l3s0) lVar.a).a;
                d3b0 d3b0Var = videoAutoPlay.p0;
                a6q a6qVar = d3b0Var instanceof a6q ? (a6q) d3b0Var : null;
                if (a6qVar != null && (bVar = a6qVar.v) != null) {
                    bVar.onAdEnd(videoAutoPlay.u.w9().Cb());
                }
                videoAutoPlay.y.j();
                videoAutoPlay.D1(VideoAutoPlay.AutoPlayState.PAUSED_WEAK);
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                if (b.C1208b.a().h(videoAutoPlay) && videoAutoPlay.Z0().h) {
                    videoAutoPlay.play();
                }
            }
            og0Var.c = null;
        }

        @Override // xsna.c8x.c
        public final void g() {
            ye0.this.h.onNext(MyTargetAdLoadingState.NO_AD);
        }

        @Override // xsna.c8x.c
        public final void h(c8x.a aVar) {
            ye0 ye0Var = ye0.this;
            com.vk.libvideo.autoplay.g gVar = ye0Var.c;
            if (ye0Var.v == null) {
                String str = aVar.i;
                float f = aVar.a;
                int i = aVar.d;
                int i2 = aVar.e;
                boolean z = aVar.b;
                int i3 = (int) aVar.c;
                boolean z2 = aVar.h;
                boolean z3 = aVar.f;
                ArrayList l = l(m(aVar.t));
                ka9 ka9Var = aVar.o;
                String str2 = ka9Var.a;
                Integer num = ka9Var.b;
                Integer num2 = ka9Var.c;
                String str3 = ka9Var.d;
                kiw kiwVar = ka9Var.e;
                AdBannerData.a aVar2 = new AdBannerData.a(str, z2, i, i2, f, z3, new AdBannerData.AdRedirectData(str2, num, num2, str3, kiwVar != null ? kiwVar.a : null), z, i3, l);
                ye0Var.v = aVar2;
                d3b0 d = ye0Var.d();
                OneVideoPlayer a = d != null ? d.a() : null;
                gVar.a(new a.AbstractC1195a.b(aVar2, null, false, a != null ? a.getVolume() : 1.0f));
            }
            if (ye0Var.d() != null) {
                gVar.a.h();
            }
        }

        @Override // xsna.c8x.c
        public final void i() {
            p7z0 p7z0Var;
            c8x c8xVar = ye0.this.i;
            if (c8xVar == null || (p7z0Var = c8xVar.i) == null) {
                return;
            }
            p7z0Var.q.d = null;
        }

        @Override // xsna.c8x.c
        public final void j(c8x.a aVar) {
            p7z0 p7z0Var;
            ye0 ye0Var = ye0.this;
            ye0Var.g("AdmanAdStarted");
            VideoAdvertisementsRepository videoAdvertisementsRepository = ye0Var.g.c;
            String str = aVar.i;
            videoAdvertisementsRepository.b(str, ye0Var.r);
            float f = aVar.a;
            int i = aVar.d;
            int i2 = aVar.e;
            boolean z = aVar.b;
            int i3 = (int) aVar.c;
            boolean z2 = aVar.h;
            boolean z3 = aVar.f;
            List<rej0> list = aVar.t;
            ArrayList l = l(m(list));
            ka9 ka9Var = aVar.o;
            String str2 = ka9Var.a;
            Integer num = ka9Var.b;
            Integer num2 = ka9Var.c;
            String str3 = ka9Var.d;
            kiw kiwVar = ka9Var.e;
            AdBannerData.a aVar2 = new AdBannerData.a(str, z2, i, i2, f, z3, new AdBannerData.AdRedirectData(str2, num, num2, str3, kiwVar != null ? kiwVar.a : null), z, i3, l);
            if (ye0Var.k == null) {
                String str4 = aVar.i;
                Size size = new Size(aVar.d, aVar.e);
                int i4 = (int) (aVar.a * 1000.0f);
                boolean z4 = aVar.h;
                boolean z5 = aVar.f;
                List<rej0> list2 = list == null ? EmptyList.b : list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
                    rej0 rej0Var = (rej0) it.next();
                    arrayList.add(new nej0(rej0Var.b, rej0Var.a, rej0Var.c, rej0Var.d, rej0Var.e, rej0Var.h, rej0Var.g));
                }
                lxd lxdVar = new lxd(new sc0(str4, size, i4, z4, z5, null, arrayList, new sh0(ka9Var.a, ka9Var.b, ka9Var.c, ka9Var.d, ka9Var.e)), ye0Var.a);
                ye0Var.k = lxdVar;
                c8x c8xVar = ye0Var.i;
                if (c8xVar != null && (p7z0Var = c8xVar.i) != null) {
                    p7z0Var.q.d = lxdVar;
                }
            }
            ye0Var.v = aVar2;
            com.vk.libvideo.autoplay.g gVar = ye0Var.c;
            d3b0 d = ye0Var.d();
            OneVideoPlayer a = d != null ? d.a() : null;
            gVar.a(new a.AbstractC1195a.b(aVar2, null, false, a != null ? a.getVolume() : 1.0f));
        }

        @Override // xsna.c8x.c
        public final void k() {
            ye0 ye0Var = ye0.this;
            if (((Boolean) ye0Var.m.getValue()).booleanValue() && ye0Var.e.a()) {
                ye0Var.z.a(true);
                return;
            }
            AdBannerData.a aVar = ye0Var.v;
            if (aVar != null) {
                d3b0 d = ye0Var.d();
                OneVideoPlayer a = d != null ? d.a() : null;
                ye0Var.w = new a.AbstractC1195a.b(aVar, null, true, a != null ? a.getVolume() : 1.0f);
            }
            ye0Var.c.a.y.h();
        }

        @Override // xsna.c8x.c
        public final void onError() {
            ye0 ye0Var = ye0.this;
            ye0Var.g("AdmanError");
            ye0.a(ye0Var, ye0Var.r);
        }
    }

    /* compiled from: AdDelegate.kt */
    public final class c {
        public c() {
        }
    }

    /* compiled from: AdDelegate.kt */
    public final class d extends b {
        public d() {
            super();
        }

        @Override // xsna.c8x.c
        public final void f() {
            ye0.this.g("AdmanAdCompleted");
            ye0 ye0Var = ye0.this;
            if (((a.C4096a) ye0Var.z.a.getValue()).c()) {
                ye0.a(ye0Var, AdSection.PREROLL);
            }
        }

        @Override // xsna.c8x.c
        public final void onComplete(String str) {
            ye0.a(ye0.this, AdSection.valueOf(str.toUpperCase(Locale.ROOT)));
        }
    }

    /* compiled from: AdDelegate.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdSection.values().length];
            try {
                iArr[AdSection.PREROLL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdSection.POSTROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdSection.MIDROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AdDelegate.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements gzs<VideoTextureView> {
        @Override // xsna.gzs
        public final VideoTextureView invoke() {
            return ((ki5) this.receiver).getVideoView();
        }
    }

    /* compiled from: AdDelegate.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf(((ki5) this.receiver).h());
        }
    }

    public ye0(Context context, jc0 jc0Var, com.vk.libvideo.autoplay.g gVar, l3s0 l3s0Var, li5 li5Var, ad0 ad0Var, ze0 ze0Var) {
        this.a = context;
        this.b = jc0Var;
        this.c = gVar;
        this.d = l3s0Var;
        this.e = li5Var;
        this.f = ad0Var;
        this.g = ze0Var;
        int i = 0;
        this.m = new bpn0(new re0(i));
        this.n = new bpn0(new se0(i));
        this.o = new bpn0(new te0(i));
        boolean h = BuildInfo.h();
        AtomicBoolean atomicBoolean = xr50.a;
        gu8.a = h;
        if (h) {
            gu8.c(null, "Debug mode enabled");
        }
    }

    public static final void a(ye0 ye0Var, AdSection adSection) {
        com.vk.core.telemetry.b bVar;
        ye0Var.f();
        if (adSection != null) {
            VideoAutoPlay videoAutoPlay = ye0Var.c.a;
            d3b0 d3b0Var = videoAutoPlay.p0;
            a6q a6qVar = d3b0Var instanceof a6q ? (a6q) d3b0Var : null;
            if (a6qVar != null && (bVar = a6qVar.v) != null) {
                bVar.onAdEnd(videoAutoPlay.u.w9().Cb());
            }
            videoAutoPlay.y.j();
            int i = VideoAutoPlay.f.$EnumSwitchMapping$3[adSection.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                videoAutoPlay.L0();
            } else {
                videoAutoPlay.D1(VideoAutoPlay.AutoPlayState.PAUSED_WEAK);
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                if (b.C1208b.a().h(videoAutoPlay) && videoAutoPlay.Z0().h) {
                    videoAutoPlay.play();
                }
            }
        }
    }

    public final boolean b(AdSection adSection, Float f2) {
        boolean z;
        boolean z2;
        boolean z3;
        InstreamAd instreamAd = this.g.a;
        if (this.h.P0() == MyTargetAdLoadingState.READY && instreamAd.e.contains(adSection) && instreamAd.b) {
            int i = e.$EnumSwitchMapping$0[adSection.ordinal()];
            if (i == 1) {
                z = this.s;
            } else if (i == 2) {
                z = this.t;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                z = !j5g.P(this.u, f2);
            }
            if (z && !this.y) {
                if (f2 != null) {
                    c8x c8xVar = this.i;
                    if (c8xVar != null) {
                        float[] fArr = c8xVar.n;
                        float[] fArr2 = fArr == null ? new float[0] : (float[]) fArr.clone();
                        int length = fArr2.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                z3 = false;
                                break;
                            }
                            if (epx.a(fArr2[i2], f2)) {
                                z3 = true;
                                break;
                            }
                            i2++;
                        }
                        if (z3) {
                            z2 = true;
                            if (!z2) {
                            }
                        }
                    }
                    z2 = false;
                    if (!z2) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final Pair<d8x, e8x> c() {
        Context createConfigurationContext = this.a.createConfigurationContext(new Configuration());
        li5 li5Var = this.e;
        bh0 bh0Var = new bh0(createConfigurationContext, new f(0, li5Var, ki5.class, "getVideoView", "getVideoView()Lcom/vk/libvideo/design/view/videotexture/VideoTextureView;", 0), new g(0, li5Var, ki5.class, "isFocused", "isFocused()Z", 0), this.f);
        return new Pair<>(bh0Var, this.q ? bh0Var : null);
    }

    public final d3b0 d() {
        c8x c8xVar = this.i;
        d8x d8xVar = c8xVar != null ? c8xVar.j : null;
        bh0 bh0Var = d8xVar instanceof bh0 ? (bh0) d8xVar : null;
        if (bh0Var != null) {
            return bh0Var.k();
        }
        return null;
    }

    public final void e() {
        yws0 yws0Var;
        d8x d8xVar;
        c8x c8xVar = this.i;
        if (c8xVar != null) {
            p7z0 p7z0Var = c8xVar.i;
            if (p7z0Var != null && p7z0Var.j != null && !p7z0Var.q.d() && (d8xVar = p7z0Var.d.g) != null) {
                d8xVar.h();
            }
            com.vk.movika.sdk.base.model.l lVar = (com.vk.movika.sdk.base.model.l) this.A.c;
            if (lVar == null || (yws0Var = (yws0) lVar.b) == null) {
                return;
            }
            yws0Var.c.removeCallbacks(yws0Var.e);
            VideoAutoPlay videoAutoPlay = ((l3s0) lVar.a).a;
            videoAutoPlay.y.r1(videoAutoPlay);
        }
    }

    public final void f() {
        d3b0 d2 = d();
        if (d2 != null) {
            d2.j(null);
        }
        d3b0 d3 = d();
        if (d3 != null) {
            d3.C(false);
        }
        c8x c8xVar = this.i;
        if (c8xVar != null) {
            c8xVar.f(null);
        }
        c8x c8xVar2 = this.i;
        if (c8xVar2 != null) {
            c8xVar2.f(null);
        }
        c8x c8xVar3 = this.i;
        if (c8xVar3 != null) {
            c8xVar3.l = null;
        }
        this.r = null;
        this.y = false;
        this.v = null;
        this.w = null;
        this.x.dispose();
    }

    public final void g(String str) {
        AdBannerData.a aVar = this.v;
        ((wzr0) this.p.getValue()).a(str, this.r, aVar != null ? aVar.a : null);
    }

    public final void h(float f2, boolean z) {
        c8x c8xVar = this.i;
        if (c8xVar != null) {
            if (Float.compare(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) < 0 || Float.compare(f2, 1.0f) > 0) {
                gu8.c(null, "InstreamAd: Unable to set volume" + f2 + ", volume must be in range [0..1]");
            } else {
                c8xVar.p = f2;
                p7z0 p7z0Var = c8xVar.i;
                if (p7z0Var != null) {
                    ihz0 ihz0Var = p7z0Var.d;
                    d8x d8xVar = ihz0Var.g;
                    if (d8xVar != null) {
                        d8xVar.setVolume(f2);
                    }
                    ihz0Var.l = f2;
                }
            }
        }
        a.AbstractC1195a.b bVar = this.w;
        if (bVar != null) {
            this.w = new a.AbstractC1195a.b(bVar.d, bVar.e, bVar.f, f2);
        }
        if (z) {
            this.l = Float.valueOf(f2);
        }
    }
}
