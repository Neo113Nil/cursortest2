package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes9.dex */
public final class az00 extends bz00 {
    public final h010 b;
    public final x111 c;

    public az00(h010 h010Var, x111 x111Var) {
        this.b = h010Var;
        this.c = x111Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        String a;
        zy00 zy00Var = (zy00) obj;
        this.c.a();
        String b = zy00Var.b();
        this.b.a(new vm30(((b == null || evu0.J(b)) && ((a = zy00Var.a()) == null || evu0.J(a))) ? pj40.c : new pj40(zy00Var.b(), zy00Var.a())), null);
        return zy11.a;
    }
}
