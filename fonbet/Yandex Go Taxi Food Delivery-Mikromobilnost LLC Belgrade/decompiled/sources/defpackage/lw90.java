package defpackage;

import com.yandex.go.payments.domain.i0;
import com.yandex.go.zone.model.Zone;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class lw90 {
    public final b8r a;
    public final g8a0 b;
    public final i0 c;

    public lw90(b8r b8rVar, g8a0 g8a0Var, i0 i0Var) {
        this.a = b8rVar;
        this.b = g8a0Var;
        this.c = i0Var;
    }

    public static /* synthetic */ kw90 c(lw90 lw90Var, Zone zone, n65[] n65VarArr, int i) {
        if ((i & 1) != 0) {
            zone = lw90Var.c.a();
        }
        return lw90Var.b(zone, xw91.b, n65VarArr);
    }

    public final kw90 a(n65... n65VarArr) {
        c2r0 c2r0Var = new c2r0(2, 1);
        c2r0Var.a(new s6h());
        c2r0Var.b(n65VarArr);
        ArrayList arrayList = c2r0Var.b;
        return new kw90((n65[]) arrayList.toArray(new n65[arrayList.size()]));
    }

    public final kw90 b(Zone zone, ka4 ka4Var, n65... n65VarArr) {
        c2r0 c2r0Var = new c2r0(5, 1);
        c2r0Var.a(new hw90(zone));
        c2r0Var.a(new ew90());
        c2r0Var.a(new s6h());
        c2r0Var.a(new oa4(this.b, this.a, ka4Var));
        c2r0Var.b(n65VarArr);
        ArrayList arrayList = c2r0Var.b;
        return new kw90((n65[]) arrayList.toArray(new n65[arrayList.size()]));
    }
}
