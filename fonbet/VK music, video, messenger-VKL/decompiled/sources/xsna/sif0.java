package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VerticalVideoCatalogViewStyle;

/* compiled from: RecycledViewType.kt */
/* loaded from: classes16.dex */
public final class sif0 {
    public final CatalogViewType a;
    public final CatalogDataType b;
    public final CatalogViewStyle c;

    public sif0(CatalogViewType catalogViewType, CatalogDataType catalogDataType, CatalogViewStyle catalogViewStyle) {
        this.a = catalogViewType;
        this.b = catalogDataType;
        this.c = catalogViewStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sif0)) {
            return false;
        }
        sif0 sif0Var = (sif0) obj;
        return this.a == sif0Var.a && this.b == sif0Var.b && epx.f(this.c, sif0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        CatalogViewStyle catalogViewStyle = this.c;
        return hashCode + (catalogViewStyle == null ? 0 : catalogViewStyle.hashCode());
    }

    public final String toString() {
        return "RecycledViewType(viewType=" + this.a + ", dataType=" + this.b + ", viewStyle=" + this.c + ')';
    }

    public /* synthetic */ sif0(CatalogViewType catalogViewType, CatalogDataType catalogDataType, VerticalVideoCatalogViewStyle verticalVideoCatalogViewStyle, int i) {
        this(catalogViewType, (i & 2) != 0 ? CatalogDataType.DATA_TYPE_VIDEO_VIDEOS : catalogDataType, (i & 4) != 0 ? null : verticalVideoCatalogViewStyle);
    }
}
