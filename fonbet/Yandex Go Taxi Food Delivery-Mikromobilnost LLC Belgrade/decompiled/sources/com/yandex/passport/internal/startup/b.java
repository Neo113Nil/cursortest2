package com.yandex.passport.internal.startup;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.methods.a2;
import com.yandex.passport.internal.methods.requester.CommonRequesterKt$requestMethodOnDefault$2;
import com.yandex.passport.internal.methods.requester.f;
import com.yandex.passport.internal.util.p;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.jl40;
import defpackage.lfx;
import defpackage.lse;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.o400;
import defpackage.ru8;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b {
    public static final b a = new b();
    public static boolean b;
    public static Boolean c;
    public static final ike d;

    static {
        ru8 ru8Var = new ru8(lse.a, 10);
        sjh sjhVar = uyj.a;
        d = bvf0.a(o400.a.x.plus(jl40.a()).plus(p.o("HostProcessForegroundObserver")).plus(ru8Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, f fVar, boolean z, ContinuationImpl continuationImpl) {
        HostProcessForegroundObserver$sendAppBackgroundStateIfChanged$1 hostProcessForegroundObserver$sendAppBackgroundStateIfChanged$1;
        int i;
        Throwable a2;
        bVar.getClass();
        if (continuationImpl instanceof HostProcessForegroundObserver$sendAppBackgroundStateIfChanged$1) {
            hostProcessForegroundObserver$sendAppBackgroundStateIfChanged$1 = (HostProcessForegroundObserver$sendAppBackgroundStateIfChanged$1) continuationImpl;
            int i2 = hostProcessForegroundObserver$sendAppBackgroundStateIfChanged$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hostProcessForegroundObserver$sendAppBackgroundStateIfChanged$1.label = i2 - Integer.MIN_VALUE;
                Object obj = hostProcessForegroundObserver$sendAppBackgroundStateIfChanged$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hostProcessForegroundObserver$sendAppBackgroundStateIfChanged$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(c, Boolean.valueOf(z))) {
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, nzs.b("isInBackground ", " skipped", z), 8);
                            return zy11Var;
                        }
                        return zy11Var;
                    }
                    c = Boolean.valueOf(z);
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "isInBackground " + z, 8);
                    }
                    sjh sjhVar = uyj.a;
                    CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar, new a2(z), new lfx[0], null);
                    hostProcessForegroundObserver$sendAppBackgroundStateIfChanged$1.label = 1;
                    obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, hostProcessForegroundObserver$sendAppBackgroundStateIfChanged$1);
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
                a2 = Result.a(((Result) obj).getValue());
                if (a2 != null) {
                    com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Failed to send app background state to passport process " + a2, 8);
                    }
                }
                return zy11Var;
            }
        }
        hostProcessForegroundObserver$sendAppBackgroundStateIfChanged$1 = new HostProcessForegroundObserver$sendAppBackgroundStateIfChanged$1(bVar, continuationImpl);
        Object obj2 = hostProcessForegroundObserver$sendAppBackgroundStateIfChanged$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hostProcessForegroundObserver$sendAppBackgroundStateIfChanged$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        a2 = Result.a(((Result) obj2).getValue());
        if (a2 != null) {
        }
        return zy11Var2;
    }

    public final void b(f fVar) {
        synchronized (this) {
            if (!b) {
                tje.N(d, null, null, new HostProcessForegroundObserver$start$1$2(fVar, null), 3);
                b = true;
            } else {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "HostProcessForegroundObserver already started", 8);
                }
            }
        }
    }
}
