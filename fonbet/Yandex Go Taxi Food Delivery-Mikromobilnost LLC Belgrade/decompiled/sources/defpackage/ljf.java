package defpackage;

import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes14.dex */
public final class ljf implements ggi0 {
    public final nz2 a;
    public final cr00 b;
    public final o2y0 c;

    public ljf(nz2 nz2Var, cr00 cr00Var, o2y0 o2y0Var) {
        this.a = nz2Var;
        this.b = cr00Var;
        this.c = o2y0Var;
    }

    @Override // defpackage.ggi0
    public final void f(fi6 fi6Var, List list) {
        List list2;
        MapRouteParametersDto o = this.c.b().o();
        if (o == null) {
            return;
        }
        jsq0 jsq0Var = o.c;
        if (jsq0Var != null) {
            list2 = a.M(jsq0Var);
            if (list2.isEmpty()) {
                return;
            }
        } else {
            list2 = null;
        }
        int a = this.b.a();
        nz2 nz2Var = this.a;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                int i = kjf.a[((MapRouteParametersDto.ZoomableObjectType) it.next()).ordinal()];
                if (i == 1) {
                    nz2Var.e(fi6Var, true);
                } else if (i == 2) {
                    nz2Var.d(fi6Var);
                } else {
                    if (i != 3) {
                        w511.b();
                        return;
                    }
                    nz2Var.a(fi6Var);
                }
            }
        }
        nz2Var.getClass();
        nz2.c(fi6Var, a);
    }
}
