package xsna;

import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import xsna.an50;
import xsna.uk50;

/* compiled from: BookingPreloaderStore.kt */
/* loaded from: classes18.dex */
public final class at7 implements us7, mm50<ss7, gs7, is7> {
    public final /* synthetic */ um50 b;

    public at7(final zq7 zq7Var, final hx7 hx7Var, final zu7 zu7Var, final BookingScreenParams bookingScreenParams, final com.vk.movika.sdk.base.ui.v vVar) {
        an50 a = an50.a.a(new j18() { // from class: xsna.ws7
            @Override // xsna.gzs
            public final Object invoke() {
                return new hs7(BookingScreenParams.this, vVar);
            }
        }, ys7.b, zs7.b, new t5o0() { // from class: xsna.xs7
            @Override // xsna.izs
            /* renamed from: m */
            public final mn50 invoke(nn50 nn50Var) {
                return new com.vk.ecomm.onlinebooking.impl.preloader.presentation.e(nn50Var, BookingScreenParams.this, zq7Var, hx7Var, zu7Var);
            }
        });
        this.b = new um50(a.a, a.b, a.c, a.d, a.e, uk50.a.a);
    }

    @Override // xsna.mm50
    public final uic G(izs<? super ss7, s3q0> izsVar) {
        return this.b.e.a(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super is7, s3q0> izsVar) {
        return this.b.d.a(izsVar);
    }

    @Override // xsna.mm50
    public final void b(gs7 gs7Var) {
        this.b.b(gs7Var);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.d2h0
    public final ss7 e() {
        return (ss7) this.b.e.b();
    }

    @Override // xsna.mm50
    public final ss7 getCurrentState() {
        return (ss7) this.b.e.b();
    }
}
