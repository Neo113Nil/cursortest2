package com.yandex.go.clarify_address.before_order;

import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.clarify_address.ClarifyAddressBeforeOrderExperiment;
import com.yandex.go.clarify_address.e;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.byb;
import defpackage.kr0;
import defpackage.mxb;
import defpackage.mzb;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.wb1;
import defpackage.wiq0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a implements mzb {
    public final kr0 a;
    public final mxb b;
    public final e c;
    public final wiq0 d;
    public final byb e;
    public final wb1 f;

    public a(kr0 kr0Var, mxb mxbVar, e eVar, wiq0 wiq0Var, byb bybVar, wb1 wb1Var) {
        this.a = kr0Var;
        this.b = mxbVar;
        this.c = eVar;
        this.d = wiq0Var;
        this.e = bybVar;
        this.f = wb1Var;
    }

    public final boolean a() {
        return this.b.d || !b();
    }

    public final boolean b() {
        return ((ClarifyAddressBeforeOrderExperiment) this.c.b.getValue()).b;
    }

    public final boolean c(String str) {
        b();
        this.e.getClass();
        return b() && ((ClarifyAddressBeforeOrderExperiment) this.c.b.getValue()).g.contains(str);
    }

    public final boolean d() {
        pex0 m = ((k) this.d).m();
        return b() && kotlin.collections.a.G(((ClarifyAddressBeforeOrderExperiment) this.c.b.getValue()).c, m != null ? m.b : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        ClarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1 clarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1;
        Object obj;
        int i;
        int i2;
        boolean z;
        AddressClarificationReason addressClarificationReason;
        if (continuationImpl instanceof ClarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1) {
            clarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1 = (ClarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1) continuationImpl;
            int i3 = clarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                clarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1.label = i3 - Integer.MIN_VALUE;
                obj = clarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = clarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1.label;
                boolean z2 = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i2 = this.b.b == ClarifyAddressBeforeOrderOrigin.SUPERAPP_SHORTCUT ? 1 : 0;
                    boolean z3 = ((ClarifyAddressBeforeOrderExperiment) this.c.b.getValue()).i;
                    com.yandex.go.clarify_address.a aVar = (com.yandex.go.clarify_address.a) this.a;
                    AddressClarificationReason addressClarificationReason2 = aVar.a.b;
                    clarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1.L$0 = addressClarificationReason2;
                    clarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1.I$0 = i2;
                    clarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1.Z$0 = z3;
                    clarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1.label = 1;
                    Object b = aVar.b(clarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z = z3;
                    obj = b;
                    addressClarificationReason = addressClarificationReason2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = clarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1.Z$0;
                    i2 = clarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1.I$0;
                    addressClarificationReason = (AddressClarificationReason) clarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1.L$0;
                    kotlin.b.b(obj);
                }
                if ((!((Boolean) obj).booleanValue() && ((i2 == 0 || z) && d())) || this.f.h() || (b() && addressClarificationReason != AddressClarificationReason.Map)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }
        clarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1 = new ClarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1(this, continuationImpl);
        obj = clarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = clarifySourceAddressBeforeOrderInteractorImpl$needClarifyAddressBeforeOrder$1.label;
        boolean z22 = false;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
            z22 = true;
            return Boolean.valueOf(z22);
        }
        z22 = true;
        return Boolean.valueOf(z22);
    }

    public final boolean f() {
        return this.b.b == ClarifyAddressBeforeOrderOrigin.SUPERAPP_SHORTCUT && d() && !((ClarifyAddressBeforeOrderExperiment) this.c.b.getValue()).i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        ClarifySourceAddressBeforeOrderInteractorImpl$shouldOverrideTaxiMainDeeplinkFlow$1 clarifySourceAddressBeforeOrderInteractorImpl$shouldOverrideTaxiMainDeeplinkFlow$1;
        int i;
        if (continuationImpl instanceof ClarifySourceAddressBeforeOrderInteractorImpl$shouldOverrideTaxiMainDeeplinkFlow$1) {
            clarifySourceAddressBeforeOrderInteractorImpl$shouldOverrideTaxiMainDeeplinkFlow$1 = (ClarifySourceAddressBeforeOrderInteractorImpl$shouldOverrideTaxiMainDeeplinkFlow$1) continuationImpl;
            int i2 = clarifySourceAddressBeforeOrderInteractorImpl$shouldOverrideTaxiMainDeeplinkFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                clarifySourceAddressBeforeOrderInteractorImpl$shouldOverrideTaxiMainDeeplinkFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = clarifySourceAddressBeforeOrderInteractorImpl$shouldOverrideTaxiMainDeeplinkFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = clarifySourceAddressBeforeOrderInteractorImpl$shouldOverrideTaxiMainDeeplinkFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    clarifySourceAddressBeforeOrderInteractorImpl$shouldOverrideTaxiMainDeeplinkFlow$1.label = 1;
                    obj = this.c.a.b(clarifySourceAddressBeforeOrderInteractorImpl$shouldOverrideTaxiMainDeeplinkFlow$1);
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
                ClarifyAddressBeforeOrderExperiment clarifyAddressBeforeOrderExperiment = (ClarifyAddressBeforeOrderExperiment) obj;
                return Boolean.valueOf(!clarifyAddressBeforeOrderExperiment.b && clarifyAddressBeforeOrderExperiment.k);
            }
        }
        clarifySourceAddressBeforeOrderInteractorImpl$shouldOverrideTaxiMainDeeplinkFlow$1 = new ClarifySourceAddressBeforeOrderInteractorImpl$shouldOverrideTaxiMainDeeplinkFlow$1(this, continuationImpl);
        Object obj2 = clarifySourceAddressBeforeOrderInteractorImpl$shouldOverrideTaxiMainDeeplinkFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = clarifySourceAddressBeforeOrderInteractorImpl$shouldOverrideTaxiMainDeeplinkFlow$1.label;
        if (i != 0) {
        }
        ClarifyAddressBeforeOrderExperiment clarifyAddressBeforeOrderExperiment2 = (ClarifyAddressBeforeOrderExperiment) obj2;
        return Boolean.valueOf(!clarifyAddressBeforeOrderExperiment2.b && clarifyAddressBeforeOrderExperiment2.k);
    }
}
