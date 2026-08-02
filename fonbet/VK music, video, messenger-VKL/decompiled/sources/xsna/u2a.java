package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.catalog.dto.CatalogButtonOptionsDto;
import com.vk.catalog2.common.dto.api.CatalogFilterData;

/* compiled from: CatalogButtonOptionsMapper.kt */
/* loaded from: classes16.dex */
public final class u2a {
    public static CatalogFilterData a(CatalogButtonOptionsDto catalogButtonOptionsDto) {
        String i = catalogButtonOptionsDto.i();
        String l = catalogButtonOptionsDto.l();
        CatalogButtonOptionsDto.IconDto f = catalogButtonOptionsDto.f();
        String i2 = f != null ? f.i() : null;
        BaseBoolIntDto j = catalogButtonOptionsDto.j();
        return new CatalogFilterData(i, l, i2, j != null && j.i() == 1, null, null, null, catalogButtonOptionsDto.k(), null, 352, null);
    }
}
