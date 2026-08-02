package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.suggest.DestinationSuggest;

/* loaded from: classes12.dex */
public class a390 extends uh9 {
    @Override // defpackage.uh9, com.yandex.go.address.search.common.presenter.b
    public igq0 Mh(DestinationSuggest destinationSuggest) {
        return p7b1.d(kzi.a, this.m0);
    }

    @Override // defpackage.uh9, ru.yandex.taxi.search.presenter.f
    public pv0 dh() {
        Address k = this.m0.k();
        if (k != null) {
            return new pv0(k, null, null, null, null, null, null, null, 1022);
        }
        return null;
    }

    @Override // defpackage.uh9, com.yandex.go.address.search.common.presenter.i
    public String zh() {
        if (this.O.f) {
            return ((j61) Dg()).getFilter();
        }
        String zh = super.zh();
        if (zh != null && zh.length() > 0) {
            return zh;
        }
        Address d = this.k0.c.d();
        if (d != null) {
            return q5z.F(d);
        }
        return null;
    }
}
