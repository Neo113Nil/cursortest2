package xsna;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g2a implements f2a {
    public final /* synthetic */ yzs a;

    public /* synthetic */ g2a(yzs yzsVar) {
        this.a = yzsVar;
    }

    @Override // xsna.f2a
    public final List a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
        CatalogBlockState catalogBlockState = (CatalogBlockState) this.a.invoke(catalogExtraResponseObjectDto, catalogBlockDto, catalogBlockVariant);
        return catalogBlockState != null ? Collections.singletonList(catalogBlockState) : EmptyList.b;
    }
}
