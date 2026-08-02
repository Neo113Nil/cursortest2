package defpackage;

import com.yandex.go.address.models.Address;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public final class gc50 extends gks {
    public String A0;

    @Override // com.yandex.go.address.search.common.presenter.i
    public final void Fh() {
    }

    @Override // com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.e
    public final void Ng(ftj0 ftj0Var) {
        Bh(ftj0Var.a);
    }

    @Override // defpackage.a390, defpackage.uh9, ru.yandex.taxi.search.presenter.f
    public final pv0 dh() {
        Address k = this.m0.k();
        if (k != null) {
            return new pv0(k, null, null, null, null, null, null, null, 1022);
        }
        return null;
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void oh(String str) {
        this.A0 = str;
    }

    @Override // defpackage.gks, ru.yandex.taxi.search.presenter.f
    public final void qh() {
        ((j61) Dg()).fg();
    }

    @Override // com.yandex.go.address.search.common.presenter.i, defpackage.w51
    public final List wh(List list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.removeIf(new sdc(12, new ej40(11)));
        return a.J0(arrayList);
    }

    @Override // defpackage.a390, defpackage.uh9, com.yandex.go.address.search.common.presenter.i
    public final String zh() {
        return this.A0;
    }
}
