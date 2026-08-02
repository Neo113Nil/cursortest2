package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;

/* compiled from: ComposeCatalogKey.kt */
/* loaded from: classes3.dex */
public final class gpi {
    public final CatalogDataType a;
    public final CatalogViewType b;

    public gpi(CatalogDataType catalogDataType, CatalogViewType catalogViewType) {
        this.a = catalogDataType;
        this.b = catalogViewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpi)) {
            return false;
        }
        gpi gpiVar = (gpi) obj;
        return this.a == gpiVar.a && this.b == gpiVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ComposeCatalogKey(dataType=" + this.a + ", viewType=" + this.b + ')';
    }
}
