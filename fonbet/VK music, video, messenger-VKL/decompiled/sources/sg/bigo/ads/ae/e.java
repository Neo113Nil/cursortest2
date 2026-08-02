package sg.bigo.ads.ae;

import android.app.Activity;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ad.interstitial.y;
import sg.bigo.ads.an.i;

/* loaded from: classes9.dex */
public class e extends y {

    @Nullable
    protected h K;
    protected boolean L;
    private boolean M;

    public e(@NonNull Activity activity) {
        super(activity);
        this.M = true;
        this.L = false;
    }

    public static /* synthetic */ boolean g(e eVar) {
        eVar.f = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    public final void D() {
        super.D();
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(this.M);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    public final void E() {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton == null) {
            return;
        }
        if (adCountDownButton.getVisibility() != 0) {
            this.C.setVisibility(0);
            sg.bigo.ads.ad.interstitial.c.b((View) this.C);
        }
        if (d() == 0) {
            int i = this.i.c;
            if (i < 0) {
                i = 15;
            }
            this.C.a(i, new AdCountDownButton.b() { // from class: sg.bigo.ads.ae.e.1
                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.b
                public final void a() {
                    sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.ae.e.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (e.this.C != null) {
                                e.this.C.e();
                            }
                            e eVar = e.this;
                            h hVar = eVar.K;
                            if (hVar == null || eVar.L) {
                                sg.bigo.ads.bn.a.a(2, "", "Failed to claim reward because of null RewardVideoAd.");
                            } else {
                                eVar.L = true;
                                hVar.P();
                            }
                            if (e.this.s != null) {
                                e.this.s.y.a(null);
                            }
                            if (e.this.i.k != 3 || e.this.f) {
                                return;
                            }
                            e.g(e.this);
                            ((t) e.this.A).K().a((i) null, 8, 22);
                        }
                    });
                }
            });
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public final void I() {
        this.f = true;
        if (M()) {
            L();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.cl.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void X() {
        super.X();
        T t = this.A;
        if (t == 0) {
            return;
        }
        if (t instanceof h) {
            this.K = (h) t;
        }
        if (this.K == null) {
            a("Illegal static content.");
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.cl.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ak() {
        if (this.M && d() == 0) {
            d(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.r
    public final int am() {
        return ((sg.bigo.ads.ad.interstitial.a) this).b.a("interstitial_video_style.video_play_page.icon_strategy") == 2 ? 2 : 1;
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    @NonNull
    public x c() {
        x c = super.c();
        if (!this.M) {
            c.b = 0;
            c.c = -1;
        }
        return c;
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    public final boolean f(boolean z) {
        if (this.q.get() && !this.L) {
            AdCountDownButton adCountDownButton = this.C;
            if (adCountDownButton != null) {
                adCountDownButton.e();
            }
            h hVar = this.K;
            if (hVar != null) {
                this.L = true;
                hVar.P();
            }
        }
        return super.f(z);
    }
}
