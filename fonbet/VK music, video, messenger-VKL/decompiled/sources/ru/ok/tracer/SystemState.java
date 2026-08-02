package ru.ok.tracer;

import java.util.Date;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import ru.ok.tracer.base.datetime.DateTimeUtils;
import xsna.bh10;
import xsna.epx;
import xsna.n6j;
import xsna.pn00;
import xsna.rqi;
import xsna.urd0;
import xsna.v11;
import xsna.zcl;

/* compiled from: SystemState.kt */
/* loaded from: classes11.dex */
public final class SystemState {
    public static final Companion Companion = new Companion(null);
    public static final String PROPERTY_KEY_PROCESS_NAME = "processName";
    public static final String PROPERTY_KEY_SAMPLED = "sampled";
    public static final String PROPERTY_KEY_USER_ID = "userId";
    private final String buildUuid;
    private final String connection;
    private final String device;
    private final String deviceId;
    private final String environment;
    private Set<HostedTracerLibraryInfo> hostedLibrariesInfo;
    private final boolean isInBackground;
    private final boolean isRooted;
    private final String osVersion;
    private final String packageName;
    private Map<String, String> properties;
    private final String sessionUuid;
    private final String vendor;
    private final long versionCode;
    private final String versionName;

    /* compiled from: SystemState.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public SystemState(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, boolean z2, Map<String, String> map, Set<HostedTracerLibraryInfo> set) {
        this.versionName = str;
        this.versionCode = j;
        this.packageName = str2;
        this.environment = str3;
        this.buildUuid = str4;
        this.sessionUuid = str5;
        this.device = str6;
        this.deviceId = str7;
        this.vendor = str8;
        this.osVersion = str9;
        this.isInBackground = z;
        this.connection = str10;
        this.isRooted = z2;
        this.properties = map;
        this.hostedLibrariesInfo = set;
    }

    public static /* synthetic */ SystemState copy$default(SystemState systemState, String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, boolean z2, Map map, Set set, int i, Object obj) {
        return systemState.copy((i & 1) != 0 ? systemState.versionName : str, (i & 2) != 0 ? systemState.versionCode : j, (i & 4) != 0 ? systemState.packageName : str2, (i & 8) != 0 ? systemState.environment : str3, (i & 16) != 0 ? systemState.buildUuid : str4, (i & 32) != 0 ? systemState.sessionUuid : str5, (i & 64) != 0 ? systemState.device : str6, (i & 128) != 0 ? systemState.deviceId : str7, (i & 256) != 0 ? systemState.vendor : str8, (i & 512) != 0 ? systemState.osVersion : str9, (i & 1024) != 0 ? systemState.isInBackground : z, (i & 2048) != 0 ? systemState.connection : str10, (i & 4096) != 0 ? systemState.isRooted : z2, (i & 8192) != 0 ? systemState.properties : map, (i & 16384) != 0 ? systemState.hostedLibrariesInfo : set);
    }

    public final String component1() {
        return this.versionName;
    }

    public final String component10() {
        return this.osVersion;
    }

    public final boolean component11() {
        return this.isInBackground;
    }

    public final String component12() {
        return this.connection;
    }

    public final boolean component13() {
        return this.isRooted;
    }

    public final Map<String, String> component14() {
        return this.properties;
    }

    public final Set<HostedTracerLibraryInfo> component15() {
        return this.hostedLibrariesInfo;
    }

    public final long component2() {
        return this.versionCode;
    }

    public final String component3() {
        return this.packageName;
    }

    public final String component4() {
        return this.environment;
    }

    public final String component5() {
        return this.buildUuid;
    }

    public final String component6() {
        return this.sessionUuid;
    }

    public final String component7() {
        return this.device;
    }

    public final String component8() {
        return this.deviceId;
    }

    public final String component9() {
        return this.vendor;
    }

    public final SystemState copy(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, boolean z2, Map<String, String> map, Set<HostedTracerLibraryInfo> set) {
        return new SystemState(str, j, str2, str3, str4, str5, str6, str7, str8, str9, z, str10, z2, map, set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemState)) {
            return false;
        }
        SystemState systemState = (SystemState) obj;
        return epx.f(this.versionName, systemState.versionName) && this.versionCode == systemState.versionCode && epx.f(this.packageName, systemState.packageName) && epx.f(this.environment, systemState.environment) && epx.f(this.buildUuid, systemState.buildUuid) && epx.f(this.sessionUuid, systemState.sessionUuid) && epx.f(this.device, systemState.device) && epx.f(this.deviceId, systemState.deviceId) && epx.f(this.vendor, systemState.vendor) && epx.f(this.osVersion, systemState.osVersion) && this.isInBackground == systemState.isInBackground && epx.f(this.connection, systemState.connection) && this.isRooted == systemState.isRooted && epx.f(this.properties, systemState.properties) && epx.f(this.hostedLibrariesInfo, systemState.hostedLibrariesInfo);
    }

    public final String getBuildUuid() {
        return this.buildUuid;
    }

    public final String getConnection() {
        return this.connection;
    }

    public final String getDevice() {
        return this.device;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final Set<HostedTracerLibraryInfo> getHostedLibrariesInfo() {
        return this.hostedLibrariesInfo;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getProcessName$tracer_commons_release() {
        return this.properties.get(PROPERTY_KEY_PROCESS_NAME);
    }

    public final Map<String, String> getProperties() {
        return this.properties;
    }

    public final boolean getSampled() {
        return epx.f(this.properties.get(PROPERTY_KEY_SAMPLED), "true");
    }

    public final String getSessionUuid() {
        return this.sessionUuid;
    }

    public final String getUserId() {
        return this.properties.get("userId");
    }

    public final String getVendor() {
        return this.vendor;
    }

    public final long getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a = urd0.a(bh10.a(this.versionName.hashCode() * 31, 31, this.versionCode), 31, this.packageName);
        String str = this.environment;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.buildUuid;
        int a2 = urd0.a(urd0.a(urd0.a(urd0.a(urd0.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.sessionUuid), 31, this.device), 31, this.deviceId), 31, this.vendor), 31, this.osVersion);
        boolean z = this.isInBackground;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (a2 + i) * 31;
        String str3 = this.connection;
        int hashCode2 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z2 = this.isRooted;
        return this.hostedLibrariesInfo.hashCode() + v11.a((hashCode2 + (z2 ? 1 : z2 ? 1 : 0)) * 31, 31, this.properties);
    }

    public final boolean isInBackground() {
        return this.isInBackground;
    }

    public final boolean isRooted() {
        return this.isRooted;
    }

    public final void setHostedLibrariesInfo(Set<HostedTracerLibraryInfo> set) {
        this.hostedLibrariesInfo = set;
    }

    public final void setProperties(Map<String, String> map) {
        this.properties = map;
    }

    public String toString() {
        String str = this.versionName;
        long j = this.versionCode;
        String str2 = this.packageName;
        String str3 = this.environment;
        String str4 = this.buildUuid;
        String str5 = this.sessionUuid;
        String str6 = this.device;
        String str7 = this.deviceId;
        String str8 = this.vendor;
        String str9 = this.osVersion;
        boolean z = this.isInBackground;
        String str10 = this.connection;
        boolean z2 = this.isRooted;
        Map<String, String> map = this.properties;
        Set<HostedTracerLibraryInfo> set = this.hostedLibrariesInfo;
        StringBuilder d = rqi.d(j, "SystemState(versionName=", str, ", versionCode=");
        n6j.b(d, ", packageName=", str2, ", environment=", str3);
        n6j.b(d, ", buildUuid=", str4, ", sessionUuid=", str5);
        n6j.b(d, ", device=", str6, ", deviceId=", str7);
        n6j.b(d, ", vendor=", str8, ", osVersion=", str9);
        d.append(", isInBackground=");
        d.append(z);
        d.append(", connection=");
        d.append(str10);
        d.append(", isRooted=");
        d.append(z2);
        d.append(", properties=");
        d.append(map);
        d.append(", hostedLibrariesInfo=");
        d.append(set);
        d.append(")");
        return d.toString();
    }

    public final SystemState withCurrentDate() {
        return withDate(new Date());
    }

    public final SystemState withDate(long j) {
        return withDate(new Date(j));
    }

    public final SystemState withDate(Date date) {
        return copy$default(this, null, 0L, null, null, null, null, null, null, null, null, false, null, false, pn00.o(this.properties, new Pair("date", DateTimeUtils.formatISO8601(date))), null, 24575, null);
    }
}
