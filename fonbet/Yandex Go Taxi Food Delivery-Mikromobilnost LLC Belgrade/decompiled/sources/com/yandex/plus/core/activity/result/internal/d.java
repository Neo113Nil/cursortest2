package com.yandex.plus.core.activity.result.internal;

import androidx.lifecycle.Lifecycle;
import com.yandex.passport.internal.impl.k;
import defpackage.dvw;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.j18;
import defpackage.lid0;
import defpackage.m50;
import defpackage.ny61;
import defpackage.qf91;
import defpackage.tls;
import defpackage.x40;
import defpackage.yr31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class d extends yr31 {
    public x40 c;
    public qf91 w;
    public m50 x;
    public tls y;
    public Lifecycle.State b = Lifecycle.State.INITIALIZED;
    public final kotlinx.coroutines.sync.a z = gtq0.a();
    public final lid0 A = new lid0(0, this);
    public final k B = new k(13, this);

    @Override // defpackage.yr31
    public final void V() {
        tls tlsVar = this.y;
        if (tlsVar != null) {
            ((ActivityWithResultLauncherImpl$attachApplication$1$onActivityCreated$1) tlsVar).invoke(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0096 A[Catch: all -> 0x009a, TryCatch #1 {all -> 0x009a, blocks: (B:24:0x006d, B:26:0x0096, B:27:0x009d), top: B:23:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object W(x40 x40Var, Object obj, ContinuationImpl continuationImpl) {
        PlusProxyViewModel$launch$1 plusProxyViewModel$launch$1;
        Object obj2;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object obj3;
        g050 g050Var;
        int i2;
        g050 g050Var2;
        m50 m50Var;
        try {
            if (continuationImpl instanceof PlusProxyViewModel$launch$1) {
                plusProxyViewModel$launch$1 = (PlusProxyViewModel$launch$1) continuationImpl;
                int i3 = plusProxyViewModel$launch$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    plusProxyViewModel$launch$1.label = i3 - Integer.MIN_VALUE;
                    obj2 = plusProxyViewModel$launch$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusProxyViewModel$launch$1.label;
                    int i4 = 2;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        plusProxyViewModel$launch$1.L$0 = x40Var;
                        plusProxyViewModel$launch$1.L$1 = obj;
                        kotlinx.coroutines.sync.a aVar = this.z;
                        plusProxyViewModel$launch$1.L$2 = aVar;
                        plusProxyViewModel$launch$1.I$0 = 0;
                        plusProxyViewModel$launch$1.label = 1;
                        if (aVar.a(plusProxyViewModel$launch$1) != coroutineSingletons) {
                            obj3 = obj;
                            g050Var = aVar;
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var2 = (g050) plusProxyViewModel$launch$1.L$2;
                        try {
                            kotlin.b.b(obj2);
                            g050Var2.d(null);
                            return obj2;
                        } catch (Throwable th) {
                            th = th;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    int i5 = plusProxyViewModel$launch$1.I$0;
                    g050Var = (g050) plusProxyViewModel$launch$1.L$2;
                    obj3 = plusProxyViewModel$launch$1.L$1;
                    x40 x40Var2 = (x40) plusProxyViewModel$launch$1.L$0;
                    kotlin.b.b(obj2);
                    i2 = i5;
                    x40Var = x40Var2;
                    plusProxyViewModel$launch$1.L$0 = x40Var;
                    plusProxyViewModel$launch$1.L$1 = obj3;
                    plusProxyViewModel$launch$1.L$2 = g050Var;
                    plusProxyViewModel$launch$1.L$3 = plusProxyViewModel$launch$1;
                    plusProxyViewModel$launch$1.I$0 = i2;
                    plusProxyViewModel$launch$1.I$1 = 0;
                    plusProxyViewModel$launch$1.I$2 = 0;
                    plusProxyViewModel$launch$1.label = 2;
                    j18 j18Var = new j18(1, dvw.b(plusProxyViewModel$launch$1));
                    j18Var.u();
                    this.c = x40Var;
                    this.w = new qf91(i4, j18Var);
                    m50Var = this.x;
                    if (m50Var != null) {
                        m50Var.a(obj3);
                    }
                    obj2 = j18Var.s();
                    if (obj2 != coroutineSingletons) {
                        g050Var2 = g050Var;
                        g050Var2.d(null);
                        return obj2;
                    }
                    return coroutineSingletons;
                }
            }
            plusProxyViewModel$launch$1.L$0 = x40Var;
            plusProxyViewModel$launch$1.L$1 = obj3;
            plusProxyViewModel$launch$1.L$2 = g050Var;
            plusProxyViewModel$launch$1.L$3 = plusProxyViewModel$launch$1;
            plusProxyViewModel$launch$1.I$0 = i2;
            plusProxyViewModel$launch$1.I$1 = 0;
            plusProxyViewModel$launch$1.I$2 = 0;
            plusProxyViewModel$launch$1.label = 2;
            j18 j18Var2 = new j18(1, dvw.b(plusProxyViewModel$launch$1));
            j18Var2.u();
            this.c = x40Var;
            this.w = new qf91(i4, j18Var2);
            m50Var = this.x;
            if (m50Var != null) {
            }
            obj2 = j18Var2.s();
            if (obj2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            g050Var2 = g050Var;
            g050Var2.d(null);
            throw th;
        }
        plusProxyViewModel$launch$1 = new PlusProxyViewModel$launch$1(this, continuationImpl);
        obj2 = plusProxyViewModel$launch$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusProxyViewModel$launch$1.label;
        int i42 = 2;
        if (i != 0) {
        }
    }
}
