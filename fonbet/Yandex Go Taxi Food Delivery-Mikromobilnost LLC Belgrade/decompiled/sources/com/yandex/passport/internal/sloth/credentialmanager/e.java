package com.yandex.passport.internal.sloth.credentialmanager;

import android.content.Context;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.report.r5;
import com.yandex.passport.internal.report.s5;
import com.yandex.passport.internal.report.t5;
import defpackage.d6f;
import defpackage.d6z;
import defpackage.e9f;
import defpackage.evu0;
import defpackage.eyc;
import defpackage.fyc;
import defpackage.gw00;
import defpackage.gwk0;
import defpackage.gyf0;
import defpackage.j73;
import defpackage.kgx;
import defpackage.me0;
import defpackage.mtb1;
import defpackage.noh;
import defpackage.ny61;
import defpackage.oat;
import defpackage.q5t;
import defpackage.qoi0;
import defpackage.s5t;
import defpackage.up90;
import defpackage.z941;
import defpackage.zbt;
import io.appmetrica.analytics.IReporterYandex;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class e implements d {
    public static final /* synthetic */ kgx[] c;
    public final IReporterYandex a;
    public final z941 b = new z941(0);

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("context", 0, "getContext()Landroid/content/Context;", e.class);
        qoi0.a.getClass();
        c = new kgx[]{mutablePropertyReference1Impl};
    }

    public e(IReporterYandex iReporterYandex) {
        this.a = iReporterYandex;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.yandex.passport.internal.sloth.credentialmanager.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace, Continuation continuation) {
        GoogleCredentialManagerImpl$request$1 googleCredentialManagerImpl$request$1;
        int i;
        Object g;
        Throwable a;
        if (continuation instanceof GoogleCredentialManagerImpl$request$1) {
            googleCredentialManagerImpl$request$1 = (GoogleCredentialManagerImpl$request$1) continuation;
            int i2 = googleCredentialManagerImpl$request$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googleCredentialManagerImpl$request$1.label = i2 - Integer.MIN_VALUE;
                GoogleCredentialManagerImpl$request$1 googleCredentialManagerImpl$request$12 = googleCredentialManagerImpl$request$1;
                Object obj = googleCredentialManagerImpl$request$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googleCredentialManagerImpl$request$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Context context = (Context) this.b.getValue(this, c[0]);
                    if (context == null) {
                        f("context credential manager is null", new NullPointerException(), googleCredentialManagerImpl$Companion$CredentialManagerPlace);
                        return new Result.Failure(new IllegalStateException("context credential manager is null"));
                    }
                    googleCredentialManagerImpl$request$12.label = 1;
                    g = g(context, z, null, googleCredentialManagerImpl$Companion$CredentialManagerPlace, googleCredentialManagerImpl$request$12);
                    if (g == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    g = ((Result) obj).getValue();
                }
                a = Result.a(g);
                if (a == null) {
                    return new Result.Failure(a);
                }
                c cVar = (c) g;
                a aVar = cVar instanceof a ? (a) cVar : null;
                return aVar != null ? aVar : new Result.Failure(new IllegalStateException("unrecognized credential types"));
            }
        }
        googleCredentialManagerImpl$request$1 = new GoogleCredentialManagerImpl$request$1(this, (ContinuationImpl) continuation);
        GoogleCredentialManagerImpl$request$1 googleCredentialManagerImpl$request$122 = googleCredentialManagerImpl$request$1;
        Object obj3 = googleCredentialManagerImpl$request$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleCredentialManagerImpl$request$122.label;
        if (i != 0) {
        }
        a = Result.a(g);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.yandex.passport.internal.sloth.credentialmanager.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace, String str, Continuation continuation) {
        GoogleCredentialManagerImpl$request$4 googleCredentialManagerImpl$request$4;
        int i;
        if (continuation instanceof GoogleCredentialManagerImpl$request$4) {
            googleCredentialManagerImpl$request$4 = (GoogleCredentialManagerImpl$request$4) continuation;
            int i2 = googleCredentialManagerImpl$request$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googleCredentialManagerImpl$request$4.label = i2 - Integer.MIN_VALUE;
                GoogleCredentialManagerImpl$request$4 googleCredentialManagerImpl$request$42 = googleCredentialManagerImpl$request$4;
                Object obj = googleCredentialManagerImpl$request$42.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googleCredentialManagerImpl$request$42.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Context context = (Context) this.b.getValue(this, c[0]);
                if (context == null) {
                    f("context credential manager is null", new NullPointerException(), googleCredentialManagerImpl$Companion$CredentialManagerPlace);
                    return new Result.Failure(new IllegalStateException("context credential manager is null"));
                }
                googleCredentialManagerImpl$request$42.label = 1;
                Object g = g(context, false, str, googleCredentialManagerImpl$Companion$CredentialManagerPlace, googleCredentialManagerImpl$request$42);
                return g == obj2 ? obj2 : g;
            }
        }
        googleCredentialManagerImpl$request$4 = new GoogleCredentialManagerImpl$request$4(this, (ContinuationImpl) continuation);
        GoogleCredentialManagerImpl$request$4 googleCredentialManagerImpl$request$422 = googleCredentialManagerImpl$request$4;
        Object obj3 = googleCredentialManagerImpl$request$422.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleCredentialManagerImpl$request$422.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.internal.sloth.credentialmanager.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a aVar, GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace, ContinuationImpl continuationImpl) {
        GoogleCredentialManagerImpl$save$1 googleCredentialManagerImpl$save$1;
        int i;
        boolean z;
        if (continuationImpl instanceof GoogleCredentialManagerImpl$save$1) {
            googleCredentialManagerImpl$save$1 = (GoogleCredentialManagerImpl$save$1) continuationImpl;
            int i2 = googleCredentialManagerImpl$save$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googleCredentialManagerImpl$save$1.label = i2 - Integer.MIN_VALUE;
                Object obj = googleCredentialManagerImpl$save$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googleCredentialManagerImpl$save$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    z = false;
                    Context context = (Context) this.b.getValue(this, c[0]);
                    if (context == null) {
                        f("context credential manager is null", new NullPointerException(), googleCredentialManagerImpl$Companion$CredentialManagerPlace);
                        return Boolean.valueOf(z);
                    }
                    googleCredentialManagerImpl$save$1.label = 1;
                    obj = h(context, aVar, googleCredentialManagerImpl$Companion$CredentialManagerPlace, googleCredentialManagerImpl$save$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                z = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z);
            }
        }
        googleCredentialManagerImpl$save$1 = new GoogleCredentialManagerImpl$save$1(this, continuationImpl);
        Object obj3 = googleCredentialManagerImpl$save$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleCredentialManagerImpl$save$1.label;
        if (i != 0) {
        }
        z = ((Boolean) obj3).booleanValue();
        return Boolean.valueOf(z);
    }

    @Override // com.yandex.passport.internal.sloth.credentialmanager.d
    public final void d(Context context) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Attach Credential Manager to context of Activity", 8);
        }
        this.b.setValue(this, c[0], context);
    }

    public final void e(s5t s5tVar, eyc eycVar, GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace) {
        mtb1 mtb1Var = s5tVar.a;
        boolean z = mtb1Var instanceof up90;
        IReporterYandex iReporterYandex = this.a;
        if (z) {
            iReporterYandex.reportEvent(s5.w.toString(), gw00.e(new Pair("from", googleCredentialManagerImpl$Companion$CredentialManagerPlace.getFrom())));
            up90 up90Var = (up90) mtb1Var;
            ((fyc) eycVar).T(new Result(d6z.d(new a(up90Var.a, up90Var.b, true))));
            return;
        }
        if (mtb1Var instanceof gyf0) {
            ((fyc) eycVar).T(new Result(d6z.d(new b(((gyf0) mtb1Var).a, true))));
            return;
        }
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.WARN, null, "unrecognized credential types", 8);
        }
        iReporterYandex.reportEvent("unrecognized credential types", gw00.e(new Pair("from", googleCredentialManagerImpl$Companion$CredentialManagerPlace.getFrom())));
        ((fyc) eycVar).T(new Result(new Result.Failure(new CredentialManagerInterface$CredentialManagerRequestException("unrecognized credential types", new NotImplementedError(0)))));
    }

    public final void f(String str, Exception exc, GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(LogLevel.WARN, null, str, exc);
        }
        this.a.reportEvent(r5.w.toString(), kotlin.collections.b.i(new Pair("error", str), new Pair("throwable-message", exc.getMessage()), new Pair("from", googleCredentialManagerImpl$Companion$CredentialManagerPlace.getFrom())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0109, code lost:
    
        if (r13 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Context context, boolean z, String str, GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace, ContinuationImpl continuationImpl) {
        GoogleCredentialManagerImpl$request$7 googleCredentialManagerImpl$request$7;
        int i;
        eyc b;
        Exception e;
        GetCredentialException e2;
        GetPublicKeyCredentialException e3;
        if (continuationImpl instanceof GoogleCredentialManagerImpl$request$7) {
            googleCredentialManagerImpl$request$7 = (GoogleCredentialManagerImpl$request$7) continuationImpl;
            int i2 = googleCredentialManagerImpl$request$7.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googleCredentialManagerImpl$request$7.label = i2 - Integer.MIN_VALUE;
                Object obj = googleCredentialManagerImpl$request$7.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googleCredentialManagerImpl$request$7.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Start request to get credential from Credential Manager", 8);
                    }
                    q5t q5tVar = new q5t(j73.A(new e9f[]{str != null ? new zbt(str) : null, new oat(z, 5)}));
                    b = gwk0.b();
                    try {
                        googleCredentialManagerImpl$request$7.L$0 = this;
                        googleCredentialManagerImpl$request$7.L$1 = googleCredentialManagerImpl$Companion$CredentialManagerPlace;
                        googleCredentialManagerImpl$request$7.L$2 = b;
                        googleCredentialManagerImpl$request$7.label = 1;
                        obj = androidx.credentials.a.a(context, q5tVar, googleCredentialManagerImpl$request$7);
                    } catch (GetPublicKeyCredentialException e4) {
                        e3 = e4;
                        this.f("Request for public key was failed", e3, googleCredentialManagerImpl$Companion$CredentialManagerPlace);
                        ((fyc) b).T(new Result(new Result.Failure(new CredentialManagerInterface$CredentialManagerRequestException("Work with Credential Manager is failed", e3))));
                        googleCredentialManagerImpl$request$7.L$0 = null;
                        googleCredentialManagerImpl$request$7.L$1 = null;
                        googleCredentialManagerImpl$request$7.L$2 = null;
                        googleCredentialManagerImpl$request$7.label = 2;
                        obj = ((fyc) b).s(googleCredentialManagerImpl$request$7);
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    } catch (GetCredentialException e5) {
                        e2 = e5;
                        this.f("Request credentials was failed", e2, googleCredentialManagerImpl$Companion$CredentialManagerPlace);
                        ((fyc) b).T(new Result(new Result.Failure(new CredentialManagerInterface$CredentialManagerRequestException("Work with Credential Manager is failed", e2))));
                        googleCredentialManagerImpl$request$7.L$0 = null;
                        googleCredentialManagerImpl$request$7.L$1 = null;
                        googleCredentialManagerImpl$request$7.L$2 = null;
                        googleCredentialManagerImpl$request$7.label = 2;
                        obj = ((fyc) b).s(googleCredentialManagerImpl$request$7);
                        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    } catch (Exception e6) {
                        e = e6;
                        this.f("unknown error", e, googleCredentialManagerImpl$Companion$CredentialManagerPlace);
                        ((fyc) b).T(new Result(new Result.Failure(new CredentialManagerInterface$CredentialManagerRequestException("unknown error", e))));
                        googleCredentialManagerImpl$request$7.L$0 = null;
                        googleCredentialManagerImpl$request$7.L$1 = null;
                        googleCredentialManagerImpl$request$7.L$2 = null;
                        googleCredentialManagerImpl$request$7.label = 2;
                        obj = ((fyc) b).s(googleCredentialManagerImpl$request$7);
                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    }
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eyc eycVar = (eyc) googleCredentialManagerImpl$request$7.L$2;
                    googleCredentialManagerImpl$Companion$CredentialManagerPlace = (GoogleCredentialManagerImpl$Companion$CredentialManagerPlace) googleCredentialManagerImpl$request$7.L$1;
                    e eVar = (e) googleCredentialManagerImpl$request$7.L$0;
                    try {
                        kotlin.b.b(obj);
                        b = eycVar;
                        this = eVar;
                    } catch (GetPublicKeyCredentialException e7) {
                        e3 = e7;
                        b = eycVar;
                        this = eVar;
                        this.f("Request for public key was failed", e3, googleCredentialManagerImpl$Companion$CredentialManagerPlace);
                        ((fyc) b).T(new Result(new Result.Failure(new CredentialManagerInterface$CredentialManagerRequestException("Work with Credential Manager is failed", e3))));
                        googleCredentialManagerImpl$request$7.L$0 = null;
                        googleCredentialManagerImpl$request$7.L$1 = null;
                        googleCredentialManagerImpl$request$7.L$2 = null;
                        googleCredentialManagerImpl$request$7.label = 2;
                        obj = ((fyc) b).s(googleCredentialManagerImpl$request$7);
                        CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    } catch (GetCredentialException e8) {
                        e2 = e8;
                        b = eycVar;
                        this = eVar;
                        this.f("Request credentials was failed", e2, googleCredentialManagerImpl$Companion$CredentialManagerPlace);
                        ((fyc) b).T(new Result(new Result.Failure(new CredentialManagerInterface$CredentialManagerRequestException("Work with Credential Manager is failed", e2))));
                        googleCredentialManagerImpl$request$7.L$0 = null;
                        googleCredentialManagerImpl$request$7.L$1 = null;
                        googleCredentialManagerImpl$request$7.L$2 = null;
                        googleCredentialManagerImpl$request$7.label = 2;
                        obj = ((fyc) b).s(googleCredentialManagerImpl$request$7);
                        CoroutineSingletons coroutineSingletons22222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    } catch (Exception e9) {
                        e = e9;
                        b = eycVar;
                        this = eVar;
                        this.f("unknown error", e, googleCredentialManagerImpl$Companion$CredentialManagerPlace);
                        ((fyc) b).T(new Result(new Result.Failure(new CredentialManagerInterface$CredentialManagerRequestException("unknown error", e))));
                        googleCredentialManagerImpl$request$7.L$0 = null;
                        googleCredentialManagerImpl$request$7.L$1 = null;
                        googleCredentialManagerImpl$request$7.L$2 = null;
                        googleCredentialManagerImpl$request$7.label = 2;
                        obj = ((fyc) b).s(googleCredentialManagerImpl$request$7);
                        CoroutineSingletons coroutineSingletons222222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    }
                }
                this.e((s5t) obj, b, googleCredentialManagerImpl$Companion$CredentialManagerPlace);
                googleCredentialManagerImpl$request$7.L$0 = null;
                googleCredentialManagerImpl$request$7.L$1 = null;
                googleCredentialManagerImpl$request$7.L$2 = null;
                googleCredentialManagerImpl$request$7.label = 2;
                obj = ((fyc) b).s(googleCredentialManagerImpl$request$7);
                CoroutineSingletons coroutineSingletons2222222 = CoroutineSingletons.COROUTINE_SUSPENDED;
            }
        }
        googleCredentialManagerImpl$request$7 = new GoogleCredentialManagerImpl$request$7(this, continuationImpl);
        Object obj2 = googleCredentialManagerImpl$request$7.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleCredentialManagerImpl$request$7.label;
        if (i != 0) {
        }
        this.e((s5t) obj2, b, googleCredentialManagerImpl$Companion$CredentialManagerPlace);
        googleCredentialManagerImpl$request$7.L$0 = null;
        googleCredentialManagerImpl$request$7.L$1 = null;
        googleCredentialManagerImpl$request$7.L$2 = null;
        googleCredentialManagerImpl$request$7.label = 2;
        obj2 = ((fyc) b).s(googleCredentialManagerImpl$request$7);
        CoroutineSingletons coroutineSingletons22222222 = CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|(1:(1:(2:10|11)(2:13|14))(4:15|16|17|18))(4:55|(1:57)|58|(4:67|(1:69)|70|71)(4:62|63|64|(2:66|27)))|19|20|21|22|23|24|25|(1:27)(1:28)))|72|6|(0)(0)|19|20|21|22|23|24|25|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        r8 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
    
        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.LogLevel.WARN, null, "unknown error", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
    
        r8 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bd, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Context context, a aVar, GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace, ContinuationImpl continuationImpl) {
        GoogleCredentialManagerImpl$save$4 googleCredentialManagerImpl$save$4;
        int i;
        noh b;
        CreateCredentialException e;
        CreateCredentialCancellationException e2;
        noh nohVar;
        if (continuationImpl instanceof GoogleCredentialManagerImpl$save$4) {
            googleCredentialManagerImpl$save$4 = (GoogleCredentialManagerImpl$save$4) continuationImpl;
            int i2 = googleCredentialManagerImpl$save$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googleCredentialManagerImpl$save$4.label = i2 - Integer.MIN_VALUE;
                Object obj = googleCredentialManagerImpl$save$4.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googleCredentialManagerImpl$save$4.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    me0 me0Var = new me0(context, (byte) 0);
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Start save credential in Credential Manager", 8);
                    }
                    String str = aVar.c;
                    if (str == null || evu0.J(str)) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Password from Credentials is null or empty", 8);
                        }
                        return Boolean.FALSE;
                    }
                    b = gwk0.b();
                    d6f d6fVar = new d6f(aVar.b, str);
                    try {
                        googleCredentialManagerImpl$save$4.L$0 = this;
                        googleCredentialManagerImpl$save$4.L$1 = googleCredentialManagerImpl$Companion$CredentialManagerPlace;
                        googleCredentialManagerImpl$save$4.L$2 = b;
                        googleCredentialManagerImpl$save$4.label = 1;
                    } catch (CreateCredentialCancellationException e3) {
                        e2 = e3;
                        this.f("User cancelled the save", e2, googleCredentialManagerImpl$Companion$CredentialManagerPlace);
                        ((fyc) b).T(Boolean.FALSE);
                        googleCredentialManagerImpl$save$4.L$0 = null;
                        googleCredentialManagerImpl$save$4.L$1 = null;
                        googleCredentialManagerImpl$save$4.L$2 = null;
                        googleCredentialManagerImpl$save$4.label = 2;
                        Object s = ((fyc) b).s(googleCredentialManagerImpl$save$4);
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (s == coroutineSingletons) {
                        }
                    } catch (CreateCredentialException e4) {
                        e = e4;
                        this.f("Save credentials was failed", e, googleCredentialManagerImpl$Companion$CredentialManagerPlace);
                        ((fyc) b).T(Boolean.FALSE);
                        googleCredentialManagerImpl$save$4.L$0 = null;
                        googleCredentialManagerImpl$save$4.L$1 = null;
                        googleCredentialManagerImpl$save$4.L$2 = null;
                        googleCredentialManagerImpl$save$4.label = 2;
                        Object s2 = ((fyc) b).s(googleCredentialManagerImpl$save$4);
                        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (s2 == coroutineSingletons) {
                        }
                    } catch (Exception e5) {
                        e = e5;
                        nohVar = b;
                        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        }
                        ((fyc) nohVar).T(Boolean.FALSE);
                        b = nohVar;
                        googleCredentialManagerImpl$save$4.L$0 = null;
                        googleCredentialManagerImpl$save$4.L$1 = null;
                        googleCredentialManagerImpl$save$4.L$2 = null;
                        googleCredentialManagerImpl$save$4.label = 2;
                        Object s22 = ((fyc) b).s(googleCredentialManagerImpl$save$4);
                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (s22 == coroutineSingletons) {
                        }
                    }
                    if (me0Var.b(context, d6fVar, googleCredentialManagerImpl$save$4) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nohVar = (eyc) googleCredentialManagerImpl$save$4.L$2;
                    googleCredentialManagerImpl$Companion$CredentialManagerPlace = (GoogleCredentialManagerImpl$Companion$CredentialManagerPlace) googleCredentialManagerImpl$save$4.L$1;
                    e eVar = (e) googleCredentialManagerImpl$save$4.L$0;
                    try {
                        kotlin.b.b(obj);
                        b = nohVar;
                        this = eVar;
                    } catch (CreateCredentialCancellationException e6) {
                        e2 = e6;
                        b = nohVar;
                        this = eVar;
                        this.f("User cancelled the save", e2, googleCredentialManagerImpl$Companion$CredentialManagerPlace);
                        ((fyc) b).T(Boolean.FALSE);
                        googleCredentialManagerImpl$save$4.L$0 = null;
                        googleCredentialManagerImpl$save$4.L$1 = null;
                        googleCredentialManagerImpl$save$4.L$2 = null;
                        googleCredentialManagerImpl$save$4.label = 2;
                        Object s222 = ((fyc) b).s(googleCredentialManagerImpl$save$4);
                        CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (s222 == coroutineSingletons) {
                        }
                    } catch (CreateCredentialException e7) {
                        e = e7;
                        b = nohVar;
                        this = eVar;
                        this.f("Save credentials was failed", e, googleCredentialManagerImpl$Companion$CredentialManagerPlace);
                        ((fyc) b).T(Boolean.FALSE);
                        googleCredentialManagerImpl$save$4.L$0 = null;
                        googleCredentialManagerImpl$save$4.L$1 = null;
                        googleCredentialManagerImpl$save$4.L$2 = null;
                        googleCredentialManagerImpl$save$4.label = 2;
                        Object s2222 = ((fyc) b).s(googleCredentialManagerImpl$save$4);
                        CoroutineSingletons coroutineSingletons22222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (s2222 == coroutineSingletons) {
                        }
                    } catch (Exception e8) {
                        e = e8;
                        com.yandex.passport.common.logger.c cVar22 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        }
                        ((fyc) nohVar).T(Boolean.FALSE);
                        b = nohVar;
                        googleCredentialManagerImpl$save$4.L$0 = null;
                        googleCredentialManagerImpl$save$4.L$1 = null;
                        googleCredentialManagerImpl$save$4.L$2 = null;
                        googleCredentialManagerImpl$save$4.label = 2;
                        Object s22222 = ((fyc) b).s(googleCredentialManagerImpl$save$4);
                        CoroutineSingletons coroutineSingletons222222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (s22222 == coroutineSingletons) {
                        }
                    }
                }
                this.a.reportEvent(t5.w.toString(), gw00.e(new Pair("from", googleCredentialManagerImpl$Companion$CredentialManagerPlace.getFrom())));
                ((fyc) b).T(Boolean.TRUE);
                googleCredentialManagerImpl$save$4.L$0 = null;
                googleCredentialManagerImpl$save$4.L$1 = null;
                googleCredentialManagerImpl$save$4.L$2 = null;
                googleCredentialManagerImpl$save$4.label = 2;
                Object s222222 = ((fyc) b).s(googleCredentialManagerImpl$save$4);
                CoroutineSingletons coroutineSingletons2222222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return s222222 == coroutineSingletons ? coroutineSingletons : s222222;
            }
        }
        googleCredentialManagerImpl$save$4 = new GoogleCredentialManagerImpl$save$4(this, continuationImpl);
        Object obj2 = googleCredentialManagerImpl$save$4.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleCredentialManagerImpl$save$4.label;
        if (i != 0) {
        }
        this.a.reportEvent(t5.w.toString(), gw00.e(new Pair("from", googleCredentialManagerImpl$Companion$CredentialManagerPlace.getFrom())));
        ((fyc) b).T(Boolean.TRUE);
        googleCredentialManagerImpl$save$4.L$0 = null;
        googleCredentialManagerImpl$save$4.L$1 = null;
        googleCredentialManagerImpl$save$4.L$2 = null;
        googleCredentialManagerImpl$save$4.label = 2;
        Object s2222222 = ((fyc) b).s(googleCredentialManagerImpl$save$4);
        CoroutineSingletons coroutineSingletons22222222 = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (s2222222 == coroutineSingletons3) {
        }
    }
}
