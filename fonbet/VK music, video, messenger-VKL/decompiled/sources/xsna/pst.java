package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* compiled from: GetMaxSessionStatus.kt */
/* loaded from: classes15.dex */
public abstract class pst {

    /* compiled from: GetMaxSessionStatus.kt */
    public static final class a extends pst {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -314274302;
        }

        public final String toString() {
            return "Refused";
        }
    }

    /* compiled from: GetMaxSessionStatus.kt */
    public static final class b extends pst {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1773259685;
        }

        public final String toString() {
            return "TimedOut";
        }
    }

    /* compiled from: GetMaxSessionStatus.kt */
    public static final class c extends pst {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1684662404;
        }

        public final String toString() {
            return DeviceInfo.STR_TYPE_UNKNOWN;
        }
    }

    /* compiled from: GetMaxSessionStatus.kt */
    public static final class d extends pst {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Verified(code="), this.a, ')');
        }
    }

    /* compiled from: GetMaxSessionStatus.kt */
    public static final class e extends pst {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -283508353;
        }

        public final String toString() {
            return "Waiting";
        }
    }
}
