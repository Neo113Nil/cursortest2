package xsna;

import com.vk.notifications.list.impl.presentation.base.mvi.common.NotificationCategoryTab;
import java.util.List;

/* compiled from: NotificationListAction.kt */
/* loaded from: classes4.dex */
public interface oa70 extends kj50 {

    /* compiled from: NotificationListAction.kt */
    public static final class a implements oa70 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 715045272;
        }

        public final String toString() {
            return "DismissAlert";
        }
    }

    /* compiled from: NotificationListAction.kt */
    public static final class b implements oa70 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1816344502;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: NotificationListAction.kt */
    public static final class c implements oa70 {
        public final ha70 b;

        public c(ha70 ha70Var) {
            this.b = ha70Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ItemActionWrapper(action=" + this.b + ')';
        }
    }

    /* compiled from: NotificationListAction.kt */
    public static final class d implements oa70 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1984730573;
        }

        public final String toString() {
            return "LifecycleOnPause";
        }
    }

    /* compiled from: NotificationListAction.kt */
    public static final class e implements oa70 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1336210544;
        }

        public final String toString() {
            return "LifecycleOnResume";
        }
    }

    /* compiled from: NotificationListAction.kt */
    public static final class f implements oa70 {
        public final int b;
        public final boolean c;
        public final boolean d;
        public final NotificationCategoryTab e;
        public final int f;

        public /* synthetic */ f(int i, int i2) {
            this(i, false, (i2 & 4) == 0, null, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f;
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
            NotificationCategoryTab notificationCategoryTab = this.e;
            return Integer.hashCode(this.f) + ((b + (notificationCategoryTab == null ? 0 : notificationCategoryTab.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadData(page=");
            sb.append(this.b);
            sb.append(", isRefresh=");
            sb.append(this.c);
            sb.append(", forceSkeleton=");
            sb.append(this.d);
            sb.append(", pendingNavigationToCategoryTab=");
            sb.append(this.e);
            sb.append(", markAsReadBeforeTime=");
            return vu5.b(sb, this.f, ')');
        }

        public f(int i, boolean z, boolean z2, NotificationCategoryTab notificationCategoryTab, int i2) {
            this.b = i;
            this.c = z;
            this.d = z2;
            this.e = notificationCategoryTab;
            this.f = i2;
        }
    }

    /* compiled from: NotificationListAction.kt */
    public static final class g implements oa70 {
        public final int b;

        public g(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("LoadNext(page="), this.b, ')');
        }
    }

    /* compiled from: NotificationListAction.kt */
    public static final class h implements oa70 {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -673273186;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: NotificationListAction.kt */
    public static final class i implements oa70 {
        public final List<kb70> b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(List<? extends kb70> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("OnItemsViewed(items="), this.b);
        }
    }

    /* compiled from: NotificationListAction.kt */
    public static final class j implements oa70 {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -61658829;
        }

        public final String toString() {
            return "OpenSettings";
        }
    }

    /* compiled from: NotificationListAction.kt */
    public static final class k implements oa70 {
        public final int b;

        public k(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.b == ((k) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("PageChanged(index="), this.b, ')');
        }
    }

    /* compiled from: NotificationListAction.kt */
    public static final class l implements oa70 {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -823227740;
        }

        public final String toString() {
            return "RefreshPage";
        }
    }

    /* compiled from: NotificationListAction.kt */
    public static final class m implements oa70 {
        public final String b;

        public m(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.b, ((m) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("SendClickEvent(notificationId="), this.b, ')');
        }
    }

    /* compiled from: NotificationListAction.kt */
    public static final class n implements oa70 {
        public final NotificationCategoryTab b;
        public final boolean c;
        public final int d;

        public n() {
            this(7, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.b == nVar.b && this.c == nVar.c && this.d == nVar.d;
        }

        public final int hashCode() {
            NotificationCategoryTab notificationCategoryTab = this.b;
            return Integer.hashCode(this.d) + qoy.b((notificationCategoryTab == null ? 0 : notificationCategoryTab.hashCode()) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SyncContentWithSettings(targetCategoryId=");
            sb.append(this.b);
            sb.append(", shouldRefresh=");
            sb.append(this.c);
            sb.append(", markAsReadBeforeTime=");
            return vu5.b(sb, this.d, ')');
        }

        public /* synthetic */ n(int i, NotificationCategoryTab notificationCategoryTab) {
            this((i & 1) != 0 ? null : notificationCategoryTab, false, 0);
        }

        public n(NotificationCategoryTab notificationCategoryTab, boolean z, int i) {
            this.b = notificationCategoryTab;
            this.c = z;
            this.d = i;
        }
    }

    /* compiled from: NotificationListAction.kt */
    public static final class o implements oa70 {
        public final boolean b;

        public o(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.b == ((o) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UpdateIsScrollOnTop(isScrollOnTop="), this.b, ')');
        }
    }
}
