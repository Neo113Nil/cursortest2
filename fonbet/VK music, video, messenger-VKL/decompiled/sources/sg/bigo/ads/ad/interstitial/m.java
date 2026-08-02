package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* loaded from: classes9.dex */
public class m extends i<o> {
    public sg.bigo.ads.common.utils.o a;
    private RelativeLayout b;

    public m(@NonNull Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void J() {
        super.J();
        RelativeLayout relativeLayout = this.b;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        sg.bigo.ads.common.utils.o oVar = this.a;
        if (oVar != null) {
            oVar.b();
            this.a = null;
        }
    }

    public void a() {
        n I;
        T t = this.A;
        if (t == 0 || (I = ((o) t).I()) == null) {
            return;
        }
        int max = Math.max(I.b, 0);
        this.C.setTakeoverTickEvent(true);
        this.C.a(max, (AdCountDownButton.b) null);
        sg.bigo.ads.common.utils.o oVar = new sg.bigo.ads.common.utils.o(sg.bigo.ads.common.utils.s.a.a(Math.max(I.e, 0))) { // from class: sg.bigo.ads.ad.interstitial.m.2
            @Override // sg.bigo.ads.common.utils.o
            public final void a() {
                AdCountDownButton adCountDownButton = m.this.C;
                if (adCountDownButton != null) {
                    adCountDownButton.e();
                    m.this.C.setTakeoverTickEvent(false);
                }
            }

            @Override // sg.bigo.ads.common.utils.o
            public final void a(long j) {
                AdCountDownButton adCountDownButton = m.this.C;
                if (adCountDownButton != null) {
                    adCountDownButton.a(j);
                }
            }
        };
        this.a = oVar;
        oVar.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public int ac() {
        return R.layout.bigo_ad_activity_interstitial_banner;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean ad() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public void g(int i) {
        T t = this.A;
        if (t == 0) {
            a("Illegal InterstitialAd.");
            return;
        }
        sg.bigo.ads.ax.b bVar = this.P;
        sg.bigo.ads.ad.banner.c<o> cVar = ((o) t).C;
        if (cVar != null) {
            cVar.w = bVar;
        }
        ((o) t).D = new sg.bigo.ads.ad.banner.h() { // from class: sg.bigo.ads.ad.interstitial.m.1
            @Override // sg.bigo.ads.ad.banner.h
            public final void a() {
                m.this.d(true);
            }

            @Override // sg.bigo.ads.ad.banner.h
            public final void a(sg.bigo.ads.an.i iVar, sg.bigo.ads.api.core.e eVar) {
            }

            @Override // sg.bigo.ads.ad.banner.h
            public final void b() {
            }

            @Override // sg.bigo.ads.ad.banner.h
            public final void c() {
            }
        };
        this.b = (RelativeLayout) this.B.findViewById(R.id.inter_banner_container);
        ((o) this.A).a(this.C, q(R.id.click_proxy));
        o oVar = (o) this.A;
        if (!sg.bigo.ads.bh.d.b()) {
            sg.bigo.ads.common.utils.u.a("adView() must run on UI thread");
        }
        View c = oVar.C.c();
        oVar.a(c, false);
        if (c != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            sg.bigo.ads.common.utils.v.a(c, this.b, layoutParams, 0);
        }
        Activity activity = this.N;
        sg.bigo.ads.ad.banner.c<o> cVar2 = ((o) this.A).C;
        sg.bigo.ads.common.view.c.a(activity, null, cVar2 != null ? cVar2.v : null);
        a();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void h() {
        super.h();
        sg.bigo.ads.common.utils.o oVar = this.a;
        if (oVar == null || !oVar.e()) {
            return;
        }
        this.a.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void j() {
        super.j();
        sg.bigo.ads.common.utils.o oVar = this.a;
        if (oVar != null) {
            oVar.d();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void m() {
    }
}
