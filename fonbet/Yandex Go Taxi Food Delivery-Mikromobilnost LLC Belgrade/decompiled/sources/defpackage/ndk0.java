package defpackage;

import com.yandex.go.taxi.order.details.v2.domain.plugins.a;
import com.yandex.go.taxi.order.provider.chat.ChatButtonDelegate$stateObservableFlow$$inlined$flatMapLatest$1;
import com.yandex.go.taxi.order.provider.chat.b;
import com.yandex.go.taxi.order.provider.chat.c;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes14.dex */
public final class ndk0 extends a {
    public final g c;

    public ndk0(c cVar, o2y0 o2y0Var, tt2 tt2Var) {
        super(h1b.d, tt2Var);
        cVar.getClass();
        this.c = e.X(e.t(new b(o2y0Var.a())), new ChatButtonDelegate$stateObservableFlow$$inlined$flatMapLatest$1(cVar, null));
    }

    @Override // com.yandex.go.taxi.order.details.v2.domain.plugins.a
    public final tpr a() {
        return this.c;
    }
}
