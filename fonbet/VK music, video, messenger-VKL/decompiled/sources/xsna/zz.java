package xsna;

import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.bridges.dto.analytics.DialogActionClick;
import xsna.aex0;

/* compiled from: ActionController.kt */
/* loaded from: classes6.dex */
public final class zz implements aex0.d {
    public final /* synthetic */ com.vk.superapp.browser.internal.ui.shortcats.a a;

    public zz(com.vk.superapp.browser.internal.ui.shortcats.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.aex0.d
    public final void a() {
        fvv0 fvv0Var = this.a.b;
        udx0 udx0Var = e370.i;
        if (udx0Var == null) {
            udx0Var = null;
        }
        udx0Var.b(fvv0Var.getAppId(), DialogActionClick.RECOMMENDATION_MODAL_RECOMMEND);
        VkUiView.a.a(fvv0Var.getView(), fvv0Var.getAppId(), true, null, null, true, 44);
    }

    @Override // xsna.aex0.d
    public final void b() {
        udx0 udx0Var = e370.i;
        if (udx0Var == null) {
            udx0Var = null;
        }
        udx0Var.b(this.a.b.getAppId(), DialogActionClick.RECOMMENDATION_MODAL_CANCEL);
    }

    @Override // xsna.aex0.d
    public final void onCancel() {
        b();
    }
}
