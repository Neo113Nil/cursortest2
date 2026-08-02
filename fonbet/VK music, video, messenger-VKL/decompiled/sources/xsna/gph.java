package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.ecomm.design.view.tile.MarketProductTilePaginatedImagesView;
import com.vk.profile.community.impl.ui.profile.actions.d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class gph implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gph(int i, MarketProductTilePaginatedImagesView marketProductTilePaginatedImagesView) {
        this.c = i;
        this.d = marketProductTilePaginatedImagesView;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ImageSize Cb;
        int i = this.b;
        String str = null;
        Object obj2 = this.d;
        int i2 = this.c;
        switch (i) {
            case 0:
                ((hph) obj2).b.invoke(new d.c.a(i2, 4, null));
                break;
            default:
                MarketProductTilePaginatedImagesView marketProductTilePaginatedImagesView = (MarketProductTilePaginatedImagesView) obj2;
                MarketProductTilePaginatedImagesView marketProductTilePaginatedImagesView2 = (MarketProductTilePaginatedImagesView) obj;
                if (i2 < 0) {
                    int i3 = MarketProductTilePaginatedImagesView.l;
                } else if (i2 < marketProductTilePaginatedImagesView.f.size()) {
                    Image image = marketProductTilePaginatedImagesView.f.get(i2).a;
                    if (image != null && (Cb = image.Cb(marketProductTilePaginatedImagesView2.getWidth(), true, false)) != null) {
                        str = Cb.d.d;
                    }
                    if (!mcr0.p(str)) {
                        hg1.b(marketProductTilePaginatedImagesView, mcr0.s(str).subscribe());
                    }
                    break;
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ gph(hph hphVar, int i) {
        this.d = hphVar;
        this.c = i;
    }
}
