package xsna;

import xsna.n1y;

/* compiled from: JsAdsDelegateFactoryImpl.kt */
/* loaded from: classes6.dex */
public final class g1y implements com.vk.superapp.ads.js.bridge.api.di.d {
    public final n1y.a a;

    public g1y(n1y.a aVar) {
        this.a = aVar;
    }

    @Override // com.vk.superapp.ads.js.bridge.api.di.d
    public final f1y a(fvv0 fvv0Var, com.vk.superapp.base.js.bridge.b bVar, tbg tbgVar) {
        return new n1y(fvv0Var, bVar, tbgVar, this.a);
    }
}
