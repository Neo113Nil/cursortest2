package xsna;

import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: CatalogLegacyBlockRegisterImpl.kt */
/* loaded from: classes.dex */
public final class m8a implements com.vk.catalog.mvi.legacy.api.a {
    public final LinkedHashMap b = new LinkedHashMap();

    @Override // com.vk.catalog.mvi.legacy.api.a
    public final Map<CatalogBlockVariant, h8a> a() {
        return this.b;
    }

    @Override // com.vk.catalog.mvi.legacy.api.a
    public final void b(CatalogBlockVariant catalogBlockVariant, h8a h8aVar) {
        LinkedHashMap linkedHashMap = this.b;
        if (!linkedHashMap.containsKey(catalogBlockVariant)) {
            linkedHashMap.put(catalogBlockVariant, h8aVar);
            return;
        }
        throw new IllegalStateException(("duplicated factory for variant " + catalogBlockVariant + ". Old: " + ((h8a) linkedHashMap.get(catalogBlockVariant)) + ", new: " + h8aVar).toString());
    }
}
