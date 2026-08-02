package xsna;

import com.vk.ecomm.verifiedseller.impl.screens.obtainverification.model.ObtainVerificationScreenContent;

/* compiled from: ObtainVerificationPath.kt */
/* loaded from: classes18.dex */
public interface ds70 extends xl50 {

    /* compiled from: ObtainVerificationPath.kt */
    public static final class a implements ds70 {
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
            return oq.c(new StringBuilder("SetFailure(exception="), this.b, ')');
        }
    }

    /* compiled from: ObtainVerificationPath.kt */
    public static final class b implements ds70 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1894363302;
        }

        public final String toString() {
            return "SetLoading";
        }
    }

    /* compiled from: ObtainVerificationPath.kt */
    public static final class c implements ds70 {
        public final ObtainVerificationScreenContent.CurrentModalType b;

        public c(ObtainVerificationScreenContent.CurrentModalType currentModalType) {
            this.b = currentModalType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetNextModal(currentModalType=" + this.b + ')';
        }
    }

    /* compiled from: ObtainVerificationPath.kt */
    public static final class d implements ds70 {
        public final o4q0 b;

        public d(o4q0 o4q0Var) {
            this.b = o4q0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetObtainUnlinkData(modalData=" + this.b + ')';
        }
    }

    /* compiled from: ObtainVerificationPath.kt */
    public static final class e implements ds70 {
        public final ls70 b;

        public e(ls70 ls70Var) {
            this.b = ls70Var;
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
            return "SetObtainVerificationData(data=" + this.b + ')';
        }
    }

    /* compiled from: ObtainVerificationPath.kt */
    public static final class f implements ds70 {
        public final ls70 b;

        public f(ls70 ls70Var) {
            this.b = ls70Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetRefreshVerificationData(data=" + this.b + ')';
        }
    }

    /* compiled from: ObtainVerificationPath.kt */
    public static final class g implements ds70 {
        public final boolean b;

        public g(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetRefreshing(isRefreshing="), this.b, ')');
        }
    }
}
