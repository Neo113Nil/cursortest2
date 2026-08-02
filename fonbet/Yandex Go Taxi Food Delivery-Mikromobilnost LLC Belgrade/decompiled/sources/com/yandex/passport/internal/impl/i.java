package com.yandex.passport.internal.impl;

import android.content.Context;
import com.yandex.passport.api.KPassportStashCell;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.PushPlatform;
import com.yandex.passport.api.a0;
import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.exception.PassportAutoLoginImpossibleException;
import com.yandex.passport.api.exception.PassportFailedResponseException;
import com.yandex.passport.api.exception.PassportIOException;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.z0;
import com.yandex.passport.internal.credentials.Credentials;
import com.yandex.passport.internal.entities.UserCredentials;
import com.yandex.passport.internal.methods.e0;
import com.yandex.passport.internal.methods.g1;
import com.yandex.passport.internal.methods.l2;
import com.yandex.passport.internal.methods.r2;
import com.yandex.passport.internal.methods.requester.CommonRequesterKt$requestMethodOnDefault$2;
import com.yandex.passport.internal.methods.w1;
import com.yandex.passport.internal.properties.AutoLoginProperties;
import com.yandex.passport.internal.properties.UpdateableProperties;
import com.yandex.passport.internal.ui.util.ForegroundDetector;
import defpackage.d6z;
import defpackage.i3y;
import defpackage.ij3;
import defpackage.lfx;
import defpackage.lse;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.v40;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class i implements com.yandex.passport.api.b {
    public final f a;
    public final i3y b;
    public final i3y c;

    public i(Context context, f fVar) {
        this.a = fVar;
        final int i = 0;
        this.b = kotlin.a.a(new sls(this) { // from class: com.yandex.passport.internal.impl.h
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                i iVar = this.b;
                switch (i2) {
                    case 0:
                        return new com.yandex.passport.internal.autologin.ui.e(iVar, iVar.a.b);
                    default:
                        return new j((g) iVar.a.f.getValue());
                }
            }
        });
        new ForegroundDetector(context, new ij3(lse.a, 14));
        final int i2 = 1;
        this.c = kotlin.a.a(new sls(this) { // from class: com.yandex.passport.internal.impl.h
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                i iVar = this.b;
                switch (i22) {
                    case 0:
                        return new com.yandex.passport.internal.autologin.ui.e(iVar, iVar.a.b);
                    default:
                        return new j((g) iVar.a.f.getValue());
                }
            }
        });
    }

    @Override // com.yandex.passport.api.b
    public final Object A(String str, ContinuationImpl continuationImpl) {
        Object A = this.a.A(str, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yandex.passport.internal.impl.i] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.yandex.passport.internal.impl.f] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.yandex.passport.internal.impl.f] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(boolean z, ContinuationImpl continuationImpl) {
        KPassportLimitedApiImpl$setAutoLoginFromSmartlockDisabled$1 kPassportLimitedApiImpl$setAutoLoginFromSmartlockDisabled$1;
        int i;
        Throwable a;
        try {
            if (continuationImpl instanceof KPassportLimitedApiImpl$setAutoLoginFromSmartlockDisabled$1) {
                kPassportLimitedApiImpl$setAutoLoginFromSmartlockDisabled$1 = (KPassportLimitedApiImpl$setAutoLoginFromSmartlockDisabled$1) continuationImpl;
                int i2 = kPassportLimitedApiImpl$setAutoLoginFromSmartlockDisabled$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportLimitedApiImpl$setAutoLoginFromSmartlockDisabled$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportLimitedApiImpl$setAutoLoginFromSmartlockDisabled$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportLimitedApiImpl$setAutoLoginFromSmartlockDisabled$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        f fVar = this.a;
                        fVar.x();
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar.e, new l2(z), new lfx[0], null);
                        kPassportLimitedApiImpl$setAutoLoginFromSmartlockDisabled$1.L$0 = fVar;
                        kPassportLimitedApiImpl$setAutoLoginFromSmartlockDisabled$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportLimitedApiImpl$setAutoLoginFromSmartlockDisabled$1);
                        this = fVar;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        f fVar2 = (f) kPassportLimitedApiImpl$setAutoLoginFromSmartlockDisabled$1.L$0;
                        kotlin.b.b(obj);
                        this = fVar2;
                    }
                    Object value = ((Result) obj).getValue();
                    a = Result.a(value);
                    if (a != null && (a instanceof RuntimeException)) {
                        this.k((RuntimeException) a);
                    }
                    return value;
                }
            }
            if (i != 0) {
            }
            Object value2 = ((Result) obj).getValue();
            a = Result.a(value2);
            if (a != null) {
                this.k((RuntimeException) a);
            }
            return value2;
        } catch (RuntimeException e) {
            this.k(e);
            throw e;
        }
        kPassportLimitedApiImpl$setAutoLoginFromSmartlockDisabled$1 = new KPassportLimitedApiImpl$setAutoLoginFromSmartlockDisabled$1(this, continuationImpl);
        Object obj2 = kPassportLimitedApiImpl$setAutoLoginFromSmartlockDisabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportLimitedApiImpl$setAutoLoginFromSmartlockDisabled$1.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yandex.passport.internal.impl.i] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.yandex.passport.internal.impl.f] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.yandex.passport.internal.impl.f] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(a0 a0Var, ContinuationImpl continuationImpl) {
        KPassportLimitedApiImpl$tryAutoLogin$1 kPassportLimitedApiImpl$tryAutoLogin$1;
        int i;
        Throwable a;
        try {
            if (continuationImpl instanceof KPassportLimitedApiImpl$tryAutoLogin$1) {
                kPassportLimitedApiImpl$tryAutoLogin$1 = (KPassportLimitedApiImpl$tryAutoLogin$1) continuationImpl;
                int i2 = kPassportLimitedApiImpl$tryAutoLogin$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportLimitedApiImpl$tryAutoLogin$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportLimitedApiImpl$tryAutoLogin$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportLimitedApiImpl$tryAutoLogin$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        f fVar = this.a;
                        fVar.x();
                        com.yandex.passport.internal.methods.requester.f fVar2 = fVar.e;
                        AutoLoginProperties.Companion.getClass();
                        r2 r2Var = new r2(com.yandex.passport.internal.properties.e.b(a0Var));
                        lfx[] lfxVarArr = {qoi0.a(PassportAutoLoginImpossibleException.class)};
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar2, r2Var, lfxVarArr, null);
                        kPassportLimitedApiImpl$tryAutoLogin$1.L$0 = fVar;
                        kPassportLimitedApiImpl$tryAutoLogin$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportLimitedApiImpl$tryAutoLogin$1);
                        this = fVar;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        f fVar3 = (f) kPassportLimitedApiImpl$tryAutoLogin$1.L$0;
                        kotlin.b.b(obj);
                        this = fVar3;
                    }
                    Object value = ((Result) obj).getValue();
                    a = Result.a(value);
                    if (a != null && (a instanceof RuntimeException)) {
                        this.k((RuntimeException) a);
                    }
                    return value;
                }
            }
            if (i != 0) {
            }
            Object value2 = ((Result) obj).getValue();
            a = Result.a(value2);
            if (a != null) {
                this.k((RuntimeException) a);
            }
            return value2;
        } catch (RuntimeException e) {
            this.k(e);
            throw e;
        }
        kPassportLimitedApiImpl$tryAutoLogin$1 = new KPassportLimitedApiImpl$tryAutoLogin$1(this, continuationImpl);
        Object obj2 = kPassportLimitedApiImpl$tryAutoLogin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportLimitedApiImpl$tryAutoLogin$1.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(2:3|(6:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(4:18|19|20|(2:22|(2:24|(1:26)(1:27))(2:28|29))(4:30|31|(1:35)|41)))(3:42|43|44))(6:51|52|53|54|55|(2:57|26))|45|(4:47|31|(2:33|35)|41)(3:48|(3:50|20|(0)(0))|26)))|7|(0)(0)|45|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0038, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0107, code lost:
    
        r14 = r11;
        r11 = new kotlin.Result.Failure(r12);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3 A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x002e, B:22:0x00d3, B:24:0x00db, B:28:0x00f5), top: B:7:0x0022, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097 A[Catch: RuntimeException -> 0x009d, TryCatch #2 {RuntimeException -> 0x009d, blocks: (B:31:0x010d, B:33:0x0113, B:35:0x0117, B:45:0x0093, B:47:0x0097, B:48:0x00a1, B:55:0x0082), top: B:54:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1 A[Catch: RuntimeException -> 0x009d, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x009d, blocks: (B:31:0x010d, B:33:0x0113, B:35:0x0117, B:45:0x0093, B:47:0x0097, B:48:0x00a1, B:55:0x0082), top: B:54:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.yandex.passport.internal.impl.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.yandex.passport.internal.impl.f] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.yandex.passport.internal.impl.i, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(Context context, a0 a0Var, ContinuationImpl continuationImpl) {
        KPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1 kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1;
        int i;
        f fVar;
        Object failure;
        Throwable a;
        Object d;
        ?? r11;
        com.yandex.passport.internal.entities.a aVar;
        i iVar;
        f fVar2;
        Context context2;
        a0 a0Var2;
        Object value;
        try {
            if (continuationImpl instanceof KPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1) {
                kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1 = (KPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1) continuationImpl;
                int i2 = kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        fVar = this.a;
                        fVar.x();
                        try {
                            com.yandex.passport.internal.autologin.ui.e eVar = (com.yandex.passport.internal.autologin.ui.e) this.b.getValue();
                            try {
                                kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$0 = this;
                                kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$1 = context;
                                kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$2 = a0Var;
                                kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$3 = fVar;
                                kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.label = 1;
                                d = eVar.d(a0Var, kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1);
                                this = this;
                                if (d == coroutineSingletons) {
                                }
                            } catch (RuntimeException e) {
                                e = e;
                                this = fVar;
                                this.k(e);
                                throw e;
                            }
                        } catch (RuntimeException e2) {
                            e = e2;
                            this = fVar;
                            this.k(e);
                            throw e;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                kotlin.b.b(obj);
                                return ((Result) obj).getValue();
                            }
                            fVar2 = (f) kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$3;
                            a0Var2 = (a0) kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$2;
                            context2 = (Context) kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$1;
                            iVar = (i) kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$0;
                            kotlin.b.b(obj);
                            value = ((Result) obj).getValue();
                            if (!(value instanceof Result.Failure)) {
                                fVar = fVar2;
                                failure = value;
                                a = Result.a(failure);
                                if (a != null && (a instanceof RuntimeException)) {
                                    fVar.k((RuntimeException) a);
                                }
                                return failure;
                            }
                            if (!((Boolean) value).booleanValue()) {
                                return new Result.Failure(new PassportAutoLoginImpossibleException("Can't request credentials from credential manager"));
                            }
                            com.yandex.passport.internal.autologin.ui.e eVar2 = (com.yandex.passport.internal.autologin.ui.e) iVar.b.getValue();
                            kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$0 = fVar2;
                            kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$1 = null;
                            kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$2 = null;
                            kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$3 = null;
                            kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.label = 3;
                            Object g = eVar2.g(context2, a0Var2, kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1);
                            return g == coroutineSingletons ? coroutineSingletons : g;
                        }
                        f fVar3 = (f) kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$3;
                        a0Var = (a0) kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$2;
                        context = (Context) kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$1;
                        i iVar2 = (i) kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$0;
                        kotlin.b.b(obj);
                        fVar = fVar3;
                        r11 = iVar2;
                        d = obj;
                    }
                    aVar = (com.yandex.passport.internal.entities.a) d;
                    if (aVar == null) {
                        failure = d6z.d(aVar);
                        a = Result.a(failure);
                        if (a != null) {
                            fVar.k((RuntimeException) a);
                        }
                        return failure;
                    }
                    sjh sjhVar = uyj.a;
                    CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(r11.a.e, g1.b, new lfx[0], null);
                    kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$0 = r11;
                    kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$1 = context;
                    kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$2 = a0Var;
                    kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.L$3 = fVar;
                    kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.label = 2;
                    Object k0 = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1);
                    if (k0 != coroutineSingletons) {
                        iVar = r11;
                        fVar2 = fVar;
                        obj = k0;
                        a0 a0Var3 = a0Var;
                        context2 = context;
                        a0Var2 = a0Var3;
                        value = ((Result) obj).getValue();
                        if (!(value instanceof Result.Failure)) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
            aVar = (com.yandex.passport.internal.entities.a) d;
            if (aVar == null) {
            }
        } catch (RuntimeException e3) {
            e = e3;
            this.k(e);
            throw e;
        }
        kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1 = new KPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1(this, continuationImpl);
        Object obj2 = kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportLimitedApiImpl$tryAutoLoginWithCredentialManager$1.label;
    }

    @Override // com.yandex.passport.api.b
    public final /* synthetic */ i a() {
        return this.a.a();
    }

    @Override // com.yandex.passport.api.b
    public final Object b(PassportUidImpl passportUidImpl, Continuation continuation) {
        Object b = this.a.b(passportUidImpl, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return b;
    }

    @Override // com.yandex.passport.api.b
    public final Object c(k2 k2Var, String str, ContinuationImpl continuationImpl) {
        Object c = this.a.c(k2Var, str, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return c;
    }

    @Override // com.yandex.passport.api.b
    public final Object d(k2 k2Var, String str, ContinuationImpl continuationImpl) {
        Object d = this.a.d(k2Var, str, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return d;
    }

    @Override // com.yandex.passport.api.b
    public final Object e(PassportUidImpl passportUidImpl, Continuation continuation) {
        Object e = this.a.e(passportUidImpl, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return e;
    }

    @Override // com.yandex.passport.api.b
    public final Object f(String str, Map map, Continuation continuation) {
        Object f = this.a.f(str, map, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return f;
    }

    @Override // com.yandex.passport.api.b
    public final Object g(k2 k2Var, ContinuationImpl continuationImpl) {
        Object g = this.a.g(k2Var, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return g;
    }

    @Override // com.yandex.passport.api.b
    public final void h() {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // com.yandex.passport.api.b
    public final /* synthetic */ com.yandex.passport.internal.r i() {
        return this.a.i();
    }

    @Override // com.yandex.passport.api.b
    public final Object j(PushPlatform pushPlatform, Continuation continuation) {
        Object j = this.a.j(pushPlatform, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.yandex.passport.internal.impl.i] */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.yandex.passport.internal.impl.f] */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.yandex.passport.internal.impl.f] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(UserCredentials userCredentials, ContinuationImpl continuationImpl) {
        KPassportLimitedApiImpl$authorizeByUserCredentials$1 kPassportLimitedApiImpl$authorizeByUserCredentials$1;
        int i;
        Throwable a;
        try {
            if (continuationImpl instanceof KPassportLimitedApiImpl$authorizeByUserCredentials$1) {
                kPassportLimitedApiImpl$authorizeByUserCredentials$1 = (KPassportLimitedApiImpl$authorizeByUserCredentials$1) continuationImpl;
                int i2 = kPassportLimitedApiImpl$authorizeByUserCredentials$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportLimitedApiImpl$authorizeByUserCredentials$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportLimitedApiImpl$authorizeByUserCredentials$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportLimitedApiImpl$authorizeByUserCredentials$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        f fVar = this.a;
                        fVar.x();
                        com.yandex.passport.internal.methods.requester.f fVar2 = fVar.e;
                        UserCredentials.Companion.getClass();
                        e0 e0Var = new e0(com.yandex.passport.internal.entities.r.a(userCredentials));
                        lfx[] lfxVarArr = {qoi0.a(PassportAccountNotFoundException.class), qoi0.a(PassportAccountNotAuthorizedException.class), qoi0.a(PassportFailedResponseException.class), qoi0.a(PassportIOException.class)};
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar2, e0Var, lfxVarArr, null);
                        kPassportLimitedApiImpl$authorizeByUserCredentials$1.L$0 = fVar;
                        kPassportLimitedApiImpl$authorizeByUserCredentials$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportLimitedApiImpl$authorizeByUserCredentials$1);
                        this = fVar;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        f fVar3 = (f) kPassportLimitedApiImpl$authorizeByUserCredentials$1.L$0;
                        kotlin.b.b(obj);
                        this = fVar3;
                    }
                    Object value = ((Result) obj).getValue();
                    a = Result.a(value);
                    if (a != null && (a instanceof RuntimeException)) {
                        this.k((RuntimeException) a);
                    }
                    return value;
                }
            }
            if (i != 0) {
            }
            Object value2 = ((Result) obj).getValue();
            a = Result.a(value2);
            if (a != null) {
                this.k((RuntimeException) a);
            }
            return value2;
        } catch (RuntimeException e) {
            this.k(e);
            throw e;
        }
        kPassportLimitedApiImpl$authorizeByUserCredentials$1 = new KPassportLimitedApiImpl$authorizeByUserCredentials$1(this, continuationImpl);
        Object obj2 = kPassportLimitedApiImpl$authorizeByUserCredentials$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportLimitedApiImpl$authorizeByUserCredentials$1.label;
    }

    @Override // com.yandex.passport.api.b
    public final /* synthetic */ o l(v40 v40Var, tse tseVar) {
        return this.a.l(v40Var, tseVar);
    }

    @Override // com.yandex.passport.api.b
    public final Object m(k2 k2Var, String str, Continuation continuation) {
        Object m = this.a.m(k2Var, str, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return m;
    }

    @Override // com.yandex.passport.api.b
    public final Object n(k2 k2Var, KPassportStashCell kPassportStashCell, String str, Continuation continuation) {
        Object n = this.a.n(k2Var, kPassportStashCell, str, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }

    @Override // com.yandex.passport.api.b
    public final Object o(z0 z0Var, Continuation continuation) {
        Object o = this.a.o(z0Var, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return o;
    }

    @Override // com.yandex.passport.api.b
    public final Object p(tls tlsVar, ContinuationImpl continuationImpl) {
        Object p = this.a.p(tlsVar, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return p;
    }

    @Override // com.yandex.passport.api.b
    public final /* synthetic */ com.yandex.passport.internal.upgrader.g q() {
        return this.a.q();
    }

    @Override // com.yandex.passport.api.b
    public final Object r(Continuation continuation) {
        Object r = this.a.r(continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return r;
    }

    @Override // com.yandex.passport.api.b
    public final /* synthetic */ com.yandex.passport.api.c s() {
        return this.a.s();
    }

    @Override // com.yandex.passport.api.b
    public final r t() {
        return this.a.t();
    }

    @Override // com.yandex.passport.api.b
    public final Object u(PassportUidImpl passportUidImpl, Continuation continuation) {
        Object u = this.a.u(passportUidImpl, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return u;
    }

    @Override // com.yandex.passport.api.b
    public final Object v(UpdateableProperties updateableProperties, ContinuationImpl continuationImpl) {
        Object v = this.a.v(updateableProperties, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return v;
    }

    @Override // com.yandex.passport.api.b
    public final Object w(k2 k2Var, Credentials credentials, ContinuationImpl continuationImpl) {
        Object w = this.a.w(k2Var, credentials, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.yandex.passport.internal.impl.i] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.yandex.passport.internal.impl.f] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.yandex.passport.internal.impl.f] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(ContinuationImpl continuationImpl) {
        KPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1 kPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1;
        int i;
        Throwable a;
        try {
            if (continuationImpl instanceof KPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1) {
                kPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1 = (KPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1) continuationImpl;
                int i2 = kPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        f fVar = this.a;
                        fVar.x();
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar.e, w1.b, new lfx[0], null);
                        kPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1.L$0 = fVar;
                        kPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1);
                        this = fVar;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        f fVar2 = (f) kPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1.L$0;
                        kotlin.b.b(obj);
                        this = fVar2;
                    }
                    Object value = ((Result) obj).getValue();
                    a = Result.a(value);
                    if (a != null && (a instanceof RuntimeException)) {
                        this.k((RuntimeException) a);
                    }
                    return value;
                }
            }
            if (i != 0) {
            }
            Object value2 = ((Result) obj).getValue();
            a = Result.a(value2);
            if (a != null) {
                this.k((RuntimeException) a);
            }
            return value2;
        } catch (RuntimeException e) {
            this.k(e);
            throw e;
        }
        kPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1 = new KPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1(this, continuationImpl);
        Object obj2 = kPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportLimitedApiImpl$isAutoLoginFromSmartlockDisabled$1.label;
    }

    @Override // com.yandex.passport.api.b
    public final void y() {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // com.yandex.passport.api.b
    public final Object z(k2 k2Var, Continuation continuation) {
        Object z = this.a.z(k2Var, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return z;
    }
}
