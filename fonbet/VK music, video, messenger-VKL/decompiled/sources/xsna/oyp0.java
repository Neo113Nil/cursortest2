package xsna;

import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.ui.UIBlockList;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class oyp0 extends n3a {
    public final UIBlockList a;
    public final CatalogExtendedData b;

    public oyp0(UIBlockList uIBlockList, CatalogExtendedData catalogExtendedData) {
        this.a = uIBlockList;
        this.b = catalogExtendedData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyp0)) {
            return false;
        }
        oyp0 oyp0Var = (oyp0) obj;
        return epx.f(this.a, oyp0Var.a) && epx.f(this.b, oyp0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CatalogExtendedData catalogExtendedData = this.b;
        return hashCode + (catalogExtendedData == null ? 0 : catalogExtendedData.hashCode());
    }

    public final String toString() {
        return "UiBlocksWithExtendedDataCmd(blocks=" + this.a + ", extendedData=" + this.b + ')';
    }
}
