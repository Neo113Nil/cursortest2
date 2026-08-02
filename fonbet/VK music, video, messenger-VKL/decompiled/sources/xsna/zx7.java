package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt;
import kotlin.NoWhenBranchMatchedException;
import xsna.pf60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class zx7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ zx7(Object obj, Object obj2, Object obj3, Object obj4, xzs xzsVar, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = xzsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                BookingServicesScreenKt.i((BookingServicesScreenState.ServiceWrapper) this.c, (BookingServiceType) this.d, (BookingServicesScreenState.b) this.e, (String) this.f, (izs) this.g, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                xqx.a((xrx) this.c, (arx) this.d, (gzs) this.e, (q630) this.f, (gzs) this.g, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                d64 d64Var = (d64) this.c;
                d64 d64Var2 = (d64) this.d;
                d64 d64Var3 = (d64) this.e;
                d64 d64Var4 = (d64) this.f;
                d64 d64Var5 = (d64) this.g;
                rj50 rj50Var = (rj50) obj;
                pf60 pf60Var = (pf60) obj2;
                if (pf60Var instanceof pf60.d) {
                    return rj50Var.a(d64Var, pf60Var);
                }
                if (pf60Var instanceof pf60.b) {
                    return rj50Var.a(d64Var2, pf60Var);
                }
                if (pf60Var instanceof pf60.a) {
                    return rj50Var.a(d64Var3, pf60Var);
                }
                if (pf60Var instanceof pf60.c) {
                    return rj50Var.a(d64Var4, pf60Var);
                }
                if (pf60Var instanceof pf60.e) {
                    return rj50Var.a(d64Var5, pf60Var);
                }
                throw new NoWhenBranchMatchedException();
        }
    }

    public /* synthetic */ zx7(d64 d64Var, d64 d64Var2, d64 d64Var3, d64 d64Var4, d64 d64Var5) {
        this.b = 2;
        this.c = d64Var;
        this.d = d64Var2;
        this.e = d64Var3;
        this.f = d64Var4;
        this.g = d64Var5;
    }
}
