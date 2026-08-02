package xsna;

import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.push.core.data.source.DeviceInfoDataSource;
import com.vk.push.core.feature.FeatureManager;
import java.io.Serializable;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Lambda;

/* compiled from: BaseAuthHostAnalyticsRepository.kt */
/* loaded from: classes5.dex */
public final class b66 {
    public final DeviceInfoDataSource a;
    public final DeviceIdRepository b;
    public final FeatureManager c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new a());

    /* compiled from: BaseAuthHostAnalyticsRepository.kt */
    public static final class a extends Lambda implements gzs<String> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final String invoke() {
            return b66.this.a.getCountryId();
        }
    }

    public b66(ad0 ad0Var, DeviceInfoDataSource deviceInfoDataSource, DeviceIdRepository deviceIdRepository, FeatureManager featureManager) {
        this.a = deviceInfoDataSource;
        this.b = deviceIdRepository;
        this.c = featureManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(spj spjVar) {
        c66 c66Var;
        int i;
        String deviceManufacturer;
        String deviceModel;
        String oSVersion;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        b66 b66Var;
        if (spjVar instanceof c66) {
            c66Var = (c66) spjVar;
            int i2 = c66Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c66Var.label = i2 - Integer.MIN_VALUE;
                Object obj = c66Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c66Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    DeviceInfoDataSource deviceInfoDataSource = this.a;
                    deviceManufacturer = deviceInfoDataSource.getDeviceManufacturer();
                    deviceModel = deviceInfoDataSource.getDeviceModel();
                    oSVersion = deviceInfoDataSource.getOSVersion();
                    String timeZone = deviceInfoDataSource.getTimeZone();
                    String defaultLocale = deviceInfoDataSource.getDefaultLocale();
                    String regionId = deviceInfoDataSource.getRegionId();
                    c66Var.L$0 = this;
                    str = "7.4.0-rc01";
                    c66Var.L$1 = "7.4.0-rc01";
                    c66Var.L$2 = "ru.rustore.sdk:vkpns-auth-provider-sdk";
                    c66Var.L$3 = deviceManufacturer;
                    c66Var.L$4 = deviceModel;
                    c66Var.L$5 = oSVersion;
                    c66Var.L$6 = timeZone;
                    c66Var.L$7 = defaultLocale;
                    c66Var.L$8 = regionId;
                    c66Var.label = 1;
                    Object deviceId = this.b.getDeviceId(c66Var);
                    if (deviceId == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = regionId;
                    obj = deviceId;
                    str3 = timeZone;
                    str4 = defaultLocale;
                    str5 = "ru.rustore.sdk:vkpns-auth-provider-sdk";
                    b66Var = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) c66Var.L$8;
                    str4 = (String) c66Var.L$7;
                    str3 = (String) c66Var.L$6;
                    oSVersion = (String) c66Var.L$5;
                    deviceModel = (String) c66Var.L$4;
                    deviceManufacturer = (String) c66Var.L$3;
                    str5 = (String) c66Var.L$2;
                    str = (String) c66Var.L$1;
                    b66Var = (b66) c66Var.L$0;
                    kotlin.a.a(obj);
                }
                return (Serializable) pn00.k(new Pair("sdk_version", str), new Pair("sdk_name", str5), new Pair("os_version", oSVersion), new Pair(AnalyticsBaseParamsConstantsKt.OS_LANG, str4), new Pair(AnalyticsBaseParamsConstantsKt.TIMEZONE, str3), new Pair("manufacturer", deviceManufacturer), new Pair(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, deviceModel), new Pair(AnalyticsBaseParamsConstantsKt.COUNTRY_ID, (String) b66Var.d.getValue()), new Pair(AnalyticsBaseParamsConstantsKt.REGION_ID, str2), new Pair("device_id", (String) obj), new Pair(AnalyticsBaseParamsConstantsKt.SEGMENTS, b66Var.c.getSegments()));
            }
        }
        c66Var = new c66(this, spjVar);
        Object obj2 = c66Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c66Var.label;
        if (i != 0) {
        }
        return (Serializable) pn00.k(new Pair("sdk_version", str), new Pair("sdk_name", str5), new Pair("os_version", oSVersion), new Pair(AnalyticsBaseParamsConstantsKt.OS_LANG, str4), new Pair(AnalyticsBaseParamsConstantsKt.TIMEZONE, str3), new Pair("manufacturer", deviceManufacturer), new Pair(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, deviceModel), new Pair(AnalyticsBaseParamsConstantsKt.COUNTRY_ID, (String) b66Var.d.getValue()), new Pair(AnalyticsBaseParamsConstantsKt.REGION_ID, str2), new Pair("device_id", (String) obj2), new Pair(AnalyticsBaseParamsConstantsKt.SEGMENTS, b66Var.c.getSegments()));
    }
}
