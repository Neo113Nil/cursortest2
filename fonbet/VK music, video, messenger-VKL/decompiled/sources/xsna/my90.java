package xsna;

import android.content.Context;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$PermissionAccessStatus;
import com.vk.stories.analytics.session.storage.permissions.CallReason;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PermissionsStorageImpl.kt */
/* loaded from: classes6.dex */
public final class my90 implements ly90 {
    public ky90 a;

    /* compiled from: PermissionsStorageImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CallReason.values().length];
            try {
                iArr[CallReason.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallReason.SET_ACCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.ly90
    public final void a(Context context, CallReason callReason, boolean z, boolean z2) {
        MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus;
        MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus2;
        ky90 ky90Var = this.a;
        MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus3 = ky90Var.a;
        MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus4 = ky90Var.b;
        if (z) {
            PermissionHelper permissionHelper = PermissionHelper.a;
            String[] strArr = PermissionHelper.m;
            permissionHelper.getClass();
            boolean z3 = PermissionHelper.b(context, strArr) && PermissionHelper.b(context, PermissionHelper.l);
            int i = a.$EnumSwitchMapping$0[callReason.ordinal()];
            if (i == 1) {
                mobileOfficialAppsStoriesStat$PermissionAccessStatus2 = z3 ? MobileOfficialAppsStoriesStat$PermissionAccessStatus.AUTHORIZED : MobileOfficialAppsStoriesStat$PermissionAccessStatus.NOT_DETERMINED;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                mobileOfficialAppsStoriesStat$PermissionAccessStatus2 = z3 ? MobileOfficialAppsStoriesStat$PermissionAccessStatus.AUTHORIZED : MobileOfficialAppsStoriesStat$PermissionAccessStatus.DENIED;
            }
            mobileOfficialAppsStoriesStat$PermissionAccessStatus3 = mobileOfficialAppsStoriesStat$PermissionAccessStatus2;
        }
        if (z2) {
            PermissionHelper.a.getClass();
            boolean q = PermissionHelper.q(context);
            boolean o = PermissionHelper.o(context);
            int i2 = a.$EnumSwitchMapping$0[callReason.ordinal()];
            if (i2 == 1) {
                mobileOfficialAppsStoriesStat$PermissionAccessStatus = (q && o) ? MobileOfficialAppsStoriesStat$PermissionAccessStatus.LIMITED : (!q || o) ? MobileOfficialAppsStoriesStat$PermissionAccessStatus.NOT_DETERMINED : MobileOfficialAppsStoriesStat$PermissionAccessStatus.AUTHORIZED;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                mobileOfficialAppsStoriesStat$PermissionAccessStatus = (q && o) ? MobileOfficialAppsStoriesStat$PermissionAccessStatus.LIMITED : (!q || o) ? MobileOfficialAppsStoriesStat$PermissionAccessStatus.DENIED : MobileOfficialAppsStoriesStat$PermissionAccessStatus.AUTHORIZED;
            }
            mobileOfficialAppsStoriesStat$PermissionAccessStatus4 = mobileOfficialAppsStoriesStat$PermissionAccessStatus;
        }
        this.a = new ky90(mobileOfficialAppsStoriesStat$PermissionAccessStatus3, mobileOfficialAppsStoriesStat$PermissionAccessStatus4);
    }

    @Override // xsna.ly90
    public final void c() {
        MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus = MobileOfficialAppsStoriesStat$PermissionAccessStatus.NOT_DETERMINED;
        this.a = new ky90(mobileOfficialAppsStoriesStat$PermissionAccessStatus, mobileOfficialAppsStoriesStat$PermissionAccessStatus);
    }

    @Override // xsna.ly90
    public final void d(ky90 ky90Var) {
        this.a = ky90Var;
    }

    @Override // xsna.ly90
    public final ky90 e() {
        return this.a;
    }
}
