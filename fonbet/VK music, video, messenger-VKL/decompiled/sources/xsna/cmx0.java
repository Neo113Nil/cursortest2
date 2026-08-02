package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;
import java.util.Map;

/* compiled from: WhitelistState.kt */
/* loaded from: classes3.dex */
public interface cmx0 {

    /* compiled from: WhitelistState.kt */
    public static final class a implements c {
        public final Map<String, Boolean> a;

        public a(Map<String, Boolean> map) {
            this.a = map;
        }

        @Override // xsna.cmx0.c
        public final Map<String, Boolean> a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // xsna.cmx0.c
        public final boolean isEnabled() {
            return false;
        }

        public final String toString() {
            return cjl0.a(new StringBuilder("Disabled(statuses="), this.a, ')');
        }
    }

    /* compiled from: WhitelistState.kt */
    public static final class b implements c {
        public final Map<String, Boolean> a;

        public b(Map<String, Boolean> map) {
            this.a = map;
        }

        @Override // xsna.cmx0.c
        public final Map<String, Boolean> a() {
            return this.a;
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

        @Override // xsna.cmx0.c
        public final boolean isEnabled() {
            return true;
        }

        public final String toString() {
            return cjl0.a(new StringBuilder("Enabled(statuses="), this.a, ')');
        }
    }

    /* compiled from: WhitelistState.kt */
    public interface c extends cmx0 {
        Map<String, Boolean> a();

        boolean isEnabled();
    }

    /* compiled from: WhitelistState.kt */
    public static final class d implements cmx0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -249875761;
        }

        public final String toString() {
            return DeviceInfo.STR_TYPE_UNKNOWN;
        }
    }
}
