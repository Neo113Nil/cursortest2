package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigation.screen.c;
import ru.yandex.taxi.logistics.address.d;
import ru.yandex.taxi.logistics.experiments.k;

/* loaded from: classes5.dex */
public final class cwh implements jv0 {
    public final wiq0 a;
    public final k b;
    public final zuj0 c;
    public final c d;

    public cwh(wiq0 wiq0Var, k kVar, zuj0 zuj0Var, c cVar) {
        this.a = wiq0Var;
        this.b = kVar;
        this.c = zuj0Var;
        this.d = cVar;
    }

    @Override // defpackage.jv0
    public final tpr a() {
        c cVar = this.d;
        boolean z = cVar.e() || cVar.b() == Screen.ORDERS_LIST;
        wiq0 wiq0Var = this.a;
        return new d(z ? ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).f() : ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).j.b(), this);
    }
}
