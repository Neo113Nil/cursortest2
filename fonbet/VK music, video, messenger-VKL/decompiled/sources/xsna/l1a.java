package xsna;

import com.vk.catalog.mvi.block.video.impl.catalog.banner.CatalogBannerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class l1a implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l1a(int i, int i2, Object obj, izs izsVar, q630 q630Var) {
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
                m1a.a((CatalogBannerView.BannerViewState) this.f, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.e | 1);
                q4c.a((p4c) this.f, this.c, this.d, (androidx.compose.runtime.a) obj, I2);
                break;
        }
        return s3q0.a;
    }
}
