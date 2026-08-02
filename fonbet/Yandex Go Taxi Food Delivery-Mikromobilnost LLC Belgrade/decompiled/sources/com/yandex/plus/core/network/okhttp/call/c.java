package com.yandex.plus.core.network.okhttp.call;

import defpackage.ah7;
import defpackage.dt50;
import defpackage.et50;
import defpackage.g0c;
import defpackage.gt50;
import defpackage.hw60;
import defpackage.iw60;
import defpackage.jt50;
import defpackage.jw60;
import defpackage.ny61;
import defpackage.pz50;
import defpackage.qoi0;
import defpackage.qz50;
import defpackage.sls;
import defpackage.sq50;
import defpackage.sz50;
import defpackage.tcc;
import defpackage.w511;
import defpackage.wls;
import defpackage.zl50;
import defpackage.zls;
import defpackage.zs50;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class c {
    public final Pair a;
    public final com.yandex.plus.core.network.client.a b;
    public final com.yandex.plus.core.network.client.a c;
    public final List d;
    public final com.yandex.plus.core.network.error.a e;
    public final zs50 f;

    public c(Pair pair, com.yandex.plus.core.network.client.a aVar, com.yandex.plus.core.network.client.a aVar2, List list, com.yandex.plus.core.network.error.a aVar3, zs50 zs50Var) {
        this.a = pair;
        this.b = aVar;
        this.c = aVar2;
        this.d = list;
        this.e = aVar3;
        this.f = zs50Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0180, code lost:
    
        if (r3 == r5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0182, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
    
        if (r3 == r5) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, sq50 sq50Var, List list, ContinuationImpl continuationImpl) {
        OkHttpNetworkCall$executeInner$1 okHttpNetworkCall$executeInner$1;
        int i;
        sz50 sz50Var;
        sq50 sq50Var2 = sq50Var;
        List list2 = list;
        cVar.getClass();
        if (continuationImpl instanceof OkHttpNetworkCall$executeInner$1) {
            okHttpNetworkCall$executeInner$1 = (OkHttpNetworkCall$executeInner$1) continuationImpl;
            int i2 = okHttpNetworkCall$executeInner$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                okHttpNetworkCall$executeInner$1.label = i2 - Integer.MIN_VALUE;
                Object obj = okHttpNetworkCall$executeInner$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = okHttpNetworkCall$executeInner$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list3) {
                        if (obj3 instanceof com.yandex.plus.core.network.okhttp.interceptor.a) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new iw60(0, (com.yandex.plus.core.network.okhttp.interceptor.a) it.next()));
                    }
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(new iw60(1, (com.yandex.plus.core.network.okhttp.interceptor.a) it2.next()));
                    }
                    hw60 hw60Var = new hw60(sq50Var2, arrayList2, arrayList3);
                    Pair pair = cVar.a;
                    Pair pair2 = new Pair(pair.getFirst(), new b((ah7) pair.getSecond(), hw60Var));
                    ArrayList arrayList4 = new ArrayList(tcc.n(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(new OkHttpNetworkCall$executeInner$getterResult$2$1(2, (com.yandex.plus.core.network.okhttp.interceptor.a) it3.next(), com.yandex.plus.core.network.okhttp.interceptor.a.class, "interceptGet", "interceptGet(Lcom/yandex/plus/core/network/interceptor/NetworkInterceptor$Chain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
                    }
                    okHttpNetworkCall$executeInner$1.L$0 = sq50Var2;
                    okHttpNetworkCall$executeInner$1.L$1 = list2;
                    okHttpNetworkCall$executeInner$1.L$2 = null;
                    okHttpNetworkCall$executeInner$1.L$3 = null;
                    okHttpNetworkCall$executeInner$1.label = 1;
                    obj = cVar.c(sq50Var2, pair2, arrayList4, okHttpNetworkCall$executeInner$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return (sz50) obj;
                    }
                    List list4 = (List) okHttpNetworkCall$executeInner$1.L$1;
                    sq50 sq50Var3 = (sq50) okHttpNetworkCall$executeInner$1.L$0;
                    kotlin.b.b(obj);
                    list2 = list4;
                    sq50Var2 = sq50Var3;
                }
                sz50Var = (sz50) obj;
                if (sz50Var instanceof qz50) {
                    if (sz50Var instanceof pz50) {
                        return new pz50(((pz50) sz50Var).a);
                    }
                    w511.b();
                    return null;
                }
                Object obj4 = ((qz50) sz50Var).a;
                List list5 = list2;
                ArrayList arrayList5 = new ArrayList(tcc.n(list5, 10));
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(new OkHttpNetworkCall$executeInner$mapperResult$1$model$1$1(2, (com.yandex.plus.core.network.okhttp.interceptor.a) it4.next(), com.yandex.plus.core.network.okhttp.interceptor.a.class, "interceptMap", "interceptMap(Lcom/yandex/plus/core/network/interceptor/NetworkInterceptor$Chain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
                }
                okHttpNetworkCall$executeInner$1.L$0 = null;
                okHttpNetworkCall$executeInner$1.L$1 = null;
                okHttpNetworkCall$executeInner$1.L$2 = null;
                okHttpNetworkCall$executeInner$1.L$3 = null;
                okHttpNetworkCall$executeInner$1.L$4 = null;
                okHttpNetworkCall$executeInner$1.L$5 = null;
                okHttpNetworkCall$executeInner$1.L$6 = null;
                okHttpNetworkCall$executeInner$1.I$0 = 0;
                okHttpNetworkCall$executeInner$1.I$1 = 0;
                okHttpNetworkCall$executeInner$1.label = 2;
                obj = cVar.d(sq50Var2, obj4, arrayList5, okHttpNetworkCall$executeInner$1);
            }
        }
        okHttpNetworkCall$executeInner$1 = new OkHttpNetworkCall$executeInner$1(cVar, continuationImpl);
        Object obj5 = okHttpNetworkCall$executeInner$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = okHttpNetworkCall$executeInner$1.label;
        if (i != 0) {
        }
        sz50Var = (sz50) obj5;
        if (sz50Var instanceof qz50) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq50 sq50Var, ContinuationImpl continuationImpl) {
        OkHttpNetworkCall$execute$1 okHttpNetworkCall$execute$1;
        int i;
        if (continuationImpl instanceof OkHttpNetworkCall$execute$1) {
            okHttpNetworkCall$execute$1 = (OkHttpNetworkCall$execute$1) continuationImpl;
            int i2 = okHttpNetworkCall$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                okHttpNetworkCall$execute$1.label = i2 - Integer.MIN_VALUE;
                OkHttpNetworkCall$execute$1 okHttpNetworkCall$execute$12 = okHttpNetworkCall$execute$1;
                Object obj = okHttpNetworkCall$execute$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = okHttpNetworkCall$execute$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g0c a = qoi0.a(com.yandex.plus.core.network.error.a.class);
                    LinkedHashMap linkedHashMap = sq50Var.a;
                    com.yandex.plus.core.network.error.a aVar = this.e;
                    if (aVar != null) {
                        linkedHashMap.put(a, aVar);
                    } else {
                        linkedHashMap.remove(a);
                    }
                    List list = this.d;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        com.yandex.plus.core.network.okhttp.interceptor.a aVar2 = (com.yandex.plus.core.network.okhttp.interceptor.a) ((sls) it.next()).invoke();
                        if (aVar2 != null) {
                            arrayList.add(aVar2);
                        }
                    }
                    zls okHttpNetworkCall$execute$result$1 = new OkHttpNetworkCall$execute$result$1(this, arrayList, null);
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new OkHttpNetworkCall$execute$result$2$1(2, (com.yandex.plus.core.network.okhttp.interceptor.a) it2.next(), com.yandex.plus.core.network.okhttp.interceptor.a.class, "interceptCall", "interceptCall(Lcom/yandex/plus/core/network/interceptor/NetworkInterceptor$Chain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
                    }
                    okHttpNetworkCall$execute$12.L$0 = null;
                    okHttpNetworkCall$execute$12.L$1 = null;
                    okHttpNetworkCall$execute$12.label = 1;
                    obj = e(sq50Var, zy11.a, okHttpNetworkCall$execute$result$1, arrayList2, et50.a, okHttpNetworkCall$execute$12);
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
                return (sz50) obj;
            }
        }
        okHttpNetworkCall$execute$1 = new OkHttpNetworkCall$execute$1(this, continuationImpl);
        OkHttpNetworkCall$execute$1 okHttpNetworkCall$execute$122 = okHttpNetworkCall$execute$1;
        Object obj3 = okHttpNetworkCall$execute$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = okHttpNetworkCall$execute$122.label;
        if (i != 0) {
        }
        return (sz50) obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq50 sq50Var, Pair pair, ArrayList arrayList, ContinuationImpl continuationImpl) {
        OkHttpNetworkCall$getInner$1 okHttpNetworkCall$getInner$1;
        int i;
        if (continuationImpl instanceof OkHttpNetworkCall$getInner$1) {
            okHttpNetworkCall$getInner$1 = (OkHttpNetworkCall$getInner$1) continuationImpl;
            int i2 = okHttpNetworkCall$getInner$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                okHttpNetworkCall$getInner$1.label = i2 - Integer.MIN_VALUE;
                OkHttpNetworkCall$getInner$1 okHttpNetworkCall$getInner$12 = okHttpNetworkCall$getInner$1;
                Object obj = okHttpNetworkCall$getInner$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = okHttpNetworkCall$getInner$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zls okHttpNetworkCall$getInner$dto$1 = new OkHttpNetworkCall$getInner$dto$1(this, null);
                    okHttpNetworkCall$getInner$12.L$0 = null;
                    okHttpNetworkCall$getInner$12.L$1 = null;
                    okHttpNetworkCall$getInner$12.L$2 = null;
                    okHttpNetworkCall$getInner$12.label = 1;
                    obj = e(sq50Var, pair, okHttpNetworkCall$getInner$dto$1, arrayList, gt50.a, okHttpNetworkCall$getInner$12);
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
                return (sz50) obj;
            }
        }
        okHttpNetworkCall$getInner$1 = new OkHttpNetworkCall$getInner$1(this, continuationImpl);
        OkHttpNetworkCall$getInner$1 okHttpNetworkCall$getInner$122 = okHttpNetworkCall$getInner$1;
        Object obj3 = okHttpNetworkCall$getInner$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = okHttpNetworkCall$getInner$122.label;
        if (i != 0) {
        }
        return (sz50) obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(sq50 sq50Var, Object obj, ArrayList arrayList, ContinuationImpl continuationImpl) {
        OkHttpNetworkCall$mapInner$1 okHttpNetworkCall$mapInner$1;
        int i;
        if (continuationImpl instanceof OkHttpNetworkCall$mapInner$1) {
            okHttpNetworkCall$mapInner$1 = (OkHttpNetworkCall$mapInner$1) continuationImpl;
            int i2 = okHttpNetworkCall$mapInner$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                okHttpNetworkCall$mapInner$1.label = i2 - Integer.MIN_VALUE;
                OkHttpNetworkCall$mapInner$1 okHttpNetworkCall$mapInner$12 = okHttpNetworkCall$mapInner$1;
                Object obj2 = okHttpNetworkCall$mapInner$12.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = okHttpNetworkCall$mapInner$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zls okHttpNetworkCall$mapInner$model$1 = new OkHttpNetworkCall$mapInner$model$1(this, null);
                    okHttpNetworkCall$mapInner$12.L$0 = null;
                    okHttpNetworkCall$mapInner$12.L$1 = null;
                    okHttpNetworkCall$mapInner$12.L$2 = null;
                    okHttpNetworkCall$mapInner$12.label = 1;
                    obj2 = e(sq50Var, obj, okHttpNetworkCall$mapInner$model$1, arrayList, dt50.a, okHttpNetworkCall$mapInner$12);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return (sz50) obj2;
            }
        }
        okHttpNetworkCall$mapInner$1 = new OkHttpNetworkCall$mapInner$1(this, continuationImpl);
        OkHttpNetworkCall$mapInner$1 okHttpNetworkCall$mapInner$122 = okHttpNetworkCall$mapInner$1;
        Object obj22 = okHttpNetworkCall$mapInner$122.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = okHttpNetworkCall$mapInner$122.label;
        if (i != 0) {
        }
        return (sz50) obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(sq50 sq50Var, Object obj, zls zlsVar, List list, jt50 jt50Var, ContinuationImpl continuationImpl) {
        OkHttpNetworkCall$runChain$1 okHttpNetworkCall$runChain$1;
        int i;
        if (continuationImpl instanceof OkHttpNetworkCall$runChain$1) {
            okHttpNetworkCall$runChain$1 = (OkHttpNetworkCall$runChain$1) continuationImpl;
            int i2 = okHttpNetworkCall$runChain$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                okHttpNetworkCall$runChain$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = okHttpNetworkCall$runChain$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = okHttpNetworkCall$runChain$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    iw60 iw60Var = new iw60(2, zlsVar);
                    List list2 = list;
                    int i3 = 10;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new jw60((wls) it.next()));
                    }
                    com.yandex.plus.core.network.interceptor.a aVar = new com.yandex.plus.core.network.interceptor.a(sq50Var, obj, kotlin.collections.a.o0(arrayList, iw60Var), 0, new zl50(i3, this, jt50Var), true);
                    okHttpNetworkCall$runChain$1.L$0 = null;
                    okHttpNetworkCall$runChain$1.L$1 = null;
                    okHttpNetworkCall$runChain$1.L$2 = null;
                    okHttpNetworkCall$runChain$1.L$3 = null;
                    okHttpNetworkCall$runChain$1.L$4 = null;
                    okHttpNetworkCall$runChain$1.L$5 = null;
                    okHttpNetworkCall$runChain$1.L$6 = null;
                    okHttpNetworkCall$runChain$1.L$7 = null;
                    okHttpNetworkCall$runChain$1.label = 1;
                    obj2 = aVar.b(obj, okHttpNetworkCall$runChain$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return (sz50) obj2;
            }
        }
        okHttpNetworkCall$runChain$1 = new OkHttpNetworkCall$runChain$1(this, continuationImpl);
        Object obj22 = okHttpNetworkCall$runChain$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = okHttpNetworkCall$runChain$1.label;
        if (i != 0) {
        }
        return (sz50) obj22;
    }
}
