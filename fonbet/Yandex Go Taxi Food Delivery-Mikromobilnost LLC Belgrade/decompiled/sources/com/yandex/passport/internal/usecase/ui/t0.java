package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.network.response.AuthMethod;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.usecase.m1;
import com.yandex.passport.internal.usecase.n1;
import com.yandex.passport.internal.usecase.w1;
import com.yandex.passport.internal.usecase.x1;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import java.io.Closeable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class t0 extends x1 {
    public final com.yandex.passport.internal.account.c d;
    public final com.yandex.passport.internal.ui.g e;
    public final n1 f;

    public t0(com.yandex.passport.internal.account.c cVar, com.yandex.passport.internal.ui.g gVar, n1 n1Var, com.yandex.passport.common.coroutine.a aVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.d = cVar;
        this.e = gVar;
        this.f = n1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AuthTrack authTrack, String str, wls wlsVar, ContinuationImpl continuationImpl) {
        StartAuthorizationUseCase$onErrorEvent$1 startAuthorizationUseCase$onErrorEvent$1;
        int i;
        EventError eventError;
        if (continuationImpl instanceof StartAuthorizationUseCase$onErrorEvent$1) {
            startAuthorizationUseCase$onErrorEvent$1 = (StartAuthorizationUseCase$onErrorEvent$1) continuationImpl;
            int i2 = startAuthorizationUseCase$onErrorEvent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                startAuthorizationUseCase$onErrorEvent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = startAuthorizationUseCase$onErrorEvent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = startAuthorizationUseCase$onErrorEvent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    EventError eventError2 = new EventError(str, null, 2, null);
                    startAuthorizationUseCase$onErrorEvent$1.L$0 = authTrack;
                    startAuthorizationUseCase$onErrorEvent$1.L$1 = wlsVar;
                    startAuthorizationUseCase$onErrorEvent$1.L$2 = eventError2;
                    startAuthorizationUseCase$onErrorEvent$1.label = 1;
                    if (this.b.emit(eventError2, startAuthorizationUseCase$onErrorEvent$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    eventError = eventError2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eventError = (EventError) startAuthorizationUseCase$onErrorEvent$1.L$2;
                    wlsVar = (wls) startAuthorizationUseCase$onErrorEvent$1.L$1;
                    authTrack = (AuthTrack) startAuthorizationUseCase$onErrorEvent$1.L$0;
                    kotlin.b.b(obj);
                }
                wlsVar.invoke(authTrack, eventError);
                return zy11.a;
            }
        }
        startAuthorizationUseCase$onErrorEvent$1 = new StartAuthorizationUseCase$onErrorEvent$1(this, continuationImpl);
        Object obj2 = startAuthorizationUseCase$onErrorEvent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startAuthorizationUseCase$onErrorEvent$1.label;
        if (i != 0) {
        }
        wlsVar.invoke(authTrack, eventError);
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d9, code lost:
    
        if (r6 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AuthTrack authTrack, com.yandex.passport.internal.network.response.f fVar, com.yandex.passport.internal.ui.domik.relogin.b bVar, tls tlsVar, tls tlsVar2, wls wlsVar, Continuation continuation) {
        Iterable iterable;
        Object obj;
        Object c;
        ArrayList arrayList = fVar.e;
        List list = fVar.f;
        String str = fVar.g;
        String str2 = fVar.c;
        str2.getClass();
        AuthTrack withAccountType = authTrack.withTrackId(str2).withAuthMethods(arrayList).withAccountType(fVar.h);
        String str3 = fVar.d;
        if (str3 != null) {
            withAccountType = withAccountType.withMaskedLogin(str3);
        }
        String str4 = fVar.i;
        if (str4 != null) {
            withAccountType = withAccountType.withMagicLinkEmail(str4);
        }
        String str5 = fVar.j;
        if (str5 != null) {
            withAccountType = withAccountType.withMaskedPhoneNumber(str5);
        }
        if (str != null) {
            withAccountType = AuthTrack.withLogin$default(withAccountType.withPhoneNumber(str), null, false, 2, null);
        }
        boolean z = fVar.b;
        zy11 zy11Var = zy11.a;
        if (z) {
            if (str != null) {
                withAccountType = AuthTrack.withLogin$default(withAccountType, null, false, 2, null);
            }
            tlsVar.invoke(withAccountType);
            return zy11Var;
        }
        if (list == null || list.isEmpty()) {
            List<AuthMethod> authMethods = withAccountType.getAuthMethods();
            if (authMethods != null) {
                iterable = new ArrayList();
                for (Object obj2 : authMethods) {
                    int i = com.yandex.passport.internal.ui.domik.a.a[((AuthMethod) obj2).ordinal()];
                    iterable.add(obj2);
                }
            } else {
                iterable = EmptyList.a;
            }
            iterable.size();
            if (iterable.contains(AuthMethod.SMS_CODE)) {
                bVar.invoke(withAccountType);
            } else {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((AuthMethod) obj).getIsSocial()) {
                        break;
                    }
                }
                if (((AuthMethod) obj) != null) {
                    tlsVar2.invoke(withAccountType);
                } else if (iterable.isEmpty()) {
                    c = c(withAccountType, "no auth methods", wlsVar, (ContinuationImpl) continuation);
                } else {
                    wlsVar.invoke(withAccountType, new EventError("unknown error", null, 2, null));
                }
            }
            c = zy11Var;
            if (c == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return c;
            }
        } else {
            Object c2 = c(withAccountType, (String) list.get(0), wlsVar, (ContinuationImpl) continuation);
            if (c2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return c2;
            }
        }
        return zy11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (r9 == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:19:0x0047, B:21:0x0071, B:23:0x0077, B:28:0x008c), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yandex.passport.internal.usecase.ui.t0, com.yandex.passport.internal.usecase.x1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.yandex.passport.internal.usecase.ui.s0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v2 */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(s0 s0Var, ContinuationImpl continuationImpl) {
        StartAuthorizationUseCase$run$1 startAuthorizationUseCase$run$1;
        int i;
        com.yandex.passport.internal.ui.g gVar;
        x1 x1Var;
        Object obj;
        Closeable closeable;
        Throwable a;
        try {
            if (continuationImpl instanceof StartAuthorizationUseCase$run$1) {
                startAuthorizationUseCase$run$1 = (StartAuthorizationUseCase$run$1) continuationImpl;
                int i2 = startAuthorizationUseCase$run$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    startAuthorizationUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = startAuthorizationUseCase$run$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = startAuthorizationUseCase$run$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        gVar = this.e;
                        w1 w1Var = new w1(this);
                        try {
                            startAuthorizationUseCase$run$1.L$0 = this;
                            startAuthorizationUseCase$run$1.L$1 = gVar;
                            startAuthorizationUseCase$run$1.L$2 = w1Var;
                            startAuthorizationUseCase$run$1.label = 1;
                            Object f = f(s0Var, startAuthorizationUseCase$run$1);
                            if (f != coroutineSingletons) {
                                x1Var = this;
                                obj = f;
                                closeable = w1Var;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th) {
                            th = th;
                            s0Var = w1Var;
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ooc.g(s0Var, th);
                                throw th2;
                            }
                        }
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = startAuthorizationUseCase$run$1.L$1;
                        closeable = (Closeable) startAuthorizationUseCase$run$1.L$0;
                        kotlin.b.b(obj2);
                        ooc.g(closeable, null);
                        return new Result(obj);
                    }
                    closeable = (Closeable) startAuthorizationUseCase$run$1.L$2;
                    com.yandex.passport.internal.ui.g gVar2 = (com.yandex.passport.internal.ui.g) startAuthorizationUseCase$run$1.L$1;
                    x1Var = (x1) startAuthorizationUseCase$run$1.L$0;
                    kotlin.b.b(obj2);
                    Object value = ((Result) obj2).getValue();
                    gVar = gVar2;
                    obj = value;
                    a = Result.a(obj);
                    if (a != null) {
                        startAuthorizationUseCase$run$1.L$0 = closeable;
                        startAuthorizationUseCase$run$1.L$1 = obj;
                        startAuthorizationUseCase$run$1.L$2 = null;
                        startAuthorizationUseCase$run$1.label = 2;
                        Object emit = x1Var.b.emit(gVar.a(a), startAuthorizationUseCase$run$1);
                        if (emit != coroutineSingletons) {
                            emit = zy11.a;
                        }
                    }
                    ooc.g(closeable, null);
                    return new Result(obj);
                }
            }
            if (i != 0) {
            }
            a = Result.a(obj);
            if (a != null) {
            }
            ooc.g(closeable, null);
            return new Result(obj);
        } catch (Throwable th3) {
            th = th3;
        }
        startAuthorizationUseCase$run$1 = new StartAuthorizationUseCase$run$1(this, continuationImpl);
        Object obj22 = startAuthorizationUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startAuthorizationUseCase$run$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d8, code lost:
    
        if (r4.d(r1, r0, r7, r8, r9, r10, r11) != r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(s0 s0Var, ContinuationImpl continuationImpl) {
        StartAuthorizationUseCase$startAuthorization$1 startAuthorizationUseCase$startAuthorization$1;
        int i;
        t0 t0Var;
        Environment environment;
        s0 s0Var2 = s0Var;
        if (continuationImpl instanceof StartAuthorizationUseCase$startAuthorization$1) {
            startAuthorizationUseCase$startAuthorization$1 = (StartAuthorizationUseCase$startAuthorization$1) continuationImpl;
            int i2 = startAuthorizationUseCase$startAuthorization$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                startAuthorizationUseCase$startAuthorization$1.label = i2 - Integer.MIN_VALUE;
                StartAuthorizationUseCase$startAuthorization$1 startAuthorizationUseCase$startAuthorization$12 = startAuthorizationUseCase$startAuthorization$1;
                Object obj = startAuthorizationUseCase$startAuthorization$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = startAuthorizationUseCase$startAuthorization$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    try {
                        Environment requireEnvironment = s0Var2.a.requireEnvironment();
                        n1 n1Var = this.f;
                        m1 m1Var = new m1(s0Var2.a.getTrackId(), requireEnvironment);
                        startAuthorizationUseCase$startAuthorization$12.L$0 = this;
                        startAuthorizationUseCase$startAuthorization$12.L$1 = s0Var2;
                        startAuthorizationUseCase$startAuthorization$12.L$2 = requireEnvironment;
                        startAuthorizationUseCase$startAuthorization$12.label = 1;
                        Object a = n1Var.a(m1Var, startAuthorizationUseCase$startAuthorization$12);
                        if (a != coroutineSingletons) {
                            environment = requireEnvironment;
                            obj = a;
                            t0Var = this;
                        }
                        return coroutineSingletons;
                    } catch (Exception e) {
                        e = e;
                        t0Var = this;
                        s0Var2.e.invoke(s0Var2.a, t0Var.e.a(e));
                        return zy11.a;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s0 s0Var3 = (s0) startAuthorizationUseCase$startAuthorization$12.L$1;
                    t0 t0Var2 = (t0) startAuthorizationUseCase$startAuthorization$12.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Exception e2) {
                        e = e2;
                        t0Var = t0Var2;
                        s0Var2 = s0Var3;
                        s0Var2.e.invoke(s0Var2.a, t0Var.e.a(e));
                        return zy11.a;
                    }
                    return zy11.a;
                }
                environment = (Environment) startAuthorizationUseCase$startAuthorization$12.L$2;
                s0Var2 = (s0) startAuthorizationUseCase$startAuthorization$12.L$1;
                t0Var = (t0) startAuthorizationUseCase$startAuthorization$12.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Exception e3) {
                    e = e3;
                    s0Var2.e.invoke(s0Var2.a, t0Var.e.a(e));
                    return zy11.a;
                }
                Object value = ((Result) obj).getValue();
                kotlin.b.b(value);
                String str = (String) value;
                com.yandex.passport.internal.account.c cVar = t0Var.d;
                AuthTrack authTrack = s0Var2.a;
                com.yandex.passport.internal.network.response.f o = cVar.a.a(environment).o(authTrack.requireLogin(), false, false, cVar.c.r(environment), str, authTrack.getProperties().getApplicationPackageName(), authTrack.getProperties().getApplicationVersion());
                AuthTrack withSuggestedLanguage = authTrack.withSuggestedLanguage(str);
                com.yandex.passport.internal.ui.domik.relogin.b bVar = s0Var2.b;
                tls tlsVar = s0Var2.c;
                tls tlsVar2 = s0Var2.d;
                wls wlsVar = s0Var2.e;
                startAuthorizationUseCase$startAuthorization$12.L$0 = t0Var;
                startAuthorizationUseCase$startAuthorization$12.L$1 = s0Var2;
                startAuthorizationUseCase$startAuthorization$12.L$2 = null;
                startAuthorizationUseCase$startAuthorization$12.label = 2;
            }
        }
        startAuthorizationUseCase$startAuthorization$1 = new StartAuthorizationUseCase$startAuthorization$1(this, continuationImpl);
        StartAuthorizationUseCase$startAuthorization$1 startAuthorizationUseCase$startAuthorization$122 = startAuthorizationUseCase$startAuthorization$1;
        Object obj2 = startAuthorizationUseCase$startAuthorization$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startAuthorizationUseCase$startAuthorization$122.label;
        if (i != 0) {
        }
        Object value2 = ((Result) obj2).getValue();
        kotlin.b.b(value2);
        String str2 = (String) value2;
        com.yandex.passport.internal.account.c cVar2 = t0Var.d;
        AuthTrack authTrack2 = s0Var2.a;
        com.yandex.passport.internal.network.response.f o2 = cVar2.a.a(environment).o(authTrack2.requireLogin(), false, false, cVar2.c.r(environment), str2, authTrack2.getProperties().getApplicationPackageName(), authTrack2.getProperties().getApplicationVersion());
        AuthTrack withSuggestedLanguage2 = authTrack2.withSuggestedLanguage(str2);
        com.yandex.passport.internal.ui.domik.relogin.b bVar2 = s0Var2.b;
        tls tlsVar3 = s0Var2.c;
        tls tlsVar22 = s0Var2.d;
        wls wlsVar2 = s0Var2.e;
        startAuthorizationUseCase$startAuthorization$122.L$0 = t0Var;
        startAuthorizationUseCase$startAuthorization$122.L$1 = s0Var2;
        startAuthorizationUseCase$startAuthorization$122.L$2 = null;
        startAuthorizationUseCase$startAuthorization$122.label = 2;
    }
}
