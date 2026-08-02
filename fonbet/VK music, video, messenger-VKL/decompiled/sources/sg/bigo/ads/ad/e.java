package sg.bigo.ads.ad;

import android.content.Context;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.api.popup.PopupAd;

/* loaded from: classes9.dex */
public final class e extends t implements PopupAd {
    public e(@NonNull sg.bigo.ads.api.core.g gVar) {
        super(gVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.t, sg.bigo.ads.ad.interstitial.k
    public final Class<? extends sg.bigo.ads.cl.b<?>> G() {
        return E() ? M() ? sg.bigo.ads.x.b.class : h.class : g.class;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final void a(Context context) {
        if (sg.bigo.ads.controller.landing.d.a(context, G(), this)) {
            return;
        }
        a(2004, "This ad cannot be open");
    }
}
