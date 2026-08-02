package com.yandex.go.scooters.passes.data;

import com.yandex.go.scooters.bdui.api.ScootersBduiNavigationAction;
import com.yandex.go.scooters.bdui.api.ScootersBduiScreenType;
import com.yandex.go.scooters.passes.data.model.actions.ScootersAcceptWinbackAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersBroadcastAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersBuyPassAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersChangeAutorenewPaymentMethod;
import com.yandex.go.scooters.passes.data.model.actions.ScootersDisableAutorenewAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersEnableAutorenewAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersFreezePassAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersOpenPaymentMethodsAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersUnfreezePassAction;
import com.yandex.go.scooters.passes.data.model.actions.f;
import com.yandex.go.scooters.passes.data.model.actions.g;
import com.yandex.go.scooters.passes.data.model.actions.h;
import com.yandex.go.scooters.passes.data.model.actions.i;
import com.yandex.go.scooters.passes.data.model.actions.j;
import defpackage.a80;
import defpackage.d0n0;
import defpackage.ehn0;
import defpackage.ewn0;
import defpackage.g0c;
import defpackage.ggo0;
import defpackage.i3y;
import defpackage.k6x;
import defpackage.mo21;
import defpackage.mu;
import defpackage.ny61;
import defpackage.o0n0;
import defpackage.po21;
import defpackage.qoi0;
import defpackage.s8o;
import defpackage.scc;
import defpackage.tco0;
import defpackage.vfo0;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class e {
    public final po21 a;
    public final ewn0 b;
    public final com.yandex.go.scooters.passes.data.jason.a c;
    public final tco0 d;
    public final vfo0 e;
    public final i3y f = kotlin.a.a(new ehn0(17, this));

    public e(po21 po21Var, ewn0 ewn0Var, com.yandex.go.scooters.passes.data.jason.a aVar, tco0 tco0Var, vfo0 vfo0Var) {
        this.a = po21Var;
        this.b = ewn0Var;
        this.c = aVar;
        this.d = tco0Var;
        this.e = vfo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ggo0 ggo0Var, ContinuationImpl continuationImpl) {
        ScootersPassesScreenConfigFactory$create$1 scootersPassesScreenConfigFactory$create$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str;
        Object f;
        Pair[] pairArr;
        Pair[] pairArr2;
        int i2;
        Map map;
        Object a;
        List list;
        d0n0 d0n0Var;
        ggo0 ggo0Var2 = ggo0Var;
        if (continuationImpl instanceof ScootersPassesScreenConfigFactory$create$1) {
            scootersPassesScreenConfigFactory$create$1 = (ScootersPassesScreenConfigFactory$create$1) continuationImpl;
            int i3 = scootersPassesScreenConfigFactory$create$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersPassesScreenConfigFactory$create$1.label = i3 - Integer.MIN_VALUE;
                Object obj = scootersPassesScreenConfigFactory$create$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassesScreenConfigFactory$create$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Pair[] pairArr3 = new Pair[4];
                    pairArr3[0] = new Pair("intention", ggo0Var2.b.getValue());
                    pairArr3[1] = new Pair("pass_type", ggo0Var2.a.getValue());
                    scootersPassesScreenConfigFactory$create$1.L$0 = ggo0Var2;
                    scootersPassesScreenConfigFactory$create$1.L$1 = pairArr3;
                    scootersPassesScreenConfigFactory$create$1.L$2 = pairArr3;
                    str = "position";
                    scootersPassesScreenConfigFactory$create$1.L$3 = "position";
                    scootersPassesScreenConfigFactory$create$1.I$0 = 2;
                    scootersPassesScreenConfigFactory$create$1.label = 1;
                    f = ((ru.yandex.taxi.preorder.source.userposition.e) this.a).f(scootersPassesScreenConfigFactory$create$1);
                    if (f != coroutineSingletons) {
                        pairArr = pairArr3;
                        pairArr2 = pairArr;
                        i2 = 2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) scootersPassesScreenConfigFactory$create$1.L$2;
                    d0n0Var = (d0n0) scootersPassesScreenConfigFactory$create$1.L$1;
                    kotlin.b.b(obj);
                    return new o0n0(d0n0Var, kotlinx.coroutines.flow.e.c(this.e.a), list, (k6x) obj);
                }
                int i4 = scootersPassesScreenConfigFactory$create$1.I$0;
                str = (String) scootersPassesScreenConfigFactory$create$1.L$3;
                Pair[] pairArr4 = (Pair[]) scootersPassesScreenConfigFactory$create$1.L$2;
                Pair[] pairArr5 = (Pair[]) scootersPassesScreenConfigFactory$create$1.L$1;
                ggo0 ggo0Var3 = (ggo0) scootersPassesScreenConfigFactory$create$1.L$0;
                kotlin.b.b(obj);
                i2 = i4;
                ggo0Var2 = ggo0Var3;
                pairArr2 = pairArr5;
                pairArr = pairArr4;
                f = obj;
                mo21 mo21Var = (mo21) f;
                pairArr[i2] = new Pair(str, scc.g(new Double(mo21Var.b), new Double(mo21Var.a)));
                pairArr2[3] = new Pair("timezone_offset", new Integer(Integer.parseInt(s8o.q())));
                d0n0 d0n0Var2 = new d0n0("bdui/v1/scooters/passes", "ScootersPasses", ScootersBduiScreenType.MODAL_BOTTOM, kotlin.collections.b.i(pairArr2), this.b);
                ScootersPassesScreenConfigFactory$createActionDescriptors$1 scootersPassesScreenConfigFactory$createActionDescriptors$1 = new ScootersPassesScreenConfigFactory$createActionDescriptors$1(0, ScootersOpenPaymentMethodsAction.Companion, i.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0);
                a80 a80Var = new a80(29, this);
                g0c a2 = qoi0.a(ScootersOpenPaymentMethodsAction.class);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                i3y b = kotlin.a.b(lazyThreadSafetyMode, a80Var);
                EmptyList emptyList = EmptyList.a;
                List g = scc.g(new mu("ScootersOpenPaymentMethodsAction", a2, scootersPassesScreenConfigFactory$createActionDescriptors$1, b, emptyList, false), new mu("ScootersBuyPassAction", qoi0.a(ScootersBuyPassAction.class), new ScootersPassesScreenConfigFactory$createActionDescriptors$2(0, ScootersBuyPassAction.Companion, com.yandex.go.scooters.passes.data.model.actions.c.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, new a80(29, this)), emptyList, false), new mu("ScootersNavigationAction", qoi0.a(ScootersBduiNavigationAction.class), new ScootersPassesScreenConfigFactory$createActionDescriptors$3(0, ScootersBduiNavigationAction.Companion, com.yandex.go.scooters.bdui.api.a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, new a80(29, this)), emptyList, false), new mu("ScootersDisableAutorenewAction", qoi0.a(ScootersDisableAutorenewAction.class), new ScootersPassesScreenConfigFactory$createActionDescriptors$4(0, ScootersDisableAutorenewAction.Companion, f.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, new a80(29, this)), emptyList, false), new mu("ScootersEnableAutorenewAction", qoi0.a(ScootersEnableAutorenewAction.class), new ScootersPassesScreenConfigFactory$createActionDescriptors$5(0, ScootersEnableAutorenewAction.Companion, g.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, new a80(29, this)), emptyList, false), new mu("ScootersFreezePassAction", qoi0.a(ScootersFreezePassAction.class), new ScootersPassesScreenConfigFactory$createActionDescriptors$6(0, ScootersFreezePassAction.Companion, h.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, new a80(29, this)), emptyList, false), new mu("ScootersUnfreezePassAction", qoi0.a(ScootersUnfreezePassAction.class), new ScootersPassesScreenConfigFactory$createActionDescriptors$7(0, ScootersUnfreezePassAction.Companion, j.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, new a80(29, this)), emptyList, false), new mu("ScootersAcceptWinbackAction", qoi0.a(ScootersAcceptWinbackAction.class), new ScootersPassesScreenConfigFactory$createActionDescriptors$8(0, ScootersAcceptWinbackAction.Companion, com.yandex.go.scooters.passes.data.model.actions.a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, new a80(29, this)), emptyList, false), new mu("ScootersBroadcastAction", qoi0.a(ScootersBroadcastAction.class), new ScootersPassesScreenConfigFactory$createActionDescriptors$9(0, ScootersBroadcastAction.Companion, com.yandex.go.scooters.passes.data.model.actions.b.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, new a80(29, this)), emptyList, false), new mu("ScootersChangeAutorenewPaymentMethod", qoi0.a(ScootersChangeAutorenewPaymentMethod.class), new ScootersPassesScreenConfigFactory$createActionDescriptors$10(0, ScootersChangeAutorenewPaymentMethod.Companion, com.yandex.go.scooters.passes.data.model.actions.e.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode, new a80(29, this)), emptyList, false));
                map = ggo0Var2.c;
                if (map == null) {
                    map = null;
                }
                scootersPassesScreenConfigFactory$create$1.L$0 = null;
                scootersPassesScreenConfigFactory$create$1.L$1 = d0n0Var2;
                scootersPassesScreenConfigFactory$create$1.L$2 = g;
                scootersPassesScreenConfigFactory$create$1.L$3 = null;
                scootersPassesScreenConfigFactory$create$1.label = 2;
                a = this.c.a(map, scootersPassesScreenConfigFactory$create$1);
                if (a != coroutineSingletons) {
                    obj = a;
                    list = g;
                    d0n0Var = d0n0Var2;
                    return new o0n0(d0n0Var, kotlinx.coroutines.flow.e.c(this.e.a), list, (k6x) obj);
                }
                return coroutineSingletons;
            }
        }
        scootersPassesScreenConfigFactory$create$1 = new ScootersPassesScreenConfigFactory$create$1(this, continuationImpl);
        Object obj2 = scootersPassesScreenConfigFactory$create$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesScreenConfigFactory$create$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) f;
        pairArr[i2] = new Pair(str, scc.g(new Double(mo21Var2.b), new Double(mo21Var2.a)));
        pairArr2[3] = new Pair("timezone_offset", new Integer(Integer.parseInt(s8o.q())));
        d0n0 d0n0Var22 = new d0n0("bdui/v1/scooters/passes", "ScootersPasses", ScootersBduiScreenType.MODAL_BOTTOM, kotlin.collections.b.i(pairArr2), this.b);
        ScootersPassesScreenConfigFactory$createActionDescriptors$1 scootersPassesScreenConfigFactory$createActionDescriptors$12 = new ScootersPassesScreenConfigFactory$createActionDescriptors$1(0, ScootersOpenPaymentMethodsAction.Companion, i.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0);
        a80 a80Var2 = new a80(29, this);
        g0c a22 = qoi0.a(ScootersOpenPaymentMethodsAction.class);
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        i3y b2 = kotlin.a.b(lazyThreadSafetyMode2, a80Var2);
        EmptyList emptyList2 = EmptyList.a;
        List g2 = scc.g(new mu("ScootersOpenPaymentMethodsAction", a22, scootersPassesScreenConfigFactory$createActionDescriptors$12, b2, emptyList2, false), new mu("ScootersBuyPassAction", qoi0.a(ScootersBuyPassAction.class), new ScootersPassesScreenConfigFactory$createActionDescriptors$2(0, ScootersBuyPassAction.Companion, com.yandex.go.scooters.passes.data.model.actions.c.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode2, new a80(29, this)), emptyList2, false), new mu("ScootersNavigationAction", qoi0.a(ScootersBduiNavigationAction.class), new ScootersPassesScreenConfigFactory$createActionDescriptors$3(0, ScootersBduiNavigationAction.Companion, com.yandex.go.scooters.bdui.api.a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode2, new a80(29, this)), emptyList2, false), new mu("ScootersDisableAutorenewAction", qoi0.a(ScootersDisableAutorenewAction.class), new ScootersPassesScreenConfigFactory$createActionDescriptors$4(0, ScootersDisableAutorenewAction.Companion, f.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode2, new a80(29, this)), emptyList2, false), new mu("ScootersEnableAutorenewAction", qoi0.a(ScootersEnableAutorenewAction.class), new ScootersPassesScreenConfigFactory$createActionDescriptors$5(0, ScootersEnableAutorenewAction.Companion, g.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode2, new a80(29, this)), emptyList2, false), new mu("ScootersFreezePassAction", qoi0.a(ScootersFreezePassAction.class), new ScootersPassesScreenConfigFactory$createActionDescriptors$6(0, ScootersFreezePassAction.Companion, h.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode2, new a80(29, this)), emptyList2, false), new mu("ScootersUnfreezePassAction", qoi0.a(ScootersUnfreezePassAction.class), new ScootersPassesScreenConfigFactory$createActionDescriptors$7(0, ScootersUnfreezePassAction.Companion, j.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode2, new a80(29, this)), emptyList2, false), new mu("ScootersAcceptWinbackAction", qoi0.a(ScootersAcceptWinbackAction.class), new ScootersPassesScreenConfigFactory$createActionDescriptors$8(0, ScootersAcceptWinbackAction.Companion, com.yandex.go.scooters.passes.data.model.actions.a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode2, new a80(29, this)), emptyList2, false), new mu("ScootersBroadcastAction", qoi0.a(ScootersBroadcastAction.class), new ScootersPassesScreenConfigFactory$createActionDescriptors$9(0, ScootersBroadcastAction.Companion, com.yandex.go.scooters.passes.data.model.actions.b.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode2, new a80(29, this)), emptyList2, false), new mu("ScootersChangeAutorenewPaymentMethod", qoi0.a(ScootersChangeAutorenewPaymentMethod.class), new ScootersPassesScreenConfigFactory$createActionDescriptors$10(0, ScootersChangeAutorenewPaymentMethod.Companion, com.yandex.go.scooters.passes.data.model.actions.e.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(lazyThreadSafetyMode2, new a80(29, this)), emptyList2, false));
        map = ggo0Var2.c;
        if (map == null) {
        }
        scootersPassesScreenConfigFactory$create$1.L$0 = null;
        scootersPassesScreenConfigFactory$create$1.L$1 = d0n0Var22;
        scootersPassesScreenConfigFactory$create$1.L$2 = g2;
        scootersPassesScreenConfigFactory$create$1.L$3 = null;
        scootersPassesScreenConfigFactory$create$1.label = 2;
        a = this.c.a(map, scootersPassesScreenConfigFactory$create$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
