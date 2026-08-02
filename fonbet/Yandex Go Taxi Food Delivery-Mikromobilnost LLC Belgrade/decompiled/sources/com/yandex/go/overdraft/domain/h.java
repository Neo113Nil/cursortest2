package com.yandex.go.overdraft.domain;

import com.yandex.go.payments.domain.j0;
import defpackage.jl40;
import defpackage.kw90;
import defpackage.lea0;
import defpackage.lw90;
import defpackage.m6a0;
import defpackage.n65;
import defpackage.ny61;
import defpackage.pl21;
import defpackage.ql21;
import defpackage.sz80;
import defpackage.tpr;
import defpackage.uea0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class h {
    public final sz80 a;
    public final ql21 b;
    public final g c;
    public final j0 d;
    public final lw90 e;
    public final uea0 f;

    public h(sz80 sz80Var, ql21 ql21Var, g gVar, j0 j0Var, lw90 lw90Var, uea0 uea0Var) {
        this.a = sz80Var;
        this.b = ql21Var;
        this.c = gVar;
        this.d = j0Var;
        this.e = lw90Var;
        this.f = uea0Var;
    }

    public static lea0 b(List list, m6a0 m6a0Var) {
        PaymentMethod$Type paymentMethod$Type;
        Object obj = null;
        if (m6a0Var == null || (paymentMethod$Type = m6a0Var.a) == null) {
            return null;
        }
        String str = m6a0Var.b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            lea0 lea0Var = (lea0) next;
            if (lea0Var.c() == paymentMethod$Type && jl40.l(lea0Var.getId(), str)) {
                obj = next;
                break;
            }
        }
        return (lea0) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        OverdraftDomainStateInteractor$fetchDebtsStatusesIfNeed$1 overdraftDomainStateInteractor$fetchDebtsStatusesIfNeed$1;
        int i;
        if (continuationImpl instanceof OverdraftDomainStateInteractor$fetchDebtsStatusesIfNeed$1) {
            overdraftDomainStateInteractor$fetchDebtsStatusesIfNeed$1 = (OverdraftDomainStateInteractor$fetchDebtsStatusesIfNeed$1) continuationImpl;
            int i2 = overdraftDomainStateInteractor$fetchDebtsStatusesIfNeed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                overdraftDomainStateInteractor$fetchDebtsStatusesIfNeed$1.label = i2 - Integer.MIN_VALUE;
                Object obj = overdraftDomainStateInteractor$fetchDebtsStatusesIfNeed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = overdraftDomainStateInteractor$fetchDebtsStatusesIfNeed$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    return zy11Var;
                }
                kotlin.b.b(obj);
                if (!((pl21) kotlinx.coroutines.flow.e.d(this.b.a).a.getValue()).a) {
                    overdraftDomainStateInteractor$fetchDebtsStatusesIfNeed$1.label = 1;
                    if (this.c.c(overdraftDomainStateInteractor$fetchDebtsStatusesIfNeed$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        overdraftDomainStateInteractor$fetchDebtsStatusesIfNeed$1 = new OverdraftDomainStateInteractor$fetchDebtsStatusesIfNeed$1(this, continuationImpl);
        Object obj2 = overdraftDomainStateInteractor$fetchDebtsStatusesIfNeed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overdraftDomainStateInteractor$fetchDebtsStatusesIfNeed$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    public final tpr c() {
        kw90 a = this.e.a(new n65[0]);
        return kotlinx.coroutines.flow.e.t(new m0(new m0(this.d.a(a), this.a.a, new OverdraftDomainStateInteractor$paymentOptionsFlow$1(this, a, null)), kotlinx.coroutines.flow.e.d(this.b.a), new OverdraftDomainStateInteractor$getOverdraftPaymentDomainStateFlow$1(this, null)));
    }
}
