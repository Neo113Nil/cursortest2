package sg.bigo.ads.ae;

import android.app.Activity;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.p;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ad.interstitial.z;
import sg.bigo.ads.ae.c;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.k.n;

/* loaded from: classes9.dex */
public class g extends z {

    @Nullable
    protected h K;
    protected boolean L;
    private boolean M;
    private boolean R;
    private boolean S;

    public g(@NonNull Activity activity) {
        super(activity);
        this.M = true;
        this.L = false;
        this.R = false;
        this.S = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aO() {
        if (this.K != null && !this.L && !U()) {
            this.L = true;
            this.K.P();
        } else if (this.K == null) {
            sg.bigo.ads.bn.a.a(2, "", "Failed to claim reward because of null RewardVideoAd.");
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a
    public final void D() {
        super.D();
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(this.M);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public final void I() {
        this.f = true;
        if (M()) {
            L();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.cl.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void X() {
        AdCountDownButton adCountDownButton;
        super.X();
        T t = this.A;
        if (t == 0) {
            return;
        }
        if (t instanceof h) {
            this.K = (h) t;
        }
        if (this.K == null || !ap()) {
            a("Illegal video content.");
        }
        if (d() == 0) {
            o oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
            if ((oVar != null ? oVar.a("video_play_page.rw_timing") : 0) == 0 || (adCountDownButton = this.C) == null) {
                return;
            }
            adCountDownButton.e();
            if (this.C.getVisibility() != 0) {
                this.C.setVisibility(0);
                sg.bigo.ads.ad.interstitial.c.b((View) this.C);
            }
            if (d() == 0) {
                h hVar = this.K;
                int D = hVar != null ? hVar.D() : 0;
                int i = this.i.c;
                if (i >= 0) {
                    D = Math.max(0, Math.min(D, i));
                }
                this.C.setTakeoverTickEvent(false);
                this.C.a(D, new AdCountDownButton.b() { // from class: sg.bigo.ads.ae.g.1
                    @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.b
                    public final void a() {
                        g.this.aO();
                    }
                });
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.cl.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ak() {
        if (this.M && d() == 0) {
            d(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.r
    public final int am() {
        int i = ((sg.bigo.ads.ad.interstitial.a) this).b.a("interstitial_video_style.video_play_page.icon_strategy") != 2 ? 1 : 2;
        if (this.q.get()) {
            return 3;
        }
        return i;
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final void at() {
        super.at();
        p pVar = this.t;
        if (pVar != null) {
            pVar.p = this;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final void n(int i) {
        super.n(i);
        if (this.S) {
            return;
        }
        aO();
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void w() {
        super.w();
        sg.bigo.ads.cp.a f = ((t) this.A).f();
        if (!this.q.get() || f.bq() == null || this.M) {
            return;
        }
        x xVar = this.i;
        xVar.b = 0;
        xVar.c = 15;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public final void b(String str) {
        this.R = true;
        super.b(str);
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a
    public final boolean f(boolean z) {
        if (U()) {
            return super.f(z);
        }
        if (this.q.get()) {
            AdCountDownButton adCountDownButton = this.C;
            if (adCountDownButton != null) {
                adCountDownButton.e();
            }
        } else if (!this.L && this.M && aE() && !this.S) {
            final VideoController ao = ao();
            new c(this.N).a(new c.a() { // from class: sg.bigo.ads.ae.g.2
                private int c = -1;
                private boolean d = false;
                private boolean e = false;

                private void e() {
                    if (g.this.d() == 3) {
                        g.this.f(this.c);
                    }
                }

                @Override // sg.bigo.ads.ae.c.a
                public final void a() {
                    g.this.S = false;
                    this.c = g.this.d();
                    g.this.f(3);
                    VideoController videoController = ao;
                    if (videoController != null && videoController.isPlaying()) {
                        ao.pause();
                        this.d = true;
                    }
                    h hVar = g.this.K;
                    if (hVar != null) {
                        sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) hVar.f(), g.this.d(), 2);
                    }
                    g.this.an().c();
                    ((z) g.this).I.b(false);
                }

                @Override // sg.bigo.ads.ae.c.a
                public final void b() {
                    VideoController videoController;
                    e();
                    if (!this.e && this.d && (videoController = ao) != null && videoController.isPaused()) {
                        ao.play();
                    }
                    g.this.an().b();
                    ((z) g.this).I.a(false);
                }

                @Override // sg.bigo.ads.ae.c.a
                public final void c() {
                    this.e = true;
                    g.this.S = true;
                    if (g.this.R() || g.this.S()) {
                        g.this.af();
                    } else if (g.this.s != null && g.this.s.y.a()) {
                        e();
                    } else if (g.this.e || ((sg.bigo.ads.ad.interstitial.a) g.this).b.a("interstitial_video_style.video_play_page.skip_type") == 2) {
                        e();
                        g.this.m(6);
                    } else {
                        g.this.af();
                    }
                    sg.bigo.ads.i.a aVar = ((z) g.this).I;
                    sg.bigo.ads.common.utils.o oVar = aVar.f;
                    if (oVar != null) {
                        oVar.b();
                    }
                    aVar.g = null;
                }

                @Override // sg.bigo.ads.ae.c.a
                public final void d() {
                    u an = g.this.an();
                    if (an instanceof n) {
                        ((n) an).A();
                    }
                }
            });
            return false;
        }
        boolean f = super.f(z);
        if (f && (this.q.get() || this.R)) {
            aO();
        }
        return f;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.api.VideoController.a
    public final void i(boolean z) {
        AdCountDownButton adCountDownButton;
        super.i(z);
        if (z || d() != 0 || this.M || (adCountDownButton = this.C) == null) {
            return;
        }
        adCountDownButton.setTakeoverTickEvent(false);
        this.C.a(15, (AdCountDownButton.b) null);
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void m() {
        boolean z;
        super.m();
        if (((sg.bigo.ads.ad.interstitial.a) this).c != null) {
            p pVar = this.t;
            z = this.M & (((sg.bigo.ads.ad.interstitial.a) this).c.a((pVar == null || !pVar.a()) ? "video_play_page.force_staying_time" : "play_page.force_staying_time") != -1);
        } else {
            z = this.M & (((sg.bigo.ads.ad.interstitial.a) this).b.a("interstitial_video_style.style") != 2);
        }
        this.M = z;
        if (this.M) {
            return;
        }
        x xVar = this.i;
        xVar.b = 0;
        xVar.c = -1;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.i.a.InterfaceC2488a
    public final void a(boolean z, boolean z2) {
        super.a(z, z2);
        if (z || z2) {
            AdCountDownButton adCountDownButton = this.C;
            if (adCountDownButton != null) {
                adCountDownButton.e();
            }
            aO();
        }
    }
}
