package xsna;

import android.content.Context;
import android.view.View;
import com.vk.external.miniapp.net.ad.AdSlotSkipReason;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.superapp.advertisement.api.dto.BannerAdUiData;
import com.vk.superapp.advertisement.requestsanalytics.AdRequestPurpose;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.j11;
import xsna.mo6;
import xsna.y31;
import xsna.ydl0;

/* compiled from: StickyBannerAdController.kt */
/* loaded from: classes6.dex */
public final class bel0 extends mo6 {
    public io.reactivex.rxjava3.disposables.c k;

    public static void x(bel0 bel0Var, Context context, rei reiVar, fjh fjhVar, gzs gzsVar, int i) {
        lel0 a;
        y31.c cVar = bel0Var.e;
        View view = null;
        if ((i & 2) != 0) {
            reiVar = null;
        }
        if ((i & 4) != 0) {
            fjhVar = null;
        }
        mo6.a aVar = bel0Var.g;
        if (aVar == null) {
            return;
        }
        ydl0 ydl0Var = aVar.a;
        String str = aVar.b;
        ydl0.b.AbstractC4094b.a f = ydl0Var.f();
        BannerAdUiData bannerAdUiData = aVar.e;
        if (reiVar != null) {
            reiVar.invoke(ydl0Var, bannerAdUiData);
        }
        if (f != null && (a = bel0Var.f.b.a(f)) != null) {
            sdu0 sdu0Var = (sdu0) a;
            s36 a2 = sdu0Var.a(sdu0Var.a, context, bannerAdUiData, cVar.c());
            if (a2 != null) {
                view = ydl0Var.b(a2);
            }
        }
        if (view == null) {
            gzsVar.invoke();
            return;
        }
        cVar.a(view, bannerAdUiData, new h6l(bel0Var, ydl0Var, str, bannerAdUiData));
        if (fjhVar != null) {
            fjhVar.invoke(ydl0Var, bannerAdUiData);
        }
    }

    @Override // xsna.eel0
    public final void c(BannerAdUiData bannerAdUiData, long j, Context context, WebAdConfig webAdConfig) {
        y31.c cVar = this.e;
        if (cVar.g()) {
            return;
        }
        gnl gnlVar = e370.m;
        if (gnlVar == null) {
            gnlVar = null;
        }
        List<hel0> y = gnlVar.a().j0().y(webAdConfig);
        gnl gnlVar2 = e370.m;
        if (gnlVar2 == null) {
            gnlVar2 = null;
        }
        AdvertisementConfig.SlotConfig x = gnlVar2.a().j0().x(webAdConfig != null ? Integer.valueOf(webAdConfig.b) : null);
        if (x == null || y.isEmpty()) {
            cVar.b(webAdConfig != null ? Integer.valueOf(webAdConfig.b) : null);
            return;
        }
        gnl gnlVar3 = e370.m;
        if (gnlVar3 == null) {
            gnlVar3 = null;
        }
        gnlVar3.a().j0().u().g(x.b(), j);
        this.h = null;
        this.i = 0;
        w(new uh0(AdRequestPurpose.SHOW_INSTANCE), bannerAdUiData, jn00.b(y.get(0)), context, false, webAdConfig);
    }

    public final void w(uh0 uh0Var, BannerAdUiData bannerAdUiData, gel0 gel0Var, Context context, boolean z, WebAdConfig webAdConfig) {
        r31 r31Var = (r31) this.b;
        int i = gel0Var.a;
        r31Var.h = Integer.valueOf(i);
        ydl0 a = this.f.a.a(context, gel0Var, a());
        this.h = a;
        if (a == null) {
            String a2 = lhg.a(i, "Incompatible slot: ");
            j11.a aVar = new j11.a(2005, a2, "Hasn't banners error");
            mo6.t(gel0Var, a2);
            r31Var.j(i, AdSlotSkipReason.NETWORK_ERROR);
            y(uh0Var, aVar, bannerAdUiData, context, z, webAdConfig);
            return;
        }
        a.e(new ael0(this, uh0Var, gel0Var, context, bannerAdUiData, z, webAdConfig));
        ydl0 ydl0Var = this.h;
        if (ydl0Var != null) {
            ydl0Var.load();
        }
    }

    public final void y(uh0 uh0Var, j11 j11Var, BannerAdUiData bannerAdUiData, Context context, boolean z, WebAdConfig webAdConfig) {
        String str = (String) uh0Var.b;
        gnl gnlVar = e370.m;
        if (gnlVar == null) {
            gnlVar = null;
        }
        List<hel0> y = gnlVar.a().j0().y(webAdConfig);
        if (this.i < e43.h(y)) {
            int i = this.i + 1;
            this.i = i;
            w(uh0Var, bannerAdUiData, jn00.b(y.get(i)), context, z, webAdConfig);
            return;
        }
        y31.c cVar = this.e;
        if (z) {
            cVar.f(s(this.g), j11Var, str);
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.k;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        cVar.i(j11Var, str);
    }

    public final void z(Context context, BannerAdUiData bannerAdUiData, WebAdConfig webAdConfig) {
        gnl gnlVar = e370.m;
        if (gnlVar == null) {
            gnlVar = null;
        }
        AdvertisementConfig.SlotConfig w = gnlVar.a().j0().w(webAdConfig);
        if (w != null) {
            io.reactivex.rxjava3.disposables.c cVar = this.k;
            if (cVar != null) {
                cVar.dispose();
            }
            this.k = null;
            if (w.a() > 0) {
                this.k = io.reactivex.rxjava3.core.q.R(w.a(), TimeUnit.MILLISECONDS).r0(io.reactivex.rxjava3.schedulers.a.a()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new r7a0(new xs70(this, webAdConfig, bannerAdUiData, context, 2), 9), new d750(new dl70(18), 15));
            }
        }
    }

    @Override // xsna.e41
    public final void destroy() {
    }
}
