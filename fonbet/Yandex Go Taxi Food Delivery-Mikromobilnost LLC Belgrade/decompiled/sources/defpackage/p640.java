package defpackage;

import android.content.Context;
import ru.yandex.taxi.h;
import ru.yandex.taxi.masstransit.threadvariants.b;

/* loaded from: classes6.dex */
public final class p640 extends pgd {
    public final w030 F;
    public final Context G;
    public final h H;
    public final b I;
    public final e100 J;
    public final y50 K;
    public final mu5 L;

    public p640(w030 w030Var, Context context, h hVar, b bVar, e100 e100Var, y50 y50Var) {
        super(0);
        this.F = w030Var;
        this.G = context;
        this.H = hVar;
        this.I = bVar;
        this.J = e100Var;
        this.K = y50Var;
        this.L = new mu5(new x240(3, this));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.L;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.G;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final boolean T() {
        return true;
    }
}
