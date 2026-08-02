package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class jb50 extends kb50 {
    public final kc50 b;
    public final z0j c;
    public final fx60 d;

    public jb50(kc50 kc50Var, z0j z0jVar, fx60 fx60Var) {
        this.b = kc50Var;
        this.c = z0jVar;
        this.d = fx60Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        this.d.a(Events$Zalogin$LoginContext.DEEPLINK, new ve30(27, this, (ib50) obj));
        return zy11.a;
    }
}
