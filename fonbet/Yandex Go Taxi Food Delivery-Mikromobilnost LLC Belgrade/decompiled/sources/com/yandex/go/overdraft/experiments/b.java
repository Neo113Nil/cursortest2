package com.yandex.go.overdraft.experiments;

import defpackage.g050;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.hd;
import defpackage.lxx;
import defpackage.ny61;
import defpackage.owx;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b implements lxx {
    public final h3y a;
    public final hd b;
    public final tse c;
    public final com.yandex.go.lifecycle.a d;
    public pzt0 e;
    public final kotlinx.coroutines.sync.a f = gtq0.a();
    public final String g = "DEBTS";

    public b(h3y h3yVar, hd hdVar, tse tseVar, com.yandex.go.lifecycle.a aVar) {
        this.a = h3yVar;
        this.b = hdVar;
        this.c = tseVar;
        this.d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:11:0x004c, B:13:0x0050, B:14:0x0056), top: B:10:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r6v5, types: [g050] */
    @Override // defpackage.lxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(owx owxVar, Continuation continuation) {
        OverdraftDelegateSender$process$1 overdraftDelegateSender$process$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        pzt0 pzt0Var;
        try {
            if (continuation instanceof OverdraftDelegateSender$process$1) {
                overdraftDelegateSender$process$1 = (OverdraftDelegateSender$process$1) continuation;
                int i2 = overdraftDelegateSender$process$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    overdraftDelegateSender$process$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = overdraftDelegateSender$process$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = overdraftDelegateSender$process$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        overdraftDelegateSender$process$1.L$0 = owxVar;
                        aVar = this.f;
                        overdraftDelegateSender$process$1.L$1 = aVar;
                        overdraftDelegateSender$process$1.label = 1;
                        if (aVar.a(overdraftDelegateSender$process$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) overdraftDelegateSender$process$1.L$1;
                        owx owxVar2 = (owx) overdraftDelegateSender$process$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        owxVar = owxVar2;
                    }
                    pzt0Var = this.e;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    this.e = tje.N(this.c, null, null, new OverdraftDelegateSender$process$2$1(this, owxVar, null), 3);
                    aVar.d(null);
                    return zy11.a;
                }
            }
            pzt0Var = this.e;
            if (pzt0Var != null) {
            }
            this.e = tje.N(this.c, null, null, new OverdraftDelegateSender$process$2$1(this, owxVar, null), 3);
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        overdraftDelegateSender$process$1 = new OverdraftDelegateSender$process$1(this, (ContinuationImpl) continuation);
        Object obj2 = overdraftDelegateSender$process$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overdraftDelegateSender$process$1.label;
        if (i != 0) {
        }
    }

    @Override // defpackage.j35
    public final String getName() {
        return this.g;
    }
}
