package defpackage;

import com.yandex.go.splash.domain.b;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes9.dex */
public final class aku extends bku {
    public final yvf0 b;
    public final ast0 c;

    public aku(yvf0 yvf0Var, ast0 ast0Var) {
        this.b = yvf0Var;
        this.c = ast0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        ((b) this.c).a(new p7h(20, oep0Var, this, (zju) obj));
        return zy11.a;
    }
}
