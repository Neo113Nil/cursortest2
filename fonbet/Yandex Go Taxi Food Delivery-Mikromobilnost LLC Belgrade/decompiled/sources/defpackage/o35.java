package defpackage;

import com.yandex.go.layers.api.model.LayersCondition$Endpoint;
import com.yandex.go.lifecycle.a;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.layers.domain.BaseLayersInteractor$listenToStateChanges$$inlined$flatMapLatest$1;
import ru.yandex.taxi.layers.domain.BaseLayersInteractor$listenToStateChanges$$inlined$flatMapMerge$1;
import ru.yandex.taxi.layers.domain.i;
import ru.yandex.taxi.layers.source.c;
import ru.yandex.taxi.layers.source.requesttrigger.g;

/* loaded from: classes9.dex */
public abstract class o35 {
    public final tt2 a;
    public final a b;
    public final e2t c;
    public final LayersCondition$Endpoint d;
    public final oo2 e;
    public final cyx f;
    public final c g;
    public final g h;
    public final com.yandex.go.navigation.screen.c i;

    public o35(tt2 tt2Var, a aVar, e2t e2tVar, LayersCondition$Endpoint layersCondition$Endpoint, oo2 oo2Var, cyx cyxVar, c cVar, g gVar, com.yandex.go.navigation.screen.c cVar2) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = e2tVar;
        this.d = layersCondition$Endpoint;
        this.e = oo2Var;
        this.f = cyxVar;
        this.g = cVar;
        this.h = gVar;
        this.i = cVar2;
    }

    public abstract azx a(byx byxVar);

    public final tpr b() {
        tpr C = e.C(e.X(e.T(new i(this.f.a(), this), 1), new BaseLayersInteractor$listenToStateChanges$$inlined$flatMapLatest$1(this, null)), new BaseLayersInteractor$listenToStateChanges$$inlined$flatMapMerge$1(this, null));
        this.a.getClass();
        return e.F(C, uyj.a);
    }

    public abstract tpr c(bzx bzxVar);

    public abstract tpr d(byx byxVar, we11 we11Var);
}
