package sg.bigo.ads.ad.banner;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.InterfaceC4319fe;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.ad.banner.f;
import sg.bigo.ads.aj.a;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.BannerAd;
import sg.bigo.ads.api.InnerBannerAd;
import sg.bigo.ads.api.core.i;
import sg.bigo.ads.core.mraid.n;

/* loaded from: classes9.dex */
public final class e extends sg.bigo.ads.d.d<InnerBannerAd, sg.bigo.ads.api.core.i> implements InnerBannerAd {
    private FrameLayout A;
    private boolean B;
    private boolean C;
    private final AtomicBoolean D;
    private boolean E;
    private AdError[] F;
    private boolean G;

    @Nullable
    private c<BannerAd> z;

    public e(@NonNull sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        this.F = new AdError[1];
        this.G = false;
        this.D = new AtomicBoolean(false);
        if (gVar.a.x() == 3) {
            this.z = a(gVar, this.F);
        }
    }

    @Nullable
    private AdError B() {
        if (this.z == null) {
            AdError[] adErrorArr = this.F;
            AdError adError = adErrorArr[0];
            if (adError == null) {
                return new AdError(InterfaceC4319fe.a.b, "Failed to create html ads.");
            }
            adErrorArr[0] = null;
            return adError;
        }
        try {
            sg.bigo.ads.api.core.i iVar = (sg.bigo.ads.api.core.i) f();
            if (iVar.aE() != null && !TextUtils.isEmpty(iVar.aE().c())) {
                return null;
            }
            return new AdError(InterfaceC4319fe.a.c, "Empty content.");
        } catch (Exception unused) {
            return new AdError(1200, "BannerAd with invalid AdData class type.");
        }
    }

    private void C() {
        if (!this.E) {
            this.E = true;
        }
        sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.banner.e.2
            @Override // java.lang.Runnable
            public final void run() {
                f fVar;
                fVar = f.a.a;
                fVar.b(e.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        if (this.D.compareAndSet(false, true)) {
            super.n();
        }
    }

    private boolean E() {
        try {
            return ((sg.bigo.ads.api.core.i) f()).aH();
        } catch (Exception unused) {
            return false;
        }
    }

    @Nullable
    private c<BannerAd> a(sg.bigo.ads.api.core.g gVar, @NonNull AdError[] adErrorArr) {
        try {
            sg.bigo.ads.api.core.i iVar = (sg.bigo.ads.api.core.i) f();
            this.B = iVar.aD();
            Context context = this.b.e;
            int c = gVar.c.c();
            return new c<>(context, gVar, this, iVar, (c == 3 || c == 4) ? n.INTERSTITIAL : n.INLINE, new h() { // from class: sg.bigo.ads.ad.banner.e.1
                @Override // sg.bigo.ads.ad.banner.h
                public final void a() {
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [sg.bigo.ads.api.core.b] */
                @Override // sg.bigo.ads.ad.banner.h
                public final void b() {
                    e.this.D();
                    sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) e.this.f(), (String) e.this.b("show_proportion", ""), e.this.j(), ((Integer) e.this.b("render_style", 0)).intValue());
                }

                @Override // sg.bigo.ads.ad.banner.h
                public final void c() {
                    e.b(e.this);
                    if (e.this.p()) {
                        e.this.D();
                    }
                }

                @Override // sg.bigo.ads.ad.banner.h
                public final void a(sg.bigo.ads.an.i iVar2, sg.bigo.ads.api.core.e eVar) {
                    e.this.a(iVar2, eVar);
                }
            }, this.B);
        } catch (Exception unused) {
            adErrorArr[0] = new AdError(1200, "Unable to init banner ad due to invalid ad data");
            return null;
        }
    }

    public static /* synthetic */ boolean b(e eVar) {
        eVar.C = true;
        return true;
    }

    @Override // sg.bigo.ads.api.BannerAd
    @Nullable
    public final View adView() {
        c<BannerAd> cVar = this.z;
        if (cVar == null) {
            return null;
        }
        if (!cVar.u) {
            a(false);
        }
        View c = this.z.c();
        if (this.A == null) {
            this.A = new FrameLayout(c.getContext());
        }
        this.A.removeAllViews();
        this.A.addView(c);
        v();
        a(this.A, this.G);
        return this.A;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.d.d, sg.bigo.ads.d.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        c<BannerAd> cVar = this.z;
        if (cVar != null) {
            cVar.a();
        }
        C();
        sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) f(), SystemClock.elapsedRealtime() - this.k);
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final String getCreativeId() {
        c<BannerAd> cVar = this.z;
        return cVar != null ? cVar.d() : "";
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getHeight() {
        c<BannerAd> cVar = this.z;
        if (cVar == null) {
            return 0;
        }
        sg.bigo.ads.api.core.i iVar = cVar.m;
        return (iVar == null || iVar.aE() == null || cVar.m.aE().a() <= 0 || cVar.m.aE().b() <= 0) ? cVar.i().getHeight() : cVar.m.aE().b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.api.core.b getInnerBannerAdData() {
        return f();
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.common.view.c getWatermarkView() {
        c<BannerAd> cVar = this.z;
        if (cVar == null) {
            return null;
        }
        return cVar.v;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final WebView getWebView() {
        c<BannerAd> cVar = this.z;
        if (cVar == null) {
            return null;
        }
        return cVar.a;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getWidth() {
        c<BannerAd> cVar = this.z;
        if (cVar == null) {
            return 0;
        }
        sg.bigo.ads.api.core.i iVar = cVar.m;
        return (iVar == null || iVar.aE() == null || cVar.m.aE().a() <= 0 || cVar.m.aE().b() <= 0) ? cVar.i().getWidth() : cVar.m.aE().a();
    }

    @Override // sg.bigo.ads.d.c
    public final void h() {
        c<BannerAd> cVar = this.z;
        if (cVar != null) {
            b.g(cVar);
            BannerAd bannerAd = cVar.l;
            if (bannerAd instanceof e) {
                ((e) bannerAd).a(b.i(cVar));
            }
        }
        super.h();
        c<BannerAd> cVar2 = this.z;
        if (cVar2 != null) {
            cVar2.f();
        }
        C();
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void handleInnerBannerAdResponse(@NonNull d.a<InnerBannerAd> aVar) {
        String str;
        sg.bigo.ads.api.core.i iVar;
        f fVar;
        this.E = false;
        AdError B = B();
        if (B != null) {
            aVar.a(this, 1005, B.getCode(), B.getMessage());
            return;
        }
        i.a aF = this.z.m.aF();
        if (aF != null && aF.a() && !E()) {
            try {
                iVar = (sg.bigo.ads.api.core.i) f();
                fVar = f.a.a;
            } catch (Exception unused) {
                str = "Banner preload, not BannerAdData type.";
            }
            if (fVar.a(this)) {
                this.E = true;
                iVar.aI();
                a(true);
            } else {
                str = "Banner preload limit 3 BannerAds.";
                sg.bigo.ads.bn.a.a(0, 5, "BannerAd", str);
            }
        }
        aVar.a(this);
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final boolean isInnerBannerAdFromAutoRefresh() {
        return E();
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void markFromAutoFresh(sg.bigo.ads.api.core.b bVar) {
        this.G = true;
        if (bVar instanceof sg.bigo.ads.api.core.i) {
            ((sg.bigo.ads.api.core.i) bVar).aG();
        }
        a();
    }

    @Override // sg.bigo.ads.d.c
    public final void n() {
        if (!this.B || this.C) {
            D();
        }
    }

    @Override // sg.bigo.ads.d.c
    public final void o() {
        super.o();
        D();
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final int updateFormOpenTimes() {
        return A();
    }

    public final void a(long j) {
        a("attach_render_cost", Long.valueOf(j));
    }

    private void a(boolean z) {
        if (this.z == null) {
            return;
        }
        final sg.bigo.ads.api.core.i iVar = (sg.bigo.ads.api.core.i) f();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final a.InterfaceC2425a interfaceC2425a = new a.InterfaceC2425a() { // from class: sg.bigo.ads.ad.banner.e.3
            @Override // sg.bigo.ads.aj.a.InterfaceC2425a
            public final void a(sg.bigo.ads.api.core.c cVar) {
                sg.bigo.ads.da.b.a(iVar, "banner_load_cost", SystemClock.elapsedRealtime() - elapsedRealtime, 0, (Map<String, String>) null);
                sg.bigo.ads.bn.a.a(1, 5, "BannerAd", "Failed to load banner media.");
            }

            @Override // sg.bigo.ads.aj.a.InterfaceC2425a
            public final void b() {
                sg.bigo.ads.da.b.a(iVar, "banner_load_cost", SystemClock.elapsedRealtime() - elapsedRealtime, 1, (Map<String, String>) null);
            }
        };
        if (z) {
            this.z.a(interfaceC2425a);
        } else {
            sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.banner.e.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (e.this.z.b(interfaceC2425a)) {
                        return;
                    }
                    interfaceC2425a.a(new sg.bigo.ads.api.core.c(3001, 10102, "Adx media load error when load"));
                }
            });
        }
    }
}
