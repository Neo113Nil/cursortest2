package com.yandex.go.payments_widgets.yandex_bank;

import defpackage.jl40;
import defpackage.nx51;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.rsn;
import defpackage.sb2;
import defpackage.u131;
import defpackage.vpr;
import defpackage.z131;
import defpackage.zqd0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ j b;

    public h(vpr vprVar, j jVar) {
        this.a = vprVar;
        this.b = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpdateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1 updateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1;
        int i;
        nx51 nx51Var;
        nx51 nx51Var2;
        nx51 nx51Var3;
        if (continuation instanceof UpdateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1) {
            updateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1 = (UpdateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1) continuation;
            int i2 = updateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = updateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    ArrayList arrayList = new ArrayList();
                    j jVar = this.b;
                    zqd0 zqd0Var = jVar.b;
                    nx51 nx51Var4 = (nx51) rsnVar.b;
                    nx51 nx51Var5 = (nx51) rsnVar.a;
                    if (nx51Var5 == null) {
                        com.yandex.div.core.expression.variables.a aVar = zqd0Var.a;
                        Boolean C = sb2.C(aVar, "payments.yb.enabled");
                        boolean booleanValue = C != null ? C.booleanValue() : false;
                        Boolean C2 = sb2.C(aVar, "payments.yb.has_card");
                        boolean booleanValue2 = C2 != null ? C2.booleanValue() : false;
                        String D = sb2.D(aVar, "payments.yb.balance");
                        nx51Var = nx51Var5;
                        String str = D == null ? "" : D;
                        String D2 = sb2.D(aVar, "payments.yb.currency_sign");
                        if (D2 == null) {
                            D2 = "";
                        }
                        nx51Var2 = new nx51(booleanValue, booleanValue2, str, D2);
                    } else {
                        nx51Var = nx51Var5;
                        nx51Var2 = nx51Var;
                    }
                    ListBuilder a = rcc.a();
                    boolean z = nx51Var4.a;
                    String str2 = nx51Var4.d;
                    String str3 = nx51Var4.c;
                    if (z != nx51Var2.a) {
                        a.add(new u131("payments.yb.enabled", z));
                    }
                    boolean z2 = nx51Var4.b;
                    if (z2 != nx51Var2.b) {
                        a.add(new u131("payments.yb.has_card", z2));
                    }
                    if (!jl40.l(str3, nx51Var2.c)) {
                        a.add(new z131("payments.yb.balance", str3));
                    }
                    if (!jl40.l(str2, nx51Var2.d)) {
                        a.add(new z131("payments.yb.currency_sign", str2));
                    }
                    arrayList.addAll(a.j());
                    zqd0 zqd0Var2 = jVar.a;
                    nx51 nx51Var6 = (nx51) rsnVar.b;
                    if (nx51Var == null) {
                        com.yandex.div.core.expression.variables.a aVar2 = zqd0Var2.a;
                        Boolean C3 = sb2.C(aVar2, "payments.yandex_bank.enabled");
                        boolean booleanValue3 = C3 != null ? C3.booleanValue() : false;
                        Boolean C4 = sb2.C(aVar2, "payments.yandex_bank.has_yandex_card");
                        boolean booleanValue4 = C4 != null ? C4.booleanValue() : false;
                        String D3 = sb2.D(aVar2, "payments.yandex_bank.yandex_card_balance");
                        if (D3 == null) {
                            D3 = "";
                        }
                        String D4 = sb2.D(aVar2, "payments.yandex_bank.yandex_card_currency_sign");
                        if (D4 == null) {
                            D4 = "";
                        }
                        nx51Var3 = new nx51(booleanValue3, booleanValue4, D3, D4);
                    } else {
                        nx51Var3 = nx51Var;
                    }
                    ListBuilder a2 = rcc.a();
                    boolean z3 = nx51Var6.a;
                    String str4 = nx51Var6.d;
                    String str5 = nx51Var6.c;
                    if (z3 != nx51Var3.a) {
                        a2.add(new u131("payments.yandex_bank.enabled", z3));
                    }
                    boolean z4 = nx51Var6.b;
                    if (z4 != nx51Var3.b) {
                        a2.add(new u131("payments.yandex_bank.has_yandex_card", z4));
                    }
                    if (!jl40.l(str5, nx51Var3.c)) {
                        a2.add(new z131("payments.yandex_bank.yandex_card_balance", str5));
                    }
                    if (!jl40.l(str4, nx51Var3.d)) {
                        a2.add(new z131("payments.yandex_bank.yandex_card_currency_sign", str4));
                    }
                    arrayList.addAll(a2.j());
                    updateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1.L$0 = null;
                    updateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1.L$1 = null;
                    updateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1.L$2 = null;
                    updateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1.L$3 = null;
                    updateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(arrayList, updateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1) == coroutineSingletons) {
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
        updateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1 = new UpdateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1(this, continuation);
        Object obj22 = updateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateYbVariablesInteractor$startUpdate$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
