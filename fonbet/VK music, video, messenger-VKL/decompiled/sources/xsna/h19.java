package xsna;

import com.vk.voip.api.di.VoipCallComponent;
import xsna.bnw0;

/* compiled from: CallApiDomainConfigurationImpl.kt */
/* loaded from: classes7.dex */
public final class h19 implements g19 {
    public final sg20 a;
    public final qd9 b;
    public final c2p0 c;

    public h19(sg20 sg20Var, qd9 qd9Var, bpc0 bpc0Var, bnw0.a aVar) {
        this.a = sg20Var;
        this.b = qd9Var;
        this.c = new c2p0(sg20Var, qd9Var, bpc0Var, aVar, new t5(this, 13));
    }

    @Override // xsna.g19
    public final String a() {
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        cVar.getClass();
        return ((VoipCallComponent) ((k7m) m7m.f(cVar)).a(fpf0.a(VoipCallComponent.class))).getConfiguration().a();
    }

    public final c2p0 b() {
        return this.c;
    }
}
