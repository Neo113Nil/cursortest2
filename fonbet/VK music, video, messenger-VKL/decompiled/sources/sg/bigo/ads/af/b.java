package sg.bigo.ads.af;

import android.app.Activity;
import android.view.View;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.y;
import sg.bigo.ads.ae.e;
import sg.bigo.ads.an.i;
import sg.bigo.ads.common.utils.o;

/* loaded from: classes9.dex */
public final class b extends e implements sg.bigo.ads.s.b {
    private final sg.bigo.ads.s.a M;
    private o R;

    public b(@NonNull Activity activity, sg.bigo.ads.s.a aVar) {
        super(activity);
        this.M = aVar;
    }

    public static /* synthetic */ boolean d(b bVar) {
        bVar.f = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final boolean G() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void J() {
        super.J();
        o oVar = this.R;
        if (oVar != null) {
            oVar.b();
            this.R = null;
        }
        o oVar2 = this.y;
        if (oVar2 != null) {
            oVar2.b();
            this.y = null;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    public final void N() {
        long j = this.i.l * 1000;
        if (j >= 0) {
            if (j == 0) {
                j = 500;
            }
            o oVar = new o(j) { // from class: sg.bigo.ads.af.b.1
                @Override // sg.bigo.ads.common.utils.o
                public final void a() {
                    if (((y) b.this).J || b.this.f || b.this.M == null || b.this.M.e_()) {
                        return;
                    }
                    b.d(b.this);
                    b.this.M.d_();
                    ((t) b.this.A).K().a((i) null, 8, 22);
                }

                @Override // sg.bigo.ads.common.utils.o
                public final void a(long j2) {
                }
            };
            this.y = oVar;
            oVar.c();
        }
    }

    @Override // sg.bigo.ads.s.b
    public final void a(int i) {
        sg.bigo.ads.s.a aVar = this.M;
        if (aVar != null) {
            aVar.a(i, 2);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.i
    public final int ac() {
        int o = o();
        return (o == 1 || o == 2 || o == 3) ? R.layout.bigo_ad_activity_sub_interstitial_rich_video_1_3 : super.ac();
    }

    @Override // sg.bigo.ads.ad.interstitial.r
    public final ValueCallback<Double> ar() {
        return this.M.a();
    }

    @Override // sg.bigo.ads.ad.interstitial.y
    public final boolean au() {
        return this.i.l == -2;
    }

    @Override // sg.bigo.ads.s.b
    public final View b() {
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void h() {
        super.h();
        o oVar = this.R;
        if (oVar == null || !oVar.e()) {
            return;
        }
        this.R.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void j() {
        super.j();
        o oVar = this.R;
        if (oVar == null || oVar.e()) {
            return;
        }
        this.R.d();
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final boolean z() {
        return false;
    }

    @Override // sg.bigo.ads.s.b
    public final boolean a() {
        return f(true);
    }

    @Override // sg.bigo.ads.s.b
    public final void b(int i) {
        sg.bigo.ads.s.a aVar = this.M;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.i
    public final void h(int i) {
        super.h(i);
        if (this.i != null && this.F != null) {
            o oVar = new o(r6.c * 1000) { // from class: sg.bigo.ads.af.b.2
                @Override // sg.bigo.ads.common.utils.o
                public final void a() {
                    if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) b.this.E) || b.this.d() != 0) {
                        return;
                    }
                    b.this.a(0);
                    b.this.at();
                }

                @Override // sg.bigo.ads.common.utils.o
                public final void a(long j) {
                }
            };
            this.R = oVar;
            oVar.c();
        }
        b(0);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void n() {
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void p() {
    }
}
