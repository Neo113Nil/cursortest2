package xsna;

import com.vk.catalog.mvi.block.impl.banner.BannerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class q36 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ xzs h;

    public /* synthetic */ q36(BannerView.b bVar, a8a a8aVar, BannerView.BannerViewState bannerViewState, izs izsVar, q630 q630Var, int i) {
        this.e = bVar;
        this.f = a8aVar;
        this.g = bannerViewState;
        this.h = izsVar;
        this.c = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((BannerView.b) this.e).c((a8a) this.f, (BannerView.BannerViewState) this.g, (izs) this.h, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                rgx.b((bi50) this.e, (wh50) this.f, (q630) this.c, (r5j0) this.g, (jai) this.h, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((plo0) this.e).a((gzs) this.f, (gzs) this.g, (x5) this.c, (izs) this.h, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ q36(bi50 bi50Var, wh50 wh50Var, q630 q630Var, r5j0 r5j0Var, jai jaiVar, int i) {
        this.e = bi50Var;
        this.f = wh50Var;
        this.c = q630Var;
        this.g = r5j0Var;
        this.h = jaiVar;
        this.d = i;
    }

    public /* synthetic */ q36(plo0 plo0Var, gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, int i) {
        this.e = plo0Var;
        this.f = gzsVar;
        this.g = gzsVar2;
        this.c = x5Var;
        this.h = izsVar;
        this.d = i;
    }
}
