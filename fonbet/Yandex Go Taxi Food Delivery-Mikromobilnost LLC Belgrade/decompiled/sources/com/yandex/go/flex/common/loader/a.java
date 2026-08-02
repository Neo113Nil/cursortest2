package com.yandex.go.flex.common.loader;

import defpackage.g050;
import defpackage.g0m;
import defpackage.gtq0;
import defpackage.i7x0;
import defpackage.ike;
import defpackage.j0m;
import defpackage.jl40;
import defpackage.k0m;
import defpackage.kq90;
import defpackage.l0m;
import defpackage.m0m;
import defpackage.ny61;
import defpackage.q370;
import defpackage.qv10;
import defpackage.t2k0;
import defpackage.thb1;
import defpackage.tje;
import defpackage.tzl;
import defpackage.u1l;
import defpackage.u1m;
import defpackage.uzl;
import defpackage.w511;
import defpackage.wbe0;
import defpackage.wls;
import defpackage.wzl;
import defpackage.y4j0;
import defpackage.ywl;
import defpackage.zy11;
import flex.core.loader.network.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public abstract class a implements m0m {
    public final ike a;
    public final e b;
    public final kotlinx.coroutines.sync.a c = gtq0.a();
    public final LinkedHashMap w = new LinkedHashMap();

    public a(ike ikeVar, e eVar) {
        this.a = ikeVar;
        this.b = eVar;
    }

    public static Object a(Collection collection, y4j0 y4j0Var, Continuation continuation) {
        Iterator it = new u1l(2, kotlin.collections.a.J0(collection)).iterator();
        while (true) {
            t2k0 t2k0Var = (t2k0) it;
            if (!t2k0Var.a.hasPrevious()) {
                return b.a(collection, (ContinuationImpl) continuation);
            }
            y4j0 y4j0Var2 = (y4j0) t2k0Var.a.previous();
            g0m g0mVar = y4j0Var2.a;
            l0m l0mVar = y4j0Var.a.b;
            k0m k0mVar = k0m.a;
            if (!jl40.l(l0mVar, k0mVar)) {
                if (!(l0mVar instanceof j0m)) {
                    w511.b();
                    return null;
                }
                l0m l0mVar2 = g0mVar.b;
                if (!jl40.l(l0mVar2, k0mVar) && !(l0mVar2 instanceof j0m)) {
                    w511.b();
                    return null;
                }
                if (!thb1.c(g0mVar)) {
                    y4j0Var2.c = true;
                    y4j0Var2.b.a(null);
                }
            }
        }
    }

    @Override // defpackage.m0m
    public final Object b(u1m u1mVar, i7x0 i7x0Var, boolean z, ContinuationImpl continuationImpl) {
        return this.b.b(u1mVar, i7x0Var, z, continuationImpl);
    }

    @Override // defpackage.m0m
    public final Object c(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, i7x0 i7x0Var, boolean z4, ContinuationImpl continuationImpl) {
        return f(u1mVar, new j0m(z2), new LinkedDocumentLoader$fetchDocument$2(this, u1mVar, ywlVar, z, z2, z3, i7x0Var, z4, null), continuationImpl);
    }

    @Override // defpackage.m0m
    public final Object d(u1m u1mVar, wbe0 wbe0Var, q370 q370Var, kq90 kq90Var, Continuation continuation) {
        return f(u1mVar, k0m.a, new LinkedDocumentLoader$fetchPortion$2(this, u1mVar, wbe0Var, q370Var, kq90Var, null), (ContinuationImpl) continuation);
    }

    @Override // defpackage.m0m
    public final Object e(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, i7x0 i7x0Var, ContinuationImpl continuationImpl) {
        return c(u1mVar, ywlVar, z, z2, false, i7x0Var, false, continuationImpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0194 A[Catch: all -> 0x0057, CancellationException -> 0x005a, TRY_LEAVE, TryCatch #9 {CancellationException -> 0x005a, all -> 0x0057, blocks: (B:14:0x0052, B:15:0x018a, B:17:0x0194), top: B:13:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0124 A[Catch: all -> 0x012d, TryCatch #8 {all -> 0x012d, blocks: (B:56:0x0102, B:58:0x0124, B:59:0x0130), top: B:55:0x0102, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, y4j0] */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v16, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(u1m u1mVar, l0m l0mVar, wls wlsVar, ContinuationImpl continuationImpl) {
        LinkedDocumentLoader$enqueue$1 linkedDocumentLoader$enqueue$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        kotlinx.coroutines.sync.a aVar;
        u1m u1mVar2;
        l0m l0mVar2;
        wls wlsVar2;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        Ref$ObjectRef ref$ObjectRef5;
        Object obj2;
        Ref$ObjectRef ref$ObjectRef6;
        Collection collection;
        y4j0 y4j0Var;
        Object obj3;
        Ref$ObjectRef ref$ObjectRef7;
        Object uzlVar;
        y4j0 y4j0Var2;
        ike ikeVar;
        LinkedDocumentLoader$enqueue$3$1 linkedDocumentLoader$enqueue$3$1;
        y4j0 y4j0Var3;
        zy11 zy11Var = zy11.a;
        try {
            try {
                try {
                    if (continuationImpl instanceof LinkedDocumentLoader$enqueue$1) {
                        linkedDocumentLoader$enqueue$1 = (LinkedDocumentLoader$enqueue$1) continuationImpl;
                        int i2 = linkedDocumentLoader$enqueue$1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            linkedDocumentLoader$enqueue$1.label = i2 - Integer.MIN_VALUE;
                            obj = linkedDocumentLoader$enqueue$1.result;
                            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = linkedDocumentLoader$enqueue$1.label;
                            if (i != 0) {
                                Ref$ObjectRef z = qv10.z(obj);
                                Ref$ObjectRef ref$ObjectRef8 = new Ref$ObjectRef();
                                try {
                                    Ref$ObjectRef ref$ObjectRef9 = new Ref$ObjectRef();
                                    Ref$ObjectRef ref$ObjectRef10 = new Ref$ObjectRef();
                                    aVar = this.c;
                                    u1mVar2 = u1mVar;
                                    linkedDocumentLoader$enqueue$1.L$0 = u1mVar2;
                                    l0mVar2 = l0mVar;
                                    linkedDocumentLoader$enqueue$1.L$1 = l0mVar2;
                                    wlsVar2 = wlsVar;
                                    linkedDocumentLoader$enqueue$1.L$2 = wlsVar2;
                                    linkedDocumentLoader$enqueue$1.L$3 = z;
                                    linkedDocumentLoader$enqueue$1.L$4 = ref$ObjectRef8;
                                    linkedDocumentLoader$enqueue$1.L$5 = ref$ObjectRef9;
                                    linkedDocumentLoader$enqueue$1.L$6 = ref$ObjectRef10;
                                    linkedDocumentLoader$enqueue$1.L$7 = aVar;
                                    linkedDocumentLoader$enqueue$1.label = 1;
                                    if (aVar.a(linkedDocumentLoader$enqueue$1) != coroutineSingletons) {
                                        ref$ObjectRef = z;
                                        ref$ObjectRef3 = ref$ObjectRef10;
                                        ref$ObjectRef4 = ref$ObjectRef8;
                                        ref$ObjectRef5 = ref$ObjectRef9;
                                    }
                                    return coroutineSingletons;
                                } catch (CancellationException e) {
                                    e = e;
                                    ref$ObjectRef = z;
                                    ref$ObjectRef2 = ref$ObjectRef8;
                                    kotlinx.coroutines.a.k(linkedDocumentLoader$enqueue$1.get_context());
                                    uzlVar = new tzl(e);
                                    y4j0Var2 = (y4j0) ref$ObjectRef2.element;
                                    if (y4j0Var2 != null) {
                                        ikeVar = this.a;
                                        linkedDocumentLoader$enqueue$3$1 = new LinkedDocumentLoader$enqueue$3$1(this, ref$ObjectRef, y4j0Var2, null);
                                        tje.N(ikeVar, null, null, linkedDocumentLoader$enqueue$3$1, 3);
                                        y4j0Var2.d.T(zy11Var);
                                    }
                                    return uzlVar;
                                } catch (Throwable th) {
                                    th = th;
                                    ref$ObjectRef = z;
                                    ref$ObjectRef2 = ref$ObjectRef8;
                                    uzlVar = new uzl(th);
                                    y4j0Var2 = (y4j0) ref$ObjectRef2.element;
                                    if (y4j0Var2 != null) {
                                        ikeVar = this.a;
                                        linkedDocumentLoader$enqueue$3$1 = new LinkedDocumentLoader$enqueue$3$1(this, ref$ObjectRef, y4j0Var2, null);
                                        tje.N(ikeVar, null, null, linkedDocumentLoader$enqueue$3$1, 3);
                                        y4j0Var2.d.T(zy11Var);
                                    }
                                    return uzlVar;
                                }
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    obj3 = linkedDocumentLoader$enqueue$1.L$7;
                                    ref$ObjectRef7 = (Ref$ObjectRef) linkedDocumentLoader$enqueue$1.L$5;
                                    ref$ObjectRef2 = (Ref$ObjectRef) linkedDocumentLoader$enqueue$1.L$4;
                                    ref$ObjectRef = (Ref$ObjectRef) linkedDocumentLoader$enqueue$1.L$3;
                                    try {
                                        kotlin.b.b(obj);
                                        Object obj4 = (wzl) obj3;
                                        if (((y4j0) ref$ObjectRef7.element).c) {
                                            obj4 = new tzl(new CancellationException());
                                        }
                                        y4j0Var3 = (y4j0) ref$ObjectRef2.element;
                                        if (y4j0Var3 != null) {
                                            tje.N(this.a, null, null, new LinkedDocumentLoader$enqueue$3$1(this, ref$ObjectRef, y4j0Var3, null), 3);
                                            y4j0Var3.d.T(zy11Var);
                                        }
                                        return obj4;
                                    } catch (CancellationException e2) {
                                        e = e2;
                                        kotlinx.coroutines.a.k(linkedDocumentLoader$enqueue$1.get_context());
                                        uzlVar = new tzl(e);
                                        y4j0Var2 = (y4j0) ref$ObjectRef2.element;
                                        if (y4j0Var2 != null) {
                                        }
                                        return uzlVar;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        uzlVar = new uzl(th);
                                        y4j0Var2 = (y4j0) ref$ObjectRef2.element;
                                        if (y4j0Var2 != null) {
                                        }
                                        return uzlVar;
                                    }
                                }
                                ref$ObjectRef3 = (Ref$ObjectRef) linkedDocumentLoader$enqueue$1.L$6;
                                ref$ObjectRef6 = (Ref$ObjectRef) linkedDocumentLoader$enqueue$1.L$5;
                                Ref$ObjectRef ref$ObjectRef11 = (Ref$ObjectRef) linkedDocumentLoader$enqueue$1.L$4;
                                Ref$ObjectRef ref$ObjectRef12 = (Ref$ObjectRef) linkedDocumentLoader$enqueue$1.L$3;
                                try {
                                    kotlin.b.b(obj);
                                    ref$ObjectRef4 = ref$ObjectRef11;
                                    ref$ObjectRef = ref$ObjectRef12;
                                    collection = (Collection) ref$ObjectRef3.element;
                                    y4j0Var = (y4j0) ref$ObjectRef6.element;
                                    linkedDocumentLoader$enqueue$1.L$0 = null;
                                    linkedDocumentLoader$enqueue$1.L$1 = null;
                                    linkedDocumentLoader$enqueue$1.L$2 = null;
                                    linkedDocumentLoader$enqueue$1.L$3 = ref$ObjectRef;
                                    linkedDocumentLoader$enqueue$1.L$4 = ref$ObjectRef4;
                                    linkedDocumentLoader$enqueue$1.L$5 = ref$ObjectRef6;
                                    linkedDocumentLoader$enqueue$1.L$6 = null;
                                    linkedDocumentLoader$enqueue$1.L$7 = obj;
                                    linkedDocumentLoader$enqueue$1.L$8 = null;
                                    linkedDocumentLoader$enqueue$1.label = 3;
                                    if (a(collection, y4j0Var, linkedDocumentLoader$enqueue$1) != coroutineSingletons) {
                                        obj3 = obj;
                                        ref$ObjectRef7 = ref$ObjectRef6;
                                        ref$ObjectRef2 = ref$ObjectRef4;
                                        Object obj42 = (wzl) obj3;
                                        if (((y4j0) ref$ObjectRef7.element).c) {
                                        }
                                        y4j0Var3 = (y4j0) ref$ObjectRef2.element;
                                        if (y4j0Var3 != null) {
                                        }
                                        return obj42;
                                    }
                                    return coroutineSingletons;
                                } catch (CancellationException e3) {
                                    e = e3;
                                    ref$ObjectRef2 = ref$ObjectRef11;
                                    ref$ObjectRef = ref$ObjectRef12;
                                    kotlinx.coroutines.a.k(linkedDocumentLoader$enqueue$1.get_context());
                                    uzlVar = new tzl(e);
                                    y4j0Var2 = (y4j0) ref$ObjectRef2.element;
                                    if (y4j0Var2 != null) {
                                    }
                                    return uzlVar;
                                } catch (Throwable th3) {
                                    th = th3;
                                    ref$ObjectRef2 = ref$ObjectRef11;
                                    ref$ObjectRef = ref$ObjectRef12;
                                    uzlVar = new uzl(th);
                                    y4j0Var2 = (y4j0) ref$ObjectRef2.element;
                                    if (y4j0Var2 != null) {
                                    }
                                    return uzlVar;
                                }
                            }
                            ?? r5 = (g050) linkedDocumentLoader$enqueue$1.L$7;
                            Ref$ObjectRef ref$ObjectRef13 = (Ref$ObjectRef) linkedDocumentLoader$enqueue$1.L$6;
                            ref$ObjectRef5 = (Ref$ObjectRef) linkedDocumentLoader$enqueue$1.L$5;
                            ref$ObjectRef4 = (Ref$ObjectRef) linkedDocumentLoader$enqueue$1.L$4;
                            Ref$ObjectRef ref$ObjectRef14 = (Ref$ObjectRef) linkedDocumentLoader$enqueue$1.L$3;
                            wls wlsVar3 = (wls) linkedDocumentLoader$enqueue$1.L$2;
                            l0mVar2 = (l0m) linkedDocumentLoader$enqueue$1.L$1;
                            u1m u1mVar3 = (u1m) linkedDocumentLoader$enqueue$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                aVar = r5;
                                ref$ObjectRef3 = ref$ObjectRef13;
                                ref$ObjectRef = ref$ObjectRef14;
                                wlsVar2 = wlsVar3;
                                u1mVar2 = u1mVar3;
                            } catch (CancellationException e4) {
                                e = e4;
                                ref$ObjectRef2 = ref$ObjectRef4;
                                ref$ObjectRef = ref$ObjectRef14;
                                kotlinx.coroutines.a.k(linkedDocumentLoader$enqueue$1.get_context());
                                uzlVar = new tzl(e);
                                y4j0Var2 = (y4j0) ref$ObjectRef2.element;
                                if (y4j0Var2 != null) {
                                }
                                return uzlVar;
                            } catch (Throwable th4) {
                                th = th4;
                                ref$ObjectRef2 = ref$ObjectRef4;
                                ref$ObjectRef = ref$ObjectRef14;
                                uzlVar = new uzl(th);
                                y4j0Var2 = (y4j0) ref$ObjectRef2.element;
                                if (y4j0Var2 != null) {
                                }
                                return uzlVar;
                            }
                            ref$ObjectRef.element = u1mVar2.a;
                            ?? y4j0Var4 = new y4j0(new g0m(u1mVar2, l0mVar2), tje.h(this.a, null, null, wlsVar2, 3));
                            ref$ObjectRef5.element = y4j0Var4;
                            ref$ObjectRef4.element = y4j0Var4;
                            LinkedHashMap linkedHashMap = this.w;
                            Object obj5 = ref$ObjectRef.element;
                            obj2 = linkedHashMap.get(obj5);
                            if (obj2 == null) {
                                obj2 = new LinkedHashSet();
                                linkedHashMap.put(obj5, obj2);
                            }
                            LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                            ref$ObjectRef3.element = kotlin.collections.a.N0(linkedHashSet);
                            linkedHashSet.add(ref$ObjectRef5.element);
                            aVar.d(null);
                            y4j0 y4j0Var5 = (y4j0) ref$ObjectRef5.element;
                            linkedDocumentLoader$enqueue$1.L$0 = null;
                            linkedDocumentLoader$enqueue$1.L$1 = null;
                            linkedDocumentLoader$enqueue$1.L$2 = null;
                            linkedDocumentLoader$enqueue$1.L$3 = ref$ObjectRef;
                            linkedDocumentLoader$enqueue$1.L$4 = ref$ObjectRef4;
                            linkedDocumentLoader$enqueue$1.L$5 = ref$ObjectRef5;
                            linkedDocumentLoader$enqueue$1.L$6 = ref$ObjectRef3;
                            linkedDocumentLoader$enqueue$1.L$7 = null;
                            linkedDocumentLoader$enqueue$1.label = 2;
                            obj = y4j0Var5.b.s(linkedDocumentLoader$enqueue$1);
                            if (obj != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            ref$ObjectRef6 = ref$ObjectRef5;
                            collection = (Collection) ref$ObjectRef3.element;
                            y4j0Var = (y4j0) ref$ObjectRef6.element;
                            linkedDocumentLoader$enqueue$1.L$0 = null;
                            linkedDocumentLoader$enqueue$1.L$1 = null;
                            linkedDocumentLoader$enqueue$1.L$2 = null;
                            linkedDocumentLoader$enqueue$1.L$3 = ref$ObjectRef;
                            linkedDocumentLoader$enqueue$1.L$4 = ref$ObjectRef4;
                            linkedDocumentLoader$enqueue$1.L$5 = ref$ObjectRef6;
                            linkedDocumentLoader$enqueue$1.L$6 = null;
                            linkedDocumentLoader$enqueue$1.L$7 = obj;
                            linkedDocumentLoader$enqueue$1.L$8 = null;
                            linkedDocumentLoader$enqueue$1.label = 3;
                            if (a(collection, y4j0Var, linkedDocumentLoader$enqueue$1) != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                    }
                    ref$ObjectRef.element = u1mVar2.a;
                    ?? y4j0Var42 = new y4j0(new g0m(u1mVar2, l0mVar2), tje.h(this.a, null, null, wlsVar2, 3));
                    ref$ObjectRef5.element = y4j0Var42;
                    ref$ObjectRef4.element = y4j0Var42;
                    LinkedHashMap linkedHashMap2 = this.w;
                    Object obj52 = ref$ObjectRef.element;
                    obj2 = linkedHashMap2.get(obj52);
                    if (obj2 == null) {
                    }
                    LinkedHashSet linkedHashSet2 = (LinkedHashSet) obj2;
                    ref$ObjectRef3.element = kotlin.collections.a.N0(linkedHashSet2);
                    linkedHashSet2.add(ref$ObjectRef5.element);
                    aVar.d(null);
                    y4j0 y4j0Var52 = (y4j0) ref$ObjectRef5.element;
                    linkedDocumentLoader$enqueue$1.L$0 = null;
                    linkedDocumentLoader$enqueue$1.L$1 = null;
                    linkedDocumentLoader$enqueue$1.L$2 = null;
                    linkedDocumentLoader$enqueue$1.L$3 = ref$ObjectRef;
                    linkedDocumentLoader$enqueue$1.L$4 = ref$ObjectRef4;
                    linkedDocumentLoader$enqueue$1.L$5 = ref$ObjectRef5;
                    linkedDocumentLoader$enqueue$1.L$6 = ref$ObjectRef3;
                    linkedDocumentLoader$enqueue$1.L$7 = null;
                    linkedDocumentLoader$enqueue$1.label = 2;
                    obj = y4j0Var52.b.s(linkedDocumentLoader$enqueue$1);
                    if (obj != coroutineSingletons) {
                    }
                } catch (Throwable th5) {
                    aVar.d(null);
                    throw th5;
                }
            } catch (CancellationException e5) {
                e = e5;
                ref$ObjectRef2 = ref$ObjectRef4;
                kotlinx.coroutines.a.k(linkedDocumentLoader$enqueue$1.get_context());
                uzlVar = new tzl(e);
                y4j0Var2 = (y4j0) ref$ObjectRef2.element;
                if (y4j0Var2 != null) {
                }
                return uzlVar;
            } catch (Throwable th6) {
                th = th6;
                ref$ObjectRef2 = ref$ObjectRef4;
                uzlVar = new uzl(th);
                y4j0Var2 = (y4j0) ref$ObjectRef2.element;
                if (y4j0Var2 != null) {
                }
                return uzlVar;
            }
            if (i != 0) {
            }
        } catch (Throwable th7) {
            y4j0 y4j0Var6 = (y4j0) 2.element;
            if (y4j0Var6 != null) {
                tje.N(this.a, null, null, new LinkedDocumentLoader$enqueue$3$1(this, 1, y4j0Var6, null), 3);
                y4j0Var6.d.T(zy11Var);
            }
            throw th7;
        }
        linkedDocumentLoader$enqueue$1 = new LinkedDocumentLoader$enqueue$1(this, continuationImpl);
        obj = linkedDocumentLoader$enqueue$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedDocumentLoader$enqueue$1.label;
    }
}
