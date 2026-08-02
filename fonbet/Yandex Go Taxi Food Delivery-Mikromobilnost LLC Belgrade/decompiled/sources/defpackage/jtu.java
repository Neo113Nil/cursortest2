package defpackage;

import android.content.Context;
import ru.yandex.taxi.favorites.experiment.FavoritesCreateRegularAddressExperiment;
import ru.yandex.taxi.favorites.experiment.e;
import ru.yandex.taxi.favorites.housemissing.HouseMissingModalView;
import ru.yandex.taxi.favorites.housemissing.b;
import ru.yandex.taxi.widget.c;

/* loaded from: classes5.dex */
public final class jtu extends m230 {
    public final w030 E;
    public final etu F;
    public final itu G;
    public final e H;
    public final boolean I;

    public jtu(w030 w030Var, etu etuVar, itu ituVar, e eVar) {
        super(null);
        this.E = w030Var;
        this.F = etuVar;
        this.G = ituVar;
        this.H = eVar;
        this.I = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.I;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        i4u i4uVar = new i4u(this);
        FavoritesCreateRegularAddressExperiment b = this.H.b();
        String str = ((gtu) obj).a;
        ho9 ho9Var = this.G.a;
        return new HouseMissingModalView((Context) this.F.a.a.get(), new b((c) ho9Var.a.get(), (pwy0) ho9Var.b.get(), (ru.yandex.taxi.widget.utils.e) ho9Var.c.get(), (aip) ho9Var.d.get(), i4uVar, b, str));
    }
}
