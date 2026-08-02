package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class l730 extends fir {
    public final yvf0 b;

    public l730(vd vdVar) {
        this.b = vdVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        eir eirVar = (eir) obj;
        String lastPathSegment = eirVar.a().getLastPathSegment();
        zy11 zy11Var = zy11.a;
        if (lastPathSegment == null) {
            return zy11Var;
        }
        ((pep0) oep0Var).f((m950) this.b.get(), new m730(lastPathSegment, eirVar.b(), v770Var.a), hxx.a);
        return zy11Var;
    }
}
