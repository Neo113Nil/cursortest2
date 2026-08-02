package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.toggle.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.cs;
import xsna.xhr0;

/* compiled from: FeatureUpdateSourceImpl.kt */
/* loaded from: classes11.dex */
public final class nvq implements b.InterfaceC1925b {
    public final es a = new es();

    @Override // com.vk.toggle.b.InterfaceC1925b
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(b.c cVar, UserId userId) {
        List<b.d> list = cVar.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((b.d) it.next()).b.toString());
        }
        List C0 = j5g.C0(arrayList);
        String a = xhr0.a.a(j5g.g0(C0, StringUtils.COMMA, null, null, 0, null, 62));
        int i = cVar.a;
        dz2 x = yfb.x(cs.a.e(this.a, null, Integer.valueOf(i), a, userId, 1));
        x.n = true;
        return new io.reactivex.rxjava3.internal.operators.observable.o1(rsg0.T(x), new rt0(new mvq(this, C0, i, a), 12)).F(new st0(new gt(22), 17)).U(new p7(new k0j(this, 11), 27));
    }

    @Override // com.vk.toggle.b.InterfaceC1925b
    public final io.reactivex.rxjava3.internal.operators.completable.w b(b.a aVar) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(aVar.getKey());
        tfx tfxVar = new tfx("account.trackToggles", new jq(0), new kq(0));
        tfxVar.i("toggles", arrayList);
        dz2 x = yfb.x(tfxVar);
        x.n = true;
        return rsg0.Z(x).i(new n20(new jt(22), 26));
    }
}
