package xsna;

import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;
import com.vk.dto.photo.Photo;
import com.vk.newsfeed.posting.market_picker.presentation.base.view.e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ba10 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ba10(Object obj, int i, Object obj2, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
        this.e = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Photo photo;
        switch (this.b) {
            case 0:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.f fVar = (com.vk.newsfeed.posting.market_picker.presentation.base.view.f) this.d;
                e.c cVar = (e.c) this.e;
                Photo photo2 = (Photo) obj;
                e.b bVar = fVar.u;
                if ((bVar != null ? bVar.b : null) != null && bVar != null && (photo = bVar.b.l) != null && photo.c == photo2.c) {
                    fVar.c(this.c, cVar);
                }
                return s3q0.a;
            default:
                return myc0.h(((dwj) obj).getScope(), null, null, new ecb0((vcb0) this.d, this.c, (CatalogLinkButtonActionDo.ToggleAlbumShuffle) this.e, null), 3);
        }
    }
}
