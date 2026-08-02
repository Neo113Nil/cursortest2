package defpackage;

import android.content.Context;
import ru.yandex.taxi.persuggest.source.g;
import ru.yandex.taxi.search.panorama.TaxiPanoramaModalView;
import ru.yandex.taxi.styling.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class b9y0 extends m230 implements a9y0 {
    public final w030 E;
    public final p8y0 F;
    public final z8y0 G;
    public final dqt H;

    public b9y0(w030 w030Var, p8y0 p8y0Var, z8y0 z8y0Var, dqt dqtVar) {
        super(null);
        this.E = w030Var;
        this.F = p8y0Var;
        this.G = z8y0Var;
        this.H = dqtVar;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        s8y0 s8y0Var = (s8y0) obj;
        c1x0 c1x0Var = new c1x0(this);
        yx1 yx1Var = this.G.a;
        y8y0 y8y0Var = new y8y0(c1x0Var, s8y0Var, (a8y0) ((xvf0) yx1Var.a).get(), (e) ((xvf0) yx1Var.b).get(), (tt2) ((xvf0) yx1Var.c).get(), (pwy0) ((xvf0) yx1Var.d).get(), (zuj0) ((xvf0) yx1Var.e).get(), (g) ((b900) yx1Var.g).get(), (i8y0) ((xvf0) yx1Var.f).get(), (c) ((xvf0) yx1Var.h).get());
        zqj zqjVar = this.F.a;
        return new TaxiPanoramaModalView(y8y0Var, s8y0Var, (Context) zqjVar.a.get(), (dqt) zqjVar.b.get(), (tse) zqjVar.c.get());
    }
}
