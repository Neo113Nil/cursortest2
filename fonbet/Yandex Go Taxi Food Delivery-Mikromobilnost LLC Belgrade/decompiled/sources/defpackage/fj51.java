package defpackage;

import android.app.Activity;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class fj51 extends ys51 {
    public final Activity b;
    public final jj3 c;

    public fj51(Activity activity, jj3 jj3Var) {
        this.b = activity;
        this.c = jj3Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        this.c.a(new um3(Events$Zalogin$LoginContext.YANDEX_PAY, new qzj0(null, new qq31(21, this)), false, false, 28), false);
        return zy11.a;
    }
}
