package xsna;

import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import xsna.an50;
import xsna.uk50;

/* compiled from: BookingServiceScreenStore.kt */
/* loaded from: classes18.dex */
public final class ax7 implements ww7, mm50<BookingServicesScreenState, com.vk.ecomm.onlinebooking.impl.services.presentation.a, com.vk.ecomm.onlinebooking.impl.services.presentation.c> {
    public final /* synthetic */ um50 b;

    public ax7(final BookingScreenParams bookingScreenParams, final mzp0 mzp0Var, final mx7 mx7Var, final f20 f20Var) {
        an50 a = an50.a.a(new j18() { // from class: xsna.xw7
            @Override // xsna.gzs
            public final Object invoke() {
                return new lx7(BookingScreenParams.this, mx7Var.a, f20Var);
            }
        }, new wb0() { // from class: xsna.yw7
            @Override // xsna.izs
            /* renamed from: j */
            public final qj50 invoke(sj50 sj50Var) {
                return new com.vk.ecomm.onlinebooking.impl.services.presentation.b(mx7.this.a, bookingScreenParams, sj50Var);
            }
        }, bx7.b, new t5o0() { // from class: xsna.zw7
            @Override // xsna.izs
            /* renamed from: m */
            public final mn50 invoke(nn50 nn50Var) {
                mx7 mx7Var2 = mx7Var;
                return new com.vk.ecomm.onlinebooking.impl.services.presentation.j(nn50Var, mzp0.this, mx7Var2.b, mx7Var2.c);
            }
        });
        this.b = new um50(a.a, a.b, a.c, a.d, a.e, uk50.a.a);
    }

    @Override // xsna.mm50
    public final uic G(izs<? super BookingServicesScreenState, s3q0> izsVar) {
        return this.b.e.a(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super com.vk.ecomm.onlinebooking.impl.services.presentation.c, s3q0> izsVar) {
        return this.b.d.a(izsVar);
    }

    @Override // xsna.mm50
    public final void b(com.vk.ecomm.onlinebooking.impl.services.presentation.a aVar) {
        this.b.b(aVar);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.d2h0
    public final BookingServicesScreenState e() {
        return (BookingServicesScreenState) this.b.e.b();
    }

    @Override // xsna.mm50
    public final BookingServicesScreenState getCurrentState() {
        return (BookingServicesScreenState) this.b.e.b();
    }
}
