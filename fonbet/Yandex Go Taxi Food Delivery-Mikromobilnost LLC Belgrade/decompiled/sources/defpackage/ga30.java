package defpackage;

import com.yandex.go.navigation.screen.c;
import com.yandex.go.taxi.order.domain.repositories.MostActiveOrderRepository$mostActiveOrderFlow$$inlined$flatMapLatest$1;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes14.dex */
public final class ga30 {
    public final c a;
    public final n20 b;

    public ga30(c cVar, n20 n20Var) {
        this.a = cVar;
        this.b = n20Var;
    }

    public final g a() {
        return e.X(this.a.c(), new MostActiveOrderRepository$mostActiveOrderFlow$$inlined$flatMapLatest$1(null, this));
    }
}
