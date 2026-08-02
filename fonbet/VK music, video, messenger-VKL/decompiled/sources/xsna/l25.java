package xsna;

import com.vk.metrics.eventtracking.Event;
import xsna.b25;

/* compiled from: AuthBridgeInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final class l25 implements b25.a {
    @Override // xsna.b25.a
    public final void d(tbu0 tbu0Var) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("onAuthStatusChanged");
        b.a(Boolean.valueOf(tbu0Var.b()), "isLoggedIn");
        bVar.k(b.e());
    }
}
