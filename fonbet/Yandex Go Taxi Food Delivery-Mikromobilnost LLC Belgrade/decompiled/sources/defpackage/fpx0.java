package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.summary.topnotification.a;
import ru.yandex.taxi.summary.topnotification.b;

/* loaded from: classes6.dex */
public final class fpx0 extends b {
    public final tt2 b;
    public final wiq0 c;
    public final epx0 d;

    public fpx0(tt2 tt2Var, wiq0 wiq0Var, epx0 epx0Var) {
        super(tt2Var);
        this.b = tt2Var;
        this.c = wiq0Var;
        this.d = epx0Var;
    }

    @Override // ru.yandex.taxi.summary.topnotification.b
    public final a a() {
        return this.d;
    }

    @Override // ru.yandex.taxi.summary.topnotification.b
    public final tpr b() {
        ru.yandex.taxi.summary.topnotification.tariff_unavailable.interactor.b bVar = new ru.yandex.taxi.summary.topnotification.tariff_unavailable.interactor.b(e.t(((k) this.c).j.b()), this);
        this.b.getClass();
        return e.F(bVar, uyj.a);
    }
}
