package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddressDatumType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes12.dex */
public final class p6j0 {
    public final dqe0 a;
    public final i b;

    public p6j0(dqe0 dqe0Var, i iVar) {
        this.a = dqe0Var;
        this.b = iVar;
    }

    public final f0t a() {
        Address e = this.a.e();
        if (e == null) {
            pv0 pv0Var = (pv0) this.b.i().orElse(null);
            e = pv0Var != null ? pv0Var.a : null;
        }
        if (e == null) {
            return null;
        }
        double d = e.B().a;
        double d2 = e.B().b;
        String d3 = e.d();
        String str = e.getAddress().f;
        String H1 = e.H1();
        String e0 = e.e0();
        String b1 = e.b1();
        String uri = e.getUri();
        String favoriteId = e.getFavoriteId();
        FavoriteAddressDatumType datumType = e.getDatumType();
        return new f0t(d, d2, d3, str, uri, null, e0, H1, null, b1, favoriteId, datumType != null ? datumType.name() : null, e.c2());
    }
}
