package xsna;

import com.vk.notifications.list.impl.presentation.base.mvi.common.NotificationCategoryTab;

/* compiled from: NotificationListCategoryTabsFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class uoz {
    public final int a;
    public final NotificationCategoryTab b;

    public uoz(int i, NotificationCategoryTab notificationCategoryTab) {
        this.a = i;
        this.b = notificationCategoryTab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uoz)) {
            return false;
        }
        uoz uozVar = (uoz) obj;
        return this.a == uozVar.a && this.b == uozVar.b;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        NotificationCategoryTab notificationCategoryTab = this.b;
        return hashCode + (notificationCategoryTab == null ? 0 : notificationCategoryTab.hashCode());
    }

    public final String toString() {
        return "LoadDataParams(pageIndex=" + this.a + ", pendingCategoryId=" + this.b + ')';
    }
}
