package com.yandex.go.payments.shared.business.accountcreation;

import android.net.Uri;
import com.yandex.go.payments.shared.f;
import com.yandex.go.payments.shared.g;
import com.yandex.go.payments.shared.y;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import defpackage.a4f;
import defpackage.gue;
import defpackage.hue;
import defpackage.hxx;
import defpackage.iue;
import defpackage.jl40;
import defpackage.jst;
import defpackage.kyh0;
import defpackage.l9;
import defpackage.lyc;
import defpackage.mue;
import defpackage.nf3;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.pzt0;
import defpackage.tmr0;
import defpackage.tnr0;
import defpackage.uq1;
import defpackage.xby;
import defpackage.y4c0;
import defpackage.yvf0;
import defpackage.zor0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class d {
    public final com.yandex.go.payments.shared.business.onboarding.b a;
    public final hue b;
    public final com.yandex.go.payments.shared.business.accountcreation.brached.a c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final oep0 g;
    public final f h;
    public final zor0 i;
    public final uq1 j;
    public final g k;
    public pzt0 l;

    public d(com.yandex.go.payments.shared.business.onboarding.b bVar, hue hueVar, com.yandex.go.payments.shared.business.accountcreation.brached.a aVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, oep0 oep0Var, f fVar, zor0 zor0Var, uq1 uq1Var, g gVar) {
        this.a = bVar;
        this.b = hueVar;
        this.c = aVar;
        this.d = yvf0Var;
        this.e = yvf0Var2;
        this.f = yvf0Var3;
        this.g = oep0Var;
        this.h = fVar;
        this.i = zor0Var;
        this.j = uq1Var;
        this.k = gVar;
    }

    public static final void a(d dVar, Throwable th, Runnable runnable) {
        dVar.getClass();
        xby.l(jst.e, "B2B.TOKEN_ERROR:OPEN_ACCOUNT", null, th, "Failed to open business account", 2);
        dVar.j.a().setMessage(dVar.i.a(th)).setPositiveButton(kyh0.common_got_it).setDismissListener(new nf3(3, runnable)).show();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d dVar, tmr0 tmr0Var, SharedPaymentsOpenReason sharedPaymentsOpenReason, Runnable runnable, Uri uri, ContinuationImpl continuationImpl) {
        CreateBusinessAccountRouter$startCreateBusinessAccountFlow$1 createBusinessAccountRouter$startCreateBusinessAccountFlow$1;
        int i;
        SharedPaymentsOpenReason sharedPaymentsOpenReason2;
        tmr0 tmr0Var2;
        Runnable runnable2;
        boolean booleanValue;
        dVar.getClass();
        if (continuationImpl instanceof CreateBusinessAccountRouter$startCreateBusinessAccountFlow$1) {
            createBusinessAccountRouter$startCreateBusinessAccountFlow$1 = (CreateBusinessAccountRouter$startCreateBusinessAccountFlow$1) continuationImpl;
            int i2 = createBusinessAccountRouter$startCreateBusinessAccountFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                createBusinessAccountRouter$startCreateBusinessAccountFlow$1.label = i2 - Integer.MIN_VALUE;
                CreateBusinessAccountRouter$startCreateBusinessAccountFlow$1 createBusinessAccountRouter$startCreateBusinessAccountFlow$12 = createBusinessAccountRouter$startCreateBusinessAccountFlow$1;
                Object obj = createBusinessAccountRouter$startCreateBusinessAccountFlow$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = createBusinessAccountRouter$startCreateBusinessAccountFlow$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.payments.shared.business.accountcreation.brached.a aVar = dVar.c;
                    createBusinessAccountRouter$startCreateBusinessAccountFlow$12.L$0 = tmr0Var;
                    createBusinessAccountRouter$startCreateBusinessAccountFlow$12.L$1 = sharedPaymentsOpenReason;
                    createBusinessAccountRouter$startCreateBusinessAccountFlow$12.L$2 = runnable;
                    createBusinessAccountRouter$startCreateBusinessAccountFlow$12.L$3 = null;
                    createBusinessAccountRouter$startCreateBusinessAccountFlow$12.label = 1;
                    obj = aVar.a(sharedPaymentsOpenReason, tmr0Var, runnable, uri, createBusinessAccountRouter$startCreateBusinessAccountFlow$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    sharedPaymentsOpenReason2 = sharedPaymentsOpenReason;
                    tmr0Var2 = tmr0Var;
                    runnable2 = runnable;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    runnable2 = (Runnable) createBusinessAccountRouter$startCreateBusinessAccountFlow$12.L$2;
                    sharedPaymentsOpenReason2 = (SharedPaymentsOpenReason) createBusinessAccountRouter$startCreateBusinessAccountFlow$12.L$1;
                    tmr0Var2 = (tmr0) createBusinessAccountRouter$startCreateBusinessAccountFlow$12.L$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                zy11 zy11Var = zy11.a;
                if (!booleanValue) {
                    return zy11Var;
                }
                dVar.d(tmr0Var2, sharedPaymentsOpenReason2, runnable2);
                return zy11Var;
            }
        }
        createBusinessAccountRouter$startCreateBusinessAccountFlow$1 = new CreateBusinessAccountRouter$startCreateBusinessAccountFlow$1(dVar, continuationImpl);
        CreateBusinessAccountRouter$startCreateBusinessAccountFlow$1 createBusinessAccountRouter$startCreateBusinessAccountFlow$122 = createBusinessAccountRouter$startCreateBusinessAccountFlow$1;
        Object obj2 = createBusinessAccountRouter$startCreateBusinessAccountFlow$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = createBusinessAccountRouter$startCreateBusinessAccountFlow$122.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        zy11 zy11Var2 = zy11.a;
        if (!booleanValue) {
        }
    }

    public final void c(tmr0 tmr0Var, SharedPaymentsOpenReason sharedPaymentsOpenReason, Runnable runnable, Uri uri) {
        tnr0 tnr0Var = (tnr0) this.d.get();
        pzt0 pzt0Var = this.l;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.l = g.a(this.k, new CreateBusinessAccountRouter$openAccount$1(this, tnr0Var, sharedPaymentsOpenReason, runnable, tmr0Var, uri, null));
    }

    public final void d(tmr0 tmr0Var, SharedPaymentsOpenReason sharedPaymentsOpenReason, Runnable runnable) {
        l9 l9Var = new l9(this, tmr0Var, sharedPaymentsOpenReason, runnable, 6);
        if (jl40.l(((iue) this.b).a(), gue.g)) {
            l9Var.run();
            return;
        }
        ((y) this.e.get()).c();
        ((pep0) this.g).f(new y4c0(this.f, new lyc(24, l9Var), new a4f(runnable, this, 0), new a4f(runnable, this, 1), 5), new mue(sharedPaymentsOpenReason), hxx.a);
    }
}
