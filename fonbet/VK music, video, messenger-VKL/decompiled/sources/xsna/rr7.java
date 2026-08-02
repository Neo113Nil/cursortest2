package xsna;

import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import xsna.an50;
import xsna.uk50;

/* compiled from: BookingMastersScreenStore.kt */
/* loaded from: classes18.dex */
public final class rr7 implements or7, mm50<nr7, com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.a, com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.d> {
    public final /* synthetic */ um50 b;

    public rr7(final zq7 zq7Var, final BookingScreenParams bookingScreenParams, final mzp0 mzp0Var, final nh nhVar) {
        an50 a = an50.a.a(new j18() { // from class: xsna.pr7
            @Override // xsna.gzs
            public final Object invoke() {
                return new com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.c(BookingScreenParams.this, nhVar);
            }
        }, sr7.b, tr7.b, new t5o0() { // from class: xsna.qr7
            @Override // xsna.izs
            /* renamed from: m */
            public final mn50 invoke(nn50 nn50Var) {
                return new com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.h(nn50Var, zq7.this, mzp0Var);
            }
        });
        this.b = new um50(a.a, a.b, a.c, a.d, a.e, uk50.a.a);
    }

    @Override // xsna.mm50
    public final uic G(izs<? super nr7, s3q0> izsVar) {
        return this.b.e.a(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.d, s3q0> izsVar) {
        return this.b.d.a(izsVar);
    }

    @Override // xsna.mm50
    public final void b(com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.a aVar) {
        this.b.b(aVar);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.d2h0
    public final nr7 e() {
        return (nr7) this.b.e.b();
    }

    @Override // xsna.mm50
    public final nr7 getCurrentState() {
        return (nr7) this.b.e.b();
    }
}
