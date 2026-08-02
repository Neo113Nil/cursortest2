package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.music.stats.CoachMarkAction;

/* compiled from: CatalogAnalyticsEvent.kt */
/* loaded from: classes16.dex */
public final class n680 implements u0a {
    public final UIBlockHint a;
    public final CoachMarkAction b;

    public n680(UIBlockHint uIBlockHint, CoachMarkAction coachMarkAction) {
        this.a = uIBlockHint;
        this.b = coachMarkAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n680)) {
            return false;
        }
        n680 n680Var = (n680) obj;
        return epx.f(this.a, n680Var.a) && this.b == n680Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnHintClickEvent(hint=" + this.a + ", action=" + this.b + ')';
    }
}
