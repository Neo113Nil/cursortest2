package xsna;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.vk.stat.scheme.MobileOfficialAppsCoreDeviceStat$DeviceInfoItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsHealthStat$TypeHealthSyncStateItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.superapp.bridges.dto.analytics.HealthDataProvider;
import com.vk.superapp.bridges.dto.analytics.HealthSyncState;
import com.vk.superapp.vksteps.VkStepsSyncReason;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkStepsAnalyticsUtils.kt */
/* loaded from: classes6.dex */
public final class amv0 {

    /* compiled from: VkStepsAnalyticsUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HealthDataProvider.values().length];
            try {
                iArr[HealthDataProvider.GOOGLE_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HealthDataProvider.HUAWEI_HEALTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HealthDataProvider.HEALTH_CONNECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(Context context, HealthSyncState healthSyncState, VkStepsSyncReason vkStepsSyncReason, HealthDataProvider healthDataProvider, String str, int i, long j) {
        String str2;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        String str3;
        String str4;
        PackageManager.PackageInfoFlags of;
        Object obj;
        Object obj2;
        Object obj3;
        PackageManager.PackageInfoFlags of2;
        int i2 = a.$EnumSwitchMapping$0[healthDataProvider.ordinal()];
        if (i2 == 1) {
            str2 = "com.google.android.apps.fitness";
        } else if (i2 == 2) {
            str2 = "com.huawei.health";
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "com.google.android.apps.healthdata";
        }
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                of2 = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(str2, of2);
            } else {
                packageInfo = context.getPackageManager().getPackageInfo(str2, 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    PackageManager packageManager2 = context.getPackageManager();
                    of = PackageManager.PackageInfoFlags.of(0L);
                    packageInfo2 = packageManager2.getPackageInfo(str2, of);
                } else {
                    packageInfo2 = context.getPackageManager().getPackageInfo(str2, 0);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                packageInfo2 = null;
            }
            if (packageInfo2 == null) {
                str3 = str2.concat(" not found");
            } else {
                str3 = "Version Name: " + packageInfo2.versionName;
            }
            str4 = str3;
        } else {
            str4 = null;
        }
        udx0 udx0Var = e370.i;
        if (udx0Var == null) {
            udx0Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String h = vkStepsSyncReason.h();
        udx0Var.getClass();
        MobileOfficialAppsCoreDeviceStat$DeviceInfoItem f = vhk0.f();
        if (f == null) {
            return;
        }
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.MINI_APP;
        Iterator<E> it = MobileOfficialAppsHealthStat$TypeHealthSyncStateItem.State.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (brm0.w(((MobileOfficialAppsHealthStat$TypeHealthSyncStateItem.State) obj).name(), healthSyncState.name(), true)) {
                    break;
                }
            }
        }
        MobileOfficialAppsHealthStat$TypeHealthSyncStateItem.State state = (MobileOfficialAppsHealthStat$TypeHealthSyncStateItem.State) obj;
        if (state == null) {
            state = MobileOfficialAppsHealthStat$TypeHealthSyncStateItem.State.API_SYNC_ERROR;
        }
        MobileOfficialAppsHealthStat$TypeHealthSyncStateItem.State state2 = state;
        Iterator<E> it2 = MobileOfficialAppsHealthStat$TypeHealthSyncStateItem.SyncReason.h().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it2.next();
                if (brm0.w(((MobileOfficialAppsHealthStat$TypeHealthSyncStateItem.SyncReason) obj2).name(), h, true)) {
                    break;
                }
            }
        }
        MobileOfficialAppsHealthStat$TypeHealthSyncStateItem.SyncReason syncReason = (MobileOfficialAppsHealthStat$TypeHealthSyncStateItem.SyncReason) obj2;
        if (syncReason == null) {
            syncReason = MobileOfficialAppsHealthStat$TypeHealthSyncStateItem.SyncReason.OTHER;
        }
        MobileOfficialAppsHealthStat$TypeHealthSyncStateItem.SyncReason syncReason2 = syncReason;
        Iterator<E> it3 = MobileOfficialAppsHealthStat$TypeHealthSyncStateItem.DataSource.h().iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            } else {
                obj3 = it3.next();
                if (brm0.w(((MobileOfficialAppsHealthStat$TypeHealthSyncStateItem.DataSource) obj3).name(), healthDataProvider.name(), true)) {
                    break;
                }
            }
        }
        MobileOfficialAppsHealthStat$TypeHealthSyncStateItem.DataSource dataSource = (MobileOfficialAppsHealthStat$TypeHealthSyncStateItem.DataSource) obj3;
        if (dataSource == null) {
            dataSource = MobileOfficialAppsHealthStat$TypeHealthSyncStateItem.DataSource.UNDEFINED;
        }
        new iid0(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsHealthStat$TypeHealthSyncStateItem(state2, j, currentTimeMillis, i, syncReason2, dataSource, f, str, str4, null, null, 1536, null), 3)).q();
    }
}
