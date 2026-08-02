package com.yandex.passport.common.analytics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.yandex.passport.common.permission.Permission;
import defpackage.ny61;
import defpackage.qke;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes8.dex */
public final class f {
    public static final long e = com.yandex.passport.common.time.a.c(0, 5, 0, 11);
    public static final /* synthetic */ int f = 0;
    public final Context a;
    public final d b;
    public final String c;
    public final String d;

    public f(Context context, d dVar, String str, String str2) {
        this.a = context;
        this.b = dVar;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(f fVar, String str, String str2, ContinuationImpl continuationImpl) {
        AnalyticsHelper$buildWebAmParams$1 analyticsHelper$buildWebAmParams$1;
        int i;
        a aVar;
        if (continuationImpl instanceof AnalyticsHelper$buildWebAmParams$1) {
            analyticsHelper$buildWebAmParams$1 = (AnalyticsHelper$buildWebAmParams$1) continuationImpl;
            int i2 = analyticsHelper$buildWebAmParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                analyticsHelper$buildWebAmParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = analyticsHelper$buildWebAmParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = analyticsHelper$buildWebAmParams$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a b = fVar.b(str, str2);
                    analyticsHelper$buildWebAmParams$1.L$0 = b;
                    analyticsHelper$buildWebAmParams$1.label = 1;
                    obj = fVar.b.a(e, analyticsHelper$buildWebAmParams$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = (a) analyticsHelper$buildWebAmParams$1.L$0;
                    kotlin.b.b(obj);
                }
                Pair pair = new Pair(CommonUrlParts.APP_ID, aVar.a());
                Pair pair2 = new Pair("app_platform", ConstantDeviceInfo.APP_PLATFORM);
                a.c();
                Pair pair3 = new Pair("manufacturer", Build.MANUFACTURER);
                a.d();
                Pair pair4 = new Pair("model", Build.MODEL);
                Pair pair5 = new Pair("am_version_name", "7.55.1(755015154)");
                Pair pair6 = new Pair(CommonUrlParts.APP_VERSION, aVar.b());
                String str3 = ((b) obj).a;
                return Collections.unmodifiableMap(kotlin.collections.b.i(pair, pair2, pair3, pair4, pair5, pair6, new Pair(MetaDataField.DEVICE_ID_FIELD, str3 != null ? str3 : null)));
            }
        }
        analyticsHelper$buildWebAmParams$1 = new AnalyticsHelper$buildWebAmParams$1(fVar, continuationImpl);
        Object obj2 = analyticsHelper$buildWebAmParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = analyticsHelper$buildWebAmParams$1.label;
        if (i != 0) {
        }
        Pair pair7 = new Pair(CommonUrlParts.APP_ID, aVar.a());
        Pair pair22 = new Pair("app_platform", ConstantDeviceInfo.APP_PLATFORM);
        a.c();
        Pair pair32 = new Pair("manufacturer", Build.MANUFACTURER);
        a.d();
        Pair pair42 = new Pair("model", Build.MODEL);
        Pair pair52 = new Pair("am_version_name", "7.55.1(755015154)");
        Pair pair62 = new Pair(CommonUrlParts.APP_VERSION, aVar.b());
        String str32 = ((b) obj2).a;
        return Collections.unmodifiableMap(kotlin.collections.b.i(pair7, pair22, pair32, pair42, pair52, pair62, new Pair(MetaDataField.DEVICE_ID_FIELD, str32 != null ? str32 : null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object e(f fVar, ContinuationImpl continuationImpl) {
        AnalyticsHelper$getDeviceId$1 analyticsHelper$getDeviceId$1;
        int i;
        if (continuationImpl instanceof AnalyticsHelper$getDeviceId$1) {
            analyticsHelper$getDeviceId$1 = (AnalyticsHelper$getDeviceId$1) continuationImpl;
            int i2 = analyticsHelper$getDeviceId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                analyticsHelper$getDeviceId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = analyticsHelper$getDeviceId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = analyticsHelper$getDeviceId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    analyticsHelper$getDeviceId$1.label = 1;
                    obj = fVar.b.a(e, analyticsHelper$getDeviceId$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((b) obj).a;
            }
        }
        analyticsHelper$getDeviceId$1 = new AnalyticsHelper$getDeviceId$1(fVar, continuationImpl);
        Object obj2 = analyticsHelper$getDeviceId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = analyticsHelper$getDeviceId$1.label;
        if (i != 0) {
        }
        return ((b) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object f(f fVar, ContinuationImpl continuationImpl) {
        AnalyticsHelper$getUuid$1 analyticsHelper$getUuid$1;
        int i;
        if (continuationImpl instanceof AnalyticsHelper$getUuid$1) {
            analyticsHelper$getUuid$1 = (AnalyticsHelper$getUuid$1) continuationImpl;
            int i2 = analyticsHelper$getUuid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                analyticsHelper$getUuid$1.label = i2 - Integer.MIN_VALUE;
                Object obj = analyticsHelper$getUuid$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = analyticsHelper$getUuid$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    analyticsHelper$getUuid$1.label = 1;
                    obj = fVar.b.a(e, analyticsHelper$getUuid$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((b) obj).b;
            }
        }
        analyticsHelper$getUuid$1 = new AnalyticsHelper$getUuid$1(fVar, continuationImpl);
        Object obj2 = analyticsHelper$getUuid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = analyticsHelper$getUuid$1.label;
        if (i != 0) {
        }
        return ((b) obj2).b;
    }

    public final a b(String str, String str2) {
        Context context = this.a;
        String language = context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        com.yandex.passport.common.permission.b bVar = com.yandex.passport.common.permission.c.b;
        Permission permission = Permission.READ_PHONE_STATE;
        bVar.getClass();
        int h = qke.h(context, permission.getPermissionString());
        String str3 = null;
        String e2 = com.yandex.passport.common.util.a.e(h == 0 ? com.yandex.passport.common.util.a.e(((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName()) : null);
        String e3 = com.yandex.passport.common.util.a.e(this.c);
        String e4 = com.yandex.passport.common.util.a.e(str);
        if (e4 == null) {
            e4 = context.getPackageName();
        }
        String e5 = com.yandex.passport.common.util.a.e(str2);
        if (e5 == null) {
            try {
                str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            e5 = com.yandex.passport.common.util.a.e(str3);
        }
        return new a(language, e2, e3, e4, e5, com.yandex.passport.common.util.a.e(this.d));
    }

    public final Map c(String str, String str2) {
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            Looper.getMainLooper();
            Looper.myLooper();
        }
        Object i = com.yandex.passport.common.util.a.i(new AnalyticsHelper$getAnalyticalDataForStatbox$1(this, str, str2, null));
        Map f2 = kotlin.collections.b.f();
        if (i instanceof Result.Failure) {
            i = f2;
        }
        return (Map) i;
    }

    public final String d() {
        return this.b.b().a;
    }
}
