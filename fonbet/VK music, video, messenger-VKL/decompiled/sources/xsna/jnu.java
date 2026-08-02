package xsna;

import java.util.ArrayList;
import xsna.xh70;

/* compiled from: GroupedNotificationListPatch.kt */
/* loaded from: classes4.dex */
public interface jnu extends xl50 {

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class a implements jnu {
        public final ArrayList b;
        public final int c;
        public final boolean d;

        public a(ArrayList arrayList, int i, boolean z) {
            this.b = arrayList;
            this.c = i;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b.equals(aVar.b) && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContentLoaded(items=");
            sb.append(this.b);
            sb.append(", lastViewed=");
            sb.append(this.c);
            sb.append(", isRefresh=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class b implements jnu {
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("DeleteNotification(position="), this.b, ')');
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class c implements jnu {
        public final String b;
        public final r970 c;

        public c(String str, r970 r970Var) {
            this.b = str;
            this.c = r970Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "DisableNotification(notificationId=" + this.b + ", disabledState=" + this.c + ')';
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class d implements jnu {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1214980565;
        }

        public final String toString() {
            return "DismissAlert";
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class e implements jnu {
        public final String b;

        public e(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("EnableNotification(notificationId="), this.b, ')');
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class f implements jnu {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1034698931;
        }

        public final String toString() {
            return "ErrorLoading";
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class g implements jnu {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -390180896;
        }

        public final String toString() {
            return "ErrorLoadingNext";
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class h implements jnu {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -838507018;
        }

        public final String toString() {
            return "LoadingNext";
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class i implements jnu {
        public final ArrayList b;

        public i(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b.equals(((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("NextLoaded(newItems="), this.b);
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class j implements jnu {
        public final int b;
        public final kb70 c;

        public j(int i, kb70 kb70Var) {
            this.b = i;
            this.c = kb70Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.b == jVar.b && epx.f(this.c, jVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "RestoreNotification(position=" + this.b + ", notification=" + this.c + ')';
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class k implements jnu {
        public final String b;
        public final Boolean c;

        public k(String str, Boolean bool) {
            this.b = str;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.b, kVar.b) && epx.f(this.c, kVar.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            Boolean bool = this.c;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetButtonLoading(notificationId=");
            sb.append(this.b);
            sb.append(", isPrimaryLoading=");
            return tn.a(sb, this.c, ')');
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class l implements jnu {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1413904954;
        }

        public final String toString() {
            return "SetSettingEnabled";
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class m implements jnu {
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
            return ho8.a(new StringBuilder("SetTitle(title="), this.b, ')');
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class n implements jnu {
        public final umu b;

        public n(umu umuVar) {
            this.b = umuVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ShowAlert(alert=" + this.b + ')';
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class o implements jnu {
        public static final o b = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 1096374679;
        }

        public final String toString() {
            return "ShowErrorSnackbar";
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class p implements jnu {
        public static final p b = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 118373158;
        }

        public final String toString() {
            return "ShowLoading";
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class q implements jnu {
        public static final q b = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return -443303683;
        }

        public final String toString() {
            return "ShowRefreshing";
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class r implements jnu {
        public final xh70.a b;

        public r(xh70.a aVar) {
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.b.equals(((r) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ShowSnackbar(snackbarType=" + this.b + ')';
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class s implements jnu {
        public final String b;
        public final int c;
        public final String d;

        public s(String str, int i, String str2) {
            this.b = str;
            this.c = i;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return epx.f(this.b, sVar.b) && this.c == sVar.c && epx.f(this.d, sVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateButtonActionResult(notificationId=");
            sb.append(this.b);
            sb.append(", icon=");
            sb.append(this.c);
            sb.append(", label=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class t implements jnu {
        public final boolean b;

        public t(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.b == ((t) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UpdateIsBackgroundLoading(isBackgroundLoading="), this.b, ')');
        }
    }

    /* compiled from: GroupedNotificationListPatch.kt */
    public static final class u implements jnu {
        public final String b;

        public u(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && epx.f(this.b, ((u) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("UpdateNextFrom(nextFrom="), this.b, ')');
        }
    }
}
