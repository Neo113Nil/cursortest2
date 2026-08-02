package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.payments.api.preorder.SuitabilityCheckType;
import com.yandex.go.route.interactor.c;
import ru.yandex.taxi.am.g;

/* loaded from: classes6.dex */
public final class ou7 {
    public final g a;
    public final c b;
    public final b0j c;
    public final h3y d;

    public ou7(g gVar, c cVar, b0j b0jVar, h3y h3yVar) {
        this.a = gVar;
        this.b = cVar;
        this.c = b0jVar;
        this.d = h3yVar;
    }

    public final boolean a() {
        return (((icv0) this.d.get()).a(new SuitabilityCheckType[0]) || this.c.a()) && !b();
    }

    public final boolean b() {
        Address g = this.b.g();
        return g == null || g.X1();
    }
}
