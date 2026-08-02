package xsna;

import android.content.Context;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.CatalogButtonPlayAudioFromBlock;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: AndroidAutoOfflineCatalogGenerator.kt */
/* loaded from: classes16.dex */
public final class n22 {

    /* compiled from: AndroidAutoOfflineCatalogGenerator.kt */
    public static final class a implements ot70 {
        @Override // xsna.ot70
        public final ArrayList a(mt70 mt70Var) {
            Map<CatalogDataType, List<String>> map = mt70Var.b;
            CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_MUSIC_TRACKS;
            List<String> list = map.get(catalogDataType);
            if (list == null) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList(list);
            if (arrayList.isEmpty()) {
                return new ArrayList();
            }
            CatalogBlock catalogBlock = new CatalogBlock("synthetic_offline_tracks", catalogDataType, null, "synthetic_offline_section", null, null, null, new CatalogLayout(CatalogViewType.LIST, null, null, null, null, false, null, null, null, 510, null), null, null, null, new CatalogBlockItemsData(catalogDataType, arrayList, null, null, null, null, null, null, null, null, null, null, 4092, null), null, null, null, null, null, null, null, null, null, 2094964, null);
            Context context = mt70Var.d;
            return e43.o(new CatalogBlock(catalogBlock.b, CatalogDataType.DATA_TYPE_ACTION, null, null, null, null, new CatalogBadge(String.valueOf(arrayList.size()), X3.i.T), new CatalogLayout(CatalogViewType.BUTTON, null, context.getString(R.string.music_title_audios), null, null, false, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, null), e43.a(new CatalogButtonPlayAudioFromBlock("play_shuffled_audios_from_block", null, context.getString(R.string.android_auto_shuffle), "synthetic_offline_tracks", arrayList, true, null, 64, null)), null, null, null, null, null, null, null, null, null, null, null, null, 2096700, null), catalogBlock);
        }
    }

    /* compiled from: AndroidAutoOfflineCatalogGenerator.kt */
    public static final class b implements ot70 {
        @Override // xsna.ot70
        public final ArrayList a(mt70 mt70Var) {
            return new ArrayList();
        }
    }
}
