package defpackage;

import ru.yandex.taxi.main.map.autofs.b;
import ru.yandex.taxi.main.map.autoupdatelocationthrottle.d;
import ru.yandex.taxi.main.map.autoupdatelocationthrottle.e;

/* loaded from: classes9.dex */
public final class dr3 implements cr3 {
    public final gci0 a;
    public final tpr b;

    public dr3(e eVar, tse tseVar) {
        b bVar = new b(kotlinx.coroutines.flow.e.t(new d(ru.yandex.taxi.experiments.d.b(eVar.a), eVar)), this);
        xsr0.a.getClass();
        gci0 R = kotlinx.coroutines.flow.e.R(bVar, tseVar, wsr0.b, null);
        this.a = R;
        this.b = kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.main.map.autofs.d(R));
    }

    public final boolean a() {
        return this.a.a.getValue() != null;
    }
}
