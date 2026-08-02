package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.cashback.f;
import ru.yandex.taxi.cashback.sdk.OpenPlusSubscriptionAction;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class bb21 extends cb21 {
    public final yvf0 b;
    public final fx60 c;
    public final z0j d;

    public bb21(xh xhVar, fx60 fx60Var, z0j z0jVar) {
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
        v2d0Var.e(OpenPlusSubscriptionAction.UPGRADE_SUBSCRIPTION);
        co91.a(oep0Var, v2d0Var.a(), this.c, this.d, (f) this.b.get());
        return zy11.a;
    }
}
