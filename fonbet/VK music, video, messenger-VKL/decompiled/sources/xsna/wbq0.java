package xsna;

import com.vk.catalog.mvi.block.video.impl.upload.UploadListView$UploadListState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockProfileVideoUploads;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class wbq0 implements wzs {
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj;
        UIBlock uIBlock = (UIBlock) obj2;
        UIBlockProfileVideoUploads uIBlockProfileVideoUploads = uIBlock instanceof UIBlockProfileVideoUploads ? (UIBlockProfileVideoUploads) uIBlock : null;
        if (uIBlockProfileVideoUploads == null) {
            return null;
        }
        return new UploadListView$UploadListState(uIBlock.w(), catalogBlockVariant, Boolean.valueOf(uIBlockProfileVideoUploads.Pb()), uIBlockProfileVideoUploads.q(), null, 16, null);
    }
}
