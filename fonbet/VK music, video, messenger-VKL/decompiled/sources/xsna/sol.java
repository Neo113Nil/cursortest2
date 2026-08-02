package xsna;

import kotlin.Pair;
import xsna.jto0;
import xsna.sum0;
import xsna.wzq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class sol implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ xzs f;

    public /* synthetic */ sol(int i, int i2, Object obj, Object obj2, xzs xzsVar) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = xzsVar;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                vol.c((jdo0) this.d, (wco0) this.e, (gzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((ad0) this.d).e((Pair) this.e, (zzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                com.vk.ecomm.product_list.presentation.g.f((com.vk.ecomm.product_list.presentation.q) this.d, (q630) this.e, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((sum0) this.d).g((sum0.d) this.e, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((jto0) this.d).a((jto0.b) this.e, (i0b0) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((wzq0.b) this.d).e((String) this.e, (yzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }
}
