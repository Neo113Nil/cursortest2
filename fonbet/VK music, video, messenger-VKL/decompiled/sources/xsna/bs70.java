package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vk.ecomm.verifiedseller.impl.screens.obtainverification.model.ObtainVerificationScreenContent;

/* compiled from: ObtainVerificationMviState.kt */
/* loaded from: classes18.dex */
public interface bs70 extends km50 {

    /* compiled from: ObtainVerificationMviState.kt */
    public static final class a implements bs70 {
        public final Throwable b;

        public a(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Failure(exception="), this.b, ')');
        }
    }

    /* compiled from: ObtainVerificationMviState.kt */
    public static final class b implements bs70 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1333179268;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: ObtainVerificationMviState.kt */
    public static final class c implements bs70 {
        public final ls70 b;
        public final o4q0 c;
        public final ObtainVerificationScreenContent.CurrentModalType d;
        public final boolean e;

        public c(ls70 ls70Var, o4q0 o4q0Var, ObtainVerificationScreenContent.CurrentModalType currentModalType, boolean z) {
            this.b = ls70Var;
            this.c = o4q0Var;
            this.d = currentModalType;
            this.e = z;
        }

        public static c a(c cVar, ls70 ls70Var, o4q0 o4q0Var, ObtainVerificationScreenContent.CurrentModalType currentModalType, boolean z, int i) {
            if ((i & 1) != 0) {
                ls70Var = cVar.b;
            }
            if ((i & 2) != 0) {
                o4q0Var = cVar.c;
            }
            if ((i & 4) != 0) {
                currentModalType = cVar.d;
            }
            cVar.getClass();
            return new c(ls70Var, o4q0Var, currentModalType, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            o4q0 o4q0Var = this.c;
            return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((hashCode + (o4q0Var == null ? 0 : o4q0Var.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ready(content=");
            sb.append(this.b);
            sb.append(", modalContent=");
            sb.append(this.c);
            sb.append(", currentModal=");
            sb.append(this.d);
            sb.append(", isRefreshing=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: ObtainVerificationMviState.kt */
    public static final class d implements bs70 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1954670710;
        }

        public final String toString() {
            return DeviceInfo.STR_TYPE_UNKNOWN;
        }
    }
}
