package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class py9 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ py9(int i, int i2, Object obj, izs izsVar, q630 q630Var) {
        this.b = i2;
        this.f = obj;
        this.c = izsVar;
        this.d = q630Var;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.e | 1);
                ry9.a((CartItem.Summary) this.f, (izs) this.c, this.d, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.e | 1);
                b3c.a((c3c) this.f, (izs) this.c, this.d, (androidx.compose.runtime.a) obj, I2);
                break;
            default:
                ((Integer) obj2).intValue();
                int I3 = ne7.I(this.e | 1);
                ((h6v) this.f).c(this.d, (Cell$Middle.Size) this.c, (androidx.compose.runtime.a) obj, I3);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ py9(h6v h6vVar, q630 q630Var, Cell$Middle.Size size, int i) {
        this.b = 2;
        this.f = h6vVar;
        this.d = q630Var;
        this.c = size;
        this.e = i;
    }
}
