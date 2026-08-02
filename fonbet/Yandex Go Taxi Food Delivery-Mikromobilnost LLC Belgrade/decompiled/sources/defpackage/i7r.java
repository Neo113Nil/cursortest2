package defpackage;

import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.layers.actionrouter.a;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes9.dex */
public final class i7r implements f7r {
    public final zh0 a;

    public i7r(zh0 zh0Var) {
        this.a = zh0Var;
    }

    public final a a(AddressResolveRepository addressResolveRepository) {
        zh0 zh0Var = this.a;
        return new a((ah00) zh0Var.a.get(), (i) zh0Var.b.get(), (tit0) zh0Var.c.get(), addressResolveRepository, (tt2) zh0Var.d.get());
    }
}
