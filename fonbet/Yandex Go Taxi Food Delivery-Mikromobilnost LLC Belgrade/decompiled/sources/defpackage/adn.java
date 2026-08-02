package defpackage;

import com.yandex.go.external_service.delegates.c;
import com.yandex.go.order.external.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ru.yandex.taxi.delegates.a;
import ru.yandex.taxi.router.d;
import ru.yandex.taxi.superapp.g;
import ru.yandex.taxi.superapp.h;
import ru.yandex.taxi.superapp.i;
import ru.yandex.taxi.superapp.j;
import ru.yandex.taxi.superapp.k;
import ru.yandex.taxi.superapp.l;
import ru.yandex.taxi.superapp.m;
import ru.yandex.taxi.superapp.q;
import ru.yandex.taxi.superapp.r;
import ru.yandex.taxi.superapp.u;
import ru.yandex.taxi.superapp.v;

/* loaded from: classes5.dex */
public final class adn extends xz4 {
    public final k c;
    public final HashMap w;

    public adn(c cVar, k kVar, Set set, Object... objArr) {
        super(cVar, set);
        this.c = kVar;
        this.w = new HashMap();
        List g = scc.g(qoi0.a(dr0.class), qoi0.a(r.class), qoi0.a(viw0.class), qoi0.a(xcn.class), qoi0.a(q.class), qoi0.a(h.class), qoi0.a(qcn.class), qoi0.a(tcn.class), qoi0.a(ru.yandex.taxi.contacts.h.class), qoi0.a(j.class), qoi0.a(h6w0.class), qoi0.a(msv0.class), qoi0.a(fho.class), qoi0.a(b.class), qoi0.a(jcn.class), qoi0.a(hcn.class), qoi0.a(icn.class), qoi0.a(m.class), qoi0.a(vcn.class), qoi0.a(u.class), qoi0.a(lcn.class), qoi0.a(v.class), qoi0.a(ocn.class), qoi0.a(ucn.class), qoi0.a(zcn.class), qoi0.a(t020.class), qoi0.a(pcn.class), qoi0.a(scn.class), qoi0.a(kcn.class), qoi0.a(rcn.class), qoi0.a(l.class), qoi0.a(mcn.class), qoi0.a(ncn.class), qoi0.a(i.class), qoi0.a(d.class), qoi0.a(g.class), qoi0.a(wcn.class), qoi0.a(ru.yandex.taxi.delegates.b.class), qoi0.a(d6w0.class), qoi0.a(j0w0.class), qoi0.a(ozv0.class), qoi0.a(odn.class), qoi0.a(a.class), qoi0.a(com.yandex.go.superapp.biometrics.a.class), qoi0.a(ycn.class));
        for (Object obj : objArr) {
            if (obj != null) {
                Iterator it = g.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Class a = ((zzb) ((lfx) it.next())).a();
                    if (a.isInstance(obj)) {
                        i++;
                        if (this.w.put(a, obj) != null) {
                            ny61.g(oyr.p("Multiple implementations for ", a.getSimpleName(), " not supported"));
                            throw null;
                        }
                    }
                }
                if (i == 0) {
                    ny61.g(obj.getClass().getSimpleName().concat(" not implement any of supported delegate"));
                    throw null;
                }
            }
        }
    }

    public final fho m() {
        return (fho) this.w.get(fho.class);
    }
}
