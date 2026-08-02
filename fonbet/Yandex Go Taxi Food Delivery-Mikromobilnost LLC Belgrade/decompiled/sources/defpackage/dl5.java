package defpackage;

import com.yandex.go.lifecycle.a;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes12.dex */
public final class dl5 extends ad5 {
    public final mrj A;
    public final a B;
    public boolean C;
    public final hh5 x;
    public final bl5 y;
    public final v7j0 z;

    public dl5(hh5 hh5Var, bl5 bl5Var, v7j0 v7j0Var, mrj mrjVar, a aVar) {
        super(cl5.class);
        this.x = hh5Var;
        this.y = bl5Var;
        this.z = v7j0Var;
        this.A = mrjVar;
        this.B = aVar;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        mrj mrjVar = this.A;
        i d = ((j) ((lx4) mrjVar.b)).d("ServicesInfoOnboarding.completed");
        Float b = ((dho) mrjVar.c).b(qtb1.w);
        if (b != null) {
            d.a.put("duration", String.valueOf(b.floatValue()));
        }
        d.m();
    }
}
