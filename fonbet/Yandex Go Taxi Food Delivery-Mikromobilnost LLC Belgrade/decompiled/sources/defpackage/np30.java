package defpackage;

import android.content.Context;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_auth_onboarding.MtMosMetroAuthOnboardingLifecycleInteractor$onAttach$$inlined$safeCollectIn$1;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_auth_onboarding.b;

/* loaded from: classes12.dex */
public final class np30 extends pgd {
    public final Context F;
    public final w030 G;
    public final kp30 H;
    public final b I;
    public final zgf J;
    public final lp30 K;
    public final z830 L;
    public final boj0 M;
    public final uk10 N;
    public final mu5 O;

    public np30(Context context, w030 w030Var, kp30 kp30Var, b bVar, zgf zgfVar, lp30 lp30Var, z830 z830Var, boj0 boj0Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = kp30Var;
        this.I = bVar;
        this.J = zgfVar;
        this.K = lp30Var;
        this.L = z830Var;
        this.M = boj0Var;
        this.N = new uk10(this);
        this.O = new mu5(new ft20(21, this));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        super.G((zy11) obj);
        tse o = o();
        this.K.getClass();
        a930 a930Var = (a930) this.L;
        tje.N(o, null, null, new MtMosMetroAuthOnboardingLifecycleInteractor$onAttach$$inlined$safeCollectIn$1(new ru.yandex.taxi.masstransit.geopayment.experiment.external_auth.b(new g92(2, a930Var.a.b()), a930Var), null, this.H, this.I, this.N), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.O;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
