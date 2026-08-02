package com.yandex.go.payments_widgets.split;

import defpackage.dxf0;
import defpackage.jl40;
import defpackage.mx51;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.rsn;
import defpackage.sb2;
import defpackage.u131;
import defpackage.va90;
import defpackage.vpr;
import defpackage.z131;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;

    public e(vpr vprVar, g gVar) {
        this.a = vprVar;
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpdateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$1 updateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$1;
        int i;
        mx51 mx51Var;
        mx51 mx51Var2;
        mx51 mx51Var3;
        if (continuation instanceof UpdateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$1) {
            updateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$1 = (UpdateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$1) continuation;
            int i2 = updateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = updateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    ArrayList arrayList = new ArrayList();
                    g gVar = this.b;
                    va90 va90Var = gVar.c;
                    mx51 mx51Var4 = (mx51) rsnVar.b;
                    mx51 mx51Var5 = (mx51) rsnVar.a;
                    if (mx51Var5 == null) {
                        com.yandex.div.core.expression.variables.a aVar = (com.yandex.div.core.expression.variables.a) va90Var.a;
                        Boolean C = sb2.C(aVar, "payments.yb_split.is_available");
                        boolean booleanValue = C != null ? C.booleanValue() : false;
                        String D = sb2.D(aVar, "payments.yb_split.base_limit");
                        if (D == null) {
                            D = "";
                        }
                        String D2 = sb2.D(aVar, "payments.yb_split.remaining_limit");
                        if (D2 == null) {
                            D2 = "";
                        }
                        String D3 = sb2.D(aVar, "payments.yb_split.currency_sign");
                        if (D3 == null) {
                            D3 = "";
                        }
                        String D4 = sb2.D(aVar, "payments.yb_split.total_debt");
                        if (D4 == null) {
                            D4 = "";
                        }
                        Boolean C2 = sb2.C(aVar, "payments.yb_split.is_user_upgraded");
                        boolean booleanValue2 = C2 != null ? C2.booleanValue() : false;
                        Boolean C3 = sb2.C(aVar, "payments.yb_split.has_active_split");
                        mx51Var = mx51Var5;
                        mx51Var2 = new mx51(D, D2, D3, D4, booleanValue, booleanValue2, C3 != null ? C3.booleanValue() : false);
                    } else {
                        mx51Var = mx51Var5;
                        mx51Var2 = mx51Var;
                    }
                    ListBuilder a = rcc.a();
                    boolean z = mx51Var4.a;
                    String str = mx51Var4.e;
                    UpdateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$1 updateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$12 = updateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$1;
                    String str2 = mx51Var4.d;
                    String str3 = mx51Var4.c;
                    String str4 = mx51Var4.b;
                    if (z != mx51Var2.a) {
                        a.add(new u131("payments.yb_split.is_available", z));
                    }
                    if (!jl40.l(str4, mx51Var2.b)) {
                        a.add(new z131("payments.yb_split.base_limit", str4));
                    }
                    if (!jl40.l(str3, mx51Var2.c)) {
                        a.add(new z131("payments.yb_split.remaining_limit", str3));
                    }
                    boolean z2 = mx51Var4.f;
                    if (z2 != mx51Var2.f) {
                        a.add(new u131("payments.yb_split.is_user_upgraded", z2));
                    }
                    if (!jl40.l(str2, mx51Var2.d)) {
                        a.add(new z131("payments.yb_split.currency_sign", str2));
                    }
                    if (!str.equals(mx51Var2.e)) {
                        a.add(new z131("payments.yb_split.total_debt", str));
                    }
                    boolean z3 = mx51Var4.g;
                    if (z3 != mx51Var2.g) {
                        a.add(new u131("payments.yb_split.has_active_split", z3));
                    }
                    arrayList.addAll(a.j());
                    dxf0 dxf0Var = gVar.d;
                    mx51 mx51Var6 = (mx51) rsnVar.b;
                    if (mx51Var == null) {
                        com.yandex.div.core.expression.variables.a aVar2 = (com.yandex.div.core.expression.variables.a) dxf0Var.a;
                        Boolean C4 = sb2.C(aVar2, "payments.yandex_split.is_available");
                        boolean booleanValue3 = C4 != null ? C4.booleanValue() : false;
                        String D5 = sb2.D(aVar2, "payments.yandex_split.base_limit");
                        String str5 = D5 == null ? "" : D5;
                        String D6 = sb2.D(aVar2, "payments.yandex_split.remaining_limit");
                        String str6 = D6 == null ? "" : D6;
                        String D7 = sb2.D(aVar2, "payments.yandex_split.currency_sign");
                        String str7 = D7 == null ? "" : D7;
                        String D8 = sb2.D(aVar2, "payments.yandex_split.total_debt");
                        String str8 = D8 == null ? "" : D8;
                        Boolean C5 = sb2.C(aVar2, "payments.yandex_split.is_user_upgraded");
                        boolean booleanValue4 = C5 != null ? C5.booleanValue() : false;
                        Boolean C6 = sb2.C(aVar2, "payments.yandex_split.has_active_split");
                        mx51Var3 = new mx51(str5, str6, str7, str8, booleanValue3, booleanValue4, C6 != null ? C6.booleanValue() : false);
                    } else {
                        mx51Var3 = mx51Var;
                    }
                    ListBuilder a2 = rcc.a();
                    boolean z4 = mx51Var6.a;
                    String str9 = mx51Var6.e;
                    String str10 = mx51Var6.d;
                    String str11 = mx51Var6.c;
                    String str12 = mx51Var6.b;
                    if (z4 != mx51Var3.a) {
                        a2.add(new u131("payments.yandex_split.is_available", z4));
                    }
                    if (!jl40.l(str12, mx51Var3.b)) {
                        a2.add(new z131("payments.yandex_split.base_limit", str12));
                    }
                    if (!jl40.l(str11, mx51Var3.c)) {
                        a2.add(new z131("payments.yandex_split.remaining_limit", str11));
                    }
                    boolean z5 = mx51Var6.f;
                    if (z5 != mx51Var3.f) {
                        a2.add(new u131("payments.yandex_split.is_user_upgraded", z5));
                    }
                    if (!jl40.l(str10, mx51Var3.d)) {
                        a2.add(new z131("payments.yandex_split.currency_sign", str10));
                    }
                    if (!str9.equals(mx51Var3.e)) {
                        a2.add(new z131("payments.yandex_split.total_debt", str9));
                    }
                    boolean z6 = mx51Var6.g;
                    if (z6 != mx51Var3.g) {
                        a2.add(new u131("payments.yandex_split.has_active_split", z6));
                    }
                    arrayList.addAll(a2.j());
                    updateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$12.L$0 = null;
                    updateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$12.L$1 = null;
                    updateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$12.L$2 = null;
                    updateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$12.L$3 = null;
                    updateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$12.label = 1;
                    if (this.a.emit(arrayList, updateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$12) == coroutineSingletons) {
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
        updateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$1 = new UpdateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$1(this, continuation);
        Object obj22 = updateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateYbSplitVariablesInteractor$startUpdate$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
