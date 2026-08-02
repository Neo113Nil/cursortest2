package defpackage;

import ru.yandex.taxi.am.AuthStateRepository;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.l;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

/* loaded from: classes9.dex */
public final class jj3 {
    public final g a;
    public final l b;

    public jj3(g gVar, l lVar) {
        this.a = gVar;
        this.b = lVar;
    }

    public final void a(um3 um3Var, boolean z) {
        l lVar = this.b;
        lVar.h.a.l(AuthStateRepository.AuthState.IN_PROGRESS);
        if (!lVar.a.s) {
            lVar.a(um3Var);
            return;
        }
        lVar.g.a("Auth Passport: authorization wait for auto login to complete");
        lVar.a.r = new tis0(um3Var, lVar, z, 3);
    }

    public void b(nk3 nk3Var, Events$Zalogin$LoginContext events$Zalogin$LoginContext) {
        c(new um3(events$Zalogin$LoginContext, nk3Var, false, false, 28));
    }

    public final void c(um3 um3Var) {
        g gVar = this.a;
        if (gVar.f() && gVar.g()) {
            um3Var.b.onSuccess();
        } else {
            a(um3Var, true);
        }
    }
}
