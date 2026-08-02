package xsna;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutCell$State;
import com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutCell$Type;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ao7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ao7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                alk.a((gzs) this.c, (gzs) this.d, (izs) this.e, (BookingServiceType) this.f, (SemanticsConfiguration) this.g, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                p7c.a((CheckoutCell$Type) this.c, (CheckoutCell$State) this.d, (String) this.e, (String) this.f, (q630) this.g, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                fjd0.a((hmd0) this.d, (izs) this.e, (izs) this.f, (gzs) this.c, (q630) this.g, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ao7(hmd0 hmd0Var, izs izsVar, izs izsVar2, gzs gzsVar, q630 q630Var, int i) {
        this.b = 2;
        this.d = hmd0Var;
        this.e = izsVar;
        this.f = izsVar2;
        this.c = gzsVar;
        this.g = q630Var;
    }
}
