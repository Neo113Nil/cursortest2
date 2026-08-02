package com.yandex.go.taxi.order.domain.repositories;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.a3y0;
import defpackage.bvf0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.gyt0;
import defpackage.h3y;
import defpackage.hst;
import defpackage.ist;
import defpackage.jl40;
import defpackage.jst;
import defpackage.ke00;
import defpackage.lh7;
import defpackage.mdh;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.pz40;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uh60;
import defpackage.uyj;
import defpackage.ww60;
import defpackage.ysg;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class e0 implements p2y0, ww60 {
    public final h3y a;
    public final tse b;
    public final tt2 c;
    public final a3y0 d = new a3y0(TaxiOrderLogGroup.CORE.getTag(), "TaxiOrderHolderRepository");
    public final r0 e = bvf0.c(Boolean.FALSE);
    public final r0 f = bvf0.c(EmptyList.a);
    public final r0 g = bvf0.c(null);
    public final kotlinx.coroutines.sync.a h = gtq0.a();
    public final String i = "TaxiOrderHolderRepositoryImpl";

    public e0(tt2 tt2Var, tse tseVar, h3y h3yVar) {
        this.a = h3yVar;
        this.b = tseVar;
        this.c = tt2Var;
    }

    public final List A() {
        return kotlin.collections.a.J0(((ysg) this.a.get()).d().a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        if (r14.invoke(r0) == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093 A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #1 {all -> 0x009d, blocks: (B:27:0x0073, B:28:0x0075, B:31:0x008f, B:33:0x0093), top: B:26:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r12v6, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(o2y0 o2y0Var, tls tlsVar, ContinuationImpl continuationImpl) {
        TaxiOrderHolderRepositoryImpl$removeOrder$1 taxiOrderHolderRepositoryImpl$removeOrder$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        tls tlsVar2;
        Ref$BooleanRef ref$BooleanRef;
        r0 r0Var;
        Object value;
        ArrayList arrayList;
        ysg ysgVar;
        try {
            if (continuationImpl instanceof TaxiOrderHolderRepositoryImpl$removeOrder$1) {
                taxiOrderHolderRepositoryImpl$removeOrder$1 = (TaxiOrderHolderRepositoryImpl$removeOrder$1) continuationImpl;
                int i2 = taxiOrderHolderRepositoryImpl$removeOrder$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    taxiOrderHolderRepositoryImpl$removeOrder$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = taxiOrderHolderRepositoryImpl$removeOrder$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = taxiOrderHolderRepositoryImpl$removeOrder$1.label;
                    int i3 = 1;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                        aVar = this.h;
                        taxiOrderHolderRepositoryImpl$removeOrder$1.L$0 = o2y0Var;
                        taxiOrderHolderRepositoryImpl$removeOrder$1.L$1 = tlsVar;
                        taxiOrderHolderRepositoryImpl$removeOrder$1.L$2 = ref$BooleanRef2;
                        taxiOrderHolderRepositoryImpl$removeOrder$1.L$3 = aVar;
                        taxiOrderHolderRepositoryImpl$removeOrder$1.label = 1;
                        if (aVar.a(taxiOrderHolderRepositoryImpl$removeOrder$1) != coroutineSingletons) {
                            tlsVar2 = tlsVar;
                            ref$BooleanRef = ref$BooleanRef2;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o2y0Var = (o2y0) taxiOrderHolderRepositoryImpl$removeOrder$1.L$0;
                        kotlin.b.b(obj);
                        ysgVar = (ysg) this.a.get();
                        TaxiOrder b = o2y0Var.b();
                        synchronized (ysgVar) {
                            ysgVar.d.f(new lh7(b, i3), "deactivateOrder");
                            b.O(false);
                            ysgVar.h(b);
                        }
                        return zy11.a;
                    }
                    ?? r12 = (g050) taxiOrderHolderRepositoryImpl$removeOrder$1.L$3;
                    ref$BooleanRef = (Ref$BooleanRef) taxiOrderHolderRepositoryImpl$removeOrder$1.L$2;
                    tls tlsVar3 = (tls) taxiOrderHolderRepositoryImpl$removeOrder$1.L$1;
                    o2y0 o2y0Var2 = (o2y0) taxiOrderHolderRepositoryImpl$removeOrder$1.L$0;
                    kotlin.b.b(obj);
                    tlsVar2 = tlsVar3;
                    aVar = r12;
                    o2y0Var = o2y0Var2;
                    r0Var = this.f;
                    do {
                        value = r0Var.getValue();
                        arrayList = new ArrayList((List) value);
                        ref$BooleanRef.element = arrayList.remove(o2y0Var);
                    } while (!r0Var.k(value, arrayList));
                    if (ref$BooleanRef.element) {
                        this.g.k(o2y0Var, kotlin.collections.a.R(arrayList));
                    }
                    aVar.d(null);
                    if (ref$BooleanRef.element) {
                        taxiOrderHolderRepositoryImpl$removeOrder$1.L$0 = o2y0Var;
                        taxiOrderHolderRepositoryImpl$removeOrder$1.L$1 = null;
                        taxiOrderHolderRepositoryImpl$removeOrder$1.L$2 = null;
                        taxiOrderHolderRepositoryImpl$removeOrder$1.L$3 = null;
                        taxiOrderHolderRepositoryImpl$removeOrder$1.label = 2;
                    }
                    ysgVar = (ysg) this.a.get();
                    TaxiOrder b2 = o2y0Var.b();
                    synchronized (ysgVar) {
                    }
                }
            }
            r0Var = this.f;
            do {
                value = r0Var.getValue();
                arrayList = new ArrayList((List) value);
                ref$BooleanRef.element = arrayList.remove(o2y0Var);
            } while (!r0Var.k(value, arrayList));
            if (ref$BooleanRef.element) {
            }
            aVar.d(null);
            if (ref$BooleanRef.element) {
            }
            ysgVar = (ysg) this.a.get();
            TaxiOrder b22 = o2y0Var.b();
            synchronized (ysgVar) {
            }
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        taxiOrderHolderRepositoryImpl$removeOrder$1 = new TaxiOrderHolderRepositoryImpl$removeOrder$1(this, continuationImpl);
        Object obj2 = taxiOrderHolderRepositoryImpl$removeOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderHolderRepositoryImpl$removeOrder$1.label;
        int i32 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00be, code lost:
    
        if (r12 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0079, code lost:
    
        if (r12 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00be -> B:14:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        TaxiOrderHolderRepositoryImpl$addOrder$1 taxiOrderHolderRepositoryImpl$addOrder$1;
        Object obj;
        int i;
        o2y0 o2y0Var;
        kotlinx.coroutines.sync.a aVar;
        TaxiOrder taxiOrder2;
        g050 g050Var;
        o2y0 o2y0Var2;
        g050 g050Var2;
        o2y0 o2y0Var3;
        o2y0 o2y0Var4;
        TaxiOrder taxiOrder3;
        n4u0 n4u0Var;
        Object value;
        List list;
        n4u0 n4u0Var2;
        if (continuationImpl instanceof TaxiOrderHolderRepositoryImpl$addOrder$1) {
            taxiOrderHolderRepositoryImpl$addOrder$1 = (TaxiOrderHolderRepositoryImpl$addOrder$1) continuationImpl;
            int i2 = taxiOrderHolderRepositoryImpl$addOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderHolderRepositoryImpl$addOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiOrderHolderRepositoryImpl$addOrder$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderHolderRepositoryImpl$addOrder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    taxiOrderHolderRepositoryImpl$addOrder$1.L$0 = taxiOrder;
                    taxiOrderHolderRepositoryImpl$addOrder$1.label = 1;
                    obj2 = y(taxiOrderHolderRepositoryImpl$addOrder$1);
                } else if (i == 1) {
                    taxiOrder = (TaxiOrder) taxiOrderHolderRepositoryImpl$addOrder$1.L$0;
                    kotlin.b.b(obj2);
                } else if (i == 2) {
                    g050Var = (g050) taxiOrderHolderRepositoryImpl$addOrder$1.L$3;
                    o2y0Var = (o2y0) taxiOrderHolderRepositoryImpl$addOrder$1.L$2;
                    o2y0Var2 = (o2y0) taxiOrderHolderRepositoryImpl$addOrder$1.L$1;
                    taxiOrder2 = (TaxiOrder) taxiOrderHolderRepositoryImpl$addOrder$1.L$0;
                    kotlin.b.b(obj2);
                    try {
                        o2y0Var3 = o2y0Var;
                        o2y0Var4 = o2y0Var2;
                        taxiOrder3 = taxiOrder2;
                        g050Var2 = g050Var;
                        n4u0Var = this.f;
                        value = n4u0Var.getValue();
                        list = (List) value;
                        String str = taxiOrder3.a;
                        taxiOrderHolderRepositoryImpl$addOrder$1.L$0 = taxiOrder3;
                        taxiOrderHolderRepositoryImpl$addOrder$1.L$1 = o2y0Var4;
                        taxiOrderHolderRepositoryImpl$addOrder$1.L$2 = o2y0Var3;
                        taxiOrderHolderRepositoryImpl$addOrder$1.L$3 = g050Var2;
                        taxiOrderHolderRepositoryImpl$addOrder$1.L$4 = n4u0Var;
                        taxiOrderHolderRepositoryImpl$addOrder$1.L$5 = value;
                        taxiOrderHolderRepositoryImpl$addOrder$1.L$6 = list;
                        taxiOrderHolderRepositoryImpl$addOrder$1.label = 3;
                        obj2 = p(str, taxiOrderHolderRepositoryImpl$addOrder$1);
                        n4u0Var2 = n4u0Var;
                    } catch (Throwable th) {
                        th = th;
                        g050Var2 = g050Var;
                        g050Var2.d(null);
                        throw th;
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) taxiOrderHolderRepositoryImpl$addOrder$1.L$6;
                    value = taxiOrderHolderRepositoryImpl$addOrder$1.L$5;
                    n4u0 n4u0Var3 = (pz40) taxiOrderHolderRepositoryImpl$addOrder$1.L$4;
                    g050Var2 = (g050) taxiOrderHolderRepositoryImpl$addOrder$1.L$3;
                    o2y0Var3 = (o2y0) taxiOrderHolderRepositoryImpl$addOrder$1.L$2;
                    o2y0Var4 = (o2y0) taxiOrderHolderRepositoryImpl$addOrder$1.L$1;
                    taxiOrder3 = (TaxiOrder) taxiOrderHolderRepositoryImpl$addOrder$1.L$0;
                    try {
                        kotlin.b.b(obj2);
                        n4u0Var2 = n4u0Var3;
                        if (obj2 != null) {
                            Boolean bool = Boolean.FALSE;
                            g050Var2.d(null);
                            return bool;
                        }
                        r0 r0Var = (r0) n4u0Var2;
                        boolean k = r0Var.k(value, kotlin.collections.a.o0(list, o2y0Var3));
                        n4u0Var = r0Var;
                        if (k) {
                            if (((List) value).isEmpty()) {
                                this.g.k(o2y0Var4, o2y0Var3);
                            }
                            g050Var2.d(null);
                            return Boolean.TRUE;
                        }
                        value = n4u0Var.getValue();
                        list = (List) value;
                        String str2 = taxiOrder3.a;
                        taxiOrderHolderRepositoryImpl$addOrder$1.L$0 = taxiOrder3;
                        taxiOrderHolderRepositoryImpl$addOrder$1.L$1 = o2y0Var4;
                        taxiOrderHolderRepositoryImpl$addOrder$1.L$2 = o2y0Var3;
                        taxiOrderHolderRepositoryImpl$addOrder$1.L$3 = g050Var2;
                        taxiOrderHolderRepositoryImpl$addOrder$1.L$4 = n4u0Var;
                        taxiOrderHolderRepositoryImpl$addOrder$1.L$5 = value;
                        taxiOrderHolderRepositoryImpl$addOrder$1.L$6 = list;
                        taxiOrderHolderRepositoryImpl$addOrder$1.label = 3;
                        obj2 = p(str2, taxiOrderHolderRepositoryImpl$addOrder$1);
                        n4u0Var2 = n4u0Var;
                    } catch (Throwable th2) {
                        th = th2;
                        g050Var2.d(null);
                        throw th;
                    }
                }
                o2y0 o2y0Var5 = (o2y0) obj2;
                o2y0Var = new o2y0(taxiOrder);
                taxiOrderHolderRepositoryImpl$addOrder$1.L$0 = taxiOrder;
                taxiOrderHolderRepositoryImpl$addOrder$1.L$1 = o2y0Var5;
                taxiOrderHolderRepositoryImpl$addOrder$1.L$2 = o2y0Var;
                aVar = this.h;
                taxiOrderHolderRepositoryImpl$addOrder$1.L$3 = aVar;
                taxiOrderHolderRepositoryImpl$addOrder$1.label = 2;
                if (aVar.a(taxiOrderHolderRepositoryImpl$addOrder$1) != obj) {
                    taxiOrder2 = taxiOrder;
                    g050Var = aVar;
                    o2y0Var2 = o2y0Var5;
                    o2y0Var3 = o2y0Var;
                    o2y0Var4 = o2y0Var2;
                    taxiOrder3 = taxiOrder2;
                    g050Var2 = g050Var;
                    n4u0Var = this.f;
                    value = n4u0Var.getValue();
                    list = (List) value;
                    String str22 = taxiOrder3.a;
                    taxiOrderHolderRepositoryImpl$addOrder$1.L$0 = taxiOrder3;
                    taxiOrderHolderRepositoryImpl$addOrder$1.L$1 = o2y0Var4;
                    taxiOrderHolderRepositoryImpl$addOrder$1.L$2 = o2y0Var3;
                    taxiOrderHolderRepositoryImpl$addOrder$1.L$3 = g050Var2;
                    taxiOrderHolderRepositoryImpl$addOrder$1.L$4 = n4u0Var;
                    taxiOrderHolderRepositoryImpl$addOrder$1.L$5 = value;
                    taxiOrderHolderRepositoryImpl$addOrder$1.L$6 = list;
                    taxiOrderHolderRepositoryImpl$addOrder$1.label = 3;
                    obj2 = p(str22, taxiOrderHolderRepositoryImpl$addOrder$1);
                    n4u0Var2 = n4u0Var;
                }
                return obj;
            }
        }
        taxiOrderHolderRepositoryImpl$addOrder$1 = new TaxiOrderHolderRepositoryImpl$addOrder$1(this, continuationImpl);
        Object obj22 = taxiOrderHolderRepositoryImpl$addOrder$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderHolderRepositoryImpl$addOrder$1.label;
        if (i != 0) {
        }
        o2y0 o2y0Var52 = (o2y0) obj22;
        o2y0Var = new o2y0(taxiOrder);
        taxiOrderHolderRepositoryImpl$addOrder$1.L$0 = taxiOrder;
        taxiOrderHolderRepositoryImpl$addOrder$1.L$1 = o2y0Var52;
        taxiOrderHolderRepositoryImpl$addOrder$1.L$2 = o2y0Var;
        aVar = this.h;
        taxiOrderHolderRepositoryImpl$addOrder$1.L$3 = aVar;
        taxiOrderHolderRepositoryImpl$addOrder$1.label = 2;
        if (aVar.a(taxiOrderHolderRepositoryImpl$addOrder$1) != obj) {
        }
        return obj;
    }

    @Override // defpackage.ww60
    public final void f() {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.b, mdh.b, null, new TaxiOrderHolderRepositoryImpl$initOrders$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return this.i;
    }

    public final TaxiOrder i(String str) {
        return ((ysg) this.a.get()).a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Preorder preorder, ContinuationImpl continuationImpl) {
        TaxiOrderHolderRepositoryImpl$createOrder$1 taxiOrderHolderRepositoryImpl$createOrder$1;
        int i;
        if (continuationImpl instanceof TaxiOrderHolderRepositoryImpl$createOrder$1) {
            taxiOrderHolderRepositoryImpl$createOrder$1 = (TaxiOrderHolderRepositoryImpl$createOrder$1) continuationImpl;
            int i2 = taxiOrderHolderRepositoryImpl$createOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderHolderRepositoryImpl$createOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderHolderRepositoryImpl$createOrder$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderHolderRepositoryImpl$createOrder$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o2y0 o2y0Var = (o2y0) taxiOrderHolderRepositoryImpl$createOrder$1.L$1;
                    kotlin.b.b(obj);
                    return o2y0Var;
                }
                kotlin.b.b(obj);
                o2y0 o2y0Var2 = new o2y0(com.yandex.go.taxi.order.models.api.f.b(TaxiOrder.Companion, preorder, null, null, 0L, 30));
                sls gyt0Var = new gyt0(29, this, o2y0Var2);
                taxiOrderHolderRepositoryImpl$createOrder$1.L$0 = null;
                taxiOrderHolderRepositoryImpl$createOrder$1.L$1 = o2y0Var2;
                taxiOrderHolderRepositoryImpl$createOrder$1.label = 1;
                return x(gyt0Var, taxiOrderHolderRepositoryImpl$createOrder$1) == obj2 ? obj2 : o2y0Var2;
            }
        }
        taxiOrderHolderRepositoryImpl$createOrder$1 = new TaxiOrderHolderRepositoryImpl$createOrder$1(this, continuationImpl);
        Object obj3 = taxiOrderHolderRepositoryImpl$createOrder$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderHolderRepositoryImpl$createOrder$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ContinuationImpl continuationImpl) {
        TaxiOrderHolderRepositoryImpl$getActiveOrders$1 taxiOrderHolderRepositoryImpl$getActiveOrders$1;
        int i;
        if (continuationImpl instanceof TaxiOrderHolderRepositoryImpl$getActiveOrders$1) {
            taxiOrderHolderRepositoryImpl$getActiveOrders$1 = (TaxiOrderHolderRepositoryImpl$getActiveOrders$1) continuationImpl;
            int i2 = taxiOrderHolderRepositoryImpl$getActiveOrders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderHolderRepositoryImpl$getActiveOrders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderHolderRepositoryImpl$getActiveOrders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderHolderRepositoryImpl$getActiveOrders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p pVar = new p(this.e);
                    taxiOrderHolderRepositoryImpl$getActiveOrders$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(pVar, taxiOrderHolderRepositoryImpl$getActiveOrders$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return this.f.getValue();
            }
        }
        taxiOrderHolderRepositoryImpl$getActiveOrders$1 = new TaxiOrderHolderRepositoryImpl$getActiveOrders$1(this, continuationImpl);
        Object obj2 = taxiOrderHolderRepositoryImpl$getActiveOrders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderHolderRepositoryImpl$getActiveOrders$1.label;
        if (i != 0) {
        }
        return this.f.getValue();
    }

    public final List m() {
        return (List) tje.Y(EmptyCoroutineContext.a, new TaxiOrderHolderRepositoryImpl$getActiveOrdersBlocking$1(this, null));
    }

    public final kotlinx.coroutines.flow.internal.g n() {
        return kotlinx.coroutines.flow.e.X(new r(this.e), new TaxiOrderHolderRepositoryImpl$getActiveOrdersStateFlow$$inlined$flatMapLatest$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(String str, ContinuationImpl continuationImpl) {
        TaxiOrderHolderRepositoryImpl$getHolderWithChatId$1 taxiOrderHolderRepositoryImpl$getHolderWithChatId$1;
        int i;
        if (continuationImpl instanceof TaxiOrderHolderRepositoryImpl$getHolderWithChatId$1) {
            taxiOrderHolderRepositoryImpl$getHolderWithChatId$1 = (TaxiOrderHolderRepositoryImpl$getHolderWithChatId$1) continuationImpl;
            int i2 = taxiOrderHolderRepositoryImpl$getHolderWithChatId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderHolderRepositoryImpl$getHolderWithChatId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderHolderRepositoryImpl$getHolderWithChatId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderHolderRepositoryImpl$getHolderWithChatId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t tVar = new t(this.e);
                    taxiOrderHolderRepositoryImpl$getHolderWithChatId$1.L$0 = str;
                    taxiOrderHolderRepositoryImpl$getHolderWithChatId$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(tVar, taxiOrderHolderRepositoryImpl$getHolderWithChatId$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) taxiOrderHolderRepositoryImpl$getHolderWithChatId$1.L$0;
                    kotlin.b.b(obj);
                }
                for (Object obj2 : (Iterable) this.f.getValue()) {
                    if (jl40.l(((o2y0) obj2).b().V().q0, str)) {
                        return obj2;
                    }
                }
                return null;
            }
        }
        taxiOrderHolderRepositoryImpl$getHolderWithChatId$1 = new TaxiOrderHolderRepositoryImpl$getHolderWithChatId$1(this, continuationImpl);
        Object obj3 = taxiOrderHolderRepositoryImpl$getHolderWithChatId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderHolderRepositoryImpl$getHolderWithChatId$1.label;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(String str, ContinuationImpl continuationImpl) {
        TaxiOrderHolderRepositoryImpl$getHolderWithId$1 taxiOrderHolderRepositoryImpl$getHolderWithId$1;
        int i;
        if (continuationImpl instanceof TaxiOrderHolderRepositoryImpl$getHolderWithId$1) {
            taxiOrderHolderRepositoryImpl$getHolderWithId$1 = (TaxiOrderHolderRepositoryImpl$getHolderWithId$1) continuationImpl;
            int i2 = taxiOrderHolderRepositoryImpl$getHolderWithId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderHolderRepositoryImpl$getHolderWithId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderHolderRepositoryImpl$getHolderWithId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderHolderRepositoryImpl$getHolderWithId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    v vVar = new v(this.e);
                    taxiOrderHolderRepositoryImpl$getHolderWithId$1.L$0 = str;
                    taxiOrderHolderRepositoryImpl$getHolderWithId$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(vVar, taxiOrderHolderRepositoryImpl$getHolderWithId$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) taxiOrderHolderRepositoryImpl$getHolderWithId$1.L$0;
                    kotlin.b.b(obj);
                }
                for (Object obj2 : (Iterable) this.f.getValue()) {
                    TaxiOrder b = ((o2y0) obj2).b();
                    if (jl40.l(b.a, str) || b.l.y(str)) {
                        return obj2;
                    }
                }
                return null;
            }
        }
        taxiOrderHolderRepositoryImpl$getHolderWithId$1 = new TaxiOrderHolderRepositoryImpl$getHolderWithId$1(this, continuationImpl);
        Object obj3 = taxiOrderHolderRepositoryImpl$getHolderWithId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderHolderRepositoryImpl$getHolderWithId$1.label;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return null;
    }

    public final o2y0 q(String str) {
        return (o2y0) tje.Y(EmptyCoroutineContext.a, new TaxiOrderHolderRepositoryImpl$getHolderWithIdBlocking$1(this, str, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(ContinuationImpl continuationImpl) {
        TaxiOrderHolderRepositoryImpl$hasActiveOrders$1 taxiOrderHolderRepositoryImpl$hasActiveOrders$1;
        int i;
        if (continuationImpl instanceof TaxiOrderHolderRepositoryImpl$hasActiveOrders$1) {
            taxiOrderHolderRepositoryImpl$hasActiveOrders$1 = (TaxiOrderHolderRepositoryImpl$hasActiveOrders$1) continuationImpl;
            int i2 = taxiOrderHolderRepositoryImpl$hasActiveOrders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderHolderRepositoryImpl$hasActiveOrders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderHolderRepositoryImpl$hasActiveOrders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderHolderRepositoryImpl$hasActiveOrders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    x xVar = new x(this.e);
                    taxiOrderHolderRepositoryImpl$hasActiveOrders$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(xVar, taxiOrderHolderRepositoryImpl$hasActiveOrders$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(!((Collection) this.f.getValue()).isEmpty());
            }
        }
        taxiOrderHolderRepositoryImpl$hasActiveOrders$1 = new TaxiOrderHolderRepositoryImpl$hasActiveOrders$1(this, continuationImpl);
        Object obj2 = taxiOrderHolderRepositoryImpl$hasActiveOrders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderHolderRepositoryImpl$hasActiveOrders$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(!((Collection) this.f.getValue()).isEmpty());
    }

    public final boolean s() {
        return ((Boolean) tje.Y(EmptyCoroutineContext.a, new TaxiOrderHolderRepositoryImpl$hasActiveOrdersBlocking$1(this, null))).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(ContinuationImpl continuationImpl) {
        TaxiOrderHolderRepositoryImpl$hasMultipleActiveOrders$1 taxiOrderHolderRepositoryImpl$hasMultipleActiveOrders$1;
        int i;
        if (continuationImpl instanceof TaxiOrderHolderRepositoryImpl$hasMultipleActiveOrders$1) {
            taxiOrderHolderRepositoryImpl$hasMultipleActiveOrders$1 = (TaxiOrderHolderRepositoryImpl$hasMultipleActiveOrders$1) continuationImpl;
            int i2 = taxiOrderHolderRepositoryImpl$hasMultipleActiveOrders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderHolderRepositoryImpl$hasMultipleActiveOrders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderHolderRepositoryImpl$hasMultipleActiveOrders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderHolderRepositoryImpl$hasMultipleActiveOrders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    z zVar = new z(this.e);
                    taxiOrderHolderRepositoryImpl$hasMultipleActiveOrders$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(zVar, taxiOrderHolderRepositoryImpl$hasMultipleActiveOrders$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((List) this.f.getValue()).size() > 1);
            }
        }
        taxiOrderHolderRepositoryImpl$hasMultipleActiveOrders$1 = new TaxiOrderHolderRepositoryImpl$hasMultipleActiveOrders$1(this, continuationImpl);
        Object obj2 = taxiOrderHolderRepositoryImpl$hasMultipleActiveOrders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderHolderRepositoryImpl$hasMultipleActiveOrders$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((List) this.f.getValue()).size() > 1);
    }

    public final boolean u() {
        return ((Boolean) tje.Y(EmptyCoroutineContext.a, new TaxiOrderHolderRepositoryImpl$hasMultipleActiveOrdersBlocking$1(this, null))).booleanValue();
    }

    public final TaxiOrder v() {
        ysg ysgVar = (ysg) this.a.get();
        synchronized (ysgVar) {
            try {
                Object obj = null;
                if (!((ru.yandex.taxi.startup.launch.h) ysgVar.a).Kg()) {
                    return null;
                }
                for (Object obj2 : ysgVar.d().a) {
                    if (((TaxiOrder) obj2).l.getA()) {
                        obj = obj2;
                    }
                }
                return (TaxiOrder) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        TaxiOrderHolderRepositoryImpl$markMostActive$1 taxiOrderHolderRepositoryImpl$markMostActive$1;
        Object obj;
        int i;
        if (continuationImpl instanceof TaxiOrderHolderRepositoryImpl$markMostActive$1) {
            taxiOrderHolderRepositoryImpl$markMostActive$1 = (TaxiOrderHolderRepositoryImpl$markMostActive$1) continuationImpl;
            int i2 = taxiOrderHolderRepositoryImpl$markMostActive$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderHolderRepositoryImpl$markMostActive$1.label = i2 - Integer.MIN_VALUE;
                obj = taxiOrderHolderRepositoryImpl$markMostActive$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderHolderRepositoryImpl$markMostActive$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    taxiOrderHolderRepositoryImpl$markMostActive$1.L$0 = o2y0Var;
                    taxiOrderHolderRepositoryImpl$markMostActive$1.label = 1;
                    obj = y(taxiOrderHolderRepositoryImpl$markMostActive$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    o2y0Var = (o2y0) taxiOrderHolderRepositoryImpl$markMostActive$1.L$0;
                    kotlin.b.b(obj);
                }
                if (obj != o2y0Var) {
                    return Boolean.FALSE;
                }
                sls uh60Var = new uh60(23, o2y0Var);
                taxiOrderHolderRepositoryImpl$markMostActive$1.L$0 = null;
                taxiOrderHolderRepositoryImpl$markMostActive$1.label = 2;
                Object x = x(uh60Var, taxiOrderHolderRepositoryImpl$markMostActive$1);
                return x == obj2 ? obj2 : x;
            }
        }
        taxiOrderHolderRepositoryImpl$markMostActive$1 = new TaxiOrderHolderRepositoryImpl$markMostActive$1(this, continuationImpl);
        obj = taxiOrderHolderRepositoryImpl$markMostActive$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderHolderRepositoryImpl$markMostActive$1.label;
        if (i != 0) {
        }
        if (obj != o2y0Var) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c A[Catch: all -> 0x0066, TRY_ENTER, TryCatch #0 {all -> 0x0066, blocks: (B:11:0x004a, B:14:0x005c, B:16:0x0062, B:17:0x00a0, B:21:0x0069, B:23:0x0088, B:25:0x0090, B:26:0x0098, B:27:0x00a8, B:29:0x00ae, B:32:0x00ba), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8 A[Catch: all -> 0x0066, TRY_ENTER, TryCatch #0 {all -> 0x0066, blocks: (B:11:0x004a, B:14:0x005c, B:16:0x0062, B:17:0x00a0, B:21:0x0069, B:23:0x0088, B:25:0x0090, B:26:0x0098, B:27:0x00a8, B:29:0x00ae, B:32:0x00ba), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r12v11, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(sls slsVar, ContinuationImpl continuationImpl) {
        TaxiOrderHolderRepositoryImpl$markMostActiveWithLock$1 taxiOrderHolderRepositoryImpl$markMostActiveWithLock$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        o2y0 o2y0Var;
        try {
            if (continuationImpl instanceof TaxiOrderHolderRepositoryImpl$markMostActiveWithLock$1) {
                taxiOrderHolderRepositoryImpl$markMostActiveWithLock$1 = (TaxiOrderHolderRepositoryImpl$markMostActiveWithLock$1) continuationImpl;
                int i2 = taxiOrderHolderRepositoryImpl$markMostActiveWithLock$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    taxiOrderHolderRepositoryImpl$markMostActiveWithLock$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = taxiOrderHolderRepositoryImpl$markMostActiveWithLock$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = taxiOrderHolderRepositoryImpl$markMostActiveWithLock$1.label;
                    boolean z = true;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        taxiOrderHolderRepositoryImpl$markMostActiveWithLock$1.L$0 = slsVar;
                        aVar = this.h;
                        taxiOrderHolderRepositoryImpl$markMostActiveWithLock$1.L$1 = aVar;
                        taxiOrderHolderRepositoryImpl$markMostActiveWithLock$1.label = 1;
                        if (aVar.a(taxiOrderHolderRepositoryImpl$markMostActiveWithLock$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r12 = (g050) taxiOrderHolderRepositoryImpl$markMostActiveWithLock$1.L$1;
                        sls slsVar2 = (sls) taxiOrderHolderRepositoryImpl$markMostActiveWithLock$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r12;
                        slsVar = slsVar2;
                    }
                    o2y0Var = (o2y0) slsVar.invoke();
                    List list = (List) this.f.getValue();
                    r0 r0Var = this.g;
                    if (o2y0Var == null) {
                        if (!list.contains(o2y0Var)) {
                            Boolean bool = Boolean.FALSE;
                            aVar.d(null);
                            return bool;
                        }
                        r0Var.getClass();
                        r0Var.m(null, o2y0Var);
                        Boolean bool2 = Boolean.TRUE;
                        aVar.d(null);
                        return bool2;
                    }
                    if (list.isEmpty()) {
                        r0Var.l(null);
                    } else {
                        a3y0 a3y0Var = this.d;
                        String l = a3y0Var.l(new String[]{"markMostActiveWithLock"});
                        hst hstVar = jst.e;
                        String str = a3y0Var.a;
                        hstVar.getClass();
                        ist m = hstVar.m(l);
                        ke00 a = m.b.a();
                        if (a != null && a.b(15)) {
                            a.a(15, str, null, "Try to set mostActiveOrder as null with active orders", m.a);
                        }
                        z = r0Var.k(null, kotlin.collections.a.P(list));
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    aVar.d(null);
                    return valueOf;
                }
            }
            o2y0Var = (o2y0) slsVar.invoke();
            List list2 = (List) this.f.getValue();
            r0 r0Var2 = this.g;
            if (o2y0Var == null) {
            }
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        taxiOrderHolderRepositoryImpl$markMostActiveWithLock$1 = new TaxiOrderHolderRepositoryImpl$markMostActiveWithLock$1(this, continuationImpl);
        Object obj2 = taxiOrderHolderRepositoryImpl$markMostActiveWithLock$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderHolderRepositoryImpl$markMostActiveWithLock$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    public final Object y(ContinuationImpl continuationImpl) {
        return kotlinx.coroutines.flow.e.y(new d0(new b0(this.e), this), continuationImpl);
    }

    public final o2y0 z() {
        return (o2y0) tje.Y(EmptyCoroutineContext.a, new TaxiOrderHolderRepositoryImpl$mostActiveOrderBlocking$1(this, null));
    }
}
