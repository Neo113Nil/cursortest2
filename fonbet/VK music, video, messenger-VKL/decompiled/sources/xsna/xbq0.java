package xsna;

import com.vk.api.generated.catalog.dto.CatalogBlockDataTypeDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.catalog.mvi.block.video.impl.upload.UploadListView$UploadListState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.common.id.UserId;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class xbq0 implements yzs {
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
        CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj3;
        String id = catalogBlockDto.getId();
        Boolean valueOf = Boolean.valueOf(catalogBlockDto.l0() == CatalogBlockDataTypeDto.VIDEO_UPLOADING_SCHEDULED);
        UserId q = catalogBlockDto.n1().q();
        if (q == null) {
            q = UserId.d;
        }
        return new UploadListView$UploadListState(id, catalogBlockVariant, valueOf, q, null, 16, null);
    }
}
