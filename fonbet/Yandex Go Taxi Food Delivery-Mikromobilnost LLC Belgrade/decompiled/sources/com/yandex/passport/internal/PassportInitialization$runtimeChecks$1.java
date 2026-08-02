package com.yandex.passport.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.yandex.passport.R;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.IReporterYandex;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.PassportInitialization$runtimeChecks$1", f = "PassportInitialization.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PassportInitialization$runtimeChecks$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    final /* synthetic */ IReporterYandex $reporter;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportInitialization$runtimeChecks$1(Context context, IReporterYandex iReporterYandex, Continuation continuation) {
        super(2, continuation);
        this.$context = context;
        this.$reporter = iReporterYandex;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassportInitialization$runtimeChecks$1(this.$context, this.$reporter, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PassportInitialization$runtimeChecks$1 passportInitialization$runtimeChecks$1 = (PassportInitialization$runtimeChecks$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        passportInitialization$runtimeChecks$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.yandex.passport.internal.entities.o oVar;
        boolean a;
        boolean d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list = s.a;
        Context applicationContext = this.$context.getApplicationContext();
        IReporterYandex iReporterYandex = this.$reporter;
        try {
            byte[] bArr = com.yandex.passport.internal.entities.o.c;
            oVar = com.yandex.passport.internal.util.p.f(applicationContext.getPackageManager(), applicationContext.getPackageName());
        } catch (PackageManager.NameNotFoundException e) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "releaseRuntimeChecks", e);
            }
            s.c(iReporterYandex, com.yandex.passport.internal.analytics.l.c, e);
            oVar = com.yandex.passport.internal.entities.o.f;
        } catch (NoSuchAlgorithmException e2) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "releaseRuntimeChecks", e2);
            }
            s.c(iReporterYandex, com.yandex.passport.internal.analytics.l.c, e2);
            oVar = com.yandex.passport.internal.entities.o.f;
        }
        String string = applicationContext.getString(R.string.passport_account_type);
        if (!string.equals("com.yandex.passport")) {
            i.a = "com.yandex.passport".concat(string.substring(19));
        }
        if (oVar.c() && i.a.equals("com.yandex.passport")) {
            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "releaseRuntimeChecks: production signature with production account type: passed", 8);
            }
            a = s.a(applicationContext, iReporterYandex);
        } else {
            if (oVar.b()) {
                com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "releaseRuntimeChecks: development signature: passed", 8);
                }
            } else {
                if (!cvu0.s(i.a, ".sso", false)) {
                    com.yandex.passport.internal.sso.g gVar = new com.yandex.passport.internal.sso.g(applicationContext, null, null);
                    com.yandex.passport.internal.sso.c c = gVar.c(new com.yandex.passport.internal.sso.d(iReporterYandex, 1), applicationContext.getPackageName());
                    if (c == null) {
                        d = false;
                    } else {
                        d = c.d(gVar.d, new com.yandex.passport.internal.sso.d(iReporterYandex, 2));
                    }
                    if (!d) {
                        com.yandex.passport.internal.sso.c c2 = new com.yandex.passport.internal.sso.g(applicationContext, null, null).c(new com.yandex.passport.internal.sso.d(iReporterYandex, 0), applicationContext.getPackageName());
                        if (c2 != null && c2.c() != null) {
                            com.yandex.passport.common.logger.c cVar5 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.WARN, null, "releaseRuntimeChecks: expired alien certificate, don't crash: passed", 8);
                            }
                            a = s.a(applicationContext, iReporterYandex);
                        } else if (com.yandex.passport.common.util.a.d(applicationContext)) {
                            com.yandex.passport.common.logger.c cVar6 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.WARN, null, "releaseRuntimeChecks: application is debuggable: passed", 8);
                            }
                        } else if (evu0.y(applicationContext.getPackageName(), "uber.az", false) && !i.a.equals("com.yandex.passport")) {
                            com.yandex.passport.common.logger.c cVar7 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "releaseRuntimeChecks: uber.az", 8);
                            }
                        } else if (s.a.contains(applicationContext.getPackageName()) && !i.a.equals("com.yandex.passport")) {
                            com.yandex.passport.common.logger.c cVar8 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "releaseRuntimeChecks: known packageName: " + applicationContext.getPackageName(), 8);
                            }
                        } else if (!cvu0.x(i.a, "com.yandex.passport.wl", false)) {
                            a = false;
                        }
                    }
                }
                com.yandex.passport.common.logger.c cVar9 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "releaseRuntimeChecks: valid alien signature: passed", 8);
                }
                a = s.a(applicationContext, iReporterYandex);
            }
            a = true;
        }
        if (!a) {
            if (oVar.c()) {
                com.yandex.passport.common.logger.c cVar10 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "releaseRuntimeChecks: production signature with unknown account type: crash", 8);
                }
            } else {
                com.yandex.passport.common.logger.c cVar11 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "releaseRuntimeChecks: unknown signature and application is not debuggable: crash", 8);
                }
            }
            com.yandex.passport.internal.analytics.l lVar = com.yandex.passport.internal.analytics.l.b;
            IllegalStateException illegalStateException = new IllegalStateException("Internal error, application signature mismatch");
            s.c(iReporterYandex, lVar, illegalStateException);
            Log.e("PassportRuntime", "Passport initial error: " + illegalStateException);
            new Handler(Looper.getMainLooper()).post(new n(0, applicationContext));
        }
        return zy11.a;
    }
}
