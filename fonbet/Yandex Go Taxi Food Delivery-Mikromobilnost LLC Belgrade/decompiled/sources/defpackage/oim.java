package defpackage;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class oim {
    public final tse a;
    public pzt0 d;
    public boolean e;
    public String f;
    public final a3y0 b = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "DriverInfoProcessing");
    public final r0 c = bvf0.c(Boolean.TRUE);
    public final AtomicInteger g = new AtomicInteger(0);

    public oim(tse tseVar) {
        this.a = tseVar;
    }

    public final r0 a() {
        return this.c;
    }
}
