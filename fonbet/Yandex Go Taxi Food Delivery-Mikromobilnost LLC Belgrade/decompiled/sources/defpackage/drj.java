package defpackage;

import android.content.Context;
import com.yandex.go.mainscreen.superapp.impl.foundation.domain.g;
import com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.d;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class drj extends ad5 {
    public final j0g A;
    public final vpj B;
    public final d C;
    public final c4r0 D;
    public final oy80 E;
    public final sno0 F;
    public final g G;
    public final krj H;
    public final wlf0 I;
    public final List J;
    public final cmf0 K;
    public final qnh L;
    public final r0 M;
    public final Context x;
    public final tse y;
    public final k3c z;

    public drj(Context context, tse tseVar, k3c k3cVar, j0g j0gVar, vpj vpjVar, d dVar, c4r0 c4r0Var, oy80 oy80Var, sno0 sno0Var, g gVar, krj krjVar, wlf0 wlf0Var, List list, cmf0 cmf0Var, qnh qnhVar) {
        super(arj.class);
        this.x = context;
        this.y = tseVar;
        this.z = k3cVar;
        this.A = j0gVar;
        this.B = vpjVar;
        this.C = dVar;
        this.D = c4r0Var;
        this.E = oy80Var;
        this.F = sno0Var;
        this.G = gVar;
        this.H = krjVar;
        this.I = wlf0Var;
        this.J = list;
        this.K = cmf0Var;
        this.L = qnhVar;
        this.M = bvf0.c(Boolean.FALSE);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        this.A.z("Dismiss", this.I, null);
        super.Cg();
    }
}
