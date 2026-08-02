package xsna;

import android.content.Context;
import android.view.View;
import com.vk.external.miniapp.net.ad.AdSlotSkipReason;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.superapp.advertisement.api.dto.BannerAdUiData;
import com.vk.superapp.advertisement.requestsanalytics.AdRequestPurpose;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import xsna.j11;
import xsna.mo6;
import xsna.r31;
import xsna.y31;
import xsna.ydl0;

/* compiled from: StickyBannerAdController.kt */
/* loaded from: classes6.dex */
public final class ael0 implements ydl0.a {
    public final /* synthetic */ bel0 a;
    public final /* synthetic */ uh0 b;
    public final /* synthetic */ gel0 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ BannerAdUiData e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ WebAdConfig g;

    public ael0(bel0 bel0Var, uh0 uh0Var, gel0 gel0Var, Context context, BannerAdUiData bannerAdUiData, boolean z, WebAdConfig webAdConfig) {
        this.a = bel0Var;
        this.b = uh0Var;
        this.c = gel0Var;
        this.d = context;
        this.e = bannerAdUiData;
        this.f = z;
        this.g = webAdConfig;
    }

    @Override // xsna.ydl0.a
    public final void a() {
        bel0 bel0Var = this.a;
        y31.c cVar = bel0Var.e;
        vh0 vh0Var = (vh0) bel0Var.c;
        uh0 uh0Var = this.b;
        String str = (String) uh0Var.b;
        String str2 = (String) uh0Var.b;
        AdRequestPurpose adRequestPurpose = (AdRequestPurpose) uh0Var.a;
        vh0Var.getClass();
        AdRequestEvent.AdFormat adFormat = AdRequestEvent.AdFormat.BANNER;
        AdRequestEvent.RequestType requestType = vh0Var.b;
        AdRequestEvent.RequestSubtype e = vh0.e(adRequestPurpose);
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.SHOW;
        xh0 xh0Var = vh0Var.a;
        gel0 gel0Var = this.c;
        Integer valueOf = Integer.valueOf(gel0Var.a);
        int i = gel0Var.d;
        xh0Var.a(new AdRequestEvent(adFormat, str2, eventType, requestType, e, null, null, Integer.valueOf(i), valueOf, null, null));
        r31 r31Var = (r31) bel0Var.b;
        r31Var.i = Integer.valueOf(i);
        r31Var.j = new r31.b(r31Var.h, r31Var.i, r31Var.a());
        if (this.f) {
            cVar.f(bel0Var.s(bel0Var.g), null, str);
            return;
        }
        bel0Var.z(this.d, this.e, this.g);
        cVar.h(bel0Var.s(bel0Var.g), str);
    }

    @Override // xsna.ydl0.a
    public final void b(j11.b bVar) {
        bel0 bel0Var = this.a;
        vh0 vh0Var = (vh0) bel0Var.c;
        uh0 uh0Var = this.b;
        String str = (String) uh0Var.b;
        AdRequestPurpose adRequestPurpose = (AdRequestPurpose) uh0Var.a;
        vh0Var.getClass();
        AdRequestEvent.AdFormat adFormat = AdRequestEvent.AdFormat.BANNER;
        AdRequestEvent.RequestType requestType = vh0Var.b;
        AdRequestEvent.RequestSubtype e = vh0.e(adRequestPurpose);
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.LOAD;
        int i = bVar.a;
        String str2 = bVar.b;
        Integer valueOf = Integer.valueOf(i);
        xh0 xh0Var = vh0Var.a;
        gel0 gel0Var = this.c;
        int i2 = gel0Var.a;
        xh0Var.a(new AdRequestEvent(adFormat, str, eventType, requestType, e, valueOf, str2, Integer.valueOf(gel0Var.d), Integer.valueOf(i2), null, null));
        r31 r31Var = (r31) bel0Var.b;
        com.vk.core.utils.newtork.b.a.getClass();
        r31Var.j(i2, com.vk.core.utils.newtork.b.d() ? AdSlotSkipReason.NETWORK_NO_AD : AdSlotSkipReason.NETWORK_ERROR);
        bel0Var.y(uh0Var, bVar, this.e, this.d, this.f, this.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0070  */
    @Override // xsna.ydl0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ydl0 ydl0Var, ydl0.b.AbstractC4094b.a aVar) {
        View view;
        bel0 bel0Var = this.a;
        y31.c cVar = bel0Var.e;
        vh0 vh0Var = (vh0) bel0Var.c;
        uh0 uh0Var = this.b;
        String str = (String) uh0Var.b;
        AdRequestPurpose adRequestPurpose = (AdRequestPurpose) uh0Var.a;
        vh0Var.getClass();
        AdRequestEvent.AdFormat adFormat = AdRequestEvent.AdFormat.BANNER;
        AdRequestEvent.RequestType requestType = vh0Var.b;
        AdRequestEvent.RequestSubtype e = vh0.e(adRequestPurpose);
        AdRequestEvent.EventType eventType = AdRequestEvent.EventType.LOAD;
        xh0 xh0Var = vh0Var.a;
        gel0 gel0Var = this.c;
        int i = gel0Var.a;
        xh0Var.a(new AdRequestEvent(adFormat, str, eventType, requestType, e, null, null, Integer.valueOf(gel0Var.d), Integer.valueOf(i), null, null));
        lel0 a = bel0Var.f.b.a(aVar);
        BannerAdUiData bannerAdUiData = this.e;
        if (a != null) {
            sdu0 sdu0Var = (sdu0) a;
            s36 a2 = sdu0Var.a(sdu0Var.a, this.d, bannerAdUiData, cVar.c());
            if (a2 != null) {
                view = ydl0Var.b(a2);
                if (view == null) {
                    cVar.a(view, bannerAdUiData, new zdl0(bel0Var, ydl0Var, uh0Var, bannerAdUiData));
                    return;
                }
                String a3 = lhg.a(i, "Unsupported sticky banner view type for slot: ");
                j11.a aVar2 = new j11.a(2006, a3, "Hasn't banners error");
                mo6.t(gel0Var, a3);
                ((r31) bel0Var.b).j(i, AdSlotSkipReason.NETWORK_ERROR);
                bel0Var.y(uh0Var, aVar2, this.e, this.d, this.f, this.g);
                return;
            }
        }
        view = null;
        if (view == null) {
        }
    }

    @Override // xsna.ydl0.a
    public final void onClick() {
        bel0 bel0Var = this.a;
        bel0Var.e.j(bel0Var.s(bel0Var.g), (String) this.b.b);
    }

    @Override // xsna.ydl0.a
    public final void onClose() {
        bel0 bel0Var = this.a;
        bel0Var.e.d(bel0Var.s(bel0Var.g), (String) this.b.b);
        mo6.a aVar = bel0Var.g;
        if (aVar != null) {
            aVar.a.a();
        }
        bel0Var.g = null;
    }
}
