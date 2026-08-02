package com.yandex.plus.core.network.interceptor;

import defpackage.ny61;
import defpackage.pz50;
import defpackage.qz50;
import defpackage.sq50;
import defpackage.sz50;
import defpackage.tls;
import defpackage.tv50;
import defpackage.uv50;
import defpackage.w511;
import java.util.ArrayList;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements tv50 {
    public final sq50 a;
    public final Object b;
    public final ArrayList c;
    public final int d;
    public final tls e;
    public final boolean f;
    public int g;

    public a(sq50 sq50Var, Object obj, ArrayList arrayList, int i, tls tlsVar, boolean z) {
        this.a = sq50Var;
        this.b = obj;
        this.c = arrayList;
        this.d = i;
        this.e = tlsVar;
        this.f = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        NetworkInterceptorChainImpl$getInterceptor$1 networkInterceptorChainImpl$getInterceptor$1;
        int i;
        if (continuationImpl instanceof NetworkInterceptorChainImpl$getInterceptor$1) {
            networkInterceptorChainImpl$getInterceptor$1 = (NetworkInterceptorChainImpl$getInterceptor$1) continuationImpl;
            int i2 = networkInterceptorChainImpl$getInterceptor$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                networkInterceptorChainImpl$getInterceptor$1.label = i2 - Integer.MIN_VALUE;
                Object obj = networkInterceptorChainImpl$getInterceptor$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = networkInterceptorChainImpl$getInterceptor$1.label;
                if (i != 0) {
                    b.b(obj);
                    NetworkInterceptorChainImpl$getInterceptor$result$1 networkInterceptorChainImpl$getInterceptor$result$1 = new NetworkInterceptorChainImpl$getInterceptor$result$1(this, null);
                    networkInterceptorChainImpl$getInterceptor$1.label = 1;
                    obj = com.yandex.plus.core.network.call.a.c(this.e, networkInterceptorChainImpl$getInterceptor$result$1, networkInterceptorChainImpl$getInterceptor$1);
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
                return (sz50) obj;
            }
        }
        networkInterceptorChainImpl$getInterceptor$1 = new NetworkInterceptorChainImpl$getInterceptor$1(this, continuationImpl);
        Object obj2 = networkInterceptorChainImpl$getInterceptor$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkInterceptorChainImpl$getInterceptor$1.label;
        if (i != 0) {
        }
        return (sz50) obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, ContinuationImpl continuationImpl) {
        NetworkInterceptorChainImpl$proceed$1 networkInterceptorChainImpl$proceed$1;
        int i;
        sz50 sz50Var;
        if (continuationImpl instanceof NetworkInterceptorChainImpl$proceed$1) {
            networkInterceptorChainImpl$proceed$1 = (NetworkInterceptorChainImpl$proceed$1) continuationImpl;
            int i2 = networkInterceptorChainImpl$proceed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                networkInterceptorChainImpl$proceed$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = networkInterceptorChainImpl$proceed$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = networkInterceptorChainImpl$proceed$1.label;
                if (i != 0) {
                    b.b(obj2);
                    networkInterceptorChainImpl$proceed$1.L$0 = obj;
                    networkInterceptorChainImpl$proceed$1.label = 1;
                    obj2 = a(networkInterceptorChainImpl$proceed$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj2);
                        return (sz50) obj2;
                    }
                    obj = networkInterceptorChainImpl$proceed$1.L$0;
                    b.b(obj2);
                }
                sz50Var = (sz50) obj2;
                if (sz50Var instanceof qz50) {
                    if (sz50Var instanceof pz50) {
                        return new pz50(((pz50) sz50Var).a);
                    }
                    w511.b();
                    return null;
                }
                uv50 uv50Var = (uv50) ((qz50) sz50Var).a;
                networkInterceptorChainImpl$proceed$1.L$0 = null;
                networkInterceptorChainImpl$proceed$1.L$1 = null;
                networkInterceptorChainImpl$proceed$1.L$2 = null;
                networkInterceptorChainImpl$proceed$1.I$0 = 0;
                networkInterceptorChainImpl$proceed$1.I$1 = 0;
                networkInterceptorChainImpl$proceed$1.label = 2;
                obj2 = c(obj, uv50Var, networkInterceptorChainImpl$proceed$1);
            }
        }
        networkInterceptorChainImpl$proceed$1 = new NetworkInterceptorChainImpl$proceed$1(this, continuationImpl);
        Object obj22 = networkInterceptorChainImpl$proceed$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkInterceptorChainImpl$proceed$1.label;
        if (i != 0) {
        }
        sz50Var = (sz50) obj22;
        if (sz50Var instanceof qz50) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, uv50 uv50Var, ContinuationImpl continuationImpl) {
        NetworkInterceptorChainImpl$proceedInner$1 networkInterceptorChainImpl$proceedInner$1;
        int i;
        sz50 sz50Var;
        if (continuationImpl instanceof NetworkInterceptorChainImpl$proceedInner$1) {
            networkInterceptorChainImpl$proceedInner$1 = (NetworkInterceptorChainImpl$proceedInner$1) continuationImpl;
            int i2 = networkInterceptorChainImpl$proceedInner$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                networkInterceptorChainImpl$proceedInner$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = networkInterceptorChainImpl$proceedInner$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = networkInterceptorChainImpl$proceedInner$1.label;
                if (i != 0) {
                    b.b(obj2);
                    NetworkInterceptorChainImpl$proceedInner$result$1 networkInterceptorChainImpl$proceedInner$result$1 = new NetworkInterceptorChainImpl$proceedInner$result$1(this, obj, uv50Var, null);
                    networkInterceptorChainImpl$proceedInner$1.L$0 = null;
                    networkInterceptorChainImpl$proceedInner$1.L$1 = null;
                    networkInterceptorChainImpl$proceedInner$1.label = 1;
                    obj2 = com.yandex.plus.core.network.call.a.c(this.e, networkInterceptorChainImpl$proceedInner$result$1, networkInterceptorChainImpl$proceedInner$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                sz50Var = (sz50) obj2;
                if (!(sz50Var instanceof qz50)) {
                    return (sz50) ((qz50) sz50Var).a;
                }
                if (sz50Var instanceof pz50) {
                    return new pz50(((pz50) sz50Var).a);
                }
                w511.b();
                return null;
            }
        }
        networkInterceptorChainImpl$proceedInner$1 = new NetworkInterceptorChainImpl$proceedInner$1(this, continuationImpl);
        Object obj22 = networkInterceptorChainImpl$proceedInner$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkInterceptorChainImpl$proceedInner$1.label;
        if (i != 0) {
        }
        sz50Var = (sz50) obj22;
        if (!(sz50Var instanceof qz50)) {
        }
    }
}
