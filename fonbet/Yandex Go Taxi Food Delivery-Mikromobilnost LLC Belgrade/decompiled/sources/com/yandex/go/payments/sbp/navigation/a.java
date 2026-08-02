package com.yandex.go.payments.sbp.navigation;

import com.yandex.go.payments.domain.l0;
import defpackage.ajm0;
import defpackage.by90;
import defpackage.h0a0;
import defpackage.h3y;
import defpackage.h55;
import defpackage.i3y;
import defpackage.l7b;
import defpackage.mj0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.po21;
import defpackage.tje;
import defpackage.veb;
import defpackage.vi0;
import defpackage.w030;
import defpackage.wi0;
import defpackage.yvf0;
import defpackage.zi0;
import defpackage.zuj0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes13.dex */
public final class a extends h55 {
    public final zuj0 D;
    public final yvf0 E;
    public final wi0 F;
    public final com.yandex.go.payments.superapp.payment.b G;
    public final h3y H;
    public final h3y I;
    public final ajm0 J;
    public final w030 K;
    public zi0 L;
    public final i3y M;

    public a(zuj0 zuj0Var, yvf0 yvf0Var, wi0 wi0Var, com.yandex.go.payments.superapp.payment.b bVar, h3y h3yVar, h3y h3yVar2, ajm0 ajm0Var, w030 w030Var) {
        super(null);
        this.D = zuj0Var;
        this.E = yvf0Var;
        this.F = wi0Var;
        this.G = bVar;
        this.H = h3yVar;
        this.I = h3yVar2;
        this.J = ajm0Var;
        this.K = w030Var;
        this.M = kotlin.a.a(new l7b(6, this));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        i3y i3yVar = this.M;
        if (i3yVar.isInitialized()) {
            ((by90) i3yVar.getValue()).dispose();
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new CheckAddSbpTokenAvailabilityRouter$onLaunch$1(this, (veb) obj, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object P(ContinuationImpl continuationImpl) {
        CheckAddSbpTokenAvailabilityRouter$checkByLpm$1 checkAddSbpTokenAvailabilityRouter$checkByLpm$1;
        int i;
        if (continuationImpl instanceof CheckAddSbpTokenAvailabilityRouter$checkByLpm$1) {
            checkAddSbpTokenAvailabilityRouter$checkByLpm$1 = (CheckAddSbpTokenAvailabilityRouter$checkByLpm$1) continuationImpl;
            int i2 = checkAddSbpTokenAvailabilityRouter$checkByLpm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkAddSbpTokenAvailabilityRouter$checkByLpm$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkAddSbpTokenAvailabilityRouter$checkByLpm$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkAddSbpTokenAvailabilityRouter$checkByLpm$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    po21 po21Var = (po21) this.I.get();
                    checkAddSbpTokenAvailabilityRouter$checkByLpm$1.label = 1;
                    obj = ((e) po21Var).f(checkAddSbpTokenAvailabilityRouter$checkByLpm$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        List list = ((oea0) obj).b;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (((vi0) it.next()) instanceof mj0) {
                                    break;
                                }
                            }
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    }
                    kotlin.b.b(obj);
                }
                h0a0 h0a0Var = new h0a0(((mo21) obj).a(), null);
                checkAddSbpTokenAvailabilityRouter$checkByLpm$1.L$0 = null;
                checkAddSbpTokenAvailabilityRouter$checkByLpm$1.label = 2;
                obj = Q(h0a0Var, checkAddSbpTokenAvailabilityRouter$checkByLpm$1);
            }
        }
        checkAddSbpTokenAvailabilityRouter$checkByLpm$1 = new CheckAddSbpTokenAvailabilityRouter$checkByLpm$1(this, continuationImpl);
        Object obj3 = checkAddSbpTokenAvailabilityRouter$checkByLpm$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkAddSbpTokenAvailabilityRouter$checkByLpm$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        h0a0 h0a0Var2 = new h0a0(((mo21) obj3).a(), null);
        checkAddSbpTokenAvailabilityRouter$checkByLpm$1.L$0 = null;
        checkAddSbpTokenAvailabilityRouter$checkByLpm$1.label = 2;
        obj3 = Q(h0a0Var2, checkAddSbpTokenAvailabilityRouter$checkByLpm$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(h0a0 h0a0Var, ContinuationImpl continuationImpl) {
        CheckAddSbpTokenAvailabilityRouter$getPaymentModels$1 checkAddSbpTokenAvailabilityRouter$getPaymentModels$1;
        int i;
        if (continuationImpl instanceof CheckAddSbpTokenAvailabilityRouter$getPaymentModels$1) {
            checkAddSbpTokenAvailabilityRouter$getPaymentModels$1 = (CheckAddSbpTokenAvailabilityRouter$getPaymentModels$1) continuationImpl;
            int i2 = checkAddSbpTokenAvailabilityRouter$getPaymentModels$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkAddSbpTokenAvailabilityRouter$getPaymentModels$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkAddSbpTokenAvailabilityRouter$getPaymentModels$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkAddSbpTokenAvailabilityRouter$getPaymentModels$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l0 b = ((by90) this.M.getValue()).b();
                    checkAddSbpTokenAvailabilityRouter$getPaymentModels$1.L$0 = null;
                    checkAddSbpTokenAvailabilityRouter$getPaymentModels$1.L$1 = null;
                    checkAddSbpTokenAvailabilityRouter$getPaymentModels$1.L$2 = null;
                    checkAddSbpTokenAvailabilityRouter$getPaymentModels$1.label = 1;
                    obj = b.c(h0a0Var, "no_feature", true, checkAddSbpTokenAvailabilityRouter$getPaymentModels$1);
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
                return (oea0) obj;
            }
        }
        checkAddSbpTokenAvailabilityRouter$getPaymentModels$1 = new CheckAddSbpTokenAvailabilityRouter$getPaymentModels$1(this, continuationImpl);
        Object obj2 = checkAddSbpTokenAvailabilityRouter$getPaymentModels$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkAddSbpTokenAvailabilityRouter$getPaymentModels$1.label;
        if (i != 0) {
        }
        return (oea0) obj2;
    }
}
