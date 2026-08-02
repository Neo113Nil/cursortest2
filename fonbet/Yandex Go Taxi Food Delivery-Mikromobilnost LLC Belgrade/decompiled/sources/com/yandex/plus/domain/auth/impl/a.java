package com.yandex.plus.domain.auth.impl;

import android.net.Uri;
import android.webkit.CookieManager;
import com.yandex.plus.adapter.auth.api.PlusAuthAdapter$Environment;
import com.yandex.plus.adapter.auth.api.PlusAuthAdapter$Theme;
import com.yandex.plus.log.api.LogPriority;
import defpackage.a1d0;
import defpackage.b1d0;
import defpackage.bvf0;
import defpackage.c1d0;
import defpackage.d1d0;
import defpackage.e1d0;
import defpackage.g050;
import defpackage.gj;
import defpackage.gtq0;
import defpackage.hj;
import defpackage.hm91;
import defpackage.ij;
import defpackage.ike;
import defpackage.jj;
import defpackage.jse;
import defpackage.lj;
import defpackage.ny61;
import defpackage.qrb1;
import defpackage.rkd0;
import defpackage.tje;
import defpackage.unr0;
import defpackage.v0d0;
import defpackage.w0d0;
import defpackage.x0d0;
import defpackage.y0d0;
import defpackage.yvi0;
import defpackage.z0d0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a {
    public static final WeakHashMap k = new WeakHashMap();
    public final e1d0 a;
    public final PlusAuthAdapter$Environment b;
    public final String c;
    public final String d;
    public final rkd0 e;
    public final jse f;
    public final jse g;
    public final r0 h = bvf0.c(jj.a);
    public final String i;
    public final yvi0 j;

    public a(e1d0 e1d0Var, PlusAuthAdapter$Environment plusAuthAdapter$Environment, String str, String str2, rkd0 rkd0Var, ike ikeVar, jse jseVar, jse jseVar2, String str3) {
        this.a = e1d0Var;
        this.b = plusAuthAdapter$Environment;
        this.c = str;
        this.d = str2;
        this.e = rkd0Var;
        this.f = jseVar;
        this.g = jseVar2;
        String l = unr0.l(')', "AuthSessionImpl(", str3);
        this.i = l;
        this.j = new yvi0(rkd0Var);
        LogPriority logPriority = LogPriority.DEBUG;
        if (rkd0Var.e(logPriority)) {
            rkd0Var.b(logPriority, l, "init(environment=" + plusAuthAdapter$Environment + ')', null);
        }
        tje.N(ikeVar, null, null, new AuthSessionImpl$2(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, Long l, Continuation continuation) {
        AuthSessionImpl$onUserIdStateChanged$1 authSessionImpl$onUserIdStateChanged$1;
        int i;
        Object c;
        LogPriority logPriority;
        r0 r0Var = aVar.h;
        String str = aVar.i;
        rkd0 rkd0Var = aVar.e;
        if (continuation instanceof AuthSessionImpl$onUserIdStateChanged$1) {
            authSessionImpl$onUserIdStateChanged$1 = (AuthSessionImpl$onUserIdStateChanged$1) continuation;
            int i2 = authSessionImpl$onUserIdStateChanged$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authSessionImpl$onUserIdStateChanged$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authSessionImpl$onUserIdStateChanged$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authSessionImpl$onUserIdStateChanged$1.label;
                if (i != 0) {
                    b.b(obj);
                    LogPriority logPriority2 = LogPriority.DEBUG;
                    if (rkd0Var.e(logPriority2)) {
                        rkd0Var.b(logPriority2, str, "onUserIdStateChanged userId=" + l, null);
                    }
                    if (l != null) {
                        ij ijVar = new ij(l.longValue());
                        r0Var.getClass();
                        r0Var.m(null, ijVar);
                    }
                    authSessionImpl$onUserIdStateChanged$1.L$0 = null;
                    authSessionImpl$onUserIdStateChanged$1.label = 1;
                    c = aVar.c(l, false, authSessionImpl$onUserIdStateChanged$1);
                    if (c == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                logPriority = LogPriority.DEBUG;
                if (rkd0Var.e(logPriority)) {
                    rkd0Var.b(logPriority, str, "onUserIdStateChanged result=" + ((Object) Result.c(c)), null);
                }
                if (c instanceof Result.Failure) {
                    c = jj.a;
                }
                r0Var.l(c);
                return zy11.a;
            }
        }
        authSessionImpl$onUserIdStateChanged$1 = new AuthSessionImpl$onUserIdStateChanged$1(aVar, continuation);
        Object obj3 = authSessionImpl$onUserIdStateChanged$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authSessionImpl$onUserIdStateChanged$1.label;
        if (i != 0) {
        }
        logPriority = LogPriority.DEBUG;
        if (rkd0Var.e(logPriority)) {
        }
        if (c instanceof Result.Failure) {
        }
        r0Var.l(c);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        AuthSessionImpl$dropAndGetNewToken$1 authSessionImpl$dropAndGetNewToken$1;
        int i;
        rkd0 rkd0Var;
        Object c;
        LogPriority logPriority;
        if (continuationImpl instanceof AuthSessionImpl$dropAndGetNewToken$1) {
            authSessionImpl$dropAndGetNewToken$1 = (AuthSessionImpl$dropAndGetNewToken$1) continuationImpl;
            int i2 = authSessionImpl$dropAndGetNewToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authSessionImpl$dropAndGetNewToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authSessionImpl$dropAndGetNewToken$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authSessionImpl$dropAndGetNewToken$1.label;
                String str = this.i;
                rkd0Var = this.e;
                if (i != 0) {
                    b.b(obj);
                    LogPriority logPriority2 = LogPriority.DEBUG;
                    if (rkd0Var.e(logPriority2)) {
                        rkd0Var.b(logPriority2, str, "dropAndGetToken()", null);
                    }
                    Long l = (Long) this.a.a().getValue();
                    authSessionImpl$dropAndGetNewToken$1.label = 1;
                    c = c(l, true, authSessionImpl$dropAndGetNewToken$1);
                    if (c == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                logPriority = LogPriority.DEBUG;
                if (rkd0Var.e(logPriority)) {
                    rkd0Var.b(logPriority, str, "dropAndGetToken() result=" + ((Object) Result.c(c)), null);
                }
                boolean z = c instanceof Result.Failure;
                this.h.l(!z ? jj.a : c);
                return z ? ((hj) c).getAuthToken() : c;
            }
        }
        authSessionImpl$dropAndGetNewToken$1 = new AuthSessionImpl$dropAndGetNewToken$1(this, continuationImpl);
        Object obj3 = authSessionImpl$dropAndGetNewToken$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authSessionImpl$dropAndGetNewToken$1.label;
        String str2 = this.i;
        rkd0Var = this.e;
        if (i != 0) {
        }
        logPriority = LogPriority.DEBUG;
        if (rkd0Var.e(logPriority)) {
        }
        boolean z2 = c instanceof Result.Failure;
        this.h.l(!z2 ? jj.a : c);
        if (z2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x031a A[Catch: all -> 0x03a5, TryCatch #3 {all -> 0x03a5, blocks: (B:15:0x039c, B:17:0x03a8, B:34:0x0360, B:45:0x0313, B:47:0x031a, B:58:0x02cf), top: B:57:0x02cf }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0305 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0280 A[Catch: all -> 0x03d3, CancellationException -> 0x03da, TimeoutCancellationException -> 0x03dc, TRY_LEAVE, TryCatch #7 {TimeoutCancellationException -> 0x03dc, CancellationException -> 0x03da, all -> 0x03d3, blocks: (B:19:0x03ba, B:25:0x03be, B:26:0x03c1, B:55:0x0187, B:63:0x01b3, B:65:0x026f, B:67:0x0280, B:73:0x0293, B:78:0x0295, B:79:0x0296, B:80:0x0297, B:84:0x01e2, B:86:0x0231, B:88:0x023c, B:92:0x03c2, B:93:0x03ca, B:96:0x0205, B:100:0x03cb, B:101:0x03d2), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023c A[Catch: all -> 0x03d3, CancellationException -> 0x03da, TimeoutCancellationException -> 0x03dc, TryCatch #7 {TimeoutCancellationException -> 0x03dc, CancellationException -> 0x03da, all -> 0x03d3, blocks: (B:19:0x03ba, B:25:0x03be, B:26:0x03c1, B:55:0x0187, B:63:0x01b3, B:65:0x026f, B:67:0x0280, B:73:0x0293, B:78:0x0295, B:79:0x0296, B:80:0x0297, B:84:0x01e2, B:86:0x0231, B:88:0x023c, B:92:0x03c2, B:93:0x03ca, B:96:0x0205, B:100:0x03cb, B:101:0x03d2), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03c2 A[Catch: all -> 0x03d3, CancellationException -> 0x03da, TimeoutCancellationException -> 0x03dc, TryCatch #7 {TimeoutCancellationException -> 0x03dc, CancellationException -> 0x03da, all -> 0x03d3, blocks: (B:19:0x03ba, B:25:0x03be, B:26:0x03c1, B:55:0x0187, B:63:0x01b3, B:65:0x026f, B:67:0x0280, B:73:0x0293, B:78:0x0295, B:79:0x0296, B:80:0x0297, B:84:0x01e2, B:86:0x0231, B:88:0x023c, B:92:0x03c2, B:93:0x03ca, B:96:0x0205, B:100:0x03cb, B:101:0x03d2), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Long l, boolean z, ContinuationImpl continuationImpl) {
        AuthSessionImpl$getAccountInternal$1 authSessionImpl$getAccountInternal$1;
        boolean z2;
        y0d0 y0d0Var;
        Object obj;
        int i;
        int i2;
        boolean booleanValue;
        y0d0 y0d0Var2;
        boolean z3;
        boolean z4;
        a aVar;
        int i3;
        int i4;
        Object obj2;
        Long l2;
        e1d0 e1d0Var;
        g050 g050Var;
        v0d0 v0d0Var;
        int i5;
        g050 g050Var2;
        Long l3;
        int i6;
        int i7;
        Object i8;
        y0d0 y0d0Var3;
        v0d0 v0d0Var2;
        e1d0 e1d0Var2;
        boolean z5;
        int i9;
        int i10;
        int i11;
        Object obj3;
        int i12;
        boolean z6;
        int i13;
        int i14;
        String str;
        int i15;
        v0d0 v0d0Var3;
        Object i16;
        Long l4;
        Object obj4;
        a aVar2 = this;
        Long l5 = l;
        try {
            if (continuationImpl instanceof AuthSessionImpl$getAccountInternal$1) {
                authSessionImpl$getAccountInternal$1 = (AuthSessionImpl$getAccountInternal$1) continuationImpl;
                int i17 = authSessionImpl$getAccountInternal$1.label;
                if ((i17 & Integer.MIN_VALUE) != 0) {
                    authSessionImpl$getAccountInternal$1.label = i17 - Integer.MIN_VALUE;
                    Object obj5 = authSessionImpl$getAccountInternal$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    switch (authSessionImpl$getAccountInternal$1.label) {
                        case 0:
                            b.b(obj5);
                            PlusAuthAdapter$Environment plusAuthAdapter$Environment = aVar2.b;
                            y0d0 y0d0Var4 = new y0d0(plusAuthAdapter$Environment, aVar2.c, aVar2.d);
                            if (l5 == null) {
                                throw new IllegalArgumentException("userId is null, can't refresh token!");
                            }
                            a1d0 a1d0Var = new a1d0(plusAuthAdapter$Environment);
                            e1d0 e1d0Var3 = aVar2.a;
                            authSessionImpl$getAccountInternal$1.L$0 = l5;
                            authSessionImpl$getAccountInternal$1.L$1 = y0d0Var4;
                            authSessionImpl$getAccountInternal$1.L$2 = null;
                            authSessionImpl$getAccountInternal$1.L$3 = null;
                            authSessionImpl$getAccountInternal$1.L$4 = aVar2;
                            authSessionImpl$getAccountInternal$1.L$5 = null;
                            authSessionImpl$getAccountInternal$1.Z$0 = z;
                            authSessionImpl$getAccountInternal$1.I$0 = 0;
                            authSessionImpl$getAccountInternal$1.I$1 = 0;
                            authSessionImpl$getAccountInternal$1.label = 1;
                            Object c = e1d0Var3.c(a1d0Var, authSessionImpl$getAccountInternal$1);
                            if (c == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            z2 = z;
                            y0d0Var = y0d0Var4;
                            obj = c;
                            i = 0;
                            i2 = 0;
                            b.b(obj);
                            booleanValue = ((Boolean) obj).booleanValue();
                            if (booleanValue) {
                                throw new IllegalArgumentException("xToken is invalid, must login again!");
                            }
                            x0d0 x0d0Var = new x0d0(aVar2.b);
                            e1d0 e1d0Var4 = aVar2.a;
                            authSessionImpl$getAccountInternal$1.L$0 = l5;
                            authSessionImpl$getAccountInternal$1.L$1 = y0d0Var;
                            authSessionImpl$getAccountInternal$1.L$2 = null;
                            authSessionImpl$getAccountInternal$1.L$3 = null;
                            authSessionImpl$getAccountInternal$1.L$4 = aVar2;
                            authSessionImpl$getAccountInternal$1.L$5 = null;
                            authSessionImpl$getAccountInternal$1.L$6 = null;
                            authSessionImpl$getAccountInternal$1.Z$0 = z2;
                            authSessionImpl$getAccountInternal$1.I$0 = i2;
                            authSessionImpl$getAccountInternal$1.I$1 = i;
                            authSessionImpl$getAccountInternal$1.Z$1 = booleanValue;
                            authSessionImpl$getAccountInternal$1.label = 2;
                            Object d = e1d0Var4.d(x0d0Var, authSessionImpl$getAccountInternal$1);
                            if (d == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            y0d0Var2 = y0d0Var;
                            z3 = z2;
                            z4 = booleanValue;
                            aVar = aVar2;
                            i3 = i2;
                            i4 = i;
                            obj2 = d;
                            l2 = l5;
                            b.b(obj2);
                            v0d0 v0d0Var4 = (v0d0) obj2;
                            e1d0Var = aVar.a;
                            WeakHashMap weakHashMap = k;
                            g050Var = (g050) weakHashMap.get(e1d0Var);
                            if (g050Var == null) {
                                synchronized (weakHashMap) {
                                    try {
                                        Object obj6 = weakHashMap.get(e1d0Var);
                                        if (obj6 == null) {
                                            obj6 = gtq0.a();
                                            weakHashMap.put(e1d0Var, obj6);
                                        }
                                        g050Var = (g050) obj6;
                                    } finally {
                                    }
                                }
                            }
                            authSessionImpl$getAccountInternal$1.L$0 = l2;
                            authSessionImpl$getAccountInternal$1.L$1 = y0d0Var2;
                            authSessionImpl$getAccountInternal$1.L$2 = null;
                            authSessionImpl$getAccountInternal$1.L$3 = null;
                            authSessionImpl$getAccountInternal$1.L$4 = null;
                            authSessionImpl$getAccountInternal$1.L$5 = null;
                            authSessionImpl$getAccountInternal$1.L$6 = null;
                            authSessionImpl$getAccountInternal$1.L$7 = null;
                            authSessionImpl$getAccountInternal$1.L$8 = v0d0Var4;
                            authSessionImpl$getAccountInternal$1.L$9 = e1d0Var;
                            authSessionImpl$getAccountInternal$1.L$10 = null;
                            authSessionImpl$getAccountInternal$1.L$11 = g050Var;
                            authSessionImpl$getAccountInternal$1.L$12 = null;
                            authSessionImpl$getAccountInternal$1.Z$0 = z3;
                            authSessionImpl$getAccountInternal$1.I$0 = i3;
                            authSessionImpl$getAccountInternal$1.I$1 = i4;
                            authSessionImpl$getAccountInternal$1.Z$1 = z4;
                            authSessionImpl$getAccountInternal$1.I$2 = 0;
                            authSessionImpl$getAccountInternal$1.I$3 = 0;
                            authSessionImpl$getAccountInternal$1.label = 3;
                            if (g050Var.a(authSessionImpl$getAccountInternal$1) != coroutineSingletons) {
                                v0d0Var = v0d0Var4;
                                i5 = 0;
                                g050Var2 = g050Var;
                                l3 = l2;
                                i6 = i3;
                                i7 = 0;
                                try {
                                    authSessionImpl$getAccountInternal$1.L$0 = l3;
                                    authSessionImpl$getAccountInternal$1.L$1 = y0d0Var2;
                                    authSessionImpl$getAccountInternal$1.L$2 = null;
                                    authSessionImpl$getAccountInternal$1.L$3 = null;
                                    authSessionImpl$getAccountInternal$1.L$4 = null;
                                    authSessionImpl$getAccountInternal$1.L$5 = null;
                                    authSessionImpl$getAccountInternal$1.L$6 = null;
                                    authSessionImpl$getAccountInternal$1.L$7 = null;
                                    authSessionImpl$getAccountInternal$1.L$8 = v0d0Var;
                                    authSessionImpl$getAccountInternal$1.L$9 = null;
                                    authSessionImpl$getAccountInternal$1.L$10 = null;
                                    authSessionImpl$getAccountInternal$1.L$11 = g050Var2;
                                    authSessionImpl$getAccountInternal$1.L$12 = null;
                                    authSessionImpl$getAccountInternal$1.L$13 = e1d0Var;
                                    authSessionImpl$getAccountInternal$1.Z$0 = z3;
                                    authSessionImpl$getAccountInternal$1.I$0 = i6;
                                    authSessionImpl$getAccountInternal$1.I$1 = i4;
                                    authSessionImpl$getAccountInternal$1.Z$1 = z4;
                                    authSessionImpl$getAccountInternal$1.I$2 = i5;
                                    authSessionImpl$getAccountInternal$1.I$3 = i7;
                                    authSessionImpl$getAccountInternal$1.I$4 = 0;
                                    authSessionImpl$getAccountInternal$1.I$5 = 0;
                                    authSessionImpl$getAccountInternal$1.label = 4;
                                    i8 = e1d0Var.i(y0d0Var2, authSessionImpl$getAccountInternal$1);
                                    if (i8 == coroutineSingletons) {
                                        y0d0Var3 = y0d0Var2;
                                        v0d0Var2 = v0d0Var;
                                        e1d0Var2 = e1d0Var;
                                        z5 = z3;
                                        i9 = i4;
                                        i10 = 0;
                                        i11 = i5;
                                        obj3 = i8;
                                        i12 = i6;
                                        z6 = z4;
                                        i13 = i7;
                                        i14 = 0;
                                        b.b(obj3);
                                        str = (String) obj3;
                                        if (z5) {
                                            w0d0 w0d0Var = new w0d0(str);
                                            authSessionImpl$getAccountInternal$1.L$0 = l3;
                                            authSessionImpl$getAccountInternal$1.L$1 = y0d0Var3;
                                            authSessionImpl$getAccountInternal$1.L$2 = null;
                                            authSessionImpl$getAccountInternal$1.L$3 = null;
                                            authSessionImpl$getAccountInternal$1.L$4 = null;
                                            authSessionImpl$getAccountInternal$1.L$5 = null;
                                            authSessionImpl$getAccountInternal$1.L$6 = null;
                                            authSessionImpl$getAccountInternal$1.L$7 = null;
                                            authSessionImpl$getAccountInternal$1.L$8 = v0d0Var2;
                                            authSessionImpl$getAccountInternal$1.L$9 = null;
                                            authSessionImpl$getAccountInternal$1.L$10 = null;
                                            authSessionImpl$getAccountInternal$1.L$11 = g050Var2;
                                            authSessionImpl$getAccountInternal$1.L$12 = null;
                                            authSessionImpl$getAccountInternal$1.L$13 = e1d0Var2;
                                            authSessionImpl$getAccountInternal$1.L$14 = null;
                                            authSessionImpl$getAccountInternal$1.L$15 = null;
                                            authSessionImpl$getAccountInternal$1.Z$0 = z5;
                                            authSessionImpl$getAccountInternal$1.I$0 = i12;
                                            authSessionImpl$getAccountInternal$1.I$1 = i9;
                                            authSessionImpl$getAccountInternal$1.Z$1 = z6;
                                            authSessionImpl$getAccountInternal$1.I$2 = i11;
                                            authSessionImpl$getAccountInternal$1.I$3 = i13;
                                            authSessionImpl$getAccountInternal$1.I$4 = i14;
                                            authSessionImpl$getAccountInternal$1.I$5 = i10;
                                            authSessionImpl$getAccountInternal$1.label = 5;
                                            Object g = e1d0Var2.g(w0d0Var, authSessionImpl$getAccountInternal$1);
                                            coroutineSingletons = coroutineSingletons;
                                            if (g != coroutineSingletons) {
                                                i15 = i14;
                                                v0d0Var3 = v0d0Var2;
                                                authSessionImpl$getAccountInternal$1.L$0 = l3;
                                                authSessionImpl$getAccountInternal$1.L$1 = null;
                                                authSessionImpl$getAccountInternal$1.L$2 = null;
                                                authSessionImpl$getAccountInternal$1.L$3 = null;
                                                authSessionImpl$getAccountInternal$1.L$4 = null;
                                                authSessionImpl$getAccountInternal$1.L$5 = null;
                                                authSessionImpl$getAccountInternal$1.L$6 = null;
                                                authSessionImpl$getAccountInternal$1.L$7 = null;
                                                authSessionImpl$getAccountInternal$1.L$8 = v0d0Var3;
                                                authSessionImpl$getAccountInternal$1.L$9 = null;
                                                authSessionImpl$getAccountInternal$1.L$10 = null;
                                                authSessionImpl$getAccountInternal$1.L$11 = g050Var2;
                                                authSessionImpl$getAccountInternal$1.L$12 = null;
                                                authSessionImpl$getAccountInternal$1.L$13 = null;
                                                authSessionImpl$getAccountInternal$1.L$14 = null;
                                                authSessionImpl$getAccountInternal$1.L$15 = null;
                                                authSessionImpl$getAccountInternal$1.Z$0 = z5;
                                                authSessionImpl$getAccountInternal$1.I$0 = i12;
                                                authSessionImpl$getAccountInternal$1.I$1 = i9;
                                                authSessionImpl$getAccountInternal$1.Z$1 = z6;
                                                authSessionImpl$getAccountInternal$1.I$2 = i11;
                                                authSessionImpl$getAccountInternal$1.I$3 = i13;
                                                authSessionImpl$getAccountInternal$1.I$4 = i15;
                                                authSessionImpl$getAccountInternal$1.I$5 = i10;
                                                authSessionImpl$getAccountInternal$1.label = 6;
                                                i16 = e1d0Var2.i(y0d0Var3, authSessionImpl$getAccountInternal$1);
                                                if (i16 != coroutineSingletons) {
                                                    l4 = l3;
                                                    b.b(i16);
                                                    str = (String) i16;
                                                    v0d0Var2 = v0d0Var3;
                                                    l3 = l4;
                                                }
                                            }
                                        }
                                        hj hjVar = new hj(l3.longValue(), str, v0d0Var2.b(), v0d0Var2.a());
                                        g050Var2.d(null);
                                        return hjVar;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    obj4 = null;
                                    g050Var2.d(obj4);
                                    throw th;
                                }
                            }
                            return coroutineSingletons;
                        case 1:
                            int i18 = authSessionImpl$getAccountInternal$1.I$1;
                            int i19 = authSessionImpl$getAccountInternal$1.I$0;
                            z2 = authSessionImpl$getAccountInternal$1.Z$0;
                            a aVar3 = (a) authSessionImpl$getAccountInternal$1.L$4;
                            y0d0 y0d0Var5 = (y0d0) authSessionImpl$getAccountInternal$1.L$1;
                            Long l6 = (Long) authSessionImpl$getAccountInternal$1.L$0;
                            b.b(obj5);
                            Object value = ((Result) obj5).getValue();
                            i = i18;
                            aVar2 = aVar3;
                            i2 = i19;
                            l5 = l6;
                            y0d0Var = y0d0Var5;
                            obj = value;
                            b.b(obj);
                            booleanValue = ((Boolean) obj).booleanValue();
                            if (booleanValue) {
                            }
                            break;
                        case 2:
                            boolean z7 = authSessionImpl$getAccountInternal$1.Z$1;
                            int i20 = authSessionImpl$getAccountInternal$1.I$1;
                            int i21 = authSessionImpl$getAccountInternal$1.I$0;
                            boolean z8 = authSessionImpl$getAccountInternal$1.Z$0;
                            aVar = (a) authSessionImpl$getAccountInternal$1.L$4;
                            y0d0 y0d0Var6 = (y0d0) authSessionImpl$getAccountInternal$1.L$1;
                            l2 = (Long) authSessionImpl$getAccountInternal$1.L$0;
                            b.b(obj5);
                            obj2 = ((Result) obj5).getValue();
                            z4 = z7;
                            i3 = i21;
                            y0d0Var2 = y0d0Var6;
                            z3 = z8;
                            i4 = i20;
                            b.b(obj2);
                            v0d0 v0d0Var42 = (v0d0) obj2;
                            e1d0Var = aVar.a;
                            WeakHashMap weakHashMap2 = k;
                            g050Var = (g050) weakHashMap2.get(e1d0Var);
                            if (g050Var == null) {
                            }
                            authSessionImpl$getAccountInternal$1.L$0 = l2;
                            authSessionImpl$getAccountInternal$1.L$1 = y0d0Var2;
                            authSessionImpl$getAccountInternal$1.L$2 = null;
                            authSessionImpl$getAccountInternal$1.L$3 = null;
                            authSessionImpl$getAccountInternal$1.L$4 = null;
                            authSessionImpl$getAccountInternal$1.L$5 = null;
                            authSessionImpl$getAccountInternal$1.L$6 = null;
                            authSessionImpl$getAccountInternal$1.L$7 = null;
                            authSessionImpl$getAccountInternal$1.L$8 = v0d0Var42;
                            authSessionImpl$getAccountInternal$1.L$9 = e1d0Var;
                            authSessionImpl$getAccountInternal$1.L$10 = null;
                            authSessionImpl$getAccountInternal$1.L$11 = g050Var;
                            authSessionImpl$getAccountInternal$1.L$12 = null;
                            authSessionImpl$getAccountInternal$1.Z$0 = z3;
                            authSessionImpl$getAccountInternal$1.I$0 = i3;
                            authSessionImpl$getAccountInternal$1.I$1 = i4;
                            authSessionImpl$getAccountInternal$1.Z$1 = z4;
                            authSessionImpl$getAccountInternal$1.I$2 = 0;
                            authSessionImpl$getAccountInternal$1.I$3 = 0;
                            authSessionImpl$getAccountInternal$1.label = 3;
                            if (g050Var.a(authSessionImpl$getAccountInternal$1) != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        case 3:
                            i7 = authSessionImpl$getAccountInternal$1.I$3;
                            int i22 = authSessionImpl$getAccountInternal$1.I$2;
                            z4 = authSessionImpl$getAccountInternal$1.Z$1;
                            i4 = authSessionImpl$getAccountInternal$1.I$1;
                            i6 = authSessionImpl$getAccountInternal$1.I$0;
                            z3 = authSessionImpl$getAccountInternal$1.Z$0;
                            g050 g050Var3 = (g050) authSessionImpl$getAccountInternal$1.L$11;
                            e1d0Var = (e1d0) authSessionImpl$getAccountInternal$1.L$9;
                            v0d0Var = (v0d0) authSessionImpl$getAccountInternal$1.L$8;
                            y0d0Var2 = (y0d0) authSessionImpl$getAccountInternal$1.L$1;
                            Long l7 = (Long) authSessionImpl$getAccountInternal$1.L$0;
                            b.b(obj5);
                            i5 = i22;
                            g050Var2 = g050Var3;
                            l3 = l7;
                            authSessionImpl$getAccountInternal$1.L$0 = l3;
                            authSessionImpl$getAccountInternal$1.L$1 = y0d0Var2;
                            authSessionImpl$getAccountInternal$1.L$2 = null;
                            authSessionImpl$getAccountInternal$1.L$3 = null;
                            authSessionImpl$getAccountInternal$1.L$4 = null;
                            authSessionImpl$getAccountInternal$1.L$5 = null;
                            authSessionImpl$getAccountInternal$1.L$6 = null;
                            authSessionImpl$getAccountInternal$1.L$7 = null;
                            authSessionImpl$getAccountInternal$1.L$8 = v0d0Var;
                            authSessionImpl$getAccountInternal$1.L$9 = null;
                            authSessionImpl$getAccountInternal$1.L$10 = null;
                            authSessionImpl$getAccountInternal$1.L$11 = g050Var2;
                            authSessionImpl$getAccountInternal$1.L$12 = null;
                            authSessionImpl$getAccountInternal$1.L$13 = e1d0Var;
                            authSessionImpl$getAccountInternal$1.Z$0 = z3;
                            authSessionImpl$getAccountInternal$1.I$0 = i6;
                            authSessionImpl$getAccountInternal$1.I$1 = i4;
                            authSessionImpl$getAccountInternal$1.Z$1 = z4;
                            authSessionImpl$getAccountInternal$1.I$2 = i5;
                            authSessionImpl$getAccountInternal$1.I$3 = i7;
                            authSessionImpl$getAccountInternal$1.I$4 = 0;
                            authSessionImpl$getAccountInternal$1.I$5 = 0;
                            authSessionImpl$getAccountInternal$1.label = 4;
                            i8 = e1d0Var.i(y0d0Var2, authSessionImpl$getAccountInternal$1);
                            if (i8 == coroutineSingletons) {
                            }
                            break;
                        case 4:
                            int i23 = authSessionImpl$getAccountInternal$1.I$5;
                            i14 = authSessionImpl$getAccountInternal$1.I$4;
                            int i24 = authSessionImpl$getAccountInternal$1.I$3;
                            int i25 = authSessionImpl$getAccountInternal$1.I$2;
                            boolean z9 = authSessionImpl$getAccountInternal$1.Z$1;
                            int i26 = authSessionImpl$getAccountInternal$1.I$1;
                            int i27 = authSessionImpl$getAccountInternal$1.I$0;
                            boolean z10 = authSessionImpl$getAccountInternal$1.Z$0;
                            e1d0 e1d0Var5 = (e1d0) authSessionImpl$getAccountInternal$1.L$13;
                            g050 g050Var4 = (g050) authSessionImpl$getAccountInternal$1.L$11;
                            v0d0Var2 = (v0d0) authSessionImpl$getAccountInternal$1.L$8;
                            y0d0Var3 = (y0d0) authSessionImpl$getAccountInternal$1.L$1;
                            l3 = (Long) authSessionImpl$getAccountInternal$1.L$0;
                            try {
                                b.b(obj5);
                                obj3 = ((Result) obj5).getValue();
                                i13 = i24;
                                g050Var2 = g050Var4;
                                e1d0Var2 = e1d0Var5;
                                z5 = z10;
                                i12 = i27;
                                i9 = i26;
                                z6 = z9;
                                i10 = i23;
                                i11 = i25;
                                b.b(obj3);
                                str = (String) obj3;
                                if (z5) {
                                }
                                hj hjVar2 = new hj(l3.longValue(), str, v0d0Var2.b(), v0d0Var2.a());
                                g050Var2.d(null);
                                return hjVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var2 = g050Var4;
                                obj4 = null;
                                g050Var2.d(obj4);
                                throw th;
                            }
                        case 5:
                            int i28 = authSessionImpl$getAccountInternal$1.I$5;
                            int i29 = authSessionImpl$getAccountInternal$1.I$4;
                            i13 = authSessionImpl$getAccountInternal$1.I$3;
                            i11 = authSessionImpl$getAccountInternal$1.I$2;
                            z6 = authSessionImpl$getAccountInternal$1.Z$1;
                            i9 = authSessionImpl$getAccountInternal$1.I$1;
                            i12 = authSessionImpl$getAccountInternal$1.I$0;
                            z5 = authSessionImpl$getAccountInternal$1.Z$0;
                            e1d0Var2 = (e1d0) authSessionImpl$getAccountInternal$1.L$13;
                            g050 g050Var5 = (g050) authSessionImpl$getAccountInternal$1.L$11;
                            v0d0 v0d0Var5 = (v0d0) authSessionImpl$getAccountInternal$1.L$8;
                            y0d0 y0d0Var7 = (y0d0) authSessionImpl$getAccountInternal$1.L$1;
                            Long l8 = (Long) authSessionImpl$getAccountInternal$1.L$0;
                            try {
                                b.b(obj5);
                                ((Result) obj5).getClass();
                                i10 = i28;
                                v0d0Var3 = v0d0Var5;
                                y0d0Var3 = y0d0Var7;
                                l3 = l8;
                                i15 = i29;
                                g050Var2 = g050Var5;
                                authSessionImpl$getAccountInternal$1.L$0 = l3;
                                authSessionImpl$getAccountInternal$1.L$1 = null;
                                authSessionImpl$getAccountInternal$1.L$2 = null;
                                authSessionImpl$getAccountInternal$1.L$3 = null;
                                authSessionImpl$getAccountInternal$1.L$4 = null;
                                authSessionImpl$getAccountInternal$1.L$5 = null;
                                authSessionImpl$getAccountInternal$1.L$6 = null;
                                authSessionImpl$getAccountInternal$1.L$7 = null;
                                authSessionImpl$getAccountInternal$1.L$8 = v0d0Var3;
                                authSessionImpl$getAccountInternal$1.L$9 = null;
                                authSessionImpl$getAccountInternal$1.L$10 = null;
                                authSessionImpl$getAccountInternal$1.L$11 = g050Var2;
                                authSessionImpl$getAccountInternal$1.L$12 = null;
                                authSessionImpl$getAccountInternal$1.L$13 = null;
                                authSessionImpl$getAccountInternal$1.L$14 = null;
                                authSessionImpl$getAccountInternal$1.L$15 = null;
                                authSessionImpl$getAccountInternal$1.Z$0 = z5;
                                authSessionImpl$getAccountInternal$1.I$0 = i12;
                                authSessionImpl$getAccountInternal$1.I$1 = i9;
                                authSessionImpl$getAccountInternal$1.Z$1 = z6;
                                authSessionImpl$getAccountInternal$1.I$2 = i11;
                                authSessionImpl$getAccountInternal$1.I$3 = i13;
                                authSessionImpl$getAccountInternal$1.I$4 = i15;
                                authSessionImpl$getAccountInternal$1.I$5 = i10;
                                authSessionImpl$getAccountInternal$1.label = 6;
                                i16 = e1d0Var2.i(y0d0Var3, authSessionImpl$getAccountInternal$1);
                                if (i16 != coroutineSingletons) {
                                }
                                return coroutineSingletons;
                            } catch (Throwable th3) {
                                th = th3;
                                g050Var2 = g050Var5;
                                obj4 = null;
                                g050Var2.d(obj4);
                                throw th;
                            }
                        case 6:
                            g050Var2 = (g050) authSessionImpl$getAccountInternal$1.L$11;
                            v0d0Var3 = (v0d0) authSessionImpl$getAccountInternal$1.L$8;
                            l4 = (Long) authSessionImpl$getAccountInternal$1.L$0;
                            try {
                                b.b(obj5);
                                i16 = ((Result) obj5).getValue();
                                b.b(i16);
                                str = (String) i16;
                                v0d0Var2 = v0d0Var3;
                                l3 = l4;
                                hj hjVar22 = new hj(l3.longValue(), str, v0d0Var2.b(), v0d0Var2.a());
                                g050Var2.d(null);
                                return hjVar22;
                            } catch (Throwable th4) {
                                th = th4;
                                obj4 = null;
                                g050Var2.d(obj4);
                                throw th;
                            }
                        default:
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (authSessionImpl$getAccountInternal$1.label) {
            }
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th5) {
            return new Result.Failure(th5);
        }
        authSessionImpl$getAccountInternal$1 = new AuthSessionImpl$getAccountInternal$1(aVar2, continuationImpl);
        Object obj52 = authSessionImpl$getAccountInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, ContinuationImpl continuationImpl) {
        AuthSessionImpl$getAuthorizationUrl$1 authSessionImpl$getAuthorizationUrl$1;
        int i;
        rkd0 rkd0Var;
        LogPriority logPriority;
        if (continuationImpl instanceof AuthSessionImpl$getAuthorizationUrl$1) {
            authSessionImpl$getAuthorizationUrl$1 = (AuthSessionImpl$getAuthorizationUrl$1) continuationImpl;
            int i2 = authSessionImpl$getAuthorizationUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authSessionImpl$getAuthorizationUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authSessionImpl$getAuthorizationUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authSessionImpl$getAuthorizationUrl$1.label;
                String str3 = this.i;
                rkd0Var = this.e;
                if (i != 0) {
                    b.b(obj);
                    LogPriority logPriority2 = LogPriority.DEBUG;
                    if (rkd0Var.e(logPriority2)) {
                        rkd0Var.b(logPriority2, str3, "getAuthorizationUrl(url=" + str + ", tld=" + str2 + ')', null);
                    }
                    AuthSessionImpl$getAuthorizationUrl$result$1 authSessionImpl$getAuthorizationUrl$result$1 = new AuthSessionImpl$getAuthorizationUrl$result$1(this, new z0d0(this.b, str, str2), null);
                    authSessionImpl$getAuthorizationUrl$1.L$0 = null;
                    authSessionImpl$getAuthorizationUrl$1.L$1 = null;
                    authSessionImpl$getAuthorizationUrl$1.L$2 = null;
                    authSessionImpl$getAuthorizationUrl$1.label = 1;
                    obj = tje.k0(this.g, authSessionImpl$getAuthorizationUrl$result$1, authSessionImpl$getAuthorizationUrl$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                Object value = ((Result) obj).getValue();
                logPriority = LogPriority.DEBUG;
                if (rkd0Var.e(logPriority)) {
                    rkd0Var.b(logPriority, str3, "getAuthorizationUrl() result=" + ((Object) Result.c(value)), null);
                }
                return value;
            }
        }
        authSessionImpl$getAuthorizationUrl$1 = new AuthSessionImpl$getAuthorizationUrl$1(this, continuationImpl);
        Object obj2 = authSessionImpl$getAuthorizationUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authSessionImpl$getAuthorizationUrl$1.label;
        String str32 = this.i;
        rkd0Var = this.e;
        if (i != 0) {
        }
        Object value2 = ((Result) obj2).getValue();
        logPriority = LogPriority.DEBUG;
        if (rkd0Var.e(logPriority)) {
        }
        return value2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r2 != null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        AuthSessionImpl$getCurrentAccount$1 authSessionImpl$getCurrentAccount$1;
        int i;
        lj ljVar;
        Object c;
        long j;
        Throwable a;
        if (continuationImpl instanceof AuthSessionImpl$getCurrentAccount$1) {
            authSessionImpl$getCurrentAccount$1 = (AuthSessionImpl$getCurrentAccount$1) continuationImpl;
            int i2 = authSessionImpl$getCurrentAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authSessionImpl$getCurrentAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authSessionImpl$getCurrentAccount$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authSessionImpl$getCurrentAccount$1.label;
                r0 r0Var = this.h;
                if (i != 0) {
                    b.b(obj);
                    Long l = (Long) this.a.a().getValue();
                    Object value = r0Var.getValue();
                    ljVar = value instanceof hj ? (hj) value : null;
                    if (ljVar != null) {
                        long longValue = ljVar.getId().longValue();
                        if (l == null || l.longValue() != longValue) {
                            ljVar = null;
                        }
                    }
                    if (l == null) {
                        ljVar = jj.a;
                        r0Var.l(ljVar);
                        return ljVar;
                    }
                    long longValue2 = l.longValue();
                    Long l2 = new Long(longValue2);
                    authSessionImpl$getCurrentAccount$1.L$0 = null;
                    authSessionImpl$getCurrentAccount$1.J$0 = longValue2;
                    authSessionImpl$getCurrentAccount$1.I$0 = 0;
                    authSessionImpl$getCurrentAccount$1.label = 1;
                    c = c(l2, false, authSessionImpl$getCurrentAccount$1);
                    if (c == obj2) {
                        return obj2;
                    }
                    j = longValue2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = authSessionImpl$getCurrentAccount$1.J$0;
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a != null) {
                    c = new gj(j, a);
                }
                ljVar = (lj) c;
                r0Var.l(ljVar);
                return ljVar;
            }
        }
        authSessionImpl$getCurrentAccount$1 = new AuthSessionImpl$getCurrentAccount$1(this, continuationImpl);
        Object obj3 = authSessionImpl$getCurrentAccount$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authSessionImpl$getCurrentAccount$1.label;
        r0 r0Var2 = this.h;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a != null) {
        }
        ljVar = (lj) c;
        r0Var2.l(ljVar);
        return ljVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(7:13|14|15|16|17|(1:19)|20)(2:22|23))(6:24|25|26|27|(5:30|16|17|(0)|20)|29))(5:32|33|34|35|(2:37|29)(5:38|26|27|(0)|29)))(1:39))(3:60|(1:62)|63)|40|(5:42|(2:13b|51)|57|(3:59|35|(0)(0))|29)|17|(0)|20))|70|6|7|(0)(0)|40|(0)|17|(0)|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0110, code lost:
    
        if (r2 == r4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0057, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01eb, code lost:
    
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #1 {all -> 0x0057, blocks: (B:14:0x004a, B:16:0x01d3, B:27:0x01a4, B:66:0x01e7, B:67:0x01ea, B:33:0x00be, B:42:0x011e, B:44:0x013b, B:50:0x014e, B:55:0x0150, B:56:0x0151, B:57:0x0152, B:25:0x0088, B:26:0x019f, B:35:0x0177, B:46:0x013c, B:48:0x0142, B:49:0x014c), top: B:7:0x002a, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r5v10, types: [g050] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(PlusAuthAdapter$Theme plusAuthAdapter$Theme, ContinuationImpl continuationImpl) {
        AuthSessionImpl$login$1 authSessionImpl$login$1;
        ?? r5;
        Object failure;
        rkd0 rkd0Var;
        LogPriority logPriority;
        long longValue;
        y0d0 y0d0Var;
        e1d0 e1d0Var;
        g050 g050Var;
        int i;
        int i2;
        int i3;
        Object i4;
        long j;
        Object d;
        String str;
        long j2;
        Object obj;
        try {
            if (continuationImpl instanceof AuthSessionImpl$login$1) {
                authSessionImpl$login$1 = (AuthSessionImpl$login$1) continuationImpl;
                int i5 = authSessionImpl$login$1.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    authSessionImpl$login$1.label = i5 - Integer.MIN_VALUE;
                    Object obj2 = authSessionImpl$login$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r5 = authSessionImpl$login$1.label;
                    if (r5 != 0) {
                        b.b(obj2);
                        rkd0 rkd0Var2 = this.e;
                        String str2 = this.i;
                        LogPriority logPriority2 = LogPriority.DEBUG;
                        if (rkd0Var2.e(logPriority2)) {
                            rkd0Var2.b(logPriority2, str2, "login(theme=" + plusAuthAdapter$Theme + ')', null);
                        }
                        b1d0 b1d0Var = new b1d0(this.b, plusAuthAdapter$Theme);
                        jse jseVar = this.f;
                        AuthSessionImpl$login$result$1 authSessionImpl$login$result$1 = new AuthSessionImpl$login$result$1(this, b1d0Var, null);
                        authSessionImpl$login$1.L$0 = null;
                        authSessionImpl$login$1.L$1 = null;
                        authSessionImpl$login$1.label = 1;
                        obj2 = tje.k0(jseVar, authSessionImpl$login$result$1, authSessionImpl$login$1);
                    } else {
                        if (r5 != 1) {
                            if (r5 == 2) {
                                int i6 = authSessionImpl$login$1.I$2;
                                int i7 = authSessionImpl$login$1.I$1;
                                int i8 = authSessionImpl$login$1.I$0;
                                longValue = authSessionImpl$login$1.J$0;
                                g050 g050Var2 = (g050) authSessionImpl$login$1.L$6;
                                e1d0Var = (e1d0) authSessionImpl$login$1.L$4;
                                y0d0Var = (y0d0) authSessionImpl$login$1.L$2;
                                b.b(obj2);
                                i2 = i6;
                                i3 = i7;
                                i = i8;
                                g050Var = g050Var2;
                                authSessionImpl$login$1.L$0 = null;
                                authSessionImpl$login$1.L$1 = null;
                                authSessionImpl$login$1.L$2 = null;
                                authSessionImpl$login$1.L$3 = null;
                                authSessionImpl$login$1.L$4 = null;
                                authSessionImpl$login$1.L$5 = null;
                                authSessionImpl$login$1.L$6 = g050Var;
                                authSessionImpl$login$1.L$7 = null;
                                authSessionImpl$login$1.L$8 = null;
                                authSessionImpl$login$1.J$0 = longValue;
                                authSessionImpl$login$1.I$0 = i;
                                authSessionImpl$login$1.I$1 = i3;
                                authSessionImpl$login$1.I$2 = i2;
                                authSessionImpl$login$1.I$3 = 0;
                                authSessionImpl$login$1.I$4 = 0;
                                authSessionImpl$login$1.label = 3;
                                i4 = e1d0Var.i(y0d0Var, authSessionImpl$login$1);
                                if (i4 != coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                j = longValue;
                                r5 = g050Var;
                                b.b(i4);
                                String str3 = (String) i4;
                                r5.d(null);
                                x0d0 x0d0Var = new x0d0(this.b);
                                e1d0 e1d0Var2 = this.a;
                                authSessionImpl$login$1.L$0 = null;
                                authSessionImpl$login$1.L$1 = null;
                                authSessionImpl$login$1.L$2 = null;
                                authSessionImpl$login$1.L$3 = null;
                                authSessionImpl$login$1.L$4 = str3;
                                authSessionImpl$login$1.L$5 = null;
                                authSessionImpl$login$1.L$6 = null;
                                authSessionImpl$login$1.L$7 = null;
                                authSessionImpl$login$1.L$8 = null;
                                authSessionImpl$login$1.J$0 = j;
                                authSessionImpl$login$1.I$0 = i;
                                authSessionImpl$login$1.label = 4;
                                d = e1d0Var2.d(x0d0Var, authSessionImpl$login$1);
                                if (d != coroutineSingletons) {
                                }
                                return coroutineSingletons;
                            }
                            if (r5 != 3) {
                                if (r5 != 4) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                long j3 = authSessionImpl$login$1.J$0;
                                String str4 = (String) authSessionImpl$login$1.L$4;
                                b.b(obj2);
                                obj = ((Result) obj2).getValue();
                                str = str4;
                                j2 = j3;
                                b.b(obj);
                                v0d0 v0d0Var = (v0d0) obj;
                                failure = new hj(j2, str, v0d0Var.b(), v0d0Var.a());
                                rkd0Var = this.e;
                                String str5 = this.i;
                                logPriority = LogPriority.DEBUG;
                                if (rkd0Var.e(logPriority)) {
                                    rkd0Var.b(logPriority, str5, "login() result=" + ((Object) Result.c(failure)), null);
                                }
                                return failure;
                            }
                            i = authSessionImpl$login$1.I$0;
                            j = authSessionImpl$login$1.J$0;
                            g050 g050Var3 = (g050) authSessionImpl$login$1.L$6;
                            b.b(obj2);
                            i4 = ((Result) obj2).getValue();
                            r5 = g050Var3;
                            b.b(i4);
                            String str32 = (String) i4;
                            r5.d(null);
                            x0d0 x0d0Var2 = new x0d0(this.b);
                            e1d0 e1d0Var22 = this.a;
                            authSessionImpl$login$1.L$0 = null;
                            authSessionImpl$login$1.L$1 = null;
                            authSessionImpl$login$1.L$2 = null;
                            authSessionImpl$login$1.L$3 = null;
                            authSessionImpl$login$1.L$4 = str32;
                            authSessionImpl$login$1.L$5 = null;
                            authSessionImpl$login$1.L$6 = null;
                            authSessionImpl$login$1.L$7 = null;
                            authSessionImpl$login$1.L$8 = null;
                            authSessionImpl$login$1.J$0 = j;
                            authSessionImpl$login$1.I$0 = i;
                            authSessionImpl$login$1.label = 4;
                            d = e1d0Var22.d(x0d0Var2, authSessionImpl$login$1);
                            if (d != coroutineSingletons) {
                                str = str32;
                                j2 = j;
                                obj = d;
                                b.b(obj);
                                v0d0 v0d0Var2 = (v0d0) obj;
                                failure = new hj(j2, str, v0d0Var2.b(), v0d0Var2.a());
                                rkd0Var = this.e;
                                String str52 = this.i;
                                logPriority = LogPriority.DEBUG;
                                if (rkd0Var.e(logPriority)) {
                                }
                                return failure;
                            }
                            return coroutineSingletons;
                        }
                        b.b(obj2);
                    }
                    failure = ((Result) obj2).getValue();
                    if (!(failure instanceof Result.Failure)) {
                        longValue = ((Number) failure).longValue();
                        y0d0Var = new y0d0(this.b, this.c, this.d);
                        e1d0Var = this.a;
                        WeakHashMap weakHashMap = k;
                        g050 g050Var4 = (g050) weakHashMap.get(e1d0Var);
                        if (g050Var4 == null) {
                            synchronized (weakHashMap) {
                                try {
                                    Object obj3 = weakHashMap.get(e1d0Var);
                                    if (obj3 == null) {
                                        obj3 = gtq0.a();
                                        weakHashMap.put(e1d0Var, obj3);
                                    }
                                    g050Var4 = (g050) obj3;
                                } finally {
                                }
                            }
                        }
                        authSessionImpl$login$1.L$0 = null;
                        authSessionImpl$login$1.L$1 = null;
                        authSessionImpl$login$1.L$2 = y0d0Var;
                        authSessionImpl$login$1.L$3 = null;
                        authSessionImpl$login$1.L$4 = e1d0Var;
                        authSessionImpl$login$1.L$5 = null;
                        authSessionImpl$login$1.L$6 = g050Var4;
                        authSessionImpl$login$1.L$7 = null;
                        authSessionImpl$login$1.J$0 = longValue;
                        authSessionImpl$login$1.I$0 = 0;
                        authSessionImpl$login$1.I$1 = 0;
                        authSessionImpl$login$1.I$2 = 0;
                        authSessionImpl$login$1.label = 2;
                        if (g050Var4.a(authSessionImpl$login$1) != coroutineSingletons) {
                            g050Var = g050Var4;
                            i = 0;
                            i2 = 0;
                            i3 = 0;
                            authSessionImpl$login$1.L$0 = null;
                            authSessionImpl$login$1.L$1 = null;
                            authSessionImpl$login$1.L$2 = null;
                            authSessionImpl$login$1.L$3 = null;
                            authSessionImpl$login$1.L$4 = null;
                            authSessionImpl$login$1.L$5 = null;
                            authSessionImpl$login$1.L$6 = g050Var;
                            authSessionImpl$login$1.L$7 = null;
                            authSessionImpl$login$1.L$8 = null;
                            authSessionImpl$login$1.J$0 = longValue;
                            authSessionImpl$login$1.I$0 = i;
                            authSessionImpl$login$1.I$1 = i3;
                            authSessionImpl$login$1.I$2 = i2;
                            authSessionImpl$login$1.I$3 = 0;
                            authSessionImpl$login$1.I$4 = 0;
                            authSessionImpl$login$1.label = 3;
                            i4 = e1d0Var.i(y0d0Var, authSessionImpl$login$1);
                            if (i4 != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    rkd0Var = this.e;
                    String str522 = this.i;
                    logPriority = LogPriority.DEBUG;
                    if (rkd0Var.e(logPriority)) {
                    }
                    return failure;
                }
            }
            if (r5 != 0) {
            }
            failure = ((Result) obj2).getValue();
            if (!(failure instanceof Result.Failure)) {
            }
            rkd0Var = this.e;
            String str5222 = this.i;
            logPriority = LogPriority.DEBUG;
            if (rkd0Var.e(logPriority)) {
            }
            return failure;
        } catch (Throwable th) {
            r5.d(null);
            throw th;
        }
        authSessionImpl$login$1 = new AuthSessionImpl$login$1(this, continuationImpl);
        Object obj22 = authSessionImpl$login$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r5 = authSessionImpl$login$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(PlusAuthAdapter$Theme plusAuthAdapter$Theme, ContinuationImpl continuationImpl) {
        AuthSessionImpl$logout$1 authSessionImpl$logout$1;
        int i;
        rkd0 rkd0Var;
        Object value;
        LogPriority logPriority;
        if (continuationImpl instanceof AuthSessionImpl$logout$1) {
            authSessionImpl$logout$1 = (AuthSessionImpl$logout$1) continuationImpl;
            int i2 = authSessionImpl$logout$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authSessionImpl$logout$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authSessionImpl$logout$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authSessionImpl$logout$1.label;
                String str = this.i;
                rkd0Var = this.e;
                if (i != 0) {
                    b.b(obj);
                    LogPriority logPriority2 = LogPriority.DEBUG;
                    if (rkd0Var.e(logPriority2)) {
                        rkd0Var.b(logPriority2, str, "logout(theme=" + plusAuthAdapter$Theme + ')', null);
                    }
                    AuthSessionImpl$logout$result$1 authSessionImpl$logout$result$1 = new AuthSessionImpl$logout$result$1(this, new c1d0(this.b, plusAuthAdapter$Theme), null);
                    authSessionImpl$logout$1.L$0 = null;
                    authSessionImpl$logout$1.L$1 = null;
                    authSessionImpl$logout$1.label = 1;
                    obj = tje.k0(this.f, authSessionImpl$logout$result$1, authSessionImpl$logout$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    value = jj.a;
                }
                logPriority = LogPriority.DEBUG;
                if (rkd0Var.e(logPriority)) {
                    rkd0Var.b(logPriority, str, "logout() result=" + ((Object) Result.c(value)), null);
                }
                return value;
            }
        }
        authSessionImpl$logout$1 = new AuthSessionImpl$logout$1(this, continuationImpl);
        Object obj2 = authSessionImpl$logout$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authSessionImpl$logout$1.label;
        String str2 = this.i;
        rkd0Var = this.e;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        logPriority = LogPriority.DEBUG;
        if (rkd0Var.e(logPriority)) {
        }
        return value;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, ContinuationImpl continuationImpl) {
        AuthSessionImpl$updateAndInjectAuthCookie$1 authSessionImpl$updateAndInjectAuthCookie$1;
        int i;
        rkd0 rkd0Var;
        Object failure;
        Object b;
        LogPriority logPriority;
        if (continuationImpl instanceof AuthSessionImpl$updateAndInjectAuthCookie$1) {
            authSessionImpl$updateAndInjectAuthCookie$1 = (AuthSessionImpl$updateAndInjectAuthCookie$1) continuationImpl;
            int i2 = authSessionImpl$updateAndInjectAuthCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authSessionImpl$updateAndInjectAuthCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authSessionImpl$updateAndInjectAuthCookie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authSessionImpl$updateAndInjectAuthCookie$1.label;
                String str2 = this.i;
                rkd0Var = this.e;
                if (i != 0) {
                    b.b(obj);
                    String uri = Uri.parse(str).buildUpon().clearQuery().path(null).fragment(null).build().toString();
                    LogPriority logPriority2 = LogPriority.DEBUG;
                    if (rkd0Var.e(logPriority2)) {
                        rkd0Var.b(logPriority2, str2, unr0.l(')', "updateAndInjectAuthCookie(domain=", uri), null);
                    }
                    rkd0 rkd0Var2 = (rkd0) this.j.a;
                    try {
                        CookieManager cookieManager = CookieManager.getInstance();
                        if (hm91.d("GET_COOKIE_INFO")) {
                            LogPriority logPriority3 = LogPriority.INFO;
                            if (rkd0Var2.e(logPriority3)) {
                                rkd0Var2.b(logPriority3, "CookieCleaner", "Clear cookie for domain", null);
                            }
                            Iterator it = qrb1.d(cookieManager, uri).iterator();
                            while (it.hasNext()) {
                                cookieManager.setCookie(uri, yvi0.q((String) it.next()));
                            }
                        } else {
                            LogPriority logPriority4 = LogPriority.INFO;
                            if (rkd0Var2.e(logPriority4)) {
                                rkd0Var2.b(logPriority4, "CookieCleaner", "Clear all cookies", null);
                            }
                            cookieManager.removeAllCookies(null);
                        }
                        cookieManager.flush();
                        failure = zy11.a;
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    if (!(failure instanceof Result.Failure)) {
                        LogPriority logPriority5 = LogPriority.INFO;
                        if (rkd0Var2.e(logPriority5)) {
                            rkd0Var2.b(logPriority5, "CookieCleaner", "Cookies cleared successfully", null);
                        }
                    }
                    Throwable a = Result.a(failure);
                    if (a != null) {
                        LogPriority logPriority6 = LogPriority.ERROR;
                        if (rkd0Var2.e(logPriority6)) {
                            rkd0Var2.b(logPriority6, "CookieCleaner", "Cookies are not cleared", a);
                        }
                    }
                    d1d0 d1d0Var = new d1d0(this.b, uri);
                    authSessionImpl$updateAndInjectAuthCookie$1.L$0 = null;
                    authSessionImpl$updateAndInjectAuthCookie$1.L$1 = null;
                    authSessionImpl$updateAndInjectAuthCookie$1.L$2 = null;
                    authSessionImpl$updateAndInjectAuthCookie$1.label = 1;
                    b = this.a.b(d1d0Var, authSessionImpl$updateAndInjectAuthCookie$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                logPriority = LogPriority.DEBUG;
                if (rkd0Var.e(logPriority)) {
                    rkd0Var.b(logPriority, str2, "updateAndInjectAuthCookie() result=" + ((Object) Result.c(b)), null);
                }
                return b;
            }
        }
        authSessionImpl$updateAndInjectAuthCookie$1 = new AuthSessionImpl$updateAndInjectAuthCookie$1(this, continuationImpl);
        Object obj2 = authSessionImpl$updateAndInjectAuthCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authSessionImpl$updateAndInjectAuthCookie$1.label;
        String str22 = this.i;
        rkd0Var = this.e;
        if (i != 0) {
        }
        logPriority = LogPriority.DEBUG;
        if (rkd0Var.e(logPriority)) {
        }
        return b;
    }
}
