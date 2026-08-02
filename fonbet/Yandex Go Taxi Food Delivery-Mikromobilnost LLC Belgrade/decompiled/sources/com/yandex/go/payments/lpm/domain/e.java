package com.yandex.go.payments.lpm.domain;

import com.yandex.go.payments.data.g;
import com.yandex.go.payments.domain.l0;
import com.yandex.go.yb.data.u;
import defpackage.ao51;
import defpackage.azz;
import defpackage.brh;
import defpackage.bvf0;
import defpackage.c9v;
import defpackage.g92;
import defpackage.h0a0;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.jqr;
import defpackage.lea0;
import defpackage.lyz;
import defpackage.m6a0;
import defpackage.mth;
import defpackage.n6a0;
import defpackage.ny61;
import defpackage.oyz;
import defpackage.pea0;
import defpackage.ryz;
import defpackage.sms;
import defpackage.tea0;
import defpackage.tpr;
import defpackage.u0k;
import defpackage.xyz;
import defpackage.zba0;
import defpackage.zxz;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class e implements zba0 {
    public final azz a;
    public final u b;
    public final l0 c;
    public final ao51 d;
    public final ryz e;
    public final zxz f;
    public final com.yandex.go.payments.data.c g;
    public final tea0 h;
    public final h3y i;
    public final r0 j = bvf0.c(Long.valueOf(System.currentTimeMillis()));
    public final c9v k;
    public final i3y l;
    public int m;

    public e(azz azzVar, u uVar, l0 l0Var, ao51 ao51Var, ryz ryzVar, zxz zxzVar, com.yandex.go.payments.data.c cVar, tea0 tea0Var, h3y h3yVar, lyz lyzVar) {
        this.a = azzVar;
        this.b = uVar;
        this.c = l0Var;
        this.d = ao51Var;
        this.e = ryzVar;
        this.f = zxzVar;
        this.g = cVar;
        this.h = tea0Var;
        this.i = h3yVar;
        m6a0 m6a0Var = azzVar.d;
        sms smsVar = lyzVar.a;
        this.k = new c9v(m6a0Var, new n6a0());
        this.l = kotlin.a.a(new xyz(0, this));
    }

    @Override // defpackage.zba0
    public final Object a(lea0 lea0Var, Continuation continuation) {
        String id = lea0Var.getId();
        if (id == null) {
            id = "";
        }
        this.e.a.g(new oyz(id, lea0Var.c()));
        return zy11.a;
    }

    @Override // defpackage.zba0
    public final tpr b() {
        azz azzVar = this.a;
        Object obj = null;
        jqr jqrVar = new jqr(((g) this.c.a.a(azzVar.b)).d(), new LpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$1(this, null), 3);
        r0 r0Var = (r0) this.k.c;
        int i = 2;
        n nVar = new n(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{new b(this.j), new d(new mth(this.b.c().t, 4)), this.d.a}, 3)), new LpmPaymentMethodsListSourceInteractorImpl$triggersFlow$3(2, null));
        tpr tprVar = azzVar.q;
        if (tprVar == null) {
            tprVar = new g92(i, obj);
        }
        return kotlinx.coroutines.flow.e.p(kotlinx.coroutines.flow.e.m(jqrVar, r0Var, nVar, tprVar, new LpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$2(this, null)), 100L);
    }

    @Override // defpackage.zba0
    public final void c(String str, PaymentMethod$Type paymentMethod$Type) {
        this.e.a();
        this.k.i(str, paymentMethod$Type);
    }

    @Override // defpackage.zba0
    public final m6a0 d() {
        return (m6a0) ((r0) this.k.c).getValue();
    }

    @Override // defpackage.zba0
    public final boolean e(ArrayList arrayList) {
        brh brhVar = (brh) this.i.get();
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (brhVar.a((u0k) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zba0
    public final void f() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        r0 r0Var = this.j;
        r0Var.getClass();
        r0Var.m(null, valueOf);
    }

    @Override // defpackage.zba0
    public final void g() {
    }

    @Override // defpackage.zba0
    public final String getCurrency() {
        pea0 pea0Var = this.c.b(this.a.b).d;
        if (pea0Var != null) {
            return pea0Var.d;
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|25|6|7|(0)(0)|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        throw r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // defpackage.zba0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(boolean z, ContinuationImpl continuationImpl) {
        LpmPaymentMethodsListSourceInteractorImpl$updatePaymentMethods$1 lpmPaymentMethodsListSourceInteractorImpl$updatePaymentMethods$1;
        int i;
        if (continuationImpl instanceof LpmPaymentMethodsListSourceInteractorImpl$updatePaymentMethods$1) {
            lpmPaymentMethodsListSourceInteractorImpl$updatePaymentMethods$1 = (LpmPaymentMethodsListSourceInteractorImpl$updatePaymentMethods$1) continuationImpl;
            int i2 = lpmPaymentMethodsListSourceInteractorImpl$updatePaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lpmPaymentMethodsListSourceInteractorImpl$updatePaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lpmPaymentMethodsListSourceInteractorImpl$updatePaymentMethods$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lpmPaymentMethodsListSourceInteractorImpl$updatePaymentMethods$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l0 l0Var = this.c;
                    azz azzVar = this.a;
                    h0a0 h0a0Var = azzVar.c;
                    String str = azzVar.b;
                    lpmPaymentMethodsListSourceInteractorImpl$updatePaymentMethods$1.Z$0 = z;
                    lpmPaymentMethodsListSourceInteractorImpl$updatePaymentMethods$1.label = 1;
                    if (l0Var.c(h0a0Var, str, z, lpmPaymentMethodsListSourceInteractorImpl$updatePaymentMethods$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        lpmPaymentMethodsListSourceInteractorImpl$updatePaymentMethods$1 = new LpmPaymentMethodsListSourceInteractorImpl$updatePaymentMethods$1(this, continuationImpl);
        Object obj2 = lpmPaymentMethodsListSourceInteractorImpl$updatePaymentMethods$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lpmPaymentMethodsListSourceInteractorImpl$updatePaymentMethods$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    @Override // defpackage.zba0
    public final boolean i() {
        m6a0 m6a0Var = (m6a0) ((r0) this.k.c).getValue();
        return m6a0Var != null && m6a0Var.a();
    }
}
