package defpackage;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.net.taxi.TaxiApi;

/* loaded from: classes14.dex */
public final class ozi0 {
    public final tt2 a;
    public final c b;
    public final TaxiApi c;
    public final ysg d;
    public final bd80 e;
    public final ri1 f;
    public final a3y0 g = new a3y0(TaxiOrderLogGroup.CORE.getTag(), "ReorderController");

    public ozi0(tt2 tt2Var, c cVar, TaxiApi taxiApi, ysg ysgVar, bd80 bd80Var, ri1 ri1Var) {
        this.a = tt2Var;
        this.b = cVar;
        this.c = taxiApi;
        this.d = ysgVar;
        this.e = bd80Var;
        this.f = ri1Var;
    }
}
