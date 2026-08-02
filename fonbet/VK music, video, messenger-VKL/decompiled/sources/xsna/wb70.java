package xsna;

import java.util.ArrayList;
import java.util.List;
import xsna.xh70;

/* compiled from: NotificationListPatch.kt */
/* loaded from: classes4.dex */
public interface wb70 extends xl50 {

    /* compiled from: NotificationListPatch.kt */
    public static final class a implements wb70 {
        public final int b;
        public final ArrayList c;
        public final int d;
        public final boolean e;
        public final String f;

        public a(int i, ArrayList arrayList, int i2, boolean z, String str) {
            this.b = i;
            this.c = arrayList;
            this.d = i2;
            this.e = z;
            this.f = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c.equals(aVar.c) && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            int b = qoy.b(shy.a(this.d, qr.a(this.c, Integer.hashCode(this.b) * 31, 31), 31), 31, this.e);
            String str = this.f;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContentLoaded(pageIndex=");
            sb.append(this.b);
            sb.append(", items=");
            sb.append(this.c);
            sb.append(", lastViewed=");
            sb.append(this.d);
            sb.append(", isRefresh=");
            sb.append(this.e);
            sb.append(", nextFrom=");
            return ho8.a(sb, this.f, ')');
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class a0 implements wb70 {
        public final int b;

        public a0(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a0) && this.b == ((a0) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("UpdateLastViewed(lastViewed="), this.b, ')');
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class b implements wb70 {
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

    /* compiled from: NotificationListPatch.kt */
    public static final class b0 implements wb70 {
        public final String b;

        public b0(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && epx.f(this.b, ((b0) obj).b);
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

    /* compiled from: NotificationListPatch.kt */
    public static final class c implements wb70 {
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

    /* compiled from: NotificationListPatch.kt */
    public static final class d implements wb70 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1746358055;
        }

        public final String toString() {
            return "DismissAlert";
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class e implements wb70 {
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

    /* compiled from: NotificationListPatch.kt */
    public static final class f implements wb70 {
        public final int b;

        public f(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ErrorLoading(pageIndex="), this.b, ')');
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class g implements wb70 {
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
            return vu5.b(new StringBuilder("ErrorLoadingNext(pageIndex="), this.b, ')');
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class h implements wb70 {
        public final String b;
        public final Long c;
        public final boolean d;
        public final List<zi70> e;
        public final boolean f;

        public h(String str, Long l, boolean z, List<zi70> list, boolean z2) {
            this.b = str;
            this.c = l;
            this.d = z;
            this.e = list;
            this.f = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c) && this.d == hVar.d && epx.f(this.e, hVar.e) && this.f == hVar.f;
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l = this.c;
            int b = qoy.b((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.d);
            List<zi70> list = this.e;
            return Boolean.hashCode(this.f) + ((b + (list != null ? list.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitialData(title=");
            sb.append(this.b);
            sb.append(", currentSourceId=");
            sb.append(this.c);
            sb.append(", tabsEnabled=");
            sb.append(this.d);
            sb.append(", categories=");
            sb.append(this.e);
            sb.append(", canShowBanner=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class i implements wb70 {
        public final int b;

        public i(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("LoadingNext(pageIndex="), this.b, ')');
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class j implements wb70 {
        public final int b;
        public final ArrayList c;

        public j(int i, ArrayList arrayList) {
            this.b = i;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.b == jVar.b && this.c.equals(jVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NextLoaded(pageIndex=");
            sb.append(this.b);
            sb.append(", newItems=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class k implements wb70 {
        public final int b;
        public final kb70 c;

        public k(int i, kb70 kb70Var) {
            this.b = i;
            this.c = kb70Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.b == kVar.b && epx.f(this.c, kVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "RestoreNotification(position=" + this.b + ", notification=" + this.c + ')';
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class l implements wb70 {
        public final boolean b;

        public l(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.b == ((l) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetBannerState(canShowBanner="), this.b, ')');
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class m implements wb70 {
        public final String b;
        public final Boolean c;

        public m(String str, Boolean bool) {
            this.b = str;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.b, mVar.b) && epx.f(this.c, mVar.c);
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

    /* compiled from: NotificationListPatch.kt */
    public static final class n implements wb70 {
        public final List<zi70> b;

        public n(List<zi70> list) {
            this.b = list;
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
            return ms9.a(')', new StringBuilder("SetCategories(categories="), this.b);
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class o implements wb70 {
        public static final o b = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -2085681859;
        }

        public final String toString() {
            return "SetLastViewedMax";
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class p implements wb70 {
        public final int b;

        public p(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.b == ((p) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SetSelectedCategory(index="), this.b, ')');
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class q implements wb70 {
        public final t770 b;

        public q(t770 t770Var) {
            this.b = t770Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && epx.f(this.b, ((q) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ShowAlert(alert=" + this.b + ')';
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class r implements wb70 {
        public static final r b = new r();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return 1591879195;
        }

        public final String toString() {
            return "ShowErrorSnackbar";
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class s implements wb70 {
        public final int b;

        public s(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.b == ((s) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ShowLoading(pageIndex="), this.b, ')');
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class t implements wb70 {
        public final int b;

        public t(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.b == ((t) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ShowRefreshing(pageIndex="), this.b, ')');
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class u implements wb70 {
        public final xh70.a b;

        public u(xh70.a aVar) {
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && this.b.equals(((u) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ShowSnackbar(snackbarType=" + this.b + ')';
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class v implements wb70 {
        public final String b;
        public final Long c;
        public final boolean d;
        public final List<zi70> e;
        public final Integer f;

        public v(String str, Long l, boolean z, List<zi70> list, Integer num) {
            this.b = str;
            this.c = l;
            this.d = z;
            this.e = list;
            this.f = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return epx.f(this.b, vVar.b) && epx.f(this.c, vVar.c) && this.d == vVar.d && epx.f(this.e, vVar.e) && epx.f(this.f, vVar.f);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l = this.c;
            int a = fw3.a(qoy.b((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.d), 31, this.e);
            Integer num = this.f;
            return a + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SyncContentWithSettings(title=");
            sb.append(this.b);
            sb.append(", currentSourceId=");
            sb.append(this.c);
            sb.append(", tabsEnabled=");
            sb.append(this.d);
            sb.append(", categories=");
            sb.append(this.e);
            sb.append(", updatedSelectedCategoryIndex=");
            return uqi.b(sb, this.f, ')');
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class w implements wb70 {
        public final String b;
        public final int c;
        public final String d;

        public w(String str, int i, String str2) {
            this.b = str;
            this.c = i;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return epx.f(this.b, wVar.b) && this.c == wVar.c && epx.f(this.d, wVar.d);
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

    /* compiled from: NotificationListPatch.kt */
    public static final class x implements wb70 {
        public final int b;

        public x(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && this.b == ((x) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(0) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            return h5s.c(this.b, ", newRequestsCount=0)", new StringBuilder("UpdateFriendRequestCounter(pageIndex="));
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class y implements wb70 {
        public final int b;
        public final boolean c;

        public y(int i, boolean z) {
            this.b = i;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return this.b == yVar.b && this.c == yVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateIsBackgroundLoading(pageIndex=");
            sb.append(this.b);
            sb.append(", isBackgroundLoading=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: NotificationListPatch.kt */
    public static final class z implements wb70 {
        public final boolean b;

        public z(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && this.b == ((z) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UpdateIsScrollOnTop(isScrollOnTop="), this.b, ')');
        }
    }
}
