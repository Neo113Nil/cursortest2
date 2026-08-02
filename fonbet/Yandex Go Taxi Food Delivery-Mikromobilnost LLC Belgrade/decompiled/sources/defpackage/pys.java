package defpackage;

import com.yandex.go.flex.common.facade.routers.a;
import com.yandex.go.flex.common.facade.routers.b;

/* loaded from: classes12.dex */
public final class pys extends h55 {
    public final rxm0 D;
    public final alm E;
    public fkr F;

    public pys(rxm0 rxm0Var, alm almVar) {
        super(null);
        this.D = rxm0Var;
        this.E = almVar;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.F = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        Object obj2 = (rhr) obj;
        if (obj2 instanceof nhr) {
            a aVar = (a) this.E.get();
            this.F = aVar;
            D(aVar, (nhr) obj2, new oys(this, 0));
        } else {
            if (!(obj2 instanceof qhr)) {
                w511.b();
                return;
            }
            b bVar = (b) this.D.get();
            this.F = bVar;
            D(bVar, (qhr) obj2, new oys(this, 1));
        }
    }
}
