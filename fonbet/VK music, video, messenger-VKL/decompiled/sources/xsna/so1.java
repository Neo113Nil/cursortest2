package xsna;

import com.vk.catalog.mvi.block.CatalogBlockReorderState$ReorderData$Album;
import com.vk.catalog.mvi.block.video.impl.albums.AlbumsListView$AlbumHorizontalState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockActionDnDReorder;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.dto.video.VideoAlbum;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class so1 implements wzs {
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj;
        UIBlock uIBlock = (UIBlock) obj2;
        UIBlockVideoAlbum uIBlockVideoAlbum = uIBlock instanceof UIBlockVideoAlbum ? (UIBlockVideoAlbum) uIBlock : null;
        if (uIBlockVideoAlbum == null) {
            return null;
        }
        VideoAlbum Pb = uIBlockVideoAlbum.Pb();
        Set<UIBlockDragDropAction> Db = uIBlockVideoAlbum.Db();
        if (!(Db instanceof Collection) || !Db.isEmpty()) {
            Iterator<T> it = Db.iterator();
            while (it.hasNext()) {
                if (((UIBlockDragDropAction) it.next()) instanceof UIBlockActionDnDReorder) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return new AlbumsListView$AlbumHorizontalState(com.vk.catalog.mvi.block.a.b(Pb.getId(), uIBlock.w()), catalogBlockVariant, new CatalogBlockReorderState$ReorderData$Album(Pb.q().b, Pb.getId()), Pb, uIBlockVideoAlbum.Tb(), uIBlockVideoAlbum.Qb(), uIBlockVideoAlbum.P(), uIBlockVideoAlbum.Rb() != null, uIBlockVideoAlbum.Sb(), z);
    }
}
