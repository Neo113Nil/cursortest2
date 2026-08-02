package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.common_models.net.map_object.r0;

/* loaded from: classes6.dex */
public final class p9s0 implements xsd0 {
    public final y50 a;

    public p9s0(y50 y50Var) {
        this.a = y50Var;
    }

    @Override // defpackage.xsd0
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        r0 r0Var = (r0) wsd0Var.getAction();
        if (r0Var.a.length() > 0) {
            ((a60) this.a).c(r0Var.a, v770.e);
        }
        return zy11.a;
    }
}
