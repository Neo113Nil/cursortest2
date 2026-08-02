package com.yandex.passport.internal.methods.requester;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.network.u;
import com.yandex.passport.data.network.k;
import com.yandex.passport.internal.analytics.n;
import com.yandex.passport.internal.methods.MethodRef;
import com.yandex.passport.internal.methods.service.PassportMethodBinderService;
import com.yandex.passport.internal.methods.x2;
import defpackage.gwk0;
import defpackage.i3y;
import defpackage.iqn;
import defpackage.jse;
import defpackage.kqn;
import defpackage.mqn;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.tje;
import defpackage.w511;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes8.dex */
public final class f {
    public static final i3y g = kotlin.a.a(new com.yandex.passport.common.network.a(7));
    public final Context a;
    public final u b;
    public final IReporterYandex c;
    public final k d;
    public final i3y e = kotlin.a.a(new com.yandex.passport.internal.d(6, this));
    public volatile Boolean f;

    public f(Context context, u uVar, IReporterYandex iReporterYandex) {
        this.a = context;
        this.b = uVar;
        this.c = iReporterYandex;
        this.d = new k(iReporterYandex);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c9 -> B:10:0x00ce). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, MethodRef methodRef, Bundle bundle, ContinuationImpl continuationImpl) {
        MethodRequestDispatcher$call$1 methodRequestDispatcher$call$1;
        f fVar2;
        int i;
        int i2;
        Ref$ObjectRef z;
        int[] iArr;
        int i3;
        int i4;
        MethodRef methodRef2;
        MethodRequestDispatcher$call$1 methodRequestDispatcher$call$12;
        Bundle bundle2;
        fVar.getClass();
        if (continuationImpl instanceof MethodRequestDispatcher$call$1) {
            methodRequestDispatcher$call$1 = (MethodRequestDispatcher$call$1) continuationImpl;
            int i5 = methodRequestDispatcher$call$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                methodRequestDispatcher$call$1.label = i5 - Integer.MIN_VALUE;
                fVar2 = fVar;
                Object obj = methodRequestDispatcher$call$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = methodRequestDispatcher$call$1.label;
                if (i != 0) {
                    i2 = 5;
                    z = qv10.z(obj);
                    iArr = g.a;
                    i3 = 0;
                    i4 = 0;
                    methodRef2 = methodRef;
                    methodRequestDispatcher$call$12 = methodRequestDispatcher$call$1;
                    bundle2 = bundle;
                    if (i3 < i2) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = methodRequestDispatcher$call$1.I$2;
                    int i7 = methodRequestDispatcher$call$1.I$1;
                    int i8 = methodRequestDispatcher$call$1.I$0;
                    int[] iArr2 = (int[]) methodRequestDispatcher$call$1.L$4;
                    Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) methodRequestDispatcher$call$1.L$3;
                    Bundle bundle3 = (Bundle) methodRequestDispatcher$call$1.L$2;
                    MethodRef methodRef3 = (MethodRef) methodRequestDispatcher$call$1.L$1;
                    f fVar3 = (f) methodRequestDispatcher$call$1.L$0;
                    kotlin.b.b(obj);
                    int i9 = 1;
                    methodRef2 = methodRef3;
                    i4 = i8;
                    MethodRequestDispatcher$call$1 methodRequestDispatcher$call$13 = methodRequestDispatcher$call$1;
                    bundle2 = bundle3;
                    z = ref$ObjectRef;
                    iArr = iArr2;
                    int i10 = i6;
                    fVar2 = fVar3;
                    int i11 = i10;
                    i3 = i7 + i9;
                    methodRequestDispatcher$call$12 = methodRequestDispatcher$call$13;
                    i2 = i11;
                    if (i3 < i2) {
                        int i12 = iArr[i3];
                        int i13 = i4 + 1;
                        mqn e = fVar2.e(methodRef2, bundle2);
                        if (e instanceof iqn) {
                            Bundle bundle4 = (Bundle) ((iqn) e).a;
                            if (bundle4 != null) {
                                return bundle4;
                            }
                        } else {
                            if (!(e instanceof kqn)) {
                                w511.b();
                                return null;
                            }
                            z.element = (Throwable) ((kqn) e).a();
                        }
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, oyr.h(i4, i12, "call retry: counter=", " timeout="), 8);
                        }
                        long a = com.yandex.passport.common.time.a.a(0, 0, i12);
                        methodRequestDispatcher$call$12.L$0 = fVar2;
                        methodRequestDispatcher$call$12.L$1 = methodRef2;
                        methodRequestDispatcher$call$12.L$2 = bundle2;
                        methodRequestDispatcher$call$12.L$3 = z;
                        methodRequestDispatcher$call$12.L$4 = iArr;
                        methodRequestDispatcher$call$12.I$0 = i13;
                        methodRequestDispatcher$call$12.I$1 = i3;
                        methodRequestDispatcher$call$12.I$2 = i2;
                        i9 = 1;
                        methodRequestDispatcher$call$12.label = 1;
                        if (kotlinx.coroutines.a.i(a, methodRequestDispatcher$call$12) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        int i14 = i2;
                        methodRequestDispatcher$call$13 = methodRequestDispatcher$call$12;
                        i7 = i3;
                        i10 = i14;
                        i4 = i13;
                        int i112 = i10;
                        i3 = i7 + i9;
                        methodRequestDispatcher$call$12 = methodRequestDispatcher$call$13;
                        i2 = i112;
                        if (i3 < i2) {
                            return fVar2.c(methodRef2, (Throwable) z.element, IpcSource.CONTENT_PROVIDER);
                        }
                    }
                }
            }
        }
        fVar2 = fVar;
        methodRequestDispatcher$call$1 = new MethodRequestDispatcher$call$1(fVar2, continuationImpl);
        Object obj2 = methodRequestDispatcher$call$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = methodRequestDispatcher$call$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(f fVar, MethodRef methodRef, Bundle bundle, ContinuationImpl continuationImpl) {
        MethodRequestDispatcher$callViaBinderService$1 methodRequestDispatcher$callViaBinderService$1;
        int i;
        Object a;
        fVar.getClass();
        if (continuationImpl instanceof MethodRequestDispatcher$callViaBinderService$1) {
            methodRequestDispatcher$callViaBinderService$1 = (MethodRequestDispatcher$callViaBinderService$1) continuationImpl;
            int i2 = methodRequestDispatcher$callViaBinderService$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                methodRequestDispatcher$callViaBinderService$1.label = i2 - Integer.MIN_VALUE;
                Object obj = methodRequestDispatcher$callViaBinderService$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = methodRequestDispatcher$callViaBinderService$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = (a) fVar.e.getValue();
                    methodRequestDispatcher$callViaBinderService$1.L$0 = fVar;
                    methodRequestDispatcher$callViaBinderService$1.L$1 = methodRef;
                    methodRequestDispatcher$callViaBinderService$1.label = 1;
                    a = aVar.a(methodRef, bundle, methodRequestDispatcher$callViaBinderService$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    methodRef = (MethodRef) methodRequestDispatcher$callViaBinderService$1.L$1;
                    fVar = (f) methodRequestDispatcher$callViaBinderService$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                return a instanceof Result.Failure ? a : fVar.c(methodRef, Result.a(a), IpcSource.BINDER_SERVICE);
            }
        }
        methodRequestDispatcher$callViaBinderService$1 = new MethodRequestDispatcher$callViaBinderService$1(fVar, continuationImpl);
        Object obj2 = methodRequestDispatcher$callViaBinderService$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = methodRequestDispatcher$callViaBinderService$1.label;
        if (i != 0) {
        }
        if (a instanceof Result.Failure) {
        }
    }

    public final Result.Failure c(MethodRef methodRef, Throwable th, IpcSource ipcSource) {
        IReporterYandex iReporterYandex = (IReporterYandex) this.d.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(PassportMethodBinderService.KEY_METHOD_NAME, methodRef.name());
        linkedHashMap.put("ipc_source", ipcSource.name());
        if (th != null) {
            linkedHashMap.put(Constants.KEY_EXCEPTION, th.getMessage());
        }
        iReporterYandex.reportEvent(n.e.a, linkedHashMap);
        if (th == null) {
            return new Result.Failure(new PassportRuntimeUnknownException("[" + ipcSource + "] Passport provider unexpectedly returned null for " + methodRef));
        }
        iReporterYandex.reportError("error", th);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Method " + methodRef + " have failed with throwable", th);
        }
        return new Result.Failure(new PassportRuntimeUnknownException("Method " + methodRef + " have failed with throwable", th));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(x2 x2Var, ContinuationImpl continuationImpl) {
        MethodRequestDispatcher$requestMethod$1 methodRequestDispatcher$requestMethod$1;
        int i;
        if (continuationImpl instanceof MethodRequestDispatcher$requestMethod$1) {
            methodRequestDispatcher$requestMethod$1 = (MethodRequestDispatcher$requestMethod$1) continuationImpl;
            int i2 = methodRequestDispatcher$requestMethod$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                methodRequestDispatcher$requestMethod$1.label = i2 - Integer.MIN_VALUE;
                Object obj = methodRequestDispatcher$requestMethod$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = methodRequestDispatcher$requestMethod$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jse jseVar = (jse) g.getValue();
                    MethodRequestDispatcher$requestMethod$2 methodRequestDispatcher$requestMethod$2 = new MethodRequestDispatcher$requestMethod$2(this, x2Var, null);
                    methodRequestDispatcher$requestMethod$1.label = 1;
                    obj = tje.k0(jseVar, methodRequestDispatcher$requestMethod$2, methodRequestDispatcher$requestMethod$1);
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
                return ((Result) obj).getValue();
            }
        }
        methodRequestDispatcher$requestMethod$1 = new MethodRequestDispatcher$requestMethod$1(this, continuationImpl);
        Object obj2 = methodRequestDispatcher$requestMethod$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = methodRequestDispatcher$requestMethod$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public final mqn e(MethodRef methodRef, Bundle bundle) {
        Bundle bundle2;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        long elapsedRealtime = com.yandex.passport.common.logger.a.a.isEnabled() ? SystemClock.elapsedRealtime() : 0L;
        Throwable th = null;
        try {
            u uVar = this.b;
            String name = methodRef.name();
            ContentProviderClient acquireUnstableContentProviderClient = ((ContentResolver) uVar.a).acquireUnstableContentProviderClient((Uri) uVar.b);
            if (acquireUnstableContentProviderClient != null) {
                try {
                    bundle2 = acquireUnstableContentProviderClient.call(name, null, bundle);
                } finally {
                }
            } else {
                bundle2 = null;
            }
            gwk0.m(acquireUnstableContentProviderClient, null);
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, qv10.j(elapsedRealtime2, "call: time="), 8);
                }
            }
        } catch (Throwable th2) {
            try {
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "call " + methodRef + " failed", th2);
                }
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, qv10.j(elapsedRealtime3, "call: time="), 8);
                    }
                }
                bundle2 = null;
                th = th2;
            } catch (Throwable th3) {
                com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, qv10.j(elapsedRealtime4, "call: time="), 8);
                    }
                }
                throw th3;
            }
        }
        return th != null ? new kqn(th) : new iqn(bundle2);
    }
}
