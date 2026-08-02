package defpackage;

import com.yandex.delivery.mapper.model.Expansion;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class nfi extends ofi {
    public final yvf0 b;

    public nfi(yvf0 yvf0Var) {
        this.b = yvf0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        String a = ((lfi) obj).a();
        zy11 zy11Var = zy11.a;
        if (a == null) {
            return zy11Var;
        }
        ((pep0) oep0Var).f((m950) this.b.get(), new rui(a, (Map) null, (Expansion) null, (UUID) null, 30), hxx.a);
        return zy11Var;
    }
}
