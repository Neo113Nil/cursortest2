package sg.bigo.ads.ad;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.f;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.ad.interstitial.y;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.utils.o;
import sg.bigo.ads.k.x;

/* loaded from: classes9.dex */
public class g extends y implements f.a {
    private x K;

    public g(@NonNull Activity activity) {
        super(activity);
        activity.overridePendingTransition(0, 0);
    }

    private x av() {
        if (this.K == null) {
            this.K = sg.bigo.ads.k.a.a(this.E, ((sg.bigo.ads.ad.interstitial.a) this).c, o());
        }
        return this.K;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean Y() {
        return true;
    }

    @Override // sg.bigo.ads.ad.f.a
    public final void a() {
        e(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.i
    public final int ac() {
        int o = o();
        return o != 2 ? o != 3 ? o != 4 ? o != 5 ? o != 6 ? R.layout.bigo_ad_activity_pop_up_style_1 : R.layout.bigo_ad_activity_pop_up_style_6 : R.layout.bigo_ad_activity_pop_up_style_5 : R.layout.bigo_ad_activity_pop_up_style_4 : R.layout.bigo_ad_activity_pop_up_style_3 : R.layout.bigo_ad_activity_pop_up_style_2;
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.cl.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void al() {
        super.al();
        this.N.overridePendingTransition(0, 0);
    }

    @Override // sg.bigo.ads.ad.interstitial.y
    public final void as() {
        MediaView mediaView;
        ViewGroup viewGroup = this.F;
        if (viewGroup == null || (mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media)) == null) {
            return;
        }
        if (!((y) this).I) {
            mediaView.setMediaAreaClickable(false);
        }
        av().a((ViewGroup) mediaView);
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    public final boolean f(boolean z) {
        b(true);
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void g(int i) {
        super.g(i);
        if (this.F == null) {
            return;
        }
        q qVar = this.s;
        if (qVar != null) {
            qVar.i = false;
        }
        av().g(this.F);
        av().h(this.F);
        av().d(this.F);
        av().a(q(R.id.inter_container), this.F.findViewById(R.id.media_layout));
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void h() {
        super.h();
        if (this.C == null) {
            av().q();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void j() {
        super.j();
        if (this.C == null) {
            av().p();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.y
    public final void l(int i) {
        av();
        x.a(this.F, this.m);
        o e = av().e(this.F);
        this.w = e;
        if (e == null) {
            av().f(this.F);
        } else {
            e.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void u() {
        av().a(this.C, this.F, this);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void a(@NonNull ViewGroup viewGroup) {
        av().c(viewGroup);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void a(boolean z) {
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void A() {
    }
}
