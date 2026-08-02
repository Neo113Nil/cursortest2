package ru.rustore.sdk.pushclient.k;

import com.vk.push.common.clientid.ClientId;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.push.core.data.source.DeviceInfoDataSource;
import com.vk.push.core.feature.FeatureManager;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import xsna.b6l;
import xsna.gzs;
import xsna.jn4;
import xsna.msy;
import xsna.pn00;
import xsna.spj;
import xsna.wkz;

/* loaded from: classes9.dex */
public final class c {
    public final jn4 a;
    public final DeviceInfoDataSource b;
    public final DeviceIdRepository c;
    public final FeatureManager d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new a());

    public static final class a extends Lambda implements gzs<String> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final String invoke() {
            return c.this.b.getCountryId();
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.data.repository.BaseClientAnalyticsRepository", f = "BaseClientAnalyticsRepository.kt", l = {33, 44}, m = "getBaseParams")
    public final class b extends ContinuationImpl {
        public c a;
        public ClientId b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public /* synthetic */ Object l;
        public int n;

        public b(spj<? super b> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.l = obj;
            this.n |= Integer.MIN_VALUE;
            return c.this.a(this);
        }
    }

    public c(jn4 jn4Var, wkz wkzVar, DeviceInfoDataSource deviceInfoDataSource, DeviceIdRepository deviceIdRepository, FeatureManager featureManager) {
        this.a = jn4Var;
        this.b = deviceInfoDataSource;
        this.c = deviceIdRepository;
        this.d = featureManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(spj spjVar) {
        b bVar;
        CoroutineSingletons coroutineSingletons;
        int i;
        c cVar;
        ClientId clientId;
        String deviceManufacturer;
        String deviceModel;
        String oSVersion;
        String timeZone;
        String defaultLocale;
        Object deviceId;
        String str;
        String str2;
        String str3;
        c cVar2;
        String str4;
        if (spjVar instanceof b) {
            bVar = (b) spjVar;
            int i2 = bVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.n = i2 - Integer.MIN_VALUE;
                Object obj = bVar.l;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.n;
                if (i != 0) {
                    kotlin.a.a(obj);
                    bVar.a = this;
                    bVar.n = 1;
                    if (coroutineSingletons != null) {
                        obj = null;
                        cVar = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = bVar.k;
                    str4 = bVar.j;
                    str2 = bVar.i;
                    str3 = bVar.h;
                    defaultLocale = bVar.g;
                    timeZone = bVar.f;
                    oSVersion = bVar.e;
                    deviceModel = bVar.d;
                    deviceManufacturer = bVar.c;
                    clientId = bVar.b;
                    cVar2 = bVar.a;
                    kotlin.a.a(obj);
                    LinkedHashMap m = pn00.m(new Pair("sdk_version", str2), new Pair("sdk_name", str4), new Pair("sdk_type", str), new Pair("os_version", oSVersion), new Pair(AnalyticsBaseParamsConstantsKt.OS_LANG, defaultLocale), new Pair(AnalyticsBaseParamsConstantsKt.TIMEZONE, timeZone), new Pair("manufacturer", deviceManufacturer), new Pair(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, deviceModel), new Pair(AnalyticsBaseParamsConstantsKt.COUNTRY_ID, (String) cVar2.e.getValue()), new Pair(AnalyticsBaseParamsConstantsKt.REGION_ID, str3), new Pair("device_id", (String) obj), new Pair(AnalyticsBaseParamsConstantsKt.SEGMENTS, cVar2.d.getSegments()));
                    if (clientId != null) {
                        m.put(clientId.getClientIdType().name().toLowerCase(Locale.ROOT), clientId.getClientIdValue());
                    }
                    return m;
                }
                cVar = bVar.a;
                kotlin.a.a(obj);
                clientId = (ClientId) obj;
                DeviceInfoDataSource deviceInfoDataSource = cVar.b;
                jn4 jn4Var = cVar.a;
                deviceManufacturer = deviceInfoDataSource.getDeviceManufacturer();
                deviceModel = deviceInfoDataSource.getDeviceModel();
                oSVersion = deviceInfoDataSource.getOSVersion();
                timeZone = deviceInfoDataSource.getTimeZone();
                defaultLocale = deviceInfoDataSource.getDefaultLocale();
                String regionId = deviceInfoDataSource.getRegionId();
                String str5 = (String) jn4Var.b;
                DeviceIdRepository deviceIdRepository = cVar.c;
                bVar.a = cVar;
                bVar.b = clientId;
                bVar.c = deviceManufacturer;
                bVar.d = deviceModel;
                bVar.e = oSVersion;
                bVar.f = timeZone;
                bVar.g = defaultLocale;
                bVar.h = regionId;
                bVar.i = "7.4.0-rc01";
                bVar.j = "ru.rustore.sdk:pushclient";
                bVar.k = str5;
                bVar.n = 2;
                deviceId = deviceIdRepository.getDeviceId(bVar);
                if (deviceId != coroutineSingletons) {
                    str = str5;
                    str2 = "7.4.0-rc01";
                    str3 = regionId;
                    obj = deviceId;
                    cVar2 = cVar;
                    str4 = "ru.rustore.sdk:pushclient";
                    LinkedHashMap m2 = pn00.m(new Pair("sdk_version", str2), new Pair("sdk_name", str4), new Pair("sdk_type", str), new Pair("os_version", oSVersion), new Pair(AnalyticsBaseParamsConstantsKt.OS_LANG, defaultLocale), new Pair(AnalyticsBaseParamsConstantsKt.TIMEZONE, timeZone), new Pair("manufacturer", deviceManufacturer), new Pair(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, deviceModel), new Pair(AnalyticsBaseParamsConstantsKt.COUNTRY_ID, (String) cVar2.e.getValue()), new Pair(AnalyticsBaseParamsConstantsKt.REGION_ID, str3), new Pair("device_id", (String) obj), new Pair(AnalyticsBaseParamsConstantsKt.SEGMENTS, cVar2.d.getSegments()));
                    if (clientId != null) {
                    }
                    return m2;
                }
                return coroutineSingletons;
            }
        }
        bVar = new b(spjVar);
        Object obj2 = bVar.l;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.n;
        if (i != 0) {
        }
        clientId = (ClientId) obj2;
        DeviceInfoDataSource deviceInfoDataSource2 = cVar.b;
        jn4 jn4Var2 = cVar.a;
        deviceManufacturer = deviceInfoDataSource2.getDeviceManufacturer();
        deviceModel = deviceInfoDataSource2.getDeviceModel();
        oSVersion = deviceInfoDataSource2.getOSVersion();
        timeZone = deviceInfoDataSource2.getTimeZone();
        defaultLocale = deviceInfoDataSource2.getDefaultLocale();
        String regionId2 = deviceInfoDataSource2.getRegionId();
        String str52 = (String) jn4Var2.b;
        DeviceIdRepository deviceIdRepository2 = cVar.c;
        bVar.a = cVar;
        bVar.b = clientId;
        bVar.c = deviceManufacturer;
        bVar.d = deviceModel;
        bVar.e = oSVersion;
        bVar.f = timeZone;
        bVar.g = defaultLocale;
        bVar.h = regionId2;
        bVar.i = "7.4.0-rc01";
        bVar.j = "ru.rustore.sdk:pushclient";
        bVar.k = str52;
        bVar.n = 2;
        deviceId = deviceIdRepository2.getDeviceId(bVar);
        if (deviceId != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
