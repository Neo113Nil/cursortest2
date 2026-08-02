package xsna;

import java.util.List;

/* compiled from: ManageCommunitiesNotificationsRender.kt */
/* loaded from: classes5.dex */
public interface zg00 extends fm50<dh00> {

    /* compiled from: ManageCommunitiesNotificationsRender.kt */
    public static final class a implements zg00 {
        public final yzt0<d> a;
        public final yzt0<b> b;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(loadingStatus=");
            sb.append(this.a);
            sb.append(", contentState=");
            return tr.c(sb, this.b, ')');
        }
    }

    /* compiled from: ManageCommunitiesNotificationsRender.kt */
    public static final class b {
        public final List a;

        public b(List list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return jr.a(')', new StringBuilder("ContentState(items="), this.a);
        }
    }

    /* compiled from: ManageCommunitiesNotificationsRender.kt */
    public static final class c implements zg00 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 919953183;
        }

        public final String toString() {
            return "Initial";
        }
    }

    /* compiled from: ManageCommunitiesNotificationsRender.kt */
    public static final class d {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public d(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadingStatusState(isLoading=");
            sb.append(this.a);
            sb.append(", isRefreshing=");
            sb.append(this.b);
            sb.append(", isError=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }
}
