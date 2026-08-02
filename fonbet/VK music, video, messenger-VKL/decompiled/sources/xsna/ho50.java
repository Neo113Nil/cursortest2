package xsna;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.catalog.dto.CatalogBlockMetaDto;
import com.vk.catalog2.common.dto.api.CatalogButtonFilters;
import com.vk.catalog2.common.dto.api.CatalogButtonPlayAudioFromBlock;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: MyAudiosOfflineCatalogCatalogContentBlocksFactoryImpl.kt */
/* loaded from: classes16.dex */
public final class ho50 implements ot70 {
    public final bpn0 a = new bpn0(new d1(27));

    public static CatalogBlock b(String str, ArrayList arrayList, boolean z) {
        CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_MUSIC_TRACKS;
        return new CatalogBlock(str, catalogDataType, null, null, null, null, null, new CatalogLayout(CatalogViewType.LIST, null, null, null, null, false, null, null, null, 510, null), null, null, null, new CatalogBlockItemsData(catalogDataType, arrayList, null, null, null, null, null, null, null, null, null, null, 4092, null), null, null, new Meta(null, null, "", null, null, null, false, z ? CatalogBlockMetaDto.ContextDto.KIDS_SECTION : null, null, null, Tensorflow.FRAME_HEIGHT, null), null, null, null, null, null, null, 2078588, null);
    }

    @Override // xsna.ot70
    public final ArrayList a(mt70 mt70Var) {
        CatalogBlock catalogBlock;
        Context context = mt70Var.d;
        List<String> list = mt70Var.b.get(CatalogDataType.DATA_TYPE_MUSIC_TRACKS);
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        if (mt70Var.g) {
            String str = mt70Var.e;
            catalogBlock = new CatalogBlock("synthetic_offline_tracks_header", CatalogDataType.DATA_TYPE_NONE, null, null, null, null, null, new CatalogLayout(CatalogViewType.HEADER_LARGE, null, context.getString((str == null || !drm0.D(str, "kids_section", false)) ? R.string.music_my_audios_search_result_title : R.string.music_title_kids_audios), null, null, false, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, null), null, null, null, null, null, null, null, null, null, null, null, null, null, 2097020, null);
        } else {
            String str2 = mt70Var.a;
            CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_ACTION;
            CatalogLayout catalogLayout = new CatalogLayout(CatalogViewType.BUTTONS_HORIZONTAL, null, null, null, null, false, null, null, null, 510, null);
            CatalogButtonPlayAudioFromBlock catalogButtonPlayAudioFromBlock = new CatalogButtonPlayAudioFromBlock("play_shuffled_audios_from_block", null, "", str2, arrayList, true, null, 64, null);
            String string = context.getString(R.string.catalog_offline_replacement_title);
            String string2 = context.getString(R.string.catalog_offline_replacement_title);
            CatalogFilterData catalogFilterData = new CatalogFilterData("offline_music_replacement_default", c() ? context.getString(R.string.catalog_offline_default_replacement_redesign) : context.getString(R.string.catalog_offline_default_replacement), null, epx.f(str2, "offline_music_replacement_default"), null, null, null, null, null, 480, null);
            CatalogFilterData catalogFilterData2 = new CatalogFilterData("offline_music_replacement_date_new", context.getString(R.string.catalog_offline_new_replacement), null, epx.f(str2, "offline_music_replacement_date_new"), null, null, null, null, null, 480, null);
            CatalogFilterData catalogFilterData3 = new CatalogFilterData("offline_music_replacement_date_old", context.getString(R.string.catalog_offline_old_replacement), null, epx.f(str2, "offline_music_replacement_date_old"), null, null, null, null, null, 480, null);
            CatalogFilterData catalogFilterData4 = new CatalogFilterData("offline_music_replacement_name", c() ? context.getString(R.string.catalog_offline_name_replacement_redesign) : context.getString(R.string.catalog_offline_name_replacement), null, epx.f(str2, "offline_music_replacement_name"), null, null, null, null, null, 480, null);
            CatalogFilterData catalogFilterData5 = new CatalogFilterData("offline_music_replacement_artist", c() ? context.getString(R.string.catalog_offline_artist_replacement_redesign) : context.getString(R.string.catalog_offline_artist_replacement), null, epx.f(str2, "offline_music_replacement_artist"), null, null, null, null, null, 480, null);
            catalogBlock = new CatalogBlock("synthetic_offline_horizontal_buttons", catalogDataType, null, null, null, null, null, catalogLayout, e43.a(catalogButtonPlayAudioFromBlock, new CatalogButtonFilters("select_sorting", null, "synthetic_offline_tracks", string, c() ? e43.l(catalogFilterData, catalogFilterData2, catalogFilterData3, catalogFilterData4, catalogFilterData5) : e43.l(catalogFilterData, catalogFilterData4, catalogFilterData5), string2, null, 64, null)), null, null, null, null, null, null, null, null, null, null, null, null, 2096764, null);
        }
        return e43.o(catalogBlock, b(mt70Var.a, arrayList, mt70Var.p));
    }

    public final boolean c() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }
}
