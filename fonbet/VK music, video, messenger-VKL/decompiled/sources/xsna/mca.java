package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;

/* compiled from: CatalogRecyclerAdapterViewTypeDelegate.kt */
/* loaded from: classes16.dex */
public final class mca {
    public final zia a;

    /* compiled from: CatalogRecyclerAdapterViewTypeDelegate.kt */
    public static final class a {
        public final CatalogDataType a;
        public final CatalogViewType b;
        public final CatalogViewStyle c;
        public final boolean d;

        public a(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, boolean z) {
            this.a = catalogDataType;
            this.b = catalogViewType;
            this.c = catalogViewStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            CatalogViewStyle catalogViewStyle = this.c;
            return Boolean.hashCode(this.d) + ((hashCode + (catalogViewStyle == null ? 0 : catalogViewStyle.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BlockAndLayout(dataType=");
            sb.append(this.a);
            sb.append(", viewType=");
            sb.append(this.b);
            sb.append(", viewStyle=");
            sb.append(this.c);
            sb.append(", isEditable=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    public mca(zia ziaVar) {
        this.a = ziaVar;
    }

    public final int a(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, boolean z) {
        return rqi.a(catalogViewType.ordinal(), 100, ((catalogViewStyle == null ? 0 : this.a.a(catalogViewStyle) + 1) * 100000) + ((z ? 1 : 0) * 1000000000), catalogDataType.ordinal());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a c(int i) {
        int i2 = i % 100;
        int i3 = (i / 100) % 1000;
        int i4 = (i / 100000) % 10000;
        int i5 = i / 1000000000;
        CatalogDataType catalogDataType = (CatalogDataType) CatalogDataType.h().get(i2);
        CatalogViewType catalogViewType = (CatalogViewType) CatalogViewType.i().get(i3);
        return new a(catalogDataType, catalogViewType, i4 == 0 ? null : this.a.b(catalogDataType, catalogViewType, i4 - 1), i5 != 0);
    }
}
