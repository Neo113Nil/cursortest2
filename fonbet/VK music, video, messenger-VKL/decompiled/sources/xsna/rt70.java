package xsna;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.catalog.dto.CatalogBlockMetaDto;
import com.vk.catalog2.common.dto.api.CatalogButtonSwitchSection;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: OfflineCatalogSearchAllPlaylistsBlocksFactoryImpl.kt */
/* loaded from: classes16.dex */
public final class rt70 implements ot70 {
    public static CatalogBlock b(List list, boolean z, String str, CatalogDataType catalogDataType) {
        return new CatalogBlock(str, catalogDataType, null, null, null, null, null, new CatalogLayout(CatalogViewType.LARGE_SLIDER, null, null, null, null, false, null, null, null, 510, null), null, null, null, new CatalogBlockItemsData(catalogDataType, new ArrayList(list), null, null, null, null, null, null, null, null, null, null, 4092, null), null, null, new Meta(null, null, "", null, null, null, false, z ? CatalogBlockMetaDto.ContextDto.KIDS_SECTION : null, null, null, Tensorflow.FRAME_HEIGHT, null), null, null, null, null, null, null, 2078588, null);
    }

    public static CatalogBlock c(Context context, boolean z, boolean z2) {
        return new CatalogBlock("synthetic_offline_playlists_header", CatalogDataType.DATA_TYPE_NONE, null, null, null, null, null, new CatalogLayout(CatalogViewType.HEADER_COMPACT, null, z2 ? context.getString(R.string.music_title_albums) : context.getString(R.string.music_title_playlists), null, null, false, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, null), e43.a(new CatalogButtonSwitchSection("switch_section", null, "", (z2 ? OfflineCatalogCategories.Albums : OfflineCatalogCategories.Playlists).n(), null, null, null, null, null, null, null, "chevron_right_circle_28", 1008, null)), null, null, null, null, null, new Meta(null, null, "", null, null, null, false, z ? CatalogBlockMetaDto.ContextDto.KIDS_SECTION : null, null, null, Tensorflow.FRAME_HEIGHT, null), null, null, null, null, null, null, 2080380, null);
    }

    @Override // xsna.ot70
    public final ArrayList a(mt70 mt70Var) {
        String str = mt70Var.a;
        Context context = mt70Var.d;
        boolean z = mt70Var.p;
        ArrayList arrayList = new ArrayList();
        OfflineCatalogCategories offlineCatalogCategories = OfflineCatalogCategories.Playlists;
        List<String> c = mt70Var.c(offlineCatalogCategories);
        OfflineCatalogCategories offlineCatalogCategories2 = OfflineCatalogCategories.Albums;
        List<String> c2 = mt70Var.c(offlineCatalogCategories2);
        if (!c.isEmpty()) {
            arrayList.add(c(context, z, false));
            arrayList.add(b(c, z, str, offlineCatalogCategories.i()));
        }
        if (!c2.isEmpty()) {
            arrayList.add(c(context, z, true));
            arrayList.add(b(c2, z, str, offlineCatalogCategories2.i()));
        }
        return arrayList;
    }
}
