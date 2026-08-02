package xsna;

/* compiled from: NotificationMenuModalAction.kt */
/* loaded from: classes4.dex */
public interface fd70 extends kj50 {

    /* compiled from: NotificationMenuModalAction.kt */
    public static final class a implements fd70 {
        public final Long b;
        public final String c;

        public a(Long l, String str) {
            this.b = l;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            Long l = this.b;
            return this.c.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeNotificationSource(groupId=");
            sb.append(this.b);
            sb.append(", title=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: NotificationMenuModalAction.kt */
    public static final class b implements fd70 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 471051789;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: NotificationMenuModalAction.kt */
    public static final class c implements fd70 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -848967635;
        }

        public final String toString() {
            return "LoadData";
        }
    }

    /* compiled from: NotificationMenuModalAction.kt */
    public static final class d implements fd70 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 527461091;
        }

        public final String toString() {
            return "OpenCommunitiesManageNotifications";
        }
    }

    /* compiled from: NotificationMenuModalAction.kt */
    public static final class e implements fd70 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -212599459;
        }

        public final String toString() {
            return "OpenProfileStats";
        }
    }

    /* compiled from: NotificationMenuModalAction.kt */
    public static final class f implements fd70 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -896575350;
        }

        public final String toString() {
            return "OpenSettings";
        }
    }

    /* compiled from: NotificationMenuModalAction.kt */
    public static final class g implements fd70 {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 523927098;
        }

        public final String toString() {
            return "ToggleNotificationTabs";
        }
    }
}
