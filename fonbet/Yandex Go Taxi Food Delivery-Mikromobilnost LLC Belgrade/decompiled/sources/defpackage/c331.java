package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class c331 extends d331 {
    public final yvf0 b;

    public c331(im21 im21Var) {
        this.b = im21Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        b331 b331Var = (b331) obj;
        String a = b331Var.a();
        if (a == null) {
            a = "";
        }
        ((pep0) oep0Var).f((m950) this.b.get(), new q331(a, b331Var.b()), hxx.a);
        return zy11.a;
    }
}
