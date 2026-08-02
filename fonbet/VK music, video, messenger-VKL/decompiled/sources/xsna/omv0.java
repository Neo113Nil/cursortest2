package xsna;

import android.content.Context;
import com.vk.stat.scheme.MobileOfficialAppsCoreDeviceStat$DeviceInfoItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem;
import com.vk.stat.scheme.MobileOfficialAppsHealthStat$TypeHealthPermission;
import com.vk.stat.scheme.MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.superapp.bridges.dto.analytics.VkStepsResultPermissionItem$DataSource;
import com.vk.superapp.bridges.dto.analytics.VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus;
import com.vk.superapp.bridges.dto.analytics.VkStepsResultPermissionItem$HealthConnectInfo$Installer;
import com.vk.superapp.bridges.dto.analytics.VkStepsResultPermissionItem$Permission;
import com.vk.superapp.bridges.dto.analytics.VkStepsResultPermissionItem$PermissionState;
import com.vk.superapp.bridges.dto.analytics.VkStepsResultPermissionItem$SyncReason;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectPermissions;
import com.vk.superapp.vkhealth.permissions.api.type.HealthConnectSdkStatus;
import com.vk.superapp.vksteps.utils.enums.HealthConnectInstallType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.g0v;
import xsna.udx0;

/* compiled from: VkStepsPermissionAnalytics.kt */
/* loaded from: classes6.dex */
public final class omv0 {

    /* compiled from: VkStepsPermissionAnalytics.kt */
    public static final class a {
        public final long a;
        public final VkStepsResultPermissionItem$SyncReason b;
        public final boolean c;
        public final iyu0 d;
        public final String e;

        public /* synthetic */ a(long j, VkStepsResultPermissionItem$SyncReason vkStepsResultPermissionItem$SyncReason, iyu0 iyu0Var, String str, int i) {
            this(j, vkStepsResultPermissionItem$SyncReason, true, (i & 8) != 0 ? null : iyu0Var, (i & 16) != 0 ? null : str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int b = qoy.b((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c);
            iyu0 iyu0Var = this.d;
            int hashCode = (b + (iyu0Var == null ? 0 : iyu0Var.hashCode())) * 31;
            String str = this.e;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PermissionAnalyticsParam(startTime=");
            sb.append(this.a);
            sb.append(", syncReason=");
            sb.append(this.b);
            sb.append(", arePermissionsRequested=");
            sb.append(this.c);
            sb.append(", healthStatus=");
            sb.append(this.d);
            sb.append(", errorMessage=");
            return ho8.a(sb, this.e, ')');
        }

        public a(long j, VkStepsResultPermissionItem$SyncReason vkStepsResultPermissionItem$SyncReason, boolean z, iyu0 iyu0Var, String str) {
            this.a = j;
            this.b = vkStepsResultPermissionItem$SyncReason;
            this.c = z;
            this.d = iyu0Var;
            this.e = str;
        }
    }

    /* compiled from: VkStepsPermissionAnalytics.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[HealthConnectPermissions.values().length];
            try {
                iArr[HealthConnectPermissions.STEPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HealthConnectPermissions.DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HealthConnectPermissions.WORKOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HealthConnectPermissions.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HealthConnectSdkStatus.values().length];
            try {
                iArr2[HealthConnectSdkStatus.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[HealthConnectSdkStatus.NEED_INSTALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[HealthConnectSdkStatus.NEED_MANDATORY_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[HealthConnectSdkStatus.UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[HealthConnectSdkStatus.UNAVAILABLE_TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[HealthConnectInstallType.values().length];
            try {
                iArr3[HealthConnectInstallType.PLAY_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[HealthConnectInstallType.NOT_INSTALLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[HealthConnectInstallType.SYSTEM_PREINSTALLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[HealthConnectInstallType.UNKNOWN_SOURCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, a aVar) {
        VkStepsResultPermissionItem$PermissionState vkStepsResultPermissionItem$PermissionState;
        String str;
        int i;
        VkStepsResultPermissionItem$HealthConnectInfo$Installer vkStepsResultPermissionItem$HealthConnectInfo$Installer;
        int i2;
        VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus;
        ArrayList arrayList;
        g0v g0vVar;
        VkStepsResultPermissionItem$Permission vkStepsResultPermissionItem$Permission;
        MobileOfficialAppsCoreDeviceStat$DeviceInfoItem f;
        MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.State state;
        MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.SyncReason syncReason;
        MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem.HealthConnectSdkStatus healthConnectSdkStatus;
        int i3;
        MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem.HealthConnectInstaller healthConnectInstaller;
        MobileOfficialAppsHealthStat$TypeHealthPermission mobileOfficialAppsHealthStat$TypeHealthPermission;
        g0v g0vVar2;
        String str2 = aVar.e;
        iyu0 iyu0Var = aVar.d;
        boolean c = f890.c(context);
        boolean z = f890.b(context, "com.google.android.apps.fitness") != null;
        udx0 udx0Var = e370.i;
        if (udx0Var == null) {
            udx0Var = null;
        }
        if (str2 == null || str2.length() == 0) {
            g0v g0vVar3 = iyu0Var != null ? iyu0Var.f : null;
            if (epx.f(g0vVar3, g0v.b.a)) {
                vkStepsResultPermissionItem$PermissionState = VkStepsResultPermissionItem$PermissionState.PERMISSIONS_GRANTED;
            } else if (g0vVar3 instanceof g0v.a) {
                vkStepsResultPermissionItem$PermissionState = iyu0Var.a ? VkStepsResultPermissionItem$PermissionState.SOME_PERMISSIONS_DISABLED : VkStepsResultPermissionItem$PermissionState.ERROR;
            } else if (g0vVar3 instanceof g0v.c) {
                vkStepsResultPermissionItem$PermissionState = VkStepsResultPermissionItem$PermissionState.SOME_PERMISSIONS_DISABLED;
            } else {
                if (g0vVar3 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                vkStepsResultPermissionItem$PermissionState = VkStepsResultPermissionItem$PermissionState.ERROR;
            }
        } else {
            vkStepsResultPermissionItem$PermissionState = VkStepsResultPermissionItem$PermissionState.ERROR;
        }
        VkStepsResultPermissionItem$SyncReason vkStepsResultPermissionItem$SyncReason = VkStepsResultPermissionItem$SyncReason.CHECK_STEPS_PERMISSIONS_COMMAND;
        if (iyu0Var != null && (g0vVar2 = iyu0Var.f) != null) {
            String str3 = g0vVar2 instanceof g0v.a ? ((g0v.a) g0vVar2).b : str2;
            if (str3 != null) {
                str = str3;
                boolean z2 = aVar.c;
                i = b.$EnumSwitchMapping$2[f890.a(context).ordinal()];
                if (i != 1) {
                    vkStepsResultPermissionItem$HealthConnectInfo$Installer = VkStepsResultPermissionItem$HealthConnectInfo$Installer.PLAY_STORE;
                } else if (i == 2) {
                    vkStepsResultPermissionItem$HealthConnectInfo$Installer = VkStepsResultPermissionItem$HealthConnectInfo$Installer.NOT_INSTALLED;
                } else if (i == 3) {
                    vkStepsResultPermissionItem$HealthConnectInfo$Installer = VkStepsResultPermissionItem$HealthConnectInfo$Installer.SYSTEM_PREINSTALLED;
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vkStepsResultPermissionItem$HealthConnectInfo$Installer = VkStepsResultPermissionItem$HealthConnectInfo$Installer.UNKNOWN_SOURCE;
                }
                HealthConnectSdkStatus healthConnectSdkStatus2 = iyu0Var == null ? iyu0Var.g : null;
                i2 = healthConnectSdkStatus2 != null ? -1 : b.$EnumSwitchMapping$1[healthConnectSdkStatus2.ordinal()];
                if (i2 != -1) {
                    vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus = VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus.UNAVAILABLE_TIMEOUT;
                } else if (i2 == 1) {
                    vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus = VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus.AVAILABLE;
                } else if (i2 == 2) {
                    vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus = VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus.NEED_INSTALL;
                } else if (i2 == 3) {
                    vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus = VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus.NEED_UPDATE;
                } else if (i2 == 4) {
                    vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus = VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus.UNAVAILABLE;
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus = VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus.UNAVAILABLE_TIMEOUT;
                }
                arrayList = new ArrayList();
                if (iyu0Var != null && iyu0Var.a) {
                    arrayList.add(VkStepsResultPermissionItem$Permission.ACTIVITY_RECOGNITION);
                }
                g0vVar = iyu0Var == null ? iyu0Var.f : null;
                if (!epx.f(g0vVar, g0v.b.a)) {
                    arrayList.addAll(e43.l(VkStepsResultPermissionItem$Permission.STEPS, VkStepsResultPermissionItem$Permission.DISTANCE));
                } else if (!(g0vVar instanceof g0v.a)) {
                    if (g0vVar instanceof g0v.c) {
                        ArrayList arrayList2 = ((g0v.c) g0vVar).a;
                        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            int i4 = b.$EnumSwitchMapping$0[((HealthConnectPermissions) it.next()).ordinal()];
                            if (i4 == 1) {
                                vkStepsResultPermissionItem$Permission = VkStepsResultPermissionItem$Permission.STEPS;
                            } else if (i4 == 2) {
                                vkStepsResultPermissionItem$Permission = VkStepsResultPermissionItem$Permission.DISTANCE;
                            } else if (i4 == 3) {
                                vkStepsResultPermissionItem$Permission = VkStepsResultPermissionItem$Permission.WORKOUT;
                            } else {
                                if (i4 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                vkStepsResultPermissionItem$Permission = VkStepsResultPermissionItem$Permission.UNKNOWN;
                            }
                            arrayList3.add(vkStepsResultPermissionItem$Permission);
                        }
                        arrayList.addAll(arrayList3);
                    } else if (g0vVar != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                long j = aVar.a;
                long currentTimeMillis = System.currentTimeMillis();
                Boolean valueOf = Boolean.valueOf(z2);
                VkStepsResultPermissionItem$DataSource vkStepsResultPermissionItem$DataSource = VkStepsResultPermissionItem$DataSource.GOOGLE_FIT;
                udx0Var.getClass();
                f = vhk0.f();
                if (f != null) {
                    return;
                }
                int i5 = udx0.a.$EnumSwitchMapping$7[vkStepsResultPermissionItem$PermissionState.ordinal()];
                if (i5 == 1) {
                    state = MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.State.ALL_PERMISSIONS_GRANTED;
                } else if (i5 == 2) {
                    state = MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.State.SOME_PERMISSIONS_DISABLED;
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    state = MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.State.ERROR;
                }
                MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.DataSource dataSource = MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.DataSource.HEALTH_CONNECT;
                int i6 = udx0.a.$EnumSwitchMapping$8[vkStepsResultPermissionItem$SyncReason.ordinal()];
                if (i6 == 1) {
                    syncReason = MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.SyncReason.CHEKSTEPSPERMISSIONSCOMMAND;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    syncReason = MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.SyncReason.GETSTEPSCOMMAND;
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    int i7 = udx0.a.$EnumSwitchMapping$9[((VkStepsResultPermissionItem$Permission) it2.next()).ordinal()];
                    if (i7 == 1) {
                        mobileOfficialAppsHealthStat$TypeHealthPermission = MobileOfficialAppsHealthStat$TypeHealthPermission.STEPS;
                    } else if (i7 == 2) {
                        mobileOfficialAppsHealthStat$TypeHealthPermission = MobileOfficialAppsHealthStat$TypeHealthPermission.DISTANCE;
                    } else if (i7 == 3) {
                        mobileOfficialAppsHealthStat$TypeHealthPermission = MobileOfficialAppsHealthStat$TypeHealthPermission.ACTIVITY_RECOGNITION;
                    } else if (i7 == 4) {
                        mobileOfficialAppsHealthStat$TypeHealthPermission = MobileOfficialAppsHealthStat$TypeHealthPermission.WORKOUT;
                    } else {
                        if (i7 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mobileOfficialAppsHealthStat$TypeHealthPermission = MobileOfficialAppsHealthStat$TypeHealthPermission.OTHER;
                    }
                    arrayList4.add(mobileOfficialAppsHealthStat$TypeHealthPermission);
                }
                Boolean valueOf2 = Boolean.valueOf(c);
                Boolean valueOf3 = Boolean.valueOf(z);
                int i8 = vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus == null ? -1 : udx0.a.$EnumSwitchMapping$10[vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus.ordinal()];
                if (i8 == -1) {
                    healthConnectSdkStatus = null;
                } else if (i8 == 1) {
                    healthConnectSdkStatus = MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem.HealthConnectSdkStatus.UNAVAILABLE;
                } else if (i8 == 2) {
                    healthConnectSdkStatus = MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem.HealthConnectSdkStatus.AVAILABLE;
                } else if (i8 == 3) {
                    healthConnectSdkStatus = MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem.HealthConnectSdkStatus.NEED_UPDATE;
                } else if (i8 == 4) {
                    healthConnectSdkStatus = MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem.HealthConnectSdkStatus.NEED_INSTALL;
                } else {
                    if (i8 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    healthConnectSdkStatus = MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem.HealthConnectSdkStatus.UNAVAILABLE_TIMEOUT;
                }
                int i9 = vkStepsResultPermissionItem$HealthConnectInfo$Installer == null ? -1 : udx0.a.$EnumSwitchMapping$11[vkStepsResultPermissionItem$HealthConnectInfo$Installer.ordinal()];
                if (i9 == -1) {
                    i3 = 3;
                    healthConnectInstaller = null;
                } else if (i9 == 1) {
                    i3 = 3;
                    healthConnectInstaller = MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem.HealthConnectInstaller.SYSTEM_PREINSTALLED;
                } else if (i9 != 2) {
                    i3 = 3;
                    if (i9 == 3) {
                        healthConnectInstaller = MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem.HealthConnectInstaller.UNKNOWN_SOURCE;
                    } else {
                        if (i9 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        healthConnectInstaller = MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem.HealthConnectInstaller.NOT_INSTALLED;
                    }
                } else {
                    i3 = 3;
                    healthConnectInstaller = MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem.HealthConnectInstaller.PLAY_STORE;
                }
                new iid0(MobileOfficialAppsCoreNavStat$EventScreen.MINI_APP, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem(state, j, currentTimeMillis, dataSource, f, str, syncReason, valueOf, arrayList4, null, new MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem(healthConnectInstaller, valueOf3, valueOf2, healthConnectSdkStatus), 512, null), i3)).q();
                return;
            }
        }
        str = str2;
        boolean z22 = aVar.c;
        i = b.$EnumSwitchMapping$2[f890.a(context).ordinal()];
        if (i != 1) {
        }
        if (iyu0Var == null) {
        }
        if (healthConnectSdkStatus2 != null) {
        }
        if (i2 != -1) {
        }
        arrayList = new ArrayList();
        if (iyu0Var != null) {
            arrayList.add(VkStepsResultPermissionItem$Permission.ACTIVITY_RECOGNITION);
        }
        if (iyu0Var == null) {
        }
        if (!epx.f(g0vVar, g0v.b.a)) {
        }
        long j2 = aVar.a;
        long currentTimeMillis2 = System.currentTimeMillis();
        Boolean valueOf4 = Boolean.valueOf(z22);
        VkStepsResultPermissionItem$DataSource vkStepsResultPermissionItem$DataSource2 = VkStepsResultPermissionItem$DataSource.GOOGLE_FIT;
        udx0Var.getClass();
        f = vhk0.f();
        if (f != null) {
        }
    }
}
