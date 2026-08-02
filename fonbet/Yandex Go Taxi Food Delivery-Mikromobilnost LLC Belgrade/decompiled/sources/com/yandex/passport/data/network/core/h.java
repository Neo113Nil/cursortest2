package com.yandex.passport.data.network.core;

import android.os.Build;
import defpackage.b64;
import defpackage.evu0;
import defpackage.j73;
import defpackage.jwu;
import defpackage.ny61;
import defpackage.zy11;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes8.dex */
public final class h {
    public final com.yandex.passport.common.analytics.d a;
    public final com.yandex.passport.common.a b;
    public final com.yandex.passport.internal.report.g c;
    public final String d = Build.MANUFACTURER;
    public final String e = Build.MODEL;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public h(com.yandex.passport.common.analytics.d dVar, com.yandex.passport.common.common.a aVar, com.yandex.passport.common.a aVar2, com.yandex.passport.internal.report.g gVar) {
        this.a = dVar;
        this.b = aVar2;
        this.c = gVar;
        com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) aVar;
        this.f = eVar.a();
        this.g = eVar.b();
        StringBuilder sb = new StringBuilder("Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(Extension.O_BRAKE_SPACE);
        this.h = b64.p(sb, Build.VERSION.CODENAME, ')');
        this.i = "7.55.1(755015154)";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7 A[LOOP:0: B:23:0x00d1->B:25:0x00d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.yandex.passport.common.network.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.passport.common.network.r rVar, ContinuationImpl continuationImpl) {
        CommonBackendQuery$applyCommonHeaderTo$1 commonBackendQuery$applyCommonHeaderTo$1;
        int i;
        com.yandex.passport.common.network.r rVar2;
        String str;
        String str2;
        Iterator it;
        if (continuationImpl instanceof CommonBackendQuery$applyCommonHeaderTo$1) {
            commonBackendQuery$applyCommonHeaderTo$1 = (CommonBackendQuery$applyCommonHeaderTo$1) continuationImpl;
            int i2 = commonBackendQuery$applyCommonHeaderTo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonBackendQuery$applyCommonHeaderTo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonBackendQuery$applyCommonHeaderTo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonBackendQuery$applyCommonHeaderTo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rVar.b("manufacturer", this.d);
                    rVar.b("model", this.e);
                    rVar.b("app_platform", this.h);
                    rVar.b("am_version_name", this.i);
                    rVar.b(CommonUrlParts.APP_ID, this.f);
                    rVar.b(CommonUrlParts.APP_VERSION, this.g);
                    rVar.b("am_app", d());
                    commonBackendQuery$applyCommonHeaderTo$1.L$0 = this;
                    commonBackendQuery$applyCommonHeaderTo$1.L$1 = rVar;
                    commonBackendQuery$applyCommonHeaderTo$1.label = 1;
                    obj = this.a.a(com.yandex.passport.common.time.a.c(0, 5, 0, 11), commonBackendQuery$applyCommonHeaderTo$1);
                    rVar2 = rVar;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r6 = (com.yandex.passport.common.network.o) commonBackendQuery$applyCommonHeaderTo$1.L$1;
                    this = (h) commonBackendQuery$applyCommonHeaderTo$1.L$0;
                    kotlin.b.b(obj);
                    rVar2 = r6;
                }
                com.yandex.passport.common.analytics.b bVar = (com.yandex.passport.common.analytics.b) obj;
                str = bVar.a;
                String str3 = bVar.b;
                if (str == null) {
                    str = null;
                }
                rVar2.b(CommonUrlParts.DEVICE_ID, str);
                str2 = bVar.a;
                if (str2 == null) {
                    str2 = null;
                }
                rVar2.b(MetaDataField.DEVICE_ID_FIELD, str2);
                rVar2.b("uuid", str3 != null ? null : str3);
                StringBuilder sb = new StringBuilder();
                sb.append(str3 != null ? str3 : null);
                this.b.getClass();
                sb.append(System.currentTimeMillis());
                rVar2.b("request_id", sb.toString());
                it = this.c.b().iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    rVar2.b((String) pair.c(), (String) pair.f());
                }
                return zy11.a;
            }
        }
        commonBackendQuery$applyCommonHeaderTo$1 = new CommonBackendQuery$applyCommonHeaderTo$1(this, continuationImpl);
        Object obj2 = commonBackendQuery$applyCommonHeaderTo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonBackendQuery$applyCommonHeaderTo$1.label;
        if (i != 0) {
        }
        com.yandex.passport.common.analytics.b bVar2 = (com.yandex.passport.common.analytics.b) obj2;
        str = bVar2.a;
        String str32 = bVar2.b;
        if (str == null) {
        }
        rVar2.b(CommonUrlParts.DEVICE_ID, str);
        str2 = bVar2.a;
        if (str2 == null) {
        }
        rVar2.b(MetaDataField.DEVICE_ID_FIELD, str2);
        rVar2.b("uuid", str32 != null ? null : str32);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str32 != null ? str32 : null);
        this.b.getClass();
        sb2.append(System.currentTimeMillis());
        rVar2.b("request_id", sb2.toString());
        it = this.c.b().iterator();
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7 A[LOOP:0: B:23:0x00d1->B:25:0x00d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.yandex.passport.common.network.o oVar, ContinuationImpl continuationImpl) {
        CommonBackendQuery$applyCommonQueryTo$1 commonBackendQuery$applyCommonQueryTo$1;
        int i;
        String str;
        String str2;
        Iterator it;
        if (continuationImpl instanceof CommonBackendQuery$applyCommonQueryTo$1) {
            commonBackendQuery$applyCommonQueryTo$1 = (CommonBackendQuery$applyCommonQueryTo$1) continuationImpl;
            int i2 = commonBackendQuery$applyCommonQueryTo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonBackendQuery$applyCommonQueryTo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonBackendQuery$applyCommonQueryTo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonBackendQuery$applyCommonQueryTo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    oVar.d("manufacturer", this.d);
                    oVar.d("model", this.e);
                    oVar.d("app_platform", this.h);
                    oVar.d("am_version_name", this.i);
                    oVar.d(CommonUrlParts.APP_ID, this.f);
                    oVar.d(CommonUrlParts.APP_VERSION, this.g);
                    oVar.d("am_app", d());
                    commonBackendQuery$applyCommonQueryTo$1.L$0 = this;
                    commonBackendQuery$applyCommonQueryTo$1.L$1 = oVar;
                    commonBackendQuery$applyCommonQueryTo$1.label = 1;
                    obj = this.a.a(com.yandex.passport.common.time.a.c(0, 5, 0, 11), commonBackendQuery$applyCommonQueryTo$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oVar = (com.yandex.passport.common.network.o) commonBackendQuery$applyCommonQueryTo$1.L$1;
                    this = (h) commonBackendQuery$applyCommonQueryTo$1.L$0;
                    kotlin.b.b(obj);
                }
                com.yandex.passport.common.analytics.b bVar = (com.yandex.passport.common.analytics.b) obj;
                str = bVar.a;
                String str3 = bVar.b;
                if (str == null) {
                    str = null;
                }
                oVar.d(CommonUrlParts.DEVICE_ID, str);
                str2 = bVar.a;
                if (str2 == null) {
                    str2 = null;
                }
                oVar.d(MetaDataField.DEVICE_ID_FIELD, str2);
                oVar.d("uuid", str3 != null ? null : str3);
                StringBuilder sb = new StringBuilder();
                sb.append(str3 != null ? str3 : null);
                this.b.getClass();
                sb.append(System.currentTimeMillis());
                oVar.d("request_id", sb.toString());
                it = this.c.b().iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    oVar.d((String) pair.c(), (String) pair.f());
                }
                return zy11.a;
            }
        }
        commonBackendQuery$applyCommonQueryTo$1 = new CommonBackendQuery$applyCommonQueryTo$1(this, continuationImpl);
        Object obj2 = commonBackendQuery$applyCommonQueryTo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonBackendQuery$applyCommonQueryTo$1.label;
        if (i != 0) {
        }
        com.yandex.passport.common.analytics.b bVar2 = (com.yandex.passport.common.analytics.b) obj2;
        str = bVar2.a;
        String str32 = bVar2.b;
        if (str == null) {
        }
        oVar.d(CommonUrlParts.DEVICE_ID, str);
        str2 = bVar2.a;
        if (str2 == null) {
        }
        oVar.d(MetaDataField.DEVICE_ID_FIELD, str2);
        oVar.d("uuid", str32 != null ? null : str32);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str32 != null ? str32 : null);
        this.b.getClass();
        sb2.append(System.currentTimeMillis());
        oVar.d("request_id", sb2.toString());
        it = this.c.b().iterator();
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(jwu jwuVar, ContinuationImpl continuationImpl) {
        CommonBackendQuery$applyCommonQueryToFrontend$3 commonBackendQuery$applyCommonQueryToFrontend$3;
        int i;
        String str;
        if (continuationImpl instanceof CommonBackendQuery$applyCommonQueryToFrontend$3) {
            commonBackendQuery$applyCommonQueryToFrontend$3 = (CommonBackendQuery$applyCommonQueryToFrontend$3) continuationImpl;
            int i2 = commonBackendQuery$applyCommonQueryToFrontend$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonBackendQuery$applyCommonQueryToFrontend$3.label = i2 - Integer.MIN_VALUE;
                Object obj = commonBackendQuery$applyCommonQueryToFrontend$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonBackendQuery$applyCommonQueryToFrontend$3.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jwuVar.d("manufacturer", this.d);
                    jwuVar.d("model", this.e);
                    jwuVar.d("app_platform", ConstantDeviceInfo.APP_PLATFORM);
                    jwuVar.d("am_version_name", this.i);
                    jwuVar.d(CommonUrlParts.APP_ID, this.f);
                    jwuVar.d(CommonUrlParts.APP_VERSION, this.g);
                    jwuVar.d("am_app", d());
                    commonBackendQuery$applyCommonQueryToFrontend$3.L$0 = jwuVar;
                    commonBackendQuery$applyCommonQueryToFrontend$3.label = 1;
                    obj = this.a.a(com.yandex.passport.common.time.a.c(0, 5, 0, 11), commonBackendQuery$applyCommonQueryToFrontend$3);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jwuVar = (jwu) commonBackendQuery$applyCommonQueryToFrontend$3.L$0;
                    kotlin.b.b(obj);
                }
                com.yandex.passport.common.analytics.b bVar = (com.yandex.passport.common.analytics.b) obj;
                str = bVar.a;
                if (str == null) {
                    str = null;
                }
                jwuVar.d(MetaDataField.DEVICE_ID_FIELD, str);
                String str2 = bVar.b;
                jwuVar.d("uuid", str2 != null ? str2 : null);
                return jwuVar;
            }
        }
        commonBackendQuery$applyCommonQueryToFrontend$3 = new CommonBackendQuery$applyCommonQueryToFrontend$3(this, continuationImpl);
        Object obj2 = commonBackendQuery$applyCommonQueryToFrontend$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonBackendQuery$applyCommonQueryToFrontend$3.label;
        if (i != 0) {
        }
        com.yandex.passport.common.analytics.b bVar2 = (com.yandex.passport.common.analytics.b) obj2;
        str = bVar2.a;
        if (str == null) {
        }
        jwuVar.d(MetaDataField.DEVICE_ID_FIELD, str);
        String str22 = bVar2.b;
        jwuVar.d("uuid", str22 != null ? str22 : null);
        return jwuVar;
    }

    public final String d() {
        String str = this.g;
        if (evu0.J(str)) {
            str = null;
        }
        return kotlin.collections.a.X(j73.A(new String[]{this.f, str}), " ", null, null, null, 62);
    }
}
