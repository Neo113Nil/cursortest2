package sg.bigo.ads.ad;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.banner.c;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.m;
import sg.bigo.ads.ad.interstitial.o;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes9.dex */
public class b extends m implements c.a {
    public b(@NonNull Activity activity) {
        super(activity);
        activity.overridePendingTransition(0, 0);
    }

    @Override // sg.bigo.ads.ad.interstitial.m, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void J() {
        super.J();
        ((o) this.A).C.q = null;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean Y() {
        return true;
    }

    @Override // sg.bigo.ads.ad.banner.c.a
    public final void a(int i, int i2) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = sg.bigo.ads.common.utils.f.a(this.N, 10) + i;
        int measuredWidth = this.C.getMeasuredWidth();
        int min = Math.min(Math.max((i2 - measuredWidth) - sg.bigo.ads.common.utils.f.a(this.N, 10), 0), (this.N.getResources().getDisplayMetrics().widthPixels - sg.bigo.ads.common.utils.f.a(this.N, 80)) - measuredWidth);
        layoutParams.leftMargin = min;
        layoutParams.setMarginStart(min);
        this.C.setLayoutParams(layoutParams);
    }

    @Override // sg.bigo.ads.ad.interstitial.m, sg.bigo.ads.ad.interstitial.i
    public final int ac() {
        return R.layout.bigo_ad_activity_popup_banner;
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.cl.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void al() {
        super.al();
        this.N.overridePendingTransition(0, 0);
    }

    @Override // sg.bigo.ads.ad.interstitial.m, sg.bigo.ads.ad.interstitial.i
    public final void g(int i) {
        super.g(i);
        T t = this.A;
        if (t != 0) {
            ((o) t).C.q = this;
            AdCountDownButton adCountDownButton = this.C;
            if (adCountDownButton != null) {
                adCountDownButton.setShowCloseButtonInCountdown(false);
                this.C.setTakeoverTickEvent(false);
                this.C.a(((o) this.A).D(), (AdCountDownButton.b) null);
            }
        }
        final View q = q(R.id.inter_container);
        final View q2 = q(R.id.inter_banner_container);
        v.a(q, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.b.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                sg.bigo.ads.bv.b.a(sg.bigo.ads.common.utils.b.a(2), q);
                sg.bigo.ads.common.utils.b.a(q2);
            }
        });
    }
}
