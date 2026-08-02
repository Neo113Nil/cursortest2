package defpackage;

import com.yandex.payment.divkit.select.h;
import com.yandex.payment.divkit.usecases.a;
import com.yandex.payment.divkit.usecases.b;
import com.yandex.payment.divkit.usecases.i;
import com.yandex.payment.divkit.usecases.l;
import com.yandex.payment.divkit.usecases.m;
import com.yandex.payment.divkit.usecases.n;
import com.yandex.payment.divkit.usecases.p;
import com.yandex.payment.divkit.usecases.q;
import com.yandex.payment.divkit.usecases.r;
import com.yandex.payment.divkit.usecases.s;

/* loaded from: classes2.dex */
public final class mvf implements hs31 {
    public final b A;
    public final tpr B;
    public final boolean C;
    public final i D;
    public final q E;
    public final nsi0 F;
    public final r G;
    public final s H;
    public final n I;
    public final p J;
    public final coq0 K;
    public final l a;
    public final rwo b;
    public final abe c;
    public final aq80 w;
    public final vv90 x;
    public final a y;
    public final m z;

    public mvf(l lVar, rwo rwoVar, abe abeVar, aq80 aq80Var, vv90 vv90Var, a aVar, m mVar, b bVar, tpr tprVar, boolean z, i iVar, q qVar, nsi0 nsi0Var, r rVar, s sVar, n nVar, p pVar, coq0 coq0Var) {
        this.a = lVar;
        this.b = rwoVar;
        this.c = abeVar;
        this.w = aq80Var;
        this.x = vv90Var;
        this.y = aVar;
        this.z = mVar;
        this.A = bVar;
        this.B = tprVar;
        this.C = z;
        this.D = iVar;
        this.E = qVar;
        this.F = nsi0Var;
        this.G = rVar;
        this.H = sVar;
        this.I = nVar;
        this.J = pVar;
        this.K = coq0Var;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        boolean z = this.C;
        tpr tprVar = this.B;
        b bVar = this.A;
        l lVar = this.a;
        a aVar = this.y;
        aq80 aq80Var = this.w;
        rwo rwoVar = this.b;
        vv90 vv90Var = this.x;
        if (!z) {
            return new h(lVar, rwoVar, this.c, aq80Var, vv90Var, aVar, this.z, bVar, tprVar);
        }
        return new com.yandex.payment.divkit.select.n(vv90Var, rwoVar, this.D, this.K, this.F, this.G, this.H, aq80Var, this.E, aVar, this.I, this.J, lVar, bVar, tprVar);
    }
}
