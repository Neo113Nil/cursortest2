package xsna;

import com.vk.superapp.base.js.bridge.VkUiView;
import xsna.txv0;

/* compiled from: VkPayPresenter.kt */
/* loaded from: classes6.dex */
public final class ybv0 extends wwv0 implements txv0.a {
    public final txv0 t;

    public ybv0(txv0 txv0Var, tvv0 tvv0Var, com.vk.superapp.navigation.api.di.c cVar) {
        super(txv0Var, tvv0Var, cVar);
        this.t = txv0Var;
    }

    @Override // xsna.txv0.a
    public final void A() {
        this.t.Am(new srq0(this, 12));
    }

    @Override // xsna.wwv0, xsna.xwv0
    public final VkUiView getView() {
        return this.t;
    }

    @Override // xsna.txv0.a
    public final void y1(String str) {
        this.t.y1(str);
    }

    @Override // xsna.wwv0, xsna.fvv0, xsna.xwv0
    public final gvv0 getView() {
        return this.t;
    }

    @Override // xsna.wwv0, xsna.xwv0
    public final txv0 getView() {
        return this.t;
    }
}
