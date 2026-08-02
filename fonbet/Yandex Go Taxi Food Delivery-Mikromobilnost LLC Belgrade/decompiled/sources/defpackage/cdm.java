package defpackage;

import com.yandex.go.navigation.base.a;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.common_models.net.map_object.q;

/* loaded from: classes.dex */
public final class cdm implements xsd0 {
    public final oep0 a;
    public final lyh b;
    public final rcm c;

    public cdm(oep0 oep0Var, lyh lyhVar, rcm rcmVar) {
        this.a = oep0Var;
        this.b = lyhVar;
        this.c = rcmVar;
    }

    @Override // defpackage.xsd0
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        qdm qdmVar = new qdm(((q) wsd0Var.getAction()).a);
        if (jl40.l(this.c.a, qdmVar)) {
            return zy11.a;
        }
        zem zemVar = (zem) this.b.get();
        ((pep0) this.a).f(zemVar, qdmVar, hxx.a);
        return a.c(zemVar, continuation);
    }
}
