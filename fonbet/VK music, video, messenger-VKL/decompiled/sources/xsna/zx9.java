package xsna;

import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import xsna.dz40;
import xsna.hzg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class zx9 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zx9(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.e = obj2;
        this.f = obj3;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ay9.e((izs) this.c, (a.C0919a) this.e, (CartItem.d.a) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                zja.a((String) this.e, (cka) this.f, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                hzg.a aVar = (hzg.a) this.e;
                izs izsVar = (izs) this.c;
                q630 q630Var = (q630) this.f;
                ((Integer) obj2).getClass();
                pyg.b(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, aVar, izsVar, q630Var);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ybo.d((cco) this.c, (gzs) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((cic0) this.c).l((String) this.e, (gzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                ((a020) this.c).e((String) this.e, (yzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                due0.a((dz40.h) this.e, (izs) this.c, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ zx9(int i, int i2, Object obj, izs izsVar, q630 q630Var) {
        this.b = i2;
        this.e = obj;
        this.c = izsVar;
        this.f = q630Var;
        this.d = i;
    }

    public /* synthetic */ zx9(String str, cka ckaVar, izs izsVar, int i) {
        this.b = 1;
        this.e = str;
        this.f = ckaVar;
        this.c = izsVar;
        this.d = i;
    }

    public /* synthetic */ zx9(izs izsVar, a.C0919a c0919a, CartItem.d.a aVar, int i) {
        this.b = 0;
        this.c = izsVar;
        this.e = c0919a;
        this.f = aVar;
        this.d = i;
    }
}
