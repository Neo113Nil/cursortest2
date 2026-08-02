package xsna;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.catalog.dto.CatalogBlockMetaDto;
import com.vk.catalog2.common.dto.api.CatalogButtonSwitchSection;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.style.AudioBookSliderViewStyle;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: OfflineCatalogSearchAllAudioBooksBlocksFactoryImpl.kt */
/* loaded from: classes16.dex */
public final class qt70 implements ot70 {
    @Override // xsna.ot70
    public final ArrayList a(mt70 mt70Var) {
        boolean z = mt70Var.p;
        OfflineCatalogCategories offlineCatalogCategories = OfflineCatalogCategories.Audiobooks;
        List x = rdi.x(mt70Var.c(offlineCatalogCategories));
        if (x == null) {
            return new ArrayList();
        }
        CatalogBlock catalogBlock = new CatalogBlock("synthetic_offline_audio_book_header", CatalogDataType.DATA_TYPE_NONE, null, null, null, null, null, new CatalogLayout(CatalogViewType.HEADER_COMPACT, null, mt70Var.d.getString(R.string.music_catalog_offline_audiobooks), null, null, false, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, null), e43.a(new CatalogButtonSwitchSection("switch_section", null, "", offlineCatalogCategories.n(), null, null, null, null, null, null, null, "chevron_right_circle_28", 1008, null)), null, null, null, null, null, new Meta(null, null, "", null, null, null, false, z ? CatalogBlockMetaDto.ContextDto.KIDS_SECTION : null, null, null, Tensorflow.FRAME_HEIGHT, null), null, null, null, null, null, null, 2080380, null);
        CatalogDataType i = offlineCatalogCategories.i();
        CatalogViewType catalogViewType = CatalogViewType.LARGE_SLIDER;
        Bundle bundle = new Bundle();
        bundle.putString(CatalogCustomAttributes$Keys.STYLE.h(), AudioBookSliderViewStyle.Style.SyntheticOffline.h());
        s3q0 s3q0Var = s3q0.a;
        return e43.o(catalogBlock, new CatalogBlock("synthetic_offline_audio_books", i, null, null, null, null, null, new CatalogLayout(catalogViewType, null, null, null, null, false, bundle, null, null, 446, null), null, null, null, new CatalogBlockItemsData(i, new ArrayList(x), null, null, null, null, null, null, null, null, null, null, 4092, null), null, null, new Meta(null, null, "", null, null, null, false, z ? CatalogBlockMetaDto.ContextDto.KIDS_SECTION : null, null, null, Tensorflow.FRAME_HEIGHT, null), null, null, null, null, null, null, 2078588, null));
    }
}
