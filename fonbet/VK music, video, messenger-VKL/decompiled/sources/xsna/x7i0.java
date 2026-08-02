package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* compiled from: SelectGroupVerificationMviState.kt */
/* loaded from: classes18.dex */
public interface x7i0 extends km50 {

    /* compiled from: SelectGroupVerificationMviState.kt */
    public static final class a implements x7i0 {
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

    /* compiled from: SelectGroupVerificationMviState.kt */
    public static final class b implements x7i0 {
        public final k7i0 b;

        public b(k7i0 k7i0Var) {
            this.b = k7i0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Ready(content=" + this.b + ')';
        }
    }

    /* compiled from: SelectGroupVerificationMviState.kt */
    public static final class c implements x7i0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 358812574;
        }

        public final String toString() {
            return DeviceInfo.STR_TYPE_UNKNOWN;
        }
    }
}
