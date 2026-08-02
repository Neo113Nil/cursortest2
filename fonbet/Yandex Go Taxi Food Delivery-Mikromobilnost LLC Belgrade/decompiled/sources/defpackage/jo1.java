package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class jo1 extends io1 {
    public final yvf0 b;

    public jo1(pw pwVar) {
        this.b = pwVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        ho1 ho1Var = (ho1) obj;
        ((pep0) oep0Var).f((m950) this.b.get(), new qo1(ho1Var.a(), ho1Var.b(), ho1Var.c()), hxx.a);
        return zy11.a;
    }
}
