package xsna;

import com.vk.toggle.data.Repeat;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: NotificationResubscribeBannerScheduleConfig.kt */
/* loaded from: classes6.dex */
public final class l26 {
    public final ListBuilder a;
    public final Repeat b;

    public l26(ListBuilder listBuilder, Repeat repeat) {
        this.a = listBuilder;
        this.b = repeat;
    }

    public final List<Integer> a() {
        return this.a;
    }

    public final Repeat b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l26)) {
            return false;
        }
        l26 l26Var = (l26) obj;
        return this.a.equals(l26Var.a) && this.b == l26Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BannerScheduleRule(days=" + this.a + ", repeat=" + this.b + ')';
    }
}
