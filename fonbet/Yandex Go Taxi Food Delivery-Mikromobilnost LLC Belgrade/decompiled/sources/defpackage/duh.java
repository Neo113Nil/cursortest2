package defpackage;

import defpackage.duh;
import defpackage.nth;
import defpackage.rol0;
import defpackage.wsr0;
import defpackage.xsr0;
import kotlin.a;
import ru.yandex.taxi.logistics.sdk.management.localstate.e;
import ru.yandex.taxi.logistics.sdk.management.storage.b;
import ru.yandex.taxi.logistics.sdk.management.storage.f;
import ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d;

/* loaded from: classes9.dex */
public final class duh {
    public final hwh a;
    public final b b;
    public final f c;
    public final aci d;
    public final lsi e;
    public final d f;
    public final e g;
    public final jwh h;
    public final gp50 i;
    public final ike j;
    public buh k = new buh(null, null, null);
    public final i3y l;

    public duh(final nth nthVar, st2 st2Var, hwh hwhVar, b bVar, f fVar, aci aciVar, lsi lsiVar, d dVar, e eVar, jwh jwhVar, gp50 gp50Var) {
        this.a = hwhVar;
        this.b = bVar;
        this.c = fVar;
        this.d = aciVar;
        this.e = lsiVar;
        this.f = dVar;
        this.g = eVar;
        this.h = jwhVar;
        this.i = gp50Var;
        this.j = bvf0.a(st2Var.b);
        this.l = a.a(new sls() { // from class: ru.yandex.taxi.logistics.sdk.management.deliveries.e
            @Override // defpackage.sls
            public final Object invoke() {
                nth nthVar2 = nthVar;
                duh duhVar = duh.this;
                return kotlinx.coroutines.flow.e.O(new rol0(new DeliveriesModel$deliveriesFlow$2$1(nthVar2, duhVar, null)), duhVar.j, wsr0.a(xsr0.a, 3), 1);
            }
        });
    }
}
