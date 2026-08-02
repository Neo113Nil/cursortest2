package defpackage;

import ru.yandex.taxi.summary.personalaction.notification.d;
import ru.yandex.taxi.summary.topnotification.a;
import ru.yandex.taxi.summary.topnotification.b;

/* loaded from: classes6.dex */
public final class l3b0 extends b {
    public final ru.yandex.taxi.summary.personalaction.notification.b b;
    public final dx c;

    public l3b0(tt2 tt2Var, ru.yandex.taxi.summary.personalaction.notification.b bVar, dx dxVar) {
        super(tt2Var);
        this.b = bVar;
        this.c = dxVar;
    }

    @Override // ru.yandex.taxi.summary.topnotification.b
    public final a a() {
        return this.b;
    }

    @Override // ru.yandex.taxi.summary.topnotification.b
    public final tpr b() {
        return new d(new ru.yandex.taxi.personalstate.domain.interactor.b(this.c.a.x), this);
    }
}
