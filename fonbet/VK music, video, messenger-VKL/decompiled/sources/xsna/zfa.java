package xsna;

import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.ui.UIBlockList;

/* compiled from: CatalogSectionSnapshot.kt */
/* loaded from: classes16.dex */
public final class zfa {
    public final CatalogExtendedData a;
    public final UIBlockList b;
    public final String c;

    public zfa(CatalogExtendedData catalogExtendedData, UIBlockList uIBlockList, String str) {
        this.a = catalogExtendedData;
        this.b = uIBlockList;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfa)) {
            return false;
        }
        zfa zfaVar = (zfa) obj;
        return epx.f(this.a, zfaVar.a) && epx.f(this.b, zfaVar.b) && epx.f(this.c, zfaVar.c);
    }

    public final int hashCode() {
        CatalogExtendedData catalogExtendedData = this.a;
        int hashCode = (catalogExtendedData == null ? 0 : catalogExtendedData.hashCode()) * 31;
        UIBlockList uIBlockList = this.b;
        int hashCode2 = (hashCode + (uIBlockList == null ? 0 : uIBlockList.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogSectionSnapshot(extendedData=");
        sb.append(this.a);
        sb.append(", blocks=");
        sb.append(this.b);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.c, ')');
    }
}
