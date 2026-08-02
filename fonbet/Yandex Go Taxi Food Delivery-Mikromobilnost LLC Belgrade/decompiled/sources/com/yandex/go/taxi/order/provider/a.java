package com.yandex.go.taxi.order.provider;

import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.response.FeedbackDto;
import defpackage.ci70;
import defpackage.cne0;
import defpackage.d9;
import defpackage.dgs;
import defpackage.ffx;
import defpackage.gh60;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k20;
import defpackage.kgx;
import defpackage.kw2;
import defpackage.lw2;
import defpackage.m20;
import defpackage.n20;
import defpackage.nid;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.rol0;
import defpackage.sme0;
import defpackage.tje;
import defpackage.uw40;
import defpackage.v4r0;
import defpackage.zy11;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes8.dex */
public final class a implements n20 {
    public final h3y a;
    public final uw40 b;
    public final h3y c;
    public final ci70 d;
    public final kw2 e;
    public final nid f;
    public final dgs g;
    public final gh60 h;
    public final i3y i = kotlin.a.a(new d9(5, this));
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();
    public final n0 k = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public a(h3y h3yVar, uw40 uw40Var, h3y h3yVar2, ci70 ci70Var, kw2 kw2Var, nid nidVar, dgs dgsVar, gh60 gh60Var) {
        this.a = h3yVar;
        this.b = uw40Var;
        this.c = h3yVar2;
        this.d = ci70Var;
        this.e = kw2Var;
        this.f = nidVar;
        this.g = dgsVar;
        this.h = gh60Var;
    }

    public final kotlinx.coroutines.flow.internal.g a() {
        return ((e0) o()).n();
    }

    public final k20 b(m20 m20Var) {
        this.j.add(m20Var);
        return new k20(0, this, m20Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060 A[LOOP:0: B:11:0x005a->B:13:0x0060, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Preorder preorder, ContinuationImpl continuationImpl) {
        ActiveOrdersProvider$createOrder$1 activeOrdersProvider$createOrder$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof ActiveOrdersProvider$createOrder$1) {
            activeOrdersProvider$createOrder$1 = (ActiveOrdersProvider$createOrder$1) continuationImpl;
            int i2 = activeOrdersProvider$createOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activeOrdersProvider$createOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = activeOrdersProvider$createOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activeOrdersProvider$createOrder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p2y0 o = o();
                    activeOrdersProvider$createOrder$1.L$0 = null;
                    activeOrdersProvider$createOrder$1.label = 1;
                    obj = ((e0) o).j(preorder, activeOrdersProvider$createOrder$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                o2y0 o2y0Var = (o2y0) obj;
                dgs dgsVar = this.g;
                dgsVar.getClass();
                dgsVar.a = new WeakReference(o2y0Var);
                it = this.j.iterator();
                while (it.hasNext()) {
                    ((m20) it.next()).b();
                }
                return o2y0Var;
            }
        }
        activeOrdersProvider$createOrder$1 = new ActiveOrdersProvider$createOrder$1(this, continuationImpl);
        Object obj2 = activeOrdersProvider$createOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activeOrdersProvider$createOrder$1.label;
        if (i != 0) {
        }
        o2y0 o2y0Var2 = (o2y0) obj2;
        dgs dgsVar2 = this.g;
        dgsVar2.getClass();
        dgsVar2.a = new WeakReference(o2y0Var2);
        it = this.j.iterator();
        while (it.hasNext()) {
        }
        return o2y0Var2;
    }

    public final void d(o2y0 o2y0Var) {
        tje.Y(EmptyCoroutineContext.a, new ActiveOrdersProvider$deactivate$2(this, o2y0Var, null));
    }

    public final Set e(Collection collection) {
        return (Set) tje.Y(EmptyCoroutineContext.a, new ActiveOrdersProvider$deactivateAllExclude$1(this, collection, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d7, code lost:
    
        if (i(r13, false, false, r0) == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.yandex.go.taxi.order.provider.a] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00d7 -> B:11:0x00da). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable f(Collection collection, ContinuationImpl continuationImpl) {
        ActiveOrdersProvider$deactivateAllOrdersExclude$1 activeOrdersProvider$deactivateAllOrdersExclude$1;
        int i;
        SetBuilder setBuilder;
        Object k;
        Collection collection2;
        Iterator it;
        Collection collection3;
        Collection collection4;
        Set set;
        if (continuationImpl instanceof ActiveOrdersProvider$deactivateAllOrdersExclude$1) {
            activeOrdersProvider$deactivateAllOrdersExclude$1 = (ActiveOrdersProvider$deactivateAllOrdersExclude$1) continuationImpl;
            int i2 = activeOrdersProvider$deactivateAllOrdersExclude$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activeOrdersProvider$deactivateAllOrdersExclude$1.label = i2 - Integer.MIN_VALUE;
                Object obj = activeOrdersProvider$deactivateAllOrdersExclude$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activeOrdersProvider$deactivateAllOrdersExclude$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    setBuilder = new SetBuilder();
                    activeOrdersProvider$deactivateAllOrdersExclude$1.L$0 = collection;
                    activeOrdersProvider$deactivateAllOrdersExclude$1.L$1 = setBuilder;
                    activeOrdersProvider$deactivateAllOrdersExclude$1.L$2 = setBuilder;
                    activeOrdersProvider$deactivateAllOrdersExclude$1.label = 1;
                    k = k(activeOrdersProvider$deactivateAllOrdersExclude$1);
                    if (k != coroutineSingletons) {
                        collection2 = setBuilder;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o2y0 o2y0Var = (o2y0) activeOrdersProvider$deactivateAllOrdersExclude$1.L$6;
                    it = (Iterator) activeOrdersProvider$deactivateAllOrdersExclude$1.L$4;
                    set = (Set) activeOrdersProvider$deactivateAllOrdersExclude$1.L$2;
                    collection4 = (Set) activeOrdersProvider$deactivateAllOrdersExclude$1.L$1;
                    collection3 = (Collection) activeOrdersProvider$deactivateAllOrdersExclude$1.L$0;
                    kotlin.b.b(obj);
                    set.add(o2y0Var.b().a);
                    while (it.hasNext()) {
                        o2y0Var = (o2y0) it.next();
                        Collection<String> collection5 = collection3;
                        if (!(collection5 instanceof Collection) || !collection5.isEmpty()) {
                            for (String str : collection5) {
                                TaxiOrder b = o2y0Var.b();
                                if (jl40.l(b.a, str) || b.l.y(str)) {
                                }
                            }
                        }
                        activeOrdersProvider$deactivateAllOrdersExclude$1.L$0 = collection3;
                        activeOrdersProvider$deactivateAllOrdersExclude$1.L$1 = collection4;
                        activeOrdersProvider$deactivateAllOrdersExclude$1.L$2 = set;
                        activeOrdersProvider$deactivateAllOrdersExclude$1.L$3 = null;
                        activeOrdersProvider$deactivateAllOrdersExclude$1.L$4 = it;
                        activeOrdersProvider$deactivateAllOrdersExclude$1.L$5 = null;
                        activeOrdersProvider$deactivateAllOrdersExclude$1.L$6 = o2y0Var;
                        activeOrdersProvider$deactivateAllOrdersExclude$1.label = 2;
                    }
                    return ((SetBuilder) collection4).b();
                }
                ?? r13 = (Set) activeOrdersProvider$deactivateAllOrdersExclude$1.L$2;
                Collection collection6 = (Set) activeOrdersProvider$deactivateAllOrdersExclude$1.L$1;
                Collection collection7 = (Collection) activeOrdersProvider$deactivateAllOrdersExclude$1.L$0;
                kotlin.b.b(obj);
                setBuilder = r13;
                collection = collection7;
                collection2 = collection6;
                k = obj;
                it = ((Iterable) k).iterator();
                collection3 = collection;
                collection4 = collection2;
                set = setBuilder;
                while (it.hasNext()) {
                }
                return ((SetBuilder) collection4).b();
            }
        }
        activeOrdersProvider$deactivateAllOrdersExclude$1 = new ActiveOrdersProvider$deactivateAllOrdersExclude$1(this, continuationImpl);
        Object obj2 = activeOrdersProvider$deactivateAllOrdersExclude$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activeOrdersProvider$deactivateAllOrdersExclude$1.label;
        if (i != 0) {
        }
        it = ((Iterable) k).iterator();
        collection3 = collection;
        collection4 = collection2;
        set = setBuilder;
        while (it.hasNext()) {
        }
        return ((SetBuilder) collection4).b();
    }

    public final void g(String str) {
        tje.Y(EmptyCoroutineContext.a, new ActiveOrdersProvider$deactivateById$1(this, str, true, false, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        ActiveOrdersProvider$deactivateOrderById$2 activeOrdersProvider$deactivateOrderById$2;
        int i;
        o2y0 o2y0Var;
        if (continuationImpl instanceof ActiveOrdersProvider$deactivateOrderById$2) {
            activeOrdersProvider$deactivateOrderById$2 = (ActiveOrdersProvider$deactivateOrderById$2) continuationImpl;
            int i2 = activeOrdersProvider$deactivateOrderById$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activeOrdersProvider$deactivateOrderById$2.label = i2 - Integer.MIN_VALUE;
                Object obj = activeOrdersProvider$deactivateOrderById$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activeOrdersProvider$deactivateOrderById$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    activeOrdersProvider$deactivateOrderById$2.L$0 = null;
                    activeOrdersProvider$deactivateOrderById$2.Z$0 = z;
                    activeOrdersProvider$deactivateOrderById$2.Z$1 = z2;
                    activeOrdersProvider$deactivateOrderById$2.label = 1;
                    obj = m(str, activeOrdersProvider$deactivateOrderById$2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    z2 = activeOrdersProvider$deactivateOrderById$2.Z$1;
                    z = activeOrdersProvider$deactivateOrderById$2.Z$0;
                    kotlin.b.b(obj);
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null) {
                    return zy11.a;
                }
                activeOrdersProvider$deactivateOrderById$2.L$0 = null;
                activeOrdersProvider$deactivateOrderById$2.L$1 = null;
                activeOrdersProvider$deactivateOrderById$2.Z$0 = z;
                activeOrdersProvider$deactivateOrderById$2.Z$1 = z2;
                activeOrdersProvider$deactivateOrderById$2.label = 2;
                Object i3 = i(o2y0Var, z, z2, activeOrdersProvider$deactivateOrderById$2);
                return i3 == obj2 ? obj2 : i3;
            }
        }
        activeOrdersProvider$deactivateOrderById$2 = new ActiveOrdersProvider$deactivateOrderById$2(this, continuationImpl);
        Object obj3 = activeOrdersProvider$deactivateOrderById$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activeOrdersProvider$deactivateOrderById$2.label;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj3;
        if (o2y0Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f A[LOOP:0: B:11:0x0069->B:13:0x006f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(o2y0 o2y0Var, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        ActiveOrdersProvider$deactivateOrderInternal$1 activeOrdersProvider$deactivateOrderInternal$1;
        int i;
        a aVar;
        o2y0 o2y0Var2;
        Iterator it;
        DriveState c;
        Integer num;
        if (continuationImpl instanceof ActiveOrdersProvider$deactivateOrderInternal$1) {
            activeOrdersProvider$deactivateOrderInternal$1 = (ActiveOrdersProvider$deactivateOrderInternal$1) continuationImpl;
            int i2 = activeOrdersProvider$deactivateOrderInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activeOrdersProvider$deactivateOrderInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = activeOrdersProvider$deactivateOrderInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activeOrdersProvider$deactivateOrderInternal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p2y0 o = o();
                    aVar = this;
                    ActiveOrdersProvider$deactivateOrderInternal$2 activeOrdersProvider$deactivateOrderInternal$2 = new ActiveOrdersProvider$deactivateOrderInternal$2(aVar, o2y0Var, z, z2, null);
                    activeOrdersProvider$deactivateOrderInternal$1.L$0 = o2y0Var;
                    activeOrdersProvider$deactivateOrderInternal$1.Z$0 = z;
                    activeOrdersProvider$deactivateOrderInternal$1.Z$1 = z2;
                    activeOrdersProvider$deactivateOrderInternal$1.label = 1;
                    if (((e0) o).B(o2y0Var, activeOrdersProvider$deactivateOrderInternal$2, activeOrdersProvider$deactivateOrderInternal$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    o2y0Var2 = o2y0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o2y0Var2 = (o2y0) activeOrdersProvider$deactivateOrderInternal$1.L$0;
                    kotlin.b.b(obj);
                    aVar = this;
                }
                aVar.d.B.remove(o2y0Var2.b().a);
                it = aVar.j.iterator();
                while (it.hasNext()) {
                    ((m20) it.next()).b();
                }
                FeedbackDto k = o2y0Var2.b().k();
                String str = o2y0Var2.b().a;
                c = o2y0Var2.c();
                int intValue = (k != null || (num = k.a) == null) ? 0 : num.intValue();
                lw2 lw2Var = aVar.e.a;
                if (c == DriveState.COMPLETE) {
                    sme0 sme0Var = lw2Var.c;
                    cne0 cne0Var = lw2Var.a;
                    sme0 sme0Var2 = lw2Var.c;
                    kgx[] kgxVarArr = lw2.f;
                    sme0Var2.setValue(lw2Var, kgxVarArr[1], v4r0.i((Set) sme0Var.getValue(lw2Var, kgxVarArr[1]), str));
                    if (((Set) sme0Var2.getValue(lw2Var, kgxVarArr[1])).size() >= 5) {
                        cne0Var.w("COMPLETED_ORDER_IDS_SINCE_LAST_RATE_REQUEST");
                    } else if (!jl40.l((String) lw2Var.b.getValue(lw2Var, kgxVarArr[0]), str) && ((Set) sme0Var2.getValue(lw2Var, kgxVarArr[1])).size() == 1 && intValue < 5) {
                        cne0Var.w("COMPLETED_ORDER_IDS_SINCE_LAST_RATE_REQUEST");
                    }
                }
                aVar.h.a.w(o2y0Var2.b().a);
                return zy11.a;
            }
        }
        activeOrdersProvider$deactivateOrderInternal$1 = new ActiveOrdersProvider$deactivateOrderInternal$1(this, continuationImpl);
        Object obj2 = activeOrdersProvider$deactivateOrderInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activeOrdersProvider$deactivateOrderInternal$1.label;
        if (i != 0) {
        }
        aVar.d.B.remove(o2y0Var2.b().a);
        it = aVar.j.iterator();
        while (it.hasNext()) {
        }
        FeedbackDto k2 = o2y0Var2.b().k();
        String str2 = o2y0Var2.b().a;
        c = o2y0Var2.c();
        if (k2 != null) {
        }
        lw2 lw2Var2 = aVar.e.a;
        if (c == DriveState.COMPLETE) {
        }
        aVar.h.a.w(o2y0Var2.b().a);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        ActiveOrdersProvider$ensureOrder$1 activeOrdersProvider$ensureOrder$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ActiveOrdersProvider$ensureOrder$1) {
            activeOrdersProvider$ensureOrder$1 = (ActiveOrdersProvider$ensureOrder$1) continuationImpl;
            int i2 = activeOrdersProvider$ensureOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activeOrdersProvider$ensureOrder$1.label = i2 - Integer.MIN_VALUE;
                obj = activeOrdersProvider$ensureOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activeOrdersProvider$ensureOrder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p2y0 o = o();
                    activeOrdersProvider$ensureOrder$1.L$0 = null;
                    activeOrdersProvider$ensureOrder$1.label = 1;
                    obj = ((e0) o).d(taxiOrder, activeOrdersProvider$ensureOrder$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    Iterator it = this.j.iterator();
                    while (it.hasNext()) {
                        ((m20) it.next()).b();
                    }
                }
                return zy11.a;
            }
        }
        activeOrdersProvider$ensureOrder$1 = new ActiveOrdersProvider$ensureOrder$1(this, continuationImpl);
        obj = activeOrdersProvider$ensureOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activeOrdersProvider$ensureOrder$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }

    public final Object k(ContinuationImpl continuationImpl) {
        return ((e0) o()).k(continuationImpl);
    }

    public final List l() {
        return ((e0) o()).m();
    }

    public final Object m(String str, ContinuationImpl continuationImpl) {
        return ((e0) o()).p(str, continuationImpl);
    }

    public final o2y0 n(String str) {
        return ((e0) o()).q(str);
    }

    public final p2y0 o() {
        return (p2y0) this.i.getValue();
    }

    public final rol0 p(String str) {
        return new rol0(new ActiveOrdersProvider$getTaxiOrderFlow$1(this, str, null));
    }

    public final Object q(ContinuationImpl continuationImpl) {
        return ((e0) o()).r(continuationImpl);
    }

    public final boolean r() {
        return ((e0) o()).s();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        ActiveOrdersProvider$markMostActive$1 activeOrdersProvider$markMostActive$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ActiveOrdersProvider$markMostActive$1) {
            activeOrdersProvider$markMostActive$1 = (ActiveOrdersProvider$markMostActive$1) continuationImpl;
            int i2 = activeOrdersProvider$markMostActive$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activeOrdersProvider$markMostActive$1.label = i2 - Integer.MIN_VALUE;
                obj = activeOrdersProvider$markMostActive$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activeOrdersProvider$markMostActive$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p2y0 o = o();
                    activeOrdersProvider$markMostActive$1.L$0 = o2y0Var;
                    activeOrdersProvider$markMostActive$1.label = 1;
                    obj = ((e0) o).w(o2y0Var, activeOrdersProvider$markMostActive$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o2y0Var = (o2y0) activeOrdersProvider$markMostActive$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    Iterator it = this.j.iterator();
                    while (it.hasNext()) {
                        ((m20) it.next()).a(o2y0Var);
                    }
                }
                return zy11.a;
            }
        }
        activeOrdersProvider$markMostActive$1 = new ActiveOrdersProvider$markMostActive$1(this, continuationImpl);
        obj = activeOrdersProvider$markMostActive$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activeOrdersProvider$markMostActive$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }

    public final Object t(ContinuationImpl continuationImpl) {
        return ((e0) o()).y(continuationImpl);
    }

    public final o2y0 u() {
        return ((e0) o()).z();
    }

    public final r0 v() {
        return ((e0) o()).g;
    }
}
