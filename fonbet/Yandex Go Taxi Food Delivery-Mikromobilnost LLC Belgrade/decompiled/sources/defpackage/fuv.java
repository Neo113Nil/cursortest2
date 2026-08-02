package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes10.dex */
public final class fuv extends guv {
    public final h3y b;
    public final yvf0 c;
    public final yvf0 d;

    public fuv(h3y h3yVar, yvf0 yvf0Var, dt00 dt00Var) {
        this.b = h3yVar;
        this.c = yvf0Var;
        this.d = dt00Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        lwk0 lwk0Var;
        boolean a = ((duv) ((cuv) this.b.get())).a();
        if (a) {
            lwk0Var = (lwk0) this.c.get();
        } else {
            if (a) {
                w511.b();
                return null;
            }
            lwk0Var = (lwk0) this.d.get();
        }
        oep0.b(oep0Var, lwk0Var);
        return zy11.a;
    }
}
