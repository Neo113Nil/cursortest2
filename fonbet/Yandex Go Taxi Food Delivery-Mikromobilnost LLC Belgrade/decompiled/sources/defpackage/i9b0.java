package defpackage;

import com.ybsdk.core.analytics.generated.PfmAnalyticsItemStatePfm;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes13.dex */
public final class i9b0 {
    public final String a;
    public final PfmAnalyticsItemStatePfm b;

    public i9b0(String str, PfmAnalyticsItemStatePfm pfmAnalyticsItemStatePfm) {
        this.a = str;
        this.b = pfmAnalyticsItemStatePfm;
    }

    public final LinkedHashMap a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put("category_id", this.a);
        linkedHashMap.put(ClidProvider.STATE, this.b.getOriginalValue());
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9b0)) {
            return false;
        }
        i9b0 i9b0Var = (i9b0) obj;
        return jl40.l(this.a, i9b0Var.a) && this.b == i9b0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PfmCategoryItemPfm(categoryId=" + this.a + ", state=" + this.b + Extension.C_BRAKE;
    }
}
