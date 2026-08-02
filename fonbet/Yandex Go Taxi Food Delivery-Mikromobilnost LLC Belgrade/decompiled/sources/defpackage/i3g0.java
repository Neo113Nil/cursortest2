package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.settings.model.PushSettingsOpenReason;

/* loaded from: classes8.dex */
public final class i3g0 extends k3g0 {
    public final yvf0 b;

    public i3g0(n4g0 n4g0Var) {
        this.b = n4g0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        ((pep0) oep0Var).f((m950) this.b.get(), PushSettingsOpenReason.DEEPLINK, hxx.a);
        return zy11.a;
    }
}
