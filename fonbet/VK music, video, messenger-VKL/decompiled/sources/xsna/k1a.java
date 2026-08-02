package xsna;

import com.vk.catalog.mvi.block.video.impl.catalog.banner.CatalogBannerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class k1a implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ izs c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ k1a(CatalogBannerView.a aVar, a8a a8aVar, CatalogBannerView.BannerViewState bannerViewState, izs izsVar, ksr ksrVar, q630 q630Var, int i) {
        this.f = aVar;
        this.g = a8aVar;
        this.h = bannerViewState;
        this.c = izsVar;
        this.i = ksrVar;
        this.d = q630Var;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((CatalogBannerView.a) this.f).b((a8a) this.g, (CatalogBannerView.BannerViewState) this.h, this.c, (ksr) this.i, this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                njk.a(this.f, this.c, this.d, (phr) this.g, (String) this.h, (jai) this.i, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ k1a(Object obj, izs izsVar, q630 q630Var, phr phrVar, String str, jai jaiVar, int i) {
        this.f = obj;
        this.c = izsVar;
        this.d = q630Var;
        this.g = phrVar;
        this.h = str;
        this.i = jaiVar;
        this.e = i;
    }
}
