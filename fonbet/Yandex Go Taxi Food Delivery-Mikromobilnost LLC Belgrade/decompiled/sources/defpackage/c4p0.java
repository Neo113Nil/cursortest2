package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes6.dex */
public final class c4p0 extends r8 {
    public xm00 c;
    public final int w;
    public final int x;
    public final float y;

    public c4p0(ah00 ah00Var, zuj0 zuj0Var) {
        super(5, ah00Var);
        avj0 avj0Var = (avj0) zuj0Var;
        this.w = avj0Var.a(xqg0.transparent);
        this.x = avj0Var.a(vqg0.scooters_fix_area_stroke);
        this.y = avj0Var.b(msg0.scooters_fix_area_stroke_width);
    }

    public final void Hg() {
        xm00 xm00Var = this.c;
        if (xm00Var != null) {
            ((gh00) ((ah00) this.b)).i.o(xm00Var);
            this.c = null;
        }
    }

    public final void Ig(List list) {
        Hg();
        if (list.isEmpty()) {
            return;
        }
        List<zzs> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (zzs zzsVar : list2) {
            arrayList.add(new Point(zzsVar.a, zzsVar.b));
        }
        Polygon j = k.j(arrayList, EmptyList.a);
        if (j == null) {
            return;
        }
        xm00 p = ((gh00) ((ah00) this.b)).i.p();
        n3e0 n3e0Var = new n3e0(j);
        n3e0Var.b(p);
        n3e0Var.r(this.w);
        n3e0Var.u(this.x);
        n3e0Var.p(this.y);
        this.c = p;
    }
}
