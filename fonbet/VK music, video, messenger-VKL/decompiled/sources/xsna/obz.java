package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* compiled from: LinkVKBidMviState.kt */
/* loaded from: classes18.dex */
public interface obz extends km50 {

    /* compiled from: LinkVKBidMviState.kt */
    public static final class a implements obz {
        public final afu0 b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public a(afu0 afu0Var, boolean z, boolean z2, boolean z3) {
            this.b = afu0Var;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }

        public static a a(a aVar, afu0 afu0Var, int i) {
            if ((i & 1) != 0) {
                afu0Var = aVar.b;
            }
            boolean z = (i & 2) != 0 ? aVar.c : true;
            boolean z2 = (i & 4) != 0 ? aVar.d : false;
            boolean z3 = aVar.e;
            aVar.getClass();
            return new a(afu0Var, z, z2, z3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(data=");
            sb.append(this.b);
            sb.append(", isLoading=");
            sb.append(this.c);
            sb.append(", isLinkButtonEnabled=");
            sb.append(this.d);
            sb.append(", isWaitingForUpdate=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: LinkVKBidMviState.kt */
    public static final class b implements obz {
        public final Exception b;

        public b(Exception exc) {
            this.b = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b.equals(((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Failure(exception=" + this.b + ')';
        }
    }

    /* compiled from: LinkVKBidMviState.kt */
    public static final class c implements obz {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1338054672;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: LinkVKBidMviState.kt */
    public static final class d implements obz {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1959546114;
        }

        public final String toString() {
            return DeviceInfo.STR_TYPE_UNKNOWN;
        }
    }
}
