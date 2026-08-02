package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import xsna.nak;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class dov0 implements izs {
    public final /* synthetic */ mov0 b;
    public final /* synthetic */ WebApiApplication c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ dov0(mov0 mov0Var, WebApiApplication webApiApplication, boolean z) {
        this.b = mov0Var;
        this.c = webApiApplication;
        this.d = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        return this.b.b(JsApiMethodType.SHOW_SUBSCRIPTION_BOX, this.c, ((nak.a) obj).b, this.d);
    }
}
