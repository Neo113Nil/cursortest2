package defpackage;

import com.yandex.go.scooters.passes.data.b;
import com.yandex.go.scooters.passes.domain.g;
import com.yandex.go.scooters.passes.domain.i;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import com.yandex.go.scooters.payments.domain.a;

/* loaded from: classes13.dex */
public final class n7o0 extends ad5 {
    public final i A;
    public final a B;
    public final g C;
    public final ufo0 D;
    public final String E;
    public final String F;
    public final qco0 G;
    public final ScootersPassesFromScreen H;
    public final cao0 I;
    public final qxm0 x;
    public final po21 y;
    public final com.yandex.go.scooters.passes.v2.domain.a z;

    public n7o0(qxm0 qxm0Var, po21 po21Var, com.yandex.go.scooters.passes.v2.domain.a aVar, i iVar, a aVar2, g gVar, ufo0 ufo0Var, String str, String str2, qco0 qco0Var, ScootersPassesFromScreen scootersPassesFromScreen, cao0 cao0Var) {
        super(k7o0.class);
        this.x = qxm0Var;
        this.y = po21Var;
        this.z = aVar;
        this.A = iVar;
        this.B = aVar2;
        this.C = gVar;
        this.D = ufo0Var;
        this.E = str;
        this.F = str2;
        this.G = qco0Var;
        this.H = scootersPassesFromScreen;
        this.I = cao0Var;
    }

    public final void Kg() {
        boolean z = ((bfo0) ((b) this.D).b.getValue()) instanceof zeo0;
        cao0 cao0Var = this.I;
        if (!z) {
            cao0Var.a.r(new qu(9));
        } else {
            cao0Var.a.r(new lsm0(null, 3));
        }
    }
}
