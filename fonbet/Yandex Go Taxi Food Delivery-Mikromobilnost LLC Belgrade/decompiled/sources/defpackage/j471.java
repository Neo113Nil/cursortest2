package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.yandex.mobile.ads.banner.BannerAdView;
import java.util.Objects;
import yads.f5;
import yads.oa1;
import yads.qp1;
import yads.za2;

/* loaded from: classes7.dex */
public final class j471 extends fk81 implements an71 {
    public final BannerAdView P;
    public final Handler Q;
    public final e581 R;
    public boolean S;
    public final h3s0 T;
    public final BannerAdView U;
    public final mj31 V;
    public final dv81 W;
    public final ta71 Z;
    public final l171 a0;
    public final cr71 b0;
    public final kf81 c0;
    public final xm71 d0;
    public ct71 e0;
    public ct71 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j471(Context context, fe81 fe81Var, BannerAdView bannerAdView, mj31 mj31Var, e971 e971Var) {
        super(context, bannerAdView.getAdConfiguration$mobileads_internalRelease(), e971Var, bannerAdView.getSdkEnvironmentModule$mobileads_internalRelease());
        dv81 dv81Var = new dv81();
        ta71 ta71Var = new ta71();
        l171 l171Var = new l171(bannerAdView.getSdkEnvironmentModule$mobileads_internalRelease());
        cr71 cr71Var = new cr71(fe81Var);
        kf81 kf81Var = new kf81();
        xm71 xm71Var = new xm71();
        Handler handler = new Handler(Looper.getMainLooper());
        e581 e581Var = new e581(bannerAdView);
        this.P = bannerAdView;
        this.Q = handler;
        this.R = e581Var;
        this.S = true;
        this.T = new h3s0(18, this);
        bannerAdView.addVisibilityChangeListener(this);
        this.U = bannerAdView;
        this.V = mj31Var;
        this.W = dv81Var;
        this.Z = ta71Var;
        this.a0 = l171Var;
        this.b0 = cr71Var;
        this.c0 = kf81Var;
        this.d0 = xm71Var;
        bannerAdView.setHorizontalScrollBarEnabled(false);
        bannerAdView.setVerticalScrollBarEnabled(false);
        bannerAdView.setVisibility(8);
        bannerAdView.setBackgroundColor(0);
        ((xrr) mj31Var.c).A = cr71Var;
    }

    @Override // defpackage.fj81
    public final void a(Object obj) {
        hw71 nr41Var;
        d881 d881Var = (d881) obj;
        synchronized (this) {
            this.b.a(f5.t);
            this.N = d881Var;
        }
        this.b0.x = d881Var;
        l171 l171Var = this.a0;
        l171Var.getClass();
        qp1 qp1Var = d881Var.o;
        if (qp1Var != null) {
            nr41Var = new hn71(16, d881Var, qp1Var);
        } else {
            nr41Var = new nr41(6, l171Var.a);
        }
        ct71 d = nr41Var.d(this.a, this, this.O);
        this.f0 = d;
        d.a(this.a, d881Var);
    }

    @Override // defpackage.dj81
    public final void g() {
        super.g();
        this.P.removeVisibilityChangeListener(this);
        this.S = false;
        this.Q.removeCallbacks(this.T);
        mj31 mj31Var = this.V;
        mj31Var.w = null;
        ((xrr) mj31Var.c).e(null);
        Handler handler = this.d0.b;
        BannerAdView bannerAdView = this.U;
        handler.post(new myv0((ViewGroup) bannerAdView, true));
        bannerAdView.setVisibility(8);
        am81 am81Var = sj71.a;
        try {
            if (bannerAdView.getParent() instanceof ViewGroup) {
                ((ViewGroup) bannerAdView.getParent()).removeView(bannerAdView);
            }
        } catch (Exception unused) {
        }
        try {
            bannerAdView.removeAllViews();
        } catch (Exception unused2) {
        }
    }

    @Override // defpackage.dj81
    public final void h(dl61 dl61Var) {
        super.h(dl61Var);
        int i = dl61Var.a;
        if (5 == i || 2 == i) {
            return;
        }
        q();
    }

    @Override // defpackage.dj81
    public final void m() {
        super.m();
        q();
    }

    public final void p() {
        ct71[] ct71VarArr = {this.e0, this.f0};
        for (int i = 0; i < 2; i++) {
            ct71 ct71Var = ct71VarArr[i];
            if (ct71Var != null) {
                ct71Var.a(this.a);
            }
        }
        g();
        j471.class.toString();
    }

    public final void q() {
        Handler handler = this.Q;
        h3s0 h3s0Var = this.T;
        handler.removeCallbacks(h3s0Var);
        d881 d881Var = this.N;
        if (d881Var != null && d881Var.F && this.S && this.G.a()) {
            r581 r581Var = this.R.a;
            kgx kgxVar = e581.b[0];
            oa1 oa1Var = (oa1) r581Var.a.get();
            if (oa1Var == null || sj71.e(oa1Var)) {
                return;
            }
            handler.postDelayed(h3s0Var, d881Var.D);
        }
    }

    @Override // defpackage.dj81, defpackage.c071
    public final void a(za2 za2Var) {
        Objects.toString(za2Var);
        q();
    }
}
