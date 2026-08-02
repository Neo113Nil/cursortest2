package xsna;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.catalog.dto.CatalogBlockMetaDto;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenSection;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.feature.music.myaudio.MusicCollectionType;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: MusicPlaylistOfflineCatalogContentBlocksFactoryImpl.kt */
/* loaded from: classes16.dex */
public final class v150 implements ot70 {
    public final boolean a;
    public final boolean b;
    public final List<MusicCollectionType> c;
    public final boolean d;

    public v150(List list, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = list;
        this.d = z3;
    }

    public static CatalogBlock c(Context context, String str, int i, boolean z) {
        return new CatalogBlock("synthetic_offline_playlists_header", CatalogDataType.DATA_TYPE_NONE, null, null, null, null, null, new CatalogLayout(CatalogViewType.HEADER, null, context.getString(i), null, null, false, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, null), e43.a(new CatalogButtonOpenSection("open_section", null, context.getString(R.string.catalog_offline_show_all), str, null, null, null, null, null, null, null, 2016, null)), null, null, null, null, null, d(z), null, null, null, null, null, null, 2080380, null);
    }

    public static Meta d(boolean z) {
        return new Meta(null, null, "", null, null, null, false, z ? CatalogBlockMetaDto.ContextDto.KIDS_SECTION : null, null, null, Tensorflow.FRAME_HEIGHT, null);
    }

    @Override // xsna.ot70
    public final ArrayList a(mt70 mt70Var) {
        Context context = mt70Var.d;
        boolean z = mt70Var.p;
        List<String> list = mt70Var.b.get(CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS);
        if (list == null) {
            return new ArrayList();
        }
        List<String> c = mt70Var.c(OfflineCatalogCategories.Playlists);
        List<String> c2 = mt70Var.c(OfflineCatalogCategories.Albums);
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty() && c.isEmpty() && c2.isEmpty()) {
            return new ArrayList();
        }
        if (this.d) {
            if (this.a) {
                arrayList.add(c(context, "synthetic_offline_playlists", R.string.music_title_playlists, z));
            } else if (this.b) {
                arrayList.add(new CatalogBlock("synthetic_offline_playlists_header", CatalogDataType.DATA_TYPE_NONE, null, null, null, null, null, new CatalogLayout(CatalogViewType.HEADER_LARGE, null, p4g.c(this.c, MusicCollectionType.ALBUMS) ? context.getString(R.string.music_title_albums) : context.getString(R.string.music_title_playlists), null, null, false, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, null), null, null, null, null, null, null, d(z), null, null, null, null, null, null, 2080636, null));
            }
            arrayList.add(b(mt70Var.a, list, z));
            return arrayList;
        }
        List<String> list2 = c;
        if (!list2.isEmpty()) {
            arrayList.add(c(context, "synthetic_offline_playlists", R.string.music_title_playlists, z));
            arrayList.add(b("synthetic_offline_playlists", new ArrayList(list2), z));
        }
        List<String> list3 = c2;
        if (!list3.isEmpty()) {
            arrayList.add(c(context, "synthetic_offline_albums", R.string.music_title_albums, z));
            arrayList.add(b("synthetic_offline_albums", new ArrayList(list3), z));
        }
        return arrayList;
    }

    public final CatalogBlock b(String str, List list, boolean z) {
        CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS;
        return new CatalogBlock(str, catalogDataType, null, null, null, null, null, new CatalogLayout(this.d ? CatalogViewType.LIST : CatalogViewType.LARGE_SLIDER, null, null, null, null, false, null, null, null, 510, null), null, null, null, new CatalogBlockItemsData(catalogDataType, list, null, null, null, null, null, null, null, null, null, null, 4092, null), null, null, d(z), null, null, null, null, null, null, 2078588, null);
    }

    public v150(boolean z, boolean z2, int i) {
        this(EmptyList.b, z, false, (i & 8) != 0 ? true : z2);
    }
}
