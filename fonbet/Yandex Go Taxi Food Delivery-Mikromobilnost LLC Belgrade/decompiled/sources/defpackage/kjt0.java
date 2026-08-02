package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.route.interactor.c;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.domain.s;
import ru.yandex.taxi.preorder.source.mode.interactor.e;

/* loaded from: classes6.dex */
public final class kjt0 {
    public final e a;
    public final c b;
    public final tit0 c;
    public final ru.yandex.taxi.e d;
    public final r e;
    public final s f;
    public final xvw g;

    public kjt0(e eVar, c cVar, tit0 tit0Var, ru.yandex.taxi.e eVar2, r rVar, s sVar, xvw xvwVar) {
        this.a = eVar;
        this.b = cVar;
        this.c = tit0Var;
        this.d = eVar2;
        this.e = rVar;
        this.f = sVar;
        this.g = xvwVar;
    }

    public final void a(Runnable runnable, boolean z, boolean z2) {
        Address g = this.b.g();
        zzs B = g != null ? g.B() : null;
        tit0 tit0Var = this.c;
        pv0 pv0Var = tit0Var.b;
        zzs zzsVar = pv0Var != null ? pv0Var.j : null;
        boolean z3 = tit0Var.c != null;
        xvw xvwVar = this.g;
        if (B == null || (!z && z3)) {
            if (zzsVar == null || !z3) {
                return;
            }
            xvwVar.c(zzsVar, runnable);
            return;
        }
        ru.yandex.taxi.e eVar = this.d;
        mo21 mo21Var = eVar.d;
        if (z2 && mo21Var != null && eVar.f()) {
            this.f.b(mo21Var, "auto", false, false);
        } else {
            xvwVar.c(B, runnable);
        }
    }

    public final void b(boolean z) {
        if (this.a.a.a().r()) {
            a(new m8t0(12, this), false, z);
        }
    }
}
