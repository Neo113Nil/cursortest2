package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.api.exception.PassportFailedResponseException;
import com.yandex.passport.api.exception.PassportInvalidAccountTypeException;
import com.yandex.passport.api.exception.PassportUpdateInfoNeededException;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.exceptions.BackendErrorException;
import com.yandex.passport.data.exceptions.InvalidTrackException;
import com.yandex.passport.data.network.ra;
import com.yandex.passport.data.network.ta;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.entities.ClientToken;
import com.yandex.passport.internal.report.g9;
import com.yandex.passport.internal.report.l9;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.ui.domik.DomikResult;
import com.yandex.passport.internal.ui.domik.DomikResultImpl;
import com.yandex.passport.internal.ui.domik.FinishRegistrationActivities;
import defpackage.ny61;
import java.io.IOException;
import java.io.Serializable;
import java.util.EnumSet;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class x0 extends com.yandex.passport.common.domain.a {
    public final ta b;
    public final com.yandex.passport.internal.network.mappers.b c;
    public final com.yandex.passport.internal.report.reporters.p0 d;
    public final com.yandex.passport.internal.usecase.h0 e;
    public final com.yandex.passport.internal.methods.performer.error.a f;
    public final com.yandex.passport.internal.usecase.n g;

    public x0(com.yandex.passport.common.coroutine.a aVar, ta taVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.report.reporters.p0 p0Var, com.yandex.passport.internal.usecase.h0 h0Var, com.yandex.passport.internal.methods.performer.error.a aVar2, com.yandex.passport.internal.usecase.n nVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = taVar;
        this.c = bVar;
        this.d = p0Var;
        this.e = h0Var;
        this.f = aVar2;
        this.g = nVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0095  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(w0 w0Var, ContinuationImpl continuationImpl) {
        UpgradePhonishUseCase$run$1 upgradePhonishUseCase$run$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object obj2;
        Object obj3;
        w0 w0Var2;
        Object obj4;
        com.yandex.passport.internal.ui.domik.o oVar;
        ModernAccount modernAccount;
        Object obj5;
        Object failure;
        w0 w0Var3;
        Throwable a;
        String message;
        Throwable a2;
        Object value;
        Object a3;
        AnalyticsFromValue analyticsFromValue;
        x0 x0Var = this;
        w0 w0Var4 = w0Var;
        try {
            try {
                if (continuationImpl instanceof UpgradePhonishUseCase$run$1) {
                    upgradePhonishUseCase$run$1 = (UpgradePhonishUseCase$run$1) continuationImpl;
                    int i2 = upgradePhonishUseCase$run$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        upgradePhonishUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                        obj = upgradePhonishUseCase$run$1.result;
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = upgradePhonishUseCase$run$1.label;
                        if (i == 0) {
                            try {
                            } catch (TimeoutCancellationException e) {
                                e = e;
                                obj3 = x0Var;
                                x0Var = w0Var4;
                            } catch (Throwable th) {
                                th = th;
                                obj2 = x0Var;
                                x0Var = w0Var4;
                            }
                            if (i != 1) {
                                if (i == 2) {
                                    Object obj6 = (w0) upgradePhonishUseCase$run$1.L$1;
                                    x0 x0Var2 = (x0) upgradePhonishUseCase$run$1.L$0;
                                    try {
                                        kotlin.b.b(obj);
                                        obj4 = obj6;
                                        x0Var = x0Var2;
                                        Object value2 = ((Result) obj).getValue();
                                        kotlin.b.b(value2);
                                        ModernAccount modernAccount2 = (ModernAccount) value2;
                                        oVar = DomikResult.Companion;
                                        com.yandex.passport.internal.usecase.h0 h0Var = x0Var.e;
                                        com.yandex.passport.internal.usecase.g0 g0Var = new com.yandex.passport.internal.usecase.g0(modernAccount2, (ClientCredentials) null, 6);
                                        upgradePhonishUseCase$run$1.L$0 = x0Var;
                                        upgradePhonishUseCase$run$1.L$1 = obj4;
                                        upgradePhonishUseCase$run$1.L$2 = modernAccount2;
                                        upgradePhonishUseCase$run$1.L$3 = oVar;
                                        upgradePhonishUseCase$run$1.label = 3;
                                        a3 = h0Var.a(g0Var, upgradePhonishUseCase$run$1);
                                        if (a3 != coroutineSingletons) {
                                            modernAccount = modernAccount2;
                                            obj = a3;
                                            obj5 = obj4;
                                            value = ((Result) obj).getValue();
                                            if (value instanceof Result.Failure) {
                                            }
                                            PassportLoginAction passportLoginAction = PassportLoginAction.REG_NEO_PHONISH;
                                            EnumSet of = EnumSet.of(FinishRegistrationActivities.SKIP_VERIFY);
                                            oVar.getClass();
                                            failure = new DomikResultImpl(modernAccount, (ClientToken) value, passportLoginAction, null, of, 8, null);
                                            w0Var3 = obj5;
                                            a = Result.a(failure);
                                            if (a != null) {
                                            }
                                            if (!(failure instanceof Result.Failure)) {
                                            }
                                            a2 = Result.a(failure);
                                            if (a2 != null) {
                                            }
                                            return new Result(failure);
                                        }
                                        return coroutineSingletons;
                                    } catch (IOException unused) {
                                        throw new PassportUpdateInfoNeededException();
                                    }
                                }
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                com.yandex.passport.internal.ui.domik.o oVar2 = (com.yandex.passport.internal.ui.domik.o) upgradePhonishUseCase$run$1.L$3;
                                ModernAccount modernAccount3 = (ModernAccount) upgradePhonishUseCase$run$1.L$2;
                                Object obj7 = (w0) upgradePhonishUseCase$run$1.L$1;
                                x0 x0Var3 = (x0) upgradePhonishUseCase$run$1.L$0;
                                try {
                                    kotlin.b.b(obj);
                                    oVar = oVar2;
                                    modernAccount = modernAccount3;
                                    x0Var = x0Var3;
                                    obj5 = obj7;
                                    value = ((Result) obj).getValue();
                                    if (value instanceof Result.Failure) {
                                        value = null;
                                    }
                                    PassportLoginAction passportLoginAction2 = PassportLoginAction.REG_NEO_PHONISH;
                                    EnumSet of2 = EnumSet.of(FinishRegistrationActivities.SKIP_VERIFY);
                                    oVar.getClass();
                                    failure = new DomikResultImpl(modernAccount, (ClientToken) value, passportLoginAction2, null, of2, 8, null);
                                    w0Var3 = obj5;
                                } catch (TimeoutCancellationException e2) {
                                    e = e2;
                                    x0Var = x0Var3;
                                    obj3 = obj7;
                                    failure = new Result.Failure(e);
                                    w0Var3 = obj3;
                                    a = Result.a(failure);
                                    if (a != null) {
                                    }
                                    if (!(failure instanceof Result.Failure)) {
                                    }
                                    a2 = Result.a(failure);
                                    if (a2 != null) {
                                    }
                                    return new Result(failure);
                                } catch (Throwable th2) {
                                    th = th2;
                                    x0Var = x0Var3;
                                    obj2 = obj7;
                                    failure = new Result.Failure(th);
                                    w0Var3 = obj2;
                                    a = Result.a(failure);
                                    if (a != null) {
                                    }
                                    if (!(failure instanceof Result.Failure)) {
                                    }
                                    a2 = Result.a(failure);
                                    if (a2 != null) {
                                    }
                                    return new Result(failure);
                                }
                                a = Result.a(failure);
                                if (a != null) {
                                    try {
                                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "failed upgradePhonish recover " + a, 8);
                                        }
                                        if (((a instanceof BackendErrorException) || (a instanceof InvalidTrackException)) && (message = a.getMessage()) != null) {
                                            switch (message.hashCode()) {
                                                case -2032788365:
                                                    if (!message.equals("phone.not_confirmed")) {
                                                        break;
                                                    }
                                                    throw new InvalidTrackException("phone.not_confirmed");
                                                case -1077806184:
                                                    if (!message.equals("track_id.invalid")) {
                                                        break;
                                                    }
                                                    throw new InvalidTrackException("phone.not_confirmed");
                                                case -842521834:
                                                    if (!message.equals("backend.blackbox_failed")) {
                                                        break;
                                                    }
                                                    throw new InvalidTrackException("phone.not_confirmed");
                                                case 1387350691:
                                                    if (!message.equals("account.invalid_type")) {
                                                        break;
                                                    } else {
                                                        throw new PassportInvalidAccountTypeException();
                                                    }
                                            }
                                        }
                                        com.yandex.passport.internal.methods.performer.error.a aVar = x0Var.f;
                                        String message2 = a.getMessage();
                                        if (message2 == null) {
                                            message2 = "";
                                        }
                                        throw com.yandex.passport.internal.methods.performer.error.a.a(aVar, a, null, new PassportFailedResponseException(message2), null, null, null, 58);
                                    } catch (Throwable th3) {
                                        failure = new Result.Failure(th3);
                                    }
                                }
                                if (!(failure instanceof Result.Failure)) {
                                    com.yandex.passport.internal.report.reporters.p0 p0Var = x0Var.d;
                                    Uid uid = w0Var3.a;
                                    p0Var.getClass();
                                    p0Var.f(l9.w, new yd(uid));
                                }
                                a2 = Result.a(failure);
                                if (a2 != null) {
                                    com.yandex.passport.internal.report.reporters.p0 p0Var2 = x0Var.d;
                                    Uid uid2 = w0Var3.a;
                                    p0Var2.getClass();
                                    p0Var2.f(g9.w, new yd(uid2), new yd(a2));
                                }
                                return new Result(failure);
                            }
                            w0 w0Var5 = (w0) upgradePhonishUseCase$run$1.L$1;
                            x0 x0Var4 = (x0) upgradePhonishUseCase$run$1.L$0;
                            kotlin.b.b(obj);
                            w0Var2 = w0Var5;
                            x0Var = x0Var4;
                        } else {
                            kotlin.b.b(obj);
                            try {
                                x0Var.d.j(w0Var4.a);
                                ta taVar = x0Var.b;
                                com.yandex.passport.internal.network.mappers.b bVar = x0Var.c;
                                Environment environment = w0Var4.a.getEnvironment();
                                bVar.getClass();
                                ra raVar = new ra(com.yandex.passport.internal.network.mappers.b.a(environment), w0Var4.b.getNonNullValueOrThrow(), w0Var4.c, w0Var4.d, w0Var4.e);
                                upgradePhonishUseCase$run$1.L$0 = x0Var;
                                upgradePhonishUseCase$run$1.L$1 = w0Var4;
                                upgradePhonishUseCase$run$1.label = 1;
                                obj = taVar.a(raVar, upgradePhonishUseCase$run$1);
                                w0Var2 = w0Var4;
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } catch (TimeoutCancellationException e3) {
                                e = e3;
                                obj3 = w0Var4;
                                failure = new Result.Failure(e);
                                w0Var3 = obj3;
                                a = Result.a(failure);
                                if (a != null) {
                                }
                                if (!(failure instanceof Result.Failure)) {
                                }
                                a2 = Result.a(failure);
                                if (a2 != null) {
                                }
                                return new Result(failure);
                            } catch (Throwable th4) {
                                th = th4;
                                obj2 = w0Var4;
                                failure = new Result.Failure(th);
                                w0Var3 = obj2;
                                a = Result.a(failure);
                                if (a != null) {
                                }
                                if (!(failure instanceof Result.Failure)) {
                                }
                                a2 = Result.a(failure);
                                if (a2 != null) {
                                }
                                return new Result(failure);
                            }
                        }
                        kotlin.b.b(((Result) obj).getValue());
                        com.yandex.passport.internal.usecase.n nVar = x0Var.g;
                        Environment environment2 = w0Var2.a.getEnvironment();
                        MasterToken masterToken = w0Var2.b;
                        AnalyticsFromValue.Companion.getClass();
                        analyticsFromValue = AnalyticsFromValue.UPDATE_PHONISH;
                        com.yandex.passport.internal.usecase.o oVar3 = new com.yandex.passport.internal.usecase.o(environment2, 0L, masterToken, null, analyticsFromValue);
                        upgradePhonishUseCase$run$1.L$0 = x0Var;
                        upgradePhonishUseCase$run$1.L$1 = w0Var2;
                        upgradePhonishUseCase$run$1.label = 2;
                        obj = nVar.a(oVar3, upgradePhonishUseCase$run$1);
                        obj4 = w0Var2;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        Object value22 = ((Result) obj).getValue();
                        kotlin.b.b(value22);
                        ModernAccount modernAccount22 = (ModernAccount) value22;
                        oVar = DomikResult.Companion;
                        com.yandex.passport.internal.usecase.h0 h0Var2 = x0Var.e;
                        com.yandex.passport.internal.usecase.g0 g0Var2 = new com.yandex.passport.internal.usecase.g0(modernAccount22, (ClientCredentials) null, 6);
                        upgradePhonishUseCase$run$1.L$0 = x0Var;
                        upgradePhonishUseCase$run$1.L$1 = obj4;
                        upgradePhonishUseCase$run$1.L$2 = modernAccount22;
                        upgradePhonishUseCase$run$1.L$3 = oVar;
                        upgradePhonishUseCase$run$1.label = 3;
                        a3 = h0Var2.a(g0Var2, upgradePhonishUseCase$run$1);
                        if (a3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                }
                com.yandex.passport.internal.usecase.n nVar2 = x0Var.g;
                Environment environment22 = w0Var2.a.getEnvironment();
                MasterToken masterToken2 = w0Var2.b;
                AnalyticsFromValue.Companion.getClass();
                analyticsFromValue = AnalyticsFromValue.UPDATE_PHONISH;
                com.yandex.passport.internal.usecase.o oVar32 = new com.yandex.passport.internal.usecase.o(environment22, 0L, masterToken2, null, analyticsFromValue);
                upgradePhonishUseCase$run$1.L$0 = x0Var;
                upgradePhonishUseCase$run$1.L$1 = w0Var2;
                upgradePhonishUseCase$run$1.label = 2;
                obj = nVar2.a(oVar32, upgradePhonishUseCase$run$1);
                obj4 = w0Var2;
                if (obj == coroutineSingletons) {
                }
                Object value222 = ((Result) obj).getValue();
                kotlin.b.b(value222);
                ModernAccount modernAccount222 = (ModernAccount) value222;
                oVar = DomikResult.Companion;
                com.yandex.passport.internal.usecase.h0 h0Var22 = x0Var.e;
                com.yandex.passport.internal.usecase.g0 g0Var22 = new com.yandex.passport.internal.usecase.g0(modernAccount222, (ClientCredentials) null, 6);
                upgradePhonishUseCase$run$1.L$0 = x0Var;
                upgradePhonishUseCase$run$1.L$1 = obj4;
                upgradePhonishUseCase$run$1.L$2 = modernAccount222;
                upgradePhonishUseCase$run$1.L$3 = oVar;
                upgradePhonishUseCase$run$1.label = 3;
                a3 = h0Var22.a(g0Var22, upgradePhonishUseCase$run$1);
                if (a3 != coroutineSingletons) {
                }
                return coroutineSingletons;
            } catch (IOException unused2) {
                throw new PassportUpdateInfoNeededException();
            }
            if (i == 0) {
            }
            kotlin.b.b(((Result) obj).getValue());
        } catch (CancellationException e4) {
            throw e4;
        }
        upgradePhonishUseCase$run$1 = new UpgradePhonishUseCase$run$1(x0Var, continuationImpl);
        obj = upgradePhonishUseCase$run$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradePhonishUseCase$run$1.label;
    }
}
