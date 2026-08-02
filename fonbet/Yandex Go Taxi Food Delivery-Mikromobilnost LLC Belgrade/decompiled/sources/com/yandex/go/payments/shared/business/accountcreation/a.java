package com.yandex.go.payments.shared.business.accountcreation;

import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$CloseReason;
import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.v;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import defpackage.ad5;
import defpackage.ax6;
import defpackage.c800;
import defpackage.dw1;
import defpackage.evu0;
import defpackage.fl8;
import defpackage.fw6;
import defpackage.hw6;
import defpackage.hwf;
import defpackage.il;
import defpackage.iw6;
import defpackage.n20;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.qqy;
import defpackage.rmr0;
import defpackage.tmr0;
import defpackage.vnr0;
import defpackage.ww6;
import defpackage.y50;
import defpackage.ycq0;
import defpackage.zor0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes13.dex */
public final class a extends ad5 {
    public final c A;
    public final ww6 B;
    public final y50 C;
    public final ycq0 D;
    public final n20 E;
    public final vnr0 F;
    public final hwf G;
    public final fw6 H;
    public final oep0 I;
    public final rmr0 J;
    public final iw6 x;
    public final v y;
    public final zor0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(iw6 iw6Var, v vVar, zor0 zor0Var, c cVar, ww6 ww6Var, y50 y50Var, ycq0 ycq0Var, n20 n20Var, vnr0 vnr0Var, hwf hwfVar, fw6 fw6Var, oep0 oep0Var) {
        super(hw6.class);
        LinkedHashMap linkedHashMap = vnr0Var.t;
        this.x = iw6Var;
        this.y = vVar;
        this.z = zor0Var;
        this.A = cVar;
        this.B = ww6Var;
        this.C = y50Var;
        this.D = ycq0Var;
        this.E = n20Var;
        this.F = vnr0Var;
        this.G = hwfVar;
        this.H = fw6Var;
        this.I = oep0Var;
        rmr0 rmr0Var = iw6Var.a.j;
        if (rmr0Var == null) {
            ny61.g("Required value was null.");
            throw null;
        }
        this.J = rmr0Var;
        linkedHashMap.put("open_reason", iw6Var.c.getAnalyticsName());
        linkedHashMap.put(ClidProvider.STATE, iw6Var.a.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(a aVar, ContinuationImpl continuationImpl) {
        BusinessAccountCreationPresenter$updateViews$1 businessAccountCreationPresenter$updateViews$1;
        int i;
        iw6 iw6Var = aVar.x;
        if (continuationImpl instanceof BusinessAccountCreationPresenter$updateViews$1) {
            businessAccountCreationPresenter$updateViews$1 = (BusinessAccountCreationPresenter$updateViews$1) continuationImpl;
            int i2 = businessAccountCreationPresenter$updateViews$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                businessAccountCreationPresenter$updateViews$1.label = i2 - Integer.MIN_VALUE;
                BusinessAccountCreationPresenter$updateViews$1 businessAccountCreationPresenter$updateViews$12 = businessAccountCreationPresenter$updateViews$1;
                Object obj = businessAccountCreationPresenter$updateViews$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = businessAccountCreationPresenter$updateViews$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = aVar.A;
                    Account b = iw6Var.a().b();
                    rmr0 rmr0Var = aVar.J;
                    ListBuilder h = ((com.yandex.go.payments.paymentlist.data.c) aVar.y.c).h();
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator = h.listIterator(0);
                    while (true) {
                        qqy qqyVar = (qqy) listIterator;
                        if (!qqyVar.hasNext()) {
                            break;
                        }
                        Object next = qqyVar.next();
                        if (next instanceof fl8) {
                            arrayList.add(next);
                        }
                    }
                    boolean z = !arrayList.isEmpty();
                    boolean r = ((com.yandex.go.taxi.order.provider.a) aVar.E).r();
                    c800 c800Var = iw6Var.d;
                    businessAccountCreationPresenter$updateViews$12.label = 1;
                    obj = cVar.a(b, rmr0Var, z, r, c800Var, businessAccountCreationPresenter$updateViews$12);
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
                ((hw6) aVar.Dg()).updateViews((ax6) obj);
                return zy11.a;
            }
        }
        businessAccountCreationPresenter$updateViews$1 = new BusinessAccountCreationPresenter$updateViews$1(aVar, continuationImpl);
        BusinessAccountCreationPresenter$updateViews$1 businessAccountCreationPresenter$updateViews$122 = businessAccountCreationPresenter$updateViews$1;
        Object obj2 = businessAccountCreationPresenter$updateViews$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = businessAccountCreationPresenter$updateViews$122.label;
        if (i != 0) {
        }
        ((hw6) aVar.Dg()).updateViews((ax6) obj2);
        return zy11.a;
    }

    public final void Lg() {
        iw6 iw6Var = this.x;
        il ilVar = iw6Var.e;
        tmr0 tmr0Var = iw6Var.a;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = iw6Var.c;
        boolean z = ilVar != null;
        vnr0 vnr0Var = this.F;
        if (z) {
            vnr0Var.l(iw6Var.a().b, sharedPaymentsOpenReason, Mg(), SharedPaymentAnalytics$Button.OUT_SCREEN);
        } else {
            vnr0Var.f(tmr0Var, sharedPaymentsOpenReason, SharedPaymentAnalytics$Button.OUT_SCREEN);
            vnr0Var.g(tmr0Var, sharedPaymentsOpenReason, SharedPaymentAnalytics$CloseReason.OUT_CARD);
        }
        iw6Var.b.a();
    }

    public final boolean Mg() {
        dw1 dw1Var = this.J.l;
        return (dw1Var == null || evu0.J(dw1Var.a) || evu0.J(dw1Var.b) || evu0.J(dw1Var.c)) ? false : true;
    }
}
