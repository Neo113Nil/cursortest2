package com.yandex.passport.internal.impl;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.CookieManager;
import com.yandex.passport.R;
import com.yandex.passport.api.KPassportStashCell;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.PushPlatform;
import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.exception.PassportActionForbiddenException;
import com.yandex.passport.api.exception.PassportCredentialsNotFoundException;
import com.yandex.passport.api.exception.PassportFailedResponseException;
import com.yandex.passport.api.exception.PassportIOException;
import com.yandex.passport.api.exception.PassportInvalidHostException;
import com.yandex.passport.api.exception.PassportInvalidUrlException;
import com.yandex.passport.api.exception.PassportNoCookieForUidException;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.api.exception.PassportSyncLimitExceededException;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.l2;
import com.yandex.passport.api.n0;
import com.yandex.passport.api.z0;
import com.yandex.passport.common.core.AuthCookie;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.credentials.Credentials;
import com.yandex.passport.internal.entities.ClientToken;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.methods.b2;
import com.yandex.passport.internal.methods.c2;
import com.yandex.passport.internal.methods.d1;
import com.yandex.passport.internal.methods.e2;
import com.yandex.passport.internal.methods.l0;
import com.yandex.passport.internal.methods.m2;
import com.yandex.passport.internal.methods.n2;
import com.yandex.passport.internal.methods.o2;
import com.yandex.passport.internal.methods.p1;
import com.yandex.passport.internal.methods.q0;
import com.yandex.passport.internal.methods.r0;
import com.yandex.passport.internal.methods.requester.CommonRequesterKt$requestMethodOnDefault$2;
import com.yandex.passport.internal.methods.s2;
import com.yandex.passport.internal.methods.service.PassportMethodBinderService;
import com.yandex.passport.internal.methods.u0;
import com.yandex.passport.internal.methods.v2;
import com.yandex.passport.internal.methods.w0;
import com.yandex.passport.internal.methods.x0;
import com.yandex.passport.internal.methods.x1;
import com.yandex.passport.internal.properties.AuthorizationUrlProperties;
import com.yandex.passport.internal.properties.UpdateableProperties;
import com.yandex.passport.internal.properties.z;
import com.yandex.passport.internal.push.PushPayload;
import com.yandex.passport.internal.push.PushPayloadHolder;
import defpackage.b64;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.lfx;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.qoi0;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.v40;
import defpackage.x4e;
import defpackage.xvf0;
import defpackage.zy11;
import io.appmetrica.analytics.IReporterYandex;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class f implements com.yandex.passport.api.b, a {
    public final Context a;
    public final IReporterYandex b;
    public final String c;
    public final boolean d;
    public final com.yandex.passport.internal.methods.requester.f e;
    public final i3y f;
    public final i3y g;
    public final i3y h;
    public final i3y i;

    public f(Context context, IReporterYandex iReporterYandex) {
        this.a = context;
        this.b = iReporterYandex;
        String string = context.getResources().getString(R.string.passport_process_name);
        this.c = string;
        this.d = evu0.J(string);
        this.e = new com.yandex.passport.internal.methods.requester.f(context, new com.yandex.passport.common.network.u(context.getContentResolver(), com.yandex.passport.internal.util.p.l(context.getPackageName())), iReporterYandex);
        final int i = 0;
        this.f = kotlin.a.a(new sls(this) { // from class: com.yandex.passport.internal.impl.b
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                f fVar = this.b;
                switch (i2) {
                    case 0:
                        return new g(fVar);
                    case 1:
                        return new r((g) fVar.f.getValue());
                    case 2:
                        return com.yandex.passport.internal.upgrader.f.a.a(fVar.e, new com.yandex.passport.internal.upgrader.h(fVar.b));
                    default:
                        return new i(fVar.a, fVar);
                }
            }
        });
        final int i2 = 1;
        this.g = kotlin.a.a(new sls(this) { // from class: com.yandex.passport.internal.impl.b
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                f fVar = this.b;
                switch (i22) {
                    case 0:
                        return new g(fVar);
                    case 1:
                        return new r((g) fVar.f.getValue());
                    case 2:
                        return com.yandex.passport.internal.upgrader.f.a.a(fVar.e, new com.yandex.passport.internal.upgrader.h(fVar.b));
                    default:
                        return new i(fVar.a, fVar);
                }
            }
        });
        final int i3 = 2;
        this.h = kotlin.a.a(new sls(this) { // from class: com.yandex.passport.internal.impl.b
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                f fVar = this.b;
                switch (i22) {
                    case 0:
                        return new g(fVar);
                    case 1:
                        return new r((g) fVar.f.getValue());
                    case 2:
                        return com.yandex.passport.internal.upgrader.f.a.a(fVar.e, new com.yandex.passport.internal.upgrader.h(fVar.b));
                    default:
                        return new i(fVar.a, fVar);
                }
            }
        });
        final int i4 = 3;
        this.i = kotlin.a.a(new sls(this) { // from class: com.yandex.passport.internal.impl.b
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                f fVar = this.b;
                switch (i22) {
                    case 0:
                        return new g(fVar);
                    case 1:
                        return new r((g) fVar.f.getValue());
                    case 2:
                        return com.yandex.passport.internal.upgrader.f.a.a(fVar.e, new com.yandex.passport.internal.upgrader.h(fVar.b));
                    default:
                        return new i(fVar.a, fVar);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.yandex.passport.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(String str, ContinuationImpl continuationImpl) {
        KPassportApiImpl$dropToken$1 kPassportApiImpl$dropToken$1;
        int i;
        Throwable a;
        try {
            if (continuationImpl instanceof KPassportApiImpl$dropToken$1) {
                kPassportApiImpl$dropToken$1 = (KPassportApiImpl$dropToken$1) continuationImpl;
                int i2 = kPassportApiImpl$dropToken$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportApiImpl$dropToken$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportApiImpl$dropToken$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportApiImpl$dropToken$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        x();
                        if (evu0.J(str)) {
                            G(0L, "dropToken");
                        }
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(this.e, new l0(new ClientToken(str, "")), new lfx[0], null);
                        kPassportApiImpl$dropToken$1.L$0 = this;
                        kPassportApiImpl$dropToken$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportApiImpl$dropToken$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (f) kPassportApiImpl$dropToken$1.L$0;
                        kotlin.b.b(obj);
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
        kPassportApiImpl$dropToken$1 = new KPassportApiImpl$dropToken$1(this, continuationImpl);
        Object obj2 = kPassportApiImpl$dropToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$dropToken$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(k2 k2Var, Uri uri, Continuation continuation) {
        KPassportApiImpl$acceptAuthInTrack$1 kPassportApiImpl$acceptAuthInTrack$1;
        int i;
        Throwable a;
        try {
            if (continuation instanceof KPassportApiImpl$acceptAuthInTrack$1) {
                kPassportApiImpl$acceptAuthInTrack$1 = (KPassportApiImpl$acceptAuthInTrack$1) continuation;
                int i2 = kPassportApiImpl$acceptAuthInTrack$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportApiImpl$acceptAuthInTrack$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportApiImpl$acceptAuthInTrack$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportApiImpl$acceptAuthInTrack$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        x();
                        com.yandex.passport.internal.methods.requester.f fVar = this.e;
                        PassportUidImpl.Companion.getClass();
                        com.yandex.passport.internal.methods.v vVar = new com.yandex.passport.internal.methods.v(l2.a(k2Var), uri);
                        lfx[] lfxVarArr = {qoi0.a(PassportIOException.class), qoi0.a(PassportFailedResponseException.class), qoi0.a(PassportAccountNotFoundException.class), qoi0.a(PassportAccountNotAuthorizedException.class), qoi0.a(PassportInvalidUrlException.class)};
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar, vVar, lfxVarArr, null);
                        kPassportApiImpl$acceptAuthInTrack$1.L$0 = this;
                        kPassportApiImpl$acceptAuthInTrack$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportApiImpl$acceptAuthInTrack$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (f) kPassportApiImpl$acceptAuthInTrack$1.L$0;
                        kotlin.b.b(obj);
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
        kPassportApiImpl$acceptAuthInTrack$1 = new KPassportApiImpl$acceptAuthInTrack$1(this, (ContinuationImpl) continuation);
        Object obj2 = kPassportApiImpl$acceptAuthInTrack$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$acceptAuthInTrack$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(Continuation continuation) {
        KPassportApiImpl$disableVpnBlocker$1 kPassportApiImpl$disableVpnBlocker$1;
        int i;
        Throwable a;
        try {
            if (continuation instanceof KPassportApiImpl$disableVpnBlocker$1) {
                kPassportApiImpl$disableVpnBlocker$1 = (KPassportApiImpl$disableVpnBlocker$1) continuation;
                int i2 = kPassportApiImpl$disableVpnBlocker$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportApiImpl$disableVpnBlocker$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportApiImpl$disableVpnBlocker$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportApiImpl$disableVpnBlocker$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        x();
                        com.yandex.passport.internal.methods.requester.f fVar = this.e;
                        n2 n2Var = new n2(true);
                        lfx[] lfxVarArr = {qoi0.a(PassportActionForbiddenException.class), qoi0.a(PassportRuntimeUnknownException.class)};
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar, n2Var, lfxVarArr, null);
                        kPassportApiImpl$disableVpnBlocker$1.L$0 = this;
                        kPassportApiImpl$disableVpnBlocker$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportApiImpl$disableVpnBlocker$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (f) kPassportApiImpl$disableVpnBlocker$1.L$0;
                        kotlin.b.b(obj);
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
        kPassportApiImpl$disableVpnBlocker$1 = new KPassportApiImpl$disableVpnBlocker$1(this, (ContinuationImpl) continuation);
        Object obj2 = kPassportApiImpl$disableVpnBlocker$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$disableVpnBlocker$1.label;
    }

    @Override // com.yandex.passport.api.b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final i a() {
        return (i) this.i.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(k2 k2Var, n0 n0Var, ContinuationImpl continuationImpl) {
        KPassportApiImpl$getTokenInternal$1 kPassportApiImpl$getTokenInternal$1;
        int i;
        Credentials credentials;
        f fVar;
        Object value;
        Object failure;
        ClientToken clientToken;
        Throwable a;
        try {
            if (continuationImpl instanceof KPassportApiImpl$getTokenInternal$1) {
                kPassportApiImpl$getTokenInternal$1 = (KPassportApiImpl$getTokenInternal$1) continuationImpl;
                int i2 = kPassportApiImpl$getTokenInternal$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportApiImpl$getTokenInternal$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportApiImpl$getTokenInternal$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportApiImpl$getTokenInternal$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        x();
                        com.yandex.passport.internal.methods.requester.f fVar2 = this.e;
                        PassportUidImpl.Companion.getClass();
                        PassportUidImpl a2 = l2.a(k2Var);
                        if (n0Var != null) {
                            ClientCredentials.Factory.getClass();
                            credentials = new Credentials(n0Var.getEncryptedId(), n0Var.getEncryptedSecret());
                        } else {
                            credentials = null;
                        }
                        p1 p1Var = new p1(a2, credentials);
                        lfx[] lfxVarArr = {qoi0.a(PassportAccountNotFoundException.class), qoi0.a(PassportAccountNotAuthorizedException.class), qoi0.a(PassportCredentialsNotFoundException.class), qoi0.a(PassportActionForbiddenException.class), qoi0.a(PassportIOException.class), qoi0.a(PassportRuntimeUnknownException.class)};
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar2, p1Var, lfxVarArr, null);
                        kPassportApiImpl$getTokenInternal$1.L$0 = this;
                        kPassportApiImpl$getTokenInternal$1.L$1 = k2Var;
                        kPassportApiImpl$getTokenInternal$1.L$2 = this;
                        kPassportApiImpl$getTokenInternal$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportApiImpl$getTokenInternal$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        fVar = this;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (f) kPassportApiImpl$getTokenInternal$1.L$2;
                        k2Var = (k2) kPassportApiImpl$getTokenInternal$1.L$1;
                        fVar = (f) kPassportApiImpl$getTokenInternal$1.L$0;
                        kotlin.b.b(obj);
                    }
                    value = ((Result) obj).getValue();
                    if (!(value instanceof Result.Failure)) {
                        try {
                            clientToken = (ClientToken) value;
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        if (evu0.J(clientToken.getValue())) {
                            fVar.G(k2Var.getValue(), "getToken");
                            throw new PassportAccountNotAuthorizedException();
                        }
                        failure = new com.yandex.passport.api.f(clientToken.m301getKPassportTokenH85nsjE());
                        value = failure;
                    }
                    a = Result.a(value);
                    if (a != null && (a instanceof RuntimeException)) {
                        this.k((RuntimeException) a);
                    }
                    return value;
                }
            }
            if (i != 0) {
            }
            value = ((Result) obj).getValue();
            if (!(value instanceof Result.Failure)) {
            }
            a = Result.a(value);
            if (a != null) {
                this.k((RuntimeException) a);
            }
            return value;
        } catch (RuntimeException e) {
            this.k(e);
            throw e;
        }
        kPassportApiImpl$getTokenInternal$1 = new KPassportApiImpl$getTokenInternal$1(this, continuationImpl);
        Object obj2 = kPassportApiImpl$getTokenInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$getTokenInternal$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f A[Catch: RuntimeException -> 0x0038, TryCatch #0 {RuntimeException -> 0x0038, blocks: (B:11:0x0032, B:13:0x0075, B:15:0x007f, B:17:0x008c), top: B:10:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac A[Catch: RuntimeException -> 0x0099, TryCatch #1 {RuntimeException -> 0x0099, blocks: (B:20:0x009e, B:22:0x00ac, B:24:0x00b0, B:37:0x0047, B:39:0x004e), top: B:36:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(String str, Bundle bundle, ContinuationImpl continuationImpl) {
        KPassportApiImpl$onPushMessageReceivedInner$1 kPassportApiImpl$onPushMessageReceivedInner$1;
        int i;
        long elapsedRealtimeNanos;
        Bundle bundle2;
        f fVar;
        Throwable a;
        Object value;
        if (continuationImpl instanceof KPassportApiImpl$onPushMessageReceivedInner$1) {
            kPassportApiImpl$onPushMessageReceivedInner$1 = (KPassportApiImpl$onPushMessageReceivedInner$1) continuationImpl;
            int i2 = kPassportApiImpl$onPushMessageReceivedInner$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kPassportApiImpl$onPushMessageReceivedInner$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kPassportApiImpl$onPushMessageReceivedInner$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kPassportApiImpl$onPushMessageReceivedInner$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    x();
                    try {
                        if (!com.yandex.passport.internal.properties.u.B(bundle, str)) {
                            z = false;
                            Object d = d6z.d(Boolean.valueOf(z));
                            a = Result.a(d);
                            if (a != null && (a instanceof RuntimeException)) {
                                this.k((RuntimeException) a);
                            }
                            return d;
                        }
                        elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(this.e, new c2(str, bundle), new lfx[0], null);
                        kPassportApiImpl$onPushMessageReceivedInner$1.L$0 = this;
                        kPassportApiImpl$onPushMessageReceivedInner$1.L$1 = bundle;
                        kPassportApiImpl$onPushMessageReceivedInner$1.L$2 = this;
                        kPassportApiImpl$onPushMessageReceivedInner$1.J$0 = elapsedRealtimeNanos;
                        kPassportApiImpl$onPushMessageReceivedInner$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportApiImpl$onPushMessageReceivedInner$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        bundle2 = bundle;
                        fVar = this;
                    } catch (RuntimeException e) {
                        fVar = this;
                        e = e;
                        fVar.k(e);
                        throw e;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j = kPassportApiImpl$onPushMessageReceivedInner$1.J$0;
                    fVar = (f) kPassportApiImpl$onPushMessageReceivedInner$1.L$2;
                    bundle2 = (Bundle) kPassportApiImpl$onPushMessageReceivedInner$1.L$1;
                    f fVar2 = (f) kPassportApiImpl$onPushMessageReceivedInner$1.L$0;
                    try {
                        kotlin.b.b(obj);
                        elapsedRealtimeNanos = j;
                        this = fVar2;
                    } catch (RuntimeException e2) {
                        e = e2;
                        fVar.k(e);
                        throw e;
                    }
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    PushPayloadHolder pushPayloadHolder = (PushPayloadHolder) value;
                    com.yandex.passport.internal.properties.u.F(this.b, bundle2, elapsedRealtimeNanos, pushPayloadHolder);
                    PushPayload pushPayload = pushPayloadHolder.getPushPayload();
                    if (pushPayload != null) {
                        com.yandex.passport.internal.push.n0.c.b(this.a).b(pushPayload);
                    }
                }
                this = fVar;
                Object d2 = d6z.d(Boolean.valueOf(z));
                a = Result.a(d2);
                if (a != null) {
                    this.k((RuntimeException) a);
                }
                return d2;
            }
        }
        kPassportApiImpl$onPushMessageReceivedInner$1 = new KPassportApiImpl$onPushMessageReceivedInner$1(this, continuationImpl);
        Object obj2 = kPassportApiImpl$onPushMessageReceivedInner$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$onPushMessageReceivedInner$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        this = fVar;
        Object d22 = d6z.d(Boolean.valueOf(z2));
        a = Result.a(d22);
        if (a != null) {
        }
        return d22;
    }

    public final void G(long j, String str) {
        HashMap p = x4e.p(PassportMethodBinderService.KEY_METHOD_NAME, str);
        p.put("uid", String.valueOf(j));
        p.put("am_version", "7.55.1");
        this.b.reportEvent(com.yandex.passport.internal.analytics.l.h.a, p);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(k2 k2Var, ContinuationImpl continuationImpl) {
        KPassportApiImpl$setOrResetCurrentAccount$1 kPassportApiImpl$setOrResetCurrentAccount$1;
        int i;
        PassportUidImpl passportUidImpl;
        Throwable a;
        try {
            if (continuationImpl instanceof KPassportApiImpl$setOrResetCurrentAccount$1) {
                kPassportApiImpl$setOrResetCurrentAccount$1 = (KPassportApiImpl$setOrResetCurrentAccount$1) continuationImpl;
                int i2 = kPassportApiImpl$setOrResetCurrentAccount$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportApiImpl$setOrResetCurrentAccount$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportApiImpl$setOrResetCurrentAccount$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportApiImpl$setOrResetCurrentAccount$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        x();
                        com.yandex.passport.internal.methods.requester.f fVar = this.e;
                        if (k2Var != null) {
                            PassportUidImpl.Companion.getClass();
                            passportUidImpl = l2.a(k2Var);
                        } else {
                            passportUidImpl = null;
                        }
                        m2 m2Var = new m2(passportUidImpl);
                        lfx[] lfxVarArr = {qoi0.a(PassportAccountNotFoundException.class)};
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar, m2Var, lfxVarArr, null);
                        kPassportApiImpl$setOrResetCurrentAccount$1.L$0 = this;
                        kPassportApiImpl$setOrResetCurrentAccount$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportApiImpl$setOrResetCurrentAccount$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (f) kPassportApiImpl$setOrResetCurrentAccount$1.L$0;
                        kotlin.b.b(obj);
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
        kPassportApiImpl$setOrResetCurrentAccount$1 = new KPassportApiImpl$setOrResetCurrentAccount$1(this, continuationImpl);
        Object obj2 = kPassportApiImpl$setOrResetCurrentAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$setOrResetCurrentAccount$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I(k2 k2Var, ContinuationImpl continuationImpl) {
        KPassportApiImpl$trySetCurrentAccount$1 kPassportApiImpl$trySetCurrentAccount$1;
        int i;
        if (continuationImpl instanceof KPassportApiImpl$trySetCurrentAccount$1) {
            kPassportApiImpl$trySetCurrentAccount$1 = (KPassportApiImpl$trySetCurrentAccount$1) continuationImpl;
            int i2 = kPassportApiImpl$trySetCurrentAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kPassportApiImpl$trySetCurrentAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kPassportApiImpl$trySetCurrentAccount$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kPassportApiImpl$trySetCurrentAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kPassportApiImpl$trySetCurrentAccount$1.label = 1;
                    Object H = H(k2Var, kPassportApiImpl$trySetCurrentAccount$1);
                    return H == obj2 ? obj2 : H;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        kPassportApiImpl$trySetCurrentAccount$1 = new KPassportApiImpl$trySetCurrentAccount$1(this, continuationImpl);
        Object obj3 = kPassportApiImpl$trySetCurrentAccount$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$trySetCurrentAccount$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J(k2 k2Var, String str, boolean z, ContinuationImpl continuationImpl) {
        KPassportApiImpl$updateCookieWrapper$1 kPassportApiImpl$updateCookieWrapper$1;
        int i;
        Throwable a;
        try {
            if (continuationImpl instanceof KPassportApiImpl$updateCookieWrapper$1) {
                kPassportApiImpl$updateCookieWrapper$1 = (KPassportApiImpl$updateCookieWrapper$1) continuationImpl;
                int i2 = kPassportApiImpl$updateCookieWrapper$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportApiImpl$updateCookieWrapper$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportApiImpl$updateCookieWrapper$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportApiImpl$updateCookieWrapper$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        x();
                        com.yandex.passport.internal.methods.requester.f fVar = this.e;
                        PassportUidImpl.Companion.getClass();
                        s2 s2Var = new s2(l2.a(k2Var), str, z);
                        lfx[] lfxVarArr = {qoi0.a(PassportAccountNotAuthorizedException.class), qoi0.a(PassportAccountNotFoundException.class), qoi0.a(PassportFailedResponseException.class), qoi0.a(PassportIOException.class), qoi0.a(PassportRuntimeUnknownException.class), qoi0.a(PassportInvalidHostException.class)};
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar, s2Var, lfxVarArr, null);
                        kPassportApiImpl$updateCookieWrapper$1.L$0 = this;
                        kPassportApiImpl$updateCookieWrapper$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportApiImpl$updateCookieWrapper$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (f) kPassportApiImpl$updateCookieWrapper$1.L$0;
                        kotlin.b.b(obj);
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
        kPassportApiImpl$updateCookieWrapper$1 = new KPassportApiImpl$updateCookieWrapper$1(this, continuationImpl);
        Object obj2 = kPassportApiImpl$updateCookieWrapper$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$updateCookieWrapper$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.yandex.passport.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PassportUidImpl passportUidImpl, Continuation continuation) {
        KPassportApiImpl$getToken$1 kPassportApiImpl$getToken$1;
        int i;
        if (continuation instanceof KPassportApiImpl$getToken$1) {
            kPassportApiImpl$getToken$1 = (KPassportApiImpl$getToken$1) continuation;
            int i2 = kPassportApiImpl$getToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kPassportApiImpl$getToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kPassportApiImpl$getToken$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kPassportApiImpl$getToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kPassportApiImpl$getToken$1.label = 1;
                    Object E = E(passportUidImpl, null, kPassportApiImpl$getToken$1);
                    return E == obj2 ? obj2 : E;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        kPassportApiImpl$getToken$1 = new KPassportApiImpl$getToken$1(this, (ContinuationImpl) continuation);
        Object obj3 = kPassportApiImpl$getToken$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$getToken$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(k2 k2Var, String str, ContinuationImpl continuationImpl) {
        KPassportApiImpl$updateCookie$1 kPassportApiImpl$updateCookie$1;
        int i;
        if (continuationImpl instanceof KPassportApiImpl$updateCookie$1) {
            kPassportApiImpl$updateCookie$1 = (KPassportApiImpl$updateCookie$1) continuationImpl;
            int i2 = kPassportApiImpl$updateCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kPassportApiImpl$updateCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kPassportApiImpl$updateCookie$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kPassportApiImpl$updateCookie$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kPassportApiImpl$updateCookie$1.label = 1;
                    Object J = J(k2Var, str, true, kPassportApiImpl$updateCookie$1);
                    return J == obj2 ? obj2 : J;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        kPassportApiImpl$updateCookie$1 = new KPassportApiImpl$updateCookie$1(this, continuationImpl);
        Object obj3 = kPassportApiImpl$updateCookie$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$updateCookie$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0096 A[Catch: RuntimeException -> 0x002c, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x002c, blocks: (B:11:0x0028, B:12:0x008c, B:14:0x0096, B:25:0x00c1, B:26:0x00c6, B:28:0x00ca, B:29:0x00ce, B:31:0x00d4, B:33:0x00d8, B:40:0x003b, B:16:0x0099, B:17:0x00a7, B:19:0x00ad, B:21:0x00bd), top: B:7:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca A[Catch: RuntimeException -> 0x002c, TryCatch #1 {RuntimeException -> 0x002c, blocks: (B:11:0x0028, B:12:0x008c, B:14:0x0096, B:25:0x00c1, B:26:0x00c6, B:28:0x00ca, B:29:0x00ce, B:31:0x00d4, B:33:0x00d8, B:40:0x003b, B:16:0x0099, B:17:0x00a7, B:19:0x00ad, B:21:0x00bd), top: B:7:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.yandex.passport.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(k2 k2Var, String str, ContinuationImpl continuationImpl) {
        KPassportApiImpl$injectCookie$1 kPassportApiImpl$injectCookie$1;
        int i;
        Object value;
        Throwable a;
        try {
            if (continuationImpl instanceof KPassportApiImpl$injectCookie$1) {
                kPassportApiImpl$injectCookie$1 = (KPassportApiImpl$injectCookie$1) continuationImpl;
                int i2 = kPassportApiImpl$injectCookie$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportApiImpl$injectCookie$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportApiImpl$injectCookie$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportApiImpl$injectCookie$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        x();
                        com.yandex.passport.internal.methods.requester.f fVar = this.e;
                        PassportUidImpl.Companion.getClass();
                        w0 w0Var = new w0(l2.a(k2Var), str);
                        lfx[] lfxVarArr = {qoi0.a(PassportFailedResponseException.class), qoi0.a(PassportIOException.class), qoi0.a(PassportRuntimeUnknownException.class), qoi0.a(PassportNoCookieForUidException.class), qoi0.a(PassportInvalidHostException.class)};
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar, w0Var, lfxVarArr, null);
                        kPassportApiImpl$injectCookie$1.L$0 = this;
                        kPassportApiImpl$injectCookie$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportApiImpl$injectCookie$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (f) kPassportApiImpl$injectCookie$1.L$0;
                        kotlin.b.b(obj);
                    }
                    value = ((Result) obj).getValue();
                    if (!(value instanceof Result.Failure)) {
                        AuthCookie authCookie = (AuthCookie) value;
                        try {
                            CookieManager cookieManager = CookieManager.getInstance();
                            Iterator<T> it = authCookie.getCookies().iterator();
                            while (it.hasNext()) {
                                cookieManager.setCookie(authCookie.getDomain(), (String) it.next());
                            }
                            cookieManager.flush();
                        } catch (Exception e) {
                            new PassportRuntimeUnknownException(e);
                        }
                    }
                    if (!(value instanceof Result.Failure)) {
                        value = zy11.a;
                    }
                    a = Result.a(value);
                    if (a != null && (a instanceof RuntimeException)) {
                        this.k((RuntimeException) a);
                    }
                    return value;
                }
            }
            if (i != 0) {
            }
            value = ((Result) obj).getValue();
            if (!(value instanceof Result.Failure)) {
            }
            if (!(value instanceof Result.Failure)) {
            }
            a = Result.a(value);
            if (a != null) {
                this.k((RuntimeException) a);
            }
            return value;
        } catch (RuntimeException e2) {
            this.k(e2);
            throw e2;
        }
        kPassportApiImpl$injectCookie$1 = new KPassportApiImpl$injectCookie$1(this, continuationImpl);
        Object obj2 = kPassportApiImpl$injectCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$injectCookie$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.yandex.passport.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(PassportUidImpl passportUidImpl, Continuation continuation) {
        KPassportApiImpl$performSync$1 kPassportApiImpl$performSync$1;
        int i;
        Throwable a;
        try {
            if (continuation instanceof KPassportApiImpl$performSync$1) {
                kPassportApiImpl$performSync$1 = (KPassportApiImpl$performSync$1) continuation;
                int i2 = kPassportApiImpl$performSync$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportApiImpl$performSync$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportApiImpl$performSync$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportApiImpl$performSync$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        x();
                        com.yandex.passport.internal.methods.requester.f fVar = this.e;
                        PassportUidImpl.Companion.getClass();
                        e2 e2Var = new e2(l2.a(passportUidImpl));
                        lfx[] lfxVarArr = {qoi0.a(PassportIOException.class), qoi0.a(PassportFailedResponseException.class), qoi0.a(PassportAccountNotFoundException.class), qoi0.a(PassportSyncLimitExceededException.class), qoi0.a(PassportAccountNotAuthorizedException.class)};
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar, e2Var, lfxVarArr, null);
                        kPassportApiImpl$performSync$1.L$0 = this;
                        kPassportApiImpl$performSync$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportApiImpl$performSync$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (f) kPassportApiImpl$performSync$1.L$0;
                        kotlin.b.b(obj);
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
        kPassportApiImpl$performSync$1 = new KPassportApiImpl$performSync$1(this, (ContinuationImpl) continuation);
        Object obj2 = kPassportApiImpl$performSync$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$performSync$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, Map map, Continuation continuation) {
        KPassportApiImpl$onPushMessageReceived$2 kPassportApiImpl$onPushMessageReceived$2;
        int i;
        if (continuation instanceof KPassportApiImpl$onPushMessageReceived$2) {
            kPassportApiImpl$onPushMessageReceived$2 = (KPassportApiImpl$onPushMessageReceived$2) continuation;
            int i2 = kPassportApiImpl$onPushMessageReceived$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kPassportApiImpl$onPushMessageReceived$2.label = i2 - Integer.MIN_VALUE;
                Object obj = kPassportApiImpl$onPushMessageReceived$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kPassportApiImpl$onPushMessageReceived$2.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Bundle I = com.yandex.passport.internal.properties.u.I(map);
                kPassportApiImpl$onPushMessageReceived$2.label = 1;
                Object F = F(str, I, kPassportApiImpl$onPushMessageReceived$2);
                return F == obj2 ? obj2 : F;
            }
        }
        kPassportApiImpl$onPushMessageReceived$2 = new KPassportApiImpl$onPushMessageReceived$2(this, (ContinuationImpl) continuation);
        Object obj3 = kPassportApiImpl$onPushMessageReceived$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$onPushMessageReceived$2.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.yandex.passport.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(k2 k2Var, ContinuationImpl continuationImpl) {
        KPassportApiImpl$getAccount$1 kPassportApiImpl$getAccount$1;
        int i;
        Throwable a;
        try {
            if (continuationImpl instanceof KPassportApiImpl$getAccount$1) {
                kPassportApiImpl$getAccount$1 = (KPassportApiImpl$getAccount$1) continuationImpl;
                int i2 = kPassportApiImpl$getAccount$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportApiImpl$getAccount$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportApiImpl$getAccount$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportApiImpl$getAccount$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        x();
                        com.yandex.passport.internal.methods.requester.f fVar = this.e;
                        PassportUidImpl.Companion.getClass();
                        q0 q0Var = new q0(l2.a(k2Var));
                        lfx[] lfxVarArr = {qoi0.a(PassportAccountNotFoundException.class)};
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar, q0Var, lfxVarArr, null);
                        kPassportApiImpl$getAccount$1.L$0 = this;
                        kPassportApiImpl$getAccount$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportApiImpl$getAccount$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (f) kPassportApiImpl$getAccount$1.L$0;
                        kotlin.b.b(obj);
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
        kPassportApiImpl$getAccount$1 = new KPassportApiImpl$getAccount$1(this, continuationImpl);
        Object obj2 = kPassportApiImpl$getAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$getAccount$1.label;
    }

    @Override // com.yandex.passport.api.b
    public final void h() {
    }

    @Override // com.yandex.passport.api.b
    public final com.yandex.passport.internal.r i() {
        tpr tprVar;
        com.yandex.passport.internal.provider.communication.e eVar;
        com.yandex.passport.internal.flags.experiments.o oVar = com.yandex.passport.internal.provider.communication.p.a;
        if (oVar == null || (eVar = (com.yandex.passport.internal.provider.communication.e) ((xvf0) oVar.a).get()) == null || (tprVar = eVar.b) == null) {
            tprVar = pvn.a;
        }
        return new com.yandex.passport.internal.r(kotlinx.coroutines.flow.e.t(tprVar), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.yandex.passport.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(PushPlatform pushPlatform, Continuation continuation) {
        KPassportApiImpl$onNewPushToken$1 kPassportApiImpl$onNewPushToken$1;
        int i;
        Throwable a;
        try {
            if (continuation instanceof KPassportApiImpl$onNewPushToken$1) {
                kPassportApiImpl$onNewPushToken$1 = (KPassportApiImpl$onNewPushToken$1) continuation;
                int i2 = kPassportApiImpl$onNewPushToken$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportApiImpl$onNewPushToken$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportApiImpl$onNewPushToken$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportApiImpl$onNewPushToken$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        x();
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(this.e, new b2(pushPlatform, null), new lfx[0], null);
                        kPassportApiImpl$onNewPushToken$1.L$0 = this;
                        kPassportApiImpl$onNewPushToken$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportApiImpl$onNewPushToken$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (f) kPassportApiImpl$onNewPushToken$1.L$0;
                        kotlin.b.b(obj);
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
        kPassportApiImpl$onNewPushToken$1 = new KPassportApiImpl$onNewPushToken$1(this, (ContinuationImpl) continuation);
        Object obj2 = kPassportApiImpl$onNewPushToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$onNewPushToken$1.label;
    }

    @Override // com.yandex.passport.internal.impl.a
    public final void k(RuntimeException runtimeException) {
        this.b.reportError("error", runtimeException);
    }

    @Override // com.yandex.passport.api.b
    public final o l(v40 v40Var, tse tseVar) {
        return new o(t(), (g) this.f.getValue(), v40Var, tseVar, a(), this, this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(k2 k2Var, String str, Continuation continuation) {
        KPassportApiImpl$ensureCookie$1 kPassportApiImpl$ensureCookie$1;
        int i;
        if (continuation instanceof KPassportApiImpl$ensureCookie$1) {
            kPassportApiImpl$ensureCookie$1 = (KPassportApiImpl$ensureCookie$1) continuation;
            int i2 = kPassportApiImpl$ensureCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kPassportApiImpl$ensureCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kPassportApiImpl$ensureCookie$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kPassportApiImpl$ensureCookie$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kPassportApiImpl$ensureCookie$1.label = 1;
                    Object J = J(k2Var, str, false, kPassportApiImpl$ensureCookie$1);
                    return J == obj2 ? obj2 : J;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        kPassportApiImpl$ensureCookie$1 = new KPassportApiImpl$ensureCookie$1(this, (ContinuationImpl) continuation);
        Object obj3 = kPassportApiImpl$ensureCookie$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$ensureCookie$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.yandex.passport.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(k2 k2Var, KPassportStashCell kPassportStashCell, String str, Continuation continuation) {
        KPassportApiImpl$stashValue$1 kPassportApiImpl$stashValue$1;
        int i;
        Throwable a;
        try {
            if (continuation instanceof KPassportApiImpl$stashValue$1) {
                kPassportApiImpl$stashValue$1 = (KPassportApiImpl$stashValue$1) continuation;
                int i2 = kPassportApiImpl$stashValue$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportApiImpl$stashValue$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportApiImpl$stashValue$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportApiImpl$stashValue$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        x();
                        com.yandex.passport.internal.methods.requester.f fVar = this.e;
                        PassportUidImpl.Companion.getClass();
                        o2 o2Var = new o2(l2.a(k2Var), kPassportStashCell.getValue(), str);
                        lfx[] lfxVarArr = {qoi0.a(PassportAccountNotFoundException.class)};
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar, o2Var, lfxVarArr, null);
                        kPassportApiImpl$stashValue$1.L$0 = this;
                        kPassportApiImpl$stashValue$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportApiImpl$stashValue$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (f) kPassportApiImpl$stashValue$1.L$0;
                        kotlin.b.b(obj);
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
        kPassportApiImpl$stashValue$1 = new KPassportApiImpl$stashValue$1(this, (ContinuationImpl) continuation);
        Object obj2 = kPassportApiImpl$stashValue$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$stashValue$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.yandex.passport.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(z0 z0Var, Continuation continuation) {
        KPassportApiImpl$getAccounts$2 kPassportApiImpl$getAccounts$2;
        int i;
        Throwable a;
        try {
            if (continuation instanceof KPassportApiImpl$getAccounts$2) {
                kPassportApiImpl$getAccounts$2 = (KPassportApiImpl$getAccounts$2) continuation;
                int i2 = kPassportApiImpl$getAccounts$2.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportApiImpl$getAccounts$2.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportApiImpl$getAccounts$2.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportApiImpl$getAccounts$2.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        x();
                        com.yandex.passport.internal.methods.requester.f fVar = this.e;
                        Filter.Companion.getClass();
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar, new u0(com.yandex.passport.internal.entities.f.a(z0Var)), new lfx[0], null);
                        kPassportApiImpl$getAccounts$2.L$0 = this;
                        kPassportApiImpl$getAccounts$2.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportApiImpl$getAccounts$2);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (f) kPassportApiImpl$getAccounts$2.L$0;
                        kotlin.b.b(obj);
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
        kPassportApiImpl$getAccounts$2 = new KPassportApiImpl$getAccounts$2(this, (ContinuationImpl) continuation);
        Object obj2 = kPassportApiImpl$getAccounts$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$getAccounts$2.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.yandex.passport.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(tls tlsVar, ContinuationImpl continuationImpl) {
        KPassportApiImpl$getAuthorizationUrl$1 kPassportApiImpl$getAuthorizationUrl$1;
        int i;
        Throwable a;
        try {
            if (continuationImpl instanceof KPassportApiImpl$getAuthorizationUrl$1) {
                kPassportApiImpl$getAuthorizationUrl$1 = (KPassportApiImpl$getAuthorizationUrl$1) continuationImpl;
                int i2 = kPassportApiImpl$getAuthorizationUrl$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportApiImpl$getAuthorizationUrl$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportApiImpl$getAuthorizationUrl$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportApiImpl$getAuthorizationUrl$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        x();
                        com.yandex.passport.internal.methods.requester.f fVar = this.e;
                        com.yandex.passport.internal.properties.d dVar = AuthorizationUrlProperties.Companion;
                        AuthorizationUrlProperties.a aVar = new AuthorizationUrlProperties.a();
                        tlsVar.invoke(aVar);
                        dVar.getClass();
                        x0 x0Var = new x0(com.yandex.passport.internal.properties.d.a(aVar));
                        lfx[] lfxVarArr = {qoi0.a(PassportAccountNotFoundException.class), qoi0.a(PassportAccountNotAuthorizedException.class), qoi0.a(PassportIOException.class)};
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar, x0Var, lfxVarArr, null);
                        kPassportApiImpl$getAuthorizationUrl$1.L$0 = this;
                        kPassportApiImpl$getAuthorizationUrl$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportApiImpl$getAuthorizationUrl$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (f) kPassportApiImpl$getAuthorizationUrl$1.L$0;
                        kotlin.b.b(obj);
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
        kPassportApiImpl$getAuthorizationUrl$1 = new KPassportApiImpl$getAuthorizationUrl$1(this, continuationImpl);
        Object obj2 = kPassportApiImpl$getAuthorizationUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$getAuthorizationUrl$1.label;
    }

    @Override // com.yandex.passport.api.b
    public final com.yandex.passport.internal.upgrader.g q() {
        return (com.yandex.passport.internal.upgrader.g) this.h.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.yandex.passport.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Continuation continuation) {
        KPassportApiImpl$getCurrentAccount$1 kPassportApiImpl$getCurrentAccount$1;
        int i;
        Throwable a;
        try {
            if (continuation instanceof KPassportApiImpl$getCurrentAccount$1) {
                kPassportApiImpl$getCurrentAccount$1 = (KPassportApiImpl$getCurrentAccount$1) continuation;
                int i2 = kPassportApiImpl$getCurrentAccount$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportApiImpl$getCurrentAccount$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportApiImpl$getCurrentAccount$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportApiImpl$getCurrentAccount$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        x();
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(this.e, d1.b, new lfx[0], null);
                        kPassportApiImpl$getCurrentAccount$1.L$0 = this;
                        kPassportApiImpl$getCurrentAccount$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportApiImpl$getCurrentAccount$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (f) kPassportApiImpl$getCurrentAccount$1.L$0;
                        kotlin.b.b(obj);
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
        kPassportApiImpl$getCurrentAccount$1 = new KPassportApiImpl$getCurrentAccount$1(this, (ContinuationImpl) continuation);
        Object obj2 = kPassportApiImpl$getCurrentAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$getCurrentAccount$1.label;
    }

    @Override // com.yandex.passport.api.b
    public final com.yandex.passport.api.c s() {
        return new com.yandex.passport.api.c(this.a, this.b);
    }

    @Override // com.yandex.passport.api.b
    public final r t() {
        return (r) this.g.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.yandex.passport.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(PassportUidImpl passportUidImpl, Continuation continuation) {
        KPassportApiImpl$isXTokenValid$1 kPassportApiImpl$isXTokenValid$1;
        int i;
        Throwable a;
        try {
            if (continuation instanceof KPassportApiImpl$isXTokenValid$1) {
                kPassportApiImpl$isXTokenValid$1 = (KPassportApiImpl$isXTokenValid$1) continuation;
                int i2 = kPassportApiImpl$isXTokenValid$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportApiImpl$isXTokenValid$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportApiImpl$isXTokenValid$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportApiImpl$isXTokenValid$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        x();
                        com.yandex.passport.internal.methods.requester.f fVar = this.e;
                        PassportUidImpl.Companion.getClass();
                        x1 x1Var = new x1(l2.a(passportUidImpl));
                        lfx[] lfxVarArr = {qoi0.a(PassportAccountNotFoundException.class), qoi0.a(PassportAccountNotAuthorizedException.class)};
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar, x1Var, lfxVarArr, null);
                        kPassportApiImpl$isXTokenValid$1.L$0 = this;
                        kPassportApiImpl$isXTokenValid$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportApiImpl$isXTokenValid$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (f) kPassportApiImpl$isXTokenValid$1.L$0;
                        kotlin.b.b(obj);
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
        kPassportApiImpl$isXTokenValid$1 = new KPassportApiImpl$isXTokenValid$1(this, (ContinuationImpl) continuation);
        Object obj2 = kPassportApiImpl$isXTokenValid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$isXTokenValid$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.yandex.passport.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(UpdateableProperties updateableProperties, ContinuationImpl continuationImpl) {
        KPassportApiImpl$updateProperties$1 kPassportApiImpl$updateProperties$1;
        int i;
        Throwable a;
        try {
            if (continuationImpl instanceof KPassportApiImpl$updateProperties$1) {
                kPassportApiImpl$updateProperties$1 = (KPassportApiImpl$updateProperties$1) continuationImpl;
                int i2 = kPassportApiImpl$updateProperties$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportApiImpl$updateProperties$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportApiImpl$updateProperties$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportApiImpl$updateProperties$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        x();
                        com.yandex.passport.internal.methods.requester.f fVar = this.e;
                        UpdateableProperties.Companion.getClass();
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar, new v2(z.a(updateableProperties)), new lfx[0], null);
                        kPassportApiImpl$updateProperties$1.L$0 = this;
                        kPassportApiImpl$updateProperties$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportApiImpl$updateProperties$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (f) kPassportApiImpl$updateProperties$1.L$0;
                        kotlin.b.b(obj);
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
        kPassportApiImpl$updateProperties$1 = new KPassportApiImpl$updateProperties$1(this, continuationImpl);
        Object obj2 = kPassportApiImpl$updateProperties$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$updateProperties$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(k2 k2Var, Credentials credentials, ContinuationImpl continuationImpl) {
        KPassportApiImpl$getToken$2 kPassportApiImpl$getToken$2;
        int i;
        if (continuationImpl instanceof KPassportApiImpl$getToken$2) {
            kPassportApiImpl$getToken$2 = (KPassportApiImpl$getToken$2) continuationImpl;
            int i2 = kPassportApiImpl$getToken$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kPassportApiImpl$getToken$2.label = i2 - Integer.MIN_VALUE;
                Object obj = kPassportApiImpl$getToken$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kPassportApiImpl$getToken$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kPassportApiImpl$getToken$2.label = 1;
                    Object E = E(k2Var, credentials, kPassportApiImpl$getToken$2);
                    return E == obj2 ? obj2 : E;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        kPassportApiImpl$getToken$2 = new KPassportApiImpl$getToken$2(this, continuationImpl);
        Object obj3 = kPassportApiImpl$getToken$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$getToken$2.label;
        if (i != 0) {
        }
    }

    @Override // com.yandex.passport.internal.impl.a
    public final void x() {
        if (!com.yandex.passport.internal.util.p.m() || this.d) {
            return;
        }
        Map<String, Object> i = kotlin.collections.b.i(new Pair("passport_process_name", b64.p(new StringBuilder("'"), this.c, '\'')), new Pair("am_version", "7.55.1"), new Pair("error", Log.getStackTraceString(new RuntimeException("This method must not be called from ':passport' process"))));
        this.b.reportEvent(com.yandex.passport.internal.analytics.l.o.a, i);
    }

    @Override // com.yandex.passport.api.b
    public final void y() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.yandex.passport.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(k2 k2Var, Continuation continuation) {
        KPassportApiImpl$getAccountManagementUrl$1 kPassportApiImpl$getAccountManagementUrl$1;
        int i;
        Throwable a;
        try {
            if (continuation instanceof KPassportApiImpl$getAccountManagementUrl$1) {
                kPassportApiImpl$getAccountManagementUrl$1 = (KPassportApiImpl$getAccountManagementUrl$1) continuation;
                int i2 = kPassportApiImpl$getAccountManagementUrl$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kPassportApiImpl$getAccountManagementUrl$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = kPassportApiImpl$getAccountManagementUrl$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kPassportApiImpl$getAccountManagementUrl$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        x();
                        com.yandex.passport.internal.methods.requester.f fVar = this.e;
                        PassportUidImpl.Companion.getClass();
                        r0 r0Var = new r0(l2.a(k2Var));
                        lfx[] lfxVarArr = {qoi0.a(PassportIOException.class), qoi0.a(PassportFailedResponseException.class), qoi0.a(PassportAccountNotFoundException.class)};
                        sjh sjhVar = uyj.a;
                        CommonRequesterKt$requestMethodOnDefault$2 commonRequesterKt$requestMethodOnDefault$2 = new CommonRequesterKt$requestMethodOnDefault$2(fVar, r0Var, lfxVarArr, null);
                        kPassportApiImpl$getAccountManagementUrl$1.L$0 = this;
                        kPassportApiImpl$getAccountManagementUrl$1.label = 1;
                        obj = tje.k0(sjhVar, commonRequesterKt$requestMethodOnDefault$2, kPassportApiImpl$getAccountManagementUrl$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (f) kPassportApiImpl$getAccountManagementUrl$1.L$0;
                        kotlin.b.b(obj);
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
        kPassportApiImpl$getAccountManagementUrl$1 = new KPassportApiImpl$getAccountManagementUrl$1(this, (ContinuationImpl) continuation);
        Object obj2 = kPassportApiImpl$getAccountManagementUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$getAccountManagementUrl$1.label;
    }
}
