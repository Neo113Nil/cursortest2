package com.yandex.go.payments_widgets.saver;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.rsn;
import defpackage.sb2;
import defpackage.u131;
import defpackage.vpr;
import defpackage.yo40;
import defpackage.yu51;
import defpackage.z131;
import defpackage.zy11;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ k b;

    public i(vpr vprVar, k kVar) {
        this.a = vprVar;
        this.b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpdateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1 updateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof UpdateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1) {
            updateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1 = (UpdateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1) continuation;
            int i2 = updateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = updateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    yo40 yo40Var = this.b.c;
                    yu51 yu51Var = (yu51) rsnVar.b;
                    yu51 yu51Var2 = (yu51) rsnVar.a;
                    if (yu51Var2 == null) {
                        com.yandex.div.core.expression.variables.a aVar = (com.yandex.div.core.expression.variables.a) yo40Var.a;
                        Boolean C = sb2.C(aVar, "payments.yb_saver.should_show_promo");
                        boolean booleanValue = C != null ? C.booleanValue() : false;
                        String D = sb2.D(aVar, "payments.yb_saver.max_interest_rate");
                        if (D == null) {
                            D = "";
                        }
                        String D2 = sb2.D(aVar, "payments.yb_saver.action");
                        yu51Var2 = new yu51(booleanValue, D, D2 != null ? D2 : "");
                    }
                    ListBuilder a = rcc.a();
                    boolean z = yu51Var.a;
                    String str = yu51Var.c;
                    String str2 = yu51Var.b;
                    if (z != yu51Var2.a) {
                        a.add(new u131("payments.yb_saver.should_show_promo", z));
                    }
                    if (!str2.equals(yu51Var2.b)) {
                        a.add(new z131("payments.yb_saver.max_interest_rate", str2));
                    }
                    if (!jl40.l(str, yu51Var2.c)) {
                        a.add(new z131("payments.yb_saver.action", str));
                    }
                    ListBuilder j = a.j();
                    updateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1.L$0 = null;
                    updateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1.L$1 = null;
                    updateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1.L$2 = null;
                    updateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1.L$3 = null;
                    updateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(j, updateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        updateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1 = new UpdateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1(this, continuation);
        Object obj22 = updateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateSaverVariablesInteractor$startUpdate$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
