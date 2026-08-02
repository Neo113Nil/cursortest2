package xsna;

import com.vk.log.L;

/* compiled from: VoipMiniAppCallManagerImpl.kt */
/* loaded from: classes11.dex */
public final class wsw0 implements usw0 {
    public final bpn0 a;

    public wsw0(bpn0 bpn0Var) {
        this.a = bpn0Var;
    }

    @Override // xsna.usw0
    public final void a(long j, String str, xa4 xa4Var) {
        vsw0 vsw0Var = new vsw0(j, str, xa4Var);
        io.reactivex.rxjava3.kotlin.c.d(((fhw0) this.a.getValue()).a().o(asu0.a.d()), new fcs0(vsw0Var, 10), new wi3(L.a, 14));
    }

    @Override // xsna.usw0
    public final boolean b(long j) {
        zqk0 g0;
        Long h;
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        cVar.getClass();
        return com.vk.voip.ui.c.K0.h() && (g0 = cVar.g0()) != null && (h = g0.h()) != null && h.longValue() == j;
    }
}
