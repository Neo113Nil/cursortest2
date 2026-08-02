package com.yandex.passport.internal.usecase;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ebs.BiometricAuthSdkProperties;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.network.qc;
import com.yandex.passport.data.network.vc;
import com.yandex.passport.data.network.wc;
import com.yandex.passport.data.network.xc;
import com.yandex.passport.data.network.zc;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.a4;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.yd;
import defpackage.ny61;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes15.dex */
public final class l1 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.d b;
    public final zc c;
    public final com.yandex.passport.internal.network.mappers.b d;
    public final com.yandex.passport.internal.config.j e;
    public final com.yandex.passport.internal.report.reporters.v f;

    public l1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.d dVar, zc zcVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.config.j jVar, com.yandex.passport.internal.report.reporters.v vVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = dVar;
        this.c = zcVar;
        this.d = bVar;
        this.e = jVar;
        this.f = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4 A[Catch: all -> 0x00ae, TimeoutCancellationException -> 0x00b1, CancellationException -> 0x01bd, TryCatch #0 {CancellationException -> 0x01bd, blocks: (B:12:0x0036, B:14:0x009a, B:16:0x00a4, B:18:0x00aa, B:19:0x00b5, B:21:0x00c1, B:23:0x00c8, B:25:0x00cf, B:26:0x00d6, B:31:0x00ea, B:33:0x00f3, B:34:0x00f7, B:36:0x00fb, B:38:0x0108, B:39:0x0140, B:41:0x014a, B:42:0x0165, B:43:0x0111, B:44:0x019e, B:45:0x01a3, B:47:0x00e1, B:50:0x01a4, B:51:0x01a9, B:56:0x01aa, B:74:0x0058, B:76:0x0071, B:79:0x01b0, B:80:0x01b5), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(k1 k1Var, ContinuationImpl continuationImpl) {
        StartBiometricSessionUseCase$run$1 startBiometricSessionUseCase$run$1;
        int i;
        Result.Failure failure;
        Object obj;
        Throwable a;
        Object value;
        String str;
        Uri build;
        Uri uri;
        l1 l1Var = this;
        k1 k1Var2 = k1Var;
        try {
            if (continuationImpl instanceof StartBiometricSessionUseCase$run$1) {
                startBiometricSessionUseCase$run$1 = (StartBiometricSessionUseCase$run$1) continuationImpl;
                int i2 = startBiometricSessionUseCase$run$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    startBiometricSessionUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = startBiometricSessionUseCase$run$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = startBiometricSessionUseCase$run$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        try {
                            com.yandex.passport.internal.report.reporters.v vVar = l1Var.f;
                            Uid uid = k1Var2.a;
                            String str2 = k1Var2.d;
                            String str3 = k1Var2.c;
                            vVar.q(uid, k1Var2.b, str3, str2);
                            ModernAccount e = l1Var.b.a().e(uid);
                            if (e == null) {
                                throw new PassportAccountNotFoundException(uid);
                            }
                            zc zcVar = l1Var.c;
                            MasterToken masterToken = e.getMasterToken();
                            com.yandex.passport.internal.network.mappers.b bVar = l1Var.d;
                            Environment environment = e.getUid().getEnvironment();
                            bVar.getClass();
                            qc qcVar = new qc(masterToken, str3, str2, com.yandex.passport.internal.network.mappers.b.a(environment));
                            startBiometricSessionUseCase$run$1.L$0 = l1Var;
                            startBiometricSessionUseCase$run$1.L$1 = k1Var2;
                            startBiometricSessionUseCase$run$1.label = 1;
                            obj2 = zcVar.a(qcVar, startBiometricSessionUseCase$run$1);
                            if (obj2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a != null) {
                            }
                            return new Result(obj);
                        } catch (Throwable th) {
                            th = th;
                            failure = new Result.Failure(th);
                            obj = failure;
                            a = Result.a(obj);
                            if (a != null) {
                            }
                            return new Result(obj);
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k1 k1Var3 = (k1) startBiometricSessionUseCase$run$1.L$1;
                        l1 l1Var2 = (l1) startBiometricSessionUseCase$run$1.L$0;
                        try {
                            kotlin.b.b(obj2);
                            k1Var2 = k1Var3;
                            l1Var = l1Var2;
                        } catch (TimeoutCancellationException e3) {
                            e = e3;
                            k1Var2 = k1Var3;
                            l1Var = l1Var2;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a != null) {
                            }
                            return new Result(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            k1Var2 = k1Var3;
                            l1Var = l1Var2;
                            failure = new Result.Failure(th);
                            obj = failure;
                            a = Result.a(obj);
                            if (a != null) {
                            }
                            return new Result(obj);
                        }
                    }
                    value = ((Result) obj2).getValue();
                    if (!(value instanceof Result.Failure)) {
                        xc xcVar = (xc) value;
                        wc wcVar = xcVar instanceof wc ? (wc) xcVar : null;
                        com.yandex.passport.internal.report.reporters.v vVar2 = l1Var.f;
                        com.yandex.passport.internal.config.j jVar = l1Var.e;
                        Uid uid2 = k1Var2.a;
                        String str4 = k1Var2.c;
                        String str5 = k1Var2.b;
                        String str6 = wcVar != null ? wcVar.b : null;
                        String str7 = wcVar != null ? wcVar.c : null;
                        String str8 = wcVar != null ? wcVar.e : null;
                        boolean z = xcVar instanceof wc;
                        vc vcVar = vc.a;
                        if (z) {
                            str = "success";
                        } else {
                            if (!xcVar.equals(vcVar)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "biometrics_ebs.tib_user_access_denied";
                        }
                        vVar2.r(uid2, str5, str4, str6, str7, str8, str);
                        if (xcVar.equals(vcVar)) {
                            value = com.yandex.passport.common.ebs.u.a;
                        } else {
                            if (!(xcVar instanceof wc)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Environment environment2 = k1Var2.a.getEnvironment();
                            String str9 = ((wc) xcVar).e;
                            if (str9 == null) {
                                uri = jVar.a(environment2);
                                build = jVar.e(environment2);
                            } else {
                                Uri build2 = new Uri.Builder().scheme(Constants.SCHEME).authority(str9).path("/1/bundle/biometrics/ebs").build();
                                build = new Uri.Builder().scheme(Constants.SCHEME).authority(str9).path("/servlets/api/v2").build();
                                uri = build2;
                            }
                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Build urls for EBS: consumerApiUri=" + uri + ", tibUri=" + build, 8);
                            }
                            value = new com.yandex.passport.common.ebs.v(new BiometricAuthSdkProperties(jVar.b(environment2), build.toString(), uri.toString(), jVar.d(environment2), ((wc) xcVar).a, ((wc) xcVar).b, ((wc) xcVar).c, ((wc) xcVar).d, str4));
                        }
                    }
                    kotlin.b.b(value);
                    obj = (com.yandex.passport.common.ebs.w) value;
                    a = Result.a(obj);
                    if (a != null) {
                        com.yandex.passport.internal.report.reporters.v vVar3 = l1Var.f;
                        Uid uid3 = k1Var2.a;
                        String str10 = k1Var2.b;
                        String str11 = k1Var2.c;
                        String message = a.getMessage();
                        vVar3.getClass();
                        vVar3.f(a4.w, new jd(Long.valueOf(uid3.getValue())), new com.yandex.passport.internal.report.a(str10, 6, false), new yd(str11, 11), new com.yandex.passport.internal.report.a(message, 25));
                    }
                    return new Result(obj);
                }
            }
            if (i != 0) {
            }
            value = ((Result) obj2).getValue();
            if (!(value instanceof Result.Failure)) {
            }
            kotlin.b.b(value);
            obj = (com.yandex.passport.common.ebs.w) value;
            a = Result.a(obj);
            if (a != null) {
            }
            return new Result(obj);
        } catch (CancellationException e4) {
            throw e4;
        }
        startBiometricSessionUseCase$run$1 = new StartBiometricSessionUseCase$run$1(l1Var, continuationImpl);
        Object obj22 = startBiometricSessionUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startBiometricSessionUseCase$run$1.label;
    }
}
