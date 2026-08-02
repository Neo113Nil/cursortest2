package com.yandex.go.taxi.order.delegates;

import com.yandex.go.inapp_calls.navigation.f;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.Forwarding;
import defpackage.evu0;
import defpackage.fkv;
import defpackage.hkv;
import defpackage.hxx;
import defpackage.lu5;
import defpackage.lyx0;
import defpackage.mf1;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.pg7;
import defpackage.rwo0;
import defpackage.s7h;
import defpackage.tje;
import defpackage.tse;
import defpackage.yi7;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a implements pg7 {
    public final yi7 a;
    public final yvf0 b;
    public final s7h c;
    public final tse d;
    public final oep0 e;
    public final com.yandex.go.taxi.order.domain.a f;

    public a(yi7 yi7Var, yvf0 yvf0Var, s7h s7hVar, tse tseVar, oep0 oep0Var, com.yandex.go.taxi.order.domain.a aVar) {
        this.a = yi7Var;
        this.b = yvf0Var;
        this.c = s7hVar;
        this.d = tseVar;
        this.e = oep0Var;
        this.f = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, TaxiOrder taxiOrder, String str, ContinuationImpl continuationImpl) {
        CallDelegateImpl$callDriverInternal$1 callDelegateImpl$callDriverInternal$1;
        int i;
        String str2;
        aVar.getClass();
        if (continuationImpl instanceof CallDelegateImpl$callDriverInternal$1) {
            callDelegateImpl$callDriverInternal$1 = (CallDelegateImpl$callDriverInternal$1) continuationImpl;
            int i2 = callDelegateImpl$callDriverInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callDelegateImpl$callDriverInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = callDelegateImpl$callDriverInternal$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callDelegateImpl$callDriverInternal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str == null) {
                        str = taxiOrder.V().g.g;
                    }
                    callDelegateImpl$callDriverInternal$1.L$0 = null;
                    callDelegateImpl$callDriverInternal$1.L$1 = null;
                    callDelegateImpl$callDriverInternal$1.L$2 = str;
                    callDelegateImpl$callDriverInternal$1.label = 1;
                    obj = aVar.d(taxiOrder, callDelegateImpl$callDriverInternal$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    str2 = str;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) callDelegateImpl$callDriverInternal$1.L$2;
                    kotlin.b.b(obj);
                }
                ((pep0) aVar.e).f(new rwo0(4, (f) aVar.b.get(), new lu5(24, aVar, str2)), new hkv((fkv) obj, null, str2, new mf1((byte) 0, 12, UUID.randomUUID().toString())), hxx.a);
                return zy11.a;
            }
        }
        callDelegateImpl$callDriverInternal$1 = new CallDelegateImpl$callDriverInternal$1(aVar, continuationImpl);
        Object obj3 = callDelegateImpl$callDriverInternal$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callDelegateImpl$callDriverInternal$1.label;
        if (i != 0) {
        }
        ((pep0) aVar.e).f(new rwo0(4, (f) aVar.b.get(), new lu5(24, aVar, str2)), new hkv((fkv) obj3, null, str2, new mf1((byte) 0, 12, UUID.randomUUID().toString())), hxx.a);
        return zy11.a;
    }

    public final void c(TaxiOrder taxiOrder, String str) {
        tje.N(this.d, null, null, new CallDelegateImpl$callDriver$1(this, taxiOrder, str, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        CallDelegateImpl$createForwarding$1 callDelegateImpl$createForwarding$1;
        int i;
        String str;
        TaxiOrder taxiOrder2 = taxiOrder;
        if (continuationImpl instanceof CallDelegateImpl$createForwarding$1) {
            callDelegateImpl$createForwarding$1 = (CallDelegateImpl$createForwarding$1) continuationImpl;
            int i2 = callDelegateImpl$createForwarding$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callDelegateImpl$createForwarding$1.label = i2 - Integer.MIN_VALUE;
                Object obj = callDelegateImpl$createForwarding$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callDelegateImpl$createForwarding$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Forwarding forwarding = taxiOrder2.V().g.e;
                    String str2 = forwarding != null ? forwarding.a : null;
                    if (!taxiOrder2.l.a || str2 == null || evu0.J(str2)) {
                        return null;
                    }
                    com.yandex.go.taxi.order.domain.a aVar = this.f;
                    callDelegateImpl$createForwarding$1.L$0 = taxiOrder2;
                    callDelegateImpl$createForwarding$1.L$1 = str2;
                    callDelegateImpl$createForwarding$1.label = 1;
                    Object b = aVar.b(taxiOrder2, callDelegateImpl$createForwarding$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str2;
                    obj = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = (String) callDelegateImpl$createForwarding$1.L$1;
                    taxiOrder2 = (TaxiOrder) callDelegateImpl$createForwarding$1.L$0;
                    kotlin.b.b(obj);
                    str = str3;
                }
                lyx0 lyx0Var = (lyx0) obj;
                return new fkv(str, taxiOrder2.V().g.n, lyx0Var == null ? lyx0Var.a : null, taxiOrder2.V().g.l, lyx0Var == null ? lyx0Var.b : null, lyx0Var == null ? lyx0Var.c : null, lyx0Var == null ? lyx0Var.d : null, lyx0Var != null ? lyx0Var.e : null);
            }
        }
        callDelegateImpl$createForwarding$1 = new CallDelegateImpl$createForwarding$1(this, continuationImpl);
        Object obj2 = callDelegateImpl$createForwarding$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callDelegateImpl$createForwarding$1.label;
        if (i != 0) {
        }
        lyx0 lyx0Var2 = (lyx0) obj2;
        return new fkv(str, taxiOrder2.V().g.n, lyx0Var2 == null ? lyx0Var2.a : null, taxiOrder2.V().g.l, lyx0Var2 == null ? lyx0Var2.b : null, lyx0Var2 == null ? lyx0Var2.c : null, lyx0Var2 == null ? lyx0Var2.d : null, lyx0Var2 != null ? lyx0Var2.e : null);
    }
}
