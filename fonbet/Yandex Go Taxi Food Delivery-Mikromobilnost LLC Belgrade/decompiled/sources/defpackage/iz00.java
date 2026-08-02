package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes9.dex */
public final class iz00 extends jz00 {
    public final h010 b;
    public final x111 c;

    public iz00(h010 h010Var, x111 x111Var) {
        this.b = h010Var;
        this.c = x111Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        gz00 gz00Var = (gz00) obj;
        this.c.a();
        this.b.a(new wm30(gz00Var.a(), rib1.e(gz00Var.c(), gz00Var.b())), null);
        return zy11.a;
    }
}
