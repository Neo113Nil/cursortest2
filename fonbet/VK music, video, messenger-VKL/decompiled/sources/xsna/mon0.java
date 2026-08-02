package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class mon0 extends n3a {
    public final CatalogDataType a;

    public mon0(CatalogDataType catalogDataType) {
        this.a = catalogDataType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mon0) && this.a == ((mon0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SyncWithCatalogDataTypeCmd(dataType=" + this.a + ')';
    }
}
