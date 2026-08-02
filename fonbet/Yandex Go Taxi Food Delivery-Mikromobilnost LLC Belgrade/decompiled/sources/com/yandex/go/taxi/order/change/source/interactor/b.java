package com.yandex.go.taxi.order.change.source.interactor;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.deeplink.TaxiOrderDeeplink$ChangeSource$Mode;
import com.yandex.go.taxi.order.models.api.response.AllowedChange;
import defpackage.a0y0;
import defpackage.b0y0;
import defpackage.bc9;
import defpackage.c0y0;
import defpackage.cc9;
import defpackage.d0y0;
import defpackage.d821;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.po21;
import defpackage.wh70;
import defpackage.zzs;
import defpackage.zzx0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class b {
    public final ru.yandex.taxi.systemrequeirements.location.n a;
    public final po21 b;
    public final com.yandex.go.taxi.order.change.source.data.e c;
    public final d821 d;

    public b(ru.yandex.taxi.systemrequeirements.location.n nVar, po21 po21Var, com.yandex.go.taxi.order.change.source.data.e eVar, d821 d821Var) {
        this.a = nVar;
        this.b = po21Var;
        this.c = eVar;
        this.d = d821Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (((java.lang.Boolean) r12).booleanValue() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0076, code lost:
    
        if (r12 == r1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(o2y0 o2y0Var, d0y0 d0y0Var, ContinuationImpl continuationImpl) {
        ChangeSourceAddressInteractor$changeSourceAddress$1 changeSourceAddressInteractor$changeSourceAddress$1;
        int i;
        zzs v;
        AllowedChange allowedChange;
        zzs zzsVar;
        AllowedChange allowedChange2;
        o2y0 o2y0Var2;
        zzs zzsVar2;
        Integer num;
        mo21 mo21Var;
        if (continuationImpl instanceof ChangeSourceAddressInteractor$changeSourceAddress$1) {
            changeSourceAddressInteractor$changeSourceAddress$1 = (ChangeSourceAddressInteractor$changeSourceAddress$1) continuationImpl;
            int i2 = changeSourceAddressInteractor$changeSourceAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeSourceAddressInteractor$changeSourceAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changeSourceAddressInteractor$changeSourceAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeSourceAddressInteractor$changeSourceAddress$1.label;
                int i3 = 0;
                int i4 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (new wh70(o2y0Var.b()).b()) {
                        changeSourceAddressInteractor$changeSourceAddress$1.L$0 = o2y0Var;
                        changeSourceAddressInteractor$changeSourceAddress$1.L$1 = d0y0Var;
                        changeSourceAddressInteractor$changeSourceAddress$1.label = 1;
                        obj = this.c.b(changeSourceAddressInteractor$changeSourceAddress$1);
                    }
                    i4 = 0;
                    if (i4 == 0) {
                        if ((d0y0Var != null ? d0y0Var.d : null) == TaxiOrderDeeplink$ChangeSource$Mode.MODAL_CONFIRM) {
                            this.d.a.l(d0y0Var.f, d0y0Var.e.a);
                            return null;
                        }
                    } else {
                        if ((d0y0Var != null ? d0y0Var.d : null) == TaxiOrderDeeplink$ChangeSource$Mode.MODAL_CONFIRM) {
                            return new cc9(o2y0Var, d0y0Var.e, d0y0Var.f);
                        }
                        TaxiOrder b = o2y0Var.b();
                        v = b.v();
                        if (v != null) {
                            allowedChange = (AllowedChange) new wh70(b).a.get("pickup_point");
                            c0y0 c0y0Var = d0y0Var != null ? d0y0Var.e : null;
                            if (!(c0y0Var instanceof a0y0)) {
                                if (c0y0Var instanceof zzx0) {
                                    v = ((zzx0) c0y0Var).b;
                                    zzsVar = v;
                                    if (allowedChange != null) {
                                        i3 = num.intValue();
                                    }
                                    return new bc9(o2y0Var, zzsVar, v, i3);
                                }
                                if (c0y0Var instanceof b0y0) {
                                    ru.yandex.taxi.systemrequeirements.location.n nVar = this.a;
                                    if (!nVar.b() && !nVar.c()) {
                                        changeSourceAddressInteractor$changeSourceAddress$1.L$0 = o2y0Var;
                                        changeSourceAddressInteractor$changeSourceAddress$1.L$1 = null;
                                        changeSourceAddressInteractor$changeSourceAddress$1.L$2 = null;
                                        changeSourceAddressInteractor$changeSourceAddress$1.L$3 = v;
                                        changeSourceAddressInteractor$changeSourceAddress$1.L$4 = allowedChange;
                                        changeSourceAddressInteractor$changeSourceAddress$1.L$5 = null;
                                        changeSourceAddressInteractor$changeSourceAddress$1.I$0 = i4;
                                        changeSourceAddressInteractor$changeSourceAddress$1.label = 2;
                                        Object f = ((ru.yandex.taxi.preorder.source.userposition.e) this.b).f(changeSourceAddressInteractor$changeSourceAddress$1);
                                        if (f != coroutineSingletons) {
                                            obj = f;
                                            allowedChange2 = allowedChange;
                                            o2y0Var2 = o2y0Var;
                                            zzsVar2 = v;
                                            mo21Var = (mo21) obj;
                                            if (mo21Var.i) {
                                            }
                                            o2y0Var = o2y0Var2;
                                            if (allowedChange != null) {
                                            }
                                            return new bc9(o2y0Var, zzsVar, v, i3);
                                        }
                                        return coroutineSingletons;
                                    }
                                }
                            }
                            zzsVar = v;
                            if (allowedChange != null) {
                            }
                            return new bc9(o2y0Var, zzsVar, v, i3);
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    allowedChange2 = (AllowedChange) changeSourceAddressInteractor$changeSourceAddress$1.L$4;
                    zzsVar2 = (zzs) changeSourceAddressInteractor$changeSourceAddress$1.L$3;
                    o2y0Var2 = (o2y0) changeSourceAddressInteractor$changeSourceAddress$1.L$0;
                    kotlin.b.b(obj);
                    mo21Var = (mo21) obj;
                    if (mo21Var.i) {
                        v = mo21Var.a();
                        allowedChange = allowedChange2;
                        zzsVar = zzsVar2;
                    } else {
                        allowedChange = allowedChange2;
                        zzsVar = zzsVar2;
                        v = zzsVar;
                    }
                    o2y0Var = o2y0Var2;
                    if (allowedChange != null && (num = allowedChange.f) != null) {
                        i3 = num.intValue();
                    }
                    return new bc9(o2y0Var, zzsVar, v, i3);
                }
                d0y0Var = (d0y0) changeSourceAddressInteractor$changeSourceAddress$1.L$1;
                o2y0Var = (o2y0) changeSourceAddressInteractor$changeSourceAddress$1.L$0;
                kotlin.b.b(obj);
            }
        }
        changeSourceAddressInteractor$changeSourceAddress$1 = new ChangeSourceAddressInteractor$changeSourceAddress$1(this, continuationImpl);
        Object obj2 = changeSourceAddressInteractor$changeSourceAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeSourceAddressInteractor$changeSourceAddress$1.label;
        int i32 = 0;
        int i42 = 1;
        if (i != 0) {
        }
    }
}
