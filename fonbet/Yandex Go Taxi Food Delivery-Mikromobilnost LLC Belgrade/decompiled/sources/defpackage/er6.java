package defpackage;

import android.app.Activity;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.bugreport.router.b;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes9.dex */
public final class er6 extends fr6 {
    public final Activity b;
    public final w030 c;
    public final h3y d;

    public er6(Activity activity, w030 w030Var, h3y h3yVar) {
        this.b = activity;
        this.c = w030Var;
        this.d = h3yVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        b i = tub1.a((i6r) this.d.get(), this.b, this.c).i();
        zy11 zy11Var = zy11.a;
        ((pep0) oep0Var).f(i, zy11Var, hxx.a);
        return zy11Var;
    }
}
