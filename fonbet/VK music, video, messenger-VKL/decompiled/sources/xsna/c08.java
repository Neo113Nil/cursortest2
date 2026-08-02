package xsna;

import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import xsna.an50;
import xsna.uk50;

/* compiled from: BookingStartScreenStore.kt */
/* loaded from: classes18.dex */
public final class c08 implements yz7, mm50<com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.k, com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a, com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d> {
    public final /* synthetic */ um50 b;

    public c08(final az7 az7Var, final BookingScreenParams bookingScreenParams, final mzp0 mzp0Var, final l9 l9Var) {
        an50 a = an50.a.a(new j18() { // from class: xsna.zz7
            @Override // xsna.gzs
            public final Object invoke() {
                return new com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.c(BookingScreenParams.this, l9Var);
            }
        }, new wb0() { // from class: xsna.a08
            @Override // xsna.izs
            /* renamed from: j */
            public final qj50 invoke(sj50 sj50Var) {
                return new com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.b(BookingScreenParams.this, sj50Var);
            }
        }, d08.b, new t5o0() { // from class: xsna.b08
            @Override // xsna.izs
            /* renamed from: m */
            public final mn50 invoke(nn50 nn50Var) {
                az7 az7Var2 = az7.this;
                return new com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.n(nn50Var, az7Var2.a, az7Var2.b, az7Var2.c, mzp0Var);
            }
        });
        this.b = new um50(a.a, a.b, a.c, a.d, a.e, uk50.a.a);
    }

    @Override // xsna.mm50
    public final uic G(izs<? super com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.k, s3q0> izsVar) {
        return this.b.e.a(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d, s3q0> izsVar) {
        return this.b.d.a(izsVar);
    }

    @Override // xsna.mm50
    public final void b(com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a aVar) {
        this.b.b(aVar);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.d2h0
    public final com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.k e() {
        return (com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.k) this.b.e.b();
    }

    @Override // xsna.mm50
    public final com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.k getCurrentState() {
        return (com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.k) this.b.e.b();
    }
}
