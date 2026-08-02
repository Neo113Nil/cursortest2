package defpackage;

import com.yandex.mapkit.geometry.Polyline;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.yandex.taxi.layers.presentation.i;
import ru.yandex.taxi.layers.source.factory.a;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes9.dex */
public final class i5e0 implements h5e0 {
    public final /* synthetic */ i a;

    public i5e0(i iVar) {
        this.a = iVar;
    }

    @Override // defpackage.h5e0
    public final void P(Map map) {
        i iVar = this.a;
        xm00 xm00Var = iVar.w;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Iterator it = xm00Var.n().iterator();
        while (it.hasNext()) {
            ap00 ap00Var = (ap00) it.next();
            x4e0 x4e0Var = (x4e0) ap00Var.d;
            x4e0 x4e0Var2 = (x4e0) ((LinkedHashMap) map).get(x4e0Var.b());
            if (x4e0Var2 == null || !x4e0Var2.h().equals(x4e0Var.h())) {
                ap00Var.d();
            } else {
                linkedHashMap.remove(x4e0Var2.b());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            x4e0 x4e0Var3 = (x4e0) ((Map.Entry) it2.next()).getValue();
            float j = ((gh00) ((ah00) iVar.b)).j();
            Polyline i = k.i(x4e0Var3.a());
            if (i != null) {
                w4e0 s = xm00Var.s(i);
                s.v(false);
                s.C(Integer.valueOf(x4e0Var3.e()));
                s.p(x4e0Var3.f());
                s.h(x4e0Var3);
                s.k(x4e0Var3.i());
                s.i(a.d(x4e0Var3.j(), j));
                s.z(x4e0Var3.d());
                s.y(x4e0Var3.c());
                s.D(x4e0Var3.g());
            }
        }
    }

    @Override // defpackage.h5e0
    public final void hide() {
        this.a.w.m();
    }
}
