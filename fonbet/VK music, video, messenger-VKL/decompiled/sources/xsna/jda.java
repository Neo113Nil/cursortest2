package xsna;

import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import java.util.List;

/* compiled from: CatalogResponseTransformer.kt */
/* loaded from: classes16.dex */
public interface jda {
    static /* synthetic */ List a(jda jdaVar, Object obj, CatalogExtendedData catalogExtendedData, boolean z, boolean z2, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return jdaVar.b(obj, catalogExtendedData, z, z2);
    }

    List<UIBlock> b(Object obj, CatalogExtendedData catalogExtendedData, boolean z, boolean z2);
}
