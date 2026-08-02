package defpackage;

import com.yandex.go.payments.deeplink.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class ed0 extends fd0 {
    public final a b;

    public ed0(a aVar) {
        this.b = aVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return this.b.a(oep0Var, v770Var, null, (ContinuationImpl) continuation);
    }
}
