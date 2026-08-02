package xsna;

import com.vk.notifications.list.impl.presentation.model.common.ListNextState;
import com.vk.notifications.list.impl.presentation.model.common.NotificationPageState;
import java.util.ArrayList;
import java.util.List;

/* compiled from: NotificationListRender.kt */
/* loaded from: classes4.dex */
public interface yb70 extends fm50<dc70> {

    /* compiled from: NotificationListRender.kt */
    public static final class a implements yb70 {
        public final yzt0<String> a;
        public final yzt0<f> b;
        public final yzt0<g> c;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + sr.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(title=");
            sb.append(this.a);
            sb.append(", pagesState=");
            sb.append(this.b);
            sb.append(", snackbarState=");
            return tr.c(sb, this.c, ')');
        }
    }

    /* compiled from: NotificationListRender.kt */
    public static final class b implements yb70 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1788569632;
        }

        public final String toString() {
            return "Initial";
        }
    }

    /* compiled from: NotificationListRender.kt */
    public static final class c {
        public final ArrayList a;

        public c(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return bo.c(')', new StringBuilder("PageContentState(items="), this.a);
        }
    }

    /* compiled from: NotificationListRender.kt */
    public static final class d {
        public final NotificationPageState a;
        public final ListNextState b;

        public d(NotificationPageState notificationPageState, ListNextState listNextState) {
            this.a = notificationPageState;
            this.b = listNextState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            ListNextState listNextState = this.b;
            return hashCode + (listNextState == null ? 0 : listNextState.hashCode());
        }

        public final String toString() {
            return "PageLoadingStatusState(pageState=" + this.a + ", nextState=" + this.b + ')';
        }
    }

    /* compiled from: NotificationListRender.kt */
    public static final class e {
        public final d a;
        public final c b;
        public final boolean c;

        public e(d dVar, c cVar, boolean z) {
            this.a = dVar;
            this.b = cVar;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && this.c == eVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qr.a(this.b.a, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PageState(loadingStatus=");
            sb.append(this.a);
            sb.append(", contentState=");
            sb.append(this.b);
            sb.append(", canShowBanner=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: NotificationListRender.kt */
    public static final class f {
        public final ArrayList a;
        public final List b;
        public final int c;

        public f(int i, ArrayList arrayList, List list) {
            this.a = arrayList;
            this.b = list;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && epx.f(this.b, fVar.b) && this.c == fVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + fw3.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagesState(pages=");
            kr.d(this.a, sb, ", categories=");
            mr.c(", selectedCategoryIndex=", sb, this.b);
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: NotificationListRender.kt */
    public static final class g {
        public final int a;
        public final xh70 b;
        public final t770 c;

        public g(int i, xh70 xh70Var, t770 t770Var) {
            this.a = i;
            this.b = xh70Var;
            this.c = t770Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
            t770 t770Var = this.c;
            return hashCode + (t770Var == null ? 0 : t770Var.hashCode());
        }

        public final String toString() {
            return "SnackbarState(snackbarKey=" + this.a + ", snackbarType=" + this.b + ", alert=" + this.c + ')';
        }
    }
}
