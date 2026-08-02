package xsna;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.catalog.mvi.block.video.impl.downloaded.DownloadedSliderView$DownloadedSliderState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class gbo implements yzs {
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
        return new DownloadedSliderView$DownloadedSliderState(catalogBlockDto.getId(), (CatalogBlockVariant) obj3, catalogBlockDto.getTitle(), null, null, 24, null);
    }
}
