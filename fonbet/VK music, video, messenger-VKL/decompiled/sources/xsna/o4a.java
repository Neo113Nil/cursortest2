package xsna;

import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.catalog.mvi.section.domain.CatalogSectionDo;
import java.util.List;

/* compiled from: CatalogDtoMapper.kt */
/* loaded from: classes16.dex */
public interface o4a {
    List<CatalogSectionDo> a(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto);

    CatalogSectionDo b(CatalogSectionResponseObjectDto catalogSectionResponseObjectDto);
}
