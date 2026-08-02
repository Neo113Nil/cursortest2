package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class aaa0 extends caa0 {
    public final fx60 b;
    public final yvf0 c;
    public final yvf0 d;

    public aaa0(fx60 fx60Var, yvf0 yvf0Var, yvf0 yvf0Var2) {
        this.b = fx60Var;
        this.c = yvf0Var;
        this.d = yvf0Var2;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        this.b.a(Events$Zalogin$LoginContext.DEEPLINK, new in2(14, (z9a0) obj, this, oep0Var));
        return zy11.a;
    }
}
