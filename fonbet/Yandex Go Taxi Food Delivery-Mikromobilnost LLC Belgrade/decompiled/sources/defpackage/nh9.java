package defpackage;

import java.util.Objects;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.common_models.net.map_object.o;

/* loaded from: classes6.dex */
public final class nh9 implements xsd0 {
    public final pd61 a;
    public final h3y b;

    public nh9(pd61 pd61Var, h3y h3yVar) {
        this.a = pd61Var;
        this.b = h3yVar;
    }

    @Override // defpackage.xsd0
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        b((o) wsd0Var.getAction(), wsd0Var.getPosition());
        return zy11.a;
    }

    public final void b(o oVar, zzs zzsVar) {
        String str = oVar.a;
        pd61 pd61Var = this.a;
        pte0 pte0Var = pd61Var.c;
        if (Objects.equals(str, pte0Var.b())) {
            return;
        }
        pd61Var.a.f(str);
        pte0Var.a(str);
        pd61Var.b();
        ((jjt0) ((mh9) this.b.get())).c(zzsVar);
    }
}
