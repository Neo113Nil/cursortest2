package xsna;

import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;

/* compiled from: VkHealthStatus.kt */
/* loaded from: classes11.dex */
public final class iyu0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final g0v f;
    public final HealthConnectSdkStatus g;
    public final MobileServicesType h;

    public iyu0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, g0v g0vVar, HealthConnectSdkStatus healthConnectSdkStatus, MobileServicesType mobileServicesType) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = g0vVar;
        this.g = healthConnectSdkStatus;
        this.h = mobileServicesType;
    }

    public static iyu0 a(iyu0 iyu0Var) {
        boolean z = iyu0Var.b;
        boolean z2 = iyu0Var.c;
        boolean z3 = iyu0Var.d;
        boolean z4 = iyu0Var.e;
        g0v g0vVar = iyu0Var.f;
        HealthConnectSdkStatus healthConnectSdkStatus = iyu0Var.g;
        MobileServicesType mobileServicesType = iyu0Var.h;
        iyu0Var.getClass();
        return new iyu0(true, z, z2, z3, z4, g0vVar, healthConnectSdkStatus, mobileServicesType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyu0)) {
            return false;
        }
        iyu0 iyu0Var = (iyu0) obj;
        return this.a == iyu0Var.a && this.b == iyu0Var.b && this.c == iyu0Var.c && this.d == iyu0Var.d && this.e == iyu0Var.e && epx.f(this.f, iyu0Var.f) && this.g == iyu0Var.g && this.h == iyu0Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31);
    }

    public final String toString() {
        return "VkHealthStatus(isActivityRecognitionAvailable=" + this.a + ", isGooglePlayServicesAvailable=" + this.b + ", isGoogleFitPermissionsAvailable=" + this.c + ", isHuaweiServicesAvailable=" + this.d + ", isHuaweiHealthPermissionsAvailable=" + this.e + ", healthConnectPermissionsStatus=" + this.f + ", healthConnectSdkStatus=" + this.g + ", mobileServicesType=" + this.h + ')';
    }
}
