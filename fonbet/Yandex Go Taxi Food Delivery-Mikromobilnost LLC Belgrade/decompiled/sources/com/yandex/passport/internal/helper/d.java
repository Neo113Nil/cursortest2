package com.yandex.passport.internal.helper;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.data.network.e7;
import com.yandex.passport.data.network.g7;
import com.yandex.passport.data.network.rb;
import com.yandex.passport.data.network.wb;
import com.yandex.passport.data.network.z6;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.analytics.t;
import com.yandex.passport.internal.entities.DeviceCode;
import com.yandex.passport.internal.j;
import com.yandex.passport.internal.report.ga;
import com.yandex.passport.internal.report.ha;
import com.yandex.passport.internal.report.ia;
import com.yandex.passport.internal.report.reporters.t0;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.util.p;
import defpackage.ny61;
import defpackage.scc;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class d {
    public final com.yandex.passport.internal.core.accounts.d a;
    public final wb b;
    public final g7 c;
    public final t0 d;
    public final com.yandex.passport.internal.network.mappers.b e;
    public final t f;
    public final com.yandex.passport.internal.credentials.d g;

    public d(com.yandex.passport.internal.core.accounts.d dVar, wb wbVar, g7 g7Var, t0 t0Var, com.yandex.passport.internal.network.mappers.b bVar, t tVar, com.yandex.passport.internal.credentials.d dVar2) {
        this.a = dVar;
        this.b = wbVar;
        this.c = g7Var;
        this.d = t0Var;
        this.e = bVar;
        this.f = tVar;
        this.g = dVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Environment environment, String str, boolean z, ContinuationImpl continuationImpl) {
        DeviceAuthorizationHelper$getDeviceCode$1 deviceAuthorizationHelper$getDeviceCode$1;
        int i;
        boolean z2;
        Throwable a;
        if (continuationImpl instanceof DeviceAuthorizationHelper$getDeviceCode$1) {
            deviceAuthorizationHelper$getDeviceCode$1 = (DeviceAuthorizationHelper$getDeviceCode$1) continuationImpl;
            int i2 = deviceAuthorizationHelper$getDeviceCode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deviceAuthorizationHelper$getDeviceCode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deviceAuthorizationHelper$getDeviceCode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deviceAuthorizationHelper$getDeviceCode$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j g = p.g(this.g.a, environment);
                    this.e.getClass();
                    z6 z6Var = new z6(com.yandex.passport.internal.network.mappers.b.a(environment), str, g.getDecryptedId(), z);
                    deviceAuthorizationHelper$getDeviceCode$1.L$0 = this;
                    deviceAuthorizationHelper$getDeviceCode$1.label = 1;
                    obj = this.c.a(z6Var, deviceAuthorizationHelper$getDeviceCode$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (d) deviceAuthorizationHelper$getDeviceCode$1.L$0;
                    kotlin.b.b(obj);
                }
                Object value = ((Result) obj).getValue();
                z2 = value instanceof Result.Failure;
                if (!z2) {
                    t tVar = this.f;
                    com.yandex.passport.internal.analytics.j jVar = com.yandex.passport.internal.analytics.j.b;
                    tVar.a(a0.w(), kotlin.collections.b.f());
                }
                a = Result.a(value);
                if (a != null) {
                    t tVar2 = this.f;
                    com.yandex.passport.internal.analytics.j jVar2 = com.yandex.passport.internal.analytics.j.b;
                    tVar2.a(a0.v(), kotlin.collections.b.i(new Pair("success", "0"), new Pair("error", a.toString())));
                }
                if (!z2) {
                    return value;
                }
                try {
                    e7 e7Var = (e7) value;
                    return new DeviceCode(e7Var.a(), e7Var.d(), e7Var.e(), e7Var.c(), e7Var.b());
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }
        deviceAuthorizationHelper$getDeviceCode$1 = new DeviceAuthorizationHelper$getDeviceCode$1(this, continuationImpl);
        Object obj2 = deviceAuthorizationHelper$getDeviceCode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deviceAuthorizationHelper$getDeviceCode$1.label;
        if (i != 0) {
        }
        Object value2 = ((Result) obj2).getValue();
        z2 = value2 instanceof Result.Failure;
        if (!z2) {
        }
        a = Result.a(value2);
        if (a != null) {
        }
        if (!z2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Uid uid, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        DeviceAuthorizationHelper$sendAuthToTrack$1 deviceAuthorizationHelper$sendAuthToTrack$1;
        int i;
        Object failure;
        Throwable a;
        boolean z;
        d dVar = this;
        Uid uid2 = uid;
        String str4 = str;
        if (continuationImpl instanceof DeviceAuthorizationHelper$sendAuthToTrack$1) {
            deviceAuthorizationHelper$sendAuthToTrack$1 = (DeviceAuthorizationHelper$sendAuthToTrack$1) continuationImpl;
            int i2 = deviceAuthorizationHelper$sendAuthToTrack$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deviceAuthorizationHelper$sendAuthToTrack$1.label = i2 - Integer.MIN_VALUE;
                DeviceAuthorizationHelper$sendAuthToTrack$1 deviceAuthorizationHelper$sendAuthToTrack$12 = deviceAuthorizationHelper$sendAuthToTrack$1;
                Object obj = deviceAuthorizationHelper$sendAuthToTrack$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deviceAuthorizationHelper$sendAuthToTrack$12.label;
                boolean z2 = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t0 t0Var = dVar.d;
                    t0Var.getClass();
                    t0Var.f(ha.w, new yd(str4, 12), new yd(uid2));
                    ModernAccount e = dVar.a.a().e(uid2);
                    if (e == null) {
                        failure = new Result.Failure(new PassportAccountNotFoundException(uid2));
                    } else if (scc.g(new Integer(12), new Integer(10)).contains(new Integer(e.getPrimaryAliasType()))) {
                        failure = new Result.Failure(new PassportRuntimeUnknownException("Unsupported account type: " + e.getPrimaryAliasType()));
                    } else {
                        Environment environment = uid2.getEnvironment();
                        dVar.e.getClass();
                        rb rbVar = new rb(e.getLocationId(), e.getMasterToken(), com.yandex.passport.internal.network.mappers.b.a(environment), str4, str2, str3 == null ? "selected_2fa_picture" : str3);
                        deviceAuthorizationHelper$sendAuthToTrack$12.L$0 = dVar;
                        deviceAuthorizationHelper$sendAuthToTrack$12.L$1 = uid2;
                        deviceAuthorizationHelper$sendAuthToTrack$12.L$2 = str4;
                        deviceAuthorizationHelper$sendAuthToTrack$12.label = 1;
                        obj = dVar.b.a(rbVar, deviceAuthorizationHelper$sendAuthToTrack$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    a = Result.a(failure);
                    if (a != null) {
                        t0 t0Var2 = dVar.d;
                        String valueOf = String.valueOf(a.getMessage());
                        t0Var2.getClass();
                        t0Var2.f(ga.w, new yd(str4, 12), new yd(uid2), new com.yandex.passport.internal.report.a(valueOf, 26, z2));
                    }
                    return failure;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str5 = (String) deviceAuthorizationHelper$sendAuthToTrack$12.L$2;
                uid2 = (Uid) deviceAuthorizationHelper$sendAuthToTrack$12.L$1;
                d dVar2 = (d) deviceAuthorizationHelper$sendAuthToTrack$12.L$0;
                kotlin.b.b(obj);
                str4 = str5;
                dVar = dVar2;
                failure = ((Result) obj).getValue();
                z = failure instanceof Result.Failure;
                if (!z) {
                    t0 t0Var3 = dVar.d;
                    t0Var3.getClass();
                    t0Var3.f(ia.w, new yd(str4, 12), new yd(uid2));
                }
                if (!z) {
                    failure = zy11.a;
                }
                a = Result.a(failure);
                if (a != null) {
                }
                return failure;
            }
        }
        deviceAuthorizationHelper$sendAuthToTrack$1 = new DeviceAuthorizationHelper$sendAuthToTrack$1(dVar, continuationImpl);
        DeviceAuthorizationHelper$sendAuthToTrack$1 deviceAuthorizationHelper$sendAuthToTrack$122 = deviceAuthorizationHelper$sendAuthToTrack$1;
        Object obj2 = deviceAuthorizationHelper$sendAuthToTrack$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deviceAuthorizationHelper$sendAuthToTrack$122.label;
        boolean z22 = false;
        if (i != 0) {
        }
        failure = ((Result) obj2).getValue();
        z = failure instanceof Result.Failure;
        if (!z) {
        }
        if (!z) {
        }
        a = Result.a(failure);
        if (a != null) {
        }
        return failure;
    }
}
