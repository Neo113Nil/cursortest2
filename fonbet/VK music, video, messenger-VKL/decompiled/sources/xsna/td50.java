package xsna;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.catalog.dto.CatalogBlockMetaDto;
import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogButtonFilters;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenSection;
import com.vk.catalog2.common.dto.api.CatalogButtonSwitchSection;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Values;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: MusicTrackOfflineCatalogContentBlocksFactoryImpl.kt */
/* loaded from: classes16.dex */
public final class td50 implements ot70 {
    public final boolean a;
    public final bpn0 b = new bpn0(new bv0(27));

    public td50(boolean z) {
        this.a = z;
    }

    @Override // xsna.ot70
    public final ArrayList a(mt70 mt70Var) {
        CatalogBlock catalogBlock;
        char c;
        String string;
        boolean z = mt70Var.q;
        OfflineCatalogCategories offlineCatalogCategories = OfflineCatalogCategories.Tracks;
        CatalogDataType i = offlineCatalogCategories.i();
        List<String> list = mt70Var.b.get(i);
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        String str = mt70Var.e;
        Context context = mt70Var.d;
        boolean z2 = str != null && drm0.D(str, "kids_section", false);
        int i2 = R.string.music_title_kids_audios;
        if (z) {
            CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_NONE;
            CatalogBadge catalogBadge = new CatalogBadge(String.valueOf(arrayList.size()), X3.i.T);
            boolean z3 = this.a;
            CatalogViewType catalogViewType = z3 ? CatalogViewType.HEADER_COMPACT : CatalogViewType.HEADER_LARGE;
            if (!z2) {
                i2 = R.string.music_catalog_offline_tracks;
            }
            catalogBlock = new CatalogBlock("synthetic_offline_tracks_header", catalogDataType, null, null, null, null, catalogBadge, new CatalogLayout(catalogViewType, null, context.getString(i2), null, null, false, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, null), z3 ? e43.a(new CatalogButtonSwitchSection("switch_section", null, "", offlineCatalogCategories.n(), null, null, null, null, null, null, null, "chevron_right_circle_28", 1008, null)) : e43.a(new CatalogButtonOpenSection("open_section", null, "", "synthetic_offline_tracks", null, null, "chevron_right_circle_28", null, null, null, null, 1952, null)), null, null, null, null, null, null, null, null, null, null, null, null, 2096700, null);
        } else {
            CatalogDataType catalogDataType2 = CatalogDataType.DATA_TYPE_NONE;
            CatalogBadge catalogBadge2 = new CatalogBadge(String.valueOf(arrayList.size()), X3.i.T);
            CatalogViewType catalogViewType2 = CatalogViewType.HEADER;
            if (!z2) {
                i2 = R.string.music_title_audios;
            }
            CatalogLayout catalogLayout = new CatalogLayout(catalogViewType2, null, context.getString(i2), null, null, false, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, null);
            String str2 = mt70Var.a;
            CatalogFilterData catalogFilterData = new CatalogFilterData("offline_music_replacement_default", b() ? context.getString(R.string.catalog_offline_default_replacement_redesign) : context.getString(R.string.catalog_offline_default_replacement), null, epx.f(str2, "offline_music_replacement_default"), null, null, null, null, null, 480, null);
            CatalogFilterData catalogFilterData2 = new CatalogFilterData("offline_music_replacement_date_new", context.getString(R.string.catalog_offline_new_replacement), null, epx.f(str2, "offline_music_replacement_date_new"), null, null, null, null, null, 480, null);
            CatalogFilterData catalogFilterData3 = new CatalogFilterData("offline_music_replacement_date_old", context.getString(R.string.catalog_offline_old_replacement), null, epx.f(str2, "offline_music_replacement_date_old"), null, null, null, null, null, 480, null);
            if (b()) {
                c = 0;
                string = context.getString(R.string.catalog_offline_name_replacement_redesign);
            } else {
                c = 0;
                string = context.getString(R.string.catalog_offline_name_replacement);
            }
            CatalogFilterData catalogFilterData4 = new CatalogFilterData("offline_music_replacement_name", string, null, epx.f(str2, "offline_music_replacement_name"), null, null, null, null, null, 480, null);
            CatalogFilterData catalogFilterData5 = new CatalogFilterData("offline_music_replacement_artist", b() ? context.getString(R.string.catalog_offline_artist_replacement_redesign) : context.getString(R.string.catalog_offline_artist_replacement), null, epx.f(str2, "offline_music_replacement_artist"), null, null, null, null, null, 480, null);
            CatalogButton[] catalogButtonArr = new CatalogButton[1];
            catalogButtonArr[c] = new CatalogButtonFilters("select_sorting", null, "synthetic_offline_tracks", "", b() ? e43.l(catalogFilterData, catalogFilterData2, catalogFilterData3, catalogFilterData4, catalogFilterData5) : e43.l(catalogFilterData, catalogFilterData4, catalogFilterData5), null, null, 96, null);
            catalogBlock = new CatalogBlock("synthetic_offline_tracks_header", catalogDataType2, null, null, null, null, catalogBadge2, catalogLayout, e43.a(catalogButtonArr), null, null, null, null, null, null, null, null, null, null, null, null, 2096700, null);
        }
        CatalogBlock catalogBlock2 = catalogBlock;
        String str3 = mt70Var.a;
        CatalogLayout catalogLayout2 = new CatalogLayout(z ? CatalogViewType.TRIPLE_STACKED_SLIDER : CatalogViewType.LIST, null, null, null, null, false, null, null, null, 510, null);
        if (z) {
            arrayList = new ArrayList(j5g.H0(arrayList, 15));
        }
        ArrayList o = e43.o(catalogBlock2, new CatalogBlock(str3, i, null, null, null, null, null, catalogLayout2, null, null, null, new CatalogBlockItemsData(i, arrayList, null, null, null, null, null, null, null, null, null, null, 4092, null), null, null, new Meta(null, null, "", null, null, null, false, mt70Var.p ? CatalogBlockMetaDto.ContextDto.KIDS_SECTION : null, null, null, Tensorflow.FRAME_HEIGHT, null), null, null, null, null, null, null, 2078588, null));
        if (z) {
            CatalogDataType catalogDataType3 = CatalogDataType.DATA_TYPE_NONE;
            CatalogViewType catalogViewType3 = CatalogViewType.SEPARATOR;
            Bundle bundle = new Bundle();
            bundle.putString(CatalogCustomAttributes$Keys.STYLE.h(), CatalogCustomAttributes$Values.ISLAND.h());
            s3q0 s3q0Var = s3q0.a;
            o.add(new CatalogBlock("synthetic_offline_playlists_separator", catalogDataType3, null, null, null, null, null, new CatalogLayout(catalogViewType3, null, null, null, null, false, bundle, null, null, 446, null), null, null, null, null, null, null, null, null, null, null, null, null, null, 2097020, null));
        }
        return o;
    }

    public final boolean b() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }
}
