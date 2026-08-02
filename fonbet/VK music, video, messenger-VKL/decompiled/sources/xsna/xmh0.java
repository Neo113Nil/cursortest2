package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.apps.AppHorizontalLinkVh;
import com.vk.dto.common.id.UserId;
import xsna.u4a;

/* compiled from: SearchAllMiniAppsCatalogConfiguration.kt */
/* loaded from: classes5.dex */
public final class xmh0 extends smh0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xmh0(Bundle bundle) {
        super(r0 == null ? UserId.d : r0, bundle.getString("ref"));
        UserId userId = (UserId) bundle.getParcelable("owner_id");
    }

    @Override // xsna.smh0, com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        u4a.a aVar = u4aVar.b;
        if (catalogDataType != CatalogDataType.DATA_TYPE_MINIAPPS || catalogViewType != CatalogViewType.SLIDER) {
            return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        }
        return new AppHorizontalLinkVh(new AppHorizontalLinkVh.c.C0483c(), 2, aVar.f, aVar.j, aVar.m, m7m.f(this));
    }
}
