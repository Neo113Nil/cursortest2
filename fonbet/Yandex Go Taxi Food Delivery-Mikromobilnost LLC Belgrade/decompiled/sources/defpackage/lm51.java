package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class lm51 extends mm51 {
    public final yvf0 b;
    public final fx60 c;
    public final z0j d;

    public lm51(xh xhVar, fx60 fx60Var, z0j z0jVar) {
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
        w2d0 a = new v2d0().a();
        this.c.a(Events$Zalogin$LoginContext.DEEPLINK, new wp01(13, this, oep0Var, a));
        return zy11.a;
    }
}
