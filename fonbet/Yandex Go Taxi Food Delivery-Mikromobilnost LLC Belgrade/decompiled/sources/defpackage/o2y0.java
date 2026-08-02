package defpackage;

import com.yandex.go.coroutines.b;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderHolder$asStateFlow$$inlined$flatMapLatest$1;
import com.yandex.go.taxi.order.models.api.TaxiOrderHolder$asStateFlow$$inlined$start$1;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes8.dex */
public final class o2y0 {
    public final r0 a;
    public final n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public o2y0(TaxiOrder taxiOrder) {
        this.a = bvf0.c(taxiOrder);
    }

    public final g a() {
        return e.X(b.d(this.b, new TaxiOrderHolder$asStateFlow$$inlined$start$1(zy11.a, null)), new TaxiOrderHolder$asStateFlow$$inlined$flatMapLatest$1(this, null));
    }

    public final TaxiOrder b() {
        return (TaxiOrder) this.a.getValue();
    }

    public final DriveState c() {
        return b().h.getB();
    }

    public final String d() {
        return b().x();
    }

    public final boolean e() {
        return !b().K();
    }

    public final void f() {
        this.b.g(zy11.a);
    }

    public final void g(TaxiOrder taxiOrder) {
        this.a.l(taxiOrder);
    }
}
