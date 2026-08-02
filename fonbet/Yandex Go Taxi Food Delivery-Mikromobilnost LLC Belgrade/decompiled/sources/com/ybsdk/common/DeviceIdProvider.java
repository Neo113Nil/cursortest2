package com.ybsdk.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechReadDeviceIdStashResultResult;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechUpdateDeviceIdResultResult;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.bvf0;
import defpackage.fcy0;
import defpackage.g050;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.jl40;
import defpackage.lb7;
import defpackage.ny61;
import defpackage.ppp0;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.taj;
import defpackage.unr0;
import defpackage.wlp;
import defpackage.x4c;
import defpackage.yvf0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/ybsdk/common/DeviceIdProvider;", "", "taj", "DeviceIdAmModel", "lb7", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DeviceIdProvider {
    public static final Regex k = new Regex("^[0-9a-zA-Z]{32}$");
    public final Context a;
    public final sls b;
    public final ppp0 c;
    public final com.ybsdk.rconfig.b d;
    public final yvf0 e;
    public final Moshi f;
    public final AppAnalyticsReporter g;
    public final lb7 h;
    public final kotlinx.coroutines.sync.a i = gtq0.a();
    public final AtomicReference j = new AtomicReference(new taj(null, null, null));

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/common/DeviceIdProvider$DeviceIdAmModel;", "", "deviceId", "", "app", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "getApp", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class DeviceIdAmModel {
        private final String app;
        private final String deviceId;

        public DeviceIdAmModel(@Json(name = "device_id") String str, @Json(name = "app") String str2) {
            this.deviceId = str;
            this.app = str2;
        }

        public static /* synthetic */ DeviceIdAmModel copy$default(DeviceIdAmModel deviceIdAmModel, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deviceIdAmModel.deviceId;
            }
            if ((i & 2) != 0) {
                str2 = deviceIdAmModel.app;
            }
            return deviceIdAmModel.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getApp() {
            return this.app;
        }

        public final DeviceIdAmModel copy(@Json(name = "device_id") String deviceId, @Json(name = "app") String app) {
            return new DeviceIdAmModel(deviceId, app);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceIdAmModel)) {
                return false;
            }
            DeviceIdAmModel deviceIdAmModel = (DeviceIdAmModel) other;
            return jl40.l(this.deviceId, deviceIdAmModel.deviceId) && jl40.l(this.app, deviceIdAmModel.app);
        }

        public final String getApp() {
            return this.app;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public int hashCode() {
            return this.app.hashCode() + (this.deviceId.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("DeviceIdAmModel(deviceId=", this.deviceId, ", app=", this.app, Extension.C_BRAKE);
        }
    }

    public DeviceIdProvider(Context context, sls slsVar, ppp0 ppp0Var, com.ybsdk.rconfig.b bVar, yvf0 yvf0Var, Moshi moshi, SharedPreferences sharedPreferences, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = context;
        this.b = slsVar;
        this.c = ppp0Var;
        this.d = bVar;
        this.e = yvf0Var;
        this.f = moshi;
        this.g = appAnalyticsReporter;
        this.h = new lb7(29, sharedPreferences, appAnalyticsReporter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0054, code lost:
    
        if (r13 == r2) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(DeviceIdProvider deviceIdProvider, long j, ContinuationImpl continuationImpl) {
        DeviceIdProvider$readStashedDeviceId$1 deviceIdProvider$readStashedDeviceId$1;
        int i;
        Object e;
        Throwable a;
        String str;
        Object failure;
        fcy0 fcy0Var = deviceIdProvider.g.m0;
        if (continuationImpl instanceof DeviceIdProvider$readStashedDeviceId$1) {
            deviceIdProvider$readStashedDeviceId$1 = (DeviceIdProvider$readStashedDeviceId$1) continuationImpl;
            int i2 = deviceIdProvider$readStashedDeviceId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deviceIdProvider$readStashedDeviceId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deviceIdProvider$readStashedDeviceId$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deviceIdProvider$readStashedDeviceId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ppp0 ppp0Var = deviceIdProvider.c;
                    deviceIdProvider$readStashedDeviceId$1.J$0 = j;
                    deviceIdProvider$readStashedDeviceId$1.label = 1;
                    e = ((com.ybsdk.feature.passport.impl.a) ppp0Var).e(j, deviceIdProvider$readStashedDeviceId$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str2 = (String) deviceIdProvider$readStashedDeviceId$1.L$0;
                        kotlin.b.b(obj);
                        return str2;
                    }
                    j = deviceIdProvider$readStashedDeviceId$1.J$0;
                    kotlin.b.b(obj);
                    e = ((Result) obj).getValue();
                }
                a = Result.a(e);
                if (a != null) {
                    x4c.g("Reading stashed device id failed", a, "read", null, 8);
                    fcy0Var.g(null, null, TechEvents$TechReadDeviceIdStashResultResult.READ_ERROR);
                }
                if (e instanceof Result.Failure) {
                    e = null;
                }
                str = (String) e;
                if (str != null) {
                    if (((CommonFeatureFlag) deviceIdProvider.d.d(wlp.y).getData()).isEnabled()) {
                        lb7 lb7Var = deviceIdProvider.h;
                        String string = ((SharedPreferences) lb7Var.b).getString(String.format("device_id_backup_v1:%s", Arrays.copyOf(new Object[]{String.valueOf(j)}, 1)), null);
                        ((AppAnalyticsReporter) lb7Var.c).m0.a.a("tech.device_id_read_backup", g8e.w(1, Constants.KEY_DATA, string == null ? "null" : string));
                        if (string != null) {
                            fcy0Var.a.a("tech.device_id_recover_from_backup", g8e.w(1, Constants.KEY_DATA, string));
                            deviceIdProvider$readStashedDeviceId$1.L$0 = string;
                            deviceIdProvider$readStashedDeviceId$1.label = 2;
                            return deviceIdProvider.f(j, string, deviceIdProvider$readStashedDeviceId$1) == obj2 ? obj2 : string;
                        }
                    }
                    return null;
                }
                try {
                    failure = (DeviceIdAmModel) _MoshiKotlinExtensionsKt.adapter(deviceIdProvider.f, qoi0.e(DeviceIdAmModel.class)).fromJson(str);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a2 = Result.a(failure);
                if (a2 != null) {
                    x4c.g("Reading stashed device id failed", a2, "deserialize", null, 8);
                    fcy0Var.g(str, null, TechEvents$TechReadDeviceIdStashResultResult.DESERIALIZATION_ERROR);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                DeviceIdAmModel deviceIdAmModel = (DeviceIdAmModel) failure;
                if (deviceIdAmModel != null) {
                    String deviceId = deviceIdAmModel.getDeviceId();
                    r6 = k.h(deviceId) ? deviceId : null;
                    fcy0Var.g(r6, deviceIdAmModel.getApp(), r6 == null ? TechEvents$TechReadDeviceIdStashResultResult.NOT_MATCHES : TechEvents$TechReadDeviceIdStashResultResult.OK);
                }
                return r6;
            }
        }
        deviceIdProvider$readStashedDeviceId$1 = new DeviceIdProvider$readStashedDeviceId$1(deviceIdProvider, continuationImpl);
        Object obj3 = deviceIdProvider$readStashedDeviceId$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deviceIdProvider$readStashedDeviceId$1.label;
        if (i != 0) {
        }
        a = Result.a(e);
        if (a != null) {
        }
        if (e instanceof Result.Failure) {
        }
        str = (String) e;
        if (str != null) {
        }
    }

    public static final void b(DeviceIdProvider deviceIdProvider, taj tajVar, TechEvents$TechUpdateDeviceIdResultResult techEvents$TechUpdateDeviceIdResultResult) {
        fcy0 fcy0Var = deviceIdProvider.g.m0;
        String str = tajVar.b;
        String str2 = tajVar.c;
        String valueOf = String.valueOf(tajVar.a);
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, techEvents$TechUpdateDeviceIdResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("metrica_device_id", str);
        }
        if (str2 != null) {
            linkedHashMap.put("own_device_id", str2);
        }
        linkedHashMap.put("uid", valueOf);
        fcy0Var.a.a("tech.update_device_id.result", linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(DeviceIdProvider deviceIdProvider, ContinuationImpl continuationImpl) {
        DeviceIdProvider$tryReadOtherAppsDeviceId$1 deviceIdProvider$tryReadOtherAppsDeviceId$1;
        int i;
        List list;
        deviceIdProvider.getClass();
        if (continuationImpl instanceof DeviceIdProvider$tryReadOtherAppsDeviceId$1) {
            deviceIdProvider$tryReadOtherAppsDeviceId$1 = (DeviceIdProvider$tryReadOtherAppsDeviceId$1) continuationImpl;
            int i2 = deviceIdProvider$tryReadOtherAppsDeviceId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deviceIdProvider$tryReadOtherAppsDeviceId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deviceIdProvider$tryReadOtherAppsDeviceId$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deviceIdProvider$tryReadOtherAppsDeviceId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.feature.pinstorage.internal.data.c cVar = (com.ybsdk.feature.pinstorage.internal.data.c) deviceIdProvider.e.get();
                    deviceIdProvider$tryReadOtherAppsDeviceId$1.label = 1;
                    obj = cVar.i(deviceIdProvider$tryReadOtherAppsDeviceId$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                list = (List) obj;
                deviceIdProvider.g.m0.a.a("tech.update_device_id.pin_device_ids_read", g8e.w(1, "device_ids", list == null ? kotlin.collections.a.X(list, null, "[", "]", null, 57) : "null"));
                if (list == null) {
                    return (String) kotlin.collections.a.h0(list);
                }
                return null;
            }
        }
        deviceIdProvider$tryReadOtherAppsDeviceId$1 = new DeviceIdProvider$tryReadOtherAppsDeviceId$1(deviceIdProvider, continuationImpl);
        Object obj3 = deviceIdProvider$tryReadOtherAppsDeviceId$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deviceIdProvider$tryReadOtherAppsDeviceId$1.label;
        if (i != 0) {
        }
        list = (List) obj3;
        deviceIdProvider.g.m0.a.a("tech.update_device_id.pin_device_ids_read", g8e.w(1, "device_ids", list == null ? kotlin.collections.a.X(list, null, "[", "]", null, 57) : "null"));
        if (list == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        DeviceIdProvider$getDeviceId$1 deviceIdProvider$getDeviceId$1;
        int i;
        if (continuationImpl instanceof DeviceIdProvider$getDeviceId$1) {
            deviceIdProvider$getDeviceId$1 = (DeviceIdProvider$getDeviceId$1) continuationImpl;
            int i2 = deviceIdProvider$getDeviceId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deviceIdProvider$getDeviceId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deviceIdProvider$getDeviceId$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deviceIdProvider$getDeviceId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    deviceIdProvider$getDeviceId$1.label = 1;
                    obj = e(deviceIdProvider$getDeviceId$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((taj) obj).c;
            }
        }
        deviceIdProvider$getDeviceId$1 = new DeviceIdProvider$getDeviceId$1(this, continuationImpl);
        Object obj3 = deviceIdProvider$getDeviceId$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deviceIdProvider$getDeviceId$1.label;
        if (i != 0) {
        }
        return ((taj) obj3).c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0068, code lost:
    
        if (r9.a(r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #1 {all -> 0x009a, blocks: (B:26:0x006b, B:29:0x0076), top: B:25:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v9, types: [g050] */
    /* JADX WARN: Type inference failed for: r8v11, types: [g050] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [g050] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        DeviceIdProvider$getDeviceIdData$1 deviceIdProvider$getDeviceIdData$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Throwable th;
        ?? r8;
        taj tajVar;
        try {
            if (continuationImpl instanceof DeviceIdProvider$getDeviceIdData$1) {
                deviceIdProvider$getDeviceIdData$1 = (DeviceIdProvider$getDeviceIdData$1) continuationImpl;
                int i2 = deviceIdProvider$getDeviceIdData$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    deviceIdProvider$getDeviceIdData$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = deviceIdProvider$getDeviceIdData$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = deviceIdProvider$getDeviceIdData$1.label;
                    AtomicReference atomicReference = this.j;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        String str = (String) this.b.invoke();
                        if (str != null) {
                            return new taj(str, str, ((taj) atomicReference.get()).a);
                        }
                        aVar = this.i;
                        deviceIdProvider$getDeviceIdData$1.L$0 = aVar;
                        deviceIdProvider$getDeviceIdData$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r8 = (g050) deviceIdProvider$getDeviceIdData$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                r8 = r8;
                                tajVar = (taj) obj;
                                atomicReference.set(tajVar);
                                aVar = r8;
                                aVar.d(null);
                                return tajVar;
                            } catch (Throwable th2) {
                                th = th2;
                                r8.d(null);
                                throw th;
                            }
                        }
                        ?? r2 = (g050) deviceIdProvider$getDeviceIdData$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r2;
                    }
                    tajVar = (taj) atomicReference.get();
                    if (tajVar.c == null) {
                        aVar.d(null);
                        return tajVar;
                    }
                    Long l = tajVar.a;
                    deviceIdProvider$getDeviceIdData$1.L$0 = aVar;
                    deviceIdProvider$getDeviceIdData$1.label = 2;
                    Object n = bvf0.n(new DeviceIdProvider$updateDeviceIdData$2(l, this, null), deviceIdProvider$getDeviceIdData$1);
                    if (n != coroutineSingletons) {
                        kotlinx.coroutines.sync.a aVar2 = aVar;
                        obj = n;
                        r8 = aVar2;
                        tajVar = (taj) obj;
                        atomicReference.set(tajVar);
                        aVar = r8;
                        aVar.d(null);
                        return tajVar;
                    }
                    return coroutineSingletons;
                }
            }
            tajVar = (taj) atomicReference.get();
            if (tajVar.c == null) {
            }
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar3 = aVar;
            th = th3;
            r8 = aVar3;
            r8.d(null);
            throw th;
        }
        deviceIdProvider$getDeviceIdData$1 = new DeviceIdProvider$getDeviceIdData$1(this, continuationImpl);
        Object obj2 = deviceIdProvider$getDeviceIdData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deviceIdProvider$getDeviceIdData$1.label;
        AtomicReference atomicReference2 = this.j;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(long j, String str, ContinuationImpl continuationImpl) {
        DeviceIdProvider$saveStashedDeviceId$1 deviceIdProvider$saveStashedDeviceId$1;
        int i;
        Object failure;
        Object j2;
        Throwable a;
        if (continuationImpl instanceof DeviceIdProvider$saveStashedDeviceId$1) {
            deviceIdProvider$saveStashedDeviceId$1 = (DeviceIdProvider$saveStashedDeviceId$1) continuationImpl;
            int i2 = deviceIdProvider$saveStashedDeviceId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deviceIdProvider$saveStashedDeviceId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deviceIdProvider$saveStashedDeviceId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deviceIdProvider$saveStashedDeviceId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DeviceIdAmModel deviceIdAmModel = new DeviceIdAmModel(str, this.a.getPackageName());
                    try {
                        failure = _MoshiKotlinExtensionsKt.adapter(this.f, qoi0.e(DeviceIdAmModel.class)).toJson(deviceIdAmModel);
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    Throwable a2 = Result.a(failure);
                    if (a2 != null) {
                        x4c.g("Serializing stashed device id failed", a2, String.valueOf(deviceIdAmModel), null, 8);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    String str2 = (String) failure;
                    if (str2 != null) {
                        deviceIdProvider$saveStashedDeviceId$1.label = 1;
                        j2 = ((com.ybsdk.feature.passport.impl.a) this.c).j(j, str2, deviceIdProvider$saveStashedDeviceId$1);
                        if (j2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                j2 = ((Result) obj).getValue();
                a = Result.a(j2);
                if (a != null) {
                    x4c.g("Saving stashed device id failed", a, null, null, 12);
                }
                return zy11.a;
            }
        }
        deviceIdProvider$saveStashedDeviceId$1 = new DeviceIdProvider$saveStashedDeviceId$1(this, continuationImpl);
        Object obj2 = deviceIdProvider$saveStashedDeviceId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deviceIdProvider$saveStashedDeviceId$1.label;
        if (i != 0) {
        }
        a = Result.a(j2);
        if (a != null) {
        }
        return zy11.a;
    }
}
