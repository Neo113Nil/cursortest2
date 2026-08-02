package com.yandex.plus.core.network.okhttp.interceptor;

import com.yandex.plus.core.network.uri.b;
import defpackage.ny61;
import defpackage.sz50;
import defpackage.tv50;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final b a;

    public a(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tv50 tv50Var, ContinuationImpl continuationImpl) {
        CombinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1 combinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1;
        int i;
        sz50 sz50Var;
        if (continuationImpl instanceof CombinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1) {
            combinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1 = (CombinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1) continuationImpl;
            int i2 = combinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                combinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = combinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = combinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    combinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1.L$0 = tv50Var;
                    combinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1.label = 1;
                    obj = this.a.a(tv50Var, combinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    tv50Var = (tv50) combinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                sz50Var = (sz50) obj;
                if (sz50Var == null) {
                    return sz50Var;
                }
                Object obj2 = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b;
                combinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1.L$0 = null;
                combinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1.label = 2;
                Object b = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b(obj2, combinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        combinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1 = new CombinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1(this, continuationImpl);
        Object obj3 = combinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = combinedOkHttpNetworkCallInterceptor$interceptApplicationRequest$1.label;
        if (i != 0) {
        }
        sz50Var = (sz50) obj3;
        if (sz50Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(tv50 tv50Var, Continuation continuation) {
        CombinedOkHttpNetworkCallInterceptor$interceptCall$1 combinedOkHttpNetworkCallInterceptor$interceptCall$1;
        int i;
        if (continuation instanceof CombinedOkHttpNetworkCallInterceptor$interceptCall$1) {
            combinedOkHttpNetworkCallInterceptor$interceptCall$1 = (CombinedOkHttpNetworkCallInterceptor$interceptCall$1) continuation;
            int i2 = combinedOkHttpNetworkCallInterceptor$interceptCall$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                combinedOkHttpNetworkCallInterceptor$interceptCall$1.label = i2 - Integer.MIN_VALUE;
                Object obj = combinedOkHttpNetworkCallInterceptor$interceptCall$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = combinedOkHttpNetworkCallInterceptor$interceptCall$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    tv50Var = (tv50) combinedOkHttpNetworkCallInterceptor$interceptCall$1.L$0;
                    kotlin.b.b(obj);
                    sz50 sz50Var = (sz50) obj;
                    if (sz50Var != null) {
                        return sz50Var;
                    }
                }
                tv50Var.getClass();
                combinedOkHttpNetworkCallInterceptor$interceptCall$1.L$0 = null;
                combinedOkHttpNetworkCallInterceptor$interceptCall$1.label = 2;
                Object b = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b(zy11.a, combinedOkHttpNetworkCallInterceptor$interceptCall$1);
                return b != coroutineSingletons ? coroutineSingletons : b;
            }
        }
        combinedOkHttpNetworkCallInterceptor$interceptCall$1 = new CombinedOkHttpNetworkCallInterceptor$interceptCall$1(this, continuation);
        Object obj2 = combinedOkHttpNetworkCallInterceptor$interceptCall$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = combinedOkHttpNetworkCallInterceptor$interceptCall$1.label;
        if (i != 0) {
        }
        tv50Var.getClass();
        combinedOkHttpNetworkCallInterceptor$interceptCall$1.L$0 = null;
        combinedOkHttpNetworkCallInterceptor$interceptCall$1.label = 2;
        Object b2 = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b(zy11.a, combinedOkHttpNetworkCallInterceptor$interceptCall$1);
        if (b2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(tv50 tv50Var, Continuation continuation) {
        CombinedOkHttpNetworkCallInterceptor$interceptGet$1 combinedOkHttpNetworkCallInterceptor$interceptGet$1;
        int i;
        if (continuation instanceof CombinedOkHttpNetworkCallInterceptor$interceptGet$1) {
            combinedOkHttpNetworkCallInterceptor$interceptGet$1 = (CombinedOkHttpNetworkCallInterceptor$interceptGet$1) continuation;
            int i2 = combinedOkHttpNetworkCallInterceptor$interceptGet$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                combinedOkHttpNetworkCallInterceptor$interceptGet$1.label = i2 - Integer.MIN_VALUE;
                Object obj = combinedOkHttpNetworkCallInterceptor$interceptGet$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = combinedOkHttpNetworkCallInterceptor$interceptGet$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    tv50Var = (tv50) combinedOkHttpNetworkCallInterceptor$interceptGet$1.L$0;
                    kotlin.b.b(obj);
                    sz50 sz50Var = (sz50) obj;
                    if (sz50Var != null) {
                        return sz50Var;
                    }
                }
                Object obj2 = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b;
                combinedOkHttpNetworkCallInterceptor$interceptGet$1.L$0 = null;
                combinedOkHttpNetworkCallInterceptor$interceptGet$1.label = 2;
                Object b = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b(obj2, combinedOkHttpNetworkCallInterceptor$interceptGet$1);
                return b != coroutineSingletons ? coroutineSingletons : b;
            }
        }
        combinedOkHttpNetworkCallInterceptor$interceptGet$1 = new CombinedOkHttpNetworkCallInterceptor$interceptGet$1(this, continuation);
        Object obj3 = combinedOkHttpNetworkCallInterceptor$interceptGet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = combinedOkHttpNetworkCallInterceptor$interceptGet$1.label;
        if (i != 0) {
        }
        Object obj22 = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b;
        combinedOkHttpNetworkCallInterceptor$interceptGet$1.L$0 = null;
        combinedOkHttpNetworkCallInterceptor$interceptGet$1.label = 2;
        Object b2 = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b(obj22, combinedOkHttpNetworkCallInterceptor$interceptGet$1);
        if (b2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(tv50 tv50Var, Continuation continuation) {
        CombinedOkHttpNetworkCallInterceptor$interceptMap$1 combinedOkHttpNetworkCallInterceptor$interceptMap$1;
        int i;
        if (continuation instanceof CombinedOkHttpNetworkCallInterceptor$interceptMap$1) {
            combinedOkHttpNetworkCallInterceptor$interceptMap$1 = (CombinedOkHttpNetworkCallInterceptor$interceptMap$1) continuation;
            int i2 = combinedOkHttpNetworkCallInterceptor$interceptMap$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                combinedOkHttpNetworkCallInterceptor$interceptMap$1.label = i2 - Integer.MIN_VALUE;
                Object obj = combinedOkHttpNetworkCallInterceptor$interceptMap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = combinedOkHttpNetworkCallInterceptor$interceptMap$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    tv50Var = (tv50) combinedOkHttpNetworkCallInterceptor$interceptMap$1.L$0;
                    kotlin.b.b(obj);
                    sz50 sz50Var = (sz50) obj;
                    if (sz50Var != null) {
                        return sz50Var;
                    }
                }
                Object obj2 = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b;
                combinedOkHttpNetworkCallInterceptor$interceptMap$1.L$0 = null;
                combinedOkHttpNetworkCallInterceptor$interceptMap$1.label = 2;
                Object b = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b(obj2, combinedOkHttpNetworkCallInterceptor$interceptMap$1);
                return b != coroutineSingletons ? coroutineSingletons : b;
            }
        }
        combinedOkHttpNetworkCallInterceptor$interceptMap$1 = new CombinedOkHttpNetworkCallInterceptor$interceptMap$1(this, continuation);
        Object obj3 = combinedOkHttpNetworkCallInterceptor$interceptMap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = combinedOkHttpNetworkCallInterceptor$interceptMap$1.label;
        if (i != 0) {
        }
        Object obj22 = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b;
        combinedOkHttpNetworkCallInterceptor$interceptMap$1.L$0 = null;
        combinedOkHttpNetworkCallInterceptor$interceptMap$1.label = 2;
        Object b2 = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b(obj22, combinedOkHttpNetworkCallInterceptor$interceptMap$1);
        if (b2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(tv50 tv50Var, ContinuationImpl continuationImpl) {
        CombinedOkHttpNetworkCallInterceptor$interceptRawRequest$1 combinedOkHttpNetworkCallInterceptor$interceptRawRequest$1;
        int i;
        if (continuationImpl instanceof CombinedOkHttpNetworkCallInterceptor$interceptRawRequest$1) {
            combinedOkHttpNetworkCallInterceptor$interceptRawRequest$1 = (CombinedOkHttpNetworkCallInterceptor$interceptRawRequest$1) continuationImpl;
            int i2 = combinedOkHttpNetworkCallInterceptor$interceptRawRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                combinedOkHttpNetworkCallInterceptor$interceptRawRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = combinedOkHttpNetworkCallInterceptor$interceptRawRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = combinedOkHttpNetworkCallInterceptor$interceptRawRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    tv50Var = (tv50) combinedOkHttpNetworkCallInterceptor$interceptRawRequest$1.L$0;
                    kotlin.b.b(obj);
                    sz50 sz50Var = (sz50) obj;
                    if (sz50Var != null) {
                        return sz50Var;
                    }
                }
                Object obj2 = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b;
                combinedOkHttpNetworkCallInterceptor$interceptRawRequest$1.L$0 = null;
                combinedOkHttpNetworkCallInterceptor$interceptRawRequest$1.label = 2;
                Object b = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b(obj2, combinedOkHttpNetworkCallInterceptor$interceptRawRequest$1);
                return b != coroutineSingletons ? coroutineSingletons : b;
            }
        }
        combinedOkHttpNetworkCallInterceptor$interceptRawRequest$1 = new CombinedOkHttpNetworkCallInterceptor$interceptRawRequest$1(this, continuationImpl);
        Object obj3 = combinedOkHttpNetworkCallInterceptor$interceptRawRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = combinedOkHttpNetworkCallInterceptor$interceptRawRequest$1.label;
        if (i != 0) {
        }
        Object obj22 = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b;
        combinedOkHttpNetworkCallInterceptor$interceptRawRequest$1.L$0 = null;
        combinedOkHttpNetworkCallInterceptor$interceptRawRequest$1.label = 2;
        Object b2 = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b(obj22, combinedOkHttpNetworkCallInterceptor$interceptRawRequest$1);
        if (b2 != coroutineSingletons2) {
        }
    }
}
