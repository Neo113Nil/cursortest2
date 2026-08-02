package xsna;

import com.vk.ecomm.market.goodpreview.domain.state.ProductPreviewError;
import java.util.List;
import xsna.api;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class s2 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s2(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((v2) this.d).h((api.a) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 1:
                ((Integer) obj2).getClass();
                xa5.a((ia5) this.d, (lg90) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(65));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ub70.a((String) this.d, (gzs) this.e, (gzs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ard0.a((ProductPreviewError) this.d, (gzs) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(433));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ihg0.a((String) this.d, (String) this.e, (gzs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((lrq0) this.d).a((List) this.e, (qvm0) this.c, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
        }
        return s3q0.a;
    }
}
