package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class fdm extends gdm {
    public final yvf0 b;
    public final fx60 c;

    public fdm(fx60 fx60Var, yvf0 yvf0Var) {
        this.b = yvf0Var;
        this.c = fx60Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        this.c.a(Events$Zalogin$LoginContext.DEEPLINK, new t7j(2, oep0Var, this, (edm) obj));
        return zy11.a;
    }
}
