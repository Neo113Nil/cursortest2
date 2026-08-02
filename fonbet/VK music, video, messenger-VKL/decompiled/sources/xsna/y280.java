package xsna;

import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearRecent;

/* compiled from: CatalogAnalyticsEvent.kt */
/* loaded from: classes16.dex */
public final class y280 implements u0a {
    public final UIBlockActionClearRecent a;

    public y280(UIBlockActionClearRecent uIBlockActionClearRecent) {
        this.a = uIBlockActionClearRecent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y280) && epx.f(this.a, ((y280) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnClearRecentButtonClicked(uiBlock=" + this.a + ')';
    }
}
