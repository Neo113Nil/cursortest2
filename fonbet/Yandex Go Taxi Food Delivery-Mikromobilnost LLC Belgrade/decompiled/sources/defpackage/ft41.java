package defpackage;

import android.view.ViewGroup;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.modal.WebContainerModalView;

/* loaded from: classes6.dex */
public final class ft41 extends h55 implements dt41 {
    public final zis D;
    public final zm41 E;
    public WebContainerModalView F;

    public ft41(zis zisVar, zm41 zm41Var) {
        super(null);
        this.D = zisVar;
        this.E = zm41Var;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        this.F = Q((UiWebViewConfig) obj);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        WebContainerModalView webContainerModalView = this.F;
        if (webContainerModalView != null) {
            webContainerModalView.dismiss();
            this.F = null;
        }
    }

    public final void P(UiWebViewConfig uiWebViewConfig) {
        Q(uiWebViewConfig);
    }

    public final WebContainerModalView Q(UiWebViewConfig uiWebViewConfig) {
        uf41 uf41Var = null;
        fg41 fg41Var = null;
        WebContainerModalView webContainerModalView = new WebContainerModalView(uiWebViewConfig, id00.e(this.E, uiWebViewConfig, bi41.D4, dp41.a, to41.a, ms41.a).c(), uf41Var, fg41Var, 8, null);
        webContainerModalView.setOnAppearingListener(new sc(13, this));
        ((ViewGroup) this.D.b.getValue()).addView(webContainerModalView);
        return webContainerModalView;
    }
}
