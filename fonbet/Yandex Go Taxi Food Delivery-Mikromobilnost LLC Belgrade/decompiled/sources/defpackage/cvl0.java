package defpackage;

import android.net.Uri;
import com.yandex.go.safety.center.instructions.web.SafetyCenterWebInstructionsView;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.view.WebViewContainerImpl;

/* loaded from: classes13.dex */
public final class cvl0 extends n95 {
    public final String F;
    public final zul0 G;
    public final xul0 H;
    public final ah41 I;
    public final zm41 J;
    public final w030 K;
    public final boolean L = true;

    public cvl0(String str, zul0 zul0Var, xul0 xul0Var, ah41 ah41Var, zm41 zm41Var, w030 w030Var) {
        this.F = str;
        this.G = zul0Var;
        this.H = xul0Var;
        this.I = ah41Var;
        this.J = zm41Var;
        this.K = w030Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.K;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.L;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        ah41 ah41Var = this.I;
        yu41 yu41Var = ah41Var.b;
        yu41Var.getClass();
        xu41 xu41Var = new xu41(yu41Var, this.F);
        xu41Var.b();
        xu41Var.c("order_id");
        Uri.Builder a = xu41Var.a();
        String b = ah41Var.a.b();
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.b = a.build().toString();
        aVar.e = false;
        aVar.c = b;
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig.setHasTitleFromWeb(true);
        uiWebViewConfig.setShouldUseCached(false);
        WebViewContainerImpl c = id00.e(this.J, uiWebViewConfig, bi41.D4, dp41.a, to41.a, ms41.a).c();
        ndl0 ndl0Var = new ndl0(5, this);
        this.G.a.getClass();
        yul0 yul0Var = new yul0(ndl0Var);
        this.H.a.getClass();
        return new SafetyCenterWebInstructionsView(c, yul0Var);
    }
}
