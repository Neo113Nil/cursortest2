package xsna;

import com.vk.libvideo.design.compose.base.preview.PreviewViewState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a6d0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a6d0(Object obj, Object obj2, q630 q630Var, int i, int i2) {
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
                com.vk.libvideo.design.compose.base.preview.c.w((PreviewViewState.t) this.e, (PreviewViewState.Size) this.f, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                com.vk.ecomm.market.good.ui.j jVar = (com.vk.ecomm.market.good.ui.j) this.e;
                gzs gzsVar = (gzs) this.f;
                ((Integer) obj2).getClass();
                jVar.f(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, gzsVar, this.c);
                break;
        }
        return s3q0.a;
    }
}
