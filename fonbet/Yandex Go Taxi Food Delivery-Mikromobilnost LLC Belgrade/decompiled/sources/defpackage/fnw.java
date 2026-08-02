package defpackage;

import com.yandex.go.layers.domain.g;
import ru.yandex.taxi.common_models.net.map_object.j0;
import ru.yandex.taxi.map_common.b;

/* loaded from: classes12.dex */
public final class fnw extends ad5 {
    public final vnw A;
    public final reu B;
    public final ysd0 C;
    public final k7x0 D;
    public final b1 E;
    public volatile ymw F;
    public final enw G;
    public final cyx x;
    public final g y;
    public final anw z;

    public fnw(cyx cyxVar, g gVar, anw anwVar, vnw vnwVar, reu reuVar, ysd0 ysd0Var, k7x0 k7x0Var, b1 b1Var) {
        super(zmw.class);
        this.x = cyxVar;
        this.y = gVar;
        this.z = anwVar;
        this.A = vnwVar;
        this.B = reuVar;
        this.C = ysd0Var;
        this.D = k7x0Var;
        this.E = b1Var;
        this.G = new enw(0, this);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.y.c(rfu0.i);
        vnw vnwVar = this.A;
        vnwVar.a.a.remove(vnwVar);
        this.G.getClass();
        ((b) this.C).b(j0.class);
    }

    public final void Kg(ymw ymwVar) {
        if (ymwVar == null) {
            ((zmw) Dg()).Vd();
            return;
        }
        zmw zmwVar = (zmw) Dg();
        String str = ymwVar.c;
        String str2 = ymwVar.d;
        String str3 = this.z.e.c;
        zmwVar.zf(new rg7(str, str2, str3 != null ? ((m7x0) this.D).a(str3) : null));
    }
}
