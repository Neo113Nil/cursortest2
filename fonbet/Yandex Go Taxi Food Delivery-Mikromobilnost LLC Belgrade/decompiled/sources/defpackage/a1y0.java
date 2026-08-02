package defpackage;

import com.yandex.go.shortcuts.impl.repository.i;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.multi.feed.experiments.e;
import java.util.Set;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class a1y0 extends ad5 {
    public final ev70 A;
    public final f0 x;
    public final e y;
    public final gpq z;

    public a1y0(f0 f0Var, e eVar, gpq gpqVar, ev70 ev70Var) {
        super(z0y0.class);
        this.x = f0Var;
        this.y = eVar;
        this.z = gpqVar;
        this.A = ev70Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        i iVar = (i) this.z;
        iVar.j.b();
        iVar.i.d();
        iVar.k.clear();
        r0 r0Var = this.x.l;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        super.Cg();
    }

    public final void Kg(DriveState driveState) {
        TaxiOrder b;
        o2y0 o2y0Var = (o2y0) this.x.q.getValue();
        if (o2y0Var == null || (b = o2y0Var.b()) == null) {
            return;
        }
        DriveState driveState2 = driveState == null ? b.h.b : driveState;
        synchronized (b) {
            TaxiOrderLocalData taxiOrderLocalData = b.l;
            Set M0 = a.M0(taxiOrderLocalData.c0);
            M0.add(driveState2);
            b.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, M0, null, -1, 12582911);
        }
    }
}
