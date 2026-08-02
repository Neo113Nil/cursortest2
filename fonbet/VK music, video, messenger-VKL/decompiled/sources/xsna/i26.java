package xsna;

import com.vk.catalog.mvi.block.impl.banner.BannerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class i26 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ xzs g;

    public /* synthetic */ i26(int i, int i2, Object obj, xzs xzsVar, q630 q630Var, boolean z) {
        this.b = i2;
        this.f = obj;
        this.c = z;
        this.g = xzsVar;
        this.d = q630Var;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                j26.a((BannerView.BannerViewState) this.f, this.c, (izs) this.g, this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                s050.c((bi40) this.f, this.c, (gzs) this.g, this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
        }
        return s3q0.a;
    }
}
