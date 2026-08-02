package defpackage;

import android.graphics.PointF;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class l0k {
    public static oe20 a(nir0 nir0Var) {
        if (nir0Var instanceof lir0) {
            return new le20(new rkj(Integer.valueOf(((lir0) nir0Var).a)));
        }
        if ((nir0Var instanceof mir0) || nir0Var == null) {
            return me20.a;
        }
        w511.b();
        return null;
    }

    public static fe20 b(tgc tgcVar) {
        if (tgcVar instanceof lgc) {
            lgc lgcVar = (lgc) tgcVar;
            List b = lgcVar.b();
            ArrayList arrayList = new ArrayList(tcc.n(b, 10));
            Iterator it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(c((hgc) it.next()));
            }
            ogc d = lgcVar.d();
            PointF pointF = new PointF((float) d.a(), (float) d.b());
            ogc c = lgcVar.c();
            return new be20(arrayList, pointF, new PointF((float) c.a(), (float) c.b()));
        }
        if (!(tgcVar instanceof rgc)) {
            if (jl40.l(tgcVar, sgc.INSTANCE) || tgcVar == null) {
                return ie20.a;
            }
            w511.b();
            return null;
        }
        rgc rgcVar = (rgc) tgcVar;
        List c2 = rgcVar.c();
        ArrayList arrayList2 = new ArrayList(tcc.n(c2, 10));
        Iterator it2 = c2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c((hgc) it2.next()));
        }
        ogc b2 = rgcVar.b();
        return new de20(arrayList2, new PointF((float) b2.a(), (float) b2.b()));
    }

    public static qe20 c(hgc hgcVar) {
        Integer a = khc.a(hgcVar.a());
        if (a != null) {
            return new qe20(a.intValue(), (float) hgcVar.b());
        }
        skd0.c(PlusLogTag.SDK, "Error with parse color=" + hgcVar.a(), null);
        return new qe20(0, (float) hgcVar.b());
    }
}
