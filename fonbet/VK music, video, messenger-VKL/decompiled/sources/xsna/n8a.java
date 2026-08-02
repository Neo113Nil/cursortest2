package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.dto.api.ui.UIBlock;

/* compiled from: CatalogLegacyBlockStateMapper.kt */
/* loaded from: classes.dex */
public interface n8a<State extends CatalogBlockState> {
    State a(CatalogBlockVariant catalogBlockVariant, UIBlock uIBlock);
}
