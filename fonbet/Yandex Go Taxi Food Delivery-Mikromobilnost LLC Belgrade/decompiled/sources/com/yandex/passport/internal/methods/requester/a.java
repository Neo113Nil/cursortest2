package com.yandex.passport.internal.methods.requester;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.methods.MethodRef;
import com.yandex.passport.internal.methods.service.PassportMethodBinderService;
import com.yandex.passport.internal.report.kd;
import com.yandex.passport.internal.report.m2;
import com.yandex.passport.internal.report.pd;
import defpackage.bvf0;
import defpackage.c9w0;
import defpackage.dvw;
import defpackage.gw00;
import defpackage.i18;
import defpackage.j18;
import defpackage.ny61;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class a {
    public final Context a;
    public final com.yandex.passport.biometric.ui.verification.a b;
    public final r0 c = bvf0.c(null);
    public final AtomicLong d = new AtomicLong(0);
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final Messenger f;
    public final BinderServiceClient$serviceConnection$1 g;

    /* JADX WARN: Type inference failed for: r3v7, types: [com.yandex.passport.internal.methods.requester.BinderServiceClient$serviceConnection$1] */
    public a(Context context, com.yandex.passport.biometric.ui.verification.a aVar) {
        this.a = context;
        this.b = aVar;
        HandlerThread handlerThread = new HandlerThread("BinderServiceClient-reply");
        handlerThread.setDaemon(true);
        handlerThread.start();
        final Looper looper = handlerThread.getLooper();
        this.f = new Messenger(new Handler(looper) { // from class: com.yandex.passport.internal.methods.requester.BinderServiceClient$replyMessenger$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                long j = msg.getData().getLong("request_id");
                Object obj = msg.obj;
                Object obj2 = obj instanceof Bundle ? (Bundle) obj : null;
                i18 i18Var = (i18) a.this.e.remove(Long.valueOf(j));
                if (i18Var == null) {
                    return;
                }
                MethodRef methodRef = (MethodRef) kotlin.collections.a.S(msg.what, MethodRef.a());
                if (obj2 == null) {
                    obj2 = new Result.Failure(new PassportRuntimeUnknownException("null response bundle (id=" + j + ')'));
                }
                if (methodRef != null) {
                    a.this.b.g(methodRef, !(obj2 instanceof Result.Failure));
                }
                try {
                    i18Var.resumeWith(new Result(obj2));
                } catch (IllegalStateException unused) {
                }
            }
        });
        this.g = new ServiceConnection() { // from class: com.yandex.passport.internal.methods.requester.BinderServiceClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onBindingDied(ComponentName name) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "BinderServiceClient: binding died, reconnecting", 8);
                }
                a.this.c.l(null);
                try {
                    a.this.a.unbindService(this);
                } catch (Throwable unused) {
                }
                a.this.b();
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder binder) {
                Messenger messenger = binder != null ? new Messenger(binder) : null;
                if (messenger != null) {
                    r0 r0Var = a.this.c;
                    r0Var.getClass();
                    r0Var.m(null, messenger);
                } else {
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "BinderServiceClient: null binder in onServiceConnected", 8);
                    }
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "BinderServiceClient: service disconnected", 8);
                }
                com.yandex.passport.biometric.ui.verification.a aVar2 = a.this.b;
                m2 m2Var = m2.w;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((pd) next).a()) {
                        arrayList2.add(next);
                    }
                }
                kd kdVar = (kd) aVar2.b;
                String fd20Var = m2Var.toString();
                int d = gw00.d(tcc.n(arrayList2, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    pd pdVar = (pd) it2.next();
                    Pair pair = new Pair(pdVar.getName(), pdVar.getValue());
                    linkedHashMap.put(pair.c(), pair.f());
                }
                kdVar.a(fd20Var, linkedHashMap);
                a.this.c.l(null);
                a aVar3 = a.this;
                PassportRuntimeUnknownException passportRuntimeUnknownException = new PassportRuntimeUnknownException("binder service disconnected");
                ConcurrentHashMap concurrentHashMap = aVar3.e;
                Iterator it3 = Collections.list(concurrentHashMap.keys()).iterator();
                while (it3.hasNext()) {
                    i18 i18Var = (i18) concurrentHashMap.remove((Long) it3.next());
                    if (i18Var != null) {
                        i18Var.resumeWith(new Result.Failure(passportRuntimeUnknownException));
                    }
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0111, code lost:
    
        if (r12 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0113, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if (r12 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(MethodRef methodRef, Bundle bundle, ContinuationImpl continuationImpl) {
        BinderServiceClient$call$1 binderServiceClient$call$1;
        int i;
        Messenger messenger;
        if (continuationImpl instanceof BinderServiceClient$call$1) {
            binderServiceClient$call$1 = (BinderServiceClient$call$1) continuationImpl;
            int i2 = binderServiceClient$call$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                binderServiceClient$call$1.label = i2 - Integer.MIN_VALUE;
                Object obj = binderServiceClient$call$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = binderServiceClient$call$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    BinderServiceClient$call$remote$1 binderServiceClient$call$remote$1 = new BinderServiceClient$call$remote$1(this, null);
                    binderServiceClient$call$1.L$0 = this;
                    binderServiceClient$call$1.L$1 = methodRef;
                    binderServiceClient$call$1.L$2 = bundle;
                    binderServiceClient$call$1.label = 1;
                    obj = kotlinx.coroutines.a.w(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, binderServiceClient$call$remote$1, binderServiceClient$call$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    bundle = (Bundle) binderServiceClient$call$1.L$2;
                    methodRef = (MethodRef) binderServiceClient$call$1.L$1;
                    this = (a) binderServiceClient$call$1.L$0;
                    kotlin.b.b(obj);
                }
                messenger = (Messenger) obj;
                if (messenger != null) {
                    Result.Failure failure = new Result.Failure(new PassportRuntimeUnknownException("BinderService connection timeout for " + methodRef));
                    this.b.g(methodRef, false);
                    return failure;
                }
                binderServiceClient$call$1.L$0 = this;
                binderServiceClient$call$1.L$1 = methodRef;
                binderServiceClient$call$1.L$2 = bundle;
                binderServiceClient$call$1.L$3 = messenger;
                binderServiceClient$call$1.label = 2;
                j18 j18Var = new j18(1, dvw.b(binderServiceClient$call$1));
                j18Var.u();
                AtomicLong atomicLong = this.d;
                ConcurrentHashMap concurrentHashMap = this.e;
                long incrementAndGet = atomicLong.incrementAndGet();
                concurrentHashMap.put(new Long(incrementAndGet), j18Var);
                j18Var.w(new c9w0(this, incrementAndGet));
                Bundle bundle2 = new Bundle();
                bundle2.putLong("request_id", incrementAndGet);
                bundle2.putString(PassportMethodBinderService.KEY_METHOD_NAME, methodRef.name());
                bundle2.putBundle("args", bundle);
                try {
                    Message obtain = Message.obtain();
                    obtain.what = methodRef.ordinal();
                    obtain.obj = bundle2;
                    obtain.replyTo = this.f;
                    messenger.send(obtain);
                } catch (RemoteException e) {
                    i18 i18Var = (i18) concurrentHashMap.remove(new Long(incrementAndGet));
                    if (i18Var != null) {
                        this.b.g(methodRef, false);
                        i18Var.resumeWith(new Result(new Result.Failure(e)));
                    }
                }
                obj = j18Var.s();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            }
        }
        binderServiceClient$call$1 = new BinderServiceClient$call$1(this, continuationImpl);
        Object obj2 = binderServiceClient$call$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = binderServiceClient$call$1.label;
        if (i != 0) {
        }
        messenger = (Messenger) obj2;
        if (messenger != null) {
        }
    }

    public final void b() {
        Context context = this.a;
        context.bindService(new Intent(context, (Class<?>) PassportMethodBinderService.class), this.g, 1);
    }
}
