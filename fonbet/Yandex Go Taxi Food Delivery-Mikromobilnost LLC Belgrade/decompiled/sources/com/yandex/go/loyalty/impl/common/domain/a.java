package com.yandex.go.loyalty.impl.common.domain;

import com.yandex.go.loyalty.impl.selector.data.model.GeoState;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyStateParam;
import com.yandex.go.loyalty.impl.selector.domain.model.LoyaltyProgramState;
import defpackage.am2;
import defpackage.dvz;
import defpackage.evz;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.jrd;
import defpackage.jst;
import defpackage.lvz;
import defpackage.lxz;
import defpackage.mxz;
import defpackage.nxz;
import defpackage.ny61;
import defpackage.x1f0;
import defpackage.xvf0;
import defpackage.zvz;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a {
    public final com.yandex.go.loyalty.impl.selector.data.a a;
    public final h b;
    public final nxz c;
    public final zvz d;
    public final am2 e;
    public final kotlinx.coroutines.sync.a f = gtq0.a();

    public a(com.yandex.go.loyalty.impl.selector.data.a aVar, h hVar, nxz nxzVar, zvz zvzVar, am2 am2Var) {
        this.a = aVar;
        this.b = hVar;
        this.c = nxzVar;
        this.d = zvzVar;
        this.e = am2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        FetchLoyaltyStateInteractorImpl$fetchLoyaltyStateSynchronously$1 fetchLoyaltyStateInteractorImpl$fetchLoyaltyStateSynchronously$1;
        int i;
        if (continuationImpl instanceof FetchLoyaltyStateInteractorImpl$fetchLoyaltyStateSynchronously$1) {
            fetchLoyaltyStateInteractorImpl$fetchLoyaltyStateSynchronously$1 = (FetchLoyaltyStateInteractorImpl$fetchLoyaltyStateSynchronously$1) continuationImpl;
            int i2 = fetchLoyaltyStateInteractorImpl$fetchLoyaltyStateSynchronously$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchLoyaltyStateInteractorImpl$fetchLoyaltyStateSynchronously$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchLoyaltyStateInteractorImpl$fetchLoyaltyStateSynchronously$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchLoyaltyStateInteractorImpl$fetchLoyaltyStateSynchronously$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LoyaltyStateParam loyaltyStateParam = new LoyaltyStateParam((GeoState) this.b.d.a.getValue());
                    fetchLoyaltyStateInteractorImpl$fetchLoyaltyStateSynchronously$1.L$0 = null;
                    fetchLoyaltyStateInteractorImpl$fetchLoyaltyStateSynchronously$1.label = 1;
                    if (b(loyaltyStateParam, fetchLoyaltyStateInteractorImpl$fetchLoyaltyStateSynchronously$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                }
                return zy11.a;
            }
        }
        fetchLoyaltyStateInteractorImpl$fetchLoyaltyStateSynchronously$1 = new FetchLoyaltyStateInteractorImpl$fetchLoyaltyStateSynchronously$1(this, continuationImpl);
        Object obj3 = fetchLoyaltyStateInteractorImpl$fetchLoyaltyStateSynchronously$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchLoyaltyStateInteractorImpl$fetchLoyaltyStateSynchronously$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005e, code lost:
    
        if (r9.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:12:0x002f, B:13:0x0073, B:15:0x0077), top: B:11:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(LoyaltyStateParam loyaltyStateParam, ContinuationImpl continuationImpl) {
        FetchLoyaltyStateInteractorImpl$getLoyaltyState$1 fetchLoyaltyStateInteractorImpl$getLoyaltyState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        ?? a;
        lxz lxzVar;
        try {
            if (continuationImpl instanceof FetchLoyaltyStateInteractorImpl$getLoyaltyState$1) {
                fetchLoyaltyStateInteractorImpl$getLoyaltyState$1 = (FetchLoyaltyStateInteractorImpl$getLoyaltyState$1) continuationImpl;
                int i2 = fetchLoyaltyStateInteractorImpl$getLoyaltyState$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fetchLoyaltyStateInteractorImpl$getLoyaltyState$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = fetchLoyaltyStateInteractorImpl$getLoyaltyState$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = fetchLoyaltyStateInteractorImpl$getLoyaltyState$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        fetchLoyaltyStateInteractorImpl$getLoyaltyState$1.L$0 = loyaltyStateParam;
                        aVar = this.f;
                        fetchLoyaltyStateInteractorImpl$getLoyaltyState$1.L$1 = aVar;
                        fetchLoyaltyStateInteractorImpl$getLoyaltyState$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) fetchLoyaltyStateInteractorImpl$getLoyaltyState$1.L$1;
                            try {
                                kotlin.b.b(obj);
                                lxzVar = ((Result) obj).getValue();
                                if (!(lxzVar instanceof Result.Failure)) {
                                    c(lxzVar);
                                }
                                g050Var.d(null);
                                return lxzVar;
                            } catch (Throwable th) {
                                th = th;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r8 = (g050) fetchLoyaltyStateInteractorImpl$getLoyaltyState$1.L$1;
                        LoyaltyStateParam loyaltyStateParam2 = (LoyaltyStateParam) fetchLoyaltyStateInteractorImpl$getLoyaltyState$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r8;
                        loyaltyStateParam = loyaltyStateParam2;
                    }
                    com.yandex.go.loyalty.impl.selector.data.a aVar2 = this.a;
                    fetchLoyaltyStateInteractorImpl$getLoyaltyState$1.L$0 = null;
                    fetchLoyaltyStateInteractorImpl$getLoyaltyState$1.L$1 = aVar;
                    fetchLoyaltyStateInteractorImpl$getLoyaltyState$1.label = 2;
                    a = aVar2.a(loyaltyStateParam, fetchLoyaltyStateInteractorImpl$getLoyaltyState$1);
                    if (a != coroutineSingletons) {
                        kotlinx.coroutines.sync.a aVar3 = aVar;
                        lxzVar = a;
                        g050Var = aVar3;
                        if (!(lxzVar instanceof Result.Failure)) {
                        }
                        g050Var.d(null);
                        return lxzVar;
                    }
                    return coroutineSingletons;
                }
            }
            com.yandex.go.loyalty.impl.selector.data.a aVar22 = this.a;
            fetchLoyaltyStateInteractorImpl$getLoyaltyState$1.L$0 = null;
            fetchLoyaltyStateInteractorImpl$getLoyaltyState$1.L$1 = aVar;
            fetchLoyaltyStateInteractorImpl$getLoyaltyState$1.label = 2;
            a = aVar22.a(loyaltyStateParam, fetchLoyaltyStateInteractorImpl$getLoyaltyState$1);
            if (a != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
        fetchLoyaltyStateInteractorImpl$getLoyaltyState$1 = new FetchLoyaltyStateInteractorImpl$getLoyaltyState$1(this, continuationImpl);
        Object obj2 = fetchLoyaltyStateInteractorImpl$getLoyaltyState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchLoyaltyStateInteractorImpl$getLoyaltyState$1.label;
        if (i != 0) {
        }
    }

    public final void c(lxz lxzVar) {
        Object obj;
        Object obj2;
        this.c.a.l(lxzVar);
        am2 am2Var = this.e;
        x1f0 x1f0Var = (x1f0) am2Var.b;
        Iterator it = lxzVar.b().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((dvz) obj).c() == LoyaltyProgramState.ENABLED) {
                    break;
                }
            }
        }
        dvz dvzVar = (dvz) obj;
        Iterator it2 = lxzVar.a().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it2.next();
                if (((mxz) obj2).f()) {
                    break;
                }
            }
        }
        mxz mxzVar = (mxz) obj2;
        if (dvzVar == null || mxzVar == null) {
            jst.e.c("Couldn't find selected loyalty program!");
            x1f0Var.a(null);
            return;
        }
        ((lvz) am2Var.a).getClass();
        evz a = lvz.a(dvzVar, mxzVar);
        if (a == null) {
            return;
        }
        evz evzVar = (evz) x1f0Var.b.a.getValue();
        x1f0Var.a(a);
        Iterator it3 = ((Iterable) ((xvf0) am2Var.c).get()).iterator();
        while (it3.hasNext()) {
            ((jrd) it3.next()).a(evzVar, a);
        }
    }
}
