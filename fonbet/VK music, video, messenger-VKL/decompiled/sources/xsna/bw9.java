package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class bw9 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bw9(Object obj, Object obj2, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                cw9.a((CartItem.b) this.e, (izs) this.f, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int I2 = ne7.I(this.d | 1);
                ((hna) this.e).a((spg0) this.f, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int I3 = ne7.I(this.d | 1);
                ((uf40) this.e).a((spg0) this.f, this.c, (androidx.compose.runtime.a) obj, I3);
                break;
            default:
                ((Integer) obj2).getClass();
                int I4 = ne7.I(this.d | 1);
                ecm0.b((String) this.e, (Cell$Middle.Size) this.f, this.c, (androidx.compose.runtime.a) obj, I4);
                break;
        }
        return s3q0.a;
    }
}
