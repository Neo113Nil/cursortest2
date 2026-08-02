package com.yandex.go.drive.launch;

import android.location.Location;
import androidx.lifecycle.Lifecycle;
import com.yandex.mobile.drive.sdk.full.Environment;
import defpackage.acz;
import defpackage.bfm;
import defpackage.d42;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.gwx;
import defpackage.h7u0;
import defpackage.hzk;
import defpackage.jl40;
import defpackage.kb20;
import defpackage.kfm;
import defpackage.l8x;
import defpackage.lx4;
import defpackage.lxx;
import defpackage.ny61;
import defpackage.owx;
import defpackage.rcc;
import defpackage.s6z;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.u02;
import defpackage.yb20;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class e implements lxx {
    public final acz a;
    public final lx4 b;
    public final kb20 c;
    public final gwx d;
    public final h7u0 e;
    public final u02 f;
    public final tse g;
    public final Lifecycle h;
    public final kfm i;
    public List j;
    public final kotlinx.coroutines.sync.a k = gtq0.a();

    public e(acz aczVar, lx4 lx4Var, kb20 kb20Var, gwx gwxVar, h7u0 h7u0Var, u02 u02Var, com.yandex.go.drive.delegates.b bVar, tse tseVar, Lifecycle lifecycle, kfm kfmVar) {
        this.a = aczVar;
        this.b = lx4Var;
        this.c = kb20Var;
        this.d = gwxVar;
        this.e = h7u0Var;
        this.f = u02Var;
        this.g = tseVar;
        this.h = lifecycle;
        this.i = kfmVar;
        bfm bfmVar = bfm.i;
        bfmVar.h = bVar;
        com.yandex.mobile.drive.account_manager.a.c = new hzk(bVar, bfmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094 A[LOOP:0: B:30:0x008e->B:32:0x0094, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(yb20 yb20Var) {
        d42 d42Var;
        Iterator it;
        this.f.getClass();
        Environment environment = Environment.STABLE;
        String Ig = this.d.a.Ig();
        String a = this.e.a();
        Location a2 = this.a.a();
        bfm bfmVar = bfm.i;
        if (yb20Var != null) {
            String str = yb20Var.a;
            String str2 = yb20Var.b;
            if (str != null && str2 != null) {
                d42Var = new d42(str, str2);
                boolean z = !jl40.e(bfmVar.e, a2 != null ? new s6z(a2.getLongitude(), a2.getLatitude()) : null) || (!jl40.e(bfmVar.d, a) || (!jl40.e(bfmVar.c, Ig) || (!jl40.e(bfmVar.b, d42Var) || jl40.e(bfmVar.a, environment))));
                if (!jl40.e(bfmVar.f, Boolean.FALSE) || z) {
                    it = bfmVar.g.iterator();
                    while (it.hasNext()) {
                        ((sls) it.next()).invoke();
                    }
                }
                return;
            }
        }
        d42Var = null;
        if (jl40.e(bfmVar.e, a2 != null ? new s6z(a2.getLongitude(), a2.getLatitude()) : null)) {
        }
        if (jl40.e(bfmVar.f, Boolean.FALSE)) {
        }
        it = bfmVar.g.iterator();
        while (it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078 A[Catch: all -> 0x008e, TryCatch #0 {all -> 0x008e, blocks: (B:11:0x0074, B:13:0x0078, B:14:0x007e, B:16:0x0084, B:18:0x0090), top: B:10:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.lxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(owx owxVar, Continuation continuation) {
        DriveSdkParamsSupplier$process$1 driveSdkParamsSupplier$process$1;
        int i;
        List j;
        g050 g050Var;
        List list;
        try {
            if (continuation instanceof DriveSdkParamsSupplier$process$1) {
                driveSdkParamsSupplier$process$1 = (DriveSdkParamsSupplier$process$1) continuation;
                int i2 = driveSdkParamsSupplier$process$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    driveSdkParamsSupplier$process$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = driveSdkParamsSupplier$process$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = driveSdkParamsSupplier$process$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ListBuilder a = rcc.a();
                        DriveSdkParamsSupplier$process$processJobs$1$1 driveSdkParamsSupplier$process$processJobs$1$1 = new DriveSdkParamsSupplier$process$processJobs$1$1(this, null);
                        tse tseVar = this.g;
                        a.add(tje.N(tseVar, null, null, driveSdkParamsSupplier$process$processJobs$1$1, 3));
                        a.add(tje.N(tseVar, null, null, new DriveSdkParamsSupplier$process$processJobs$1$2(this, null), 3));
                        j = a.j();
                        driveSdkParamsSupplier$process$1.L$0 = null;
                        driveSdkParamsSupplier$process$1.L$1 = j;
                        kotlinx.coroutines.sync.a aVar = this.k;
                        driveSdkParamsSupplier$process$1.L$2 = aVar;
                        driveSdkParamsSupplier$process$1.label = 1;
                        if (aVar.a(driveSdkParamsSupplier$process$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) driveSdkParamsSupplier$process$1.L$2;
                        j = (List) driveSdkParamsSupplier$process$1.L$1;
                        kotlin.b.b(obj);
                    }
                    list = this.j;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((l8x) it.next()).a(null);
                        }
                    }
                    this.j = j;
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            list = this.j;
            if (list != null) {
            }
            this.j = j;
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        driveSdkParamsSupplier$process$1 = new DriveSdkParamsSupplier$process$1(this, (ContinuationImpl) continuation);
        Object obj2 = driveSdkParamsSupplier$process$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveSdkParamsSupplier$process$1.label;
        if (i != 0) {
        }
    }

    @Override // defpackage.j35
    public final String getName() {
        return "DriveSdkParamsSupplier";
    }
}
