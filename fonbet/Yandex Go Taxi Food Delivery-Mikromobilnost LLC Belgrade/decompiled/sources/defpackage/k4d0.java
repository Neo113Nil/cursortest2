package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.cashback.f;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class k4d0 extends l4d0 {
    public final yvf0 b;
    public final fx60 c;
    public final z0j d;

    public k4d0(xh xhVar, fx60 fx60Var, z0j z0jVar) {
        this.b = xhVar;
        this.c = fx60Var;
        this.d = z0jVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        v2d0 v2d0Var = new v2d0();
        v2d0Var.d(((j4d0) obj).a().toString());
        co91.a(oep0Var, v2d0Var.a(), this.c, this.d, (f) this.b.get());
        return zy11.a;
    }
}
