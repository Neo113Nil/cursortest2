package xsna;

import java.util.List;

/* compiled from: GroupedNotificationListAction.kt */
/* loaded from: classes4.dex */
public interface vmu extends kj50 {

    /* compiled from: GroupedNotificationListAction.kt */
    public static final class a implements vmu {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1469170362;
        }

        public final String toString() {
            return "DismissAlert";
        }
    }

    /* compiled from: GroupedNotificationListAction.kt */
    public static final class b implements vmu {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 580551384;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: GroupedNotificationListAction.kt */
    public static final class c implements vmu {
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

    /* compiled from: GroupedNotificationListAction.kt */
    public static final class d implements vmu {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -2049371563;
        }

        public final String toString() {
            return "LifecycleOnPause";
        }
    }

    /* compiled from: GroupedNotificationListAction.kt */
    public static final class e implements vmu {
        public final boolean b;

        public e() {
            this(false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("LoadData(isRefresh="), this.b, ')');
        }

        public e(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: GroupedNotificationListAction.kt */
    public static final class f implements vmu {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -678176063;
        }

        public final String toString() {
            return "LoadNext";
        }
    }

    /* compiled from: GroupedNotificationListAction.kt */
    public static final class g implements vmu {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 80851904;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: GroupedNotificationListAction.kt */
    public static final class h implements vmu {
        public final List<kb70> b;

        /* JADX WARN: Multi-variable type inference failed */
        public h(List<? extends kb70> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("OnItemsViewed(items="), this.b);
        }
    }

    /* compiled from: GroupedNotificationListAction.kt */
    public static final class i implements vmu {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 921024826;
        }

        public final String toString() {
            return "OpenCommunitySettings";
        }
    }

    /* compiled from: GroupedNotificationListAction.kt */
    public static final class j implements vmu {
        public final String b;

        public j(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("SendClickEvent(notificationId="), this.b, ')');
        }
    }
}
