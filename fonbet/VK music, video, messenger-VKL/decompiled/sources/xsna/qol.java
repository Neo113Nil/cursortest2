package xsna;

import com.vk.ecomm.product_list.presentation.q;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class qol implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qol(Object obj, xzs xzsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = xzsVar;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                vol.d((q630) this.d, (jai) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                sku.i((izs) this.d, (wh50) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                i1b0 i1b0Var = (i1b0) this.d;
                jai jaiVar = (jai) this.e;
                ((Integer) obj2).getClass();
                i1b0Var.g(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, jaiVar);
                break;
            default:
                ((Integer) obj2).intValue();
                com.vk.ecomm.product_list.presentation.g.d((q.d) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qol(izs izsVar, wh50 wh50Var, int i) {
        this.b = 1;
        this.d = izsVar;
        this.e = wh50Var;
        this.c = i;
    }
}
