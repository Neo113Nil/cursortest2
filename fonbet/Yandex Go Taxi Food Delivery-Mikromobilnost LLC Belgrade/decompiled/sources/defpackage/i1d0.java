package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class i1d0 extends j1d0 {
    public final yvf0 b;
    public final fx60 c;

    public i1d0(xh xhVar, fx60 fx60Var) {
        this.b = xhVar;
        this.c = fx60Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        this.c.a(Events$Zalogin$LoginContext.DEEPLINK, new b700(28, oep0Var, this, (h1d0) obj));
        return zy11.a;
    }
}
