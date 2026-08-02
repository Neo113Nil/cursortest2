package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes14.dex */
public final class lkg0 implements okg0 {
    public final /* synthetic */ nkg0 a;

    public lkg0(nkg0 nkg0Var) {
        this.a = nkg0Var;
    }

    @Override // defpackage.okg0
    public final void Da(List list, zzs zzsVar, pkg0 pkg0Var) {
        fi6 fi6Var = new fi6();
        fi6Var.e(list);
        BoundingBox h = fi6Var.h(a.F(zzsVar));
        nkg0 nkg0Var = this.a;
        ah00 ah00Var = (ah00) nkg0Var.b;
        ((gh00) ah00Var).g.g(h, pkg0Var, 400.0f, null);
        Iterator it = nkg0Var.y.B.iterator();
        while (it.hasNext()) {
            n58 n58Var = ((m58) it.next()).d;
            if (n58Var != null) {
                n58Var.c(((gh00) ah00Var).j() * 1.0f);
            }
        }
    }

    @Override // defpackage.okg0
    public final void We(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m58 m58Var = (m58) it.next();
            nkg0 nkg0Var = this.a;
            xm00 xm00Var = nkg0Var.B;
            n58 n58Var = m58Var.d;
            if (n58Var == null) {
                n58Var = new n58(xm00Var.r(m58Var.c), nkg0Var.z, m58Var.b, xm00Var);
            }
            n58Var.c(((gh00) ((ah00) nkg0Var.b)).j() * 1.0f);
            m58Var.d = n58Var;
            pb30 pb30Var = n58Var.d;
            if (pb30Var.x != null) {
                n58Var.a(pb30Var);
            }
        }
    }
}
