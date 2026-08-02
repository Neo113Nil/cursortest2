package defpackage;

import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.modal.WebContainerModalView;
import ru.yandex.taxi.web.view.WebViewContainerImpl;

/* loaded from: classes6.dex */
public final class gg41 extends m230 {
    public final w030 E;
    public final fva0 F;
    public final vf41 G;
    public final zf41 H;

    public gg41(w030 w030Var, fva0 fva0Var, vf41 vf41Var, zf41 zf41Var) {
        super(null);
        this.E = w030Var;
        this.F = fva0Var;
        this.G = vf41Var;
        this.H = zf41Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        dg41 dg41Var = (dg41) obj;
        String str = dg41Var.e;
        if (str == null) {
            str = "WebContainerView";
        }
        String str2 = str;
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Inflate;
        fva0 fva0Var = this.F;
        fva0.f(fva0Var, str2, performanceAnalytics$Type, 0L, 4);
        UiWebViewConfig uiWebViewConfig = dg41Var.a;
        el11 el11Var = new el11(19, this);
        bi41 bi41Var = dg41Var.b;
        dp41 dp41Var = dg41Var.c;
        em41 em41Var = dg41Var.f;
        to41 to41Var = dg41Var.g;
        ms41 ms41Var = dg41Var.h;
        an41 an41Var = this.G.a;
        jy31 jy31Var = new jy31(2, el11Var);
        WebViewContainerImpl c = id00.e(an41Var.a, uiWebViewConfig, bi41Var, dp41Var, to41Var, ms41Var).c();
        c.setOnCloseRequested(jy31Var);
        if (em41Var != null) {
            c.setWebViewClientFactory(em41Var);
        }
        WebContainerModalView webContainerModalView = new WebContainerModalView(uiWebViewConfig, c, el11Var, new fg41(this.H));
        fva0.c(fva0Var, webContainerModalView, str2, performanceAnalytics$Type, 8);
        s45 s45Var = dg41Var.d;
        if (s45Var != null) {
            webContainerModalView.setOnAppearingListener(s45Var);
        }
        return webContainerModalView;
    }
}
