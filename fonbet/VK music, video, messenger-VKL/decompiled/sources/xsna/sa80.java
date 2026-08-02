package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockList;

/* compiled from: CatalogAnalyticsEvent.kt */
/* loaded from: classes16.dex */
public final class sa80 implements u0a {
    public final UIBlockList a;

    public sa80(UIBlockList uIBlockList) {
        this.a = uIBlockList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sa80) && epx.f(this.a, ((sa80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnReloadCatalogSectionEvent(section=" + this.a + ')';
    }
}
