package xsna;

import android.content.Context;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import xsna.cxl;
import xsna.wwf;

/* compiled from: DeliveryPointsMap.kt */
/* loaded from: classes18.dex */
public final class exl implements hl00 {
    public final izs<cxl, s3q0> a;
    public final Context b;
    public final wh50<wwf<lwl>> c;

    /* JADX WARN: Multi-variable type inference failed */
    public exl(izs<? super cxl, s3q0> izsVar, Context context, wh50<wwf<lwl>> wh50Var) {
        this.a = izsVar;
        this.b = context;
        this.c = wh50Var;
    }

    @Override // xsna.hl00
    public final boolean c(qdr0 qdr0Var) {
        wwf<lwl> value = this.c.getValue();
        if (value != null) {
            return value.c(qdr0Var);
        }
        return false;
    }

    @Override // xsna.hl00
    public final void d(gk9 gk9Var, v0w0 v0w0Var) {
        this.a.invoke(new cxl.r(gk9Var, v0w0Var));
        wwf<lwl> value = this.c.getValue();
        if (value != null) {
            value.a();
        }
    }

    @Override // xsna.hl00
    public final void e(ndr0 ndr0Var) {
        this.a.invoke(cxl.k.b.b);
        vj00 vj00Var = ofx.a;
        if (vj00Var == null) {
            vj00Var = null;
        }
        vj00Var.getClass();
        Context context = this.b;
        kbr0 kbr0Var = new kbr0(context, ndr0Var);
        vj00 vj00Var2 = ofx.a;
        (vj00Var2 != null ? vj00Var2 : null).getClass();
        kbr0Var.o(new rwl(new axf(context, ndr0Var, kbr0Var)));
        kbr0Var.m(new wwf.a() { // from class: xsna.dxl
            @Override // xsna.wwf.a
            public final boolean a(xwf xwfVar) {
                izs<cxl, s3q0> izsVar = exl.this.a;
                edr0 edr0Var = xwfVar.a;
                izsVar.invoke(new cxl.d(new Coordinates(edr0Var.a, edr0Var.b)));
                return true;
            }
        });
        kbr0Var.n(new q9(this, 5));
        this.c.setValue(kbr0Var);
    }

    @Override // xsna.hl00
    public final void f() {
        this.a.invoke(cxl.q.b);
    }
}
