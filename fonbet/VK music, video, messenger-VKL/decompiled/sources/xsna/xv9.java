package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vk.metrics.performance.scroll.ScrollScreenType;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class xv9 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xv9(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.f = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                yv9.a((CartItem.a) this.f, (izs) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ox9.b((CartItem.c) this.f, (izs) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                bpj.b((q630) this.d, (mnj) this.f, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1), this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                nu80.f((ofi0) this.f, (izs) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((ow90) this.f).a((xvy) this.c, (ScrollScreenType) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                dcm0.c((String) this.f, (Cell$Middle.Size) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ xv9(q630 q630Var, mnj mnjVar, izs izsVar, int i, int i2) {
        this.b = 2;
        this.d = q630Var;
        this.f = mnjVar;
        this.c = izsVar;
        this.e = i2;
    }
}
