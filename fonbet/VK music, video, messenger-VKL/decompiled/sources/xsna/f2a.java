package xsna;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.List;

/* compiled from: CatalogBlockStateMapper.kt */
/* loaded from: classes.dex */
public interface f2a<State extends CatalogBlockState> {
    List<State> a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant);
}
