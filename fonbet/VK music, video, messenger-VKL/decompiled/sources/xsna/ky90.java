package xsna;

import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$PermissionAccessStatus;

/* compiled from: PermissionsState.kt */
/* loaded from: classes6.dex */
public final class ky90 {
    public final MobileOfficialAppsStoriesStat$PermissionAccessStatus a;
    public final MobileOfficialAppsStoriesStat$PermissionAccessStatus b;

    public ky90(MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus, MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus2) {
        this.a = mobileOfficialAppsStoriesStat$PermissionAccessStatus;
        this.b = mobileOfficialAppsStoriesStat$PermissionAccessStatus2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky90)) {
            return false;
        }
        ky90 ky90Var = (ky90) obj;
        return this.a == ky90Var.a && this.b == ky90Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PermissionsState(cameraStatus=" + this.a + ", galleryStatus=" + this.b + ')';
    }
}
