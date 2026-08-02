package com.yandex.passport.internal.ui.challenge;

import android.net.Uri;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.FrontendUrlType;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.flags.presentation.s0;
import com.yandex.passport.internal.report.j7;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.k7;
import com.yandex.passport.internal.report.l7;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.usecase.a0;
import com.yandex.passport.internal.usecase.b0;
import com.yandex.passport.internal.usecase.c0;
import com.yandex.passport.internal.usecase.d0;
import com.yandex.passport.internal.usecase.w;
import com.yandex.passport.internal.usecase.y;
import com.yandex.passport.internal.usecase.z;
import defpackage.ny61;
import java.io.IOException;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class n {
    public final com.yandex.passport.internal.network.e a;
    public final d0 b;
    public final y c;
    public final com.yandex.passport.common.ui.lang.b d;
    public final com.yandex.passport.internal.flags.j e;
    public final com.yandex.passport.internal.report.reporters.o f;

    public n(com.yandex.passport.internal.network.e eVar, d0 d0Var, y yVar, com.yandex.passport.common.ui.lang.b bVar, com.yandex.passport.internal.flags.j jVar, com.yandex.passport.internal.report.reporters.o oVar) {
        this.a = eVar;
        this.b = d0Var;
        this.c = yVar;
        this.d = bVar;
        this.e = jVar;
        this.f = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uid uid, ContinuationImpl continuationImpl) {
        ChallengeHelper$getActualChallengeState$1 challengeHelper$getActualChallengeState$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof ChallengeHelper$getActualChallengeState$1) {
            challengeHelper$getActualChallengeState$1 = (ChallengeHelper$getActualChallengeState$1) continuationImpl;
            int i2 = challengeHelper$getActualChallengeState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                challengeHelper$getActualChallengeState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = challengeHelper$getActualChallengeState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = challengeHelper$getActualChallengeState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LogLevel logLevel = LogLevel.DEBUG;
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(logLevel, null, "Requesting challengeState for uid = " + uid, 10);
                    }
                    challengeHelper$getActualChallengeState$1.L$0 = this;
                    challengeHelper$getActualChallengeState$1.L$1 = uid;
                    challengeHelper$getActualChallengeState$1.label = 1;
                    obj = this.b.a(uid, challengeHelper$getActualChallengeState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uid = (Uid) challengeHelper$getActualChallengeState$1.L$1;
                    this = (n) challengeHelper$getActualChallengeState$1.L$0;
                    kotlin.b.b(obj);
                }
                Object value = ((Result) obj).getValue();
                a = Result.a(value);
                if (a != null) {
                    c0 c0Var = (c0) value;
                    com.yandex.passport.internal.report.reporters.o oVar = this.f;
                    oVar.getClass();
                    oVar.f(j7.w, new yd(uid), new com.yandex.passport.internal.report.a(c0Var));
                    return c0Var;
                }
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Failed to get challenge", a);
                }
                com.yandex.passport.internal.report.reporters.o oVar2 = this.f;
                oVar2.getClass();
                oVar2.f(k7.w, new yd(uid), new yd(a));
                boolean z = a instanceof IOException;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "causeNoInternet " + z, 8);
                }
                return new z(z);
            }
        }
        challengeHelper$getActualChallengeState$1 = new ChallengeHelper$getActualChallengeState$1(this, continuationImpl);
        Object obj2 = challengeHelper$getActualChallengeState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = challengeHelper$getActualChallengeState$1.label;
        if (i != 0) {
        }
        Object value2 = ((Result) obj2).getValue();
        a = Result.a(value2);
        if (a != null) {
        }
    }

    public final Object b(Uid uid, ContinuationImpl continuationImpl) {
        if (((Boolean) this.e.b(com.yandex.passport.internal.flags.q.G)).booleanValue()) {
            int i = m.a[uid.getEnvironment().ordinal()];
            if (i != 1 && i != 2) {
                return a(uid, continuationImpl);
            }
        }
        return b0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Uid uid, a0 a0Var, PassportTheme passportTheme, ContinuationImpl continuationImpl) {
        ChallengeHelper$getChallengeWebCase$1 challengeHelper$getChallengeWebCase$1;
        int i;
        String f;
        Object d;
        n nVar;
        String str;
        com.yandex.passport.common.url.b bVar;
        if (continuationImpl instanceof ChallengeHelper$getChallengeWebCase$1) {
            challengeHelper$getChallengeWebCase$1 = (ChallengeHelper$getChallengeWebCase$1) continuationImpl;
            int i2 = challengeHelper$getChallengeWebCase$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                challengeHelper$getChallengeWebCase$1.label = i2 - Integer.MIN_VALUE;
                Object obj = challengeHelper$getChallengeWebCase$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = challengeHelper$getChallengeWebCase$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Environment environment = uid.getEnvironment();
                    com.yandex.passport.internal.network.l lVar = (com.yandex.passport.internal.network.l) this.a;
                    lVar.getClass();
                    f = lVar.f(environment, 0L, null);
                    Uri build = Uri.parse(f).buildUpon().appendEncodedPath("closewebview").build();
                    com.yandex.passport.common.url.b.Companion.getClass();
                    String uri = build.toString();
                    String a = a0Var.a();
                    LogLevel logLevel = LogLevel.DEBUG;
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(logLevel, null, "showWebView url = " + ((Object) com.yandex.passport.common.url.b.l(a)), 10);
                    }
                    String uri2 = Uri.parse(a).buildUpon().appendQueryParameter("retpath", uri).appendQueryParameter(DivkitThemeChangeListener.THEME_VARIABLE_NAME, com.yandex.passport.internal.ui.util.o.b(passportTheme)).build().toString();
                    challengeHelper$getChallengeWebCase$1.L$0 = this;
                    challengeHelper$getChallengeWebCase$1.L$1 = uid;
                    challengeHelper$getChallengeWebCase$1.L$2 = uri;
                    challengeHelper$getChallengeWebCase$1.label = 1;
                    d = d(uid, uri2, challengeHelper$getChallengeWebCase$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    nVar = this;
                    str = uri;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) challengeHelper$getChallengeWebCase$1.L$2;
                    uid = (Uid) challengeHelper$getChallengeWebCase$1.L$1;
                    nVar = (n) challengeHelper$getChallengeWebCase$1.L$0;
                    kotlin.b.b(obj);
                    com.yandex.passport.common.url.b bVar2 = (com.yandex.passport.common.url.b) obj;
                    d = bVar2 != null ? bVar2.a : null;
                }
                String str2 = (String) d;
                bVar = str2 == null ? new com.yandex.passport.common.url.b(str2) : null;
                if (bVar != null) {
                    return null;
                }
                v vVar = new v(bVar.a, str);
                com.yandex.passport.internal.report.reporters.o oVar = nVar.f;
                oVar.getClass();
                oVar.f(l7.w, new yd(uid), new jd(vVar.e(), 5));
                vVar.c(new s0(15, nVar, uid));
                return vVar;
            }
        }
        challengeHelper$getChallengeWebCase$1 = new ChallengeHelper$getChallengeWebCase$1(this, continuationImpl);
        Object obj2 = challengeHelper$getChallengeWebCase$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = challengeHelper$getChallengeWebCase$1.label;
        if (i != 0) {
        }
        String str22 = (String) d;
        if (str22 == null) {
        }
        if (bVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Uid uid, String str, ContinuationImpl continuationImpl) {
        ChallengeHelper$requireAuthUrl$1 challengeHelper$requireAuthUrl$1;
        int i;
        Object value;
        com.yandex.passport.common.url.b bVar;
        if (continuationImpl instanceof ChallengeHelper$requireAuthUrl$1) {
            challengeHelper$requireAuthUrl$1 = (ChallengeHelper$requireAuthUrl$1) continuationImpl;
            int i2 = challengeHelper$requireAuthUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                challengeHelper$requireAuthUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = challengeHelper$requireAuthUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = challengeHelper$requireAuthUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (uid != null) {
                        w wVar = new w(uid, ((com.yandex.passport.internal.ui.lang.a) this.d).b(), str, (String) null, (Map) null, (FrontendUrlType) null, 120);
                        challengeHelper$requireAuthUrl$1.label = 1;
                        obj = this.c.a(wVar, challengeHelper$requireAuthUrl$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                value = ((Result) obj).getValue();
                if (value instanceof Result.Failure) {
                    value = null;
                }
                bVar = (com.yandex.passport.common.url.b) value;
                if (bVar != null) {
                    return bVar.a;
                }
                return null;
            }
        }
        challengeHelper$requireAuthUrl$1 = new ChallengeHelper$requireAuthUrl$1(this, continuationImpl);
        Object obj2 = challengeHelper$requireAuthUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = challengeHelper$requireAuthUrl$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (value instanceof Result.Failure) {
        }
        bVar = (com.yandex.passport.common.url.b) value;
        if (bVar != null) {
        }
        return null;
    }
}
