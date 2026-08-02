package xsna;

import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import xsna.unu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wx9 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ izs c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ wx9(izs izsVar, a.C0919a c0919a, CartItem.d.a.InterfaceC0923a.C0924a c0924a, q630 q630Var, int i) {
        this.c = izsVar;
        this.f = c0919a;
        this.g = c0924a;
        this.d = q630Var;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ay9.a(this.c, (a.C0919a) this.f, (CartItem.d.a.InterfaceC0923a.C0924a) this.g, this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((cou) this.f).h((unu.a) this.g, this.c, this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ wx9(cou couVar, unu.a aVar, izs izsVar, q630 q630Var, int i) {
        this.f = couVar;
        this.g = aVar;
        this.c = izsVar;
        this.d = q630Var;
        this.e = i;
    }
}
