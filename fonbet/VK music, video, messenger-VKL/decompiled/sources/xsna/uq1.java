package xsna;

import com.vk.catalog.mvi.block.CatalogBlockReorderState$ReorderData$Album;
import com.vk.catalog.mvi.block.video.impl.albums.AlbumsSliderView$AlbumVerticalState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.dto.video.VideoAlbum;
import kotlin.coroutines.d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class uq1 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ uq1(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj;
                UIBlock uIBlock = (UIBlock) obj2;
                if (!(uIBlock instanceof UIBlockVideoAlbum)) {
                    return null;
                }
                UIBlockVideoAlbum uIBlockVideoAlbum = (UIBlockVideoAlbum) uIBlock;
                VideoAlbum Pb = uIBlockVideoAlbum.Pb();
                return new AlbumsSliderView$AlbumVerticalState(com.vk.catalog.mvi.block.a.b(Pb.getId(), uIBlock.w()), catalogBlockVariant, new CatalogBlockReorderState$ReorderData$Album(Pb.q().b, Pb.getId()), Pb, uIBlockVideoAlbum.Tb(), Pb.getImage(), uIBlockVideoAlbum.Sb());
            default:
                kqo0 kqo0Var = (kqo0) obj;
                d.b bVar = (d.b) obj2;
                if (kqo0Var != null) {
                    return kqo0Var;
                }
                if (bVar instanceof kqo0) {
                    return (kqo0) bVar;
                }
                return null;
        }
    }
}
