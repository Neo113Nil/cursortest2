package com.yandex.mob.network;

import com.yandex.mob.data.d;
import com.yandex.mob.datastore.f;
import com.yandex.mob.domain.l;
import defpackage.bms;
import defpackage.go20;
import defpackage.gp20;
import defpackage.ny61;
import defpackage.oq20;
import defpackage.pr20;
import defpackage.scc;
import defpackage.tm20;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b implements gp20 {
    public final f a;
    public final l b;

    public b(f fVar, l lVar) {
        this.a = fVar;
        this.b = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r12 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.gp20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(bms bmsVar, ContinuationImpl continuationImpl) {
        MobSingleNetworkRequestProcessor$process$1 mobSingleNetworkRequestProcessor$process$1;
        Object obj;
        int i;
        Object d;
        pr20 pr20Var;
        if (continuationImpl instanceof MobSingleNetworkRequestProcessor$process$1) {
            mobSingleNetworkRequestProcessor$process$1 = (MobSingleNetworkRequestProcessor$process$1) continuationImpl;
            int i2 = mobSingleNetworkRequestProcessor$process$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobSingleNetworkRequestProcessor$process$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mobSingleNetworkRequestProcessor$process$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobSingleNetworkRequestProcessor$process$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    mobSingleNetworkRequestProcessor$process$1.L$0 = bmsVar;
                    mobSingleNetworkRequestProcessor$process$1.label = 1;
                    obj2 = b(mobSingleNetworkRequestProcessor$process$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj2);
                            return obj2;
                        }
                        pr20Var = (pr20) mobSingleNetworkRequestProcessor$process$1.L$1;
                        bmsVar = (bms) mobSingleNetworkRequestProcessor$process$1.L$0;
                        kotlin.b.b(obj2);
                        go20 go20Var = new go20(kotlin.collections.b.f());
                        oq20 oq20Var = new oq20(scc.g(new Pair("mobcf", ((tm20) obj2).a), new Pair("mobpr", pr20Var.a.b)));
                        mobSingleNetworkRequestProcessor$process$1.L$0 = null;
                        mobSingleNetworkRequestProcessor$process$1.L$1 = null;
                        mobSingleNetworkRequestProcessor$process$1.L$2 = null;
                        mobSingleNetworkRequestProcessor$process$1.label = 3;
                        Object invoke = bmsVar.invoke(pr20Var, go20Var, oq20Var, mobSingleNetworkRequestProcessor$process$1);
                        return invoke != obj ? obj : invoke;
                    }
                    bmsVar = (bms) mobSingleNetworkRequestProcessor$process$1.L$0;
                    kotlin.b.b(obj2);
                }
                pr20 pr20Var2 = (pr20) obj2;
                mobSingleNetworkRequestProcessor$process$1.L$0 = bmsVar;
                mobSingleNetworkRequestProcessor$process$1.L$1 = pr20Var2;
                mobSingleNetworkRequestProcessor$process$1.label = 2;
                d = this.b.d(mobSingleNetworkRequestProcessor$process$1);
                if (d != obj) {
                    obj2 = d;
                    pr20Var = pr20Var2;
                    go20 go20Var2 = new go20(kotlin.collections.b.f());
                    oq20 oq20Var2 = new oq20(scc.g(new Pair("mobcf", ((tm20) obj2).a), new Pair("mobpr", pr20Var.a.b)));
                    mobSingleNetworkRequestProcessor$process$1.L$0 = null;
                    mobSingleNetworkRequestProcessor$process$1.L$1 = null;
                    mobSingleNetworkRequestProcessor$process$1.L$2 = null;
                    mobSingleNetworkRequestProcessor$process$1.label = 3;
                    Object invoke2 = bmsVar.invoke(pr20Var, go20Var2, oq20Var2, mobSingleNetworkRequestProcessor$process$1);
                    if (invoke2 != obj) {
                    }
                }
            }
        }
        mobSingleNetworkRequestProcessor$process$1 = new MobSingleNetworkRequestProcessor$process$1(this, continuationImpl);
        Object obj22 = mobSingleNetworkRequestProcessor$process$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobSingleNetworkRequestProcessor$process$1.label;
        if (i != 0) {
        }
        pr20 pr20Var22 = (pr20) obj22;
        mobSingleNetworkRequestProcessor$process$1.L$0 = bmsVar;
        mobSingleNetworkRequestProcessor$process$1.L$1 = pr20Var22;
        mobSingleNetworkRequestProcessor$process$1.label = 2;
        d = this.b.d(mobSingleNetworkRequestProcessor$process$1);
        if (d != obj) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MobSingleNetworkRequestProcessor$selectedProxy$1 mobSingleNetworkRequestProcessor$selectedProxy$1;
        int i;
        pr20 pr20Var;
        if (continuationImpl instanceof MobSingleNetworkRequestProcessor$selectedProxy$1) {
            mobSingleNetworkRequestProcessor$selectedProxy$1 = (MobSingleNetworkRequestProcessor$selectedProxy$1) continuationImpl;
            int i2 = mobSingleNetworkRequestProcessor$selectedProxy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobSingleNetworkRequestProcessor$selectedProxy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobSingleNetworkRequestProcessor$selectedProxy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobSingleNetworkRequestProcessor$selectedProxy$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobSingleNetworkRequestProcessor$selectedProxy$1.label = 1;
                    obj = d.a(this.a, "mob", mobSingleNetworkRequestProcessor$selectedProxy$1);
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
                pr20Var = (pr20) obj;
                if (pr20Var == null) {
                    return pr20Var;
                }
                ny61.r("Initialize MOB config before usage!");
                return null;
            }
        }
        mobSingleNetworkRequestProcessor$selectedProxy$1 = new MobSingleNetworkRequestProcessor$selectedProxy$1(this, continuationImpl);
        Object obj2 = mobSingleNetworkRequestProcessor$selectedProxy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobSingleNetworkRequestProcessor$selectedProxy$1.label;
        if (i != 0) {
        }
        pr20Var = (pr20) obj2;
        if (pr20Var == null) {
        }
    }
}
