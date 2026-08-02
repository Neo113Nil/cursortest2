package xsna;

import com.vk.ecomm.orders.impl.order.presentation.mvi.OrderAction;
import xsna.an50;

/* compiled from: OrderStore.kt */
/* loaded from: classes18.dex */
public final class lx80 implements ix80, mm50<gx80, OrderAction, com.vk.ecomm.orders.impl.order.presentation.mvi.c> {
    public final /* synthetic */ mm50<gx80, OrderAction, com.vk.ecomm.orders.impl.order.presentation.mvi.c> b;

    public lx80(final qd80 qd80Var, final bfm bfmVar) {
        this.b = new ql50((aqw) null, 7).a(an50.a.a(new j18() { // from class: xsna.jx80
            @Override // xsna.gzs
            public final Object invoke() {
                return new com.vk.ecomm.orders.impl.order.presentation.mvi.b(bfm.this);
            }
        }, mx80.b, nx80.b, new t5o0() { // from class: xsna.kx80
            @Override // xsna.izs
            /* renamed from: m */
            public final mn50 invoke(nn50 nn50Var) {
                return new com.vk.ecomm.orders.impl.order.presentation.mvi.g(nn50Var, qd80.this);
            }
        }));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super gx80, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super com.vk.ecomm.orders.impl.order.presentation.mvi.c, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(OrderAction orderAction) {
        this.b.b(orderAction);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.d2h0
    public final gx80 e() {
        return this.b.getCurrentState();
    }

    @Override // xsna.mm50
    public final gx80 getCurrentState() {
        return this.b.getCurrentState();
    }
}
