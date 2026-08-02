package defpackage;

import com.yandex.div.core.downloader.a;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class f3l {
    public final z2l a;
    public final yvf0 b;

    public f3l(z2l z2lVar, yvf0 yvf0Var) {
        this.a = z2lVar;
        this.b = yvf0Var;
    }

    public final omk a(omk omkVar, zmk zmkVar, y2l y2lVar, rvo rvoVar, Div2View div2View) {
        z2l z2lVar = this.a;
        z2lVar.getClass();
        g3l g3lVar = new g3l(y2lVar);
        z2lVar.a.put(zmkVar, g3lVar);
        ArrayList g = new a(g3lVar, new e3l(div2View, 0)).g(omkVar.c, rvoVar);
        if (g == null) {
            z2lVar.a.remove(zmkVar);
            return null;
        }
        return new omk(null, omkVar.b, g, omkVar.d, null, omkVar.f, omkVar.g, null, 145);
    }

    public final LinkedHashMap b(aw5 aw5Var, String str) {
        List a = this.a.a(aw5Var.a.getDataTag(), str);
        if (a == null) {
            return null;
        }
        List list = a;
        int d = gw00.d(tcc.n(list, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : list) {
            linkedHashMap.put(obj, ((z2k) this.b.get()).a((m3k) obj, aw5Var, aw5Var.a.getCurrentRootPath$div_release()));
        }
        return linkedHashMap;
    }
}
