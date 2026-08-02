package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog2.common.dto.api.ui.UIBlock;

/* compiled from: CatalogLegacyBlock.kt */
/* loaded from: classes16.dex */
public interface e8a {
    void a(int i, androidx.compose.runtime.a aVar);

    void b(UIBlock uIBlock);

    void destroy();

    CatalogBlockState getCurrentState();
}
