package xsna;

import com.vk.superapp.vkhealth.permissions.api.type.DeniedReason;
import java.util.ArrayList;

/* compiled from: HealthConnectPermissionsStatus.kt */
/* loaded from: classes11.dex */
public abstract class g0v {

    /* compiled from: HealthConnectPermissionsStatus.kt */
    public static final class a extends g0v {
        public final DeniedReason a;
        public final String b;

        public a() {
            this((DeniedReason) null, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Denied(deniedReason=");
            sb.append(this.a);
            sb.append(", exceptionMessage=");
            return ho8.a(sb, this.b, ')');
        }

        public a(DeniedReason deniedReason, String str) {
            this.a = deniedReason;
            this.b = str;
        }

        public /* synthetic */ a(DeniedReason deniedReason, int i) {
            this((i & 1) != 0 ? DeniedReason.SDK_UNAVAILABLE : deniedReason, (String) null);
        }
    }

    /* compiled from: HealthConnectPermissionsStatus.kt */
    /* loaded from: classes6.dex */
    public static final class b extends g0v {
        public static final b a = new b();
    }

    /* compiled from: HealthConnectPermissionsStatus.kt */
    /* loaded from: classes6.dex */
    public static final class c extends g0v {
        public final ArrayList a;

        public c(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("PartiallyGranted(permissionsGranted="), this.a);
        }
    }
}
