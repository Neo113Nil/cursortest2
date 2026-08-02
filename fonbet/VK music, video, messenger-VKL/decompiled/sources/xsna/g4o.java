package xsna;

import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.ecomm.product_list.presentation.q;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class g4o implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g4o(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((cbb) this.d).e((yzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((qep) this.d).c((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                com.vk.ecomm.product_list.presentation.g.a((q.b) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((TopBar$Middle.a) this.d).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                q630 q630Var = (q630) this.d;
                izs izsVar = (izs) this.e;
                ((Integer) obj2).getClass();
                vyu0.c(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                break;
        }
        return s3q0.a;
    }
}
