package com.ybsdk.common.repositiories.auth;

import defpackage.fp90;
import defpackage.gff;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.ppp0;
import defpackage.rn90;
import defpackage.sn90;
import defpackage.t4o;
import defpackage.u4o;
import defpackage.v4o;
import defpackage.w4o;
import defpackage.w511;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class b {
    public final ppp0 a;
    public final w4o b;
    public final gff c;
    public volatile String d;

    public b(ppp0 ppp0Var, w4o w4oVar, gff gffVar) {
        this.a = ppp0Var;
        this.b = w4oVar;
        this.c = gffVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        if (r9 == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0069, code lost:
    
        if (((com.ybsdk.feature.passport.impl.a) r10).a(r9, r1) == r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Long l, String str, ContinuationImpl continuationImpl) {
        AuthTokenRepository$acquireTokenForUid$1 authTokenRepository$acquireTokenForUid$1;
        int i;
        Object b;
        sn90 sn90Var = sn90.a;
        if (continuationImpl instanceof AuthTokenRepository$acquireTokenForUid$1) {
            authTokenRepository$acquireTokenForUid$1 = (AuthTokenRepository$acquireTokenForUid$1) continuationImpl;
            int i2 = authTokenRepository$acquireTokenForUid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authTokenRepository$acquireTokenForUid$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authTokenRepository$acquireTokenForUid$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authTokenRepository$acquireTokenForUid$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str != null) {
                        this.d = null;
                        r0 r0Var = this.c.e;
                        r0Var.getClass();
                        r0Var.m(null, sn90Var);
                        ppp0 ppp0Var = this.a;
                        authTokenRepository$acquireTokenForUid$1.L$0 = l;
                        authTokenRepository$acquireTokenForUid$1.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        l = (Long) authTokenRepository$acquireTokenForUid$1.L$0;
                        kotlin.b.b(obj);
                        fp90 fp90Var = (fp90) obj;
                        b = fp90Var != null ? fp90Var.a : null;
                        String str2 = (String) b;
                        fp90 fp90Var2 = str2 != null ? new fp90(str2) : null;
                        String str3 = fp90Var2 != null ? fp90Var2.a : null;
                        if (str3 != null) {
                            long longValue = l.longValue();
                            r0 r0Var2 = this.c.e;
                            rn90 rn90Var = new rn90(longValue, str3);
                            r0Var2.getClass();
                            r0Var2.m(null, rn90Var);
                        } else {
                            r0 r0Var3 = this.c.e;
                            r0Var3.getClass();
                            r0Var3.m(null, sn90Var);
                        }
                        if (fp90Var2 != null) {
                            return fp90Var2.a;
                        }
                        return null;
                    }
                    l = (Long) authTokenRepository$acquireTokenForUid$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                }
                if (l != null) {
                    this.d = null;
                    r0 r0Var4 = this.c.e;
                    r0Var4.getClass();
                    r0Var4.m(null, sn90Var);
                    return null;
                }
                String str4 = this.d;
                if (str4 != null) {
                    return str4;
                }
                long longValue2 = l.longValue();
                authTokenRepository$acquireTokenForUid$1.L$0 = l;
                authTokenRepository$acquireTokenForUid$1.label = 2;
                b = b(longValue2, authTokenRepository$acquireTokenForUid$1);
            }
        }
        authTokenRepository$acquireTokenForUid$1 = new AuthTokenRepository$acquireTokenForUid$1(this, continuationImpl);
        Object obj3 = authTokenRepository$acquireTokenForUid$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authTokenRepository$acquireTokenForUid$1.label;
        if (i != 0) {
        }
        if (l != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, ContinuationImpl continuationImpl) {
        AuthTokenRepository$requestNewPassportToken$1 authTokenRepository$requestNewPassportToken$1;
        int i;
        String str;
        String str2;
        Object i2;
        u4o u4oVar = u4o.d;
        if (continuationImpl instanceof AuthTokenRepository$requestNewPassportToken$1) {
            authTokenRepository$requestNewPassportToken$1 = (AuthTokenRepository$requestNewPassportToken$1) continuationImpl;
            int i3 = authTokenRepository$requestNewPassportToken$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                authTokenRepository$requestNewPassportToken$1.label = i3 - Integer.MIN_VALUE;
                AuthTokenRepository$requestNewPassportToken$1 authTokenRepository$requestNewPassportToken$12 = authTokenRepository$requestNewPassportToken$1;
                Object obj = authTokenRepository$requestNewPassportToken$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authTokenRepository$requestNewPassportToken$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ppp0 ppp0Var = this.a;
                    w4o w4oVar = this.b;
                    t4o t4oVar = t4o.d;
                    if (jl40.l(w4oVar, t4oVar) || jl40.l(w4oVar, u4oVar)) {
                        str = "i0uxHICRtJ6ADcXqh3nbrHMymNU7HxMVz2DbcjwM2xlnAIf9Y64qaA8N1yjjlX3l";
                    } else {
                        if (!jl40.l(w4oVar, v4o.d)) {
                            w511.b();
                            return null;
                        }
                        str = "20rlHtWTss7WCMm9hyrd/HbGwJAgcySSwbE5tk8VR2Nrbpft33a+/EJJvgjvESsG";
                    }
                    String str3 = str;
                    w4o w4oVar2 = this.b;
                    if (jl40.l(w4oVar2, t4oVar) || jl40.l(w4oVar2, u4oVar)) {
                        str2 = "jhjjGtDEsZyAWcPrhyjepzrmoBzEyd1LSeYTDMAVCRDSS97JK631OThXCVZ+rSBt";
                    } else {
                        if (!jl40.l(w4oVar2, v4o.d)) {
                            w511.b();
                            return null;
                        }
                        str2 = "30u0EIec5M7TW8brhyra/RF/qYyLEdi9QvqOHBnLRoSCGfbtKJGQY0c7TNO6hico";
                    }
                    String str4 = str2;
                    authTokenRepository$requestNewPassportToken$12.label = 1;
                    i2 = ((com.ybsdk.feature.passport.impl.a) ppp0Var).i(j, str3, str4, authTokenRepository$requestNewPassportToken$12);
                    if (i2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    i2 = ((Result) obj).getValue();
                }
                if (i2 instanceof Result.Failure) {
                    i2 = null;
                }
                fp90 fp90Var = (fp90) i2;
                String str5 = fp90Var != null ? fp90Var.a : null;
                this.d = str5;
                return str5;
            }
        }
        authTokenRepository$requestNewPassportToken$1 = new AuthTokenRepository$requestNewPassportToken$1(this, continuationImpl);
        AuthTokenRepository$requestNewPassportToken$1 authTokenRepository$requestNewPassportToken$122 = authTokenRepository$requestNewPassportToken$1;
        Object obj2 = authTokenRepository$requestNewPassportToken$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authTokenRepository$requestNewPassportToken$122.label;
        if (i != 0) {
        }
        if (i2 instanceof Result.Failure) {
        }
        fp90 fp90Var2 = (fp90) i2;
        if (fp90Var2 != null) {
        }
        this.d = str5;
        return str5;
    }
}
