package defpackage;

import com.yandex.go.taxi.order.e0;
import com.yandex.go.taxi.order.g0;
import com.yandex.go.taxi.order.models.api.objects.ReorderInfo;
import com.yandex.go.taxi.order.y;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class oit implements szi0 {
    public final /* synthetic */ pit a;
    public final /* synthetic */ o2y0 b;

    public oit(pit pitVar, o2y0 o2y0Var) {
        this.a = pitVar;
        this.b = o2y0Var;
    }

    public final void a(ReorderInfo.ReorderOption reorderOption) {
        pit pitVar = this.a;
        nzi0 nzi0Var = pitVar.a.v;
        nzi0Var.getClass();
        nzi0Var.a.a("reorder.accept", new HashMap(), 1, new HashMap());
        y yVar = (y) pitVar.c.get();
        o2y0 o2y0Var = this.b;
        String str = o2y0Var.b().a;
        String str2 = reorderOption.a;
        nit nitVar = new nit(0, o2y0Var);
        bpt0 i = yVar.i(str);
        if (i == null) {
            a3y0.d(yVar.p, "reorder", null, new c680(8), 2);
            return;
        }
        fag fagVar = (fag) i;
        ((e0) fagVar.b()).d();
        ((g0) fagVar.z.get()).b(str2, new r780(nitVar, yVar));
    }
}
