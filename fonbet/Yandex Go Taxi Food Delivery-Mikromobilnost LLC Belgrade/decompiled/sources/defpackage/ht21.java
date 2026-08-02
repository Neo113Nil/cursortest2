package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class ht21 extends gt21 {
    public final yvf0 b;
    public final jj3 c;

    public ht21(yvf0 yvf0Var, jj3 jj3Var) {
        this.b = yvf0Var;
        this.c = jj3Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        this.c.c(new um3(Events$Zalogin$LoginContext.DEEPLINK, new qzj0(null, new dl01(26, oep0Var, this)), false, false, 28));
        return zy11.a;
    }
}
