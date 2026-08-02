package xsna;

import com.vk.libvideo.design.compose.base.preview.PreviewViewState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class x2d implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x2d(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                y2d y2dVar = (y2d) this.d;
                jai jaiVar = (jai) this.e;
                ((Integer) obj2).getClass();
                y2dVar.z(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, jaiVar);
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.preview.c.x((PreviewViewState.u) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                com.vk.ecomm.product_list.presentation.g.e((com.vk.ecomm.product_list.presentation.q) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                gzs gzsVar = (gzs) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                phe0.a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                break;
        }
        return s3q0.a;
    }
}
