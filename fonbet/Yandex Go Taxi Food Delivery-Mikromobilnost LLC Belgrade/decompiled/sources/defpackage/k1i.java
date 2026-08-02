package defpackage;

import com.yandex.go.splash.domain.b;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class k1i extends l1i {
    public final ast0 b;
    public final h3y c;
    public final h3y d;
    public final oo2 e;
    public final oep0 f;

    public k1i(ast0 ast0Var, h3y h3yVar, h3y h3yVar2, oo2 oo2Var, oep0 oep0Var) {
        this.b = ast0Var;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = oo2Var;
        this.f = oep0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        ((b) this.b).a(new zvg(19, ((j1i) obj).a(), this));
        return zy11.a;
    }
}
