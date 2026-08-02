package com.yandex.passport.internal.autologin.ui;

import android.content.Context;
import com.yandex.passport.api.a0;
import com.yandex.passport.api.exception.PassportAutoLoginImpossibleException;
import com.yandex.passport.api.exception.PassportAutoLoginRetryRequiredException;
import com.yandex.passport.api.exception.PassportIOException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.entities.UserCredentials;
import com.yandex.passport.internal.properties.AutoLoginProperties;
import com.yandex.passport.internal.report.j1;
import com.yandex.passport.internal.sloth.credentialmanager.GoogleCredentialManagerImpl$Companion$CredentialManagerPlace;
import defpackage.bvf0;
import defpackage.eyc;
import defpackage.fyc;
import defpackage.g6u;
import defpackage.gw00;
import defpackage.gwk0;
import defpackage.lz40;
import defpackage.m50;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.zy11;
import io.appmetrica.analytics.IReporterYandex;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes15.dex */
public final class e {
    public final com.yandex.passport.internal.impl.i a;
    public final IReporterYandex b;

    public e(com.yandex.passport.internal.impl.i iVar, IReporterYandex iReporterYandex) {
        this.a = iVar;
        this.b = iReporterYandex;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, com.yandex.passport.internal.sloth.credentialmanager.a aVar, AutoLoginProperties autoLoginProperties, ContinuationImpl continuationImpl) {
        KAutoLoginClientHelper$authorizeByCredentials$1 kAutoLoginClientHelper$authorizeByCredentials$1;
        int i;
        UserCredentials userCredentials;
        AutoLoginProperties autoLoginProperties2;
        Context context2;
        Object k;
        AutoLoginProperties autoLoginProperties3;
        try {
            if (continuationImpl instanceof KAutoLoginClientHelper$authorizeByCredentials$1) {
                kAutoLoginClientHelper$authorizeByCredentials$1 = (KAutoLoginClientHelper$authorizeByCredentials$1) continuationImpl;
                int i2 = kAutoLoginClientHelper$authorizeByCredentials$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kAutoLoginClientHelper$authorizeByCredentials$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kAutoLoginClientHelper$authorizeByCredentials$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kAutoLoginClientHelper$authorizeByCredentials$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        userCredentials = new UserCredentials(autoLoginProperties.getFilter().getPrimaryEnvironment(), aVar.b, aVar.c, null, 8, null);
                        try {
                            com.yandex.passport.internal.impl.i iVar = this.a;
                            kAutoLoginClientHelper$authorizeByCredentials$1.L$0 = this;
                            kAutoLoginClientHelper$authorizeByCredentials$1.L$1 = context;
                            autoLoginProperties2 = autoLoginProperties;
                            try {
                                kAutoLoginClientHelper$authorizeByCredentials$1.L$2 = autoLoginProperties2;
                                kAutoLoginClientHelper$authorizeByCredentials$1.L$3 = userCredentials;
                                kAutoLoginClientHelper$authorizeByCredentials$1.label = 1;
                                k = iVar.k(userCredentials, kAutoLoginClientHelper$authorizeByCredentials$1);
                                if (k == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                context2 = context;
                                autoLoginProperties3 = autoLoginProperties2;
                            } catch (PassportIOException e) {
                                e = e;
                                context2 = context;
                                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Network problem", e);
                                }
                                throw new PassportAutoLoginRetryRequiredException(((com.yandex.passport.internal.impl.j) this.a.c.getValue()).p(context2, autoLoginProperties2, userCredentials, true));
                            } catch (Exception e2) {
                                e = e2;
                                context2 = context;
                                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Other problem", e);
                                }
                                throw new PassportAutoLoginRetryRequiredException(((com.yandex.passport.internal.impl.j) this.a.c.getValue()).p(context2, autoLoginProperties2, userCredentials, false));
                            }
                        } catch (PassportIOException e3) {
                            e = e3;
                            autoLoginProperties2 = autoLoginProperties;
                        } catch (Exception e4) {
                            e = e4;
                            autoLoginProperties2 = autoLoginProperties;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        UserCredentials userCredentials2 = (UserCredentials) kAutoLoginClientHelper$authorizeByCredentials$1.L$3;
                        autoLoginProperties3 = (AutoLoginProperties) kAutoLoginClientHelper$authorizeByCredentials$1.L$2;
                        Context context3 = (Context) kAutoLoginClientHelper$authorizeByCredentials$1.L$1;
                        e eVar = (e) kAutoLoginClientHelper$authorizeByCredentials$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            k = ((Result) obj).getValue();
                            userCredentials = userCredentials2;
                            this = eVar;
                            context2 = context3;
                        } catch (PassportIOException e5) {
                            e = e5;
                            userCredentials = userCredentials2;
                            this = eVar;
                            context2 = context3;
                            autoLoginProperties2 = autoLoginProperties3;
                            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            }
                            throw new PassportAutoLoginRetryRequiredException(((com.yandex.passport.internal.impl.j) this.a.c.getValue()).p(context2, autoLoginProperties2, userCredentials, true));
                        } catch (Exception e6) {
                            e = e6;
                            userCredentials = userCredentials2;
                            this = eVar;
                            context2 = context3;
                            autoLoginProperties2 = autoLoginProperties3;
                            com.yandex.passport.common.logger.c cVar22 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            }
                            throw new PassportAutoLoginRetryRequiredException(((com.yandex.passport.internal.impl.j) this.a.c.getValue()).p(context2, autoLoginProperties2, userCredentials, false));
                        }
                    }
                    kotlin.b.b(k);
                    return (com.yandex.passport.api.i) k;
                }
            }
            kotlin.b.b(k);
            return (com.yandex.passport.api.i) k;
        } catch (PassportIOException e7) {
            e = e7;
            autoLoginProperties2 = autoLoginProperties3;
            com.yandex.passport.common.logger.c cVar32 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            }
            throw new PassportAutoLoginRetryRequiredException(((com.yandex.passport.internal.impl.j) this.a.c.getValue()).p(context2, autoLoginProperties2, userCredentials, true));
        } catch (Exception e8) {
            e = e8;
            autoLoginProperties2 = autoLoginProperties3;
            com.yandex.passport.common.logger.c cVar222 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            }
            throw new PassportAutoLoginRetryRequiredException(((com.yandex.passport.internal.impl.j) this.a.c.getValue()).p(context2, autoLoginProperties2, userCredentials, false));
        }
        kAutoLoginClientHelper$authorizeByCredentials$1 = new KAutoLoginClientHelper$authorizeByCredentials$1(this, continuationImpl);
        Object obj2 = kAutoLoginClientHelper$authorizeByCredentials$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kAutoLoginClientHelper$authorizeByCredentials$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, ContinuationImpl continuationImpl) {
        KAutoLoginClientHelper$checkAvailableCredentialManager$1 kAutoLoginClientHelper$checkAvailableCredentialManager$1;
        int i;
        Object x;
        if (continuationImpl instanceof KAutoLoginClientHelper$checkAvailableCredentialManager$1) {
            kAutoLoginClientHelper$checkAvailableCredentialManager$1 = (KAutoLoginClientHelper$checkAvailableCredentialManager$1) continuationImpl;
            int i2 = kAutoLoginClientHelper$checkAvailableCredentialManager$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kAutoLoginClientHelper$checkAvailableCredentialManager$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kAutoLoginClientHelper$checkAvailableCredentialManager$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kAutoLoginClientHelper$checkAvailableCredentialManager$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kAutoLoginClientHelper$checkAvailableCredentialManager$1.L$0 = this;
                    kAutoLoginClientHelper$checkAvailableCredentialManager$1.L$1 = context;
                    kAutoLoginClientHelper$checkAvailableCredentialManager$1.label = 1;
                    x = this.a.x(kAutoLoginClientHelper$checkAvailableCredentialManager$1);
                    if (x == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = (Context) kAutoLoginClientHelper$checkAvailableCredentialManager$1.L$1;
                    this = (e) kAutoLoginClientHelper$checkAvailableCredentialManager$1.L$0;
                    kotlin.b.b(obj);
                    x = ((Result) obj).getValue();
                }
                Boolean bool = Boolean.TRUE;
                if (x instanceof Result.Failure) {
                    x = bool;
                }
                if (!((Boolean) x).booleanValue()) {
                    this.b.reportEvent(j1.w.toString(), gw00.e(new Pair("error", "Credential Manager disabled for autologin")));
                    throw new PassportAutoLoginImpossibleException("Credential Manager disabled for autologin");
                }
                if (com.yandex.passport.common.util.a.c(context)) {
                    return zy11.a;
                }
                this.b.reportEvent(j1.w.toString(), gw00.e(new Pair("error", "Google play services not available")));
                throw new PassportAutoLoginImpossibleException("Google play services not available");
            }
        }
        kAutoLoginClientHelper$checkAvailableCredentialManager$1 = new KAutoLoginClientHelper$checkAvailableCredentialManager$1(this, continuationImpl);
        Object obj2 = kAutoLoginClientHelper$checkAvailableCredentialManager$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kAutoLoginClientHelper$checkAvailableCredentialManager$1.label;
        if (i != 0) {
        }
        Boolean bool2 = Boolean.TRUE;
        if (x instanceof Result.Failure) {
        }
        if (!((Boolean) x).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r6 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Context context, com.yandex.passport.internal.sloth.credentialmanager.a aVar, a0 a0Var, ContinuationImpl continuationImpl) {
        KAutoLoginClientHelper$makeAutoLoginResult$1 kAutoLoginClientHelper$makeAutoLoginResult$1;
        int i;
        Object C;
        Object failure;
        try {
            if (continuationImpl instanceof KAutoLoginClientHelper$makeAutoLoginResult$1) {
                kAutoLoginClientHelper$makeAutoLoginResult$1 = (KAutoLoginClientHelper$makeAutoLoginResult$1) continuationImpl;
                int i2 = kAutoLoginClientHelper$makeAutoLoginResult$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kAutoLoginClientHelper$makeAutoLoginResult$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kAutoLoginClientHelper$makeAutoLoginResult$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kAutoLoginClientHelper$makeAutoLoginResult$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        AutoLoginProperties.Companion.getClass();
                        AutoLoginProperties b = com.yandex.passport.internal.properties.e.b(a0Var);
                        kAutoLoginClientHelper$makeAutoLoginResult$1.L$0 = a0Var;
                        kAutoLoginClientHelper$makeAutoLoginResult$1.L$1 = this;
                        kAutoLoginClientHelper$makeAutoLoginResult$1.label = 1;
                        if (a(context, aVar, b, kAutoLoginClientHelper$makeAutoLoginResult$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            C = ((Result) obj).getValue();
                            if (!(C instanceof Result.Failure)) {
                                try {
                                    failure = new com.yandex.passport.internal.entities.a((com.yandex.passport.api.i) C, false);
                                } catch (Throwable th) {
                                    failure = new Result.Failure(th);
                                }
                                C = failure;
                            }
                            kotlin.b.b(C);
                            return (com.yandex.passport.internal.entities.a) C;
                        }
                        this = (e) kAutoLoginClientHelper$makeAutoLoginResult$1.L$1;
                        a0Var = (a0) kAutoLoginClientHelper$makeAutoLoginResult$1.L$0;
                        kotlin.b.b(obj);
                    }
                    com.yandex.passport.internal.impl.i iVar = this.a;
                    kAutoLoginClientHelper$makeAutoLoginResult$1.L$0 = null;
                    kAutoLoginClientHelper$makeAutoLoginResult$1.L$1 = null;
                    kAutoLoginClientHelper$makeAutoLoginResult$1.label = 2;
                    C = iVar.C(a0Var, kAutoLoginClientHelper$makeAutoLoginResult$1);
                }
            }
            if (i != 0) {
            }
            com.yandex.passport.internal.impl.i iVar2 = this.a;
            kAutoLoginClientHelper$makeAutoLoginResult$1.L$0 = null;
            kAutoLoginClientHelper$makeAutoLoginResult$1.L$1 = null;
            kAutoLoginClientHelper$makeAutoLoginResult$1.label = 2;
            C = iVar2.C(a0Var, kAutoLoginClientHelper$makeAutoLoginResult$1);
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
        kAutoLoginClientHelper$makeAutoLoginResult$1 = new KAutoLoginClientHelper$makeAutoLoginResult$1(this, continuationImpl);
        Object obj2 = kAutoLoginClientHelper$makeAutoLoginResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kAutoLoginClientHelper$makeAutoLoginResult$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(a0 a0Var, ContinuationImpl continuationImpl) {
        KAutoLoginClientHelper$tryAutoLogin$1 kAutoLoginClientHelper$tryAutoLogin$1;
        int i;
        Object C;
        try {
            if (continuationImpl instanceof KAutoLoginClientHelper$tryAutoLogin$1) {
                kAutoLoginClientHelper$tryAutoLogin$1 = (KAutoLoginClientHelper$tryAutoLogin$1) continuationImpl;
                int i2 = kAutoLoginClientHelper$tryAutoLogin$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kAutoLoginClientHelper$tryAutoLogin$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kAutoLoginClientHelper$tryAutoLogin$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kAutoLoginClientHelper$tryAutoLogin$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        com.yandex.passport.internal.impl.i iVar = this.a;
                        kAutoLoginClientHelper$tryAutoLogin$1.L$0 = this;
                        kAutoLoginClientHelper$tryAutoLogin$1.label = 1;
                        C = iVar.C(a0Var, kAutoLoginClientHelper$tryAutoLogin$1);
                        if (C == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (e) kAutoLoginClientHelper$tryAutoLogin$1.L$0;
                        kotlin.b.b(obj);
                        C = ((Result) obj).getValue();
                    }
                    kotlin.b.b(C);
                    return new com.yandex.passport.internal.entities.a((com.yandex.passport.api.i) C, true);
                }
            }
            if (i != 0) {
            }
            kotlin.b.b(C);
            return new com.yandex.passport.internal.entities.a((com.yandex.passport.api.i) C, true);
        } catch (PassportAutoLoginImpossibleException e) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Can't auto login:", e);
            }
            this.b.reportEvent(j1.w.toString(), gw00.e(new Pair("error", e.getMessage())));
            return null;
        }
        kAutoLoginClientHelper$tryAutoLogin$1 = new KAutoLoginClientHelper$tryAutoLogin$1(this, continuationImpl);
        Object obj2 = kAutoLoginClientHelper$tryAutoLogin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kAutoLoginClientHelper$tryAutoLogin$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r0 == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[Catch: all -> 0x0083, CancellationException -> 0x008b, TimeoutCancellationException -> 0x008e, TryCatch #2 {TimeoutCancellationException -> 0x008e, CancellationException -> 0x008b, all -> 0x0083, blocks: (B:12:0x0029, B:13:0x0080, B:20:0x004b, B:22:0x0069, B:24:0x006d, B:29:0x0056), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Type inference failed for: r11v4, types: [lz40] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Context context, a0 a0Var, m50 m50Var, n0 n0Var, ContinuationImpl continuationImpl) {
        KAutoLoginClientHelper$tryAutoLoginForBelow34Api$1 kAutoLoginClientHelper$tryAutoLoginForBelow34Api$1;
        int i;
        n0 n0Var2;
        com.yandex.passport.internal.entities.a aVar;
        try {
            if (continuationImpl instanceof KAutoLoginClientHelper$tryAutoLoginForBelow34Api$1) {
                kAutoLoginClientHelper$tryAutoLoginForBelow34Api$1 = (KAutoLoginClientHelper$tryAutoLoginForBelow34Api$1) continuationImpl;
                int i2 = kAutoLoginClientHelper$tryAutoLoginForBelow34Api$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kAutoLoginClientHelper$tryAutoLoginForBelow34Api$1.label = i2 - Integer.MIN_VALUE;
                    KAutoLoginClientHelper$tryAutoLoginForBelow34Api$1 kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12 = kAutoLoginClientHelper$tryAutoLoginForBelow34Api$1;
                    Object obj = kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.L$0 = this;
                        kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.L$1 = context;
                        kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.L$2 = a0Var;
                        kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.L$3 = m50Var;
                        kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.L$4 = n0Var;
                        kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.label = 1;
                        obj = d(a0Var, kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12);
                        n0Var2 = n0Var;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                kotlin.b.b(obj);
                                return (com.yandex.passport.internal.entities.a) obj;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r11 = (lz40) kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.L$4;
                        m50Var = (m50) kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.L$3;
                        a0Var = (a0) kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.L$2;
                        context = (Context) kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.L$1;
                        this = (e) kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.L$0;
                        kotlin.b.b(obj);
                        n0Var2 = r11;
                    }
                    m50 m50Var2 = m50Var;
                    a0 a0Var2 = a0Var;
                    n0 n0Var3 = n0Var2;
                    aVar = (com.yandex.passport.internal.entities.a) obj;
                    if (aVar == null) {
                        return aVar;
                    }
                    kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.L$0 = null;
                    kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.L$1 = null;
                    kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.L$2 = null;
                    kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.L$3 = null;
                    kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.L$4 = null;
                    kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12.label = 2;
                    obj = this.f(context, n0Var3, a0Var2, m50Var2, kAutoLoginClientHelper$tryAutoLoginForBelow34Api$12);
                }
            }
            if (i != 0) {
            }
            m50 m50Var22 = m50Var;
            a0 a0Var22 = a0Var;
            n0 n0Var32 = n0Var2;
            aVar = (com.yandex.passport.internal.entities.a) obj;
            if (aVar == null) {
            }
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        kAutoLoginClientHelper$tryAutoLoginForBelow34Api$1 = new KAutoLoginClientHelper$tryAutoLoginForBelow34Api$1(this, continuationImpl);
        KAutoLoginClientHelper$tryAutoLoginForBelow34Api$1 kAutoLoginClientHelper$tryAutoLoginForBelow34Api$122 = kAutoLoginClientHelper$tryAutoLoginForBelow34Api$1;
        Object obj2 = kAutoLoginClientHelper$tryAutoLoginForBelow34Api$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kAutoLoginClientHelper$tryAutoLoginForBelow34Api$122.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c7, code lost:
    
        if (r2 != r4) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r0v11, types: [eyc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Context context, lz40 lz40Var, a0 a0Var, m50 m50Var, ContinuationImpl continuationImpl) {
        KAutoLoginClientHelper$tryGetAccountFromCredentialManager$1 kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        e eVar;
        Context context2;
        fyc fycVar;
        a0 a0Var2;
        m50 m50Var2;
        lz40 lz40Var2;
        g6u g6uVar;
        KAutoLoginClientHelper$tryGetAccountFromCredentialManager$3 kAutoLoginClientHelper$tryGetAccountFromCredentialManager$3;
        eyc eycVar;
        if (continuationImpl instanceof KAutoLoginClientHelper$tryGetAccountFromCredentialManager$1) {
            kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1 = (KAutoLoginClientHelper$tryGetAccountFromCredentialManager$1) continuationImpl;
            int i2 = kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fyc b = gwk0.b();
                    kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$0 = this;
                    kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$1 = context;
                    kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$2 = lz40Var;
                    kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$3 = a0Var;
                    kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$4 = m50Var;
                    kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$5 = b;
                    kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.label = 1;
                    if (b(context, kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1) != coroutineSingletons) {
                        eVar = this;
                        context2 = context;
                        fycVar = b;
                        a0Var2 = a0Var;
                        m50Var2 = m50Var;
                        lz40Var2 = lz40Var;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    ?? r0 = (eyc) kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$5;
                    m50Var2 = (m50) kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$4;
                    a0 a0Var3 = (a0) kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$3;
                    lz40 lz40Var3 = (lz40) kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$2;
                    Context context3 = (Context) kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$1;
                    e eVar2 = (e) kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$0;
                    kotlin.b.b(obj);
                    fycVar = r0;
                    a0Var2 = a0Var3;
                    context2 = context3;
                    eVar = eVar2;
                    lz40Var2 = lz40Var3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        Object value = ((Result) obj).getValue();
                        kotlin.b.b(value);
                        return value;
                    }
                    eycVar = (eyc) kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$0;
                    kotlin.b.b(obj);
                    kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$0 = null;
                    kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.label = 3;
                    obj = ((fyc) eycVar).s(kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1);
                }
                sjh sjhVar = uyj.a;
                tje.N(bvf0.a(mdh.b), null, null, new KAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1(lz40Var2, null, eVar, fycVar, context2, a0Var2), 3);
                g6uVar = o400.a;
                kAutoLoginClientHelper$tryGetAccountFromCredentialManager$3 = new KAutoLoginClientHelper$tryGetAccountFromCredentialManager$3(m50Var2, null);
                kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$0 = fycVar;
                kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$1 = null;
                kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$2 = null;
                kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$3 = null;
                kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$4 = null;
                kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$5 = null;
                kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.label = 2;
                if (tje.k0(g6uVar, kAutoLoginClientHelper$tryGetAccountFromCredentialManager$3, kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1) != coroutineSingletons) {
                    eycVar = fycVar;
                    kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$0 = null;
                    kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.label = 3;
                    obj = ((fyc) eycVar).s(kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1);
                }
                return coroutineSingletons;
            }
        }
        kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1 = new KAutoLoginClientHelper$tryGetAccountFromCredentialManager$1(this, continuationImpl);
        Object obj2 = kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.label;
        if (i != 0) {
        }
        sjh sjhVar2 = uyj.a;
        tje.N(bvf0.a(mdh.b), null, null, new KAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1(lz40Var2, null, eVar, fycVar, context2, a0Var2), 3);
        g6uVar = o400.a;
        kAutoLoginClientHelper$tryGetAccountFromCredentialManager$3 = new KAutoLoginClientHelper$tryGetAccountFromCredentialManager$3(m50Var2, null);
        kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$0 = fycVar;
        kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$1 = null;
        kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$2 = null;
        kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$3 = null;
        kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$4 = null;
        kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.L$5 = null;
        kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1.label = 2;
        if (tje.k0(g6uVar, kAutoLoginClientHelper$tryGetAccountFromCredentialManager$3, kAutoLoginClientHelper$tryGetAccountFromCredentialManager$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e4, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c9, code lost:
    
        if (r11.B(true, r0) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        if (b(r9, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Context context, a0 a0Var, ContinuationImpl continuationImpl) {
        KAutoLoginClientHelper$tryLoginByCredentialManager$1 kAutoLoginClientHelper$tryLoginByCredentialManager$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        Context context2;
        a0 a0Var2;
        e eVar;
        Result result;
        Object c;
        try {
            if (continuationImpl instanceof KAutoLoginClientHelper$tryLoginByCredentialManager$1) {
                kAutoLoginClientHelper$tryLoginByCredentialManager$1 = (KAutoLoginClientHelper$tryLoginByCredentialManager$1) continuationImpl;
                int i2 = kAutoLoginClientHelper$tryLoginByCredentialManager$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kAutoLoginClientHelper$tryLoginByCredentialManager$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kAutoLoginClientHelper$tryLoginByCredentialManager$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kAutoLoginClientHelper$tryLoginByCredentialManager$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$0 = this;
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$1 = context;
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$2 = a0Var;
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.label = 1;
                    } else if (i == 1) {
                        a0Var = (a0) kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$2;
                        context = (Context) kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$1;
                        this = (e) kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$0;
                        kotlin.b.b(obj);
                    } else if (i == 2) {
                        a0 a0Var3 = (a0) kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$2;
                        Context context3 = (Context) kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$1;
                        e eVar2 = (e) kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$0;
                        kotlin.b.b(obj);
                        a = ((Result) obj).getValue();
                        eVar = eVar2;
                        context2 = context3;
                        a0Var2 = a0Var3;
                        result = new Result(a);
                        com.yandex.passport.internal.impl.i iVar = eVar.a;
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$0 = eVar;
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$1 = context2;
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$2 = a0Var2;
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$3 = result;
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.label = 3;
                    } else {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            c = ((Result) obj).getValue();
                            kotlin.b.b(c);
                            return (com.yandex.passport.internal.entities.a) c;
                        }
                        result = (Result) kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$3;
                        a0Var2 = (a0) kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$2;
                        context2 = (Context) kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$1;
                        eVar = (e) kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        Object value = result.getValue();
                        if (value instanceof Result.Failure) {
                            return value;
                        }
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$0 = null;
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$1 = null;
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$2 = null;
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$3 = null;
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.label = 4;
                        c = eVar.c(context2, (com.yandex.passport.internal.sloth.credentialmanager.a) value, a0Var2, kAutoLoginClientHelper$tryLoginByCredentialManager$1);
                    }
                    com.yandex.passport.internal.sloth.credentialmanager.e eVar3 = new com.yandex.passport.internal.sloth.credentialmanager.e(this.b);
                    eVar3.d(context);
                    GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace = GoogleCredentialManagerImpl$Companion$CredentialManagerPlace.AutoLogin;
                    kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$0 = this;
                    kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$1 = context;
                    kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$2 = a0Var;
                    kAutoLoginClientHelper$tryLoginByCredentialManager$1.label = 2;
                    a = eVar3.a(true, googleCredentialManagerImpl$Companion$CredentialManagerPlace, kAutoLoginClientHelper$tryLoginByCredentialManager$1);
                    if (a != coroutineSingletons) {
                        a0 a0Var4 = a0Var;
                        context2 = context;
                        a0Var2 = a0Var4;
                        eVar = this;
                        result = new Result(a);
                        com.yandex.passport.internal.impl.i iVar2 = eVar.a;
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$0 = eVar;
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$1 = context2;
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$2 = a0Var2;
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$3 = result;
                        kAutoLoginClientHelper$tryLoginByCredentialManager$1.label = 3;
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            com.yandex.passport.internal.sloth.credentialmanager.e eVar32 = new com.yandex.passport.internal.sloth.credentialmanager.e(this.b);
            eVar32.d(context);
            GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace2 = GoogleCredentialManagerImpl$Companion$CredentialManagerPlace.AutoLogin;
            kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$0 = this;
            kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$1 = context;
            kAutoLoginClientHelper$tryLoginByCredentialManager$1.L$2 = a0Var;
            kAutoLoginClientHelper$tryLoginByCredentialManager$1.label = 2;
            a = eVar32.a(true, googleCredentialManagerImpl$Companion$CredentialManagerPlace2, kAutoLoginClientHelper$tryLoginByCredentialManager$1);
            if (a != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        kAutoLoginClientHelper$tryLoginByCredentialManager$1 = new KAutoLoginClientHelper$tryLoginByCredentialManager$1(this, continuationImpl);
        Object obj2 = kAutoLoginClientHelper$tryLoginByCredentialManager$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kAutoLoginClientHelper$tryLoginByCredentialManager$1.label;
    }
}
