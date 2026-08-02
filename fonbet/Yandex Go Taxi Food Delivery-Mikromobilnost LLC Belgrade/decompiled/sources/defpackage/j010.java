package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes9.dex */
public final class j010 extends k010 {
    public final h3y b;
    public final h3y c;
    public final x111 d;
    public final oep0 e;

    public j010(h3y h3yVar, h3y h3yVar2, x111 x111Var, oep0 oep0Var) {
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = x111Var;
        this.e = oep0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        String a = ((i010) obj).a();
        if (a != null && a.length() != 0) {
            ((jj3) this.c.get()).c(new um3(Events$Zalogin$LoginContext.DEEPLINK, new qzj0(null, new vmz(14, this, a)), false, false, 28));
            this.d.a();
        }
        return zy11.a;
    }
}
