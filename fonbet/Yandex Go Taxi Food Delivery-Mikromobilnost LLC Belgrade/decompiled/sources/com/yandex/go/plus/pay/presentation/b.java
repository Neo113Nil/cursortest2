package com.yandex.go.plus.pay.presentation;

import defpackage.a1d0;
import defpackage.b1d0;
import defpackage.c1d0;
import defpackage.d1d0;
import defpackage.e1d0;
import defpackage.ep90;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.w0d0;
import defpackage.y0d0;
import defpackage.z0d0;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.am.m;

/* loaded from: classes13.dex */
public final class b implements e1d0 {
    public final com.yandex.plus.adapter.auth.passport750.a a;
    public final m b;

    public b(ep90 ep90Var, m mVar, tse tseVar) {
        this.a = new com.yandex.plus.adapter.auth.passport750.a(ep90Var.a());
        this.b = mVar;
        tje.N(tseVar, null, null, new PlusPaySdkAuthAdapter$1(this, null), 3);
    }

    @Override // defpackage.e1d0
    public final r0 a() {
        return this.a.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(d1d0 d1d0Var, ContinuationImpl continuationImpl) {
        PlusPaySdkAuthAdapter$updateAndInjectAuthCookie$1 plusPaySdkAuthAdapter$updateAndInjectAuthCookie$1;
        int i;
        if (continuationImpl instanceof PlusPaySdkAuthAdapter$updateAndInjectAuthCookie$1) {
            plusPaySdkAuthAdapter$updateAndInjectAuthCookie$1 = (PlusPaySdkAuthAdapter$updateAndInjectAuthCookie$1) continuationImpl;
            int i2 = plusPaySdkAuthAdapter$updateAndInjectAuthCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPaySdkAuthAdapter$updateAndInjectAuthCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusPaySdkAuthAdapter$updateAndInjectAuthCookie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPaySdkAuthAdapter$updateAndInjectAuthCookie$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    plusPaySdkAuthAdapter$updateAndInjectAuthCookie$1.L$0 = null;
                    plusPaySdkAuthAdapter$updateAndInjectAuthCookie$1.label = 1;
                    Object b = this.a.b(d1d0Var, plusPaySdkAuthAdapter$updateAndInjectAuthCookie$1);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        plusPaySdkAuthAdapter$updateAndInjectAuthCookie$1 = new PlusPaySdkAuthAdapter$updateAndInjectAuthCookie$1(this, continuationImpl);
        Object obj2 = plusPaySdkAuthAdapter$updateAndInjectAuthCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPaySdkAuthAdapter$updateAndInjectAuthCookie$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a1d0 a1d0Var, ContinuationImpl continuationImpl) {
        PlusPaySdkAuthAdapter$isXTokenValid$1 plusPaySdkAuthAdapter$isXTokenValid$1;
        int i;
        if (continuationImpl instanceof PlusPaySdkAuthAdapter$isXTokenValid$1) {
            plusPaySdkAuthAdapter$isXTokenValid$1 = (PlusPaySdkAuthAdapter$isXTokenValid$1) continuationImpl;
            int i2 = plusPaySdkAuthAdapter$isXTokenValid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPaySdkAuthAdapter$isXTokenValid$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusPaySdkAuthAdapter$isXTokenValid$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPaySdkAuthAdapter$isXTokenValid$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    plusPaySdkAuthAdapter$isXTokenValid$1.L$0 = null;
                    plusPaySdkAuthAdapter$isXTokenValid$1.label = 1;
                    Object c = this.a.c(a1d0Var, plusPaySdkAuthAdapter$isXTokenValid$1);
                    return c == coroutineSingletons ? coroutineSingletons : c;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        plusPaySdkAuthAdapter$isXTokenValid$1 = new PlusPaySdkAuthAdapter$isXTokenValid$1(this, continuationImpl);
        Object obj2 = plusPaySdkAuthAdapter$isXTokenValid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPaySdkAuthAdapter$isXTokenValid$1.label;
        if (i != 0) {
        }
    }

    @Override // defpackage.e1d0
    public final Object e(b1d0 b1d0Var, Continuation continuation) {
        return new Result.Failure(new NotImplementedError("Login via SDK is not supported!"));
    }

    @Override // defpackage.e1d0
    public final Object f(c1d0 c1d0Var, Continuation continuation) {
        return new Result.Failure(new NotImplementedError("Logout via SDK is not supported!"));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(w0d0 w0d0Var, ContinuationImpl continuationImpl) {
        PlusPaySdkAuthAdapter$dropAuthToken$1 plusPaySdkAuthAdapter$dropAuthToken$1;
        int i;
        if (continuationImpl instanceof PlusPaySdkAuthAdapter$dropAuthToken$1) {
            plusPaySdkAuthAdapter$dropAuthToken$1 = (PlusPaySdkAuthAdapter$dropAuthToken$1) continuationImpl;
            int i2 = plusPaySdkAuthAdapter$dropAuthToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPaySdkAuthAdapter$dropAuthToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusPaySdkAuthAdapter$dropAuthToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPaySdkAuthAdapter$dropAuthToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    plusPaySdkAuthAdapter$dropAuthToken$1.L$0 = null;
                    plusPaySdkAuthAdapter$dropAuthToken$1.label = 1;
                    Object g = this.a.g(w0d0Var, plusPaySdkAuthAdapter$dropAuthToken$1);
                    return g == coroutineSingletons ? coroutineSingletons : g;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        plusPaySdkAuthAdapter$dropAuthToken$1 = new PlusPaySdkAuthAdapter$dropAuthToken$1(this, continuationImpl);
        Object obj2 = plusPaySdkAuthAdapter$dropAuthToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPaySdkAuthAdapter$dropAuthToken$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(z0d0 z0d0Var, ContinuationImpl continuationImpl) {
        PlusPaySdkAuthAdapter$getAuthorizationUrl$1 plusPaySdkAuthAdapter$getAuthorizationUrl$1;
        int i;
        if (continuationImpl instanceof PlusPaySdkAuthAdapter$getAuthorizationUrl$1) {
            plusPaySdkAuthAdapter$getAuthorizationUrl$1 = (PlusPaySdkAuthAdapter$getAuthorizationUrl$1) continuationImpl;
            int i2 = plusPaySdkAuthAdapter$getAuthorizationUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPaySdkAuthAdapter$getAuthorizationUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusPaySdkAuthAdapter$getAuthorizationUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPaySdkAuthAdapter$getAuthorizationUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    plusPaySdkAuthAdapter$getAuthorizationUrl$1.L$0 = null;
                    plusPaySdkAuthAdapter$getAuthorizationUrl$1.label = 1;
                    Object h = this.a.h(z0d0Var, plusPaySdkAuthAdapter$getAuthorizationUrl$1);
                    return h == coroutineSingletons ? coroutineSingletons : h;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        plusPaySdkAuthAdapter$getAuthorizationUrl$1 = new PlusPaySdkAuthAdapter$getAuthorizationUrl$1(this, continuationImpl);
        Object obj2 = plusPaySdkAuthAdapter$getAuthorizationUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPaySdkAuthAdapter$getAuthorizationUrl$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(y0d0 y0d0Var, ContinuationImpl continuationImpl) {
        PlusPaySdkAuthAdapter$getAuthToken$1 plusPaySdkAuthAdapter$getAuthToken$1;
        int i;
        if (continuationImpl instanceof PlusPaySdkAuthAdapter$getAuthToken$1) {
            plusPaySdkAuthAdapter$getAuthToken$1 = (PlusPaySdkAuthAdapter$getAuthToken$1) continuationImpl;
            int i2 = plusPaySdkAuthAdapter$getAuthToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPaySdkAuthAdapter$getAuthToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusPaySdkAuthAdapter$getAuthToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPaySdkAuthAdapter$getAuthToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    plusPaySdkAuthAdapter$getAuthToken$1.L$0 = null;
                    plusPaySdkAuthAdapter$getAuthToken$1.label = 1;
                    Object i3 = this.a.i(y0d0Var, plusPaySdkAuthAdapter$getAuthToken$1);
                    return i3 == coroutineSingletons ? coroutineSingletons : i3;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        plusPaySdkAuthAdapter$getAuthToken$1 = new PlusPaySdkAuthAdapter$getAuthToken$1(this, continuationImpl);
        Object obj2 = plusPaySdkAuthAdapter$getAuthToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPaySdkAuthAdapter$getAuthToken$1.label;
        if (i != 0) {
        }
    }
}
