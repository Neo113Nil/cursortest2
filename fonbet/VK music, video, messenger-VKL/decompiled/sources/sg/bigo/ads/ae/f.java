package sg.bigo.ads.ae;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.x;

/* loaded from: classes9.dex */
public class f extends sg.bigo.ads.x.a {

    @Nullable
    protected h c;
    private boolean d;
    private boolean e;

    public f(@NonNull Activity activity) {
        super(activity);
        this.d = true;
        this.e = false;
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.cl.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void X() {
        super.X();
        T t = this.A;
        if (t == 0) {
            return;
        }
        if (t instanceof h) {
            this.c = (h) t;
        }
        if (this.c == null || !aq()) {
            a("Illegal VPAID content.");
        }
    }

    @Override // sg.bigo.ads.x.a
    public final void a() {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(false);
        }
        super.a();
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.cl.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ak() {
        if (this.d) {
            d(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.r
    public final int am() {
        return 2;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void d(boolean z) {
        if (this.C.getVisibility() == 0) {
            AdCountDownButton adCountDownButton = this.C;
            if (adCountDownButton.c) {
                if (!this.e) {
                    adCountDownButton.e();
                    h hVar = this.c;
                    if (hVar != null) {
                        this.e = true;
                        hVar.P();
                    }
                }
                super.d(true);
            }
        }
    }

    @Override // sg.bigo.ads.x.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void m() {
        super.m();
        x xVar = ((sg.bigo.ads.x.a) this).a;
        if (xVar != null) {
            xVar.c = 15;
            xVar.f = true;
            xVar.g = false;
        }
    }
}
